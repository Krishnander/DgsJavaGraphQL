package com.dgs.demoApp.domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Battle {

    private int year;
    private String name;
    private  String king;
    private Legions armySize;

}
