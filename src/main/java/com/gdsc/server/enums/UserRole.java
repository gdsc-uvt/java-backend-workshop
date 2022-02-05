package com.gdsc.server.enums;

/**
 * @author : Mihai-Cristian Popescu
 * @since : 2/2/2022, Wed
 **/

public enum UserRole {

    OWNER("Owner"),
    MANAGER("Manager"),
    EMPLOYEE("Employee"),
    CLIENT("Client");

    private final String role;

    UserRole(final String role) {
        this.role = role;
    }

    public String getRole() {
        return this.role;
    }
}
