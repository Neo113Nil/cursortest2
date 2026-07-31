package com.ironsource;

import com.ironsource.C4797o1;
import com.ironsource.InterfaceC4743l1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.t5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4890t5 implements Bb {

    @NotNull
    private final IronSourceError a;

    @NotNull
    private final C4584c3 b;

    @NotNull
    private final InterfaceC4868s1 c;

    public C4890t5(@NotNull IronSourceError error, @NotNull C4584c3 adLoadTaskListener, @NotNull InterfaceC4868s1 analytics) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.a = error;
        this.b = adLoadTaskListener;
        this.c = analytics;
    }

    @NotNull
    public final IronSourceError a() {
        return this.a;
    }

    @Override // com.ironsource.Bb
    public void start() {
        InterfaceC4743l1.c.a aVar = InterfaceC4743l1.c.a;
        aVar.a().a(this.c);
        aVar.a(new C4797o1.j(this.a.getErrorCode()), new C4797o1.k(this.a.getErrorMessage()), new C4797o1.f(0L)).a(this.c);
        this.b.b(this.a);
    }
}
