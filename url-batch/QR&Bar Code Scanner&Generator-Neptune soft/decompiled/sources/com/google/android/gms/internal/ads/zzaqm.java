package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaqm implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzaqn zza;

    zzaqm(zzaqn zzaqnVar) {
        this.zza = zzaqnVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        long j;
        long j2;
        long j3;
        if (z) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        zzaqn zzaqnVar = this.zza;
        j = zzaqnVar.zzc;
        if (j > 0) {
            j2 = zzaqnVar.zzc;
            if (currentTimeMillis >= j2) {
                j3 = zzaqnVar.zzc;
                zzaqnVar.zzd = currentTimeMillis - j3;
            }
        }
        this.zza.zze = false;
    }
}
