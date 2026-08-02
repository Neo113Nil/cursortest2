package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzahb implements zzahc {
    private final List zza;
    private final zzaap[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf = -9223372036854775807L;

    public zzahb(List list) {
        this.zza = list;
        this.zzb = new zzaap[list.size()];
    }

    private final boolean zzf(zzef zzefVar, int i) {
        if (zzefVar.zza() == 0) {
            return false;
        }
        if (zzefVar.zzk() != i) {
            this.zzc = false;
        }
        this.zzd--;
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zza(zzef zzefVar) {
        if (this.zzc) {
            if (this.zzd != 2 || zzf(zzefVar, 32)) {
                if (this.zzd != 1 || zzf(zzefVar, 0)) {
                    int zzc = zzefVar.zzc();
                    int zza = zzefVar.zza();
                    for (zzaap zzaapVar : this.zzb) {
                        zzefVar.zzF(zzc);
                        zzaapVar.zzq(zzefVar, zza);
                    }
                    this.zze += zza;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zzb(zzzl zzzlVar, zzaio zzaioVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzail zzailVar = (zzail) this.zza.get(i);
            zzaioVar.zzc();
            zzaap zzv = zzzlVar.zzv(zzaioVar.zza(), 3);
            zzad zzadVar = new zzad();
            zzadVar.zzH(zzaioVar.zzb());
            zzadVar.zzS("application/dvbsubs");
            zzadVar.zzI(Collections.singletonList(zzailVar.zzb));
            zzadVar.zzK(zzailVar.zza);
            zzv.zzk(zzadVar.zzY());
            this.zzb[i] = zzv;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zzc() {
        if (this.zzc) {
            if (this.zzf != -9223372036854775807L) {
                for (zzaap zzaapVar : this.zzb) {
                    zzaapVar.zzs(this.zzf, 1, this.zze, 0, null);
                }
            }
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zzd(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzc = true;
        if (j != -9223372036854775807L) {
            this.zzf = j;
        }
        this.zze = 0;
        this.zzd = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zze() {
        this.zzc = false;
        this.zzf = -9223372036854775807L;
    }
}
