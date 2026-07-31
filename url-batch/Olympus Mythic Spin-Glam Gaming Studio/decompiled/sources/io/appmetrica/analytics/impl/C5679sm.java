package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.text.StringsKt;

/* renamed from: io.appmetrica.analytics.impl.sm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5679sm extends C5275d6 {
    public List d;
    public List e;
    public String f;
    public String g;
    public Map h;
    public I3 i;
    public List j;
    public boolean k;
    public boolean l;
    public String m;
    public long n;
    public final C5855zg o;
    public final Z7 p;

    public C5679sm() {
        this(Ka.k().u(), new Z7());
    }

    public final long a(long j) {
        if (this.n == 0) {
            this.n = j;
        }
        return this.n;
    }

    @NonNull
    public final I3 c() {
        return this.i;
    }

    @Nullable
    public final Map<String, String> d() {
        return this.h;
    }

    public final String e() {
        return this.m;
    }

    @Nullable
    public final String f() {
        return this.f;
    }

    public final long g() {
        return this.n;
    }

    @Nullable
    public final String h() {
        return this.g;
    }

    @Nullable
    public final List<String> i() {
        return this.j;
    }

    @NonNull
    public final C5855zg j() {
        return this.o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r4 != null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<String> k() {
        ArrayList arrayList;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!Do.a((Collection) this.d)) {
            linkedHashSet.addAll(this.d);
        }
        if (!Do.a((Collection) this.e)) {
            linkedHashSet.addAll(this.e);
        }
        String[] strArr = (String[]) this.p.a.a();
        if (strArr != null) {
            arrayList = new ArrayList();
            for (String str : strArr) {
                if (str == null || StringsKt.isBlank(str)) {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
        }
        String[] strArr2 = BuildConfig.DEFAULT_HOSTS;
        arrayList = new ArrayList();
        for (String str2 : strArr2) {
            if (str2 == null || StringsKt.isBlank(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        linkedHashSet.addAll(arrayList);
        return new ArrayList(linkedHashSet);
    }

    public final List<String> l() {
        return this.e;
    }

    public final List<String> m() {
        return this.d;
    }

    @Nullable
    public final boolean n() {
        return this.k;
    }

    public final boolean o() {
        return this.l;
    }

    @Override // io.appmetrica.analytics.impl.C5275d6, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "StartupRequestConfig{mStartupHostsFromStartup=" + this.d + ", mStartupHostsFromClient=" + this.e + ", mDistributionReferrer='" + this.f + "', mInstallReferrerSource='" + this.g + "', mClidsFromClient=" + this.h + ", mNewCustomHosts=" + this.j + ", mHasNewCustomHosts=" + this.k + ", mSuccessfulStartup=" + this.l + ", mCountryInit='" + this.m + "', mFirstStartupTime=" + this.n + "} " + super.toString();
    }

    @VisibleForTesting
    public C5679sm(@NonNull C5855zg c5855zg, @NonNull Z7 z7) {
        this.i = new I3(null, EnumC5483l8.d);
        this.n = 0L;
        this.o = c5855zg;
        this.p = z7;
    }

    public final void a(@Nullable List<String> list) {
        this.j = list;
    }

    public final void a(boolean z) {
        this.k = z;
    }

    public final void a(String str) {
        this.m = str;
    }
}
