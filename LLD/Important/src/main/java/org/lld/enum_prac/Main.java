package org.lld.enum_prac;

public class Main {

    public static void main(String[] args) {
        for (EnumWeek enumWeek : EnumWeek.values()) {
            System.out.println(enumWeek.ordinal());
            System.out.println(enumWeek.name());
            System.out.println(EnumWeek.valueOf(enumWeek.name()));
        }
    }
}

