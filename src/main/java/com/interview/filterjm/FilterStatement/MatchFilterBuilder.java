package com.interview.filterjm.FilterStatement;

public interface MatchFilterBuilder {

    public MatchFilterBuilder matchFirstName(String firstName);

    public MatchFilterBuilder matchSurName(String surName);

    public MatchFilterBuilder matchRole(String role);

    public MatchFilterBuilder matchAge(Integer age);

    public MatchFilter build();
}
