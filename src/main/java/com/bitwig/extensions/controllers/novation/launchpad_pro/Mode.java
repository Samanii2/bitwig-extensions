package com.bitwig.extensions.controllers.novation.launchpad_pro;


abstract class Mode
{
   Mode(final LaunchpadProControllerExtension driver)
   {
      mDriver = driver;
   }

   final void activate()
   {
      assert !mIsActive;
      mIsActive = true;

      doActivate();

      paint();

      final String modeDescription = getModeDescription();
      if (modeDescription != null)
         mDriver.getHost().showPopupNotification(modeDescription);
   }

   protected abstract String getModeDescription();

   protected abstract void doActivate();

   void deactivate()
   {
      assert mIsActive;
      mIsActive = false;

      paintModeButton();
   }

   void paint()
   {
      paintModeButton();
   }

   void paintModeButton()
   {
   }

   void onPadPressed(final int x, final int y, final int velocity)
   {}

   void onPadPressure(final int x, final int y, final int pressure)
   {}

   void onPadReleased(final int x, final int y, final int velocity, final boolean wasHeld) {}

   final boolean isActive()
   {
      return mIsActive;
   }

   boolean mIsActive = false;
   final LaunchpadProControllerExtension mDriver;

   void onArrowUpReleased()
   {
   }

   void onArrowUpPressed()
   {
   }

   void onArrowDownReleased()
   {
   }

   void onArrowDownPressed()
   {
   }

   void onArrowRightPressed()
   {

   }

   void onArrowRightReleased()
   {

   }

   void onArrowLeftPressed()
   {

   }

   void onArrowLeftReleased()
   {

   }

   void onSceneButtonPressed(final int column)
   {
   }

   void onSceneButtonReleased(final int column)
   {
   }

   void onTrackSelectPressed()
   {

   }

   void onTrackSelectReleased()
   {

   }

   void onMutePressed()
   {

   }

   void onMuteReleased()
   {

   }

   void onSoloPressed()
   {

   }

   void onSoloReleased()
   {

   }

   void onVolumePressed()
   {

   }

   void onVolumeReleased()
   {

   }

   void onPanPressed()
   {

   }

   void onPanReleased()
   {

   }

   void onSendPressed()
   {

   }

   void onSendReleased()
   {

   }

   void onStopClipPressed()
   {

   }

   void onStopClipReleased()
   {

   }

   void onShiftPressed()
   {
   }

   void onShiftReleased()
   {
   }

   void onDeletePressed()
   {
   }

   void onDeleteReleased()
   {
   }

   void onQuantizePressed()
   {
   }

   void onQuantizeReleased()
   {
   }

   void updateKeyTranslationTable(final Integer[] table)
   {
   }

   public void onCursorClipExists(final boolean exists)
   {
   }
}