package phm.chassiplataforma.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import phm.chassiplataforma.entities.Users;
import phm.chassiplataforma.repository.UsersRepository;

import java.util.UUID;

@Service
@AllArgsConstructor
public class UserService {
    private UsersRepository usersRepository;

    public Users createNewUser(Users users) throws Exception {
        verifyUserExists(users.getMail());
        users.setUuid(UUID.randomUUID());
        users.setStatus(Boolean.TRUE);
        return usersRepository.save(users);
    }

    private void verifyUserExists(String mail) throws Exception {
        var user = usersRepository.findByMail(mail);
        if(user.isPresent()){
            throw new Exception("this user exists");
        }
    }
}
