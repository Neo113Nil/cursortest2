package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfy implements zzex {
    private final zzex zza;
    private long zzb;
    private Uri zzc;
    private Map zzd;

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int zza = this.zza.zza(bArr, i, i2);
        if (zza != -1) {
            this.zzb += zza;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final long zzb(zzfc zzfcVar) throws IOException {
        this.zzc = zzfcVar.zza;
        this.zzd = Collections.emptyMap();
        long zzb = this.zza.zzb(zzfcVar);
        Uri zzc = zzc();
        Objects.requireNonNull(zzc);
        this.zzc = zzc;
        this.zzd = zze();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzex, com.google.android.gms.internal.ads.zzfu
    public final Map zze() {
        return this.zza.zze();
    }

    public final long zzg() {
        return this.zzb;
    }

    public final Uri zzh() {
        return this.zzc;
    }

    public final Map zzi() {
        return this.zzd;
    }

    public zzfy(zzex zzexVar) {
        Objects.requireNonNull(zzexVar);
        this.zza = zzexVar;
        this.zzc = Uri.EMPTY;
        this.zzd = Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final void zzf(zzfz zzfzVar) {
        Objects.requireNonNull(zzfzVar);
        this.zza.zzf(zzfzVar);
    }
}
