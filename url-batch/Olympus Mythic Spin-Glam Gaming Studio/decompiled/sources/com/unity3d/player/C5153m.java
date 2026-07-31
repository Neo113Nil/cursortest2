package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStates;
import java.util.Map;

/* renamed from: com.unity3d.player.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5153m implements OnCompleteListener {
    private IAssetPackManagerStatusQueryCallback a;
    private Looper b = Looper.myLooper();
    private String[] c;

    public C5153m(String[] strArr, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback) {
        this.a = iAssetPackManagerStatusQueryCallback;
        this.c = strArr;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        if (this.a == null) {
            return;
        }
        int i = 0;
        try {
            AssetPackStates assetPackStates = (AssetPackStates) task.getResult();
            Map packStates = assetPackStates.packStates();
            int size = packStates.size();
            String[] strArr = new String[size];
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            for (AssetPackState assetPackState : packStates.values()) {
                strArr[i] = assetPackState.name();
                iArr[i] = assetPackState.status();
                iArr2[i] = assetPackState.errorCode();
                i++;
            }
            new Handler(this.b).post(new RunnableC5151l(this.a, assetPackStates.totalBytes(), strArr, iArr, iArr2));
        } catch (RuntimeExecutionException e) {
            e = e;
            String message = e.getMessage();
            for (String str : this.c) {
                if (message.contains(str)) {
                    Handler handler = new Handler(this.b);
                    IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback = this.a;
                    String[] strArr2 = {str};
                    int[] iArr3 = {0};
                    do {
                        e = e.getCause();
                    } while (e != null);
                    handler.post(new RunnableC5151l(iAssetPackManagerStatusQueryCallback, 0L, strArr2, iArr3, new int[]{-100}));
                    return;
                }
            }
            String[] strArr3 = this.c;
            int[] iArr4 = new int[strArr3.length];
            int[] iArr5 = new int[strArr3.length];
            for (int i2 = 0; i2 < this.c.length; i2++) {
                iArr4[i2] = 0;
                Throwable th = e;
                do {
                    th = th.getCause();
                } while (th != null);
                iArr5[i2] = -100;
            }
            new Handler(this.b).post(new RunnableC5151l(this.a, 0L, this.c, iArr4, iArr5));
        }
    }
}
