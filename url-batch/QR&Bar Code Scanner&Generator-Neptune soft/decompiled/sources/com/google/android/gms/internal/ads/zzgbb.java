package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgbb {
    private static final Logger zza = Logger.getLogger(zzgbb.class.getName());
    private final ConcurrentMap zzb;

    zzgbb() {
        this.zzb = new ConcurrentHashMap();
    }

    private final synchronized zzgba zzg(String str) throws GeneralSecurityException {
        if (!this.zzb.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzgba) this.zzb.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        r6.zzb.putIfAbsent(r0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void zzh(zzgba zzgbaVar, boolean z) throws GeneralSecurityException {
        String zzf = zzgbaVar.zzb().zzf();
        zzgba zzgbaVar2 = (zzgba) this.zzb.get(zzf);
        if (zzgbaVar2 != null && !zzgbaVar2.zzc().equals(zzgbaVar.zzc())) {
            zza.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(zzf));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", zzf, zzgbaVar2.zzc().getName(), zzgbaVar.zzc().getName()));
        }
        this.zzb.put(zzf, zzgbaVar);
    }

    final zzgau zza(String str, Class cls) throws GeneralSecurityException {
        zzgba zzg = zzg(str);
        if (zzg.zze().contains(cls)) {
            return zzg.zza(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzg.zzc());
        Set<Class> zze = zzg.zze();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : zze) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", supported primitives: " + sb.toString());
    }

    final zzgau zzb(String str) throws GeneralSecurityException {
        return zzg(str).zzb();
    }

    final synchronized void zzc(zzggg zzgggVar, zzgfr zzgfrVar) throws GeneralSecurityException {
        Class zzd;
        int zze = zzgfrVar.zze();
        if (!zzgds.zza(1)) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzgggVar.getClass()) + " as it is not FIPS compatible.");
        }
        if (!zzgds.zza(zze)) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzgfrVar.getClass()) + " as it is not FIPS compatible.");
        }
        String zzc = zzgggVar.zzc();
        String zzc2 = zzgfrVar.zzc();
        if (this.zzb.containsKey(zzc) && ((zzgba) this.zzb.get(zzc)).zzd() != null && (zzd = ((zzgba) this.zzb.get(zzc)).zzd()) != null && !zzd.getName().equals(zzgfrVar.getClass().getName())) {
            zza.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + zzc + " with inconsistent public key type " + zzc2);
            throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", zzgggVar.getClass().getName(), zzd.getName(), zzgfrVar.getClass().getName()));
        }
        zzh(new zzgaz(zzgggVar, zzgfrVar), true);
        zzh(new zzgay(zzgfrVar), false);
    }

    final synchronized void zzd(zzgau zzgauVar) throws GeneralSecurityException {
        if (!zzgds.zza(1)) {
            throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
        }
        zzh(new zzgax(zzgauVar), false);
    }

    final synchronized void zze(zzgfr zzgfrVar) throws GeneralSecurityException {
        if (!zzgds.zza(zzgfrVar.zze())) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzgfrVar.getClass()) + " as it is not FIPS compatible.");
        }
        zzh(new zzgay(zzgfrVar), false);
    }

    final boolean zzf(String str) {
        return this.zzb.containsKey(str);
    }

    zzgbb(zzgbb zzgbbVar) {
        this.zzb = new ConcurrentHashMap(zzgbbVar.zzb);
    }
}
