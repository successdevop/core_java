package magazine;

import java.util.ArrayList;

public class MagazineLibrary{
    private final ArrayList<Magazine> magazines;

    public MagazineLibrary(){
        this.magazines = new ArrayList<>();
    }

    public void setMagazine(int index, Magazine magazine){
        this.magazines.set(index, new Magazine(magazine));
    }

    public void addMagazine(Magazine magazine){
        this.magazines.add(new Magazine(magazine));
    }

    public Magazine getMagazine(int index){
        return new Magazine(this.magazines.get(index));
    }
}