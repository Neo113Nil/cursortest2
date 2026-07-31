package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzech implements zzebs {
    private final long zza;
    private final zzebw zzb;
    private final zzfku zzc;

    zzech(long j, Context context, zzebw zzebwVar, zzcob zzcobVar, String str) {
        this.zza = j;
        this.zzb = zzebwVar;
        zzfkw zzq = zzcobVar.zzq();
        zzq.zzc(context);
        zzq.zzb(str);
        this.zzc = zzq.zza().zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzebs
    public final void zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            this.zzc.zzb(zzmVar, new zzecf(this));
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebs
    public final void zzb() {
        try {
            zzfku zzfkuVar = this.zzc;
            zzfkuVar.zzd(new zzecg(this));
            zzfkuVar.zza(ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebs
    public final void zzc() {
    }

    final /* synthetic */ long zzd() {
        return this.zza;
    }

    final /* synthetic */ zzebw zze() {
        return this.zzb;
    }
}
