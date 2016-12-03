package id.sch.smktelkom_mlg.learn.recycleview2.model;

import android.graphics.drawable.Drawable;

/**
 * Created by euiko on 12/2/16.
 */

public class Hotel {

    public String judul;
    public String deskripsi;
    public Drawable foto;

    public Hotel(String judul, String deskripsi, Drawable foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}
