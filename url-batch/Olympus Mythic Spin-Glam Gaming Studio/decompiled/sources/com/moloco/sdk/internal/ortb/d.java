package com.moloco.sdk.internal.ortb;

import com.moloco.sdk.internal.q;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class d {

    @NotNull
    public static final Lazy a = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.ortb.d$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return d.b();
        }
    });

    @NotNull
    public static final b a() {
        return c();
    }

    public static final c b() {
        return new c(q.b());
    }

    public static final b c() {
        return (b) a.getValue();
    }
}
