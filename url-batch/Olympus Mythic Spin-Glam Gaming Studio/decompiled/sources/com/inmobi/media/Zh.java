package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class Zh implements A4 {
    @Override // com.inmobi.media.A4
    public final void a(Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        Wb wb = AbstractC3869ai.b;
        if (wb != null) {
            wb.g.set(true);
        }
        AbstractC3869ai.b = null;
        Hl.a(new Yh(null));
    }
}
