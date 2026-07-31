package com.vungle.ads.internal.presenter;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class e extends Lambda implements Function0 {
    public final /* synthetic */ r a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r rVar) {
        super(0);
        this.a = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        com.vungle.ads.internal.ui.view.f fVar = this.a.a.e;
        if (fVar != null) {
            fVar.close();
        }
        return Unit.INSTANCE;
    }
}
