package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import kotlin.UByte;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzagj extends zzagn {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    zzagj() {
    }

    public static boolean zzd(zzef zzefVar) {
        return zzk(zzefVar, zza);
    }

    private static boolean zzk(zzef zzefVar, byte[] bArr) {
        if (zzefVar.zza() < 8) {
            return false;
        }
        int zzc = zzefVar.zzc();
        byte[] bArr2 = new byte[8];
        zzefVar.zzB(bArr2, 0, 8);
        zzefVar.zzF(zzc);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzagn
    protected final long zza(zzef zzefVar) {
        byte[] zzH = zzefVar.zzH();
        int i = zzH[0] & UByte.MAX_VALUE;
        int i2 = i & 3;
        int i3 = 2;
        if (i2 == 0) {
            i3 = 1;
        } else if (i2 != 1 && i2 != 2) {
            i3 = zzH[1] & 63;
        }
        int i4 = i >> 3;
        return zzg(i3 * (i4 >= 16 ? 2500 << r1 : i4 >= 12 ? 10000 << (r1 & 1) : (i4 & 3) == 3 ? 60000 : 10000 << r1));
    }

    @Override // com.google.android.gms.internal.ads.zzagn
    protected final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagn
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzef zzefVar, long j, zzagk zzagkVar) throws zzbu {
        if (zzk(zzefVar, zza)) {
            byte[] copyOf = Arrays.copyOf(zzefVar.zzH(), zzefVar.zzd());
            int i = copyOf[9] & UByte.MAX_VALUE;
            List zza2 = zzaag.zza(copyOf);
            if (zzagkVar.zza != null) {
                return true;
            }
            zzad zzadVar = new zzad();
            zzadVar.zzS("audio/opus");
            zzadVar.zzw(i);
            zzadVar.zzT(48000);
            zzadVar.zzI(zza2);
            zzagkVar.zza = zzadVar.zzY();
            return true;
        }
        if (!zzk(zzefVar, zzb)) {
            zzdd.zzb(zzagkVar.zza);
            return false;
        }
        zzdd.zzb(zzagkVar.zza);
        if (this.zzc) {
            return true;
        }
        this.zzc = true;
        zzefVar.zzG(8);
        zzbq zzb2 = zzaav.zzb(zzfvn.zzn(zzaav.zzc(zzefVar, false, false).zzb));
        if (zzb2 == null) {
            return true;
        }
        zzad zzb3 = zzagkVar.zza.zzb();
        zzb3.zzM(zzb2.zzd(zzagkVar.zza.zzk));
        zzagkVar.zza = zzb3.zzY();
        return true;
    }
}
