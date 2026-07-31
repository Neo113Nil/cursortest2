package com.inmobi.media;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class Kl {
    public final String a;
    public final ArrayList b;

    public Kl(String clickThroughUrl, ArrayList vastClickTrackers) {
        Intrinsics.checkNotNullParameter(clickThroughUrl, "clickThroughUrl");
        Intrinsics.checkNotNullParameter(vastClickTrackers, "vastClickTrackers");
        this.a = clickThroughUrl;
        this.b = vastClickTrackers;
    }
}
