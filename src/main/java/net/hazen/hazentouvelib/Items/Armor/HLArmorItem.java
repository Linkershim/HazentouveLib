package net.hazen.hazentouvelib.Items.Armor;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import io.redspace.ironsspellbooks.item.weapons.AttributeContainer;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;

public class HLArmorItem extends ArmorItem {

    public HLArmorItem(Holder<ArmorMaterial> material, Type type, Properties properties) {
        super(material, type, properties);
    }

    public static AttributeContainer[] dormantTier(Holder<Attribute> school1) {
        return new AttributeContainer[]{
                new AttributeContainer(school1, 0.02, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.MAX_MANA, (double)50.0F, AttributeModifier.Operation.ADD_VALUE)
        };
    }

    public static AttributeContainer[] dormantTierDual(Holder<Attribute> school1, Holder<Attribute> school2) {
        return new AttributeContainer[]{
                new AttributeContainer(school1, 0.02, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(school2, 0.02, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.MAX_MANA, (double)50.0F, AttributeModifier.Operation.ADD_VALUE)
        };
    }

    public static AttributeContainer[] dormantTierTri(Holder<Attribute> school1, Holder<Attribute> school2, Holder<Attribute> school3) {
        return new AttributeContainer[]{
                new AttributeContainer(school1, 0.02, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(school2, 0.02, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(school3, 0.02, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.MAX_MANA, (double)50.0F, AttributeModifier.Operation.ADD_VALUE)
        };
    }

    public static AttributeContainer[] schoolTierDual(Holder<Attribute> school1, Holder<Attribute> school2) {
        return new AttributeContainer[]{
                new AttributeContainer(school1, 0.1, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(school2, 0.1, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.MAX_MANA, (double)125.0F, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(AttributeRegistry.SPELL_POWER, 0.05, AttributeModifier.Operation.ADD_MULTIPLIED_BASE)
        };
    }

    public static AttributeContainer[] schoolTierTri(Holder<Attribute> school1, Holder<Attribute> school2, Holder<Attribute> school3) {
        return new AttributeContainer[]{
                new AttributeContainer(school1, 0.1, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(school2, 0.1, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(school3, 0.1, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.MAX_MANA, (double)125.0F, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(AttributeRegistry.SPELL_POWER, 0.05, AttributeModifier.Operation.ADD_MULTIPLIED_BASE)};
    }

    public static AttributeContainer[] pureTier(Holder<Attribute> school)
    {
        return new AttributeContainer[]{
                new AttributeContainer(school, 0.15f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.MAX_MANA, 200, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(AttributeRegistry.SPELL_POWER, .05f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.ELDRITCH_SPELL_POWER, 0.05f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
        };
    }

    public static AttributeContainer[] pureTierDual(Holder<Attribute> school1, Holder<Attribute> school2)
    {
        return new AttributeContainer[]{
                new AttributeContainer(school1, 0.15f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(school2, 0.15f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.SPELL_POWER, .05f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.MAX_MANA, 200, AttributeModifier.Operation.ADD_VALUE),
        };
    }

    public static AttributeContainer[] pureTierTri(Holder<Attribute> school1, Holder<Attribute> school2, Holder<Attribute> school3)
    {
        return new AttributeContainer[]{
                new AttributeContainer(school1, 0.15f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(school2, 0.15f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(school3, 0.15f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.SPELL_POWER, .05f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.MAX_MANA, 200, AttributeModifier.Operation.ADD_VALUE),
        };
    }

    public static AttributeContainer[] paragonTier(Holder<Attribute> school)
    {
        return new AttributeContainer[]{
                new AttributeContainer(school, 0.2f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.MAX_MANA, 300, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(AttributeRegistry.SPELL_RESIST, 0.05f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.SPELL_POWER, 0.05f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
        };
    }

    public static AttributeContainer[] paragonTierDual(Holder<Attribute> school1, Holder<Attribute> school2)
    {
        return new AttributeContainer[]{
                new AttributeContainer(school1, 0.2f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(school2, 0.2f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.MAX_MANA, 300, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(AttributeRegistry.SPELL_RESIST, 0.05f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.SPELL_POWER, 0.05f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
        };
    }

    public static AttributeContainer[] paragonTierTri(Holder<Attribute> school1, Holder<Attribute> school2, Holder<Attribute> school3)
    {
        return new AttributeContainer[]{
                new AttributeContainer(school1, 0.2f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(school2, 0.2f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(school3, 0.2f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.MAX_MANA, 300, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(AttributeRegistry.SPELL_RESIST, 0.05f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.SPELL_POWER, 0.05f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
        };
    }



    public static AttributeContainer[] ascendedTier(Holder<Attribute> school)
    {
        return new AttributeContainer[]{
                new AttributeContainer(school, 0.25f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.MAX_MANA, 500, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(AttributeRegistry.SPELL_RESIST, 0.1f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.SPELL_POWER, 0.05f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
        };
    }

    public static AttributeContainer[] ascendedTierDual(Holder<Attribute> school1, Holder<Attribute> school2)
    {
        return new AttributeContainer[]{
                new AttributeContainer(school1, 0.25f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(school2, 0.25f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.MAX_MANA, 500, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(AttributeRegistry.SPELL_RESIST, 0.1f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.SPELL_POWER, 0.05f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
        };
    }

    public static AttributeContainer[] ascendedTierTri(Holder<Attribute> school1, Holder<Attribute> school2, Holder<Attribute> school3)
    {
        return new AttributeContainer[]{
                new AttributeContainer(school1, 0.25f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(school2, 0.25f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(school3, 0.25f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.MAX_MANA, 500, AttributeModifier.Operation.ADD_VALUE),
                new AttributeContainer(AttributeRegistry.SPELL_RESIST, 0.1f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
                new AttributeContainer(AttributeRegistry.SPELL_POWER, 0.05f, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
        };
    }


}