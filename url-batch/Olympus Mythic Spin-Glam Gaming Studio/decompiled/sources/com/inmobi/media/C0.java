package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.Config;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes11.dex */
public final class C0 implements A4 {
    @Override // com.inmobi.media.A4
    public final void a(Config config) {
        B0 b0;
        Intrinsics.checkNotNullParameter(config, "config");
        if ((config instanceof AdConfig) && (b0 = F0.b) != null) {
            AdConfig adConfig = (AdConfig) config;
            Intrinsics.checkNotNullParameter(adConfig, "adConfig");
            if (b0.a.get()) {
                if (adConfig.getAdQuality().getEnabled()) {
                    return;
                }
                b0.a.set(false);
                CoroutineScope coroutineScope = F0.f;
                if (coroutineScope != null) {
                    CoroutineScopeKt.cancel(coroutineScope, new CancellationException("Shutdown"));
                }
                F0.f = null;
                return;
            }
            if (!adConfig.getAdQuality().getEnabled() || b0.a.get()) {
                return;
            }
            C4277q4 c4277q4 = AbstractC4015g4.a;
            Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
            if (((AdConfig) AbstractC4015g4.a.a(AdConfig.class)).getAdQuality().getEnabled()) {
                b0.a();
            }
        }
    }
}
