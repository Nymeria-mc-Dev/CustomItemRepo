package fr.nymeria.items.Modifier;

import java.util.UUID;

import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlot;

public class AttributeHelper {

	public static AttributeModifier setDamages(EquipmentSlot slot, double damages) {
		AttributeModifier attribute = new AttributeModifier(UUID.fromString("a4089698-eb49-430d-b011-23ccc6ebcf7d"), "generic.attackattribute", damages, AttributeModifier.Operation.ADD_NUMBER, slot);
		return attribute;
	}
	
	public static AttributeModifier setAttackSpeed(EquipmentSlot slot, double speed) {
		AttributeModifier attribute = new AttributeModifier(UUID.fromString("a4089698-eb49-430d-b011-23ccc6ebcf7d"), "generic.attackSpeed", speed, AttributeModifier.Operation.ADD_NUMBER, slot);
		return attribute;
	}
	
	public static AttributeModifier setMovementSpeed(EquipmentSlot slot, double speed) {
		AttributeModifier attribute = new AttributeModifier(UUID.fromString("a4089698-eb49-430d-b011-23ccc6ebcf7d"), "generic.attackSpeed", speed, AttributeModifier.Operation.ADD_NUMBER, slot);
		return attribute;
	}
	
	public static AttributeModifier setLuck(EquipmentSlot slot, double luck) {
		AttributeModifier attribute = new AttributeModifier(UUID.fromString("a4089698-eb49-430d-b011-23ccc6ebcf7d"), "generic.attackSpeed", luck, AttributeModifier.Operation.ADD_NUMBER, slot);
		return attribute;
	}
}
