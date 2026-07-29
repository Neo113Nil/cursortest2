package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
final class zzafb extends zzafl {
    private zzzf zza;
    private zzafa zzb;

    zzafb() {
    }

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    protected final long zza(zzdy zzdyVar) {
        if (!zzd(zzdyVar.zzH())) {
            return -1L;
        }
        int i = (zzdyVar.zzH()[2] & UByte.MAX_VALUE) >> 4;
        if (i != 6) {
            if (i == 7) {
                i = 7;
            }
            int zza = zzzb.zza(zzdyVar, i);
            zzdyVar.zzF(0);
            return zza;
        }
        zzdyVar.zzG(4);
        zzdyVar.zzu();
        int zza2 = zzzb.zza(zzdyVar, i);
        zzdyVar.zzF(0);
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    protected final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzdy zzdyVar, long j, zzafi zzafiVar) {
        byte[] zzH = zzdyVar.zzH();
        zzzf zzzfVar = this.zza;
        if (zzzfVar == null) {
            zzzf zzzfVar2 = new zzzf(zzH, 17);
            this.zza = zzzfVar2;
            zzafiVar.zza = zzzfVar2.zzc(Arrays.copyOfRange(zzH, 9, zzdyVar.zzd()), null);
            return true;
        }
        if ((zzH[0] & ByteCompanionObject.MAX_VALUE) == 3) {
            zzze zzb = zzzc.zzb(zzdyVar);
            zzzf zzf = zzzfVar.zzf(zzb);
            this.zza = zzf;
            this.zzb = new zzafa(zzf, zzb);
            return true;
        }
        if (!zzd(zzH)) {
            return true;
        }
        zzafa zzafaVar = this.zzb;
        if (zzafaVar != null) {
            zzafaVar.zza(j);
            zzafiVar.zzb = this.zzb;
        }
        Objects.requireNonNull(zzafiVar.zza);
        return false;
    }
}
