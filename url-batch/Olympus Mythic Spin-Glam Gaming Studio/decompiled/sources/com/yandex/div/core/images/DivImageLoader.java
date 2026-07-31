package com.yandex.div.core.images;

import android.widget.ImageView;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;

/* loaded from: classes12.dex */
public interface DivImageLoader {
    @NonNull
    @MainThread
    LoadReference loadImage(@NonNull String str, @NonNull ImageView imageView);

    @NonNull
    @MainThread
    LoadReference loadImage(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback);

    @NonNull
    @MainThread
    LoadReference loadImageBytes(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback);

    default Boolean hasSvgSupport() {
        return Boolean.FALSE;
    }

    @NonNull
    @MainThread
    default LoadReference loadImage(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback, int i) {
        return loadImage(str, divImageDownloadCallback);
    }

    @NonNull
    @MainThread
    default LoadReference loadImageBytes(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback, int i) {
        return loadImageBytes(str, divImageDownloadCallback);
    }
}
