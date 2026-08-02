package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdzf implements zzdyp {
    private final long zza;
    private final zzdyu zzb;
    private final zzfdb zzc;

    zzdzf(long j, Context context, zzdyu zzdyuVar, zzcom zzcomVar, String str) {
        this.zza = j;
        this.zzb = zzdyuVar;
        zzfdd zzu = zzcomVar.zzu();
        zzu.zzb(context);
        zzu.zza(str);
        this.zzc = zzu.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzdyp
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdyp
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        try {
            this.zzc.zzf(zzlVar, new zzdzd(this));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdyp
    public final void zzc() {
        try {
            this.zzc.zzk(new zzdze(this));
            this.zzc.zzm(ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
        }
    }
}
