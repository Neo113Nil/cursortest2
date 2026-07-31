package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class g extends Lambda implements Function0 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str) {
        super(0);
        this.a = context;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return Boolean.valueOf(this.a.getPackageManager().hasSystemFeature(this.b));
    }
}
