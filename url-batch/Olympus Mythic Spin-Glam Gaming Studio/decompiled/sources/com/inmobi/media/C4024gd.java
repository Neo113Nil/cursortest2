package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.gd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4024gd extends AbstractC4016g5 {
    public final C4248p1 k;
    public final Uc l;
    public final Nc m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4024gd(C4248p1 adManagerComponent, Uc nativeCallback, Nc stateMachine) {
        super(adManagerComponent, nativeCallback, stateMachine);
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(nativeCallback, "nativeCallback");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.k = adManagerComponent;
        this.l = nativeCallback;
        this.m = stateMachine;
    }
}
