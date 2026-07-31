package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class Kd extends Lambda implements Function1 {
    public final /* synthetic */ Bb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kd(Bb bb) {
        super(1);
        this.a = bb;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C5670sd c5670sd = (C5670sd) ((Map.Entry) obj).getValue();
        return c5670sd.b.parse(this.a);
    }
}
