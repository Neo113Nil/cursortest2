package com.inmobi.media;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class Jl {
    public final String a;
    public final String b;
    public final int c;
    public final ArrayList d;

    public Jl(String universalAdId, String adServingId, int i, ArrayList trackers) {
        Intrinsics.checkNotNullParameter(universalAdId, "universalAdId");
        Intrinsics.checkNotNullParameter(adServingId, "adServingId");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        this.a = universalAdId;
        this.b = adServingId;
        this.c = i;
        this.d = trackers;
    }
}
