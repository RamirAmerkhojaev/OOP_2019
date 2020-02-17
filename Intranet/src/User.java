import java.io.*;

public class User implements Serializable{

	private String login;
	private String password;
	private String id;
	private BufferedReader br;
	
	
	public User() {}
	
	public User(String id) {
		this.id = id;
	}
	
	public User(String login, String password, String id) {
		this.login = login;
		this.password = password;
		this.id = id;
	}

	public String getLogin() { return login;}

	public void setLogin(String login) { this.login = login;}

	public String getPassword() { return password;}

	public void setPassword(String password) { this.password = password;}

	public String getId() { return id;}

	public void setId(String id) { this.id = id;}
	
	@Override
	public String toString() {
		return "User [login=" + login + ", password=" + password + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
	
}
