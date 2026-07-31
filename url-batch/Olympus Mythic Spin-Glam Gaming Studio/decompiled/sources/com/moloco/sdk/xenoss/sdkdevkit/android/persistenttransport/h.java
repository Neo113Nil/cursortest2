package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import com.moloco.sdk.service_locator.a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes13.dex */
public final class h {

    @NotNull
    public static final String a = "NonPersistentRequest";

    @NotNull
    public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.h$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return h.a();
        }
    });
    public static final long c = 10000;

    public static final g a() {
        return new g(a.i.a.a());
    }

    @NotNull
    public static final f b() {
        return c();
    }

    public static final g c() {
        return (g) b.getValue();
    }
}
