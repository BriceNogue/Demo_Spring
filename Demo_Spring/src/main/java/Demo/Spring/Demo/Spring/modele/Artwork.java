package Demo.Spring.Demo.Spring.modele;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.*;


@Entity
@Table(name = "Artwork")
@Getter
@Setter
@NoArgsConstructor
public class Artwork {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int artworkId;
    @Column(nullable = false)
    private String artworkName;
    @Column(nullable = true)
    private String artworkImage;
    @Column(nullable = false)
    private String descrip;
    @Column(nullable = false)
    private int categoryId;
    @Column(nullable = false)
    private int typeId;
    @Column(nullable = true)
    private int likes;

    private Date createdDate;

    public Artwork(int artworkId, String artworkName, String artworkImage, String descrip, int categoryId, int typeId) {
        this.artworkId = artworkId;
        this.artworkName = artworkName;
        this.artworkImage = artworkImage;
        this.descrip = descrip;
        this.categoryId = categoryId;
        this.typeId = typeId;
        this.likes = 0;
        this.createdDate = new Date();
    }

    public int getArtworkId() {
        return artworkId;
    }

    public void setArtworkId(int artworkId) {
        this.artworkId = artworkId;
    }

    public String getArtworkName() {
        return artworkName;
    }

    public void setArtworkName(String artworkName) {
        this.artworkName = artworkName;
    }

    public String getArtworkImage() {
        return artworkImage;
    }

    public void setArtworkImage(String artworkImage) {
        this.artworkImage = artworkImage;
    }

    public String getDescription() {
        return descrip;
    }

    public void setDescription(String description) {
        this.descrip = descrip;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getLike() {
        return likes;
    }

    public void setLike(int like) {
        this.likes = like;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
