package com.marlow.logservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChangeLogs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long accountId;
    private String action;
    private String userEmail;


}
