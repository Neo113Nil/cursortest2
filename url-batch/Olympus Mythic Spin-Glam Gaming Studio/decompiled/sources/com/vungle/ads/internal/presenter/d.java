package com.vungle.ads.internal.presenter;

import android.content.Context;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class d extends Lambda implements Function0 {
    public final /* synthetic */ r a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r rVar) {
        super(0);
        this.a = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        com.vungle.ads.internal.ui.view.k kVar;
        h0 h0Var;
        kVar = this.a.a;
        Context context = kVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "adWidget.context");
        h0Var = this.a.b;
        return new p0(context, h0Var);
    }
}
