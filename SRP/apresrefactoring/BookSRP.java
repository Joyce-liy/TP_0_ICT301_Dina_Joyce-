public class BookSRP{
    private String title;
    private String author;
    private String content;

    public BookSRP(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }
    
  
}

class BookPrinter{
    public void printtoscreen(BookSRP book){
        System.out.println("===print to screen===");
        System.out.println("Titre: " + book.getTitle());
        System.out.println("Auteur: " + book.getAuthor());
        System.out.println("Contenu: " + book.getContent());
    }
    public void printToHTML(BookSRP book){
        System.out.println("\n===print to HTML===");
        System.out.println("<h1>" + book.getTitle() + "</h1>");
        System.out.println("<h2>par " + book.getAuthor() + "</h2>"); 
        System.out.println("<p>" + book.getContent() + "</p>"); 
    }
}

class BookSaver{
    public void saveToDatabase(BookSRP book){
        System.out.println("\nSauvegarde de " + book.getTitle() + " en base de données."); 
    }
    public void saveToFile(BookSRP book, String filename){
        System.out.println("\nSauvegarde de " + book.getTitle() + " dans " + filename);
    }
}

class BookBusinessLogic{
    public void emprunter(BookSRP book, String lecteur){
        System.out.println("\nEmprunt du livre " + book.getTitle() + " par " + lecteur);
    }
    public void autreService(BookSRP book){
        System.out.println("\nAutre logique metier sur le livre " + book.getTitle());
    }
}

class Main {
    public static void main(String[] args) {
        BookSRP livre = new BookSRP("Les principes solid", "Etudiants de M1-Gl", "Revision des principes SOLID");
        BookPrinter printer = new BookPrinter();
        BookSaver saver = new BookSaver();
        BookBusinessLogic business = new BookBusinessLogic();
        printer.printtoscreen(livre);
        saver.saveToDatabase(livre);  
        business.emprunter(livre, "Marcial"); 
        printer.printToHTML(livre); 
    }
}