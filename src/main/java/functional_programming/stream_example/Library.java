package src.functional_programming.stream_example;


import java.util.ArrayList;

public class Library {

	public static void main(String[] args) {
		ArrayList<Book> books = populateLibrary();

//        collection.stream(): return an empty sequential stream
//        stream<T> filter(Predicate <? super T predicate> : return a stream consisting of elements of this stream that matches the given predicate.
//        void forEach(Consumer<? super T> action): Performs an action for each element of this stream.

        books.parallelStream()
                .filter((book) -> book.getAuthor().startsWith("A"))
                .filter((book) -> book.getTitle().endsWith(""))

                .forEach((book) -> System.out.println(book));


	}

	static ArrayList<Book> populateLibrary() {
		ArrayList<Book> books = new ArrayList<>();

		books.add(new Book("Alice Walker", "The Color Purple"));
        books.add(new Book("Alice Walker", "Meridian"));
        books.add(new Book("Toni Morrison", "Beloved"));
        books.add(new Book("Toni Morrison", "Jazz"));
        books.add(new Book("Toni Morrison", "Paradise"));
        books.add(new Book("John Steinbeck", "The Grapes of Wrath"));
        books.add(new Book("John Steinbeck", "East of Eden"));
        books.add(new Book("Kazuo Ishiguro", "The Remains of the Day"));
        books.add(new Book("Kazuo Ishiguro", "Never Let Me Go"));
        books.add(new Book("Kazuo Ishiguro", "The Buried Giant"));
        books.add(new Book("Jane Austen", "Pride and Prejudice"));
        books.add(new Book("Jane Austen", "Emma"));
        books.add(new Book("Jane Austen", "Persuasion"));
        books.add(new Book("Jane Austen", "Mansfield Park"));
        books.add(new Book("Chinua Achebe", "Things Fall Apart"));
        books.add(new Book("Chinua Achebe", "No Longer at Ease"));
        books.add(new Book("Chinua Achebe", "Home and Exile"));
        return books;
	}

}
