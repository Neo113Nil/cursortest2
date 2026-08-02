package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaiy {
    public final int zza;
    public final long zzb;

    private zzaiy(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }

    public static zzaiy zza(zzzj zzzjVar, zzef zzefVar) throws IOException {
        ((zzyy) zzzjVar).zzm(zzefVar.zzH(), 0, 8, false);
        zzefVar.zzF(0);
        return new zzaiy(zzefVar.zze(), zzefVar.zzq());
    }
}
