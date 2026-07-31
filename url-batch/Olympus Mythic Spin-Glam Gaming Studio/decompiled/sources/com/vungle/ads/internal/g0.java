package com.vungle.ads.internal;

import com.vungle.ads.BaseAdListener;
import com.vungle.ads.VungleError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes15.dex */
public final class g0 extends Lambda implements Function0 {
    public final /* synthetic */ i0 a;
    public final /* synthetic */ VungleError b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, VungleError vungleError) {
        super(0);
        this.a = i0Var;
        this.b = vungleError;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        BaseAdListener adListener = this.a.getAdListener();
        if (adListener != null) {
            adListener.onAdFailedToPlay(this.a, this.b);
        }
        return Unit.INSTANCE;
    }
}
