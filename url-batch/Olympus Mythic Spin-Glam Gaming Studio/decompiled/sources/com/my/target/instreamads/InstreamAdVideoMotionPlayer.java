package com.my.target.instreamads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.instreamads.InstreamAd;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes11.dex */
public interface InstreamAdVideoMotionPlayer {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface VideoMotionPlayerListener {
        void onBannerComplete(@NonNull Context context);

        void onBannerShow(@NonNull Context context);

        void onCloseByUser(@NonNull Context context);

        void onError(@NonNull String str, @NonNull Context context);

        void onHeaderClick(@NonNull Context context);

        void onItemClick(@NonNull String str, @NonNull Context context);

        void onItemShow(@NonNull String str, @NonNull Context context);
    }

    void playVideoMotionBanner(@NonNull InstreamAd.InstreamAdVideoMotionBanner instreamAdVideoMotionBanner);

    void setVideoMotionPlayerListener(@Nullable VideoMotionPlayerListener videoMotionPlayerListener);
}
