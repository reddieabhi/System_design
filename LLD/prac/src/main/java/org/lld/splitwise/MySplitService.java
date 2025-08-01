package org.lld.splitwise;

import java.util.HashMap;
import java.util.List;

public interface MySplitService {

    public void equalSplit(User user1, List<User> users, float totalAmount);
    public void exactSplit(User user1, List<HashMap<User, Integer>> amountToUsers, float totalAmount);
    public void percentSplit(User user1, List<HashMap<User, Float>> amountPercentToUsers, float totalAmount);


}
