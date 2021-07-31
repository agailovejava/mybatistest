package org.example.domian;

import java.util.List;

/**部长类*/
public class Minister {
    private int mid;
    private String mname;
    private int  crountryid;
    private List<Country> countries;

    public Minister() {
    }

    public Minister(int mid, String mname, int crountryid, List<Country> countries) {
        this.mid = mid;
        this.mname = mname;
        this.crountryid = crountryid;
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "Minister{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", crountryid=" + crountryid +
                ", countries=" + countries +
                '}';
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public int getCrountryid() {
        return crountryid;
    }

    public void setCrountryid(int crountryid) {
        this.crountryid = crountryid;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }
}
