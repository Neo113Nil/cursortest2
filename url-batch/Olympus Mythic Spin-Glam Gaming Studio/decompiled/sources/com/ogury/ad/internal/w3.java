package com.ogury.ad.internal;

import com.ogury.ad.interstitial.ui.InterstitialActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class w3 extends Lambda implements Function0 {
    public final /* synthetic */ InterstitialActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(InterstitialActivity interstitialActivity) {
        super(0);
        this.a = interstitialActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        this.a.finish();
        return Unit.INSTANCE;
    }
}
