package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzbwl implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbwm zza;

    zzbwl(zzbwm zzbwmVar) {
        this.zza = zzbwmVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzg("Operation denied by user.");
    }
}
