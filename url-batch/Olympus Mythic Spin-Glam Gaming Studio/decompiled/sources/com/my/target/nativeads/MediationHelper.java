package com.my.target.nativeads;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.nativeads.views.MediaAdView;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public final class MediationHelper {
    public static void registerView(@NonNull NativeAd nativeAd, @NonNull View view, @Nullable List<View> list, @Nullable MediaAdView mediaAdView) {
        nativeAd.a(view, list, mediaAdView);
    }
}
