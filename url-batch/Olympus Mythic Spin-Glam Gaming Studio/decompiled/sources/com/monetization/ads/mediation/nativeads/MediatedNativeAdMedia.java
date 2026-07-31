package com.monetization.ads.mediation.nativeads;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdMedia;", "", "", "aspectRatio", "", "hasVideo", "<init>", "(FZ)V", "a", "F", "getAspectRatio", "()F", "b", "Z", "getHasVideo", "()Z", "Builder", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MediatedNativeAdMedia {

    /* renamed from: a, reason: from kotlin metadata */
    private final float aspectRatio;

    /* renamed from: b, reason: from kotlin metadata */
    private final boolean hasVideo;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdMedia$Builder;", "", "", "aspectRatio", "<init>", "(F)V", "", "video", "setHasVideo", "(Z)Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdMedia$Builder;", "Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdMedia;", "build", "()Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdMedia;", "a", "F", "getAspectRatio", "()F", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: from kotlin metadata */
        private final float aspectRatio;
        private boolean b;

        public Builder(float f) {
            this.aspectRatio = f;
        }

        @NotNull
        public final MediatedNativeAdMedia build() {
            return new MediatedNativeAdMedia(this.aspectRatio, this.b, null);
        }

        public final float getAspectRatio() {
            return this.aspectRatio;
        }

        @NotNull
        public final Builder setHasVideo(boolean video) {
            this.b = video;
            return this;
        }
    }

    public /* synthetic */ MediatedNativeAdMedia(float f, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, z);
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final boolean getHasVideo() {
        return this.hasVideo;
    }

    private MediatedNativeAdMedia(float f, boolean z) {
        this.aspectRatio = f;
        this.hasVideo = z;
    }
}
