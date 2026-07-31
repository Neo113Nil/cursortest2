package sg.bigo.ads.av;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes6.dex */
public class a {
    public long a;
    public String b;
    public long c;
    public long d;
    public String e;
    public long f;
    public long g;

    public a(Cursor cursor) {
        this.a = -1L;
        this.a = cursor.getLong(cursor.getColumnIndex("_id"));
        this.b = cursor.getString(cursor.getColumnIndex("res_file_name"));
        this.c = cursor.getLong(cursor.getColumnIndex("res_delete_millis"));
        this.d = cursor.getLong(cursor.getColumnIndex("sdk_init_millis"));
        this.e = cursor.getString(cursor.getColumnIndex("ext"));
        this.f = cursor.getLong(cursor.getColumnIndex("ctime"));
        this.g = cursor.getLong(cursor.getColumnIndex("mtime"));
    }

    public a(String str, long j, long j2) {
        this.a = -1L;
        long currentTimeMillis = System.currentTimeMillis();
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = "";
        this.f = currentTimeMillis;
        this.g = currentTimeMillis;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != a.class) {
            return false;
        }
        long j = this.a;
        return j >= 0 && j == ((a) obj).a;
    }

    @NonNull
    public String toString() {
        return "mId = " + this.a + ",mFileName=" + this.b + ",mSdkInitMillis:" + this.d + ",mDeleteMillis:" + this.c;
    }
}
