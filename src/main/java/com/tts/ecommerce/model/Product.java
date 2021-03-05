package com.tts.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "product_id")
    private Long id;

    private String name;

    private String brand;

    private String  category;

    private int quantity;

    private int price;

    private String description;

    private List<MultipartFile> images;





}
