package oops;

public class Friends {
    static int noOfFriends;
    protected String name;
    Friends(String name){
        this.name = name;
        noOfFriends++;
    }
    static void showFriend(){
        System.out.println("The number of Friends "+ noOfFriends);
    }
}
