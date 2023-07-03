package com.example.interconnect.model.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class roomRequest {

    private String roomCode;
    private String roomName;
}
