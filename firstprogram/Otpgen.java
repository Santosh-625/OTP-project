package firstprogram;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Otpgen implements Otp {
	long otp;

	@Override
	public long otpGeneration() throws InterruptedException {

		long l;
		while (true) {
			Thread.sleep(5000);
			l = Long.valueOf(new DecimalFormat("000000").format(new Random().nextInt(999999)));
			otp = l;
			
			return l;
			
		}

	}

	@Override
	public Boolean otpValidation(long otp) {
		System.out.println(otp);
		System.out.println("please enter your otp");

		Scanner sc = new Scanner(System.in);
		long compare = sc.nextLong();

		if (compare == otp) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println(new Otpgen().otpValidation(new Otpgen().otpGeneration()));

	}

}
