package io.bidmachine.analytics.internal.h;

import io.bidmachine.analytics.internal.a.C5890a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes13.dex */
public final class g extends Lambda implements Function0 {
    final /* synthetic */ C5890a a;
    final /* synthetic */ String b;
    final /* synthetic */ Throwable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C5890a c5890a, String str, Throwable th) {
        super(0);
        this.a = c5890a;
        this.b = str;
        this.c = th;
    }

    public final void a() {
        C5910e.a.a(this.a, this.b, this.c);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo4828invoke() {
        a();
        return Unit.INSTANCE;
    }
}
