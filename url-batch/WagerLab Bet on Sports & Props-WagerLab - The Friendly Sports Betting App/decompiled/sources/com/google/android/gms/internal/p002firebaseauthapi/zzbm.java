package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzwx;
import com.google.android.gms.internal.p002firebaseauthapi.zzxh;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzbm implements zzob {
    private final List<zzbs> zza;
    private final zzok zzb;

    @Nullable
    private final zzbm zzc;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzob
    public final int zza() {
        return this.zza.size();
    }

    private static zzbi zza(zzxh.zzb zzbVar) throws GeneralSecurityException {
        zzqb zzb = zzb(zzbVar);
        zzoz zza = zzoz.zza();
        zzch zza2 = zzch.zza();
        return !zza.zzb(zzb) ? new zzof(zzb, zza2) : zza.zza((zzoz) zzb, zza2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzbm zzb(final zzbm zzbmVar) {
        zzbi zzbiVar;
        zzxc zzxcVar;
        int i;
        boolean z;
        boolean z2;
        final zzok zzokVar = zzbmVar.zzb;
        if (zzokVar.zza()) {
            return zzbmVar;
        }
        zzbu zzbuVar = new zzbu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzbl
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbu
            public final void zza(zzbs zzbsVar) {
                zzow.zzb().zza().zza(zzbm.this, zzokVar, "keyset_handle", "get_key").zza(zzbsVar.zza());
            }
        };
        ArrayList arrayList = new ArrayList(zzbmVar.zza.size());
        for (zzbs zzbsVar : zzbmVar.zza) {
            zzbiVar = zzbsVar.zzb;
            zzxcVar = zzbsVar.zzc;
            i = zzbsVar.zze;
            z = zzbsVar.zzf;
            z2 = zzbsVar.zzg;
            arrayList.add(new zzbs(zzbiVar, zzxcVar, i, z, z2, zzbuVar));
        }
        return new zzbm(arrayList, zzokVar, zzbmVar);
    }

    static final zzbm zza(zzxh zzxhVar) throws GeneralSecurityException {
        zzd(zzxhVar);
        return new zzbm(zzxhVar, zzc(zzxhVar), zzok.zza);
    }

    public static final zzbm zza(zzbj zzbjVar) throws GeneralSecurityException {
        return new zzbn().zza(new zzbq(zzbjVar.zza()).zzb().zza()).zza();
    }

    public final zzbm zzb() throws GeneralSecurityException {
        zzbi zzofVar;
        boolean z;
        zzxc zzxcVar;
        zzbu zzbuVar;
        zzxh.zzb zzbVar;
        zzbs zzbsVar;
        zzxc zzxcVar2;
        zzbu zzbuVar2;
        zzxc zzxcVar3;
        zzxh zzd = zzd();
        zzxh.zza zzc = zzxh.zzc();
        ArrayList arrayList = new ArrayList(this.zza.size());
        int i = 0;
        for (zzbs zzbsVar2 : this.zza) {
            if (zzbsVar2.zzb() instanceof zzce) {
                zzbi zzc2 = ((zzce) zzbsVar2.zzb()).zzc();
                zzxcVar2 = zzbsVar2.zzc;
                int zza = zzbsVar2.zza();
                boolean zze = zzbsVar2.zze();
                zzbuVar2 = zzbs.zza;
                zzbsVar = new zzbs(zzc2, zzxcVar2, zza, zze, false, zzbuVar2);
                zzxcVar3 = zzbsVar2.zzc;
                zzbVar = zzb(zzc2, zzxcVar3, zzbsVar2.zza());
            } else {
                zzxh.zzb zza2 = zzd.zza(i);
                zzwx zzb = zza2.zzb();
                if (zzb.zzb() != zzwx.zzb.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("The keyset contains a non-private key");
                }
                zzxh.zzb zzbVar2 = (zzxh.zzb) ((zzalf) zza2.zzn().zza(zzci.zza(zzb.zzf(), zzb.zze())).zze());
                try {
                    zzofVar = zza(zzbVar2);
                    z = false;
                } catch (GeneralSecurityException e) {
                    if (zziu.zza.zza()) {
                        throw e;
                    }
                    zzofVar = new zzof(zzb(zzbVar2), zzch.zza());
                    z = true;
                }
                zzbi zzbiVar = zzofVar;
                int zza3 = zzbVar2.zza();
                zzxcVar = zzbsVar2.zzc;
                boolean z2 = zza3 == zzd.zzb();
                zzbuVar = zzbs.zza;
                zzbs zzbsVar3 = new zzbs(zzbiVar, zzxcVar, zza3, z2, z, zzbuVar);
                zzbVar = zzbVar2;
                zzbsVar = zzbsVar3;
            }
            zzc.zza(zzbVar);
            arrayList.add(zzbsVar);
            i++;
        }
        zzc.zza(zzd.zzb());
        return zzb(new zzbm((zzxh) ((zzalf) zzc.zze()), arrayList, this.zzb));
    }

    private final zzbm zze() {
        zzbm zzbmVar = this.zzc;
        return zzbmVar == null ? this : zzbmVar;
    }

    @Deprecated
    public static final zzbm zza(zzbv zzbvVar, zzba zzbaVar, byte[] bArr) throws GeneralSecurityException, IOException {
        zzvv zza = zzbvVar.zza();
        if (zza == null || zza.zzc().zzb() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return zza(zza(zza, zzbaVar, bArr));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzob
    public final /* synthetic */ zzoa zza(int i) {
        zzxc zzxcVar;
        boolean z;
        if (i < 0 || i >= zza()) {
            throw new IndexOutOfBoundsException("Invalid index " + i + " for keyset of size " + zza());
        }
        zzbs zzbsVar = this.zza.get(i);
        zzxcVar = zzbsVar.zzc;
        if (!zza(zzxcVar)) {
            throw new IllegalStateException("Keyset-Entry at position " + i + " has wrong status");
        }
        z = zzbsVar.zzg;
        if (z) {
            throw new IllegalStateException("Keyset-Entry at position " + i + " didn't parse correctly");
        }
        return this.zza.get(i);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzob
    public final /* synthetic */ zzoa zzc() {
        for (zzbs zzbsVar : this.zza) {
            if (zzbsVar != null && zzbsVar.zze()) {
                if (zzbsVar.zzc() == zzbk.zza) {
                    return zzbsVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    private static zzqb zzb(zzxh.zzb zzbVar) throws GeneralSecurityException {
        return zzqb.zza(zzbVar.zzb().zzf(), zzbVar.zzb().zze(), zzbVar.zzb().zzb(), zzbVar.zzf(), zzbVar.zzf() == zzxz.RAW ? null : Integer.valueOf(zzbVar.zza()));
    }

    static /* synthetic */ zzxc zza(zzbk zzbkVar) {
        if (zzbk.zza.equals(zzbkVar)) {
            return zzxc.ENABLED;
        }
        if (zzbk.zzb.equals(zzbkVar)) {
            return zzxc.DISABLED;
        }
        if (zzbk.zzc.equals(zzbkVar)) {
            return zzxc.DESTROYED;
        }
        throw new IllegalStateException("Unknown key status");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzxh.zzb zzb(zzbi zzbiVar, zzxc zzxcVar, int i) throws GeneralSecurityException {
        zzqb zzqbVar = (zzqb) zzoz.zza().zza(zzbiVar, zzqb.class, zzch.zza());
        Integer zze = zzqbVar.zze();
        if (zze != null && zze.intValue() != i) {
            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
        }
        return (zzxh.zzb) ((zzalf) zzxh.zzb.zzd().zza(zzwx.zza().zza(zzqbVar.zzf()).zza(zzqbVar.zzd()).zza(zzqbVar.zza())).zza(zzxcVar).zza(i).zza(zzqbVar.zzb()).zze());
    }

    private static zzxh zza(zzvv zzvvVar, zzba zzbaVar, byte[] bArr) throws GeneralSecurityException {
        try {
            zzxh zza = zzxh.zza(zzbaVar.zza(zzvvVar.zzc().zzd(), bArr), zzaku.zza());
            zzd(zza);
            return zza;
        } catch (zzall unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    final zzxh zzd() {
        zzxc zzxcVar;
        try {
            zzxh.zza zzc = zzxh.zzc();
            for (zzbs zzbsVar : this.zza) {
                zzbi zzb = zzbsVar.zzb();
                zzxcVar = zzbsVar.zzc;
                zzc.zza(zzb(zzb, zzxcVar, zzbsVar.zza()));
                if (zzbsVar.zze()) {
                    zzc.zza(zzbsVar.zza());
                }
            }
            return (zzxh) ((zzalf) zzc.zze());
        } catch (GeneralSecurityException e) {
            throw new zzql(e);
        }
    }

    public final <P> P zza(zzbb zzbbVar, Class<P> cls) throws GeneralSecurityException {
        boolean z;
        zzxc zzxcVar;
        if (!(zzbbVar instanceof zznp)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        zznp zznpVar = (zznp) zzbbVar;
        zzxh zzd = zze().zzd();
        zzcm.zzb(zzd);
        for (int i = 0; i < zza(); i++) {
            z = this.zza.get(i).zzg;
            if (!z) {
                zzxcVar = this.zza.get(i).zzc;
                if (zza(zzxcVar)) {
                }
            }
            throw new GeneralSecurityException("Key parsing of key with index " + i + " and type_url " + zzd.zza(i).zzb().zzf() + " failed, unable to get primitive");
        }
        return (P) zznpVar.zza(zze(), this.zzb, cls);
    }

    public final String toString() {
        return zzcm.zza(zzd()).toString();
    }

    private static List<zzbs> zzc(zzxh zzxhVar) throws GeneralSecurityException {
        zzbi zzofVar;
        boolean z;
        zzbu zzbuVar;
        ArrayList arrayList = new ArrayList(zzxhVar.zza());
        for (zzxh.zzb zzbVar : zzxhVar.zze()) {
            int zza = zzbVar.zza();
            try {
                zzofVar = zza(zzbVar);
                z = false;
            } catch (GeneralSecurityException e) {
                if (zziu.zza.zza()) {
                    throw e;
                }
                zzofVar = new zzof(zzb(zzbVar), zzch.zza());
                z = true;
            }
            if (zziu.zza.zza() && !zza(zzbVar.zzc())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            zzxc zzc = zzbVar.zzc();
            boolean z2 = zza == zzxhVar.zzb();
            zzbuVar = zzbs.zza;
            arrayList.add(new zzbs(zzofVar, zzc, zza, z2, z, zzbuVar));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private zzbm(zzxh zzxhVar, List<zzbs> list, zzok zzokVar) throws GeneralSecurityException {
        this.zza = list;
        this.zzb = zzokVar;
        if (zziu.zza.zza()) {
            HashSet hashSet = new HashSet();
            for (zzxh.zzb zzbVar : zzxhVar.zze()) {
                if (hashSet.contains(Integer.valueOf(zzbVar.zza()))) {
                    throw new GeneralSecurityException("KeyID " + zzbVar.zza() + " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                }
                hashSet.add(Integer.valueOf(zzbVar.zza()));
            }
            if (!hashSet.contains(Integer.valueOf(zzxhVar.zzb()))) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.zzc = null;
    }

    private zzbm(List<zzbs> list, zzok zzokVar, zzbm zzbmVar) {
        this.zza = list;
        this.zzb = zzokVar;
        this.zzc = zzbmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(zzxh zzxhVar) throws GeneralSecurityException {
        if (zzxhVar == null || zzxhVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    @Deprecated
    public final void zza(zzby zzbyVar) throws GeneralSecurityException, IOException {
        zzxh zzd = zzd();
        for (zzxh.zzb zzbVar : zzd.zze()) {
            if (zzbVar.zzb().zzb() == zzwx.zzb.UNKNOWN_KEYMATERIAL || zzbVar.zzb().zzb() == zzwx.zzb.SYMMETRIC || zzbVar.zzb().zzb() == zzwx.zzb.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", zzbVar.zzb().zzb().name(), zzbVar.zzb().zzf()));
            }
        }
        zzbyVar.zza(zzd);
    }

    @Deprecated
    public final void zza(zzby zzbyVar, zzba zzbaVar, byte[] bArr) throws GeneralSecurityException, IOException {
        zzxh zzd = zzd();
        zzbyVar.zza((zzvv) ((zzalf) zzvv.zza().zza(zzajv.zza(zzbaVar.zzb(zzd.zzk(), bArr))).zza(zzcm.zza(zzd)).zze()));
    }

    private static boolean zza(zzxc zzxcVar) {
        int i = zzbo.zza[zzxcVar.ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
