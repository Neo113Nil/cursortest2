package com.inmobi.media;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Fn {
    public final List a;

    public Fn(List videoTrackers) {
        Intrinsics.checkNotNullParameter(videoTrackers, "videoTrackers");
        this.a = videoTrackers;
    }
}
