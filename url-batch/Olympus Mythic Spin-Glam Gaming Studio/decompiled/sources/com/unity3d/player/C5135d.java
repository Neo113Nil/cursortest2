package com.unity3d.player;

import android.window.OnBackInvokedCallback;

/* renamed from: com.unity3d.player.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5135d implements OnBackInvokedCallback {
    final /* synthetic */ com.unity3d.player.a.c a;

    C5135d(com.unity3d.player.a.c cVar) {
        this.a = cVar;
    }

    public final void onBackInvoked() {
        Runnable runnable = ((B) this.a).a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
