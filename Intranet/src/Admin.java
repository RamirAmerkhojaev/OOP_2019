import java.io.Serializable;

public class Admin extends Employee implements Serializable{

	private String name;
	
	public Admin() {
		super();
	}
	
	public Admin(String login, String password, String id, String name) {
		super(login, password, id);
		this.name = name;
	}
	
	public void addUser(User user) {
		Main.users.add(user);
	}
	
	public void removeUser(String id) {
		for(int i =0; i<Main.users.size(); i++) {
			if(Main.users.get(i).getId().contentEquals(id))
				Main.users.remove(Main.users.get(i));
		}
	}
	
	public void viewUsersInfo() {
		System.out.println(Main.users);
	}
	
	public void updateUserInfo(String password, String id) {
		for(int i =0; i<Main.users.size(); i++) {
			if(Main.users.get(i).getId().contentEquals(id)) {
				if(Main.users.get(i).getPassword().contentEquals(password)) {
					System.out.println("You can't change the same password");
				}else {
					Main.users.get(i).setPassword(password);
				}
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String actions() {
		
		String s = "";
		
		s += "1)Add user\n";
		s += "2)Update user's password\n";
		s += "3)View information about user\n";
		s += "4)Remove User\n";
		s += "0)Exit\n";
		
		return s;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Admin [name=" + name + "]";
	}
	
}
