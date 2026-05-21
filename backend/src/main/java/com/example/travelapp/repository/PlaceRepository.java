package com.example.travelapp.repository;

import com.example.travelapp.entity.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// interface kết nối với database, Spring Data JPA tự tạo các câu query cơ bản
@Repository
public interface PlaceRepository extends JpaRepository<Place, Long> {
}
