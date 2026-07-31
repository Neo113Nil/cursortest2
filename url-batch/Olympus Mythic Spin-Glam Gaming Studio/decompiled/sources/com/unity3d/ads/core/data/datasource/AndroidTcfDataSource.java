package com.unity3d.ads.core.data.datasource;

import com.unity3d.services.core.preferences.AndroidPreferences;
import com.unity3d.services.core.properties.ClientProperties;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidTcfDataSource.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidTcfDataSource;", "Lcom/unity3d/ads/core/data/datasource/TcfDataSource;", "<init>", "()V", "tcfString", "", "getTcfString", "()Ljava/lang/String;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AndroidTcfDataSource implements TcfDataSource {

    @NotNull
    public static final String TCF_TCSTRING_KEY = "IABTCF_TCString";

    @Override // com.unity3d.ads.core.data.datasource.TcfDataSource
    @Nullable
    public String getTcfString() {
        return AndroidPreferences.getString(ClientProperties.getAppName() + "_settings", "IABTCF_TCString");
    }
}
