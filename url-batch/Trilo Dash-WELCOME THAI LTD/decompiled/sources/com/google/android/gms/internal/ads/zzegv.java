package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzegv extends zzcau implements zzddc {
    private zzcav zza;
    private zzddb zzb;
    private zzdjq zzc;

    @Override // com.google.android.gms.internal.ads.zzddc
    public final synchronized void zza(zzddb zzddbVar) {
        this.zzb = zzddbVar;
    }

    public final synchronized void zzc(zzcav zzcavVar) {
        this.zza = zzcavVar;
    }

    public final synchronized void zzd(zzdjq zzdjqVar) {
        this.zzc = zzdjqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcav zzcavVar = this.zza;
        if (zzcavVar != null) {
            ((zzejo) zzcavVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcav zzcavVar = this.zza;
        if (zzcavVar != null) {
            zzcavVar.zzf(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final synchronized void zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzddb zzddbVar = this.zzb;
        if (zzddbVar != null) {
            zzddbVar.zza(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcav zzcavVar = this.zza;
        if (zzcavVar != null) {
            ((zzejo) zzcavVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzddb zzddbVar = this.zzb;
        if (zzddbVar != null) {
            zzddbVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcav zzcavVar = this.zza;
        if (zzcavVar != null) {
            ((zzejo) zzcavVar).zza.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzdjq zzdjqVar = this.zzc;
        if (zzdjqVar != null) {
            com.google.android.gms.ads.internal.util.zze.zzj("Fail to initialize adapter ".concat(String.valueOf(((zzejn) zzdjqVar).zzc.zza)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        Executor executor;
        zzdjq zzdjqVar = this.zzc;
        if (zzdjqVar != null) {
            executor = ((zzejn) zzdjqVar).zzd.zzb;
            final zzfbs zzfbsVar = ((zzejn) zzdjqVar).zza;
            final zzfbg zzfbgVar = ((zzejn) zzdjqVar).zzb;
            final zzefb zzefbVar = ((zzejn) zzdjqVar).zzc;
            final zzejn zzejnVar = (zzejn) zzdjqVar;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejm
                @Override // java.lang.Runnable
                public final void run() {
                    zzejn zzejnVar2 = zzejn.this;
                    zzfbs zzfbsVar2 = zzfbsVar;
                    zzfbg zzfbgVar2 = zzfbgVar;
                    zzefb zzefbVar2 = zzefbVar;
                    zzejp zzejpVar = zzejnVar2.zzd;
                    zzejp.zze(zzfbsVar2, zzfbgVar2, zzefbVar2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final synchronized void zzm(IObjectWrapper iObjectWrapper, zzcaw zzcawVar) throws RemoteException {
        zzcav zzcavVar = this.zza;
        if (zzcavVar != null) {
            ((zzejo) zzcavVar).zzd.zza(zzcawVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final synchronized void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcav zzcavVar = this.zza;
        if (zzcavVar != null) {
            ((zzejo) zzcavVar).zzc.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    public final synchronized void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcav zzcavVar = this.zza;
        if (zzcavVar != null) {
            ((zzejo) zzcavVar).zzd.zzc();
        }
    }
}
