package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzair {
    private final List zza;
    private final zzaap[] zzb;

    public zzair(List list) {
        this.zza = list;
        this.zzb = new zzaap[list.size()];
    }

    public final void zza(long j, zzef zzefVar) {
        if (zzefVar.zza() < 9) {
            return;
        }
        int zze = zzefVar.zze();
        int zze2 = zzefVar.zze();
        int zzk = zzefVar.zzk();
        if (zze == 434 && zze2 == 1195456820 && zzk == 3) {
            zzyv.zzb(j, zzefVar, this.zzb);
        }
    }

    public final void zzb(zzzl zzzlVar, zzaio zzaioVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzaioVar.zzc();
            zzaap zzv = zzzlVar.zzv(zzaioVar.zza(), 3);
            zzaf zzafVar = (zzaf) this.zza.get(i);
            String str = zzafVar.zzm;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zzdd.zze(z, "Invalid closed caption mime type provided: ".concat(String.valueOf(str)));
            zzad zzadVar = new zzad();
            zzadVar.zzH(zzaioVar.zzb());
            zzadVar.zzS(str);
            zzadVar.zzU(zzafVar.zze);
            zzadVar.zzK(zzafVar.zzd);
            zzadVar.zzu(zzafVar.zzE);
            zzadVar.zzI(zzafVar.zzo);
            zzv.zzk(zzadVar.zzY());
            this.zzb[i] = zzv;
        }
    }
}
