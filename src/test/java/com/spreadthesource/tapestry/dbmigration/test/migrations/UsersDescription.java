package com.spreadthesource.tapestry.dbmigration.test.migrations;

import org.hibernate.Hibernate;

import com.spreadthesource.tapestry.dbmigration.annotations.Version;
import com.spreadthesource.tapestry.dbmigration.data.Table;
import com.spreadthesource.tapestry.dbmigration.migrations.MigrationBase;
import com.spreadthesource.tapestry.dbmigration.services.MigrationHelper;

@Version(20100510)
public class UsersDescription extends MigrationBase
{
    public UsersDescription(MigrationHelper helper)
    {
        super(helper);
    }

    public void up()
    {
        Table users = new Table("users");
        users.addColumn("description", Hibernate.TEXT);
        
        createTable(users);
    }

    public void down()
    {

    }

}