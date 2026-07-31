package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class e extends Lambda implements Function0 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, String str, int i) {
        super(0);
        this.a = context;
        this.b = str;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return this.a.getPackageManager().getPackageInfo(this.b, this.c);
    }
}
