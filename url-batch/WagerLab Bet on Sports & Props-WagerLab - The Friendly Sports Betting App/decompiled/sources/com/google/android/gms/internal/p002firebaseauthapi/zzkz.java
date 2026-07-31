package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzkz implements zzpz<zzbd, zzbd> {
    private static final zzkz zza = new zzkz();
    private static final zzps<zzof, zzbd> zzb = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzky
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            return zzmn.zza((zzof) zzbiVar);
        }
    }, zzof.class, zzbd.class);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
    public final Class<zzbd> zza() {
        return zzbd.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
    public final Class<zzbd> zzb() {
        return zzbd.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpz
    public final /* synthetic */ zzbd zza(zzob zzobVar, zzok zzokVar, zzqc<zzbd> zzqcVar) throws GeneralSecurityException {
        zzoo zzooVar;
        zzaaj zzc;
        zzpn zzpnVar = new zzpn();
        for (int i = 0; i < zzobVar.zza(); i++) {
            zzoa zza2 = zzobVar.zza(i);
            if (zza2.zzc().equals(zzbk.zza)) {
                zzbd zza3 = zzqcVar.zza(zza2);
                zzbi zzb2 = zza2.zzb();
                if (zzb2 instanceof zzlj) {
                    zzc = ((zzlj) zzb2).zzh();
                } else if (zzb2 instanceof zzof) {
                    zzc = ((zzof) zzb2).zzc();
                } else {
                    throw new GeneralSecurityException("Cannot get output prefix for key of class " + zzb2.getClass().getName() + " with parameters " + String.valueOf(zzb2.zza()));
                }
                zzpnVar.zza(zzc, new zzlb(zza3, zza2.zza()));
            }
        }
        if (!zzokVar.zza()) {
            zzooVar = zzow.zzb().zza().zza(zzobVar, zzokVar, "hybrid_decrypt", "decrypt");
        } else {
            zzooVar = zzon.zza;
        }
        return new zzla(zzpnVar.zza(), zzooVar);
    }

    zzkz() {
    }

    public static void zzc() throws GeneralSecurityException {
        zzpa.zza().zza(zza);
        zzpa.zza().zza(zzb);
    }

    public static void zza(zzpy zzpyVar) throws GeneralSecurityException {
        zzpyVar.zza(zza);
    }
}
