package org.lld.enum_prac;

public enum CustomStatusEnum {
    SUCCESS(200, "OK"),
    FAILURE(500, "INTERNAL SERVER ERROR"),
    NOTFOUND(404, "NOT FOUND OR MISSING");

    private int code;
    private String message;

    private CustomStatusEnum(int code, String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
