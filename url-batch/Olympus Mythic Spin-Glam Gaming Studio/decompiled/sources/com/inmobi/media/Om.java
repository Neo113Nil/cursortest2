package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class Om extends G6 {
    public final String a;
    public final ArrayList b;
    public final ArrayList c;
    public final AdConfig.VastVideoConfig d;
    public final C4270pn e;
    public final C4163lm f;
    public final Pn g;
    public final C3933d4 h;

    public Om(String mediaDuration, ArrayList companionAds, ArrayList mediaFiles, AdConfig.VastVideoConfig vastVideoConfig, C4270pn videoPlayerConfig, C4163lm videoBeaconProcessor, Pn videoTelemetryHelper, C3933d4 companionTelemetryHelper) {
        Intrinsics.checkNotNullParameter(mediaDuration, "mediaDuration");
        Intrinsics.checkNotNullParameter(companionAds, "companionAds");
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        Intrinsics.checkNotNullParameter(vastVideoConfig, "vastVideoConfig");
        Intrinsics.checkNotNullParameter(videoPlayerConfig, "videoPlayerConfig");
        Intrinsics.checkNotNullParameter(videoBeaconProcessor, "videoBeaconProcessor");
        Intrinsics.checkNotNullParameter(videoTelemetryHelper, "videoTelemetryHelper");
        Intrinsics.checkNotNullParameter(companionTelemetryHelper, "companionTelemetryHelper");
        this.a = mediaDuration;
        this.b = companionAds;
        this.c = mediaFiles;
        this.d = vastVideoConfig;
        this.e = videoPlayerConfig;
        this.f = videoBeaconProcessor;
        this.g = videoTelemetryHelper;
        this.h = companionTelemetryHelper;
    }
}
