package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.p2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC4249p2 implements Bj, InterfaceC4009g {
    public final AbstractC4353t1 a;
    public final E8 b;
    public final Nc c;

    public AbstractC4249p2(AbstractC4353t1 abstractC4353t1, E8 adManagerComponent, Nc stateMachine) {
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.a = abstractC4353t1;
        this.b = adManagerComponent;
        this.c = stateMachine;
    }

    @Override // com.inmobi.media.Bj
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC4009g
    public final void j() {
        this.c.a(new C4515z5(this.b), this);
    }
}
