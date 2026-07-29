package com.unity3d.player.a;

import android.content.DialogInterface;
import com.unity3d.player.L0;

/* loaded from: classes.dex */
public final class J implements DialogInterface.OnCancelListener {
    public final /* synthetic */ com.unity3d.player.C a;

    public J(com.unity3d.player.C c) {
        this.a = c;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        L0 l0 = this.a.f;
        if (l0 != null) {
            l0.a();
        }
    }
}
