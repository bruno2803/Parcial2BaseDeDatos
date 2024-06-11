package com.example.buensaborback.business.service.Imp;




import com.example.buensaborback.business.service.CloudinaryService;
import com.example.buensaborback.business.service.ImageService;
import com.example.buensaborback.domain.entities.Image;
import com.example.buensaborback.repositories.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;




import java.util.*;


@Service
public class ImageServiceImpl implements ImageService {


    @Autowired
    private CloudinaryService cloudinaryService;
    @Autowired
    private ImageRepository imageRepository;


    @Override
    public ResponseEntity<List<Map<String, Object>>> getAllImages() {
        try {
            List<Image> images = imageRepository.findAll();
            List<Map<String, Object>> imageList = new ArrayList<>();


            for (Image image : images) {
                Map<String, Object> imageMap = new HashMap<>();
                imageMap.put("id", image.getId());
                imageMap.put("name", image.getName());
                imageMap.put("url", image.getUrl());
                imageList.add(imageMap);
            }


            return ResponseEntity.ok(imageList);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body(null);
        }
    }


    @Override
    public ResponseEntity<String> uploadImages(MultipartFile[] files) {
        List<String> urls = new ArrayList<>();


        try {
            for (MultipartFile file : files) {


                if (file.getName().isEmpty()) {
                    return ResponseEntity.badRequest().build();
                }


                Image image = new Image();
                image.setName(file.getName());
                image.setUrl(cloudinaryService.uploadFile(file));
                if (image.getUrl() == null) {
                    return ResponseEntity.badRequest().build();
                }


                // Agregar la URL a la lista de URLs
                urls.add(image.getUrl());
                imageRepository.save(image);
            };


            // Convertir la lista de URLs a un array de strings y devolver como JSON
            return new ResponseEntity<>("{\"status\":\"OK\", \"urls\":" + urls + "}", HttpStatus.OK);


        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("{\"status\":\"ERROR\", \"message\":\"" + e.getMessage() + "\"}", HttpStatus.BAD_REQUEST);
        }


    }
    @Override
    public ResponseEntity<String> deleteImage(String publicId, UUID idBd) {
        try {
            imageRepository.deleteById(idBd);
            return cloudinaryService.deleteImage(publicId, idBd);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("{\"status\":\"ERROR\", \"message\":\"" + e.getMessage() + "\"}", HttpStatus.BAD_REQUEST);
        }
    }
}

