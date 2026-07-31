package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzeil {
    private final Context zza;
    private final zzhdi zzb;
    private final zzhdi zzc;
    private final zzinq zzd;
    private final VersionInfoParcel zze;
    private final zzeih zzf;
    private final zzeaj zzg;

    zzeil(Context context, zzhdi zzhdiVar, zzhdi zzhdiVar2, zzinq zzinqVar, VersionInfoParcel versionInfoParcel, zzeih zzeihVar, zzeaj zzeajVar) {
        this.zza = context;
        this.zzb = zzhdiVar;
        this.zzc = zzhdiVar2;
        this.zzd = zzinqVar;
        this.zze = versionInfoParcel;
        this.zzf = zzeihVar;
        this.zzg = zzeajVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zze, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzc() {
        try {
            ((zzejg) this.zzd.zzb()).zzi(this.zze.afmaVersion);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpT)).booleanValue()) {
                zzeai zza = this.zzg.zza();
                zza.zzc("action", "ptard");
                zza.zzc("ptard", "l");
                zza.zzd();
            }
        } catch (RemoteException | NullPointerException e) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpU)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "Preconnect Local");
            }
        }
    }

    public final void zza() {
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzF(this.zza.getPackageName())) {
            this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeij
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeil.this.zzb();
                }
            });
            return;
        }
        zzeii zzeiiVar = new zzeii(this);
        zzein zzb = this.zzf.zzb();
        zzb.zzb(zzeiiVar);
        final zzegv zza = zzb.zza().zza();
        zzhdi zzhdiVar = this.zzb;
        Objects.requireNonNull(zza);
        zzhdiVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeik
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzegv.this.zza();
            }
        });
    }

    final /* synthetic */ zzeaj zzd() {
        return this.zzg;
    }
}
