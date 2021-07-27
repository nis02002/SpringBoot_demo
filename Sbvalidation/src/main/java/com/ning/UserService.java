package com.ning;

import java.util.List;



public interface UserService {
	User createUser(User user);

	User updateUser(User user);

	List<User> getAllUser();

	User getUserById(long userId);

	void deleteUser(long id);
}
