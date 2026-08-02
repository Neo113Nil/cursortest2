package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgy implements zzji {
    private final zzkg zza;
    private final zzgx zzb;
    private zzka zzc;
    private zzji zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzgy(zzgx zzgxVar, zzde zzdeVar) {
        this.zzb = zzgxVar;
        this.zza = new zzkg(zzdeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzji
    public final long zza() {
        throw null;
    }

    public final long zzb(boolean z) {
        zzka zzkaVar = this.zzc;
        if (zzkaVar == null || zzkaVar.zzM() || (!this.zzc.zzN() && (z || this.zzc.zzG()))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zzd();
            }
        } else {
            zzji zzjiVar = this.zzd;
            Objects.requireNonNull(zzjiVar);
            long zza = zzjiVar.zza();
            if (this.zze) {
                if (zza < this.zza.zza()) {
                    this.zza.zze();
                } else {
                    this.zze = false;
                    if (this.zzf) {
                        this.zza.zzd();
                    }
                }
            }
            this.zza.zzb(zza);
            zzby zzc = zzjiVar.zzc();
            if (!zzc.equals(this.zza.zzc())) {
                this.zza.zzg(zzc);
                this.zzb.zza(zzc);
            }
        }
        if (this.zze) {
            return this.zza.zza();
        }
        zzji zzjiVar2 = this.zzd;
        Objects.requireNonNull(zzjiVar2);
        return zzjiVar2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzji
    public final zzby zzc() {
        zzji zzjiVar = this.zzd;
        return zzjiVar != null ? zzjiVar.zzc() : this.zza.zzc();
    }

    public final void zzd(zzka zzkaVar) {
        if (zzkaVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzka zzkaVar) throws zzha {
        zzji zzjiVar;
        zzji zzi = zzkaVar.zzi();
        if (zzi == null || zzi == (zzjiVar = this.zzd)) {
            return;
        }
        if (zzjiVar != null) {
            throw zzha.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.zzd = zzi;
        this.zzc = zzkaVar;
        zzi.zzg(this.zza.zzc());
    }

    public final void zzf(long j) {
        this.zza.zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzji
    public final void zzg(zzby zzbyVar) {
        zzji zzjiVar = this.zzd;
        if (zzjiVar != null) {
            zzjiVar.zzg(zzbyVar);
            zzbyVar = this.zzd.zzc();
        }
        this.zza.zzg(zzbyVar);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }
}
