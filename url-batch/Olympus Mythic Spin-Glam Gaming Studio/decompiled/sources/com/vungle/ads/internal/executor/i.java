package com.vungle.ads.internal.executor;

import com.iab.omid.library.vungle.internal.l;
import com.vungle.ads.OutOfMemory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes10.dex */
public final class i extends Lambda implements Function0 {
    public final /* synthetic */ j a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar) {
        super(0);
        this.a = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        StringBuilder a = l.a("submit callable error in ");
        a.append(this.a.a());
        new OutOfMemory(a.toString()).logErrorNoReturnValue$vungle_ads_release();
        return Unit.INSTANCE;
    }
}
