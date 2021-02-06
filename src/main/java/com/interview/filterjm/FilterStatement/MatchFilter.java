package com.interview.filterjm.FilterStatement;

public class MatchFilter {
    String matchStmt;

    private MatchFilter(String matchStmt) {
        this.matchStmt = matchStmt;
    }

    public static class MatchFilterBuilderImpl implements MatchFilterBuilder {

       private String matchStmt ="";

        @Override
        public MatchFilterBuilder matchFirstName(String firstName) {
            if (matchStmt != "") {
                this.matchStmt = "firstname=" + firstName;
            } else {
                this.matchStmt+= " and " + firstName;
            }
            return this;
        }

        @Override
        public MatchFilterBuilder matchSurName(String surName) {
            if (matchStmt != "") {
                this.matchStmt = "surname=" + surName;
            } else {
                this.matchStmt+= " and " + surName;
            }
            return this;
        }

        @Override
        public MatchFilterBuilder matchRole(String role) {
            if (matchStmt != "") {
                this.matchStmt = "role=" + role;
            } else {
                this.matchStmt+= " and " + role;
            }
            return this;
        }

        @Override
        public MatchFilterBuilder matchAge(Integer age) {
            if (matchStmt != "") {
                this.matchStmt = "age=" + age;
            } else {
                this.matchStmt+= " and " + age;
            }
            return this;
        }

        @Override
        public MatchFilter build() {
            return new MatchFilter(matchStmt);
        }
    }
}
