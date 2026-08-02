package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Objects;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzqg {
    private long zza;
    private long zzb;
    private boolean zzc;

    zzqg() {
    }

    private final long zzd(long j) {
        return this.zza + Math.max(0L, ((this.zzb - 529) * 1000000) / j);
    }

    public final long zza(zzaf zzafVar) {
        return zzd(zzafVar.zzA);
    }

    public final long zzb(zzaf zzafVar, zzgi zzgiVar) {
        if (this.zzb == 0) {
            this.zza = zzgiVar.zzd;
        }
        if (this.zzc) {
            return zzgiVar.zzd;
        }
        ByteBuffer byteBuffer = zzgiVar.zzb;
        Objects.requireNonNull(byteBuffer);
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (byteBuffer.get(i2) & UByte.MAX_VALUE);
        }
        int zzc = zzaac.zzc(i);
        if (zzc != -1) {
            long zzd = zzd(zzafVar.zzA);
            this.zzb += zzc;
            return zzd;
        }
        this.zzc = true;
        this.zzb = 0L;
        this.zza = zzgiVar.zzd;
        zzdw.zze("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
        return zzgiVar.zzd;
    }

    public final void zzc() {
        this.zza = 0L;
        this.zzb = 0L;
        this.zzc = false;
    }
}
