package Demo.Spring.Demo.Spring.service;

import Demo.Spring.Demo.Spring.modele.Artwork;

import java.util.*;

public interface ArtworkServiceInt {

    Artwork createArtwork(Artwork artwork);

    List<Artwork> getArtworks();
}
