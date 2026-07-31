package com.my.target;

import android.graphics.Bitmap;
import com.my.target.common.models.ImageData;
import com.my.target.internal.api.internalnativead.models.InternalImageData;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class i7 implements InternalImageData {
    private final ImageData a;

    private i7(ImageData imageData) {
        this.a = imageData;
    }

    public static i7 a(ImageData imageData) {
        return new i7(imageData);
    }

    public Bitmap getBitmap() {
        return this.a.getBitmap();
    }

    public int getHeight() {
        return this.a.getHeight();
    }

    public String getUrl() {
        return this.a.getUrl();
    }

    public int getWidth() {
        return this.a.getWidth();
    }

    public String toString() {
        return "InternalImageData{width=" + getWidth() + ", height=" + getHeight() + ", url=" + getUrl() + ", bitmap=" + getBitmap() + '}';
    }

    public ImageData a() {
        return this.a;
    }
}
