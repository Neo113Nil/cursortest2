package io.appmetrica.analytics.impl;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes11.dex */
public final /* synthetic */ class In extends AdaptedFunctionReference implements Function1 {
    public In(Object obj) {
        super(1, obj, Jn.class, "insertRecords", "insertRecords(Ljava/util/List;)J", 8);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((Jn) this.receiver).a((List) obj);
        return Unit.INSTANCE;
    }
}
