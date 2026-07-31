package com.my.target;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LruCache;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes14.dex */
public final class r4 {
    public static final r4 e = new r4();
    public static final a f = new a("");
    private final LruCache a = new LruCache(10);
    private long b;
    private long c;
    private boolean d;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static final class a {
        final long a = SystemClock.elapsedRealtime();
        final String b;

        a(String str) {
            this.b = str;
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static final class b {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    r4() {
    }

    private static String a(long j, String str) {
        if (str.isEmpty()) {
            return "";
        }
        String str2 = ":2:" + j;
        return str.replace(StringUtils.COMMA, str2 + StringUtils.COMMA) + str2;
    }

    public a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return f;
        }
        return new a(str);
    }

    public synchronized void a(long j) {
        if (this.d) {
            return;
        }
        this.b = j * 1000;
        this.c = SystemClock.elapsedRealtime();
        this.d = true;
    }

    public synchronized void a(List list, long j) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String x = ((com.my.target.b) it.next()).x();
            this.a.put(x, x + ":1:" + j);
        }
    }

    public synchronized b a(a aVar) {
        String join;
        String str;
        String str2;
        try {
            Map snapshot = this.a.snapshot();
            if (snapshot.isEmpty()) {
                str = "";
                join = "";
            } else {
                String join2 = TextUtils.join(StringUtils.COMMA, snapshot.keySet());
                join = TextUtils.join(StringUtils.COMMA, snapshot.values());
                str = join2;
            }
            String a2 = a(this.d ? ((this.b + aVar.a) - this.c) / 1000 : 0L, aVar.b);
            if (!join.isEmpty() && !a2.isEmpty()) {
                str2 = join + StringUtils.COMMA + a2;
            }
            str2 = join + a2;
        } catch (Throwable th) {
            throw th;
        }
        return new b(str, str2);
    }
}
