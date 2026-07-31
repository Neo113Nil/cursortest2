package com.unity3d.player;

import android.content.DialogInterface;

/* renamed from: com.unity3d.player.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class DialogInterfaceOnCancelListenerC5130a0 implements DialogInterface.OnCancelListener {
    final /* synthetic */ C5134c0 a;

    DialogInterfaceOnCancelListenerC5130a0(C5134c0 c5134c0) {
        this.a = c5134c0;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        F f = this.a.f;
        if (f != null) {
            ((C5152l0) f).a();
        }
    }
}
