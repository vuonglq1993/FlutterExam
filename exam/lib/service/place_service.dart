import 'dart:convert';
import 'package:http/http.dart' as http;
import '../model/place.dart';

// lớp gọi API từ Spring Boot backend
class PlaceService {
  // địa chỉ base của server, localhost khi chạy trên iOS simulator
  static const String _baseUrl = 'http://localhost:8080/api/places';

  // gọi API lấy toàn bộ danh sách địa điểm
  Future<List<Place>> getAllPlace() async {
    final response = await http.get(Uri.parse(_baseUrl));
    if (response.statusCode == 200) {
      final List<dynamic> data = jsonDecode(response.body);
      return data.map((json) => Place.fromJson(json)).toList();
    }
    throw Exception('Lấy dữ liệu thất bại');
  }
}
