package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.o8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4229o8 extends AbstractC4295qm {
    public final HtmlVideoPlaybackState a;
    public final int b;

    public C4229o8(HtmlVideoPlaybackState videoReadyEvent, int i) {
        Intrinsics.checkNotNullParameter(videoReadyEvent, "videoReadyEvent");
        this.a = videoReadyEvent;
        this.b = i;
    }
}
