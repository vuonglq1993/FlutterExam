package com.example.travelapp.controller;

import com.example.travelapp.entity.Place;
import com.example.travelapp.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// controller nhận request từ client và trả về response
@RestController
@RequestMapping("/api/places")
@CrossOrigin(origins = "*")
public class PlaceController {

    // inject service để gọi các hàm xử lý
    @Autowired
    private PlaceService placeService;

    // GET /api/places - lấy tất cả địa điểm
    @GetMapping
    public ResponseEntity<List<Place>> getAllPlace() {
        return ResponseEntity.ok(placeService.getAllPlace());
    }

    // GET /api/places/{id} - lấy một địa điểm theo id
    @GetMapping("/{id}")
    public ResponseEntity<Place> getPlaceById(@PathVariable Long id) {
        return ResponseEntity.ok(placeService.getPlaceById(id));
    }

    // POST /api/places - tạo mới địa điểm
    @PostMapping
    public ResponseEntity<Place> createPlace(@RequestBody Place place) {
        return ResponseEntity.ok(placeService.createPlace(place));
    }

    // PUT /api/places/{id} - cập nhật địa điểm theo id
    @PutMapping("/{id}")
    public ResponseEntity<Place> updatePlace(@PathVariable Long id, @RequestBody Place place) {
        return ResponseEntity.ok(placeService.updatePlace(id, place));
    }

    // DELETE /api/places/{id} - xóa địa điểm theo id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlace(@PathVariable Long id) {
        placeService.deletePlace(id);
        return ResponseEntity.noContent().build();
    }
}
