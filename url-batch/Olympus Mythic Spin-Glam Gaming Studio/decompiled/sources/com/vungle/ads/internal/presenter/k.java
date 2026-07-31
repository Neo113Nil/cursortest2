package com.vungle.ads.internal.presenter;

import com.vungle.ads.MraidTemplateError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class k extends Lambda implements Function0 {
    public final /* synthetic */ r a;
    public final /* synthetic */ MraidTemplateError b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar, MraidTemplateError mraidTemplateError, boolean z, String str) {
        super(0);
        this.a = rVar;
        this.b = mraidTemplateError;
        this.c = z;
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        this.a.a(this.b, this.c, this.d);
        return Unit.INSTANCE;
    }
}
