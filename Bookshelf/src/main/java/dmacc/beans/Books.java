package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	public String title;
	public String author;
	public String genre;
	public String rating;
	

	public Books() {
		super();
	}

	public Books(String title) {
		super();
		this.title = title;
	}

	public Books(String title, String author, String genre) {
		super();
		this.title = title;
		this.author = author;
		this.genre = genre;
	}

	public Books(long id, String title, String author, String genre) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.genre = genre;
	}

	public Books(long id, String title, String author, String genre, String rating) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.rating = rating;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String gettitle() {
		return title;
	}

	public void settitle(String title) {
		this.title = title;
	}

	public String getauthor() {
		return author;
	}

	public void setauthor(String author) {
		this.author = author;
	}

	public String getgenre() {
		return genre;
	}

	public void setgenre(String genre) {
		this.genre = genre;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Books [id=" + id + ", title=" + title + ", author=" + author + ", genre=" + genre + ", rating=" + rating
				+ "]";
	}

	

	
	
}
