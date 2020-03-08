
package com.mvpone.category.model.data_class;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CategoryItem implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("taxonomy")
    @Expose
    private String taxonomy;
    @SerializedName("parent")
    @Expose
    private Integer parent;
    @SerializedName("meta")
    @Expose
    private List<Object> meta = new ArrayList<Object>();
    @SerializedName("_links")
    @Expose
    private Links links;
    public final static Creator<CategoryItem> CREATOR = new Creator<CategoryItem>() {


        @SuppressWarnings({
            "unchecked"
        })
        public CategoryItem createFromParcel(Parcel in) {
            return new CategoryItem(in);
        }

        public CategoryItem[] newArray(int size) {
            return (new CategoryItem[size]);
        }

    }
    ;
    private final static long serialVersionUID = -8133423167829935343L;

    protected CategoryItem(Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.count = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        this.link = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.slug = ((String) in.readValue((String.class.getClassLoader())));
        this.taxonomy = ((String) in.readValue((String.class.getClassLoader())));
        this.parent = ((Integer) in.readValue((Integer.class.getClassLoader())));
        in.readList(this.meta, (Object.class.getClassLoader()));
        this.links = ((Links) in.readValue((Links.class.getClassLoader())));
    }

    public CategoryItem() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTaxonomy() {
        return taxonomy;
    }

    public void setTaxonomy(String taxonomy) {
        this.taxonomy = taxonomy;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public List<Object> getMeta() {
        return meta;
    }

    public void setMeta(List<Object> meta) {
        this.meta = meta;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(count);
        dest.writeValue(description);
        dest.writeValue(link);
        dest.writeValue(name);
        dest.writeValue(slug);
        dest.writeValue(taxonomy);
        dest.writeValue(parent);
        dest.writeList(meta);
        dest.writeValue(links);
    }

    public int describeContents() {
        return  0;
    }

}
