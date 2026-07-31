package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.OnSuccessListener;

/* renamed from: com.unity3d.player.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5147j implements OnSuccessListener {
    private IAssetPackManagerMobileDataConfirmationCallback a;
    private Looper b = Looper.myLooper();

    public C5147j(IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback) {
        this.a = iAssetPackManagerMobileDataConfirmationCallback;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        if (this.a != null) {
            new Handler(this.b).post(new RunnableC5145i(this.a, num.intValue() == -1));
        }
    }
}
