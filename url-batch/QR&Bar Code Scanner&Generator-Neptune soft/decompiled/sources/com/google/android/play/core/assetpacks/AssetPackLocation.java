package com.google.android.play.core.assetpacks;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes2.dex */
public abstract class AssetPackLocation {
    private static final AssetPackLocation zza = new zzbm(1, null, null);

    static AssetPackLocation zza() {
        return zza;
    }

    public abstract String assetsPath();

    public abstract int packStorageMethod();

    public abstract String path();
}
