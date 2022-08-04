package ecommproject.northwind.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import ecommproject.northwind.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer>{
	User findByEmail(String email);
}
