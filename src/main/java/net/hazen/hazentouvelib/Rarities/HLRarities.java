package net.hazen.hazentouvelib.Rarities;

import net.minecraft.network.chat.Style;
import net.minecraft.world.item.Rarity;
import net.neoforged.fml.common.asm.enumextension.EnumProxy;

import java.util.function.UnaryOperator;

import static net.minecraft.ChatFormatting.*;

public class HLRarities {


    public static final EnumProxy<Rarity> BLOOD_RARITY = new EnumProxy<>(Rarity.class,
            -1,
            "hazentouvelib:blood",
            (UnaryOperator<Style>) ((style) -> style.withColor(DARK_RED))
    );

    public static final EnumProxy<Rarity> DEUS_RARITY = new EnumProxy<>(Rarity.class,
            -1,
            "hazentouvelib:deus",
            (UnaryOperator<Style>) ((style) -> style.withColor(0xc4ffee))
    );

    public static final EnumProxy<Rarity> ELDRITCH_RARITY = new EnumProxy<>(Rarity.class,
            -1,
            "hazentouvelib:eldritch",
            (UnaryOperator<Style>) ((style) -> style.withColor(1016732))
    );

    public static final EnumProxy<Rarity> RADIANCE_RARITY = new EnumProxy<>(Rarity.class,
            -1,
            "hazentouvelib:radiance",
            (UnaryOperator<Style>) ((style) -> style.withColor(0xe4a6ea))
    );

    public static final EnumProxy<Rarity> ENDER_RARITY = new EnumProxy<>(Rarity.class,
            -1,
            "hazentouvelib:ender",
            (UnaryOperator<Style>) ((style) -> style.withColor(LIGHT_PURPLE))
    );

    public static final EnumProxy<Rarity> SHADOW_RARITY = new EnumProxy<>(Rarity.class,
            -1,
            "hazentouvelib:shadow",
            (UnaryOperator<Style>) ((style) -> style.withColor(0x553a7f))
    );

    public static final EnumProxy<Rarity> EVOCATION_RARITY = new EnumProxy<>(Rarity.class,
            -1,
            "hazentouvelib:evocation",
            (UnaryOperator<Style>) ((style) -> style.withColor(WHITE))
    );

    public static final EnumProxy<Rarity> FIRE_RARITY = new EnumProxy<>(Rarity.class,
            -1,
            "hazentouvelib:fire",
            (UnaryOperator<Style>) ((style) -> style.withColor(GOLD))
    );

    public static final EnumProxy<Rarity> HOLY_RARITY = new EnumProxy<>(Rarity.class,
            -1,
            "hazentouvelib:holy",
            (UnaryOperator<Style>) ((style) -> style.withColor(16775380))
    );

    public static final EnumProxy<Rarity> ICE_RARITY = new EnumProxy<>(Rarity.class,
            -1,
            "hazentouvelib:ice",
            (UnaryOperator<Style>) ((style) -> style.withColor(13695487))
    );

    public static final EnumProxy<Rarity> LIGHTNING_RARITY = new EnumProxy<>(Rarity.class,
            -1,
            "hazentouvelib:lightning",
            (UnaryOperator<Style>) ((style) -> style.withColor(AQUA))
    );

    public static final EnumProxy<Rarity> NATURE_RARITY = new EnumProxy<>(Rarity.class,
            -1,
            "hazentouvelib:nature",
            (UnaryOperator<Style>) ((style) -> style.withColor(GREEN))
    );

    public static final EnumProxy<Rarity> COSMIC_RARITY = new EnumProxy<>(Rarity.class,
            -1,
            "hazentouvelib:cosmic",
            (UnaryOperator<Style>) ((style) -> style.withColor(0x473196))
    );

    public static final EnumProxy<Rarity> HYDRO_RARITY = new EnumProxy<>(Rarity.class,
            -1,
            "hazentouvelib:hydro",
            (UnaryOperator<Style>) ((style) -> style.withColor(0x275ffb))
    );

    public static final EnumProxy<Rarity> FIREBLOSSOM_RARITY = new EnumProxy<>(Rarity.class,
            -1,
            "hazentouvelib:fireblossom",
            (UnaryOperator<Style>) ((style) -> style.withColor(0xee6646))
    );
}