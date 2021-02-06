package com.interview.filterjm.FilterStatement;

public class ColumnFilter {
    String columnStmt = "";

    private ColumnFilter(String columnStmt) {
        this.columnStmt = columnStmt;
    }

    public static class ColumnFilterBuilderImpl implements ColumnFilterBuilder {

        String columnStmt = "*";

        @Override
        public ColumnFilterBuilder addFirstNameColumn() {
            if (columnStmt != "*") {
                columnStmt.concat(", " + "firstname");
            } else {
                columnStmt = "firstname";
            }
            return this;
        }

        @Override
        public ColumnFilterBuilder addSurNameColumn() {
            if (columnStmt != "*") {
                columnStmt.concat(", " + "surname");
            } else {
                columnStmt = "surname";
            }
            return this;
        }

        @Override
        public ColumnFilterBuilder addAgeColumn() {
            if (columnStmt != "*") {
                columnStmt.concat(", " + "age");
            } else {
                columnStmt = "age";
            }
            return this;        }

        @Override
        public ColumnFilterBuilder addRoleColumn() {
            if (columnStmt != "*") {
                columnStmt.concat(", " + "role");
            } else {
                columnStmt = "role";
            }
            return this;
        }

        @Override
        public ColumnFilter build() {
            return new ColumnFilter(columnStmt);
        }
    }

}
