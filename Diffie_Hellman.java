import java.util.*;
class Diffie_Hellman
{
	public static void main(final String args[]) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter modulo(p)");
        final int p = sc.nextInt();
        System.out.println("Enter primitive root of " + p);
        final int g = sc.nextInt();
        System.out.println("Choose 1st secret no(Alice)");
        final int a = sc.nextInt();
        System.out.println("Choose 2nd secret no(BOB)");
        final int b = sc.nextInt();

        final int A = (int) Math.pow(g, a) % p;
        final int B = (int) Math.pow(g, b) % p;

        final int S_A = (int) Math.pow(B, a) % p;
        final int S_B = (int) Math.pow(A, b) % p;
		
		if(S_A==S_B)
		{
			System.out.println("ALice and Bob can communicate with each other!!!");
			System.out.println("They share a secret no = "+S_A);			
		}
		else
		{
			System.out.println("ALice and Bob cannot communicate with each other!!!");
		}
	}	
}
