package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.xd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4471xd {
    public final Context a;
    public final G b;
    public final boolean c;
    public final C4178mb d;
    public final Qc e;
    public final InterfaceC4195n1 f;
    public final InterfaceC4466x9 g;

    public C4471xd(Context context, G adContext, boolean z, C4178mb telemetryMetaData, Qc adTelemetryHelper, InterfaceC4195n1 adUnitCallback, InterfaceC4466x9 interfaceC4466x9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adContext, "adContext");
        Intrinsics.checkNotNullParameter(telemetryMetaData, "telemetryMetaData");
        Intrinsics.checkNotNullParameter(adTelemetryHelper, "adTelemetryHelper");
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a = context;
        this.b = adContext;
        this.c = z;
        this.d = telemetryMetaData;
        this.e = adTelemetryHelper;
        this.f = adUnitCallback;
        this.g = interfaceC4466x9;
    }
}
