package com.example.interconnect.model.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class roomResponse {
    private String roomCode;
    private String roomName;

    public roomResponse(roomResponse roomEntity){
        this.roomCode = roomEntity.getRoomCode();
        this.roomName = roomEntity.getRoomName();
    }
}
