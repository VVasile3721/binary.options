package math;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitCmd {

  //(^\".*\"$)|(\\S+)
  //("(.+?)(?<![^\\]\\)")|\S+
  private static final Pattern SPLIT_PARAMS_PATTERN = Pattern.compile("\"([^\"]*)\"|(\\S+)");

  public static void main(String... args) {
    splitGitCommand();
  }

  public static void splitGitCommand() {
    String cmd = "git add \"`let it crash`.md\"";
    List<String> list = split(cmd);
    for (String c : list) {
      System.out.println(c);
    }
  }

  private static List<String> split(String command) {
    return splitterOnTokens(SPLIT_PARAMS_PATTERN, command);
  }

  private static List<String> splitterOnTokens(Pattern pattern, String command) {
    Matcher m = pattern.matcher(command);
    ArrayList<String> result = new ArrayList<>();
    while (m.find()) {
      if (m.group(1) != null) {
        result.add("\"" + m.group(1) + "\"");
      } else {
        result.add(m.group(2));
      }
    }
    return result;
  }
}
