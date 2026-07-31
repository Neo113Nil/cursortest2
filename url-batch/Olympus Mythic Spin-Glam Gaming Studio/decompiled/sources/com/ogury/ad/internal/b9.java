package com.ogury.ad.internal;

import com.ogury.ad.OguryBidTokenProvider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes10.dex */
public final class b9 extends Lambda implements Function0 {
    public final /* synthetic */ ne a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(ne neVar) {
        super(0);
        this.a = neVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        pf profigAndSyncIfNeeded;
        profigAndSyncIfNeeded = OguryBidTokenProvider.INSTANCE.getProfigAndSyncIfNeeded(this.a);
        return profigAndSyncIfNeeded;
    }
}
