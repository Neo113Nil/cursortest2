package com.vungle.ads.internal;

import com.vungle.ads.SdkNotInitialized;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class t2 extends Lambda implements Function0 {
    public final /* synthetic */ w2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(w2 w2Var) {
        super(0);
        this.a = w2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        this.a.a(new SdkNotInitialized("Network permissions not granted").logError$vungle_ads_release());
        return Unit.INSTANCE;
    }
}
