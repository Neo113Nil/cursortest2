package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzanj implements zzabt {
    private final zzer zza;
    private final zzek zzb = new zzek();
    private final int zzc;

    public zzanj(int i, zzer zzerVar, int i2) {
        this.zzc = i;
        this.zza = zzerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabt
    public final zzabs zza(zzacl zzaclVar, long j) throws IOException {
        int zza;
        int zza2;
        long zzf = zzaclVar.zzf();
        int min = (int) Math.min(112800L, zzaclVar.zzd() - zzf);
        this.zzb.zzH(min);
        ((zzaby) zzaclVar).zzm(this.zzb.zzM(), 0, min, false);
        zzek zzekVar = this.zzb;
        int zze = zzekVar.zze();
        long j2 = -1;
        long j3 = -9223372036854775807L;
        long j4 = -1;
        while (zzekVar.zzb() >= 188 && (zza2 = (zza = zzanu.zza(zzekVar.zzM(), zzekVar.zzd(), zze)) + Opcodes.NEWARRAY) <= zze) {
            long zzb = zzanu.zzb(zzekVar, zza, this.zzc);
            if (zzb != -9223372036854775807L) {
                long zzb2 = this.zza.zzb(zzb);
                if (zzb2 <= j) {
                    j4 = zza;
                    if (100000 + zzb2 <= j) {
                        j3 = zzb2;
                    }
                } else if (j3 == -9223372036854775807L) {
                    return zzabs.zzd(zzb2, zzf);
                }
                return zzabs.zze(zzf + j4);
            }
            zzekVar.zzK(zza2);
            j2 = zza2;
        }
        return j3 != -9223372036854775807L ? zzabs.zzf(j3, zzf + j2) : zzabs.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabt
    public final void zzb() {
        byte[] bArr = zzet.zzf;
        int length = bArr.length;
        this.zzb.zzI(bArr, 0);
    }
}
