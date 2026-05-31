package com.createcr;

import com.createcr.item.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(CreateCR.MOD_ID)
public class CreateCR {
    public static final String MOD_ID = "createcr";

    public CreateCR(IEventBus modEventBus) {
        ModItems.ITEMS.register(modEventBus);
    }
}
