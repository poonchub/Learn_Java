package week10.test.test1;

public class Email implements ToolBox{

    private String emailAddress;
    private String userName;
    private String domainName;

    public Email(){

    }
    public Email(String emailAddress){
        this.emailAddress = emailAddress;
        String [] str = emailAddress.split("@");
        this.userName = str[0];
        this.domainName = str[1];
    }

    public String getEmailAddress(){
        return emailAddress;
    }

    public String getUserName(){
        return userName;
    }

    public String getDomainName(){
        return domainName;
    }

    public void getInfo(){
        System.out.println("Email address: "+emailAddress);
        System.out.println("Username: "+userName);
        System.out.println("Domain name: "+domainName);
    }
}
