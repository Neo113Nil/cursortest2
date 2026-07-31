package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.xj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4477xj {
    public static final Hh a = new Hh();
    public static final String b = AbstractC4477xj.class.getSimpleName();

    public static SignalsConfig.IceConfig a() {
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        return ((SignalsConfig) AbstractC4015g4.a.a(SignalsConfig.class)).getIce();
    }
}
