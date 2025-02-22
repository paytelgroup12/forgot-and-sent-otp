//package com.example.registerapp.dto;
//
//import lombok.Getter;
//import lombok.Setter;
//
//@Getter
//@Setter
//public class RegisterDto {
//
//  private String name;
//  private String email;
//  private String password;
//
//}
package com.example.registerapp.dto;

import lombok.Data;

@Data
public class RegisterDto {

    private String name;
    private String email;
    private String password;
}
