package com.ironsource;

import com.ironsource.AbstractC4709j3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes12.dex */
public final class I4<Smash extends AbstractC4709j3<?>> extends dh<Smash> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I4(int i, boolean z, @NotNull List<? extends Smash> waterfall) {
        super(i, z, waterfall);
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
    }

    @Override // com.ironsource.dh
    public void c(@NotNull Smash smash) {
        Intrinsics.checkNotNullParameter(smash, "smash");
        IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is ready to load");
        smash.a(true);
        c().add(smash);
    }
}
