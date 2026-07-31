package com.ironsource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public class C4 extends SQLiteOpenHelper implements E7 {
    private static C4 f = null;
    private static final String g = " TEXT";
    private static final String h = " INTEGER";
    private static final String i = ",";
    private final D4 a;
    private final int b;
    private final int c;
    private final String d;
    private final String e;

    static abstract class a implements BaseColumns {
        public static final String a = "events";
        public static final int b = 4;
        public static final String c = "eventid";
        public static final String d = "timestamp";
        public static final String e = "type";
        public static final String f = "data";

        a() {
        }
    }

    public C4(Context context, String str, int i2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i2);
        this.a = new D4();
        this.b = 4;
        this.c = 400;
        this.d = "DROP TABLE IF EXISTS events";
        this.e = "CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )";
    }

    public static synchronized C4 a(Context context, String str, int i2) {
        C4 c4;
        synchronized (C4.class) {
            try {
                if (f == null) {
                    f = new C4(context, str, i2);
                }
                c4 = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r1.isOpen() != false) goto L20;
     */
    @Override // com.ironsource.E7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void b(String str) {
        SQLiteDatabase sQLiteDatabase;
        String[] strArr = {str};
        try {
            sQLiteDatabase = a(true);
            try {
                sQLiteDatabase.delete("events", "type = ?", strArr);
            } catch (Throwable th) {
                th = th;
                try {
                    C4782n4.d().a(th);
                    Log.e("IronSource", "Exception while clearing events: ", th);
                } finally {
                    if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                        sQLiteDatabase.close();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        onCreate(sQLiteDatabase);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0037, code lost:
    
        if (r0.isOpen() != false) goto L31;
     */
    @Override // com.ironsource.E7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void a(List<C4966x5> list, String str) {
        SQLiteDatabase sQLiteDatabase;
        if (list != null) {
            if (!list.isEmpty()) {
                SQLiteDatabase sQLiteDatabase2 = null;
                try {
                    sQLiteDatabase = a(true);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    Iterator<C4966x5> it = list.iterator();
                    while (it.hasNext()) {
                        ContentValues a2 = a(it.next(), str);
                        if (sQLiteDatabase != null && a2 != null) {
                            sQLiteDatabase.insert("events", null, a2);
                        }
                    }
                    if (sQLiteDatabase != null) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase2 = sQLiteDatabase;
                    try {
                        C4782n4.d().a(th);
                        Log.e("IronSource", "Exception while saving events: ", th);
                        if (sQLiteDatabase2 != null && sQLiteDatabase2.isOpen()) {
                            sQLiteDatabase = sQLiteDatabase2;
                            sQLiteDatabase.close();
                        }
                    } catch (Throwable th3) {
                        if (sQLiteDatabase2 != null && sQLiteDatabase2.isOpen()) {
                            sQLiteDatabase2.close();
                        }
                        throw th3;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0075, code lost:
    
        if (r1.isOpen() != false) goto L42;
     */
    @Override // com.ironsource.E7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized ArrayList<C4966x5> a(String str) {
        ArrayList<C4966x5> arrayList;
        SQLiteDatabase sQLiteDatabase;
        try {
            arrayList = new ArrayList<>();
            Cursor cursor = null;
            try {
                sQLiteDatabase = a(false);
                try {
                    cursor = sQLiteDatabase.query("events", null, "type = ?", new String[]{str}, null, null, "timestamp ASC");
                    if (cursor.getCount() > 0) {
                        cursor.moveToFirst();
                        while (!cursor.isAfterLast()) {
                            int columnIndex = cursor.getColumnIndex("eventid");
                            if (columnIndex >= 0) {
                                int i2 = cursor.getInt(columnIndex);
                                int columnIndex2 = cursor.getColumnIndex("timestamp");
                                if (columnIndex2 >= 0) {
                                    long j = cursor.getLong(columnIndex2);
                                    int columnIndex3 = cursor.getColumnIndex("data");
                                    if (columnIndex3 >= 0) {
                                        arrayList.add(new C4966x5(i2, j, cursor.getString(columnIndex3)));
                                        cursor.moveToNext();
                                    }
                                }
                            }
                        }
                        cursor.close();
                    }
                    if (!cursor.isClosed()) {
                        cursor.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        C4782n4.d().a(th);
                        Log.e("IronSource", "Exception while loading events: ", th);
                        return arrayList;
                    } finally {
                        if (cursor != null && !cursor.isClosed()) {
                            cursor.close();
                        }
                        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                            sQLiteDatabase.close();
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = null;
            }
        } finally {
        }
        return arrayList;
    }

    private ContentValues a(C4966x5 c4966x5, String str) {
        if (c4966x5 == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues(4);
        contentValues.put("eventid", Integer.valueOf(c4966x5.c()));
        contentValues.put("timestamp", Long.valueOf(c4966x5.d()));
        contentValues.put("type", str);
        contentValues.put("data", c4966x5.a());
        return contentValues;
    }

    private synchronized SQLiteDatabase a(boolean z) throws Throwable {
        int i2 = 0;
        while (true) {
            try {
                if (z) {
                    return this.a.a(true, this);
                }
                return this.a.a(false, this);
            } finally {
            }
        }
    }
}
