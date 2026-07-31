package com.unity3d.player;

import android.content.DialogInterface;

/* renamed from: com.unity3d.player.w0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class DialogInterfaceOnClickListenerC5174w0 implements DialogInterface.OnClickListener {
    final /* synthetic */ UnityPlayer a;

    DialogInterfaceOnClickListenerC5174w0(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.finish();
    }
}
