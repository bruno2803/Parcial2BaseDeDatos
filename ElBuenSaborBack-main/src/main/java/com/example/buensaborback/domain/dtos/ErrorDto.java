package com.example.buensaborback.domain.dtos;


import lombok.*;


@Builder
public class ErrorDto {
    private String errorMsg;
    private String errorClass;
}
