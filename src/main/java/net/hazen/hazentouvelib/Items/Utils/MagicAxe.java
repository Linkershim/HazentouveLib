package net.hazen.hazentouvelib.Items.Utils;

import io.redspace.ironsspellbooks.api.registry.SpellDataRegistryHolder;
import io.redspace.ironsspellbooks.api.spells.ISpellContainer;
import io.redspace.ironsspellbooks.api.spells.ISpellContainerMutable;
import io.redspace.ironsspellbooks.api.spells.SpellData;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

import java.util.Arrays;
import java.util.List;

public class MagicAxe extends AxeItem {
    private List<SpellData> spellData = null;
    private final SpellDataRegistryHolder[] spellDataRegistryHolders;

    public MagicAxe(Tier tier, Properties properties, SpellDataRegistryHolder... spellDataRegistryHolders) {
        super(tier, properties);

        this.spellDataRegistryHolders = spellDataRegistryHolders;
    }

    public List<SpellData> getSpells() {
        if (this.spellData == null) {
            this.spellData = Arrays.stream(this.spellDataRegistryHolders)
                    .map(SpellDataRegistryHolder::getSpellData)
                    .toList();
        }

        return this.spellData;
    }

    public void initializeSpellContainer(ItemStack itemStack) {
        if (itemStack != null && !ISpellContainer.isSpellContainer(itemStack)) {

            List<SpellData> spells = this.getSpells();

            ISpellContainerMutable spellContainer =
                    ISpellContainer.create(spells.size(), true, false).mutableCopy();

            spells.forEach(spellData ->
                    spellContainer.addSpell(
                            spellData.getSpell(),
                            spellData.getLevel(),
                            true
                    )
            );

            ISpellContainer.set(itemStack, spellContainer.toImmutable());
        }
    }
}
