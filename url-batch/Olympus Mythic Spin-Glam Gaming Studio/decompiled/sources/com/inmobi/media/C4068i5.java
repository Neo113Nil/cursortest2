package com.inmobi.media;

import android.net.Network;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.i5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4068i5 {
    public static volatile Network a = null;
    public static volatile boolean b = true;
    public static long c;
    public static long d;
    public static final AtomicBoolean e = new AtomicBoolean(false);

    public static AdConfig.CustomNetworkValidation a() {
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        return ((AdConfig) AbstractC4015g4.a.a(AdConfig.class)).getCustomNwValidation();
    }
}
