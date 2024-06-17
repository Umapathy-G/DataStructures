import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomImmutable {

	public static void main(String[] args) throws Exception {

		Map<String, String> map = new HashMap<>();
		map.put("hobby", "playing games");

		List<String> phone = new ArrayList<>();
		phone.add("12345");

		List<Employee> employee = new ArrayList<>();
		employee.add(new Employee("Ram", 13, new Address("Chennai", "TN"), phone, map));

//		employee.get(0).getAddress().setCity("Cuddalore");
//		
//		System.out.println(employee);

		employee.stream().filter(e -> {
			try {
				return e.getAge()==12 && e.getAddress().getCity().equals("Chennai");
			} catch (CloneNotSupportedException e1) {
				e1.printStackTrace();
			}
			return false;
		}).forEach(System.out::print);

	}

}
