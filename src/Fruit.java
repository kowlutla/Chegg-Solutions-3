class Fruit {
  private int weight;
  private String name;
  public Fruit (String name, int weight) {
    this.name = name;
    this.weight = weight;
  }
  public int getWeight() { return weight; }
  public String getName() { return name; }
  public String toString() { return String.format("%s(%dkg)", name, weight); }
}