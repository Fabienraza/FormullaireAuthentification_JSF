package dao;

import model.User;

public interface IUserDAO {
	public int addUser(User user);
	public User findUser(User user);
}
