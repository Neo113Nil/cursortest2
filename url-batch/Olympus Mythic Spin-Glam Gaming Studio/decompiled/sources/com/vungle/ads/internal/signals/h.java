package com.vungle.ads.internal.signals;

import android.content.Context;
import com.vungle.ads.internal.ServiceLocator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class h extends Lambda implements Function0 {
    public final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(0);
        this.a = context;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return ServiceLocator.d.a(this.a).getService(com.vungle.ads.internal.executor.a.class);
    }
}
