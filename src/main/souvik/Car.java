package souvik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Car {
@Autowired
public Tyre t;
public void show()
{
	System.out.println("Car name is BMW");
	t.name();
}
}
