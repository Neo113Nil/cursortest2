package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcww extends zzbdi {
    private final zzcwv zza;
    private final com.google.android.gms.ads.internal.client.zzbs zzb;
    private final zzezg zzc;
    private boolean zzd = false;

    public zzcww(zzcwv zzcwvVar, com.google.android.gms.ads.internal.client.zzbs zzbsVar, zzezg zzezgVar) {
        this.zza = zzcwvVar;
        this.zzb = zzbsVar;
        this.zzc = zzezgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final com.google.android.gms.ads.internal.client.zzbs zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final com.google.android.gms.ads.internal.client.zzdh zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfQ)).booleanValue()) {
            return this.zza.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final void zzg(boolean z) {
        this.zzd = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final void zzh(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        zzezg zzezgVar = this.zzc;
        if (zzezgVar != null) {
            zzezgVar.zzp(zzdeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final void zzi(IObjectWrapper iObjectWrapper, zzbdq zzbdqVar) {
        try {
            this.zzc.zzs(zzbdqVar);
            this.zza.zzd((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzbdqVar, this.zzd);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final void zzj(zzbdn zzbdnVar) {
    }
}
