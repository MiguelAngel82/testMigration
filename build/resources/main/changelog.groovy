databaseChangeLog = {

    changeSet(author: "miguelangel.garcia (generated)", id: "1488540370644-1") {
        createTable(tableName: "AUTHOR") {
            column(autoIncrement: "true", name: "ID", type: "BIGINT(19)") {
                constraints(primaryKey: "true", primaryKeyName: "CONSTRAINT_7")
            }

            column(name: "VERSION", type: "BIGINT(19)") {
                constraints(nullable: "false")
            }

            column(name: "NAME", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "miguelangel.garcia (generated)", id: "1488540370644-2") {
        createTable(tableName: "BOOK") {
            column(autoIncrement: "true", name: "ID", type: "BIGINT(19)") {
                constraints(primaryKey: "true", primaryKeyName: "CONSTRAINT_1")
            }

            column(name: "VERSION", type: "BIGINT(19)") {
                constraints(nullable: "false")
            }

            column(name: "TITLE", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }
}
