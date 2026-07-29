package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzgbc implements zzfwv {
    private final zzfxa zza;
    private final byte[] zzb = {0};

    /* synthetic */ zzgbc(zzfxa zzfxaVar, zzgbb zzgbbVar) {
        this.zza = zzfxaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwv
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Logger logger;
        int length = bArr.length;
        if (length <= 5) {
            throw new GeneralSecurityException("tag too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 5);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
        for (zzfwx zzfwxVar : this.zza.zze(copyOf)) {
            try {
                if (zzfwxVar.zzd() == 4) {
                    ((zzfwv) zzfwxVar.zza()).zza(copyOfRange, zzghf.zzc(bArr2, this.zzb));
                    return;
                } else {
                    ((zzfwv) zzfwxVar.zza()).zza(copyOfRange, bArr2);
                    return;
                }
            } catch (GeneralSecurityException e) {
                logger = zzgbd.zza;
                logger.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e.toString()));
            }
        }
        Iterator it = this.zza.zze(zzfwi.zza).iterator();
        while (it.hasNext()) {
            try {
                ((zzfwv) ((zzfwx) it.next()).zza()).zza(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override // com.google.android.gms.internal.ads.zzfwv
    public final byte[] zzb(byte[] bArr) throws GeneralSecurityException {
        return this.zza.zzb().zzd() == 4 ? zzghf.zzc(this.zza.zzb().zzb(), ((zzfwv) this.zza.zzb().zza()).zzb(zzghf.zzc(bArr, this.zzb))) : zzghf.zzc(this.zza.zzb().zzb(), ((zzfwv) this.zza.zzb().zza()).zzb(bArr));
    }
}
