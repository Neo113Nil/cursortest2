package net.pubnative.lite.sdk.utils;

import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.vpaid.enums.AudioState;

/* loaded from: classes6.dex */
public class AdAudioStateManager {
    public static AudioState getAudioState(Ad ad, boolean z) {
        return z ? (ad == null || ad.getAudioState() == null || AudioState.fromString(ad.getAudioState()) == null) ? HyBid.getVideoAudioStatus() : AudioState.fromString(ad.getAudioState()) : AudioState.MUTED;
    }
}
