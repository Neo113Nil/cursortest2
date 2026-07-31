package yads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.share.internal.ShareConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class hd0 {
    public static final String d;
    public static final String[] e;
    public final t33 a;
    public final Object b = new Object();
    public boolean c;

    static {
        int[] iArr = {3, 4};
        StringBuilder sb = new StringBuilder("state IN (");
        for (int i = 0; i < 2; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(iArr[i]);
        }
        sb.append(')');
        d = sb.toString();
        e = new String[]{"id", "mime_type", ShareConstants.MEDIA_URI, "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};
    }

    public hd0(t33 t33Var) {
        this.a = t33Var;
    }

    public final void a(tj0 tj0Var) {
        a();
        try {
            a(tj0Var, this.a.getWritableDatabase());
        } catch (Throwable th) {
            throw new w30(th);
        }
    }

    public final tj0 b(String str) {
        a();
        try {
            Cursor a = a("id = ?", new String[]{str});
            try {
                if (a.getCount() == 0) {
                    a.close();
                    return null;
                }
                a.moveToNext();
                tj0 a2 = a(a);
                a.close();
                return a2;
            } finally {
            }
        } catch (SQLiteException e2) {
            throw new w30(e2);
        }
    }

    public final void c() {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, null, null);
        } catch (Throwable th) {
            throw new w30(th);
        }
    }

    public final void a(int i, String str) {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i));
            this.a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, d + " AND id = ?", new String[]{str});
        } catch (Throwable th) {
            throw new w30(th);
        }
    }

    public final void a() {
        synchronized (this.b) {
            if (this.c) {
                return;
            }
            try {
                int a = be3.a(this.a.getReadableDatabase(), 0, "");
                if (a != 3) {
                    SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        be3.a(writableDatabase, 0, "", 3);
                        ArrayList a2 = a == 2 ? a(writableDatabase) : new ArrayList();
                        writableDatabase.execSQL("DROP TABLE IF EXISTS ExoPlayerDownloads");
                        writableDatabase.execSQL("CREATE TABLE ExoPlayerDownloads (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        Iterator it = a2.iterator();
                        while (it.hasNext()) {
                            a((tj0) it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                this.c = true;
            } catch (Throwable th2) {
                throw new w30(th2);
            }
        }
    }

    public final void b() {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, "state = 2", null);
        } catch (Throwable th) {
            throw new w30(th);
        }
    }

    public static tj0 b(Cursor cursor) {
        String str;
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri parse = Uri.parse(string2);
        String string3 = cursor.getString(1);
        if ("dash".equals(string3)) {
            str = "application/dash+xml";
        } else if ("hls".equals(string3)) {
            str = "application/x-mpegURL";
        } else if ("ss".equals(string3)) {
            str = "application/vnd.ms-sstr+xml";
        } else {
            str = "video/x-unknown";
        }
        ck0 ck0Var = new ck0(string, parse, str, a(cursor.getString(3)), null, cursor.getString(4), cursor.getBlob(5));
        ak0 ak0Var = new ak0();
        ak0Var.a = cursor.getLong(13);
        ak0Var.b = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new tj0(ck0Var, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, ak0Var);
    }

    public final void a(tj0 tj0Var, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = tj0Var.a.f;
        if (bArr == null) {
            bArr = sb3.f;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", tj0Var.a.b);
        contentValues.put("mime_type", tj0Var.a.d);
        contentValues.put(ShareConstants.MEDIA_URI, tj0Var.a.c.toString());
        List list = tj0Var.a.e;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            g43 g43Var = (g43) list.get(i);
            sb.append(g43Var.b);
            sb.append('.');
            sb.append(g43Var.c);
            sb.append('.');
            sb.append(g43Var.d);
            sb.append(',');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        contentValues.put("stream_keys", sb.toString());
        contentValues.put("custom_cache_key", tj0Var.a.g);
        contentValues.put("data", tj0Var.a.h);
        contentValues.put("state", Integer.valueOf(tj0Var.b));
        contentValues.put("start_time_ms", Long.valueOf(tj0Var.c));
        contentValues.put("update_time_ms", Long.valueOf(tj0Var.d));
        contentValues.put("content_length", Long.valueOf(tj0Var.e));
        contentValues.put("stop_reason", Integer.valueOf(tj0Var.f));
        contentValues.put("failure_reason", Integer.valueOf(tj0Var.g));
        contentValues.put("percent_downloaded", Float.valueOf(tj0Var.h.b));
        contentValues.put("bytes_downloaded", Long.valueOf(tj0Var.h.a));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow("ExoPlayerDownloads", null, contentValues);
    }

    public static ArrayList a(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!sb3.a(sQLiteDatabase, "ExoPlayerDownloads")) {
            return arrayList;
        }
        Cursor query = sQLiteDatabase.query("ExoPlayerDownloads", new String[]{"id", "title", ShareConstants.MEDIA_URI, "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(b(query));
            } finally {
            }
        }
        query.close();
        return arrayList;
    }

    public final Cursor a(String str, String[] strArr) {
        try {
            return this.a.getReadableDatabase().query("ExoPlayerDownloads", e, str, strArr, null, null, "start_time_ms ASC");
        } catch (Throwable th) {
            throw new w30(th);
        }
    }

    public static tj0 a(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri parse = Uri.parse(string2);
        String string3 = cursor.getString(1);
        ArrayList a = a(cursor.getString(3));
        if (blob.length <= 0) {
            blob = null;
        }
        ck0 ck0Var = new ck0(string, parse, string3, a, blob, cursor.getString(4), cursor.getBlob(5));
        ak0 ak0Var = new ak0();
        ak0Var.a = cursor.getLong(13);
        ak0Var.b = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new tj0(ck0Var, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, ak0Var);
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        int i = sb3.a;
        for (String str2 : str.split(StringUtils.COMMA, -1)) {
            String[] split = str2.split("\\.", -1);
            if (split.length == 3) {
                arrayList.add(new g43(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2])));
            } else {
                throw new IllegalStateException();
            }
        }
        return arrayList;
    }
}
