package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class Am {
    public final Map A;
    public final W9 B;
    public final String a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final List h;
    public final Map i;
    public final String j;
    public final String k;
    public final String l;
    public final C4 m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final String q;
    public final Xm r;
    public final Se s;
    public final RetryPolicyConfig t;
    public final long u;
    public final long v;
    public final boolean w;
    public final C5686t3 x;
    public final C5841z2 y;
    public final Tm z;

    public Am(C5861zm c5861zm) {
        String str;
        long j;
        long j2;
        Tm tm;
        Map map;
        W9 w9;
        this.a = c5861zm.a;
        List list = c5861zm.b;
        this.b = list == null ? null : CollectionUtils.unmodifiableListCopy(list);
        this.c = c5861zm.c;
        this.d = c5861zm.d;
        this.e = c5861zm.e;
        List list2 = c5861zm.f;
        this.f = list2 == null ? null : CollectionUtils.unmodifiableListCopy(list2);
        List list3 = c5861zm.g;
        this.g = list3 == null ? null : CollectionUtils.unmodifiableListCopy(list3);
        List list4 = c5861zm.h;
        this.h = list4 == null ? null : CollectionUtils.unmodifiableListCopy(list4);
        Map map2 = c5861zm.i;
        this.i = map2 != null ? CollectionUtils.unmodifiableMapCopy(map2) : null;
        this.j = c5861zm.j;
        this.k = c5861zm.k;
        this.m = c5861zm.m;
        this.s = c5861zm.n;
        this.n = c5861zm.o;
        this.o = c5861zm.p;
        this.l = c5861zm.l;
        this.p = c5861zm.q;
        str = c5861zm.r;
        this.q = str;
        this.r = c5861zm.s;
        j = c5861zm.t;
        this.u = j;
        j2 = c5861zm.u;
        this.v = j2;
        this.w = c5861zm.v;
        RetryPolicyConfig retryPolicyConfig = c5861zm.w;
        if (retryPolicyConfig == null) {
            Nm nm = new Nm();
            this.t = new RetryPolicyConfig(nm.w, nm.x);
        } else {
            this.t = retryPolicyConfig;
        }
        this.x = c5861zm.x;
        this.y = c5861zm.y;
        tm = c5861zm.z;
        this.z = tm == null ? new Tm(AbstractC5199a8.b.a) : c5861zm.z;
        map = c5861zm.A;
        this.A = map == null ? Collections.emptyMap() : c5861zm.A;
        w9 = c5861zm.B;
        this.B = w9;
    }

    public final C5861zm a(C4 c4) {
        C5861zm c5861zm = new C5861zm(c4);
        c5861zm.a = this.a;
        c5861zm.f = this.f;
        c5861zm.g = this.g;
        c5861zm.j = this.j;
        c5861zm.b = this.b;
        c5861zm.c = this.c;
        c5861zm.d = this.d;
        c5861zm.e = this.e;
        c5861zm.h = this.h;
        c5861zm.i = this.i;
        c5861zm.k = this.k;
        c5861zm.l = this.l;
        c5861zm.q = this.p;
        c5861zm.o = this.n;
        c5861zm.p = this.o;
        c5861zm.r = this.q;
        c5861zm.n = this.s;
        c5861zm.t = this.u;
        c5861zm.u = this.v;
        c5861zm.s = this.r;
        c5861zm.v = this.w;
        c5861zm.w = this.t;
        c5861zm.x = this.x;
        c5861zm.y = this.y;
        c5861zm.z = this.z;
        c5861zm.A = this.A;
        c5861zm.B = this.B;
        return c5861zm;
    }

    public final String toString() {
        return "StartupStateModel{uuid='" + this.a + "', reportUrls=" + this.b + ", getAdUrl='" + this.c + "', reportAdUrl='" + this.d + "', certificateUrl='" + this.e + "', hostUrlsFromStartup=" + this.f + ", hostUrlsFromClient=" + this.g + ", diagnosticUrls=" + this.h + ", customSdkHosts=" + this.i + ", encodedClidsFromResponse='" + this.j + "', lastClientClidsForStartupRequest='" + this.k + "', lastChosenForRequestClids='" + this.l + "', collectingFlags=" + this.m + ", obtainTime=" + this.n + ", hadFirstStartup=" + this.o + ", startupDidNotOverrideClids=" + this.p + ", countryInit='" + this.q + "', statSending=" + this.r + ", permissionsCollectingConfig=" + this.s + ", retryPolicyConfig=" + this.t + ", obtainServerTime=" + this.u + ", firstStartupServerTime=" + this.v + ", outdated=" + this.w + ", cacheControl=" + this.x + ", attributionConfig=" + this.y + ", startupUpdateConfig=" + this.z + ", modulesRemoteConfigs=" + this.A + ", externalAttributionConfig=" + this.B + '}';
    }
}
