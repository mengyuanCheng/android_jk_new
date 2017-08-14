package com.hlct.android.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.hlct.android.bean.Detail;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DETAIL".
*/
public class DetailDao extends AbstractDao<Detail, Long> {

    public static final String TABLENAME = "DETAIL";

    /**
     * Properties of entity Detail.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property DetailId = new Property(0, Long.class, "detailId", true, "_id");
        public final static Property PlanId = new Property(1, Long.class, "planId", false, "PLAN_ID");
        public final static Property InventroryName = new Property(2, String.class, "inventroryName", false, "INVENTRORY_NAME");
        public final static Property InventoryState = new Property(3, String.class, "inventoryState", false, "INVENTORY_STATE");
        public final static Property InventoryTime = new Property(4, String.class, "inventoryTime", false, "INVENTORY_TIME");
        public final static Property PropertyId = new Property(5, Long.class, "propertyId", false, "PROPERTY_ID");
        public final static Property PropertyName = new Property(6, String.class, "propertyName", false, "PROPERTY_NAME");
        public final static Property PropertyRfid = new Property(7, String.class, "propertyRfid", false, "PROPERTY_RFID");
        public final static Property UserId = new Property(8, Long.class, "userId", false, "USER_ID");
        public final static Property Remark = new Property(9, String.class, "remark", false, "REMARK");
        public final static Property DepartmentID = new Property(10, Long.class, "departmentID", false, "DEPARTMENT_ID");
    }


    public DetailDao(DaoConfig config) {
        super(config);
    }
    
    public DetailDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DETAIL\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: detailId
                "\"PLAN_ID\" INTEGER," + // 1: planId
                "\"INVENTRORY_NAME\" TEXT," + // 2: inventroryName
                "\"INVENTORY_STATE\" TEXT," + // 3: inventoryState
                "\"INVENTORY_TIME\" TEXT," + // 4: inventoryTime
                "\"PROPERTY_ID\" INTEGER," + // 5: propertyId
                "\"PROPERTY_NAME\" TEXT," + // 6: propertyName
                "\"PROPERTY_RFID\" TEXT," + // 7: propertyRfid
                "\"USER_ID\" INTEGER," + // 8: userId
                "\"REMARK\" TEXT," + // 9: remark
                "\"DEPARTMENT_ID\" INTEGER);"); // 10: departmentID
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DETAIL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Detail entity) {
        stmt.clearBindings();
 
        Long detailId = entity.getDetailId();
        if (detailId != null) {
            stmt.bindLong(1, detailId);
        }
 
        Long planId = entity.getPlanId();
        if (planId != null) {
            stmt.bindLong(2, planId);
        }
 
        String inventroryName = entity.getInventroryName();
        if (inventroryName != null) {
            stmt.bindString(3, inventroryName);
        }
 
        String inventoryState = entity.getInventoryState();
        if (inventoryState != null) {
            stmt.bindString(4, inventoryState);
        }
 
        String inventoryTime = entity.getInventoryTime();
        if (inventoryTime != null) {
            stmt.bindString(5, inventoryTime);
        }
 
        Long propertyId = entity.getPropertyId();
        if (propertyId != null) {
            stmt.bindLong(6, propertyId);
        }
 
        String propertyName = entity.getPropertyName();
        if (propertyName != null) {
            stmt.bindString(7, propertyName);
        }
 
        String propertyRfid = entity.getPropertyRfid();
        if (propertyRfid != null) {
            stmt.bindString(8, propertyRfid);
        }
 
        Long userId = entity.getUserId();
        if (userId != null) {
            stmt.bindLong(9, userId);
        }
 
        String remark = entity.getRemark();
        if (remark != null) {
            stmt.bindString(10, remark);
        }
 
        Long departmentID = entity.getDepartmentID();
        if (departmentID != null) {
            stmt.bindLong(11, departmentID);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Detail entity) {
        stmt.clearBindings();
 
        Long detailId = entity.getDetailId();
        if (detailId != null) {
            stmt.bindLong(1, detailId);
        }
 
        Long planId = entity.getPlanId();
        if (planId != null) {
            stmt.bindLong(2, planId);
        }
 
        String inventroryName = entity.getInventroryName();
        if (inventroryName != null) {
            stmt.bindString(3, inventroryName);
        }
 
        String inventoryState = entity.getInventoryState();
        if (inventoryState != null) {
            stmt.bindString(4, inventoryState);
        }
 
        String inventoryTime = entity.getInventoryTime();
        if (inventoryTime != null) {
            stmt.bindString(5, inventoryTime);
        }
 
        Long propertyId = entity.getPropertyId();
        if (propertyId != null) {
            stmt.bindLong(6, propertyId);
        }
 
        String propertyName = entity.getPropertyName();
        if (propertyName != null) {
            stmt.bindString(7, propertyName);
        }
 
        String propertyRfid = entity.getPropertyRfid();
        if (propertyRfid != null) {
            stmt.bindString(8, propertyRfid);
        }
 
        Long userId = entity.getUserId();
        if (userId != null) {
            stmt.bindLong(9, userId);
        }
 
        String remark = entity.getRemark();
        if (remark != null) {
            stmt.bindString(10, remark);
        }
 
        Long departmentID = entity.getDepartmentID();
        if (departmentID != null) {
            stmt.bindLong(11, departmentID);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Detail readEntity(Cursor cursor, int offset) {
        Detail entity = new Detail( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // detailId
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // planId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // inventroryName
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // inventoryState
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // inventoryTime
            cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5), // propertyId
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // propertyName
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // propertyRfid
            cursor.isNull(offset + 8) ? null : cursor.getLong(offset + 8), // userId
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // remark
            cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10) // departmentID
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Detail entity, int offset) {
        entity.setDetailId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setPlanId(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setInventroryName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setInventoryState(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setInventoryTime(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setPropertyId(cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5));
        entity.setPropertyName(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setPropertyRfid(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setUserId(cursor.isNull(offset + 8) ? null : cursor.getLong(offset + 8));
        entity.setRemark(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setDepartmentID(cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Detail entity, long rowId) {
        entity.setDetailId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Detail entity) {
        if(entity != null) {
            return entity.getDetailId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Detail entity) {
        return entity.getDetailId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
