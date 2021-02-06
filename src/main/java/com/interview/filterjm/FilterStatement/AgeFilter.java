package com.interview.filterjm.FilterStatement;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class AgeFilter {
    String ageStmt;

    private AgeFilter(String ageStmt) {
        this.ageStmt = ageStmt;
    }

    public static class AgeFilterBuilderImpl implements AgeFilterBuilder {
        private Map<String,String> ageMap = new LinkedHashMap<String,String>();
        private String greaterThanStmt = "age > ";
        private String lessThanStmt = "age < ";

        @Override
        public AgeFilterBuilder greaterThanAge(Integer age) {
            this.ageMap.put("greaterThan", greaterThanStmt + age);
            return this;
        }

        @Override
        public AgeFilterBuilder lessThanAge(Integer age) {
            this.ageMap.put("lessThan", lessThanStmt +  age);
            return this;
        }

        @Override
        public AgeFilterBuilder ageRange(Integer min, Integer max) {
            this.ageMap.put("greaterThan", greaterThanStmt + min);
            this.ageMap.put("operator", "and");
            this.ageMap.put("lessThan", lessThanStmt +  max);
            return this;
        }

        @Override
        public AgeFilter build() {
            Set ageSet = ageMap.entrySet();
            Iterator ageIt = ageSet.iterator();
            String q = "";

            while(ageIt.hasNext()) {
                Map.Entry ageEntry = (Map.Entry)ageIt.next();
                q.concat((String) ageEntry.getValue() + " ");
            }


            return new AgeFilter(q);

        }
    }
}
