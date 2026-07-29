package com.unity3d.player;

import android.content.DialogInterface;

/* renamed from: com.unity3d.player.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0125c0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ UnityPlayer a;

    public DialogInterfaceOnClickListenerC0125c0(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.finish();
    }
}
