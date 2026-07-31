package com.vungle.ads.internal.presenter;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class i extends Lambda implements Function0 {
    public final /* synthetic */ r a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar) {
        super(0);
        this.a = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        this.a.a.setVisibility(0);
        return Unit.INSTANCE;
    }
}
