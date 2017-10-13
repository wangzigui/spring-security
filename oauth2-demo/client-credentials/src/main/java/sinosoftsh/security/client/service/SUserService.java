package sinosoftsh.security.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sinosoftsh.security.client.dao.SUserRepository;
import sinosoftsh.security.client.entity.SUser;

import java.util.List;

@Service
public class SUserService {


    @Autowired
    private SUserRepository suserRepository;//code10



    public List<SUser> findAll() {

        return suserRepository.findAll();

    }

    public SUser create(SUser user) {
        return suserRepository.save(user);

    }


    public SUser findUserById(int id) {
        return suserRepository.findOne(id);

    }

    public SUser login(String email, String password) {
        return suserRepository.findByEmailAndPassword(email, password);

    }


    public SUser update(SUser user) {
        return suserRepository.save(user);

    }

    public void deleteUser(int id) {
        suserRepository.delete(id);
    }


    public SUser findUserByEmail(String email) {
        return suserRepository.findUserByEmail(email);

    }


}
