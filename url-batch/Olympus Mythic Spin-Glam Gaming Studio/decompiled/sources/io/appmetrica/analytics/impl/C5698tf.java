package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.tf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5698tf extends Sd implements To {
    public static final C5672sf d = new C5672sf("LOCATION_TRACKING_ENABLED", null);
    public static final C5672sf e = new C5672sf("PREF_KEY_OFFSET", null);
    public static final C5672sf f = new C5672sf("UNCHECKED_TIME", null);
    public static final C5672sf g = new C5672sf("STATISTICS_RESTRICTED_IN_MAIN", null);
    public static final C5672sf h = new C5672sf("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);
    public static final C5672sf i = new C5672sf("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);
    public static final C5672sf j = new C5672sf("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);
    public static final C5672sf k = new C5672sf("LAST_REPORT_SEND_ATTEMPT_TIME", null);
    public static final C5672sf l = new C5672sf("LAST_LOCATION_SEND_ATTEMPT_TIME", null);
    public static final C5672sf m = new C5672sf("LAST_STARTUP_SEND_ATTEMPT_TIME", null);
    public static final C5672sf n = new C5672sf("SATELLITE_PRELOAD_INFO_CHECKED", null);
    public static final C5672sf o = new C5672sf("SATELLITE_CLIDS_CHECKED", null);
    public static final C5672sf p = new C5672sf("VITAL_DATA", null);
    public static final C5672sf q = new C5672sf("LAST_KOTLIN_VERSION_SEND_TIME", null);
    public static final C5672sf r = new C5672sf("ADV_IDENTIFIERS_TRACKING_ENABLED", null);

    public C5698tf(InterfaceC5357gb interfaceC5357gb) {
        super(interfaceC5357gb);
    }

    public final long a(int i2) {
        return this.a.getLong(e.b, i2);
    }

    public final C5698tf b(long j2) {
        return (C5698tf) d(e.b, j2);
    }

    public final void c(boolean z) {
        d(g.b, z).flushAsync();
    }

    public final C5698tf d(boolean z) {
        return (C5698tf) d(f.b, z);
    }

    public final boolean e() {
        return this.a.getBoolean(d.b, false);
    }

    public final void f(boolean z) {
        d(d.b, z).flushAsync();
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5646rf, io.appmetrica.analytics.impl.Ol, io.appmetrica.analytics.impl.To
    public final void flushAsync() {
        this.a.flushAsync();
    }

    public final void g() {
        d(o.b, true).flushAsync();
    }

    public final void h() {
        d(n.b, true).flushAsync();
    }

    public final boolean i() {
        return this.a.getBoolean(n.b, false);
    }

    public final boolean j() {
        return this.a.getBoolean(o.b, false);
    }

    public final C5698tf a(long j2) {
        return (C5698tf) d(q.b, j2);
    }

    public final boolean b(boolean z) {
        return this.a.getBoolean(f.b, z);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5646rf
    @NonNull
    public final Set<String> c() {
        return this.a.b();
    }

    @Nullable
    public final Boolean d() {
        C5672sf c5672sf = g;
        if (!this.a.a(c5672sf.b)) {
            return null;
        }
        return Boolean.valueOf(this.a.getBoolean(c5672sf.b, true));
    }

    public final void e(boolean z) {
        d(r.b, z).flushAsync();
    }

    public final long f() {
        return this.a.getLong(q.b, 0L);
    }

    @Override // io.appmetrica.analytics.impl.Sd
    @NonNull
    public final String g(@NonNull String str) {
        return new C5672sf(str, null).b;
    }

    @Override // io.appmetrica.analytics.impl.To
    public final void a(@NonNull String str) {
        d(p.b, str).flushAsync();
    }

    @Override // io.appmetrica.analytics.impl.To
    @Nullable
    public final String b() {
        return this.a.getString(p.b, null);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5646rf, io.appmetrica.analytics.impl.To
    public final void a() {
        super.a();
    }

    public final C5698tf b(@NonNull EnumC5567oe enumC5567oe, int i2) {
        C5672sf c5672sf;
        int ordinal = enumC5567oe.ordinal();
        if (ordinal == 0) {
            c5672sf = h;
        } else if (ordinal != 1) {
            c5672sf = ordinal != 2 ? null : j;
        } else {
            c5672sf = i;
        }
        return c5672sf != null ? (C5698tf) d(c5672sf.b, i2) : this;
    }

    public final boolean a(boolean z) {
        return this.a.getBoolean(r.b, z);
    }

    public final int a(@NonNull EnumC5567oe enumC5567oe, int i2) {
        C5672sf c5672sf;
        int ordinal = enumC5567oe.ordinal();
        if (ordinal == 0) {
            c5672sf = h;
        } else if (ordinal != 1) {
            c5672sf = ordinal != 2 ? null : j;
        } else {
            c5672sf = i;
        }
        if (c5672sf == null) {
            return i2;
        }
        return this.a.getInt(c5672sf.b, i2);
    }

    public final C5698tf b(@NonNull EnumC5567oe enumC5567oe, long j2) {
        C5672sf c5672sf;
        int ordinal = enumC5567oe.ordinal();
        if (ordinal == 0) {
            c5672sf = k;
        } else if (ordinal != 1) {
            c5672sf = ordinal != 2 ? null : m;
        } else {
            c5672sf = l;
        }
        return c5672sf != null ? (C5698tf) d(c5672sf.b, j2) : this;
    }

    public final long a(@NonNull EnumC5567oe enumC5567oe, long j2) {
        C5672sf c5672sf;
        int ordinal = enumC5567oe.ordinal();
        if (ordinal == 0) {
            c5672sf = k;
        } else if (ordinal != 1) {
            c5672sf = ordinal != 2 ? null : m;
        } else {
            c5672sf = l;
        }
        if (c5672sf == null) {
            return j2;
        }
        return this.a.getLong(c5672sf.b, j2);
    }
}
