
package net.service.book.beans;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class BookBean implements Serializable{
    
    private int id;
    private String title;
    private String author;
    private byte[] logotip;

    public BookBean() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public byte[] getLogotip() {
        return logotip;
    }

    public void setLogotip(byte[] logotip) {
        this.logotip = logotip;
    }
    
    
}
