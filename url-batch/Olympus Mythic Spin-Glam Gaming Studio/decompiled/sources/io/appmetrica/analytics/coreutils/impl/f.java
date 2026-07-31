package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class f extends Lambda implements Function0 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ComponentName b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, ComponentName componentName, int i) {
        super(0);
        this.a = context;
        this.b = componentName;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return this.a.getPackageManager().getServiceInfo(this.b, this.c);
    }
}
