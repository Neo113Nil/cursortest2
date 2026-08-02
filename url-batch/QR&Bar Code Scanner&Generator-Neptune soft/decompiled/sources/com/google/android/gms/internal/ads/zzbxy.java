package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbxy implements View.OnClickListener {
    final /* synthetic */ zzbxz zza;

    zzbxy(zzbxz zzbxzVar) {
        this.zza = zzbxzVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zza(true);
    }
}
