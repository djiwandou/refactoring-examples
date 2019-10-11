class Order {
  // ...
  public double price() {
    private double primaryBasePrice;
    private double secondaryBasePrice;
    //this might be needed in the future
    private double tertiaryBasePrice;

    public double getPrimaryBasePrice() {
        return primaryBasePrice;
    }

    public double setPrimaryBasePrice(double primaryBasePrice) {
        this.primaryBasePrice = primaryBasePrice;
    }

    public double getSecondaryBasePrice() {
        return secondaryBasePrice;
    }

    public double setSecondaryBasePrice(double secondaryBasePrice) {
        this.secondaryBasePrice = secondaryBasePrice;
    }

    //this might be needed in the future
    public double getTertiaryBasePrice() {
        return tertiaryBasePrice;
    }

    public double setTertiaryBasePrice(double tertiaryBasePrice) {
        this.tertiaryBasePrice = tertiaryBasePrice;
    }
    // Perform long computation.


  }
}