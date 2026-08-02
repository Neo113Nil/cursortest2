package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeiy extends zzccc implements zzdek {
    private zzccd zza;
    private zzdej zzb;
    private zzdky zzc;

    @Override // com.google.android.gms.internal.ads.zzdek
    public final synchronized void zza(zzdej zzdejVar) {
        this.zzb = zzdejVar;
    }

    public final synchronized void zzc(zzccd zzccdVar) {
        this.zza = zzccdVar;
    }

    public final synchronized void zzd(zzdky zzdkyVar) {
        this.zzc = zzdkyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzccd zzccdVar = this.zza;
        if (zzccdVar != null) {
            ((zzelr) zzccdVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzccd zzccdVar = this.zza;
        if (zzccdVar != null) {
            zzccdVar.zzf(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final synchronized void zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzdej zzdejVar = this.zzb;
        if (zzdejVar != null) {
            zzdejVar.zza(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzccd zzccdVar = this.zza;
        if (zzccdVar != null) {
            ((zzelr) zzccdVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdej zzdejVar = this.zzb;
        if (zzdejVar != null) {
            zzdejVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzccd zzccdVar = this.zza;
        if (zzccdVar != null) {
            ((zzelr) zzccdVar).zza.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzdky zzdkyVar = this.zzc;
        if (zzdkyVar != null) {
            com.google.android.gms.ads.internal.util.zze.zzj("Fail to initialize adapter ".concat(String.valueOf(((zzelq) zzdkyVar).zzc.zza)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        Executor executor;
        zzdky zzdkyVar = this.zzc;
        if (zzdkyVar != null) {
            executor = ((zzelq) zzdkyVar).zzd.zzb;
            final zzfdw zzfdwVar = ((zzelq) zzdkyVar).zza;
            final zzfdk zzfdkVar = ((zzelq) zzdkyVar).zzb;
            final zzehf zzehfVar = ((zzelq) zzdkyVar).zzc;
            final zzelq zzelqVar = (zzelq) zzdkyVar;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelp
                @Override // java.lang.Runnable
                public final void run() {
                    zzelq zzelqVar2 = zzelq.this;
                    zzfdw zzfdwVar2 = zzfdwVar;
                    zzfdk zzfdkVar2 = zzfdkVar;
                    zzehf zzehfVar2 = zzehfVar;
                    zzels zzelsVar = zzelqVar2.zzd;
                    zzels.zze(zzfdwVar2, zzfdkVar2, zzehfVar2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final synchronized void zzm(IObjectWrapper iObjectWrapper, zzcce zzcceVar) throws RemoteException {
        zzccd zzccdVar = this.zza;
        if (zzccdVar != null) {
            ((zzelr) zzccdVar).zzd.zza(zzcceVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final synchronized void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzccd zzccdVar = this.zza;
        if (zzccdVar != null) {
            ((zzelr) zzccdVar).zzc.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccd
    public final synchronized void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzccd zzccdVar = this.zza;
        if (zzccdVar != null) {
            ((zzelr) zzccdVar).zzd.zzc();
        }
    }
}
