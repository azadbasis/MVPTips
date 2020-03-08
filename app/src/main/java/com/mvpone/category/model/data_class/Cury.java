
package com.mvpone.category.model.data_class;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cury implements Serializable, Parcelable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("templated")
    @Expose
    private Boolean templated;
    public final static Creator<Cury> CREATOR = new Creator<Cury>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Cury createFromParcel(Parcel in) {
            return new Cury(in);
        }

        public Cury[] newArray(int size) {
            return (new Cury[size]);
        }

    }
    ;
    private final static long serialVersionUID = -5794574333575418787L;

    protected Cury(Parcel in) {
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.href = ((String) in.readValue((String.class.getClassLoader())));
        this.templated = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
    }

    public Cury() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Boolean getTemplated() {
        return templated;
    }

    public void setTemplated(Boolean templated) {
        this.templated = templated;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(name);
        dest.writeValue(href);
        dest.writeValue(templated);
    }

    public int describeContents() {
        return  0;
    }

}
