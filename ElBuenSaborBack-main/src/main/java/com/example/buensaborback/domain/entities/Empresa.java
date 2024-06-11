package com.example.buensaborback.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Builder
@Audited
public class Empresa extends Base{

    private String nombre;
    private String razonSocial;
    private Integer cuil;

    @OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
    @Builder.Default
    @JsonIgnoreProperties("empresa")
    private Set<Sucursal> sucursales = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "imagen_id")
    @NotAudited
    protected ImagenEmpresa imagen;

}
