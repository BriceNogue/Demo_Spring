package Demo.Spring.Demo.Spring.controller;

import Demo.Spring.Demo.Spring.modele.Artwork;
import Demo.Spring.Demo.Spring.service.ArtworkService;
import Demo.Spring.Demo.Spring.service.ArtworkServiceInt;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/artwork")
@AllArgsConstructor
public class ArtworkControler {

    private final ArtworkService artworkServcie;

    @PostMapping("/createArtwork")
    public Artwork createArtwork(@RequestBody Artwork artwork) {
        return artworkServcie.createArtwork(artwork);
    }

    @GetMapping("/artworks")
    public List<Artwork> getArtworks() {
        return artworkServcie.getArtworks();
    }
}
