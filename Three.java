import java.util.*;
public class Three{
    public static void main(String[] args) {
            List<String> strings = Arrays.asList("aman", "rohit", "niraj", "ashish", "ketan");
            System.out.println(" Orginal"+strings);

            List<String> finalsRes=strings.stream().filter(s->s.length()>=4).map(x->x.toUpperCase()).collect(Collectors.toList());
            System.out.println(" Stream: "+finalsRes);


        
    }
}

