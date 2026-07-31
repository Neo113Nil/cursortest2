package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.internal.MolocoLogger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class n {

    @NotNull
    public static final Lazy a = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.services.bidtoken.n$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return n.b();
        }
    });

    @NotNull
    public static final l a() {
        return c();
    }

    public static final m b() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "BidTokenService", "Creating BidTokenService instance", null, false, 12, null);
        return new m(y.a.a(), q.a.a());
    }

    public static final m c() {
        return (m) a.getValue();
    }
}
