package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzol extends BroadcastReceiver {
    final /* synthetic */ zzom zza;

    /* synthetic */ zzol(zzom zzomVar, zzok zzokVar) {
        this.zza = zzomVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzh zzhVar;
        zzon zzonVar;
        if (isInitialStickyBroadcast()) {
            return;
        }
        zzom zzomVar = this.zza;
        zzhVar = zzomVar.zzh;
        zzonVar = zzomVar.zzg;
        zzomVar.zzj(zzof.zzd(context, intent, zzhVar, zzonVar));
    }
}
