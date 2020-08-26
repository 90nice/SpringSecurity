package com.itheima.security.springboot.model;

import lombok.Data;

/**
 * @author Administrator
 * @version 1.0
 **/
@Data
public class PermissionDto {

    private String id;

    //权限
    private String code;
    private String description;
    private String url;
}