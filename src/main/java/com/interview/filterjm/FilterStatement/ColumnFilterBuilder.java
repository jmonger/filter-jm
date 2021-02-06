package com.interview.filterjm.FilterStatement;

public interface ColumnFilterBuilder {

    public ColumnFilterBuilder addFirstNameColumn();

    public ColumnFilterBuilder addSurNameColumn();

    public ColumnFilterBuilder addAgeColumn();

    public ColumnFilterBuilder addRoleColumn();

    public ColumnFilter build();

}
