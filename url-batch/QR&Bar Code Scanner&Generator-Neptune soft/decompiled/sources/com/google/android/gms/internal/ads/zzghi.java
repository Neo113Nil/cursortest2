package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzghi implements zzgbj {
    private final zzgbu zza;
    private final zzghn zzb;
    private final zzghn zzc;

    /* synthetic */ zzghi(zzgbu zzgbuVar, zzghh zzghhVar) {
        zzghn zzghnVar;
        this.zza = zzgbuVar;
        if (zzgbuVar.zzf()) {
            zzgho zzb = zzgfx.zza().zzb();
            zzght zza = zzgfu.zza(zzgbuVar);
            this.zzb = zzb.zza(zza, "mac", "compute");
            zzghnVar = zzb.zza(zza, "mac", "verify");
        } else {
            zzghnVar = zzgfu.zza;
            this.zzb = zzghnVar;
        }
        this.zzc = zzghnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgbj
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3;
        Logger logger;
        byte[] bArr4;
        int length = bArr.length;
        if (length <= 5) {
            throw new GeneralSecurityException("tag too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 5);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
        for (zzgbo zzgboVar : this.zza.zze(copyOf)) {
            if (zzgboVar.zzf() == 4) {
                bArr4 = zzghj.zzb;
                bArr3 = zzgnv.zzc(bArr2, bArr4);
            } else {
                bArr3 = bArr2;
            }
            try {
                ((zzgbj) zzgboVar.zzc()).zza(copyOfRange, bArr3);
                zzgboVar.zza();
                return;
            } catch (GeneralSecurityException e) {
                logger = zzghj.zza;
                logger.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e.toString()));
            }
        }
        for (zzgbo zzgboVar2 : this.zza.zze(zzgap.zza)) {
            try {
                ((zzgbj) zzgboVar2.zzc()).zza(bArr, bArr2);
                zzgboVar2.zza();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override // com.google.android.gms.internal.ads.zzgbj
    public final byte[] zzb(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2;
        if (this.zza.zza().zzf() == 4) {
            bArr2 = zzghj.zzb;
            bArr = zzgnv.zzc(bArr, bArr2);
        }
        try {
            byte[] zzc = zzgnv.zzc(this.zza.zza().zzd(), ((zzgbj) this.zza.zza().zzc()).zzb(bArr));
            this.zza.zza().zza();
            return zzc;
        } catch (GeneralSecurityException e) {
            throw e;
        }
    }
}
