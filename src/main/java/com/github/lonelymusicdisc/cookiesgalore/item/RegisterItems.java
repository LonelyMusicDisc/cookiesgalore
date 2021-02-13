package com.github.lonelymusicdisc.cookiesgalore.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.EnchantedGoldenAppleItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterItems {

    public static final Item GOLDEN_COOKIE = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 1600, 1, false, true), 100).alwaysEdible().build()));
    public static final Item DIAMOND_COOKIE = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 2600, 1, false, true), 100).alwaysEdible().build()));
    public static final Item NETHERITE_COOKIE = new EnchantedGoldenAppleItem(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1600, 0, false, true), 100).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1600, 0, false, true), 100).alwaysEdible().build()));



    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("cookiesgalore", "golden_cookie"), GOLDEN_COOKIE);
        Registry.register(Registry.ITEM, new Identifier("cookiesgalore", "diamond_cookie"), DIAMOND_COOKIE);
        Registry.register(Registry.ITEM, new Identifier("cookiesgalore", "netherite_cookie"), NETHERITE_COOKIE);
    }

}
