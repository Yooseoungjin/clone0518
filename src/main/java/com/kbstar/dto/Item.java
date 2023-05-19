package com.kbstar.dto;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Item {
    private int id;
    private int cate_id;
    private String name;
    private int price;
    private String imgname;
    private Date rdate;
    private Integer top_cate;
}
