package co.com.hotel.hotel.repository;

import co.com.hotel.hotel.repository.model.RoomData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface RoomInterface extends JpaRepository<RoomData, Integer> {

    List<RoomData> findAllByOnService(boolean isOnService);

    List<RoomData> findAllByOnServiceAndAndDateIn(boolean inOnService, LocalDateTime in);
}
