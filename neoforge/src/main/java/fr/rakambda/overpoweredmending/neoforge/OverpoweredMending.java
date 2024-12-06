package fr.rakambda.overpoweredmending.neoforge;

import fr.rakambda.overpoweredmending.neoforge.common.OverpoweredMendingImpl;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;

@Mod(OverpoweredMending.MOD_ID)
@Log4j2
public class OverpoweredMending{
	public static final String MOD_ID = "overpoweredmending";
	@Getter
	private static final OverpoweredMendingImpl mod = new OverpoweredMendingImpl();
	
	public OverpoweredMending(){
		mod.registerForge(NeoForge.EVENT_BUS);
	}
}
