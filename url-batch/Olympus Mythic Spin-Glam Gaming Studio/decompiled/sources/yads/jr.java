package yads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class jr {
    public static final String[] c = {"name", "length", "last_touch_timestamp"};
    public final kn0 a;
    public String b;

    public jr(kn0 kn0Var) {
        this.a = kn0Var;
    }

    public final void a(long j) {
        try {
            String hexString = Long.toHexString(j);
            this.b = "ExoPlayerCacheFileMetadata" + hexString;
            if (be3.a(this.a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    be3.a(writableDatabase, 2, hexString, 1);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.b);
                    writableDatabase.execSQL("CREATE TABLE " + this.b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
        } catch (Throwable th2) {
            throw new w30(th2);
        }
    }

    public final void a(String str, long j, long j2) {
        this.b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.b, null, contentValues);
        } catch (Throwable th) {
            throw new w30(th);
        }
    }

    public final void a(Set set) {
        this.b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.b, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            throw new w30(th2);
        }
    }

    public final HashMap a() {
        try {
            this.b.getClass();
            Cursor query = this.a.getReadableDatabase().query(this.b, c, null, null, null, null, null);
            try {
                HashMap hashMap = new HashMap(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(0);
                    string.getClass();
                    hashMap.put(string, new ir(query.getLong(1), query.getLong(2)));
                }
                query.close();
                return hashMap;
            } finally {
            }
        } catch (Throwable th) {
            throw new w30(th);
        }
    }
}
