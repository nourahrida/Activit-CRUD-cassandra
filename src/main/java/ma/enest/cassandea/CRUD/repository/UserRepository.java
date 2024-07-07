package ma.enest.cassandea.CRUD.repository;

import ma.enest.cassandea.CRUD.model.User;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface UserRepository extends CassandraRepository<User, UUID> {

}
