package Demo.Spring.Demo.Spring.service;

import Demo.Spring.Demo.Spring.modele.Artwork;
import Demo.Spring.Demo.Spring.repository.ArtworkRepositoryInt;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ArtworkService implements ArtworkServiceInt{

    private final ArtworkRepositoryInt artworkRepositoryInt;


    @Override
    public Artwork createArtwork(Artwork artwork) {
        return this.artworkRepositoryInt.save(artwork);
    }

    @Override
    public List<Artwork> getArtworks() {
        return this.artworkRepositoryInt.findAll();
    }
}
