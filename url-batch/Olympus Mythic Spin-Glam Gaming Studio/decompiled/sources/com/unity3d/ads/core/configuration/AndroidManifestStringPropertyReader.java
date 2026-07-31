package com.unity3d.ads.core.configuration;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidManifestStringPropertyReader.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/configuration/AndroidManifestStringPropertyReader;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getPropertyByName", "", "propertyName", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidManifestStringPropertyReader {

    @NotNull
    private final Context context;

    public AndroidManifestStringPropertyReader(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Nullable
    public final String getPropertyByName(@NotNull String propertyName) {
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        try {
            return this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128).metaData.getString(propertyName);
        } catch (Exception unused) {
            return null;
        }
    }
}
