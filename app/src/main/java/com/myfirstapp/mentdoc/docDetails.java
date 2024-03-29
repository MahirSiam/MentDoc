package com.myfirstapp.mentdoc;

import java.io.Serializable;

public class docDetails implements Serializable {
    String id;
    String name,post,timing,image;
    String slot1,slot2,slot3,slot4,slot5,slot6;
    String rating;

    public docDetails(String id, String name, String post, String timing, String image, String slot1, String slot2, String slot3, String slot4, String slot5, String slot6) {
        this.id = id;
        this.name = name;
        this.post = post;
        this.timing = timing;
        this.image = image;
        this.slot1 = slot1;
        this.slot2 = slot2;
        this.slot3 = slot3;
        this.slot4 = slot4;
        this.slot5 = slot5;
        this.slot6 = slot6;
    }

    public docDetails(String id, String name, String post, String timing, String image, String slot1, String slot2, String slot3, String slot4, String slot5, String slot6, String rating) {
        this.id = id;
        this.name = name;
        this.post = post;
        this.timing = timing;
        this.image = image;
        this.slot1 = slot1;
        this.slot2 = slot2;
        this.slot3 = slot3;
        this.slot4 = slot4;
        this.slot5 = slot5;
        this.slot6 = slot6;
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSlot1() {
        return slot1;
    }

    public void setSlot1(String slot1) {
        this.slot1 = slot1;
    }

    public String getSlot2() {
        return slot2;
    }

    public void setSlot2(String slot2) {
        this.slot2 = slot2;
    }

    public String getSlot3() {
        return slot3;
    }

    public void setSlot3(String slot3) {
        this.slot3 = slot3;
    }

    public String getSlot4() {
        return slot4;
    }

    public void setSlot4(String slot4) {
        this.slot4 = slot4;
    }

    public String getSlot5() {
        return slot5;
    }

    public void setSlot5(String slot5) {
        this.slot5 = slot5;
    }

    public String getSlot6() {
        return slot6;
    }

    public void setSlot6(String slot6) {
        this.slot6 = slot6;
    }

    public docDetails(String name, String post, String timing, String image) {
        this.name = name;
        this.post = post;
        this.timing = timing;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
