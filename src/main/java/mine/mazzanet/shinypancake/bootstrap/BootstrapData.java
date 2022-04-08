package mine.mazzanet.shinypancake.bootstrap;

import mine.mazzanet.shinypancake.domain.Org;
import mine.mazzanet.shinypancake.domain.User;
import mine.mazzanet.shinypancake.repository.OrgRepository;
import mine.mazzanet.shinypancake.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by chrismazza on 4/2/22
 **/

@Component
public class BootstrapData implements CommandLineRunner {

    private final OrgRepository orgRepository;
    private final UserRepository userRepository;

    public BootstrapData(OrgRepository organizationRepository, UserRepository userRepository) {
        this.orgRepository = organizationRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Org wonka = new Org();
        wonka.setName(("Wonka Chocolate Factory"));

        orgRepository.save(wonka);

        Org cadburry = new Org();
        cadburry.setName("Cadburry");

        orgRepository.save(cadburry);

        User user = new User();
        user.setFirstName("Willy");
        user.setLastName("Wonka");
        user.setEmailAddress("willy@wonka.choco");
        user.setCity("Munich");
        user.setCountryCode("DE");
        user.getOrgs().add(wonka);
        user.getOrgs().add(cadburry);

        userRepository.save(user);

    }
}
