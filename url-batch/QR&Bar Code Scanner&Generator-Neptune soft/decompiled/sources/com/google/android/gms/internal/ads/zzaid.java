package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzaid {
    private final List zza;
    private final zzaap[] zzb;

    public zzaid(List list) {
        this.zza = list;
        this.zzb = new zzaap[list.size()];
    }

    public final void zza(long j, zzef zzefVar) {
        zzyv.zza(j, zzefVar, this.zzb);
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
            String str2 = zzafVar.zzb;
            if (str2 == null) {
                str2 = zzaioVar.zzb();
            }
            zzad zzadVar = new zzad();
            zzadVar.zzH(str2);
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
