package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzajg implements zzack {
    private zzacn zza;
    private zzajo zzb;
    private boolean zzc;

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private final boolean zza(zzacl zzaclVar) throws IOException {
        zzaji zzajiVar = new zzaji();
        if (zzajiVar.zzb(zzaclVar, true) && (zzajiVar.zza & 2) == 2) {
            int min = Math.min(zzajiVar.zze, 8);
            zzek zzekVar = new zzek(min);
            ((zzaby) zzaclVar).zzm(zzekVar.zzM(), 0, min, false);
            zzekVar.zzK(0);
            if (zzekVar.zzb() >= 5 && zzekVar.zzm() == 127 && zzekVar.zzu() == 1179402563) {
                this.zzb = new zzajf();
            } else {
                zzekVar.zzK(0);
                try {
                    if (zzadv.zzd(1, zzekVar, true)) {
                        this.zzb = new zzajq();
                    }
                } catch (zzbo unused) {
                }
                zzekVar.zzK(0);
                if (zzajk.zzd(zzekVar)) {
                    this.zzb = new zzajk();
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final int zzb(zzacl zzaclVar, zzadf zzadfVar) throws IOException {
        zzdi.zzb(this.zza);
        if (this.zzb == null) {
            if (!zza(zzaclVar)) {
                throw zzbo.zza("Failed to determine bitstream type", null);
            }
            zzaclVar.zzj();
        }
        if (!this.zzc) {
            zzadp zzw = this.zza.zzw(0, 1);
            this.zza.zzD();
            this.zzb.zzh(this.zza, zzw);
            this.zzc = true;
        }
        return this.zzb.zze(zzaclVar, zzadfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ zzack zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ List zzd() {
        return zzfxr.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zze(zzacn zzacnVar) {
        this.zza = zzacnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzi(long j, long j2) {
        zzajo zzajoVar = this.zzb;
        if (zzajoVar != null) {
            zzajoVar.zzj(j, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final boolean zzj(zzacl zzaclVar) throws IOException {
        try {
            return zza(zzaclVar);
        } catch (zzbo unused) {
            return false;
        }
    }
}
