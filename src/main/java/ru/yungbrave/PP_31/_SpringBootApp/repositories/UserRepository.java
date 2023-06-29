package ru.yungbrave.PP_31._SpringBootApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.yungbrave.PP_31._SpringBootApp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
