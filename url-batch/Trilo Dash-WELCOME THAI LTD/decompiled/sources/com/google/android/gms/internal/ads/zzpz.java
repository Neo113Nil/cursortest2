package com.google.android.gms.internal.ads;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Objects;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzpz {
    private long zza;
    private long zzb;
    private boolean zzc;

    zzpz() {
    }

    private final long zzd(long j) {
        return this.zza + Math.max(0L, ((this.zzb - 529) * 1000000) / j);
    }

    public final long zza(zzad zzadVar) {
        return zzd(zzadVar.zzA);
    }

    public final long zzb(zzad zzadVar, zzgc zzgcVar) {
        if (this.zzb == 0) {
            this.zza = zzgcVar.zzd;
        }
        if (this.zzc) {
            return zzgcVar.zzd;
        }
        ByteBuffer byteBuffer = zzgcVar.zzb;
        Objects.requireNonNull(byteBuffer);
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (byteBuffer.get(i2) & UByte.MAX_VALUE);
        }
        int zzc = zzzm.zzc(i);
        if (zzc != -1) {
            long zzd = zzd(zzadVar.zzA);
            this.zzb += zzc;
            return zzd;
        }
        this.zzc = true;
        this.zzb = 0L;
        this.zza = zzgcVar.zzd;
        Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
        return zzgcVar.zzd;
    }

    public final void zzc() {
        this.zza = 0L;
        this.zzb = 0L;
        this.zzc = false;
    }
}
