package com.inmobi.media;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.vn, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4428vn {
    public final CoroutineScope a;
    public final C4252p5 b;
    public final C4087io c;
    public final Lazy d;

    public C4428vn(CoroutineScope coroutineScope, C4252p5 trackingView, C4087io config) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(trackingView, "trackingView");
        Intrinsics.checkNotNullParameter(config, "config");
        this.a = coroutineScope;
        this.b = trackingView;
        this.c = config;
        this.d = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.vn$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C4428vn.a(C4428vn.this);
            }
        });
    }

    public static final Ng a(C4428vn c4428vn) {
        C4087io c4087io = c4428vn.c;
        return new Ng(c4428vn.a, new Pg(c4428vn.c.b), new C4139ko(new C4113jo(c4087io.a, c4087io.c), new C4529zj(c4428vn.b, CollectionsKt.emptyList())));
    }
}
