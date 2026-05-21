package com.example.travelapp.service;

import com.example.travelapp.entity.Place;
import com.example.travelapp.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// lớp xử lý logic nghiệp vụ liên quan đến địa điểm
@Service
public class PlaceService {

    // inject repository để thao tác với database
    @Autowired
    private PlaceRepository placeRepository;

    // lấy toàn bộ danh sách địa điểm
    public List<Place> getAllPlace() {
        return placeRepository.findAll();
    }

    // tìm một địa điểm theo id, báo lỗi nếu không tìm thấy
    public Place getPlaceById(Long id) {
        return placeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy địa điểm với id: " + id));
    }

    // thêm mới một địa điểm vào database
    public Place createPlace(Place place) {
        return placeRepository.save(place);
    }

    // cập nhật thông tin địa điểm theo id
    public Place updatePlace(Long id, Place placeDetails) {
        Place place = getPlaceById(id);
        place.setName(placeDetails.getName());
        place.setLocation(placeDetails.getLocation());
        place.setImageUrl(placeDetails.getImageUrl());
        place.setRating(placeDetails.getRating());
        return placeRepository.save(place);
    }

    // xóa địa điểm khỏi database theo id
    public void deletePlace(Long id) {
        placeRepository.deleteById(id);
    }
}
