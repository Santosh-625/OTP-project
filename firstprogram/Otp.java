package firstprogram;

public interface Otp {
	
	public long otpGeneration() throws InterruptedException;
	public Boolean otpValidation(long l);

}
