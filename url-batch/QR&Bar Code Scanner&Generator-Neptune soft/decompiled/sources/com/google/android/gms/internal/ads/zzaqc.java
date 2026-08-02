package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaqc implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzaqe zzb;

    zzaqc(zzaqe zzaqeVar, int i, boolean z) {
        this.zzb = zzaqeVar;
        this.zza = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzana zzanaVar;
        zzaqe zzaqeVar = this.zzb;
        if (this.zza > 0) {
            try {
                Thread.sleep(r1 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = zzaqeVar.zza.getPackageManager().getPackageInfo(zzaqeVar.zza.getPackageName(), 0);
            Context context = zzaqeVar.zza;
            zzanaVar = zzfnf.zza(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            zzanaVar = null;
        }
        this.zzb.zzm = zzanaVar;
        if (this.zza < 4) {
            if (zzanaVar != null && zzanaVar.zzaj() && !zzanaVar.zzh().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzanaVar.zzak() && zzanaVar.zzf().zze() && zzanaVar.zzf().zza() != -2) {
                return;
            }
            this.zzb.zzo(this.zza + 1, true);
        }
    }
}
