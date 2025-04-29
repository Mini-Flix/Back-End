package com.miniflex.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "movies")
@Getter
@Setter
public class Movie {
    @Id
    private Long id;

    private String title;
    private String description;
    private String thumbnailUrl;
    private String streamUrl;
    private String filePath;
}
