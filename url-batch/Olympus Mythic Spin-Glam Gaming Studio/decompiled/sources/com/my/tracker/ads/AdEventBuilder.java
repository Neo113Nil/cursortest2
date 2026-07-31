package com.my.tracker.ads;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class AdEventBuilder {
    final int a;
    final int b;
    final double c;
    final String d;
    String e;
    String f;
    String g;
    String h;

    private AdEventBuilder(int i, int i2, double d, String str) {
        this.a = i;
        this.b = i2;
        this.c = d;
        this.d = str;
    }

    @NonNull
    @AnyThread
    public static AdEventBuilder newClickBuilder(int i) {
        return new AdEventBuilder(18, i, Double.NaN, null);
    }

    @NonNull
    @AnyThread
    public static AdEventBuilder newImpressionBuilder(int i) {
        return new AdEventBuilder(17, i, Double.NaN, null);
    }

    @NonNull
    @AnyThread
    public static AdEventBuilder newRevenueBuilder(int i, double d, @NonNull String str) {
        return new AdEventBuilder(19, i, d, str);
    }

    @NonNull
    @AnyThread
    public AdEvent build() {
        return new AdEvent(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    @NonNull
    @AnyThread
    public AdEventBuilder withAdFormat(@Nullable String str) {
        this.h = str;
        return this;
    }

    @NonNull
    @AnyThread
    public AdEventBuilder withAdId(@Nullable String str) {
        this.g = str;
        return this;
    }

    @NonNull
    @AnyThread
    public AdEventBuilder withPlacementId(@Nullable String str) {
        this.f = str;
        return this;
    }

    @NonNull
    @AnyThread
    public AdEventBuilder withSource(@Nullable String str) {
        this.e = str;
        return this;
    }
}
