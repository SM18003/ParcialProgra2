package parcial1_;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Validacion {
private Pattern pattern;
private Matcher matcher;

private static final  String PASSWORD_REGEX =
        "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,10})";
public Validacion(){
    pattern = Pattern.compile(PASSWORD_REGEX);
}
public boolean validar(String NewPass){
matcher = pattern.matcher(NewPass);
return matcher.matches();
}
        
}
