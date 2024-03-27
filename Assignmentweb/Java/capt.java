import java.util.Random;
public class capt{
    public static String generateCaptcha(int length) {
      String captchaChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder captchaText = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(captchaChars.length());
            captchaText.append(captchaChars.charAt(index));
        }
        return captchaText.toString();
    }
    public static void main(String[] args) {
        Random random = new Random();
        int captchaLength = random.nextInt(3) + 4;
        String captcha = generateCaptcha(captchaLength);
        System.out.println("Captcha length : " + captcha.length());
	System.out.println("\nCaptcha Text: " + captcha);
    }
    }
