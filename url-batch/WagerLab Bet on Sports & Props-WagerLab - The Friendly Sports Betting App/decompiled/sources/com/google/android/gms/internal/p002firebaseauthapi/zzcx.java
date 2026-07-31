package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzcx implements zzpz<zzba, zzba> {
    private static final zzcx zza = new zzcx();
    private static final zzps<zzof, zzba> zzb = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzda
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            return zzia.zza((zzof) zzbiVar);
        }
    }, zzof.class, zzba.class);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
    public final Class<zzba> zza() {
        return zzba.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
    public final Class<zzba> zzb() {
        return zzba.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
    public final /* synthetic */ zzba zza(zzob zzobVar, zzok zzokVar, zzqc<zzba> zzqcVar) throws GeneralSecurityException {
        zzoo zzooVar;
        zzoo zzooVar2;
        zzaaj zzc;
        zzpn zzpnVar = new zzpn();
        for (int i = 0; i < zzobVar.zza(); i++) {
            zzoa zza2 = zzobVar.zza(i);
            if (zza2.zzc().equals(zzbk.zza)) {
                zzbi zzb2 = zza2.zzb();
                if (zzb2 instanceof zzcw) {
                    zzc = ((zzcw) zzb2).zzd();
                } else if (zzb2 instanceof zzof) {
                    zzc = ((zzof) zzb2).zzc();
                } else {
                    throw new GeneralSecurityException("Cannot get output prefix for key of class " + zzb2.getClass().getName() + " with parameters " + String.valueOf(zzb2.zza()));
                }
                zzpnVar.zza(zzc, new zzcz(zzqcVar.zza(zza2), zza2.zza()));
            }
        }
        if (!zzokVar.zza()) {
            zzol zza3 = zzow.zzb().zza();
            zzooVar = zza3.zza(zzobVar, zzokVar, "aead", "encrypt");
            zzooVar2 = zza3.zza(zzobVar, zzokVar, "aead", "decrypt");
        } else {
            zzooVar = zzon.zza;
            zzooVar2 = zzon.zza;
        }
        return new zzdc(new zzcz(zzqcVar.zza(zzobVar.zzc()), zzobVar.zzc().zza()), zzpnVar.zza(), zzooVar, zzooVar2);
    }

    zzcx() {
    }

    public static void zzc() throws GeneralSecurityException {
        zzpa.zza().zza(zza);
        zzpa.zza().zza(zzb);
    }

    public static void zza(zzpy zzpyVar) throws GeneralSecurityException {
        zzpyVar.zza(zza);
    }
}
