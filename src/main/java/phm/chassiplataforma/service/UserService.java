package phm.chassiplataforma.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import phm.chassiplataforma.entities.Users;
import phm.chassiplataforma.entities.enums.StatusUser;
import phm.chassiplataforma.repository.UsersRepository;

import java.util.UUID;

@Service
@AllArgsConstructor
public class UserService {
    private UsersRepository usersRepository;

    public Users createNewUser(Users users) throws Exception {
        verifyUserExists(users.getMail());
        users.setUuid(UUID.randomUUID());
        users.setStatus(StatusUser.ATIVO);
        return usersRepository.save(users);
    }

    private void verifyUserExists(String mail) throws Exception {
        var user = usersRepository.findByMail(mail);
        if(user.isPresent()){
            throw new Exception("this user exists");
        }
    }

    public Boolean signIn(Users users){
        var user = usersRepository.findByMail(users.getMail());
        if(user.get().getMail().equals(users.getMail()) && user.get().getPassword().equals(users.getPassword())){
                return true;
        }
        return false;
    }
}
