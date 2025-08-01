package org.lld.splitwise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SplitService implements MySplitService{

    OwesService owesService = new OwesService();
    VerifyService verifyService = new VerifyService();

    @Override
    public void equalSplit(User user1, List<User> users, float totalAmount) {
        float amount = totalAmount/users.size();

        for (User user: users){
            if (user != user1){
                owesService.addOwes(user1, user, amount);
            }
        }

    }

    @Override
    public void exactSplit(User user1, List<HashMap<User, Integer>> amountToUsers, float totalAmount) {

        boolean matched = verifyService.verifyNumbers(amountToUsers, totalAmount);
        if (!matched){
            return;
        }


        for (HashMap<User, Integer> map:amountToUsers){
            for (Map.Entry<User, Integer> entry:map.entrySet()){
                User user = entry.getKey();
                float amount = entry.getValue();

                if (user != user1){
                    owesService.addOwes(user1, user, amount);
                }
            }
        }

    }

    @Override
    public void percentSplit(User user1, List<HashMap<User, Float>> amountPercentToUsers, float totalAmount) {

    }
}
