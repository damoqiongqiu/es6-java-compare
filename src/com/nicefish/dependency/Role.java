package com.nicefish.dependency;

import java.util.ArrayList;

public class Role {
    private String roleName;
    private String roleCode;
    private ArrayList<Permission> permissions;

    public ArrayList<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(ArrayList<Permission> permissions) {
        this.permissions = permissions;
    }
}
