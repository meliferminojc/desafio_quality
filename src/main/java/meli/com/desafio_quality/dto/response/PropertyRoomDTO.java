package meli.com.desafio_quality.dto.response;


import meli.com.desafio_quality.entity.Room;

public class PropertyRoomDTO {
    private String propName;
    private Room room;

    public PropertyRoomDTO(String propName, Room room) {
        this.propName = propName;
        this.room = room;
    }

    public String getPropName() {
        return propName;
    }

    public Room getRoom() {
        return room;
    }
}
