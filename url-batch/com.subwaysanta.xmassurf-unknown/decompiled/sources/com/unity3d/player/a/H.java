package com.unity3d.player.a;

import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class H implements DialogInterface.OnDismissListener {
    public final /* synthetic */ com.unity3d.player.C a;

    public H(com.unity3d.player.C c) {
        this.a = c;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.invokeOnClose();
    }
}
