package pages;

public enum SubMenuType {
    USER_MANAGEMENT("User Management"),
    USERS("Users");

    private final String name;

    public String getName(){
        return name;
    }

    SubMenuType(String name){
        this.name = name;
    }

}
