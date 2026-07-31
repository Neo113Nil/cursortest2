package com.my.target.instreamads.postview.models;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.qrcta.QrCta;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class CallToActionData {
    private final String a;
    private final Integer b;
    private final Integer c;
    private final String d;
    private final ImageData e;
    private final QrCta f;

    private CallToActionData(String str, Integer num, Integer num2, String str2, ImageData imageData, QrCta qrCta) {
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = str2;
        this.e = imageData;
        this.f = qrCta;
    }

    public static CallToActionData a(String str, Integer num, Integer num2, String str2, ImageData imageData, QrCta qrCta) {
        return new CallToActionData(str, num, num2, str2, imageData, qrCta);
    }

    @Nullable
    public String getAdditionalText() {
        return this.d;
    }

    @ColorInt
    @Nullable
    public Integer getButtonColor() {
        return this.b;
    }

    @NotNull
    public String getButtonText() {
        return this.a;
    }

    @Nullable
    public ImageData getIcon() {
        return this.e;
    }

    @Nullable
    public QrCta getQrCta() {
        return this.f;
    }

    @ColorInt
    @Nullable
    public Integer getTextColor() {
        return this.c;
    }

    @NonNull
    public String toString() {
        return "CallToActionData{buttonText=" + this.a + ", buttonColor=" + this.b + ", textColor=" + this.c + ", additionalText=" + this.d + ", qrCta=" + this.f + '}';
    }
}
