package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class S1 {
    public final boolean a;
    public final int b;
    public final int c;
    public final C4153lc d;
    public final int e;

    public S1(VideoExperience videoExperience, AdConfig.VideoPlayerAudioConfig audioConfig) {
        C4153lc c4153lc;
        C4153lc c4153lc2;
        Intrinsics.checkNotNullParameter(videoExperience, "videoExperience");
        Intrinsics.checkNotNullParameter(audioConfig, "audioConfig");
        Boolean startMuted = videoExperience.getAudio().getStartMuted();
        this.a = startMuted != null ? startMuted.booleanValue() : audioConfig.getStartMuted();
        Integer muteIconWidth = videoExperience.getAudio().getMuteIconWidth();
        this.b = muteIconWidth != null ? muteIconWidth.intValue() : audioConfig.getMuteIconWidth();
        Integer muteIconHeight = videoExperience.getAudio().getMuteIconHeight();
        this.c = muteIconHeight != null ? muteIconHeight.intValue() : audioConfig.getMuteIconHeight();
        int[] muteIconMargin = videoExperience.getAudio().getMuteIconMargin();
        if (muteIconMargin != null) {
            Intrinsics.checkNotNullParameter(muteIconMargin, "<this>");
            if (muteIconMargin.length != 4) {
                c4153lc2 = new C4153lc(0, 0, 0, 0);
            } else {
                c4153lc = new C4153lc(muteIconMargin[0], muteIconMargin[1], muteIconMargin[2], muteIconMargin[3]);
                c4153lc2 = c4153lc;
            }
        } else {
            List<Integer> muteIconMargin2 = audioConfig.getMuteIconMargin();
            Intrinsics.checkNotNullParameter(muteIconMargin2, "<this>");
            if (muteIconMargin2.size() != 4) {
                c4153lc2 = new C4153lc(0, 0, 0, 0);
            } else {
                c4153lc = new C4153lc(muteIconMargin2.get(0).intValue(), muteIconMargin2.get(1).intValue(), muteIconMargin2.get(2).intValue(), muteIconMargin2.get(3).intValue());
                c4153lc2 = c4153lc;
            }
        }
        this.d = c4153lc2;
        Integer muteIconPosition = videoExperience.getAudio().getMuteIconPosition();
        this.e = muteIconPosition != null ? muteIconPosition.intValue() : audioConfig.getMuteIconPosition();
    }
}
