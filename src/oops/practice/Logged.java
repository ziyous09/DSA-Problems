package oops;

public class Logged {
    private String userName;
    private String password;

    Logged(String userName,String password){
        this.userName = userName;
        this.password = password;
    }
    public void login(String userName , String password){
        if(this.userName.toLowerCase().equals(userName.toLowerCase()) && this.password.equals(password)){
            System.out.println("Access Granted Successfully");
        }
        else{
            System.out.println("Access Denied");
        }
    }
}
