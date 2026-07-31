package com.inmobi.media;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* renamed from: com.inmobi.media.sd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4338sd extends AbstractC4459x2 {
    public final C4365td h;
    public final Lazy i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4338sd(CoroutineScope coroutineScope, Tn viewabilityModel, Wn viewabilityCriteria, MutableStateFlow windowObserver) {
        super(coroutineScope, viewabilityModel, viewabilityCriteria, windowObserver);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(viewabilityModel, "viewabilityModel");
        Intrinsics.checkNotNullParameter(viewabilityCriteria, "viewabilityCriteria");
        Intrinsics.checkNotNullParameter(windowObserver, "windowObserver");
        this.h = new C4365td(new C4113jo(viewabilityCriteria.b, viewabilityCriteria.c), this.g.c);
        this.i = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.sd$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C4338sd.a(C4338sd.this);
            }
        });
    }

    public static final C3875ao a(C4338sd c4338sd) {
        C4365td viewabilityTrackerView = c4338sd.h;
        Intrinsics.checkNotNullParameter(viewabilityTrackerView, "viewabilityTrackerView");
        return new C3875ao(new Ng(c4338sd.a, new Pg(c4338sd.b.a), viewabilityTrackerView), new C3927co(c4338sd.a, c4338sd.b.d));
    }

    @Override // com.inmobi.media.AbstractC4459x2
    public final C3875ao c() {
        return (C3875ao) this.i.getValue();
    }
}
