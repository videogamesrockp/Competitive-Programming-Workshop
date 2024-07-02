import java.io.*;
import java.util.*;

public class io {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String string = r.readLine();
		StringTokenizer st = new StringTokenizer(r.readLine());
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		pw.println(num1 + num2);
		pw.println(string);
		pw.close();
	}
}
