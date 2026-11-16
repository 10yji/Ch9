public class Longest {
    public static void main(String[] args) {
    String longest = args[0];
    for (int i = 0; i<args.length; i++){
		if (args[i].length()>args[0].length()){
			longest = args[i];
		}
	}
	int a = 0;
	for (int i = 0; i<args.length; i++){
		int diff = args[i].compareTo(args[a]);
		if(diff<0){
			a=i;
		}
	}
	System.out.println("First alphabetically: "+ args[a]);
	System.out.println("Longest: " + longest);
    
    
    }
    }
