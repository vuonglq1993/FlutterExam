// model đại diện cho một địa điểm du lịch
class Place {
  final int id;
  final String name;
  final String location;
  final String imageUrl;
  final double rating;

  Place({
    required this.id,
    required this.name,
    required this.location,
    required this.imageUrl,
    required this.rating,
  });

  // chuyển dữ liệu JSON từ API thành object Place
  factory Place.fromJson(Map<String, dynamic> json) {
    return Place(
      id: json['id'],
      name: json['name'],
      location: json['location'],
      imageUrl: json['imageUrl'],
      rating: (json['rating'] as num).toDouble(),
    );
  }
}
