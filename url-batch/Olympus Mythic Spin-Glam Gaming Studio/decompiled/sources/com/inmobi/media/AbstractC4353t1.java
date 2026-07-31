package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.t1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4353t1 {
    public final Ac a;

    public AbstractC4353t1(C4248p1 adManagerComponent) {
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        C4274q1 c4274q1 = adManagerComponent.a;
        this.a = AbstractC4522zc.a(c4274q1.b.getTimeouts().a0(), c4274q1.a.h, "native", AbstractC4030gj.b);
    }

    public abstract void a();

    public abstract void b();

    public void c() {
    }

    public abstract void d();

    public abstract void e();

    public void f() {
    }
}
