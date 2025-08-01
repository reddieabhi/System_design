//package org.lld.Controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Concatinate {
//
//    public String concatenateStrings(String[] words) {
//
//        String result = "";
//
//        for (String word : words) {
//
//            result += word + " ";
//
//        }
//
//        return result.trim();
//
//    }
//
//    boolean isFavorite(Fruit fruit) {
//
//        List<String> consideredFruitList = new ArrayList<>();
//        consideredFruitList.add("apple");
//        consideredFruitList.add("grape");
//        consideredFruitList.add("mango");
//        consideredFruitList.add("banana");
//
//        if (consideredFruitList.contains(fruit.getType())){
//    return  true;
//        } else {
//    return false;
//        }
//
//
////        if(fruit.getType().equals("apple")) {
////
////            return true;
////
////        }
////
////
////
////        if(fruit.getType().equals("grape")) {
////
////            return true;
////
////        }
////
////
////
////        if(fruit.getType().equals("mango")) {
////
////            return true;
////
////        }
//
//
//
//        if(!fruit.getType().equals("apple") &&
//
//                !fruit.getType().equals("grape") &&
//
//                !fruit.getType().equals("mango")) {
//
//            return false;
//
//        }
//
//
//
//        return false;
//
//    }
//}
