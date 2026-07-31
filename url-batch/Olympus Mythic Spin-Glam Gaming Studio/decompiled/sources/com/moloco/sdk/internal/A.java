package com.moloco.sdk.internal;

import com.moloco.sdk.service_locator.a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class A {

    @NotNull
    public static final Lazy a = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.A$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return A.a();
        }
    });

    @NotNull
    public static final String b = "[ERROR_CODE]";

    @NotNull
    public static final String c = "[HAPPENED_AT_TS]";

    public static final z a() {
        return new z(a.i.a.c());
    }

    @NotNull
    public static final y b() {
        return c();
    }

    public static final z c() {
        return (z) a.getValue();
    }
}
