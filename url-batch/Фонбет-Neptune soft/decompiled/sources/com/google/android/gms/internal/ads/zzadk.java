package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzadk implements zzack {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private int zzd;
    private int zze;
    private zzacn zzf;
    private zzadp zzg;

    public zzadk(int i, int i2, String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final int zzb(zzacl zzaclVar, zzadf zzadfVar) throws IOException {
        int i = this.zze;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        zzadp zzadpVar = this.zzg;
        zzadpVar.getClass();
        int zzf = zzadpVar.zzf(zzaclVar, 1024, true);
        if (zzf == -1) {
            this.zze = 2;
            this.zzg.zzs(0L, 1, this.zzd, 0, null);
            this.zzd = 0;
        } else {
            this.zzd += zzf;
        }
        return 0;
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
        this.zzf = zzacnVar;
        zzadp zzw = zzacnVar.zzw(1024, 4);
        this.zzg = zzw;
        zzad zzadVar = new zzad();
        zzadVar.zzX(this.zzc);
        zzw.zzl(zzadVar.zzad());
        this.zzf.zzD();
        this.zzf.zzO(new zzadl(-9223372036854775807L));
        this.zze = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzi(long j, long j2) {
        if (j == 0 || this.zze == 1) {
            this.zze = 1;
            this.zzd = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final boolean zzj(zzacl zzaclVar) throws IOException {
        zzdi.zzf((this.zza == -1 || this.zzb == -1) ? false : true);
        zzek zzekVar = new zzek(this.zzb);
        ((zzaby) zzaclVar).zzm(zzekVar.zzM(), 0, this.zzb, false);
        return zzekVar.zzq() == this.zza;
    }
}
