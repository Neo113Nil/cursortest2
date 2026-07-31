package com.monetization.ads.mediation.nativeads;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0001\u0019B+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdImage;", "", "", "width", "height", "", "url", "Landroid/graphics/drawable/Drawable;", "drawable", "<init>", "(IILjava/lang/String;Landroid/graphics/drawable/Drawable;)V", "a", "I", "getWidth", "()I", "b", "getHeight", "c", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "d", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "Builder", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MediatedNativeAdImage {

    /* renamed from: a, reason: from kotlin metadata */
    private final int width;

    /* renamed from: b, reason: from kotlin metadata */
    private final int height;

    /* renamed from: c, reason: from kotlin metadata */
    private final String url;

    /* renamed from: d, reason: from kotlin metadata */
    private final Drawable drawable;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdImage$Builder;", "", "", "url", "<init>", "(Ljava/lang/String;)V", "Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdImage;", "build", "()Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdImage;", "", "width", "setWidth", "(I)Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdImage$Builder;", "height", "setHeight", "Landroid/graphics/drawable/Drawable;", "drawable", "setDrawable", "(Landroid/graphics/drawable/Drawable;)Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdImage$Builder;", "a", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: from kotlin metadata */
        private final String url;
        private int b;
        private int c;
        private Drawable d;

        public Builder(@NotNull String str) {
            this.url = str;
        }

        @NotNull
        public final MediatedNativeAdImage build() {
            return new MediatedNativeAdImage(this.b, this.c, this.url, this.d, null);
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final Builder setDrawable(@Nullable Drawable drawable) {
            this.d = drawable;
            return this;
        }

        @NotNull
        public final Builder setHeight(int height) {
            this.c = height;
            return this;
        }

        @NotNull
        public final Builder setWidth(int width) {
            this.b = width;
            return this;
        }
    }

    public /* synthetic */ MediatedNativeAdImage(int i, int i2, String str, Drawable drawable, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, drawable);
    }

    @Nullable
    public final Drawable getDrawable() {
        return this.drawable;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    private MediatedNativeAdImage(int i, int i2, String str, Drawable drawable) {
        this.width = i;
        this.height = i2;
        this.url = str;
        this.drawable = drawable;
    }
}
