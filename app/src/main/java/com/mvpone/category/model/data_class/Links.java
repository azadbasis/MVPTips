
package com.mvpone.category.model.data_class;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mvpone.category.WpPostType;

public class Links implements Serializable, Parcelable
{

    @SerializedName("self")
    @Expose
    private List<Self> self = new ArrayList<Self>();
    @SerializedName("collection")
    @Expose
    private List<Collection> collection = new ArrayList<Collection>();
    @SerializedName("about")
    @Expose
    private List<About> about = new ArrayList<About>();
    @SerializedName("wp:post_type")
    @Expose
    private List<WpPostType> wpPostType = new ArrayList<WpPostType>();
    @SerializedName("curies")
    @Expose
    private List<Cury> curies = new ArrayList<Cury>();
    public final static Creator<Links> CREATOR = new Creator<Links>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Links createFromParcel(Parcel in) {
            return new Links(in);
        }

        public Links[] newArray(int size) {
            return (new Links[size]);
        }

    }
    ;
    private final static long serialVersionUID = 8717312186863003741L;

    protected Links(Parcel in) {
        in.readList(this.self, (Self.class.getClassLoader()));
        in.readList(this.collection, (Collection.class.getClassLoader()));
        in.readList(this.about, (About.class.getClassLoader()));
        in.readList(this.wpPostType, (WpPostType.class.getClassLoader()));
        in.readList(this.curies, (Cury.class.getClassLoader()));
    }

    public Links() {
    }

    public List<Self> getSelf() {
        return self;
    }

    public void setSelf(List<Self> self) {
        this.self = self;
    }

    public List<Collection> getCollection() {
        return collection;
    }

    public void setCollection(List<Collection> collection) {
        this.collection = collection;
    }

    public List<About> getAbout() {
        return about;
    }

    public void setAbout(List<About> about) {
        this.about = about;
    }

    public List<WpPostType> getWpPostType() {
        return wpPostType;
    }

    public void setWpPostType(List<WpPostType> wpPostType) {
        this.wpPostType = wpPostType;
    }

    public List<Cury> getCuries() {
        return curies;
    }

    public void setCuries(List<Cury> curies) {
        this.curies = curies;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(self);
        dest.writeList(collection);
        dest.writeList(about);
        dest.writeList(wpPostType);
        dest.writeList(curies);
    }

    public int describeContents() {
        return  0;
    }

}
