package com.interview.filterjm.FilterStatement;

public class ExcludeFilter {

    private String excludeStmt;

    private ExcludeFilter(String excludeStmt) {
        this.excludeStmt = excludeStmt;
    }

    public static class  ExcludeFilterBuilder {
        private String excludeStmt ="";

        public ExcludeFilterBuilder matchFirstName(String firstName) {
            if (excludeStmt != "") {
                this.excludeStmt = "firstname not equal" + firstName;
            } else {
                this.excludeStmt+= " and firstname not equal " + firstName;
            }
            return this;
        }

        public ExcludeFilterBuilder matchSurName(String surName) {
            if (excludeStmt != "") {
                this.excludeStmt = "surname=" + surName;
            } else {
                this.excludeStmt+= " and surname not equal " + surName;
            }
            return this;
        }

        public ExcludeFilterBuilder matchRole(String role) {
            if (excludeStmt != "") {
                this.excludeStmt = "role=" + role;
            } else {
                this.excludeStmt+= " and role not equal " + role;
            }
            return this;
        }

        public ExcludeFilterBuilder matchAge(Integer age) {
            if (excludeStmt != "") {
                this.excludeStmt = "age=" + age;
            } else {
                this.excludeStmt+= " and age not equal" + age;
            }
            return this;
        }

        public ExcludeFilter build() {
            return new ExcludeFilter(excludeStmt);
        }
    }

}
