package pages;

import pages.components.LeftMenuComponent;

public class HomePage {

    private final LeftMenuComponent leftMenuComponent;

    public HomePage(){
        this.leftMenuComponent = new LeftMenuComponent();
    }

    public LeftMenuComponent getLeftMenuComponent(){
        return leftMenuComponent;
    }

    public UsersPage navigateToAddUsersPage(){
        leftMenuComponent.clickMenuItem(MenuType.ADMIN)
        .clickSubMenuItem(SubMenuType.USERS);

        return new UsersPage();
    }

}
