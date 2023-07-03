package com.example.interconnect.model.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class memberResponse{
    private int number;
    private String name;
    private String rC;
    private String id;
    private String password;
    private Boolean admin;

    public memberResponse(memberResponse memberEntity){
        this.number = memberEntity.getNumber();
        this.name = memberEntity.getName();
        this.rC = memberEntity.getRC();
        this.id = memberEntity.getId();
        this.password = memberEntity.getPassword();
        this.admin = memberEntity.getAdmin();
    }
}
