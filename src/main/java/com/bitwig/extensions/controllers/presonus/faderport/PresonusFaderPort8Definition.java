package com.bitwig.extensions.controllers.presonus.faderport;

import java.util.UUID;

import com.bitwig.extension.controller.api.ControllerHost;

public class PresonusFaderPort8Definition extends PresonusFaderPortDefinition
{
   private final static UUID ID = UUID.fromString("122775f6-6726-4a28-8dcc-f358c175f749");

   @Override
   public UUID getId()
   {
      return ID;
   }

   @Override
   int channelCount()
   {
      return 8;
   }

   @Override
   String sysexDeviceID()
   {
      return "02";
   }

   @Override
   public PresonusFaderPort8 createInstance(final ControllerHost host)
   {
      return new PresonusFaderPort8(this, host);
   }
}
