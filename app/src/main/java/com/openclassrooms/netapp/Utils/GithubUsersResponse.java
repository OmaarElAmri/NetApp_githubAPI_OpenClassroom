package com.openclassrooms.netapp.Utils;

import com.openclassrooms.netapp.Models.GithubUser;
import java.util.List;

public class GithubUsersResponse {
    private List<GithubUser> listOfUsers;

    public GithubUsersResponse(List<GithubUser> listOfUsers) {
        this.listOfUsers = listOfUsers;
    }

    public List<GithubUser> getListOfUsers() {
        return listOfUsers;
    }

    public void setListOfUsers(List<GithubUser> listOfUsers) {
        this.listOfUsers = listOfUsers;
    }
}
