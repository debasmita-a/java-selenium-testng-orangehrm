package pages;

import pages.components.AddUsersComponent;
import pages.components.SearchComponent;

public class UsersPage {

    private final SearchComponent searchComponent;
    private final AddUsersComponent addUsersComponent;

    public UsersPage(){
        this.addUsersComponent = new AddUsersComponent();
        this.searchComponent = new SearchComponent();
    }

    public SearchComponent getSearchComponent() {
        return searchComponent;
    }
    public AddUsersComponent getAddUsersComponent() {
        return addUsersComponent;
    }


}
