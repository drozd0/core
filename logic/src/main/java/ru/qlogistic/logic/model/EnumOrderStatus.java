package ru.qlogistic.logic.model;

public enum EnumOrderStatus {
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
