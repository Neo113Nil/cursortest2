package com.smaato.sdk.ng.utils;

import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.vpaid.enums.AudioState;

/* loaded from: classes6.dex */
public class AdAudioStateManager {
    public static AudioState getAudioState(Ad ad, boolean z) {
        return z ? (ad == null || ad.getAudioState() == null || AudioState.fromString(ad.getAudioState()) == null) ? NextGen.getVideoAudioStatus() : AudioState.fromString(ad.getAudioState()) : AudioState.MUTED;
    }
}
