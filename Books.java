
 class Books {
     private String isbn;
     private String title;
     private String version;
     private String edition;
     private String year_published;
     
     public Books(String isbn,String title,String version,String edition,String year_published){
         this.isbn=isbn;
         this.title=title;
         this.version=version;
         this.edition=edition;
         this.year_published=year_published;
     }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getYear_published() {
        return year_published;
    }

    public void setYear_published(String year_published) {
        this.year_published = year_published;
    }
    
}
