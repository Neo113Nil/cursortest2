package com.moloco.sdk.xenoss.sdkdevkit.android.core;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes14.dex */
public final class b {

    @NotNull
    public static final Lazy a = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.core.b$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return b.a();
        }
    });

    @NotNull
    public static final String b = "";

    public static final c a() {
        return new c();
    }

    @NotNull
    public static final UserAgentService b() {
        return c();
    }

    public static final c c() {
        return (c) a.getValue();
    }
}
