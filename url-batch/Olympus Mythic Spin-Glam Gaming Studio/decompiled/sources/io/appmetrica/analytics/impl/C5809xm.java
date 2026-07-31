package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.xm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5809xm implements ProtobufConverter {
    public final Te a = new Te();
    public final Ca b = new Ca();
    public final Ym c = new Ym();
    public final C5738v3 d = new C5738v3();
    public final A2 e = new A2();
    public final O6 f = new O6();
    public final Um g = new Um();
    public final Jd h = new Jd();
    public final X9 i = new X9();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Nm fromModel(@NonNull Am am) {
        Nm nm = new Nm();
        nm.s = am.u;
        nm.t = am.v;
        String str = am.a;
        if (str != null) {
            nm.a = str;
        }
        List list = am.f;
        if (list != null) {
            nm.f = (String[]) list.toArray(new String[list.size()]);
        }
        List list2 = am.g;
        if (list2 != null) {
            nm.g = (String[]) list2.toArray(new String[list2.size()]);
        }
        List list3 = am.b;
        if (list3 != null) {
            nm.c = (String[]) list3.toArray(new String[list3.size()]);
        }
        List list4 = am.h;
        if (list4 != null) {
            nm.o = (String[]) list4.toArray(new String[list4.size()]);
        }
        Map<String, ? extends List<String>> map = am.i;
        if (map != null) {
            nm.h = this.f.fromModel(map);
        }
        Se se = am.s;
        if (se != null) {
            nm.v = this.a.fromModel(se);
        }
        String str2 = am.j;
        if (str2 != null) {
            nm.j = str2;
        }
        String str3 = am.c;
        if (str3 != null) {
            nm.d = str3;
        }
        String str4 = am.d;
        if (str4 != null) {
            nm.e = str4;
        }
        String str5 = am.e;
        if (str5 != null) {
            nm.r = str5;
        }
        nm.i = this.b.fromModel(am.m);
        String str6 = am.k;
        if (str6 != null) {
            nm.k = str6;
        }
        String str7 = am.l;
        if (str7 != null) {
            nm.l = str7;
        }
        nm.m = am.p;
        nm.b = am.n;
        nm.q = am.o;
        RetryPolicyConfig retryPolicyConfig = am.t;
        nm.w = retryPolicyConfig.maxIntervalSeconds;
        nm.x = retryPolicyConfig.exponentialMultiplier;
        String str8 = am.q;
        if (str8 != null) {
            nm.n = str8;
        }
        Xm xm = am.r;
        if (xm != null) {
            this.c.getClass();
            Mm mm = new Mm();
            mm.a = xm.a;
            nm.p = mm;
        }
        nm.u = am.w;
        C5686t3 c5686t3 = am.x;
        if (c5686t3 != null) {
            this.d.getClass();
            Fm fm = new Fm();
            fm.a = c5686t3.a;
            nm.y = fm;
        }
        C5841z2 c5841z2 = am.y;
        if (c5841z2 != null) {
            nm.z = this.e.fromModel(c5841z2);
        }
        nm.A = this.g.fromModel(am.z);
        nm.B = this.h.fromModel(am.A);
        nm.C = this.i.fromModel(am.B);
        return nm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Am toModel(@NonNull Nm nm) {
        C5861zm c5861zm = new C5861zm(this.b.toModel(nm.i));
        c5861zm.a = nm.a;
        c5861zm.j = nm.j;
        c5861zm.c = nm.d;
        c5861zm.b = Arrays.asList(nm.c);
        c5861zm.g = Arrays.asList(nm.g);
        c5861zm.f = Arrays.asList(nm.f);
        c5861zm.d = nm.e;
        c5861zm.e = nm.r;
        c5861zm.h = Arrays.asList(nm.o);
        c5861zm.k = nm.k;
        c5861zm.l = nm.l;
        c5861zm.q = nm.m;
        c5861zm.o = nm.b;
        c5861zm.p = nm.q;
        c5861zm.t = nm.s;
        c5861zm.u = nm.t;
        c5861zm.r = nm.n;
        c5861zm.v = nm.u;
        c5861zm.w = new RetryPolicyConfig(nm.w, nm.x);
        c5861zm.i = this.f.toModel(nm.h);
        Km km = nm.v;
        if (km != null) {
            this.a.getClass();
            c5861zm.n = new Se(km.a, km.b);
        }
        Mm mm = nm.p;
        if (mm != null) {
            this.c.getClass();
            c5861zm.s = new Xm(mm.a);
        }
        Fm fm = nm.y;
        if (fm != null) {
            this.d.getClass();
            c5861zm.x = new C5686t3(fm.a);
        }
        Em em = nm.z;
        if (em != null) {
            c5861zm.y = this.e.toModel(em);
        }
        Lm lm = nm.A;
        if (lm != null) {
            this.g.getClass();
            c5861zm.z = new Tm(lm.a);
        }
        c5861zm.A = this.h.toModel(nm.B);
        Hm hm = nm.C;
        if (hm != null) {
            this.i.getClass();
            c5861zm.B = new W9(hm.a);
        }
        return new Am(c5861zm);
    }
}
