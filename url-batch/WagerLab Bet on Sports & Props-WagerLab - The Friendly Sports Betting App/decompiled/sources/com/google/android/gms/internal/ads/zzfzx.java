package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.UnsupportedEncodingException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfzx {
    private final Context zza;
    private final zzgea zzb;
    private final zzfxt zzc;
    private final String zzd;

    zzfzx(Context context, zzgea zzgeaVar, zzfxt zzfxtVar, zzfui zzfuiVar) {
        this.zza = context;
        this.zzb = zzgeaVar;
        this.zzc = zzfxtVar;
        this.zzd = zzfuiVar.zzb();
    }

    public final String zza(boolean z, long j) {
        String num;
        zzgdy zza = this.zzb.zza(55);
        try {
            try {
                zza.zza();
                zzatc zza2 = zzatd.zza();
                zza2.zzb(this.zzd);
                zza2.zza("0.794714348");
                zza2.zzd(this.zza.getPackageName());
                zza2.zzc(System.currentTimeMillis() / 1000);
                zza2.zzf((System.currentTimeMillis() - j) / 1000);
                try {
                    zza2.zze(r0.getPackageManager().getPackageInfo(r0.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                    zza2.zze(-1L);
                }
                zzfxt zzfxtVar = this.zzc;
                if (!zzfxtVar.zzc()) {
                    zzfxtVar.zza();
                }
                zzatj zzf = zzfxtVar.zzf(((zzatd) zza2.zzbu()).zzaN(), null);
                zzf.zzc(5);
                zzf.zzd(2);
                byte[] zzaN = ((zzatk) zzf.zzbu()).zzaN();
                num = zzgmk.zzm().zzh().zzj(zzaN, 0, zzaN.length);
            } finally {
                zza.zzc();
            }
        } catch (UnsupportedEncodingException e) {
            zza.zzb(e);
            num = Integer.toString(7);
        } catch (Throwable th) {
            zza.zzb(th);
            throw th;
        }
        return num;
    }
}
