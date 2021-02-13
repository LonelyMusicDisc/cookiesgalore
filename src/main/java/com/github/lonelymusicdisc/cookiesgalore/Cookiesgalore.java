package com.github.lonelymusicdisc.cookiesgalore;

import com.github.lonelymusicdisc.cookiesgalore.item.RegisterItems;
import net.fabricmc.api.ModInitializer;

public class Cookiesgalore implements ModInitializer {

    public static final String MOD_ID = "cookiesgalore";
    public static boolean isClient = false;

    @Override
    public void onInitialize() {

        RegisterItems.register();

    }
}
