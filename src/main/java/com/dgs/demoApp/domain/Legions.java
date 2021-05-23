package com.dgs.demoApp.domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Legions {
    private int infantry;
    private int cavalry;
    private  String commander;
    private  String battleField;
}
