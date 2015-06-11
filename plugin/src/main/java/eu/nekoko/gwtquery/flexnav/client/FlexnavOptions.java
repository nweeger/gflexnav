package eu.nekoko.gwtquery.flexnav.client;

public class FlexnavOptions {
  private int animationSpeed = 250;
  private boolean transitionOpacity = true;
  private String buttonSelector = ".menu-button";
  private boolean hoverIntent = false;
  private int hoverIntentTimeout = 150;
  private boolean calcItemWidths = false;
  private boolean hover = true;

  /**
   * @return the animationSpeed
   */
  public int getAnimationSpeed() {
    return animationSpeed;
  }

  /**
   * @param animationSpeed the animationSpeed to set
   * @return this.
   */
  public FlexnavOptions setAnimationSpeed(int animationSpeed) {
    this.animationSpeed = animationSpeed;
    return this;
  }

  /**
   * @return the transitionOpacity
   */
  public boolean isTransitionOpacity() {
    return transitionOpacity;
  }

  /**
   * @param transitionOpacity the transitionOpacity to set
   * @return this.
   */
  public FlexnavOptions setTransitionOpacity(boolean transitionOpacity) {
    this.transitionOpacity = transitionOpacity;
    return this;
  }

  /**
   * @return the buttonSelector
   */
  public String getButtonSelector() {
    return buttonSelector;
  }

  /**
   * @param buttonSelector the buttonSelector to set
   * @return this.
   */
  public FlexnavOptions setButtonSelector(String buttonSelector) {
    this.buttonSelector = buttonSelector;
    return this;
  }

  /**
   * @return the hoverIntent
   */
  public boolean isHoverIntent() {
    return hoverIntent;
  }

  /**
   * @param hoverIntent the hoverIntent to set
   * @return this.
   */
  public FlexnavOptions setHoverIntent(boolean hoverIntent) {
    this.hoverIntent = hoverIntent;
    return this;
  }

  /**
   * @return the hoverIntentTimeout
   */
  public int getHoverIntentTimeout() {
    return hoverIntentTimeout;
  }

  /**
   * @param hoverIntentTimeout the hoverIntentTimeout to set
   * @return this.
   */
  public FlexnavOptions setHoverIntentTimeout(int hoverIntentTimeout) {
    this.hoverIntentTimeout = hoverIntentTimeout;
    return this;
  }

  /**
   * @return the calcItemWidths
   */
  public boolean isCalcItemWidths() {
    return calcItemWidths;
  }

  /**
   * @param calcItemWidths the calcItemWidths to set
   * @return this.
   */
  public FlexnavOptions setCalcItemWidths(boolean calcItemWidths) {
    this.calcItemWidths = calcItemWidths;
    return this;
  }

  /**
   * @return the hover
   */
  public boolean isHover() {
    return hover;
  }

  /**
   * @param hover the hover to set
   * @return this.
   */
  public FlexnavOptions setHover(boolean hover) {
    this.hover = hover;
    return this;
  }
}
