package com.library.management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
public class Book {
    @Id
    @NotBlank(message = "Book ID is mandatory")
    private String bookId;

    @NotBlank(message = "Title is mandatory")
    private String title;

    @NotBlank(message = "Author is mandatory")
    private String author;

    private String genre;
    private boolean isAvailable;
    
    

    

    

    








	public Book() {
		super();
	}








	public Book(@NotBlank(message = "Book ID is mandatory") String bookId,
			@NotBlank(message = "Title is mandatory") String title,
			@NotBlank(message = "Author is mandatory") String author, String genre, boolean isAvailable) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.isAvailable = isAvailable;
	}








	public String getBookId() {
		return bookId;
	}








	public void setBookId(String bookId) {
		this.bookId = bookId;
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








	public String getGenre() {
		return genre;
	}








	public void setGenre(String genre) {
		this.genre = genre;
	}








	public boolean isAvailable() {
		return isAvailable;
	}








	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}








	@Override
    public String toString() {
        String status = isAvailable ? "Available" : "Checked Out";
        return String.format("ID: %s, Title: %s, Author: %s, Genre: %s, Status: %s",
                bookId, title, author, genre, status);
    }
}