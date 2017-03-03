databaseChangeLog = {

    changeSet(author: "miguelangel.garcia (generated)", id: "1488541193003-1") {
        createTable(tableName: "author") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "authorPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "miguelangel.garcia (generated)", id: "1488541193003-2") {
        createTable(tableName: "book") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "bookPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "author_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "title", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "miguelangel.garcia (generated)", id: "1488541193003-3") {
        addForeignKeyConstraint(baseColumnNames: "author_id", baseTableName: "book", constraintName: "FKklnrv3weler2ftkweewlky958", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "author")
    }
}
