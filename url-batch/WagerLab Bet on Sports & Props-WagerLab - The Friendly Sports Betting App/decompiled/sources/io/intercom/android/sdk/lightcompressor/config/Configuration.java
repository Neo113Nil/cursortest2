package io.intercom.android.sdk.lightcompressor.config;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.lightcompressor.VideoQuality;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Configuration.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b+\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\"J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003Jj\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u0007HÖ\u0001J\t\u00109\u001a\u00020\u000fHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006:"}, d2 = {"Lio/intercom/android/sdk/lightcompressor/config/Configuration;", "", "quality", "Lio/intercom/android/sdk/lightcompressor/VideoQuality;", "isMinBitrateCheckEnabled", "", "videoBitrateInMbps", "", "disableAudio", "keepOriginalResolution", "videoHeight", "", "videoWidth", "videoNames", "", "", "<init>", "(Lio/intercom/android/sdk/lightcompressor/VideoQuality;ZLjava/lang/Integer;ZZLjava/lang/Double;Ljava/lang/Double;Ljava/util/List;)V", "getQuality", "()Lio/intercom/android/sdk/lightcompressor/VideoQuality;", "setQuality", "(Lio/intercom/android/sdk/lightcompressor/VideoQuality;)V", "()Z", "setMinBitrateCheckEnabled", "(Z)V", "getVideoBitrateInMbps", "()Ljava/lang/Integer;", "setVideoBitrateInMbps", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDisableAudio", "setDisableAudio", "getKeepOriginalResolution", "getVideoHeight", "()Ljava/lang/Double;", "setVideoHeight", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getVideoWidth", "setVideoWidth", "getVideoNames", "()Ljava/util/List;", "setVideoNames", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lio/intercom/android/sdk/lightcompressor/VideoQuality;ZLjava/lang/Integer;ZZLjava/lang/Double;Ljava/lang/Double;Ljava/util/List;)Lio/intercom/android/sdk/lightcompressor/config/Configuration;", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-lightcompressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Configuration {
    private boolean disableAudio;
    private boolean isMinBitrateCheckEnabled;
    private final boolean keepOriginalResolution;
    private VideoQuality quality;
    private Integer videoBitrateInMbps;
    private Double videoHeight;
    private List<String> videoNames;
    private Double videoWidth;

    public static /* synthetic */ Configuration copy$default(Configuration configuration, VideoQuality videoQuality, boolean z, Integer num, boolean z2, boolean z3, Double d, Double d2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            videoQuality = configuration.quality;
        }
        if ((i & 2) != 0) {
            z = configuration.isMinBitrateCheckEnabled;
        }
        if ((i & 4) != 0) {
            num = configuration.videoBitrateInMbps;
        }
        if ((i & 8) != 0) {
            z2 = configuration.disableAudio;
        }
        if ((i & 16) != 0) {
            z3 = configuration.keepOriginalResolution;
        }
        if ((i & 32) != 0) {
            d = configuration.videoHeight;
        }
        if ((i & 64) != 0) {
            d2 = configuration.videoWidth;
        }
        if ((i & 128) != 0) {
            list = configuration.videoNames;
        }
        Double d3 = d2;
        List list2 = list;
        boolean z4 = z3;
        Double d4 = d;
        return configuration.copy(videoQuality, z, num, z2, z4, d4, d3, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final VideoQuality getQuality() {
        return this.quality;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsMinBitrateCheckEnabled() {
        return this.isMinBitrateCheckEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getVideoBitrateInMbps() {
        return this.videoBitrateInMbps;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getDisableAudio() {
        return this.disableAudio;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getKeepOriginalResolution() {
        return this.keepOriginalResolution;
    }

    /* renamed from: component6, reason: from getter */
    public final Double getVideoHeight() {
        return this.videoHeight;
    }

    /* renamed from: component7, reason: from getter */
    public final Double getVideoWidth() {
        return this.videoWidth;
    }

    public final List<String> component8() {
        return this.videoNames;
    }

    public final Configuration copy(VideoQuality quality, boolean isMinBitrateCheckEnabled, Integer videoBitrateInMbps, boolean disableAudio, boolean keepOriginalResolution, Double videoHeight, Double videoWidth, List<String> videoNames) {
        Intrinsics.checkNotNullParameter(quality, "quality");
        Intrinsics.checkNotNullParameter(videoNames, "videoNames");
        return new Configuration(quality, isMinBitrateCheckEnabled, videoBitrateInMbps, disableAudio, keepOriginalResolution, videoHeight, videoWidth, videoNames);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) other;
        return this.quality == configuration.quality && this.isMinBitrateCheckEnabled == configuration.isMinBitrateCheckEnabled && Intrinsics.areEqual(this.videoBitrateInMbps, configuration.videoBitrateInMbps) && this.disableAudio == configuration.disableAudio && this.keepOriginalResolution == configuration.keepOriginalResolution && Intrinsics.areEqual((Object) this.videoHeight, (Object) configuration.videoHeight) && Intrinsics.areEqual((Object) this.videoWidth, (Object) configuration.videoWidth) && Intrinsics.areEqual(this.videoNames, configuration.videoNames);
    }

    public int hashCode() {
        int hashCode = ((this.quality.hashCode() * 31) + Boolean.hashCode(this.isMinBitrateCheckEnabled)) * 31;
        Integer num = this.videoBitrateInMbps;
        int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.disableAudio)) * 31) + Boolean.hashCode(this.keepOriginalResolution)) * 31;
        Double d = this.videoHeight;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.videoWidth;
        return ((hashCode3 + (d2 != null ? d2.hashCode() : 0)) * 31) + this.videoNames.hashCode();
    }

    public String toString() {
        return "Configuration(quality=" + this.quality + ", isMinBitrateCheckEnabled=" + this.isMinBitrateCheckEnabled + ", videoBitrateInMbps=" + this.videoBitrateInMbps + ", disableAudio=" + this.disableAudio + ", keepOriginalResolution=" + this.keepOriginalResolution + ", videoHeight=" + this.videoHeight + ", videoWidth=" + this.videoWidth + ", videoNames=" + this.videoNames + ')';
    }

    public Configuration(VideoQuality quality, boolean z, Integer num, boolean z2, boolean z3, Double d, Double d2, List<String> videoNames) {
        Intrinsics.checkNotNullParameter(quality, "quality");
        Intrinsics.checkNotNullParameter(videoNames, "videoNames");
        this.quality = quality;
        this.isMinBitrateCheckEnabled = z;
        this.videoBitrateInMbps = num;
        this.disableAudio = z2;
        this.keepOriginalResolution = z3;
        this.videoHeight = d;
        this.videoWidth = d2;
        this.videoNames = videoNames;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Configuration(VideoQuality videoQuality, boolean z, Integer num, boolean z2, boolean z3, Double d, Double d2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r5, z, r7, r8, r9, r10, r11, r12);
        Double d3;
        List list2;
        boolean z4;
        Double d4;
        Integer num2;
        boolean z5;
        VideoQuality videoQuality2;
        videoQuality = (i & 1) != 0 ? VideoQuality.MEDIUM : videoQuality;
        z = (i & 2) != 0 ? true : z;
        num = (i & 4) != 0 ? null : num;
        z2 = (i & 8) != 0 ? false : z2;
        z3 = (i & 16) != 0 ? false : z3;
        d = (i & 32) != 0 ? null : d;
        if ((i & 64) != 0) {
            d3 = null;
            z4 = z3;
            list2 = list;
            num2 = num;
            d4 = d;
            videoQuality2 = videoQuality;
            z5 = z2;
        } else {
            d3 = d2;
            list2 = list;
            z4 = z3;
            d4 = d;
            num2 = num;
            z5 = z2;
            videoQuality2 = videoQuality;
        }
    }

    public final VideoQuality getQuality() {
        return this.quality;
    }

    public final void setQuality(VideoQuality videoQuality) {
        Intrinsics.checkNotNullParameter(videoQuality, "<set-?>");
        this.quality = videoQuality;
    }

    public final boolean isMinBitrateCheckEnabled() {
        return this.isMinBitrateCheckEnabled;
    }

    public final void setMinBitrateCheckEnabled(boolean z) {
        this.isMinBitrateCheckEnabled = z;
    }

    public final Integer getVideoBitrateInMbps() {
        return this.videoBitrateInMbps;
    }

    public final void setVideoBitrateInMbps(Integer num) {
        this.videoBitrateInMbps = num;
    }

    public final boolean getDisableAudio() {
        return this.disableAudio;
    }

    public final void setDisableAudio(boolean z) {
        this.disableAudio = z;
    }

    public final boolean getKeepOriginalResolution() {
        return this.keepOriginalResolution;
    }

    public final Double getVideoHeight() {
        return this.videoHeight;
    }

    public final void setVideoHeight(Double d) {
        this.videoHeight = d;
    }

    public final Double getVideoWidth() {
        return this.videoWidth;
    }

    public final void setVideoWidth(Double d) {
        this.videoWidth = d;
    }

    public final List<String> getVideoNames() {
        return this.videoNames;
    }

    public final void setVideoNames(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.videoNames = list;
    }
}
