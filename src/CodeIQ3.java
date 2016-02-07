import java.io.IOException;
import java.util.Scanner;

class CodeIQ3 {

    public static void main(String[] args) throws IOException {

    	int max = 0;

    	// 入力データ
    	Scanner in = new Scanner(System.in);
    	String a = in.nextLine();
    	int size1 = Integer.parseInt(a.substring(0, 1));
    	int size2 = Integer.parseInt(a.substring(2, 3));

    	int mapData[][] = new int[size1][size2];

    	int cnt = 0;
    	while(in.hasNext()) {
    		String buf = in.nextLine();
    		for(int i = 0; i < buf.length(); i++) {
    			mapData[cnt][i] = Integer.parseInt(buf.substring(i, i+1));
    			// System.out.println(cnt + " " + i + " " + mapData[cnt][i]);

    			// 最大値の更新
    			if (max < mapData[cnt][i]) {
    				max = mapData[cnt][i];
    			}
    		}
    		cnt++;
    	}



    	in.close();

    	int count = 0;

    	System.out.println(count);
    }
}