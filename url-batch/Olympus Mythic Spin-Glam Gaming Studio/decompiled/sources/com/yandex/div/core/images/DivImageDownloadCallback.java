package com.yandex.div.core.images;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.yandex.div.core.annotations.PublicApi;

@PublicApi
/* loaded from: classes15.dex */
public class DivImageDownloadCallback {
    @Nullable
    @UiThread
    public String getAdditionalLogInfo() {
        return null;
    }

    @UiThread
    public void onError() {
    }

    @UiThread
    public void onScheduling() {
    }

    @UiThread
    public void onSuccess(@NonNull Drawable drawable) {
    }

    @UiThread
    public void onSuccess(@NonNull PictureDrawable pictureDrawable) {
    }

    @UiThread
    public void onSuccess(@NonNull CachedBitmap cachedBitmap) {
    }

    @UiThread
    public void onCancel() {
        onError();
    }
}
