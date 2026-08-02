package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfrs extends zzfro {
    final /* synthetic */ zzfry zza;

    zzfrs(zzfry zzfryVar) {
        this.zza = zzfryVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfro
    public final void zza() {
        IInterface iInterface;
        zzfrn zzfrnVar;
        Context context;
        ServiceConnection serviceConnection;
        zzfry zzfryVar = this.zza;
        iInterface = zzfryVar.zzn;
        if (iInterface != null) {
            zzfrnVar = zzfryVar.zzc;
            zzfrnVar.zzd("Unbind from service.", new Object[0]);
            zzfry zzfryVar2 = this.zza;
            context = zzfryVar2.zzb;
            serviceConnection = zzfryVar2.zzm;
            context.unbindService(serviceConnection);
            this.zza.zzh = false;
            this.zza.zzn = null;
            this.zza.zzm = null;
        }
        this.zza.zzt();
    }
}
