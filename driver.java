public class driver {
  public static void main(String[] args) {

    System.out.print("\n\n\n\n");

    /**************************************************************************/

    SuperArray SA = new SuperArray(15);
    System.out.println("Created an empty SuperArray \"SA\" with capacity 15\n\n");

    /**************************************************************************/

    System.out.println("SA's status:                       " + SA.toStringDebug());
    System.out.println("SA is empty (should return true):  " + SA.isEmpty());
    System.out.println("SA's size:                         " + SA.size());

    /**************************************************************************/

    SA.add(0,"Muse");
    SA.add(1,"505");
    SA.add(2,"Radiohead");
    SA.add(3,"Haken");
    //SA.add(5, "Genesis");     //Comment in this line to check to see if it throws an error
    System.out.println("\nAdded \"Muse\", \"505\", \"Radiohead\", \"Haken\" to SA");
    System.out.println("SA's current value':               " + SA.toString());
    System.out.println("Value with nulls:                  " + SA.toStringDebug() + "\n\n");
    System.out.println("SA is empty (should return false): " + SA.isEmpty());

    /**************************************************************************/

    SA.set(1, "42");
    System.out.println("Setting SA[1] to \"42\"...");
    System.out.println("\n");
    System.out.println("Checking set value:                " + SA.get(1) + "\n\n");

    System.out.println("Trying to set a value an index that is out of bounds");
    //SA.set(4,"Celestial Elixir is the best song"); //Comment in this line to check to see if it throws an error

    /**************************************************************************/

    for (int i = SA.size(); i < 15; i++) {
      SA.add("" + i);
    }
    System.out.println("Filling empty slots of SA with integers...");
    System.out.println("Full status of SA:                 " + SA.toStringDebug() + "\n");
    System.out.println("Adding \"Dream Theater\" to SA to test resize...");
    SA.add("Dream Theater");
    System.out.println("SA (capacity should have doubled + 1): " + SA.toStringDebug() + "\n\n");

    /**************************************************************************/

    System.out.println("Checking SA for \"Muse\":      " + SA.contains("Muse"));
    System.out.println("This should return true!");
    System.out.println("Checking SA for \"Kendrick Lamar\"    " + SA.contains("Kendrick Lamar"));
    System.out.println("This should return false!\n\n");
    System.out.println("Trying to get a value at an index that is out of bounds");
    //SA.get(35);                       //Comment in this line to check to see if it throws an error

    /**************************************************************************/

    SA.add(5, "Thank You Scientist");
    System.out.println("Adding \"Thank You Scientist\" to index 5...");
    System.out.println("SA status:                         " + SA.toString());
    SA.remove(6);
    System.out.println("\nRemoving the number \"5\" from index 6...");
    System.out.println("SA status:                         " + SA.toString());
    SA.remove("42");
    System.out.println("\nRemoving the number \"42\" from SA...");
    System.out.println("SA status:                         " + SA.toString() + "\n\n");

    System.out.println("\nTrying to remove an index that is out of bounds");
    //SA.remove(35);  //Comment in this line to check to see if it throws an error

    SA.set(5,"MGMT");
    System.out.println("Setting \"MGMT\" to index 5...");
    System.out.println("SA status:                         " + SA.toString());
    SA.set(10,"MGMT");
    System.out.println("Setting \"MGMT\" to index 10...");
    System.out.println("SA status:                         " + SA.toString());
    System.out.println("Checking SA for first index of \"MGMT\":                       " + SA.indexOf("MGMT"));
    System.out.println("Checking SA for last index of \"MGMT\":                       " + SA.lastIndexOf("MGMT"));

    System.out.println("Clearing SA");
    SA.clear();
    System.out.println(SA.toString());

    System.out.println("Testing new constructor's throw (should return error message): ");
    SuperArray SA1 = new SuperArray(-2);

    System.out.println("Testing get's catch(should give an error): ");
    System.out.println(SA.get(-2));

  }
}
