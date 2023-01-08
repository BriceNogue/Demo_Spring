package Demo.Spring.Demo.Spring.repository;

import Demo.Spring.Demo.Spring.modele.Artwork;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtworkRepositoryInt extends JpaRepository<Artwork, Long> {
}
