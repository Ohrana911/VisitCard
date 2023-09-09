package com.example.marketreg.entities;

import lombok.Data;

@Data
public class Product {
    private String category;
    private String title;
    private char photo;
    private String description;
    private int price;
    private String owner;
}
