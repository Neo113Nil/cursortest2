package com.unity3d.player;

import com.google.android.gms.tasks.OnSuccessListener;

/* renamed from: com.unity3d.player.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0128e implements OnSuccessListener {
    public final IAssetPackManagerMobileDataConfirmationCallback a;
    public final UnityPlayer b;

    public final void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback = this.a;
        if (iAssetPackManagerMobileDataConfirmationCallback != null) {
            this.b.invokeOnMainThread(new RunnableC0126d(iAssetPackManagerMobileDataConfirmationCallback, num.intValue() == -1));
        }
    }

    public C0128e(UnityPlayer unityPlayer, IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback) {
        this.b = unityPlayer;
        this.a = iAssetPackManagerMobileDataConfirmationCallback;
    }
}
