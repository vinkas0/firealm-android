package org.firealm.test;

import org.firealm.FirealmModel;
import org.firealm.FirealmProperty;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Vinoth on 27-5-16.
 */
public class Book extends RealmObject implements FirealmModel {

    @PrimaryKey
    private String id;

    private FirealmProperty property;

    @Override
    public FirealmProperty firealmProperty() {
        property = new FirealmProperty();
        property.setKey(getId());
        return property;
    }

    private String title;
    private String authorName;
    private float price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
