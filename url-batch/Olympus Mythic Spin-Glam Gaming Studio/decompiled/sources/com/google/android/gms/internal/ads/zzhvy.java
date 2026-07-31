package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhvy {
    private zzhwb zza = null;
    private zzici zzb = null;

    private zzhvy() {
    }

    /* synthetic */ zzhvy(byte[] bArr) {
    }

    public final zzhvy zza(zzhwb zzhwbVar) {
        this.zza = zzhwbVar;
        return this;
    }

    public final zzhvy zzb(zzici zziciVar) {
        this.zzb = zziciVar;
        return this;
    }

    public final zzhvz zzc() throws GeneralSecurityException {
        zzhwb zzhwbVar = this.zza;
        if (zzhwbVar == null) {
            throw new GeneralSecurityException("Cannot build without a ecdsa public key");
        }
        zzici zziciVar = this.zzb;
        if (zziciVar == null) {
            throw new GeneralSecurityException("Cannot build without a private value");
        }
        BigInteger zzb = zziciVar.zzb(zzheq.zza());
        ECPoint zzd = zzhwbVar.zzd();
        zzhvt zzd2 = zzhwbVar.zzf().zzd();
        BigInteger order = zzd2.zza().getOrder();
        if (zzb.signum() <= 0 || zzb.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        if (zzhmm.zzd(zzb, zzd2.zza()).equals(zzd)) {
            return new zzhvz(this.zza, this.zzb, null);
        }
        throw new GeneralSecurityException("Invalid private value");
    }
}
