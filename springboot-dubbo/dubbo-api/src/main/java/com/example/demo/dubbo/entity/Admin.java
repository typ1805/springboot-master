package com.example.demo.dubbo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 路径：com.example.demo.dubbo.entity
 * 类名：
 * 功能：《用一句描述一下》
 * 备注：
 * 创建人：typ
 * 创建时间：2018/11/16 15:25
 * 修改人：
 * 修改备注：
 * 修改时间：
 */
@Data
public class Admin implements Serializable {

    private Integer id;

    private String name;

    private String password;
}
