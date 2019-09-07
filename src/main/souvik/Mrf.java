package souvik;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mrf implements Tyre {
	public void name(){
		System.out.println("tyre is MRF");
	}
}
