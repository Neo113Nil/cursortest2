package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzagd extends zzagn {
    private zzzv zza;
    private zzagc zzb;

    zzagd() {
    }

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzagn
    protected final long zza(zzef zzefVar) {
        if (!zzd(zzefVar.zzH())) {
            return -1L;
        }
        int i = (zzefVar.zzH()[2] & UByte.MAX_VALUE) >> 4;
        if (i != 6) {
            if (i == 7) {
                i = 7;
            }
            int zza = zzzr.zza(zzefVar, i);
            zzefVar.zzF(0);
            return zza;
        }
        zzefVar.zzG(4);
        zzefVar.zzu();
        int zza2 = zzzr.zza(zzefVar, i);
        zzefVar.zzF(0);
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzagn
    protected final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagn
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzef zzefVar, long j, zzagk zzagkVar) {
        byte[] zzH = zzefVar.zzH();
        zzzv zzzvVar = this.zza;
        if (zzzvVar == null) {
            zzzv zzzvVar2 = new zzzv(zzH, 17);
            this.zza = zzzvVar2;
            zzagkVar.zza = zzzvVar2.zzc(Arrays.copyOfRange(zzH, 9, zzefVar.zzd()), null);
            return true;
        }
        if ((zzH[0] & ByteCompanionObject.MAX_VALUE) == 3) {
            zzzu zzb = zzzs.zzb(zzefVar);
            zzzv zzf = zzzvVar.zzf(zzb);
            this.zza = zzf;
            this.zzb = new zzagc(zzf, zzb);
            return true;
        }
        if (!zzd(zzH)) {
            return true;
        }
        zzagc zzagcVar = this.zzb;
        if (zzagcVar != null) {
            zzagcVar.zza(j);
            zzagkVar.zzb = this.zzb;
        }
        Objects.requireNonNull(zzagkVar.zza);
        return false;
    }
}
