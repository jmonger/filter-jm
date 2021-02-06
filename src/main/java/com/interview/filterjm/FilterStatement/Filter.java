package com.interview.filterjm.FilterStatement;

import java.util.List;

public class Filter {
    private String query = "";

    public static class FilterBuilder {
        private List<String> columns;
        private String firstName;
        private String surName;
        private String role;
        private Integer age;

        public FilterBuilder(List<String> columns) {
            this.columns = columns;
        }



    }






}
