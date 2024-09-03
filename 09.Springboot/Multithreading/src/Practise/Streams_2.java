package Practise;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

import static java.lang.Math.min;

public class Streams_2 {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("JayeJksjdksjd", "HariHhlsdsldk", "Pooj", "dfg", "Wadhwani");
        List<String> ans = l.stream().map(s->s.substring(0, min(5, s.length()))).filter(s->s.charAt(0) == s.charAt(s.length()-1)).collect(Collectors.toList());
        System.out.println(ans);
    }
}
