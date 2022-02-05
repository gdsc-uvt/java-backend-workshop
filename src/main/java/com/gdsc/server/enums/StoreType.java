package com.gdsc.server.enums;

/**
 * @author : Mihai-Cristian Popescu
 * @since : 2/2/2022, Wed
 **/

public enum StoreType {

    SUPERMARKET("Supermarket"),
    CLOTHES_SHOP("Clothes shop"),
    MUSIC_SHOP("Music shop");

    private final String type;

    StoreType(final String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
