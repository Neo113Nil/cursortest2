package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
public final class zzapg implements zzanz {
    public static final zzanr zza = new zzanr(zzgxm.zzi(), -9223372036854775807L, -9223372036854775807L);
    private final zzeu zzb = new zzeu();
    private final zzeu zzc = new zzeu();
    private final zzapf zzd;

    @Nullable
    private Inflater zze;

    public zzapg(List list) {
        zzapf zzapfVar = new zzapf();
        this.zzd = zzapfVar;
        zzapfVar.zza(new String((byte[]) list.get(0), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.zzanz
    public final void zza(byte[] bArr, int i, int i2, zzany zzanyVar, zzdu zzduVar) {
        zzanr zzanrVar;
        zzeu zzeuVar = this.zzb;
        zzeuVar.zzb(bArr, i2 + i);
        zzeuVar.zzh(i);
        if (this.zze == null) {
            this.zze = new Inflater();
        }
        zzeu zzeuVar2 = this.zzc;
        if (zzfm.zzQ(zzeuVar, zzeuVar2, this.zze)) {
            zzeuVar.zzb(zzeuVar2.zzi(), zzeuVar2.zze());
        }
        zzapf zzapfVar = this.zzd;
        zzapfVar.zzc();
        int zzd = zzeuVar.zzd();
        if (zzd < 2 || zzeuVar.zzt() != zzd) {
            zzanrVar = zza;
        } else {
            zzapfVar.zzd(zzeuVar);
            long zzf = zzapfVar.zzf();
            zzcy zzb = zzapfVar.zzb(zzeuVar);
            long j = -9223372036854775807L;
            if (zzf != -9223372036854775807L) {
                if (zzapfVar.zze() != -9223372036854775807L) {
                    if (zzapfVar.zzf() > zzapfVar.zze()) {
                        j = zzapfVar.zzf() - zzapfVar.zze();
                    }
                }
                j = zzapfVar.zzf();
            }
            zzanrVar = new zzanr(zzb != null ? zzgxm.zzj(zzb) : zzgxm.zzi(), zzapfVar.zze(), j);
        }
        zzduVar.zza(zzanrVar);
    }
}
