package books;

public class Shelf {
    String color = "белый";
    Book[] books; // книги на полке

    public Shelf(int BooksCount) { // количество мест кинг на полку
        if (BooksCount <= 0) {
            throw new IllegalArgumentException("BooksCount должно быть больше 0");
        }
            books = new Book[BooksCount];

    }
    // метод добавления книги на полку
    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++){ // перебираем массив книг на полке
            if (books[i] == null){ // если эллемент = null
                books[i] = book; // значит в массив можно передать ссылку на книгу
                System.out.println("Книга добавлена");
                return; // и прервать метод чтобы ссылка не заполнила весь массив
            }
        }
        System.out.println("Не хватило места на полке");
    }
}
