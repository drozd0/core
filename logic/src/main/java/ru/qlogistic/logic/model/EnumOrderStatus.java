package ru.qlogistic.logic.model;

import java.io.Serializable;

public enum EnumOrderStatus implements Serializable{
    CREATED(1),
    IN_PROGRESS(2),
    CLOSED(3);

    private Integer id;
    EnumOrderStatus(){}
    EnumOrderStatus(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }
}
