package com.my.target.common.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public abstract class ShoppableAdsItem {

    @Nullable
    public final String deeplink;

    @Nullable
    public final String deeplinkFallbackUrl;

    @NonNull
    public final String id;

    @Nullable
    public final String oldPrice;

    @NonNull
    public final String picture;

    @Nullable
    public final String price;

    @NonNull
    public final String text;

    @NonNull
    public final String url;

    protected ShoppableAdsItem(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.url = str;
        this.id = str2;
        this.picture = str3;
        this.text = str4;
        this.price = str5;
        this.oldPrice = str6;
        this.deeplink = str7;
        this.deeplinkFallbackUrl = str8;
    }
}
