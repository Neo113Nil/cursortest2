package com.unity3d.player;

import android.content.DialogInterface;

/* loaded from: classes4.dex */
final class Y implements DialogInterface.OnDismissListener {
    final /* synthetic */ C5134c0 a;

    Y(C5134c0 c5134c0) {
        this.a = c5134c0;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.invokeOnClose();
    }
}
