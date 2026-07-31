package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.pn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4270pn {
    public final boolean a;
    public final boolean b;
    public final Wg c;
    public final S1 d;
    public final C4087io e;

    public C4270pn(boolean z, VideoExperience videoExperience, AdConfig.NativeConfig nativeConfig) {
        Intrinsics.checkNotNullParameter(videoExperience, "videoExperience");
        Intrinsics.checkNotNullParameter(nativeConfig, "nativeConfig");
        this.a = z;
        Boolean loopVideoOnComplete = videoExperience.getLoopVideoOnComplete();
        this.b = loopVideoOnComplete != null ? loopVideoOnComplete.booleanValue() : nativeConfig.getVideoPlayerConfig().getLoopVideoOnComplete();
        this.c = new Wg(videoExperience, nativeConfig.getVideoPlayerConfig().getLoopVideoOnComplete(), nativeConfig.getVideoPlayerConfig().getProgressConfig());
        this.d = new S1(videoExperience, nativeConfig.getVideoPlayerConfig().getAudioConfig());
        this.e = new C4087io(nativeConfig.getVideoPlayerConfig().getViewability());
    }
}
