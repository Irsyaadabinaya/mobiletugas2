package com.irsyaad.mobiletugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Parcel;
import android.os.Parcelable;

public class Person implements Parcelable {
    private String nama;
    private int umur;
    private String jenis;
    private String alamat;

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public String getJenis() {
        return jenis;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeInt(this.umur);
        dest.writeString(this.jenis);
        dest.writeString(this.alamat);
    }

    public Person() {
    }

    protected Person(Parcel in) {
        this.nama = in.readString();
        this.umur = in.readInt();
        this.jenis = in.readString();
        this.alamat = in.readString();
    }

    public static final Parcelable.Creator<Person> CREATOR = new Parcelable.Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel source) {
            return new Person(source);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };
}
