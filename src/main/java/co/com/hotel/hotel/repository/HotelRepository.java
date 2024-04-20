package co.com.hotel.hotel.repository;

import co.com.hotel.hotel.repository.model.HotelData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<HotelData, Integer> {


}
