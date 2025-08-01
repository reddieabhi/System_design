package org.lld.splitwise;

import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VerifyService {

    public boolean verifyNumbers(List<HashMap<User, Integer>> numbersUsers, float total){

        for (Map<User, Integer> map:numbersUsers){
            for (Map.Entry<User, Integer> entry: map.entrySet()){
                total -= entry.getValue();
            }
        }

        return total == 0;
    }
}
