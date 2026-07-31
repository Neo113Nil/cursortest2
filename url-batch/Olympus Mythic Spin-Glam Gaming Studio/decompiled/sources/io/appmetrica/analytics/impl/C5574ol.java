package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.ol, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5574ol {
    public static final String d = "SESSION_SLEEP_START";
    public static final String e = "SESSION_LAST_EVENT_OFFSET";
    public static final String f = "SESSION_ID";
    public static final String g = "SESSION_COUNTER_ID";
    public static final String h = "SESSION_INIT_TIME";
    public static final String i = "SESSION_CREATION_CURRENT_TIME";
    public static final String j = "SESSION_IS_ALIVE_REPORT_NEEDED";
    public static final String k = "SESSION_CRASHED";
    public final String a;

    @NonNull
    protected final C5621qf b;
    public Bb c;

    public C5574ol(@NonNull C5621qf c5621qf, @NonNull String str) {
        this.b = c5621qf;
        this.a = str;
        Bb bb = new Bb();
        try {
            String h2 = c5621qf.h(str);
            if (!StringUtils.isNullOrEmpty(h2)) {
                bb = new Bb(h2);
            }
        } catch (Throwable unused) {
        }
        this.c = bb;
    }

    public final C5574ol a(long j2) {
        a(i, Long.valueOf(j2));
        return this;
    }

    public final C5574ol b(long j2) {
        a(h, Long.valueOf(j2));
        return this;
    }

    @Nullable
    public final Long c() {
        return this.c.b(i);
    }

    @Nullable
    public final Long d() {
        return this.c.b(h);
    }

    public final C5574ol e(long j2) {
        a(f, Long.valueOf(j2));
        return this;
    }

    @Nullable
    public final Long f() {
        return this.c.b(g);
    }

    @Nullable
    public final Long g() {
        return this.c.b(f);
    }

    @Nullable
    public final Long h() {
        return this.c.b(d);
    }

    public final boolean i() {
        return this.c.length() > 0;
    }

    @Nullable
    public final Boolean j() {
        return this.c.a(j);
    }

    @Nullable
    public final Boolean k() {
        return this.c.a(k);
    }

    public final C5574ol a(boolean z) {
        a(j, Boolean.valueOf(z));
        return this;
    }

    public final C5574ol b(boolean z) {
        a(k, Boolean.valueOf(z));
        return this;
    }

    public final C5574ol c(long j2) {
        a(e, Long.valueOf(j2));
        return this;
    }

    public final C5574ol d(long j2) {
        a(g, Long.valueOf(j2));
        return this;
    }

    @Nullable
    public final Long e() {
        return this.c.b(e);
    }

    public final C5574ol f(long j2) {
        a(d, Long.valueOf(j2));
        return this;
    }

    public final void a() {
        this.b.e(this.a, this.c.toString());
    }

    public final void b() {
        this.c = new Bb();
        a();
    }

    public final void a(String str, Object obj) {
        try {
            this.c.put(str, obj);
        } catch (Throwable unused) {
        }
    }
}
