package com.inmobi.media;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes13.dex */
public final class Rd extends AbstractC4459x2 {
    public final Td h;
    public final Lazy i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Rd(CoroutineScope coroutineScope, S5 displayMRC50Model, MutableStateFlow windowObserver) {
        super(coroutineScope, r0, r3, windowObserver);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(displayMRC50Model, "displayMRC50Model");
        Intrinsics.checkNotNullParameter(windowObserver, "windowObserver");
        Tn tn = displayMRC50Model.a;
        Wn wn = displayMRC50Model.b;
        this.h = new Td(new C4113jo(wn.b, wn.c), this.g.c);
        this.i = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Rd$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Rd.a(Rd.this);
            }
        });
    }

    public static final C3875ao a(Rd rd) {
        Td viewabilityTrackerView = rd.h;
        Intrinsics.checkNotNullParameter(viewabilityTrackerView, "viewabilityTrackerView");
        return new C3875ao(new Ng(rd.a, new Pg(rd.b.a), viewabilityTrackerView), new C3927co(rd.a, rd.b.d));
    }

    @Override // com.inmobi.media.AbstractC4459x2
    public final C3875ao c() {
        return (C3875ao) this.i.getValue();
    }
}
