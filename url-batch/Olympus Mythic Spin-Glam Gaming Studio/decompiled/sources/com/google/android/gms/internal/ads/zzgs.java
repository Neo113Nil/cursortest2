package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzgs {
    private final boolean zza;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0091, code lost:
    
        if (r9.zzj(8) == 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzgs(zzgw zzgwVar, zzgv zzgvVar) throws zzgu {
        int i = zzgvVar.zza;
        boolean z = false;
        zzguk.zza(i == 6 || i == 3);
        int min = Math.min(4, zzgvVar.zzb.remaining());
        byte[] bArr = new byte[min];
        zzgvVar.zzb.asReadOnlyBuffer().get(bArr);
        zzet zzetVar = new zzet(bArr, min);
        zzgx.zzc(zzgwVar.zza);
        if (!zzetVar.zzi()) {
            int zzj = zzetVar.zzj(2);
            boolean zzi = zzetVar.zzi();
            zzgx.zzc(zzgwVar.zzb);
            if (zzi) {
                boolean zzi2 = (zzj == 3 || zzj == 0) ? true : zzetVar.zzi();
                zzetVar.zzg();
                zzgx.zzc(!zzgwVar.zzd);
                if (zzetVar.zzi()) {
                    zzgx.zzc(!zzgwVar.zze);
                    zzetVar.zzg();
                }
                zzgx.zzc(zzgwVar.zzc);
                if (zzj != 3) {
                    zzetVar.zzg();
                }
                zzetVar.zzh(zzgwVar.zzf);
                if (zzj != 2 && zzj != 0 && !zzi2) {
                    zzetVar.zzh(3);
                }
                if (zzj != 3) {
                    if (zzj != 0) {
                    }
                }
            }
            z = true;
        }
        this.zza = z;
    }

    @Nullable
    public static zzgs zzb(zzgw zzgwVar, zzgv zzgvVar) {
        try {
            return new zzgs(zzgwVar, zzgvVar);
        } catch (zzgu unused) {
            return null;
        }
    }

    public final boolean zza() {
        return this.zza;
    }
}
