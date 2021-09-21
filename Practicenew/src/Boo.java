
public class Boo{

	public static void main(String[] args) {

        int a= 40, b= 50;

        while (a <= b) {
            boolean flag = false;

            for(int i = 2; i <= a/2;i++) {
      
                if(a % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.print(a + " ");

            ++a;
        }
    
}

	}



