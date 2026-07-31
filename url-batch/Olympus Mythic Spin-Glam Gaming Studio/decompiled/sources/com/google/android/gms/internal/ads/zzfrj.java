package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzfrj implements Runnable {

    @GuardedBy
    @VisibleForTesting
    public static Boolean zzb;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private int zzi;
    private final zzdxx zzj;
    private final List zzk;
    private final zzcny zzl;
    private final zzccd zzn;

    @VisibleForTesting
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();

    @GuardedBy
    private final zzfrn zzg = zzfrq.zzb();
    private String zzh = "";

    @GuardedBy
    private boolean zzm = false;

    public zzfrj(Context context, VersionInfoParcel versionInfoParcel, zzdxx zzdxxVar, zzejl zzejlVar, zzccd zzccdVar, zzcny zzcnyVar) {
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzj = zzdxxVar;
        this.zzn = zzccdVar;
        this.zzl = zzcnyVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkk)).booleanValue()) {
            this.zzk = com.google.android.gms.ads.internal.util.zzs.zzj();
        } else {
            this.zzk = zzgxm.zzi();
        }
    }

    public static boolean zza() {
        boolean booleanValue;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    if (((Boolean) zzbla.zzb.zze()).booleanValue()) {
                        zzb = Boolean.valueOf(Math.random() < ((Double) zzbla.zza.zze()).doubleValue());
                    } else {
                        zzb = Boolean.FALSE;
                    }
                }
                booleanValue = zzb.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] zzaN;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                try {
                    if (this.zzg.zza() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            zzfrn zzfrnVar = this.zzg;
                            zzaN = ((zzfrq) zzfrnVar.zzbu()).zzaN();
                            zzfrnVar.zzc();
                        }
                        new zzejk(this.zze, this.zzf.afmaVersion, this.zzn, Binder.getCallingUid(), null).zza(new zzeji((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzke), 60000, new HashMap(), zzaN, CommonGatewayClient.HEADER_PROTOBUF, false));
                    } catch (Exception e) {
                        if ((e instanceof zzefb) && ((zzefb) e).zza() == 3) {
                            return;
                        }
                        com.google.android.gms.ads.internal.zzt.zzh().zzi(e, "CuiMonitor.sendCuiPing");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void zzb(@Nullable final zzfqz zzfqzVar) {
        zzcgj.zza.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfri
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfrj.this.zzc(zzfqzVar);
            }
        });
    }

    final /* synthetic */ void zzc(zzfqz zzfqzVar) {
        synchronized (zzd) {
            try {
                if (!this.zzm) {
                    this.zzm = true;
                    if (zza()) {
                        try {
                            com.google.android.gms.ads.internal.zzt.zzc();
                            this.zzh = com.google.android.gms.ads.internal.util.zzs.zzr(this.zze);
                        } catch (RemoteException | RuntimeException e) {
                            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "CuiMonitor.gettingAppIdFromManifest");
                        }
                        this.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkf)).intValue();
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznB)).booleanValue()) {
                            long j = intValue;
                            zzcgj.zzd.scheduleWithFixedDelay(this, j, j, TimeUnit.MILLISECONDS);
                        } else {
                            long j2 = intValue;
                            zzcgj.zzd.scheduleAtFixedRate(this, j2, j2, TimeUnit.MILLISECONDS);
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkl)).booleanValue()) {
                            this.zzl.zza();
                        }
                    }
                }
            } finally {
            }
        }
        if (zza() && zzfqzVar != null) {
            synchronized (zzc) {
                try {
                    zzfrn zzfrnVar = this.zzg;
                    if (zzfrnVar.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkg)).intValue()) {
                        return;
                    }
                    zzfrk zza2 = zzfrm.zza();
                    zza2.zzv(zzfqzVar.zzm());
                    zza2.zza(zzfqzVar.zzb());
                    zza2.zzb(zzfqzVar.zza());
                    zza2.zzw(3);
                    zza2.zzd(this.zzf.afmaVersion);
                    zza2.zze(this.zzh);
                    zza2.zzf(Build.VERSION.RELEASE);
                    zza2.zzg(Build.VERSION.SDK_INT);
                    zza2.zzx(zzfqzVar.zzo());
                    zza2.zzi(zzfqzVar.zzc());
                    zza2.zzj(this.zzi);
                    zza2.zzy(zzfqzVar.zzn());
                    zza2.zzk(zzfqzVar.zzd());
                    zza2.zzl(zzfqzVar.zze());
                    zza2.zzm(zzfqzVar.zzf());
                    zza2.zzn(this.zzj.zzd(zzfqzVar.zzf()));
                    zza2.zzo(zzfqzVar.zzg());
                    zza2.zzs(zzfqzVar.zzh());
                    zza2.zzr(zzfqzVar.zzk());
                    zza2.zzp(zzfqzVar.zzi());
                    zza2.zzq(zzfqzVar.zzj());
                    zza2.zzc(zzfqzVar.zzl());
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkk)).booleanValue()) {
                        zza2.zzh(this.zzk);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkl)).booleanValue()) {
                        zzcny zzcnyVar = this.zzl;
                        zzija zzd2 = zzcnyVar.zzd();
                        String zzc2 = zzcnyVar.zzc();
                        if (zzd2 != null) {
                            zza2.zzt(zzd2);
                        }
                        if (zzc2 != null) {
                            zza2.zzu(zzc2);
                        }
                    }
                    zzfro zza3 = zzfrp.zza();
                    zza3.zza(zza2);
                    zzfrnVar.zzb(zza3);
                } finally {
                }
            }
        }
    }
}
