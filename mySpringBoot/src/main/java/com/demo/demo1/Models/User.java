package com.demo.demo1.Models;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by qianweijie on 2019/6/12.
 */
@Data
public class User implements Serializable {

    private Long id;
    private String name;
    private Integer age;
}
