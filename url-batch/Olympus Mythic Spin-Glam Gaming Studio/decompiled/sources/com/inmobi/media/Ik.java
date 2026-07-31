package com.inmobi.media;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class Ik {
    public final C4478xk a;
    public final C3870aj b;
    public final Jk c;

    public Ik(C4478xk telemetryConfigMetaData, List samplingEvents) {
        Intrinsics.checkNotNullParameter(telemetryConfigMetaData, "telemetryConfigMetaData");
        Intrinsics.checkNotNullParameter(samplingEvents, "samplingEvents");
        this.a = telemetryConfigMetaData;
        double random = Math.random();
        this.b = new C3870aj(telemetryConfigMetaData, random, samplingEvents);
        this.c = new Jk(telemetryConfigMetaData, random);
    }
}
