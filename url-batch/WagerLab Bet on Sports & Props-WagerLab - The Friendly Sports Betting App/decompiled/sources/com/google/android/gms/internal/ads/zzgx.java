package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzgx implements zzga {
    private final zzga zza;
    private long zzb;
    private Uri zzc = Uri.EMPTY;
    private Map zzd = Collections.emptyMap();

    public zzgx(zzga zzgaVar) {
        this.zza = zzgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int zza = this.zza.zza(bArr, i, i2);
        if (zza != -1) {
            this.zzb += zza;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) throws IOException {
        this.zzc = zzgeVar.zza;
        this.zzd = Collections.emptyMap();
        try {
            long zzb = this.zza.zzb(zzgeVar);
            Uri zzc = zzc();
            if (zzc != null) {
                this.zzc = zzc;
            }
            this.zzd = zzj();
            return zzb;
        } catch (Throwable th) {
            Uri zzc2 = zzc();
            if (zzc2 != null) {
                this.zzc = zzc2;
            }
            this.zzd = zzj();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    public final long zzf() {
        return this.zzb;
    }

    public final Uri zzg() {
        return this.zzc;
    }

    public final Map zzh() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzga, com.google.android.gms.internal.ads.zzgt
    public final Map zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zze(zzgy zzgyVar) {
        zzgyVar.getClass();
        this.zza.zze(zzgyVar);
    }
}
