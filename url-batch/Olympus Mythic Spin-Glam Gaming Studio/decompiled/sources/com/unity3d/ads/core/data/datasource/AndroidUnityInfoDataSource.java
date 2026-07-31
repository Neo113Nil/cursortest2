package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.preferences.AndroidPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidUnityInfoDataSource.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\b\u0010\t\u001a\u0004\u0018\u00010\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidUnityInfoDataSource;", "", "applicationContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "prefName", "", "getUnityInstallationId", "getUnityMegaSessionId", "getPlayerPrefId", "key", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AndroidUnityInfoDataSource {

    @NotNull
    private final String prefName;

    public AndroidUnityInfoDataSource(@NotNull Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.prefName = applicationContext.getPackageName() + ".v2.playerprefs";
    }

    @Nullable
    public final String getUnityInstallationId() {
        return getPlayerPrefId(UnityAdsConstants.Preferences.PREF_KEY_UNITY_INSTALLATION_ID);
    }

    @Nullable
    public final String getUnityMegaSessionId() {
        return getPlayerPrefId(UnityAdsConstants.Preferences.PREF_KEY_UNITY_MEGA_SESSION_ID);
    }

    private final String getPlayerPrefId(String key) {
        String string = AndroidPreferences.getString(this.prefName, key);
        if (string == null) {
            return null;
        }
        if (StringsKt.isBlank(string)) {
            string = null;
        }
        return string;
    }
}
