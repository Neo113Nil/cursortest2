package com.yandex.mobile.ads.banner;

import android.content.Context;
import com.pubmatic.sdk.common.POBCommonConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.cj2;
import yads.ju0;
import yads.k03;
import yads.l03;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0014\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/yandex/mobile/ads/banner/BannerAdSize;", "Lyads/cj2;", "Lyads/l03;", "sizeInfo", "<init>", "(Lyads/l03;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHeight", "height", "getWidth", "width", "a", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BannerAdSize extends cj2 {

    /* renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final l03 b;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/yandex/mobile/ads/banner/BannerAdSize$a;", "", "Landroid/content/Context;", "context", "", "width", "height", "Lcom/yandex/mobile/ads/banner/BannerAdSize;", "fixed", "(Landroid/content/Context;II)Lcom/yandex/mobile/ads/banner/BannerAdSize;", "maxHeight", POBCommonConstants.BANNER_PLACEMENT_TYPE, "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.yandex.mobile.ads.banner.BannerAdSize$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final BannerAdSize fixed(@NotNull Context context, int width, int height) {
            return new BannerAdSize(new ju0(width, height, k03.c, null, 24));
        }

        @NotNull
        public final BannerAdSize inline(@NotNull Context context, int width, int maxHeight) {
            return new BannerAdSize(new ju0(width, maxHeight, k03.d, null, 24));
        }
    }

    public BannerAdSize(@NotNull l03 l03Var) {
        this.b = l03Var;
    }

    @NotNull
    public static final BannerAdSize fixed(@NotNull Context context, int i, int i2) {
        return INSTANCE.fixed(context, i, i2);
    }

    @NotNull
    public static final BannerAdSize inline(@NotNull Context context, int i, int i2) {
        return INSTANCE.inline(context, i, i2);
    }

    /* renamed from: a, reason: from getter */
    protected final l03 getB() {
        return this.b;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(BannerAdSize.class, other.getClass())) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((BannerAdSize) other).b);
    }

    public final int getHeight() {
        return this.b.getHeight();
    }

    public final int getWidth() {
        return this.b.getWidth();
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    @NotNull
    public String toString() {
        return this.b.toString();
    }
}
