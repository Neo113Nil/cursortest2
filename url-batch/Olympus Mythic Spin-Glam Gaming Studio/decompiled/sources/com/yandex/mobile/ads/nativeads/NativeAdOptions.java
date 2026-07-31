package com.yandex.mobile.ads.nativeads;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u0013\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/yandex/mobile/ads/nativeads/NativeAdOptions;", "", "", "shouldLoadImagesAutomatically", "<init>", "(Z)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Z", "getShouldLoadImagesAutomatically", "()Z", "Builder", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class NativeAdOptions {

    /* renamed from: a, reason: from kotlin metadata */
    private final boolean shouldLoadImagesAutomatically;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/mobile/ads/nativeads/NativeAdOptions$Builder;", "", "<init>", "()V", "", "shouldLoadImagesAutomatically", "setShouldLoadImagesAutomatically", "(Z)Lcom/yandex/mobile/ads/nativeads/NativeAdOptions$Builder;", "Lcom/yandex/mobile/ads/nativeads/NativeAdOptions;", "build", "()Lcom/yandex/mobile/ads/nativeads/NativeAdOptions;", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private boolean a = true;

        @NotNull
        public final NativeAdOptions build() {
            return new NativeAdOptions(this.a);
        }

        @NotNull
        public final Builder setShouldLoadImagesAutomatically(boolean shouldLoadImagesAutomatically) {
            this.a = shouldLoadImagesAutomatically;
            return this;
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return other != null && Intrinsics.areEqual(NativeAdOptions.class, other.getClass()) && this.shouldLoadImagesAutomatically == ((NativeAdOptions) other).shouldLoadImagesAutomatically;
    }

    public final boolean getShouldLoadImagesAutomatically() {
        return this.shouldLoadImagesAutomatically;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldLoadImagesAutomatically);
    }

    public NativeAdOptions(boolean z) {
        this.shouldLoadImagesAutomatically = z;
    }
}
