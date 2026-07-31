package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzkg;
import java.security.GeneralSecurityException;
import java.security.spec.EllipticCurve;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzkq extends zzli {
    private final zzkg zza;
    private final zzaaj zzb;
    private final zzaaj zzc;

    @Nullable
    private final Integer zzd;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzli, com.google.android.gms.internal.p002firebaseauthapi.zzbi
    public final /* synthetic */ zzcb zza() {
        return (zzkg) zza();
    }

    public static zzkq zza(zzkg zzkgVar, zzaaj zzaajVar, @Nullable Integer num) throws GeneralSecurityException {
        EllipticCurve curve;
        zzaaj zzb;
        zzkg.zze zzf = zzkgVar.zzf();
        if (!zzf.equals(zzkg.zze.zzc) && num == null) {
            throw new GeneralSecurityException("'idRequirement' must be non-null for " + String.valueOf(zzf) + " variant.");
        }
        if (zzf.equals(zzkg.zze.zzc) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
        zzkg.zzf zze = zzkgVar.zze();
        int zza = zzaajVar.zza();
        String str = "Encoded public key byte length for " + String.valueOf(zze) + " must be %d, not " + zza;
        if (zze == zzkg.zzf.zza) {
            if (zza != 65) {
                throw new GeneralSecurityException(String.format(str, 65));
            }
        } else if (zze == zzkg.zzf.zzb) {
            if (zza != 97) {
                throw new GeneralSecurityException(String.format(str, 97));
            }
        } else if (zze == zzkg.zzf.zzc) {
            if (zza != 133) {
                throw new GeneralSecurityException(String.format(str, 133));
            }
        } else {
            if (zze != zzkg.zzf.zzd) {
                throw new GeneralSecurityException("Unable to validate public key length for " + String.valueOf(zze));
            }
            if (zza != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        if (zze == zzkg.zzf.zza || zze == zzkg.zzf.zzb || zze == zzkg.zzf.zzc) {
            if (zze == zzkg.zzf.zza) {
                curve = zznj.zza.getCurve();
            } else if (zze == zzkg.zzf.zzb) {
                curve = zznj.zzb.getCurve();
            } else {
                if (zze != zzkg.zzf.zzc) {
                    throw new IllegalArgumentException("Unable to determine NIST curve type for " + String.valueOf(zze));
                }
                curve = zznj.zzc.getCurve();
            }
            zznj.zza(zzzf.zza(curve, zzzh.UNCOMPRESSED, zzaajVar.zzb()), curve);
        }
        zzkg.zze zzf2 = zzkgVar.zzf();
        if (zzf2 == zzkg.zze.zzc) {
            zzb = zzpe.zza;
        } else {
            if (num == null) {
                throw new IllegalStateException("idRequirement must be non-null for HpkeParameters.Variant " + String.valueOf(zzf2));
            }
            if (zzf2 == zzkg.zze.zzb) {
                zzb = zzpe.zza(num.intValue());
            } else {
                if (zzf2 != zzkg.zze.zza) {
                    throw new IllegalStateException("Unknown HpkeParameters.Variant: " + String.valueOf(zzf2));
                }
                zzb = zzpe.zzb(num.intValue());
            }
        }
        return new zzkq(zzkgVar, zzaajVar, zzb, num);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzli
    /* renamed from: zzc */
    public final /* synthetic */ zzlg zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzli
    public final zzaaj zzd() {
        return this.zzc;
    }

    public final zzaaj zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbi
    @Nullable
    public final Integer zzb() {
        return this.zzd;
    }

    private zzkq(zzkg zzkgVar, zzaaj zzaajVar, zzaaj zzaajVar2, @Nullable Integer num) {
        this.zza = zzkgVar;
        this.zzb = zzaajVar;
        this.zzc = zzaajVar2;
        this.zzd = num;
    }
}
