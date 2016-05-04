package com.shijia.entity;

/**
 * @author by jiuru on 16/5/4.
 */
public class Twitter {

    private Long id;

    private String title;

    private String bigimg;

    private String desc;

    private String extra;

    private Long created;

    private Long updated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBigimg() {
        return bigimg;
    }

    public void setBigimg(String bigimg) {
        this.bigimg = bigimg;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "Twitter{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", bigimg='" + bigimg + '\'' +
                ", desc='" + desc + '\'' +
                ", extra='" + extra + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
