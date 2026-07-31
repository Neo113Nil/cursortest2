package sg.bigo.ads.av;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.k;

/* loaded from: classes6.dex */
public abstract class d {
    public long a;
    public boolean b;
    public int c;
    public long d;
    public String e;
    public long f;
    public long g;
    public Map<String, String> h;

    public d(Cursor cursor) {
        this.a = -1L;
        this.b = false;
        this.c = 0;
        this.d = 0L;
        this.e = "";
        this.a = cursor.getLong(cursor.getColumnIndex("_id"));
        try {
            this.h = k.a(new JSONObject(cursor.getString(cursor.getColumnIndex("ad_data"))));
        } catch (JSONException unused) {
        }
        a(cursor.getString(cursor.getColumnIndex("tracker_imp")));
        b(cursor.getString(cursor.getColumnIndex("tracker_cli")));
        c(cursor.getString(cursor.getColumnIndex("tracker_nurl")));
        d(cursor.getString(cursor.getColumnIndex("tracker_lurl")));
        this.c = cursor.getInt(cursor.getColumnIndex("tracker_type"));
        this.d = cursor.getLong(cursor.getColumnIndex("last_retry_ts"));
        this.e = cursor.getString(cursor.getColumnIndex("ext"));
        this.f = cursor.getLong(cursor.getColumnIndex("ctime"));
        this.g = cursor.getLong(cursor.getColumnIndex("mtime"));
        this.b = true;
    }

    public d(@NonNull Map<String, String> map) {
        this.a = -1L;
        this.b = false;
        this.c = 0;
        this.d = 0L;
        this.e = "";
        long currentTimeMillis = System.currentTimeMillis();
        this.h = map;
        this.f = currentTimeMillis;
        this.g = currentTimeMillis;
    }

    @NonNull
    public final String a() {
        Map<String, String> map = this.h;
        if (map == null) {
            return "";
        }
        if ((map instanceof HashMap) && map != null) {
            map.remove(null);
            map.values().removeAll(Collections.singleton(null));
        }
        return new JSONObject(this.h).toString();
    }

    protected abstract void a(String str);

    @NonNull
    public abstract String b();

    protected abstract void b(String str);

    @NonNull
    public abstract String c();

    protected abstract void c(String str);

    @NonNull
    public abstract String d();

    protected abstract void d(String str);

    @NonNull
    public abstract String e();

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != d.class) {
            return false;
        }
        long j = this.a;
        return j >= 0 && j == ((d) obj).a;
    }

    public long f() {
        return 0L;
    }

    @NonNull
    public String toString() {
        return "mId = " + this.a;
    }
}
