package com.google.android.gms.internal.ads;

import androidx.annotation.RestrictTo;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@RestrictTo
/* loaded from: classes9.dex */
public final class zzahr implements zzagk {
    private final long zzb;
    private final zzagk zzc;

    public zzahr(long j, zzagk zzagkVar) {
        this.zzb = j;
        this.zzc = zzagkVar;
    }

    final /* synthetic */ long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final zzaht zzs(int i, int i2) {
        return this.zzc.zzs(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final void zzv() {
        this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final void zzw(zzahk zzahkVar) {
        this.zzc.zzw(new zzahq(this, zzahkVar, zzahkVar));
    }
}
