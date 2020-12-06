package concatination;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service
@Component
public class Target {

	public String doConcat(String s1, String s2) {
		System.out.println(s1 + " " + s2);
		return s1 + " " + s2;
	}
}
