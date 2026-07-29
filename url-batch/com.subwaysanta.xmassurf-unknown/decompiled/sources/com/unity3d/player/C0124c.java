package com.unity3d.player;

import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.unity3d.player.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0124c implements AssetPackStateUpdateListener {
    public final HashSet a;
    public final UnityPlayer b;
    public final /* synthetic */ C0136i c;

    public final void onStateUpdate(Object obj) {
        AssetPackState assetPackState = (AssetPackState) obj;
        synchronized (this) {
            if (assetPackState.status() == 4 || assetPackState.status() == 5 || assetPackState.status() == 0) {
                synchronized (C0136i.e) {
                    this.c.c.remove(assetPackState.name());
                    if (this.c.c.isEmpty()) {
                        C0136i c0136i = this.c;
                        C0124c c0124c = c0136i.d;
                        if (c0124c instanceof C0124c) {
                            c0136i.b.unregisterListener(c0124c);
                        }
                        this.c.d = null;
                    }
                }
            }
            if (this.a.size() == 0) {
                return;
            }
            this.b.invokeOnMainThread(new RunnableC0122b((Set) this.a.clone(), assetPackState.name(), assetPackState.status(), assetPackState.totalBytesToDownload(), assetPackState.bytesDownloaded(), assetPackState.transferProgressPercentage(), assetPackState.errorCode()));
        }
    }

    public C0124c(C0136i c0136i, UnityPlayer unityPlayer, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        this.c = c0136i;
        this.b = unityPlayer;
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        hashSet.add(iAssetPackManagerDownloadStatusCallback);
    }

    public final synchronized void a(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        this.a.add(iAssetPackManagerDownloadStatusCallback);
    }
}
