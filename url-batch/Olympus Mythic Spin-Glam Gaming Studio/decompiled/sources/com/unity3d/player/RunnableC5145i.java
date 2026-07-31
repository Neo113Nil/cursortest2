package com.unity3d.player;

/* renamed from: com.unity3d.player.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class RunnableC5145i implements Runnable {
    private IAssetPackManagerMobileDataConfirmationCallback a;
    private boolean b;

    RunnableC5145i(IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback, boolean z) {
        this.a = iAssetPackManagerMobileDataConfirmationCallback;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onMobileDataConfirmationResult(this.b);
    }
}
