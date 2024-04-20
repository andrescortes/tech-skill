package co.com.hotel.hotel.utils;

import co.com.hotel.hotel.model.Room;
import co.com.hotel.hotel.repository.model.RoomData;
import org.mapstruct.Mapper;

@Mapper
public interface RoomTransformer {
    Room toEntity(RoomData dto);

    RoomData toData(Room entity);
}
