package com.createcr.item;

import com.createcr.CreateCR;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(CreateCR.MOD_ID);

    /**
     * Incomplete Diamond — used as a transitional item in the sequenced assembly
     * diamond recipe. Think of it like a half-assembled Lego set:
     * it goes through multiple Create machines before becoming a real diamond.
     */
    public static final DeferredItem<Item> INCOMPLETE_DIAMOND =
            ITEMS.registerSimpleItem("incompletediamond", new Item.Properties());
}
