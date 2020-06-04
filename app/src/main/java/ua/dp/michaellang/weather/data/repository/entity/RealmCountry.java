package ua.dp.michaellang.weather.data.repository.entity;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;


public class RealmCountry extends RealmObject {
    @PrimaryKey
    private String id;
    private String localizedName;
    private String englishName;

    public RealmCountry() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public void setLocalizedName(String localizedName) {
        this.localizedName = localizedName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }
}
