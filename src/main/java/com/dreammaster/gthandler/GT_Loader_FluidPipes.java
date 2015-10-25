package com.dreammaster.gthandler;

import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.metatileentity.implementations.GT_MetaPipeEntity_Fluid;
import gregtech.api.util.GT_OreDictUnificator;

public class GT_Loader_FluidPipes
{
	public void run()
	{
		registerHighTierPipes();
	}

	private void registerHighTierPipes()
	{
		// 5110 - 5114 Copper
		// 5120 - 5124 Bronze
		// 5130 - 5134 Steel
		// 5140 - 5144 Stainless
		// 5150 - 5154 Titanium
		// 5160 - 5164 Tungstensteel
		// 5165 - 5167 High Pressure Pipe
		// 5168 Plasma Pipe
		// 5170 - 5174 Plastic
		
		// 5180 - 5184 NiobiumTitanium
	    GT_OreDictUnificator.registerOre(OrePrefixes.pipeTiny.get(Materials.NiobiumTitanium), new GT_MetaPipeEntity_Fluid(5180, "GT_Pipe_NiobiumTitanium_Tiny", "Tiny Niobium-Titanium Fluid Pipe", 0.25F, Materials.NiobiumTitanium, 150, 2900, true).getStackForm(1L));
	    GT_OreDictUnificator.registerOre(OrePrefixes.pipeSmall.get(Materials.NiobiumTitanium), new GT_MetaPipeEntity_Fluid(5181, "GT_Pipe_NiobiumTitanium_Small", "Small Niobium-Titanium Fluid Pipe", 0.375F, Materials.NiobiumTitanium, 300, 2900, true).getStackForm(1L));
	    GT_OreDictUnificator.registerOre(OrePrefixes.pipeMedium.get(Materials.NiobiumTitanium), new GT_MetaPipeEntity_Fluid(5182, "GT_Pipe_NiobiumTitanium", "Niobium-Titanium Fluid Pipe", 0.5F, Materials.NiobiumTitanium, 900, 2900, true).getStackForm(1L));
	    GT_OreDictUnificator.registerOre(OrePrefixes.pipeLarge.get(Materials.NiobiumTitanium), new GT_MetaPipeEntity_Fluid(5183, "GT_Pipe_NiobiumTitanium_Large", "Large Niobium-Titanium Fluid Pipe", 0.75F, Materials.NiobiumTitanium, 2400, 2900, true).getStackForm(1L));
	    GT_OreDictUnificator.registerOre(OrePrefixes.pipeHuge.get(Materials.NiobiumTitanium), new GT_MetaPipeEntity_Fluid(5184, "GT_Pipe_NiobiumTitanium_Huge", "Huge Niobium-Titanium Fluid Pipe", 1.0F, Materials.NiobiumTitanium, 3600, 2900, true).getStackForm(1L));
			
	    // 5190 - 5194 NiobiumTitanium
		GT_OreDictUnificator.registerOre(OrePrefixes.pipeTiny.get(Materials.Enderium), new GT_MetaPipeEntity_Fluid(5190, "GT_Pipe_Enderium_Tiny", "Tiny Enderium Fluid Pipe", 0.25F, Materials.Enderium, 300, 15000, true).getStackForm(1L));
	    GT_OreDictUnificator.registerOre(OrePrefixes.pipeSmall.get(Materials.Enderium), new GT_MetaPipeEntity_Fluid(5191, "GT_Pipe_Enderium_Small", "Small Enderium Fluid Pipe", 0.375F, Materials.Enderium, 600, 15000, true).getStackForm(1L));
	    GT_OreDictUnificator.registerOre(OrePrefixes.pipeMedium.get(Materials.Enderium), new GT_MetaPipeEntity_Fluid(5192, "GT_Pipe_Enderium", "Enderium Fluid Pipe", 0.5F, Materials.Enderium, 1800, 15000, true).getStackForm(1L));
	    GT_OreDictUnificator.registerOre(OrePrefixes.pipeLarge.get(Materials.Enderium), new GT_MetaPipeEntity_Fluid(5193, "GT_Pipe_Enderium_Large", "Large Enderium Fluid Pipe", 0.75F, Materials.Enderium, 4800, 15000, true).getStackForm(1L));
	    GT_OreDictUnificator.registerOre(OrePrefixes.pipeHuge.get(Materials.Enderium), new GT_MetaPipeEntity_Fluid(5194, "GT_Pipe_Enderium_Huge", "Huge Enderium Fluid Pipe", 1.0F, Materials.Enderium, 7200, 15000, true).getStackForm(1L));

	    // 5200 - 5204 NiobiumTitanium
	    GT_OreDictUnificator.registerOre(OrePrefixes.pipeTiny.get(Materials.Naquadah), new GT_MetaPipeEntity_Fluid(5200, "GT_Pipe_Naquadah_Tiny", "Tiny Naquadah Fluid Pipe", 0.25F, Materials.Naquadah, 1500, 19000, true).getStackForm(1L));
	    GT_OreDictUnificator.registerOre(OrePrefixes.pipeSmall.get(Materials.Naquadah), new GT_MetaPipeEntity_Fluid(5201, "GT_Pipe_Naquadah_Small", "Small Naquadah Fluid Pipe", 0.375F, Materials.Naquadah, 3000, 19000, true).getStackForm(1L));
	    GT_OreDictUnificator.registerOre(OrePrefixes.pipeMedium.get(Materials.Naquadah), new GT_MetaPipeEntity_Fluid(5202, "GT_Pipe_Naquadah", "Naquadah Fluid Pipe", 0.5F, Materials.Naquadah, 9000, 19000, true).getStackForm(1L));
	    GT_OreDictUnificator.registerOre(OrePrefixes.pipeLarge.get(Materials.Naquadah), new GT_MetaPipeEntity_Fluid(5203, "GT_Pipe_Naquadah_Large", "Large Naquadah Fluid Pipe", 0.75F, Materials.Naquadah, 24000, 19000, true).getStackForm(1L));
	    GT_OreDictUnificator.registerOre(OrePrefixes.pipeHuge.get(Materials.Naquadah), new GT_MetaPipeEntity_Fluid(5204, "GT_Pipe_Naquadah_Huge", "Huge Naquadah Fluid Pipe", 1.0F, Materials.Naquadah, 36000, 19000, true).getStackForm(1L));

	    // 5210 - 5214 NiobiumTitanium
	    GT_OreDictUnificator.registerOre(OrePrefixes.pipeTiny.get(Materials.Neutronium), new GT_MetaPipeEntity_Fluid(5210, "GT_Pipe_Neutronium_Tiny", "Tiny Neutronium Fluid Pipe", 0.25F, Materials.Neutronium, 2800, 1000000, true).getStackForm(1L));
	    GT_OreDictUnificator.registerOre(OrePrefixes.pipeSmall.get(Materials.Neutronium), new GT_MetaPipeEntity_Fluid(5211, "GT_Pipe_Neutronium_Small", "Small Neutronium Fluid Pipe", 0.375F, Materials.Neutronium, 5600, 1000000, true).getStackForm(1L));
	    GT_OreDictUnificator.registerOre(OrePrefixes.pipeMedium.get(Materials.Neutronium), new GT_MetaPipeEntity_Fluid(5212, "GT_Pipe_Neutronium", "Neutronium Fluid Pipe", 0.5F, Materials.Neutronium, 16800, 1000000, true).getStackForm(1L));
	    GT_OreDictUnificator.registerOre(OrePrefixes.pipeLarge.get(Materials.Neutronium), new GT_MetaPipeEntity_Fluid(5213, "GT_Pipe_Neutronium_Large", "Large Neutronium Fluid Pipe", 0.75F, Materials.Neutronium, 44800, 1000000, true).getStackForm(1L));
	    GT_OreDictUnificator.registerOre(OrePrefixes.pipeHuge.get(Materials.Neutronium), new GT_MetaPipeEntity_Fluid(5214, "GT_Pipe_Neutronium_Huge", "Huge Neutronium Fluid Pipe", 1.0F, Materials.Neutronium, 67200, 1000000, true).getStackForm(1L));
	    
	    // 5214 - 5588 Free, as of GT 5.09.10
	    // 5589+ Item Pipes Tin
	}
}
