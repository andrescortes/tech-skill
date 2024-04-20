package co.com.hotel.hotel.service;

import co.com.hotel.hotel.model.Room;
import co.com.hotel.hotel.model.enums.TypeRoom;
import reactor.core.publisher.Flux;

import java.time.LocalDateTime;

public class RoomServiceImpl implements RoomService {
    @Override
    public Flux<Room> freeRooms(LocalDateTime in, LocalDateTime out, TypeRoom type, Integer quantityCustomers) {
        return null;
    }
}
