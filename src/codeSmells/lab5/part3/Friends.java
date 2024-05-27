package codeSmells.lab5.part3;

import java.util.ArrayList;
import java.util.List;

public class Friends {
    private List<String> friendsList;

    public Friends() {
        this.friendsList = new ArrayList<>();
    }

    public void addFriend(String friend) {
        friendsList.add(friend);
    }

    public void removeFriend(String friend) {
        friendsList.remove(friend);
    }

    public List<String> getFriendsList() {
        return friendsList;
    }
}
