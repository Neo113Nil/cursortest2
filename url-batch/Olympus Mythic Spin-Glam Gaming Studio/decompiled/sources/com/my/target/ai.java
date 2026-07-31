package com.my.target;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.my.target.yh;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes8.dex */
public final class ai implements yh {
    private final SQLiteDatabase a;
    private final SQLiteStatement b;
    private final SQLiteStatement c;
    private final SQLiteStatement d;
    private final yb e = new yb();

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static final class a implements yh.a {
        private final Cursor a;
        private final yb b;

        protected a(Cursor cursor, yb ybVar) {
            this.a = cursor;
            this.b = ybVar;
        }

        @Override // com.my.target.yh.a
        public bi a() {
            return new bi(this.a.getLong(0), this.a.getString(1), this.a.getLong(2), this.b.a(this.a.getString(3)));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.a.close();
        }

        @Override // com.my.target.yh.a
        public boolean moveToNext() {
            return this.a.moveToNext();
        }
    }

    public ai(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
        this.b = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_stat_send(url, timestampMs, deadlineMs, monitoring) VALUES (?, ?, ?, ?)");
        this.c = sQLiteDatabase.compileStatement("DELETE FROM table_stat_send WHERE id=?");
        this.d = sQLiteDatabase.compileStatement("DELETE FROM table_stat_send WHERE deadlineMs <= ?");
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_stat_send( id INTEGER PRIMARY KEY AUTOINCREMENT, url TEXT NOT NULL, timestampMs INTEGER(8) NOT NULL, deadlineMs INTEGER(8) NOT NULL, monitoring TEXT NOT NULL)");
        } catch (Throwable th) {
            mi.a("StatSend: create table statSender error, " + th);
        }
    }

    @Override // com.my.target.yh
    public void b(long j) {
        try {
            this.c.bindLong(1, j);
            this.c.executeUpdateDelete();
        } catch (Throwable th) {
            try {
                mi.a("DB deleteInfo error: " + th);
            } finally {
                this.c.clearBindings();
            }
        }
    }

    @Override // com.my.target.yh
    public void a(String str, long j, long j2, vh vhVar) {
        try {
            String a2 = this.e.a(vhVar);
            this.b.bindString(1, str);
            this.b.bindLong(2, j);
            this.b.bindLong(3, j2);
            this.b.bindString(4, a2);
            this.b.executeInsert();
        } catch (Throwable th) {
            try {
                mi.a("DB insertStat error: " + th);
            } finally {
                this.b.clearBindings();
            }
        }
    }

    @Override // com.my.target.yh
    public void a(long j) {
        try {
            this.d.bindLong(1, j);
            this.d.executeUpdateDelete();
        } catch (Throwable th) {
            try {
                mi.a("DB deleteOldStats error: " + th);
            } finally {
                this.d.clearBindings();
            }
        }
    }

    @Override // com.my.target.yh
    public yh.a a() {
        try {
            return new a(this.a.rawQuery("SELECT id, url, timestampMs, monitoring  FROM table_stat_send", null), this.e);
        } catch (Throwable th) {
            mi.a("DB getStatsToSendIterator error: " + th);
            throw th;
        }
    }
}
