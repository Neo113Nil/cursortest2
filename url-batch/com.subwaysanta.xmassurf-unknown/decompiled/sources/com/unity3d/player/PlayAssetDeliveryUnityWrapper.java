package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import com.google.android.play.core.assetpacks.AssetPackLocation;
import com.unity3d.player.a.AbstractC0120t;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
class PlayAssetDeliveryUnityWrapper {
    private static PlayAssetDeliveryUnityWrapper b;
    private final C0136i a;

    private PlayAssetDeliveryUnityWrapper(UnityPlayer unityPlayer, Context context) {
        this.a = null;
        if (b != null) {
            throw new RuntimeException("PlayAssetDeliveryUnityWrapper should be created only once. Use getInstance() instead.");
        }
        try {
            if (getClass().getClassLoader().loadClass("com.google.android.play.core.assetpacks.AssetPackManager").getMethod("getPackStates", List.class).getReturnType().getName().equals("com.google.android.gms.tasks.Task")) {
                this.a = a(unityPlayer, context);
            }
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException unused) {
        }
    }

    public static synchronized PlayAssetDeliveryUnityWrapper getInstance() {
        PlayAssetDeliveryUnityWrapper playAssetDeliveryUnityWrapper;
        synchronized (PlayAssetDeliveryUnityWrapper.class) {
            while (true) {
                playAssetDeliveryUnityWrapper = b;
                if (playAssetDeliveryUnityWrapper != null) {
                    break;
                }
                try {
                    PlayAssetDeliveryUnityWrapper.class.wait(3000L);
                } catch (InterruptedException e) {
                    AbstractC0120t.Log(6, e.getMessage());
                }
            }
            if (playAssetDeliveryUnityWrapper == null) {
                throw new RuntimeException("PlayAssetDeliveryUnityWrapper is not yet initialised.");
            }
        }
        return playAssetDeliveryUnityWrapper;
    }

    private static C0136i a(UnityPlayer unityPlayer, Context context) {
        if (C0136i.e == null) {
            C0136i.e = new C0136i(unityPlayer, context);
        }
        return C0136i.e;
    }

    public static synchronized PlayAssetDeliveryUnityWrapper init(UnityPlayer unityPlayer, Context context) {
        PlayAssetDeliveryUnityWrapper playAssetDeliveryUnityWrapper;
        synchronized (PlayAssetDeliveryUnityWrapper.class) {
            if (b != null) {
                throw new RuntimeException("PlayAssetDeliveryUnityWrapper.init() should be called only once. Use getInstance() instead.");
            }
            b = new PlayAssetDeliveryUnityWrapper(unityPlayer, context);
            PlayAssetDeliveryUnityWrapper.class.notifyAll();
            playAssetDeliveryUnityWrapper = b;
        }
        return playAssetDeliveryUnityWrapper;
    }

    public void getAssetPackState(String str, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback) {
        getAssetPackStates(new String[]{str}, iAssetPackManagerStatusQueryCallback);
    }

    public void getAssetPackStates(String[] strArr, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback) {
        a();
        C0136i c0136i = this.a;
        c0136i.b.getPackStates(Arrays.asList(strArr)).addOnCompleteListener(new C0134h(c0136i.a, iAssetPackManagerStatusQueryCallback, strArr));
    }

    public void downloadAssetPack(String str, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        downloadAssetPacks(new String[]{str}, iAssetPackManagerDownloadStatusCallback);
    }

    public void downloadAssetPacks(String[] strArr, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        a();
        C0136i c0136i = this.a;
        c0136i.getClass();
        if (strArr == null || strArr.length == 0) {
            return;
        }
        c0136i.b.getPackStates(Arrays.asList(strArr)).addOnCompleteListener(new C0130f(c0136i.a, iAssetPackManagerDownloadStatusCallback, strArr));
    }

    public Object registerDownloadStatusListener(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        a();
        C0136i c0136i = this.a;
        C0124c c0124c = new C0124c(c0136i, c0136i.a, iAssetPackManagerDownloadStatusCallback);
        c0136i.b.registerListener(c0124c);
        return c0124c;
    }

    public void unregisterDownloadStatusListener(Object obj) {
        a();
        C0136i c0136i = this.a;
        c0136i.getClass();
        if (obj instanceof C0124c) {
            c0136i.b.unregisterListener((C0124c) obj);
        }
    }

    public void requestToUseMobileData(Activity activity, IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback) {
        a();
        C0136i c0136i = this.a;
        c0136i.b.showCellularDataConfirmation(activity).addOnSuccessListener(new C0128e(c0136i.a, iAssetPackManagerMobileDataConfirmationCallback));
    }

    public String getAssetPackPath(String str) {
        a();
        AssetPackLocation packLocation = this.a.b.getPackLocation(str);
        if (packLocation == null) {
            return "";
        }
        return packLocation.assetsPath();
    }

    public void cancelAssetPackDownload(String str) {
        cancelAssetPackDownloads(new String[]{str});
    }

    public void cancelAssetPackDownloads(String[] strArr) {
        a();
        this.a.b.cancel(Arrays.asList(strArr));
    }

    public void removeAssetPack(String str) {
        a();
        this.a.b.removePack(str);
    }

    public boolean playCoreApiMissing() {
        return this.a == null;
    }

    private void a() {
        if (playCoreApiMissing()) {
            throw new RuntimeException("AssetPackManager API is not available! Make sure your gradle project includes 'com.google.android.play:asset-delivery' dependency.");
        }
    }
}
