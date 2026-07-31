package com.ironsource;

import android.app.Activity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public interface F8 {

    public interface a {
        void onNativeAdClicked();

        void onNativeAdLoadFailed(@NotNull String str);

        void onNativeAdLoadSuccess(@NotNull D8 d8);

        void onNativeAdShown();
    }

    void a();

    void a(@NotNull Activity activity, @NotNull JSONObject jSONObject);

    void a(@Nullable a aVar);

    void a(@NotNull G8 g8);

    @Nullable
    a b();

    @Nullable
    D8 c();
}
