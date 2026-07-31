package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes13.dex */
public interface Ag {
    void a() throws C4881se;

    default void a(boolean z, @NotNull Function0 lazyError) {
        Intrinsics.checkNotNullParameter(lazyError, "lazyError");
        if (!z) {
            throw new C4881se((IronSourceError) lazyError.mo4828invoke());
        }
    }
}
