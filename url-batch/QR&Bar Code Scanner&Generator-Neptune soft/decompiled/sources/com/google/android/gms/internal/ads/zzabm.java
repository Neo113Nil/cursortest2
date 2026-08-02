package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzabm extends zzyu {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzabm(final zzzv zzzvVar, int i, long j, long j2) {
        super(r1, r2, r3, 0L, r7, j, j2, r13, Math.max(6, zzzvVar.zzc));
        long j3;
        zzyr zzyrVar = new zzyr() { // from class: com.google.android.gms.internal.ads.zzabj
            @Override // com.google.android.gms.internal.ads.zzyr
            public final long zza(long j4) {
                return zzzv.this.zzb(j4);
            }
        };
        zzabl zzablVar = new zzabl(zzzvVar, i, null);
        long zza = zzzvVar.zza();
        long j4 = zzzvVar.zzj;
        int i2 = zzzvVar.zzd;
        if (i2 > 0) {
            j3 = ((i2 + zzzvVar.zzc) / 2) + 1;
        } else {
            int i3 = zzzvVar.zza;
            int i4 = zzzvVar.zzb;
            long j5 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            if (i3 == i4 && i3 > 0) {
                j5 = i3;
            }
            j3 = (((j5 * zzzvVar.zzg) * zzzvVar.zzh) / 8) + 64;
        }
    }
}
