package net.service.book.beans;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import net.service.book.entity.Book;
import net.service.book.session.BookFacade;

@Named
@SessionScoped
public class BookController implements Serializable {

    @EJB
    BookFacade bookFacade;

    @Inject
    BookBean bookBean;

    public List<Book> getAll() {
        return bookFacade.findAll();
    }

    public int count() {
        return bookFacade.count();
    }

    public String add() {

        Book book = new Book();
        book.setTitle(bookBean.getTitle());
        book.setAuthor(bookBean.getAuthor());

        bookFacade.create(book);

        return "/index";
    }

    public String edit(Book book) {

        bookBean.setId(book.getId());
        bookBean.setTitle(book.getTitle());
        bookBean.setAuthor(book.getAuthor());

        return "pages/edit";
    }
    
    public String delete(Book book) {
        
        bookFacade.remove(book);
        
        return "/index";
    }

    public String save() {

        Book book = new Book();
        book.setId(bookBean.getId());
        book.setTitle(bookBean.getTitle());
        book.setAuthor(bookBean.getAuthor());

        bookFacade.edit(book);

        return "/index";
    }

}
