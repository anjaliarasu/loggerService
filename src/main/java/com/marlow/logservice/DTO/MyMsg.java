package com.marlow.logservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyMsg implements Serializable {
    String event;
    Long id;
    String userEmail;
}