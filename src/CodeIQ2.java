import java.io.IOException;
import java.util.Scanner;

class CodeIQ2 {

    public static void main(String[] args) throws IOException {
    	Scanner in = new Scanner(System.in);
        in.nextLine();
    	String str = in.nextLine();
    	in.close();

    	int val1 = 0;
    	int val2 = 0;
    	int val3 = 0;

    	int count = 0;

    	for(int i = 0; i < str.length(); i++){

    		char c = str.charAt(i);

    		if(Character.isLowerCase(c)){
    			val1 += 2;
    			val2 += 10;
    			val3 += 2;
    		} else {
    			val1 += 8;
    			val2 += 2;
    			val3 += 2;
    		}

    	}

    	while (true) {
    		if (5 <= val1 && 6 <= val2 && 2 <= val3) {
    			count += 1;
    			val1 -= 5;
    			val2 -= 6;
    			val3 -= 2;
    		} else {
    			break;
    		}
    	}

    	System.out.println(count);
    }
}