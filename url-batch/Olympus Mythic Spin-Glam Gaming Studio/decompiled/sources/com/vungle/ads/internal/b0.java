package com.vungle.ads.internal;

import com.vungle.ads.BaseAdListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes15.dex */
public final class b0 extends Lambda implements Function0 {
    public final /* synthetic */ i0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(i0 i0Var) {
        super(0);
        this.a = i0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        BaseAdListener adListener = this.a.getAdListener();
        if (adListener != null) {
            adListener.onAdClicked(this.a);
        }
        return Unit.INSTANCE;
    }
}
