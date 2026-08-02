package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzavn implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzavp zzb;

    zzavn(zzavp zzavpVar, int i, boolean z) {
        this.zza = i;
        this.zzb = zzavpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzasj zzasjVar;
        int i = this.zza;
        zzavp zzavpVar = this.zzb;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = zzavpVar.zza.getPackageManager().getPackageInfo(zzavpVar.zza.getPackageName(), 0);
            Context context = zzavpVar.zza;
            zzasjVar = zzfop.zza(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            zzasjVar = null;
        }
        this.zzb.zzm = zzasjVar;
        if (this.zza < 4) {
            if (zzasjVar != null && zzasjVar.zzaj() && !zzasjVar.zzh().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzasjVar.zzak() && zzasjVar.zzf().zze() && zzasjVar.zzf().zza() != -2) {
                return;
            }
            this.zzb.zzo(this.zza + 1, true);
        }
    }
}
