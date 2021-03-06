package com.hlct.android.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.hlct.android.bean.InventorySurplus;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "INVENTORY_SURPLUS".
*/
public class InventorySurplusDao extends AbstractDao<InventorySurplus, Void> {

    public static final String TABLENAME = "INVENTORY_SURPLUS";

    /**
     * Properties of entity InventorySurplus.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property AssertId = new Property(0, long.class, "assertId", false, "ASSERT_ID");
        public final static Property PlanId = new Property(1, long.class, "planId", false, "PLAN_ID");
    }


    public InventorySurplusDao(DaoConfig config) {
        super(config);
    }
    
    public InventorySurplusDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"INVENTORY_SURPLUS\" (" + //
                "\"ASSERT_ID\" INTEGER NOT NULL ," + // 0: assertId
                "\"PLAN_ID\" INTEGER NOT NULL );"); // 1: planId
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"INVENTORY_SURPLUS\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, InventorySurplus entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getAssertId());
        stmt.bindLong(2, entity.getPlanId());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, InventorySurplus entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getAssertId());
        stmt.bindLong(2, entity.getPlanId());
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public InventorySurplus readEntity(Cursor cursor, int offset) {
        InventorySurplus entity = new InventorySurplus( //
            cursor.getLong(offset + 0), // assertId
            cursor.getLong(offset + 1) // planId
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, InventorySurplus entity, int offset) {
        entity.setAssertId(cursor.getLong(offset + 0));
        entity.setPlanId(cursor.getLong(offset + 1));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(InventorySurplus entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(InventorySurplus entity) {
        return null;
    }

    @Override
    public boolean hasKey(InventorySurplus entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
