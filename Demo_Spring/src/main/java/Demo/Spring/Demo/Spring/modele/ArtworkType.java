package Demo.Spring.Demo.Spring.modele;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name ="ArtworkType")
@Getter
@Setter
@NoArgsConstructor
public class ArtworkType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int typeId;
    @Column(nullable = false, unique = true)
    private String typeName;
}
