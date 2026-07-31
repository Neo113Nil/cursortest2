package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes6.dex */
final class zzmu implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzr zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcy zze;
    final /* synthetic */ zzny zzf;

    zzmu(zzny zznyVar, String str, String str2, zzr zzrVar, boolean z, com.google.android.gms.internal.measurement.zzcy zzcyVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzrVar;
        this.zzd = z;
        this.zze = zzcyVar;
        this.zzf = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e;
        zzgl zzglVar;
        Bundle bundle2 = new Bundle();
        try {
            zzny zznyVar = this.zzf;
            zzglVar = zznyVar.zzb;
            if (zzglVar == null) {
                zzio zzioVar = zznyVar.zzu;
                zzioVar.zzaW().zze().zzc("Failed to get user properties; not connected to service", this.zza, this.zzb);
                zzioVar.zzw().zzV(this.zze, bundle2);
                return;
            }
            zzr zzrVar = this.zzc;
            Preconditions.checkNotNull(zzrVar);
            List<zzqb> zzk = zzglVar.zzk(this.zza, this.zzb, this.zzd, zzrVar);
            int i = zzqf.$r8$clinit;
            bundle = new Bundle();
            if (zzk != null) {
                for (zzqb zzqbVar : zzk) {
                    String str = zzqbVar.zze;
                    if (str != null) {
                        bundle.putString(zzqbVar.zzb, str);
                    } else {
                        Long l = zzqbVar.zzd;
                        if (l != null) {
                            bundle.putLong(zzqbVar.zzb, l.longValue());
                        } else {
                            Double d = zzqbVar.zzg;
                            if (d != null) {
                                bundle.putDouble(zzqbVar.zzb, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    zznyVar.zzag();
                    zzio zzioVar2 = zznyVar.zzu;
                    zzioVar2.zzw().zzV(this.zze, bundle);
                } catch (RemoteException e2) {
                    e = e2;
                    this.zzf.zzu.zzaW().zze().zzc("Failed to get user properties; remote exception", this.zza, e);
                    zzny zznyVar2 = this.zzf;
                    zznyVar2.zzu.zzw().zzV(this.zze, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle2 = bundle;
                zzny zznyVar3 = this.zzf;
                zznyVar3.zzu.zzw().zzV(this.zze, bundle2);
                throw th;
            }
        } catch (RemoteException e3) {
            bundle = bundle2;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            zzny zznyVar32 = this.zzf;
            zznyVar32.zzu.zzw().zzV(this.zze, bundle2);
            throw th;
        }
    }
}
