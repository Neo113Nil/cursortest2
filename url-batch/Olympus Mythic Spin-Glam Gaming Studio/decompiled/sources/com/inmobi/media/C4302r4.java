package com.inmobi.media;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.r4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4302r4 {
    public final CoroutineScope a;
    public final Lazy b;

    public C4302r4(CoroutineScope configScope) {
        Intrinsics.checkNotNullParameter(configScope, "configScope");
        this.a = configScope;
        this.b = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.r4$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C4302r4.a();
            }
        });
    }

    public static final C4067i4 a() {
        return new C4067i4(AbstractC4334s9.b());
    }
}
