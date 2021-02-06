package com.interview.filterjm.FilterStatement;

public interface AgeFilterBuilder {

    public AgeFilterBuilder greaterThanAge(Integer age);

    public AgeFilterBuilder lessThanAge(Integer age);

    public AgeFilterBuilder ageRange(Integer min, Integer max);

    public AgeFilter build();
}
