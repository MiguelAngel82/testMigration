package testmigration

class Author {

    String name
    static hasOne = [book: Book]

    static constraints = {
        book nullable:true
    }
}
