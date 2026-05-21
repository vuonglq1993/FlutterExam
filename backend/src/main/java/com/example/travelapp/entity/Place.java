package com.example.travelapp.entity;

import jakarta.persistence.*;

// bảng lưu thông tin các địa điểm du lịch
@Entity
@Table(name = "place")
public class Place {

    // id tự tăng, khóa chính
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // tên địa điểm
    private String name;

    // vị trí / tỉnh thành
    private String location;

    // đường dẫn ảnh đại diện
    private String imageUrl;

    // điểm đánh giá trung bình
    private Double rating;

    public Place() {}

    public Place(Long id, String name, String location, String imageUrl, Double rating) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.imageUrl = imageUrl;
        this.rating = rating;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public Double getRating() { return rating; }
    public void setRating(Double rating) { this.rating = rating; }
}
