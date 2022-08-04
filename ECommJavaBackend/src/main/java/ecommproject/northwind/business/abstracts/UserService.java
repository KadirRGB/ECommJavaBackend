package ecommproject.northwind.business.abstracts;

import ecommproject.northwind.core.entities.User;
import ecommproject.northwind.core.utilities.results.DataResult;
import ecommproject.northwind.core.utilities.results.Result;

public interface UserService {
	Result add(User user);
	DataResult<User> findByEmail(String email);
}
