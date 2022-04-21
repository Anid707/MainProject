package models;

public class Pet {
    private long id;
    private String name;
    private String[]photoUrls;
    private String status;
    private Category category;
    private Tag[]tags;

    public Pet(String name, String[] photoUrls, String status, Category category, Tag[] tags) {
        this.name = name;
        this.photoUrls = photoUrls;
        this.status = status;
        this.category = category;
        this.tags = tags;
    }

    public Pet() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(String[] photoUrls) {
        this.photoUrls = photoUrls;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Tag[] getTags() {
        return tags;
    }

    public void setTags(Tag[] tags) {
        this.tags = tags;
    }
}
