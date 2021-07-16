package meli.com.desafio_quality.util.mapper;


import meli.com.desafio_quality.dto.form.RoomForm;
import meli.com.desafio_quality.entity.Room;
import meli.com.desafio_quality.util.GenerateID;

import java.util.ArrayList;
import java.util.List;

public class RoomMapper {
    static List<Room> toEntity(List<RoomForm> roomFormList) {
        List<Room> roomList = new ArrayList<>();

        roomFormList.forEach(roomForm -> roomList.add(new Room(
                GenerateID.toRoom(),
                roomForm.getName(),
                roomForm.getWidth(),
                roomForm.getLength()))
        );

        return roomList;
    }
}
