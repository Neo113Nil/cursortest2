package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzawf implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzawg zza;

    zzawf(zzawg zzawgVar) {
        Objects.requireNonNull(zzawgVar);
        this.zza = zzawgVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        if (z) {
            zzawg zzawgVar = this.zza;
            zzawgVar.zze(System.currentTimeMillis());
            zzawgVar.zzh(true);
            return;
        }
        zzawg zzawgVar2 = this.zza;
        long zzf = zzawgVar2.zzf();
        long currentTimeMillis = System.currentTimeMillis();
        if (zzf > 0 && currentTimeMillis >= zzawgVar2.zzf()) {
            zzawgVar2.zzg(currentTimeMillis - zzawgVar2.zzf());
        }
        zzawgVar2.zzh(false);
    }
}
