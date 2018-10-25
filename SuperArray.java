public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public void clear(){
    size = 0;
    data = new String[10];
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size() == 0;
  }

  public boolean add(String value) {
    if (value.equals(null)) {
      return false;
    }
    if (size() < data.length) {
      size++;
      for (int i=0; i < data.length; i++) {
        if (data[i] == null) {
          data[i] = value;
          return true;
        }
      }
    }
    else {
      resize();
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
    if (value.equals(null)) {
      return "can't set null to array.";
    }
    if (index < 0 || index >= size()) {
      return null;
    }
    else {
      String old = data[index];
      data[index] = value;
      return old;
    }
  }

  private void resize() {
    String[] extended = new String[size()*2];
    for (int i = 0; i < data.length; i++) {
      extended[i] = data[i];
    }
    data = extended;
  }

  public boolean contain(String target) {
    for (int i = 0; i < data.length; i++) {
      if (data[i].equals(target)) return true;
    }
    return false;
  }

  public int indexOf(String target) {
    for (int i = 0; i < data.length; i++) {
      if (data[i].equals(target)) return i;
    }
    return -1;
  }

  public int lastIndexOf(String target) {
    for (int i = data.length - 1; i >= 0; i--) {
      if (data[i].equals(target)) return i;
    }
    return -1;
  }

  public void add(int index, String word) {
    boolean pass = false;
    String[] w = new String[data.length + 1];
    if (index < 0 || index > size()) {
      System.out.print("Error, index out of range");
    }
    else {
      for (int i = 0; i <= data.length; i++) {
        if (pass) {
          w[i] = data[i-1];
        }
        if (i == index) {
          w[i] = word;
          pass = true;
        }
        else {
          w[i] = data[i];
        }
      }
    }
  }

}
