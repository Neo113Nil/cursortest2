package com.ironsource.mediationsdk.ads.nativead.interfaces;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public interface NativeAdDataInterface {

    public static class Image {

        @Nullable
        private final Drawable a;

        @Nullable
        private final Uri b;

        public Image(@Nullable Drawable drawable, @Nullable Uri uri) {
            this.a = drawable;
            this.b = uri;
        }

        @Nullable
        public final Drawable getDrawable() {
            return this.a;
        }

        @Nullable
        public final Uri getUri() {
            return this.b;
        }
    }

    @Nullable
    String getAdvertiser();

    @Nullable
    String getBody();

    @Nullable
    String getCallToAction();

    @Nullable
    Image getIcon();

    @Nullable
    String getTitle();
}
