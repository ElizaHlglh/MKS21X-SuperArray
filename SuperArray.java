public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 10;
  }

  public SuperArray(String[] x){
    data = x;
    size = data.length;
  }

  public void clear(){
    size = 0;
    data = new String[size];
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size() == 0;
  }

  public boolean add(String value) {
    if (size() == 0) {
      size++;
      data = new String[size];
    }
    for (int i=0; i < data.length; i++) {
      if (data[i] == null) {
        data[i] = value;
        return true;
      }
    }
    return false;
  }

  public String toString() {
    String ans = "[";
    for (int i = 0; i < data.length; i++) {
      if (data[i] != null && i != data.length-1) {
        ans += data[i] + ",";
      }
      else if (data[i] != null && i == data.length-1) {
        ans += data[i];
      }
    }
    ans += "]";
    return ans;
  }

  public String toStringDebug() {
    String ans = "[";
    for (int i = 0; i < data.length; i++) {
      if (i != data.length-1) {
        ans += data[i] + ",";
      }
      else {
        ans += data[i];
      }
    }
    ans += "]";
    return ans;
  }

  public String get(int index) {
    if (index < 0 || index >= size()) {
      return null;
    }
    else {
      return data[index];
    }
  }

  public String set(int index, String value) {
    if (index < 0 || index >= size()) {
      return null;
    }
    else {
      String old = data[index];
      data[index] = value;
      return old;
    }
  }


}
