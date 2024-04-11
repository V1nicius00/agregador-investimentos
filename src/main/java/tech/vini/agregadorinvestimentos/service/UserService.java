package tech.vini.agregadorinvestimentos.service;

import org.springframework.stereotype.Service;
import tech.vini.agregadorinvestimentos.dto.user.CreateUserDto;
import tech.vini.agregadorinvestimentos.entity.User;
import tech.vini.agregadorinvestimentos.repository.UserRepository;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UUID createUser(CreateUserDto createUserDto){
        var entity = new User(
                UUID.randomUUID(),
                createUserDto.username(),
                createUserDto.email(),
                createUserDto.password(),
                null,
                null);

        var userSaved = userRepository.save(entity);
        return userSaved.getUserId();
    }

    public Optional<User> getUserById(String userId){
        return userRepository.findById(UUID.fromString(userId));
    }
}
