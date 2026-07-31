package com.mobilefuse.videoplayer.model;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.mobilefuse.videoplayer.model.EnumWithValue;
import io.bidmachine.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: enums.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/mobilefuse/videoplayer/model/VastPlayerCapability;", "", "Lcom/mobilefuse/videoplayer/model/EnumWithValue;", "", "value", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", HlsMediaPlaylist.Interstitial.NAVIGATION_RESTRICTION_SKIP, "MUTE", "AUTOPLAY", "MUTED_AUTOPLAY", "FULLSCREEN", NativeAdContent.ViewTag.AD_ICON, "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes4.dex */
public enum VastPlayerCapability implements EnumWithValue<String> {
    SKIP("skip"),
    MUTE("mute"),
    AUTOPLAY("autoplay"),
    MUTED_AUTOPLAY("mautoplay"),
    FULLSCREEN("fullscreen"),
    ICON("icon");


    @NotNull
    private final String value;

    VastPlayerCapability(String str) {
        this.value = str;
    }

    @Override // com.mobilefuse.videoplayer.model.EnumWithValue
    @NotNull
    public String getStringValue() {
        return EnumWithValue.DefaultImpls.getStringValue(this);
    }

    @Override // com.mobilefuse.videoplayer.model.EnumWithValue
    @NotNull
    public String getValue() {
        return this.value;
    }
}
