public class driver{
	public static void main(String[] args){
		SuperArray beef = new SuperArray();
		/**phase 1 testing start*/
		System.out.println("Phase 1 testing, start!");

		//testing SuperArray initializing
		System.out.println("\n!!Testing SuperArray initializing!!");
		System.out.println("Testing toString(): should return []");
		System.out.println(beef);
		System.out.println("\nTesting toStringDebug(): should return [null, ... null]");
		System.out.println(beef.toStringDebug());

		//testing size()
		System.out.println("\n\n!!Testing size()!!");
		System.out.println("Testing size(): should return 0");
		System.out.println(beef.size());

		//testing add()
		System.out.println("\n\n!!Testing add()!!");
		System.out.println("Testing add() while empty: should return true");
		System.out.println(beef.add("red"));
		System.out.println("\nChecking add() and toString(): should return [red]");
		System.out.println(beef);
		beef.add("cow");
		System.out.println("\nChecking add() and toString(): should return [red, cow]");
		System.out.println(beef);
		for (int x = 0; x < 9; x++){
			beef.add("filler");
		}
		System.out.println("\n\nTesting add() while full: should return false");
		System.out.println(beef.add("full"));

		//testing clear()
		System.out.println("\n\n!!Testing clear()!!");
		System.out.println("Testing clear(): should return []");
		beef.clear();
		System.out.println(beef);
		System.out.println("\nTesting clear() and size(): should return 0");
		System.out.println(beef.size());
		System.out.println("\nTesting add(\"red\") after clear(): should return true");
		System.out.println(beef.add("red"));
		System.out.println("\nSeeing SuperArray: should be [red]");
		System.out.println(beef);
		beef.clear();

		//testing get()
		System.out.println("\n\n!!Testing get()!!");
		System.out.println("Testing get() while empty: should return null");
		System.out.println(beef.get(0));
		beef.add("red");
		beef.add("cow");
		beef.add("meat");
		System.out.println("\nTesting get() with indices 0-2 filled: should return values *check code*");
		System.out.println(beef.get(0));
		System.out.println(beef.get(1));
		System.out.println(beef.get(2));
		System.out.println("\nTesting get() for out of bounds: should return null");
		System.out.println(beef.get(-1));
		System.out.println(beef.get(10));

		//testing set()
		System.out.println("\n\n!!Testing set()!!");
		System.out.println("Using SuperArray from !!testing get()!!");
		System.out.println(beef);
		System.out.println("\nTesting set(0, \"blue\"): should return red");
		System.out.println(beef.set(0, "blue"));
		System.out.println("SuperArray should now be [blue, cow, meat]");
		System.out.println(beef);
		System.out.println("\nTesting set(1, \"fish\"): should return cow");
		System.out.println(beef.set(1, "fish"));
		System.out.println("SuperArray should now be [blue, fish, meat]");
		System.out.println(beef);
		System.out.println("\nTesting set(2, \"vegetal\"): should return meat");
		System.out.println(beef.set(2, "vegetal"));
		System.out.println("SuperArray should now be [blue, fish, vegetal]");
		System.out.println(beef);
		System.out.println("\nUsing empty SuperArray ");
		beef.clear();
		System.out.println("\nTesting set(2, \"vegetal\"): should return null");
		System.out.println(beef.set(2, "vegetal"));
		System.out.println("SuperArray should now be []");
		System.out.println(beef);
		/** phase 1 testing end*/
	}
}
