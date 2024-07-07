package ma.enest.cassandea.CRUD.model;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table("users")
@NoArgsConstructor
@AllArgsConstructor@Getter@Setter@ToString
public class User {
    @PrimaryKey
    private UUID id;
    private String name;
    private String email;
}
