package com.my.target.instreamads.postview.models;

import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.my.target.common.models.ImageData;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes13.dex */
public final class PostViewData {
    private final ImageData a;
    private final String b;
    private final double c;
    private final Integer d;

    private PostViewData(ImageData imageData, String str, double d, Integer num) {
        this.a = imageData;
        this.b = str;
        this.c = d;
        this.d = num;
    }

    public static PostViewData a(ImageData imageData, String str, double d, Integer num) {
        return new PostViewData(imageData, str, d, num);
    }

    @Nullable
    public ImageData getBackgroundImage() {
        return this.a;
    }

    public double getDuration() {
        return this.c;
    }

    @Nullable
    @ColorInt
    public Integer getOverlay() {
        return this.d;
    }

    @Nullable
    public String getText() {
        return this.b;
    }
}
