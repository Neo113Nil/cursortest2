package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzaal extends zzyi {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzaal(final zzzf zzzfVar, int i, long j, long j2) {
        super(r1, r2, r3, 0L, r7, j, j2, r13, Math.max(6, zzzfVar.zzc));
        long j3;
        zzyf zzyfVar = new zzyf() { // from class: com.google.android.gms.internal.ads.zzaai
            @Override // com.google.android.gms.internal.ads.zzyf
            public final long zza(long j4) {
                return zzzf.this.zzb(j4);
            }
        };
        zzaak zzaakVar = new zzaak(zzzfVar, i, null);
        long zza = zzzfVar.zza();
        long j4 = zzzfVar.zzj;
        int i2 = zzzfVar.zzd;
        if (i2 > 0) {
            j3 = ((i2 + zzzfVar.zzc) / 2) + 1;
        } else {
            int i3 = zzzfVar.zza;
            int i4 = zzzfVar.zzb;
            long j5 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            if (i3 == i4 && i3 > 0) {
                j5 = i3;
            }
            j3 = (((j5 * zzzfVar.zzg) * zzzfVar.zzh) / 8) + 64;
        }
    }
}
