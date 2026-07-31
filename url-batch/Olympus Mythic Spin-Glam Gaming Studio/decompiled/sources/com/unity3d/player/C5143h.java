package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.unity3d.player.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5143h implements AssetPackStateUpdateListener {
    private HashSet a;
    private Looper b;
    final /* synthetic */ C5155n c;

    public C5143h(C5155n c5155n, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback, Looper looper) {
        this.c = c5155n;
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        hashSet.add(iAssetPackManagerDownloadStatusCallback);
        this.b = looper;
    }

    public final synchronized void a(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        this.a.add(iAssetPackManagerDownloadStatusCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055 A[Catch: all -> 0x0018, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0018, blocks: (B:4:0x0003, B:6:0x000a, B:8:0x0011, B:11:0x004b, B:16:0x0055, B:17:0x001a, B:18:0x001e, B:28:0x0089, B:20:0x001f, B:22:0x0038, B:23:0x004a), top: B:3:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onStateUpdate(Object obj) {
        C5155n c5155n;
        HashSet hashSet;
        HashSet hashSet2;
        Object obj2;
        AssetPackState assetPackState = (AssetPackState) obj;
        synchronized (this) {
            try {
                if (assetPackState.status() != 4) {
                    if (assetPackState.status() != 5) {
                        if (assetPackState.status() == 0) {
                        }
                        if (this.a.size() != 0) {
                            new Handler(this.b).post(new RunnableC5141g((Set) this.a.clone(), assetPackState.name(), assetPackState.status(), assetPackState.totalBytesToDownload(), assetPackState.bytesDownloaded(), assetPackState.transferProgressPercentage(), assetPackState.errorCode()));
                        }
                    }
                }
                c5155n = C5155n.d;
                synchronized (c5155n) {
                    try {
                        hashSet = this.c.b;
                        hashSet.remove(assetPackState.name());
                        hashSet2 = this.c.b;
                        if (hashSet2.isEmpty()) {
                            C5155n c5155n2 = this.c;
                            obj2 = c5155n2.c;
                            c5155n2.a(obj2);
                            this.c.c = null;
                        }
                    } finally {
                    }
                }
                if (this.a.size() != 0) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
