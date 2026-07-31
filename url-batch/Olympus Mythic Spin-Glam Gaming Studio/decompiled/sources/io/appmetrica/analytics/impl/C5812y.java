package io.appmetrica.analytics.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.y, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5812y extends Lambda implements Function1 {
    public final /* synthetic */ C5656s a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5812y(C5656s c5656s) {
        super(1);
        this.a = c5656s;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.a.e = (byte[]) obj;
        return Unit.INSTANCE;
    }
}
