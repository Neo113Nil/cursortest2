package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzkg;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzki extends zzlj {
    private final zzkq zza;
    private final zzaal zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlj, com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final /* synthetic */ zzbi zzc() {
        return (zzkq) zzc();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlj, com.google.android.gms.internal.p002firebaseauthapi.zzbi
    public final /* synthetic */ zzcb zza() {
        return (zzkg) zza();
    }

    public static zzki zza(zzkq zzkqVar, zzaal zzaalVar) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpec;
        if (zzkqVar == null) {
            throw new GeneralSecurityException("HPKE private key cannot be constructed without an HPKE public key");
        }
        if (zzaalVar == null) {
            throw new GeneralSecurityException("HPKE private key cannot be constructed without secret");
        }
        zzkg.zzf zze = ((zzkg) ((zzlg) zzkqVar.zza())).zze();
        int zza = zzaalVar.zza();
        String str = "Encoded private key byte length for " + String.valueOf(zze) + " must be %d, not " + zza;
        if (zze == zzkg.zzf.zza) {
            if (zza != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        } else if (zze == zzkg.zzf.zzb) {
            if (zza != 48) {
                throw new GeneralSecurityException(String.format(str, 48));
            }
        } else if (zze == zzkg.zzf.zzc) {
            if (zza != 66) {
                throw new GeneralSecurityException(String.format(str, 66));
            }
        } else {
            if (zze != zzkg.zzf.zzd) {
                throw new GeneralSecurityException("Unable to validate private key length for " + String.valueOf(zze));
            }
            if (zza != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        zzkg.zzf zze2 = ((zzkg) ((zzlg) zzkqVar.zza())).zze();
        byte[] zzb = zzkqVar.zze().zzb();
        byte[] zza2 = zzaalVar.zza(zzbf.zza());
        if (zze2 == zzkg.zzf.zza || zze2 == zzkg.zzf.zzb || zze2 == zzkg.zzf.zzc) {
            if (zze2 == zzkg.zzf.zza) {
                eCParameterSpec = zznj.zza;
            } else if (zze2 == zzkg.zzf.zzb) {
                eCParameterSpec = zznj.zzb;
            } else if (zze2 == zzkg.zzf.zzc) {
                eCParameterSpec = zznj.zzc;
            } else {
                throw new IllegalArgumentException("Unable to determine NIST curve params for " + String.valueOf(zze2));
            }
            BigInteger order = eCParameterSpec.getOrder();
            BigInteger zza3 = zzne.zza(zza2);
            if (zza3.signum() <= 0 || zza3.compareTo(order) >= 0) {
                throw new GeneralSecurityException("Invalid private key.");
            }
            if (!zznj.zza(zza3, eCParameterSpec).equals(zzzf.zza(eCParameterSpec.getCurve(), zzzh.UNCOMPRESSED, zzb))) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        } else if (zze2 == zzkg.zzf.zzd) {
            if (!Arrays.equals(zzaah.zza(zza2), zzb)) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        } else {
            throw new IllegalArgumentException("Unable to validate key pair for " + String.valueOf(zze2));
        }
        return new zzki(zzkqVar, zzaalVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlj
    /* renamed from: zzd */
    public final /* synthetic */ zzlg zza() {
        return (zzkg) ((zzlg) this.zza.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlj
    /* renamed from: zze */
    public final /* synthetic */ zzli zzc() {
        return this.zza;
    }

    public final zzaal zzf() {
        return this.zzb;
    }

    private zzki(zzkq zzkqVar, zzaal zzaalVar) {
        this.zza = zzkqVar;
        this.zzb = zzaalVar;
    }
}
