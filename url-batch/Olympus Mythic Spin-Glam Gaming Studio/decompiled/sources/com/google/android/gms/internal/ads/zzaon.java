package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
public final class zzaon implements zzanz {
    private final zzeu zza = new zzeu();
    private final zzeu zzb = new zzeu();
    private final zzaom zzc = new zzaom();

    @Nullable
    private Inflater zzd;

    @Override // com.google.android.gms.internal.ads.zzanz
    public final void zza(byte[] bArr, int i, int i2, zzany zzanyVar, zzdu zzduVar) {
        zzeu zzeuVar = this.zza;
        zzeuVar.zzb(bArr, i2 + i);
        zzeuVar.zzh(i);
        if (this.zzd == null) {
            this.zzd = new Inflater();
        }
        zzeu zzeuVar2 = this.zzb;
        if (zzfm.zzQ(zzeuVar, zzeuVar2, this.zzd)) {
            zzeuVar.zzb(zzeuVar2.zzi(), zzeuVar2.zze());
        }
        zzaom zzaomVar = this.zzc;
        zzaomVar.zzb();
        ArrayList arrayList = new ArrayList();
        while (zzeuVar.zzd() >= 3) {
            int zze = zzeuVar.zze();
            int zzs = zzeuVar.zzs();
            int zzt = zzeuVar.zzt();
            int zzg = zzeuVar.zzg() + zzt;
            zzcy zzcyVar = null;
            if (zzg > zze) {
                zzeuVar.zzh(zze);
            } else {
                if (zzs != 128) {
                    switch (zzs) {
                        case 20:
                            zzaomVar.zzc(zzeuVar, zzt);
                            break;
                        case 21:
                            zzaomVar.zzd(zzeuVar, zzt);
                            break;
                        case 22:
                            zzaomVar.zze(zzeuVar, zzt);
                            break;
                    }
                } else {
                    zzcyVar = zzaomVar.zza();
                    zzaomVar.zzb();
                }
                zzeuVar.zzh(zzg);
            }
            if (zzcyVar != null) {
                arrayList.add(zzcyVar);
            }
        }
        zzduVar.zza(new zzanr(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
