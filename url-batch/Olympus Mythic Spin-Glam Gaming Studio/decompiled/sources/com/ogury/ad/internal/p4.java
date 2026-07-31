package com.ogury.ad.internal;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class p4 extends Lambda implements Function0 {
    public final /* synthetic */ g a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(g gVar, String str) {
        super(0);
        this.a = gVar;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        q4 q4Var = q4.a;
        q4.b.put(this.b, wi.a((View) this.a));
        return Unit.INSTANCE;
    }
}
