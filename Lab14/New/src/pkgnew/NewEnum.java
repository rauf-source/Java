/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew;

/**
 *
 * @author Admin
 */
public enum NewEnum {
    DRAKE("started from the bottom", 2011),
    EMINEM("Lose yourself in the music", 2002);
    
    private final String title;
    private final int year;

    private NewEnum(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "NewEnum{" + "title=" + title + ", year=" + year + '}';
    }
    
    
}
