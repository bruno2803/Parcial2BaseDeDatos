package com.example.buensaborback.domain.entities;

import jakarta.persistence.*;
import java.util.UUID;


import lombok.Data;
@Entity
@Data
@Table(name = "images")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;


    @Column(name = "name_image")
    private String name;


    @Column(name = "url_image")
    private String url;
}
