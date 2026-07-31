package com.moloco.sdk.internal;

import com.moloco.sdk.service_locator.a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class h {

    @NotNull
    public static final Lazy a = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.h$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return h.b();
        }
    });

    @NotNull
    public static final f a() {
        return c();
    }

    public static final g b() {
        return new g(a.i.a.c());
    }

    public static final g c() {
        return (g) a.getValue();
    }
}
