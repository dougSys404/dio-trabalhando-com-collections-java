package exercises.set;

import java.util.Objects;

public class FavoriteLanguage implements Comparable<FavoriteLanguage> {

    private String name;
    private Integer creationYear;
    private String ide;

    public FavoriteLanguage(String name, Integer creationYear, String ide) {
        this.creationYear = creationYear;
        this.ide = ide;
        this.name = name;
    }

    public Integer getCreationYear() {
        return creationYear;
    }

    public String getIde() {
        return ide;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{" +
                "creationYear=" + creationYear +
                ", name='" + name + '\'' +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FavoriteLanguage that = (FavoriteLanguage) o;
        return Objects.equals(name, that.name) && Objects.equals(creationYear, that.creationYear) && Objects.equals(ide, that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, creationYear, ide);
    }

    @Override
    public int compareTo(FavoriteLanguage o) {
        return this.name.compareTo(o.getName());
    }
}
