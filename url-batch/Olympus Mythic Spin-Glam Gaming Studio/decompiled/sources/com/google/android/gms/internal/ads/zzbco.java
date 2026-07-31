package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzbco implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzbcp zza;

    zzbco(zzbcp zzbcpVar) {
        Objects.requireNonNull(zzbcpVar);
        this.zza = zzbcpVar;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        if (z) {
            zzbcp zzbcpVar = this.zza;
            zzbcpVar.zze(System.currentTimeMillis());
            zzbcpVar.zzh(true);
            return;
        }
        zzbcp zzbcpVar2 = this.zza;
        long zzf = zzbcpVar2.zzf();
        long currentTimeMillis = System.currentTimeMillis();
        if (zzf > 0 && currentTimeMillis >= zzbcpVar2.zzf()) {
            zzbcpVar2.zzg(currentTimeMillis - zzbcpVar2.zzf());
        }
        zzbcpVar2.zzh(false);
    }
}
