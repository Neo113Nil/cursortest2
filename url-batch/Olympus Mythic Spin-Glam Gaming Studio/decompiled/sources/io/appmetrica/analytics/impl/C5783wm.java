package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.wm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5783wm {
    public final Map A;
    public final W9 B;
    public final String a;
    public final String b;
    public final Am c;
    public final String d;
    public final List e;
    public final List f;
    public final List g;
    public final Map h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final C4 n;
    public final long o;
    public final boolean p;
    public final boolean q;
    public final String r;
    public final Se s;
    public final RetryPolicyConfig t;
    public final long u;
    public final long v;
    public final boolean w;
    public final C5686t3 x;
    public final C5841z2 y;
    public final Tm z;

    public C5783wm(String str, String str2, Am am) {
        this.a = str;
        this.b = str2;
        this.c = am;
        this.d = am.a;
        this.e = am.b;
        this.f = am.f;
        this.g = am.g;
        this.h = am.i;
        this.i = am.c;
        this.j = am.d;
        this.k = am.j;
        this.l = am.k;
        this.m = am.l;
        this.n = am.m;
        this.o = am.n;
        this.p = am.o;
        this.q = am.p;
        this.r = am.q;
        this.s = am.s;
        this.t = am.t;
        this.u = am.u;
        this.v = am.v;
        this.w = am.w;
        this.x = am.x;
        this.y = am.y;
        this.z = am.z;
        this.A = am.A;
        this.B = am.B;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.d;
    }

    public final String toString() {
        return "StartupState(deviceId=" + this.a + ", deviceIdHash=" + this.b + ", startupStateModel=" + this.c + ')';
    }
}
