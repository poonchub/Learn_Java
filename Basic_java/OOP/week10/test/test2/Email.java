package week10.test.test2;

public class Email implements ToolBox{

    private String emailAddress;
    private String userName;
    private String domainName;

    public Email(){

    }
    public Email(String firstName, String lastName, String domainName){
        this.userName = (firstName.concat(".".concat(lastName.substring(0,1)))).toLowerCase();
        this.emailAddress = (userName.concat("@".concat(domainName.concat(".com")))).toLowerCase();
        this.domainName = domainName.concat(".com");
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
