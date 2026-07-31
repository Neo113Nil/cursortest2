package com.mobilefuse.sdk.assetsmanager;

import android.content.Context;
import com.ironsource.V5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AssetManager.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&¨\u0006\r"}, d2 = {"Lcom/mobilefuse/sdk/assetsmanager/AssetManager;", "", "getSpecificAssetAbsolutePath", "", V5.c.b, "", "callback", "Lcom/mobilefuse/sdk/assetsmanager/ResultCallback;", "getSpecificAssetBytes", "", "context", "Landroid/content/Context;", "requestAssetsManifest", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes6.dex */
public interface AssetManager {
    void getSpecificAssetAbsolutePath(@NotNull String fileName, @NotNull ResultCallback callback);

    @Nullable
    byte[] getSpecificAssetBytes(@NotNull String fileName, @NotNull Context context);

    void requestAssetsManifest();
}
