import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Employee {

	private final String name;
	private final int age;
	private final Address address;
	private final List<String> phoneNumbers;
	private final Map<String, String> metadata;

	public Employee(String name, int age, Address address, List<String> phoneNumbers, Map<String, String> metadata) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumbers = phoneNumbers;
		this.metadata = metadata;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() throws CloneNotSupportedException {
		return (Address) address.Clone();
	}

	public List<String> getPhoneNumbers() {
		return new ArrayList<>(phoneNumbers);
	}

	public Map<String, String> getMetadata() {
		return new HashMap<String, String>(metadata);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", address=" + address + ", phoneNumbers=" + phoneNumbers
				+ ", metadata=" + metadata + "]";
	}

}
