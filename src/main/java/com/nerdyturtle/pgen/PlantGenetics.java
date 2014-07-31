package com.nerdyturtle.pgen;

import com.nerdyturtle.pgen.proxy.IProxy;
import com.nerdyturtle.pgen.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class PlantGenetics {

    @Mod.Instance(Reference.MOD_ID)
    public static PlantGenetics instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_LOCATION, serverSide = Reference.SERVER_PROXY_LOCATION)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }

}
