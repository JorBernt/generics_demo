package generics.demo;

public class Sort {
    String type, sortType, rekkefolge;

    public Sort(String type, String sortTypel, String rekkefolge) {
        this.type = type;
        this.sortType = sortType;
        this.rekkefolge = rekkefolge;
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

    public String getRekkefolge() {
        return rekkefolge;
    }

    public void setRekkefolge(String rekkefolge) {
        this.rekkefolge = rekkefolge;
    }
}
