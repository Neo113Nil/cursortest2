package androidx.room;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.football.transfertrivia.db.AppDatabase_Impl;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f1691m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    public final AppDatabase_Impl f1692a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1693b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1694c;
    public final String[] d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f1695e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f1696f;

    /* renamed from: g, reason: collision with root package name */
    public volatile j0.e f1697g;
    public final m h;
    public final n.f i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f1698j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f1699k;

    /* renamed from: l, reason: collision with root package name */
    public final Q.b f1700l;

    public o(AppDatabase_Impl appDatabase_Impl, HashMap hashMap, HashMap hashMap2, String... strArr) {
        String str;
        this.f1692a = appDatabase_Impl;
        this.f1693b = hashMap;
        this.h = new m(strArr.length);
        g1.f.d(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.i = new n.f();
        this.f1698j = new Object();
        this.f1699k = new Object();
        this.f1694c = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale locale = Locale.US;
            g1.f.d(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            g1.f.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f1694c.put(lowerCase, Integer.valueOf(i));
            String str3 = (String) this.f1693b.get(strArr[i]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                g1.f.d(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.d = strArr2;
        for (Map.Entry entry : this.f1693b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            g1.f.d(locale2, "US");
            String lowerCase2 = str4.toLowerCase(locale2);
            g1.f.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f1694c.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                g1.f.d(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f1694c;
                g1.f.e(linkedHashMap, "<this>");
                Object obj = linkedHashMap.get(lowerCase2);
                if (obj == null && !linkedHashMap.containsKey(lowerCase2)) {
                    throw new NoSuchElementException("Key " + ((Object) lowerCase2) + " is missing in the map.");
                }
                linkedHashMap.put(lowerCase3, obj);
            }
        }
        this.f1700l = new Q.b(6, this);
    }

    public final boolean a() {
        if (!this.f1692a.isOpenInternal()) {
            return false;
        }
        if (!this.f1696f) {
            ((k0.h) this.f1692a.getOpenHelper()).a();
        }
        if (this.f1696f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(j0.a aVar, int i) {
        aVar.l("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.d[i];
        String[] strArr = f1691m;
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = strArr[i2];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + f.c(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END";
            g1.f.d(str3, "StringBuilder().apply(builderAction).toString()");
            aVar.l(str3);
        }
    }

    public final void c(j0.a aVar) {
        g1.f.e(aVar, "database");
        if (aVar.u()) {
            return;
        }
        try {
            Lock closeLock$room_runtime_release = this.f1692a.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                synchronized (this.f1698j) {
                    int[] a2 = this.h.a();
                    if (a2 == null) {
                        return;
                    }
                    if (aVar.k()) {
                        aVar.b();
                    } else {
                        aVar.d();
                    }
                    try {
                        int length = a2.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            int i3 = a2[i];
                            int i4 = i2 + 1;
                            if (i3 == 1) {
                                b(aVar, i2);
                            } else if (i3 == 2) {
                                String str = this.d[i2];
                                String[] strArr = f1691m;
                                for (int i5 = 0; i5 < 3; i5++) {
                                    String str2 = "DROP TRIGGER IF EXISTS " + f.c(str, strArr[i5]);
                                    g1.f.d(str2, "StringBuilder().apply(builderAction).toString()");
                                    aVar.l(str2);
                                }
                            }
                            i++;
                            i2 = i4;
                        }
                        aVar.s();
                        aVar.c();
                    } catch (Throwable th) {
                        aVar.c();
                        throw th;
                    }
                }
            } finally {
                closeLock$room_runtime_release.unlock();
            }
        } catch (SQLiteException e2) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
        } catch (IllegalStateException e3) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e3);
        }
    }
}
