package by.academy.lesson18;

import java.io.Closeable;
import java.io.Serializable;
import java.util.Objects;

public class CloseableCat implements Closeable, Serializable {

	private static final long serialVersionUID = 2L;

	private String nickname;
	private transient String password;

	public CloseableCat(String nickname, String password) {
		super();
		this.nickname = nickname;
		this.password = password;
	}

	@Override
	public void close() {
		System.out.println("cat is closing door");
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nickname, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CloseableCat other = (CloseableCat) obj;
		return Objects.equals(nickname, other.nickname) && Objects.equals(password, other.password);
	}

	@Override
	public String toString() {
		return "CloseableCat [nickname=" + nickname + ", password=" + password + "]";
	}

}
