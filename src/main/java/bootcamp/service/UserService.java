package bootcamp.service;

import bootcamp.domain.model.User;

public interface UserService {
   
    User findById(Long id);

    User create(User userToCreate);
}
