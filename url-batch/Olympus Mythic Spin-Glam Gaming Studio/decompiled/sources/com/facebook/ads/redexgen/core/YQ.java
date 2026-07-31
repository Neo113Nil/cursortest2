package com.facebook.ads.redexgen.core;

import android.content.DialogInterface;

/* loaded from: assets/audience_network/classes2.dex */
public class YQ implements DialogInterface.OnClickListener {
    public final /* synthetic */ C2541Pp A00;

    public YQ(C2541Pp c2541Pp) {
        this.A00 = c2541Pp;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
