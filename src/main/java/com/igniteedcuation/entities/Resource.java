package com.igniteedcuation.entities;

import com.igniteedcuation.enums.ResourceType;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_resource")
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private Integer resourcePosition;

    private String imgUri;

    private ResourceType resourceType;

    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;

    // ASSOCIAÇÃO 1 RESOURCE PARA * SECTIONS
    @OneToMany(mappedBy = "resource")
    private List<Section> sections = new ArrayList<>();

    public Resource() {
    }

    public Resource(Long id, String title, String description, Integer resourcePosition, String imgUri, ResourceType resourceType, Offer offer) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.resourcePosition = resourcePosition;
        this.imgUri = imgUri;
        this.resourceType = resourceType;
        this.offer = offer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPosition() {
        return resourcePosition;
    }

    public void setPosition(Integer position) {
        this.resourcePosition = position;
    }

    public String getImgUri() {
        return imgUri;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }

    public ResourceType getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resource resource = (Resource) o;
        return Objects.equals(id, resource.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
