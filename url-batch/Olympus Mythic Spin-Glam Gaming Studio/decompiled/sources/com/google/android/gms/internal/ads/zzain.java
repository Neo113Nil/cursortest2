package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzain extends zzaft {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzain(final zzagu zzaguVar, int i, long j, long j2) {
        super(r1, r2, r3, 0L, r7, j, j2, r13, Math.max(6, zzaguVar.zzc));
        long j3;
        Objects.requireNonNull(zzaguVar);
        zzafq zzafqVar = new zzafq() { // from class: com.google.android.gms.internal.ads.zzail
            @Override // com.google.android.gms.internal.ads.zzafq
            public final /* synthetic */ long zza(long j4) {
                return zzagu.this.zzb(j4);
            }
        };
        zzaim zzaimVar = new zzaim(zzaguVar, i, null);
        long zza = zzaguVar.zza();
        long j4 = zzaguVar.zzj;
        int i2 = zzaguVar.zzd;
        if (i2 > 0) {
            j3 = ((i2 + zzaguVar.zzc) / 2) + 1;
        } else {
            int i3 = zzaguVar.zza;
            long j5 = 4096;
            if (i3 == zzaguVar.zzb && i3 > 0) {
                j5 = i3;
            }
            j3 = (((j5 * zzaguVar.zzg) * zzaguVar.zzh) / 8) + 64;
        }
    }
}
