import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeRegex {
   public static void digits(String source){
      Pattern pattern = Pattern.compile("\\d(\\.\\d+)?");
      Matcher matcher = pattern.matcher(source);
      double sum = 0;
      while (matcher.find()){
         System.out.println(matcher.group());
         sum += Double.parseDouble(matcher.group());
      }
      System.out.println(sum);
   }
}
