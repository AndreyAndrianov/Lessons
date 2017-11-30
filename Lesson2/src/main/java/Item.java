public class Item {
    private String id;
    private String name;
    private String description;
    private long created;
    private String comments;

    public Item() {

    }

    public Item(String name, String description, long created) {
        this(name, description, created, null);
    }

    public Item(String name, String description, long created, String comments) {
        this.name = name;
        this.description = description;
        this.created = created;
        this.comments = comments;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public long getCreated() {
        return this.created;
    }

    public String getComments() {
        return this.comments;
    }
}