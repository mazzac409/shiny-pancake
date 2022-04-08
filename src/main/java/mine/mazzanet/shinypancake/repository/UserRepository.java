package mine.mazzanet.shinypancake.repository;

import mine.mazzanet.shinypancake.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
