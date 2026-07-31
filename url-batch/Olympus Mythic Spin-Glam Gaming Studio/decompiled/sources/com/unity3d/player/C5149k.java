package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.AssetPackManager;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStates;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;

/* renamed from: com.unity3d.player.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5149k implements OnCompleteListener {
    private IAssetPackManagerDownloadStatusCallback a;
    private Looper b = Looper.myLooper();
    private String c;

    public C5149k(String str, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        this.a = iAssetPackManagerDownloadStatusCallback;
        this.c = str;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        C5155n c5155n;
        C5155n c5155n2;
        Object obj;
        HashSet hashSet;
        AssetPackManager assetPackManager;
        AssetPackManager assetPackManager2;
        try {
            AssetPackStates assetPackStates = (AssetPackStates) task.getResult();
            Map packStates = assetPackStates.packStates();
            if (packStates.size() == 0) {
                return;
            }
            for (AssetPackState assetPackState : packStates.values()) {
                if (assetPackState.errorCode() != 0 || assetPackState.status() == 4 || assetPackState.status() == 5 || assetPackState.status() == 0) {
                    String name = assetPackState.name();
                    int status = assetPackState.status();
                    int errorCode = assetPackState.errorCode();
                    long j = assetPackStates.totalBytes();
                    new Handler(this.b).post(new RunnableC5141g(Collections.singleton(this.a), name, status, j, status == 4 ? j : 0L, 0, errorCode));
                } else {
                    c5155n = C5155n.d;
                    String name2 = assetPackState.name();
                    IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback = this.a;
                    Looper looper = this.b;
                    c5155n.getClass();
                    c5155n2 = C5155n.d;
                    synchronized (c5155n2) {
                        try {
                            obj = c5155n.c;
                            if (obj == null) {
                                C5143h c5143h = new C5143h(c5155n, iAssetPackManagerDownloadStatusCallback, looper);
                                assetPackManager2 = c5155n.a;
                                assetPackManager2.registerListener(c5143h);
                                c5155n.c = c5143h;
                            } else {
                                ((C5143h) obj).a(iAssetPackManagerDownloadStatusCallback);
                            }
                            hashSet = c5155n.b;
                            hashSet.add(name2);
                            assetPackManager = c5155n.a;
                            assetPackManager.fetch(Collections.singletonList(name2));
                        } finally {
                        }
                    }
                }
            }
        } catch (RuntimeExecutionException e) {
            e = e;
            String str = this.c;
            do {
                e = e.getCause();
            } while (e != null);
            new Handler(this.b).post(new RunnableC5141g(Collections.singleton(this.a), str, 0, 0L, 0L, 0, -100));
        }
    }
}
