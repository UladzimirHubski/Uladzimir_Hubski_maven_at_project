package pageobjects.objects;

import java.util.Objects;

public class Names {
    private String longname;
    private String shortname;
    private String partiallongname;
    private String partialshortname;

    public Names(String longname, String shortname, String partiallongname, String partialshortname) {
        this.longname = longname;
        this.shortname = shortname;
        this.partiallongname = partiallongname;
        this.partialshortname = partialshortname;
    }

    public String getLongname() {
        return longname;
    }

    public void setLongname(String longname) {
        this.longname = longname;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getPartiallongname() {
        return partiallongname;
    }

    public void setPartiallongname(String partiallongname) {
        this.partiallongname = partiallongname;
    }

    public String getPartialshortname() {
        return partialshortname;
    }

    public void setPartialshortname(String partialshortname) {
        this.partialshortname = partialshortname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Names names = (Names) o;
        return longname.equals(names.longname) && shortname.equals(names.shortname) && partiallongname.equals(names.partiallongname) && partialshortname.equals(names.partialshortname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(longname, shortname, partiallongname, partialshortname);
    }

    @Override
    public String toString() {
        return "Names{" +
                "longname='" + longname + '\'' +
                ", shortName='" + shortname + '\'' +
                ", partiallongmame='" + partiallongname + '\'' +
                ", partialshortname='" + partialshortname + '\'' +
                '}';
    }
}
