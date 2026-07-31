package com.my.target.mediation;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public interface AdNetworkLoader {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface AdParamsListener {
        void onLoad(@NonNull AdNetworkLoader adNetworkLoader, @NonNull Map<String, String> map, @Nullable String str);
    }

    void loadParams(@NonNull String str, @NonNull Context context);

    void setAdParamsListener(@Nullable AdParamsListener adParamsListener);
}
