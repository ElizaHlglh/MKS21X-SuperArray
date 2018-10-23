abstract class SuperArray {
  private String[] data;
  private int size;

  public SuperArray(){
    data = String[10];
  }

  public void clear(){
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  

}
