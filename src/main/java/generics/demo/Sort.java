package generics.demo;

public class Sort {
    String type, sortType;

    public Sort(String type, String sortType) {
        this.type = type;
        this.sortType = sortType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }
}
