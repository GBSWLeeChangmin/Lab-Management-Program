package com.example.interconnect.model.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class memberRequest{

    private int number;
    private String name;
    private String rC;
    private String id;
    private String password;
}
