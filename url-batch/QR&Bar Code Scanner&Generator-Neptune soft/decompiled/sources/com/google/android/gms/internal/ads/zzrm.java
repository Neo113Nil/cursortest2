package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzrm implements zztz {
    public final zztz zza;
    final /* synthetic */ zzrn zzb;
    private boolean zzc;

    public zzrm(zzrn zzrnVar, zztz zztzVar) {
        this.zzb = zzrnVar;
        this.zza = zztzVar;
    }

    @Override // com.google.android.gms.internal.ads.zztz
    public final int zza(zzjg zzjgVar, zzgi zzgiVar, int i) {
        if (this.zzb.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzgiVar.zzc(4);
            return -4;
        }
        int zza = this.zza.zza(zzjgVar, zzgiVar, i);
        if (zza == -5) {
            zzaf zzafVar = zzjgVar.zza;
            Objects.requireNonNull(zzafVar);
            int i2 = zzafVar.zzC;
            if (i2 == 0) {
                if (zzafVar.zzD != 0) {
                    i2 = 0;
                }
                return -5;
            }
            int i3 = this.zzb.zzb == Long.MIN_VALUE ? zzafVar.zzD : 0;
            zzad zzb = zzafVar.zzb();
            zzb.zzC(i2);
            zzb.zzD(i3);
            zzjgVar.zza = zzb.zzY();
            return -5;
        }
        zzrn zzrnVar = this.zzb;
        long j = zzrnVar.zzb;
        if (j == Long.MIN_VALUE || ((zza != -4 || zzgiVar.zzd < j) && !(zza == -3 && zzrnVar.zzb() == Long.MIN_VALUE && !zzgiVar.zzc))) {
            return zza;
        }
        zzgiVar.zzb();
        zzgiVar.zzc(4);
        this.zzc = true;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zztz
    public final int zzb(long j) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j);
    }

    public final void zzc() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zztz
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zztz
    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}
