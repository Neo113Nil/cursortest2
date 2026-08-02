package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfjw implements Runnable {
    public static Boolean zza;
    private final Context zzb;
    private final zzcgv zzc;
    private String zze;
    private int zzf;
    private final zzdvi zzg;
    private final zzeep zzi;
    private final zzcbo zzj;
    private final zzfkb zzd = zzfke.zzc();
    private boolean zzh = false;

    public zzfjw(Context context, zzcgv zzcgvVar, zzdvi zzdviVar, zzeep zzeepVar, zzcbo zzcboVar, byte[] bArr) {
        this.zzb = context;
        this.zzc = zzcgvVar;
        this.zzg = zzdviVar;
        this.zzi = zzeepVar;
        this.zzj = zzcboVar;
    }

    public static synchronized boolean zza() {
        boolean booleanValue;
        synchronized (zzfjw.class) {
            if (zza == null) {
                if (((Boolean) zzbkl.zzb.zze()).booleanValue()) {
                    zza = Boolean.valueOf(Math.random() < ((Double) zzbkl.zza.zze()).doubleValue());
                } else {
                    zza = false;
                }
            }
            booleanValue = zza.booleanValue();
        }
        return booleanValue;
    }

    private final synchronized void zzc() {
        if (this.zzh) {
            return;
        }
        this.zzh = true;
        if (zza()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            this.zze = com.google.android.gms.ads.internal.util.zzs.zzo(this.zzb);
            this.zzf = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzb);
            long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhx)).intValue();
            zzchc.zzd.scheduleAtFixedRate(this, intValue, intValue, TimeUnit.MILLISECONDS);
        }
    }

    private final synchronized void zzd() {
        try {
            new zzeeo(this.zzb, this.zzc.zza, this.zzj, Binder.getCallingUid(), null).zza(new zzeem((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhw), 60000, new HashMap(), ((zzfke) this.zzd.zzam()).zzax(), "application/x-protobuf"));
            this.zzd.zzc();
        } catch (Exception e) {
            if ((e instanceof zzebh) && ((zzebh) e).zza() == 3) {
                this.zzd.zzc();
            } else {
                com.google.android.gms.ads.internal.zzt.zzo().zzs(e, "CuiMonitor.sendCuiPing");
            }
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        if (zza()) {
            if (this.zzd.zza() == 0) {
                return;
            }
            zzd();
        }
    }

    public final synchronized void zzb(zzfjn zzfjnVar) {
        if (!this.zzh) {
            zzc();
        }
        if (zza()) {
            if (zzfjnVar == null) {
                return;
            }
            if (this.zzd.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhy)).intValue()) {
                return;
            }
            zzfkb zzfkbVar = this.zzd;
            zzfkc zza2 = zzfkd.zza();
            zzfjy zza3 = zzfjz.zza();
            zza3.zzo(zzfjnVar.zzh());
            zza3.zzl(zzfjnVar.zzg());
            zza3.zze(zzfjnVar.zzb());
            zza3.zzq(3);
            zza3.zzk(this.zzc.zza);
            zza3.zza(this.zze);
            zza3.zzi(Build.VERSION.RELEASE);
            zza3.zzm(Build.VERSION.SDK_INT);
            zza3.zzp(zzfjnVar.zzj());
            zza3.zzh(zzfjnVar.zza());
            zza3.zzc(this.zzf);
            zza3.zzn(zzfjnVar.zzi());
            zza3.zzb(zzfjnVar.zzc());
            zza3.zzd(zzfjnVar.zzd());
            zza3.zzf(zzfjnVar.zze());
            zza3.zzg(this.zzg.zzc(zzfjnVar.zze()));
            zza3.zzj(zzfjnVar.zzf());
            zza2.zza(zza3);
            zzfkbVar.zzb(zza2);
        }
    }
}
