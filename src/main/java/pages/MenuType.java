package pages;

public enum MenuType {

    ADMIN("Admin"),
    PIM("PIM"),
    LEAVE("Leave"),
    TIME("Time"),
    USER_MANAGEMENT("User Management");


    private final String name;

    public String getName(){
        return name;
    }

    MenuType(String name){
        this.name = name;
    }
}
