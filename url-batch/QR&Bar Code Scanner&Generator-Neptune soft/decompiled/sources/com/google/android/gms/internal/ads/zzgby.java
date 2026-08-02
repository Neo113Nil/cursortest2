package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgby {
    private static final Logger zza = Logger.getLogger(zzgby.class.getName());
    private static final AtomicReference zzb = new AtomicReference(new zzgbb());
    private static final ConcurrentMap zzc = new ConcurrentHashMap();
    private static final ConcurrentMap zzd = new ConcurrentHashMap();
    private static final ConcurrentMap zze = new ConcurrentHashMap();
    private static final ConcurrentMap zzf = new ConcurrentHashMap();
    private static final ConcurrentMap zzg = new ConcurrentHashMap();

    private zzgby() {
    }

    @Deprecated
    public static zzgan zza(String str) throws GeneralSecurityException {
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        zzgan zzganVar = (zzgan) zze.get(str.toLowerCase(Locale.US));
        if (zzganVar != null) {
            return zzganVar;
        }
        String format = String.format("no catalogue found for %s. ", str);
        if (str.toLowerCase(Locale.US).startsWith("tinkaead")) {
            format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
        }
        if (str.toLowerCase(Locale.US).startsWith("tinkdeterministicaead")) {
            format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tinkstreamingaead")) {
            format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tinkhybriddecrypt") || str.toLowerCase(Locale.US).startsWith("tinkhybridencrypt")) {
            format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tinkmac")) {
            format = String.valueOf(format).concat("Maybe call MacConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tinkpublickeysign") || str.toLowerCase(Locale.US).startsWith("tinkpublickeyverify")) {
            format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tink")) {
            format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
        }
        throw new GeneralSecurityException(format);
    }

    public static zzgau zzb(String str) throws GeneralSecurityException {
        return ((zzgbb) zzb.get()).zzb(str);
    }

    public static synchronized zzglx zzc(zzgmc zzgmcVar) throws GeneralSecurityException {
        zzglx zza2;
        synchronized (zzgby.class) {
            zzgau zzb2 = zzb(zzgmcVar.zzf());
            if (!((Boolean) zzd.get(zzgmcVar.zzf())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgmcVar.zzf())));
            }
            zza2 = zzb2.zza(zzgmcVar.zze());
        }
        return zza2;
    }

    public static synchronized zzgso zzd(zzgmc zzgmcVar) throws GeneralSecurityException {
        zzgso zzb2;
        synchronized (zzgby.class) {
            zzgau zzb3 = zzb(zzgmcVar.zzf());
            if (!((Boolean) zzd.get(zzgmcVar.zzf())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgmcVar.zzf())));
            }
            zzb2 = zzb3.zzb(zzgmcVar.zze());
        }
        return zzb2;
    }

    @Nullable
    public static Class zze(Class cls) {
        zzgbv zzgbvVar = (zzgbv) zzf.get(cls);
        if (zzgbvVar == null) {
            return null;
        }
        return zzgbvVar.zza();
    }

    public static Object zzf(zzglx zzglxVar, Class cls) throws GeneralSecurityException {
        return zzg(zzglxVar.zzf(), zzglxVar.zze(), cls);
    }

    public static Object zzg(String str, zzgpw zzgpwVar, Class cls) throws GeneralSecurityException {
        return ((zzgbb) zzb.get()).zza(str, cls).zzd(zzgpwVar);
    }

    public static Object zzh(String str, zzgso zzgsoVar, Class cls) throws GeneralSecurityException {
        return ((zzgbb) zzb.get()).zza(str, cls).zze(zzgsoVar);
    }

    public static Object zzi(String str, byte[] bArr, Class cls) throws GeneralSecurityException {
        return zzg(str, zzgpw.zzv(bArr), cls);
    }

    public static Object zzj(zzgbu zzgbuVar, Class cls) throws GeneralSecurityException {
        zzgbv zzgbvVar = (zzgbv) zzf.get(cls);
        if (zzgbvVar == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(zzgbuVar.zzc().getName())));
        }
        if (zzgbvVar.zza().equals(zzgbuVar.zzc())) {
            return zzgbvVar.zzc(zzgbuVar);
        }
        throw new GeneralSecurityException("Wrong input primitive class, expected " + zzgbvVar.zza().toString() + ", got " + zzgbuVar.zzc().toString());
    }

    static synchronized Map zzk() {
        Map unmodifiableMap;
        synchronized (zzgby.class) {
            unmodifiableMap = Collections.unmodifiableMap(zzg);
        }
        return unmodifiableMap;
    }

    public static synchronized void zzl(zzggg zzgggVar, zzgfr zzgfrVar, boolean z) throws GeneralSecurityException {
        synchronized (zzgby.class) {
            AtomicReference atomicReference = zzb;
            zzgbb zzgbbVar = new zzgbb((zzgbb) atomicReference.get());
            zzgbbVar.zzc(zzgggVar, zzgfrVar);
            String zzc2 = zzgggVar.zzc();
            String zzc3 = zzgfrVar.zzc();
            zzp(zzc2, zzgggVar.zza().zzc(), true);
            zzp(zzc3, Collections.emptyMap(), false);
            if (!((zzgbb) atomicReference.get()).zzf(zzc2)) {
                zzc.put(zzc2, new zzgbx(zzgggVar));
                zzq(zzgggVar.zzc(), zzgggVar.zza().zzc());
            }
            ConcurrentMap concurrentMap = zzd;
            concurrentMap.put(zzc2, true);
            concurrentMap.put(zzc3, false);
            atomicReference.set(zzgbbVar);
        }
    }

    public static synchronized void zzn(zzgfr zzgfrVar, boolean z) throws GeneralSecurityException {
        synchronized (zzgby.class) {
            AtomicReference atomicReference = zzb;
            zzgbb zzgbbVar = new zzgbb((zzgbb) atomicReference.get());
            zzgbbVar.zze(zzgfrVar);
            String zzc2 = zzgfrVar.zzc();
            zzp(zzc2, zzgfrVar.zza().zzc(), true);
            if (!((zzgbb) atomicReference.get()).zzf(zzc2)) {
                zzc.put(zzc2, new zzgbx(zzgfrVar));
                zzq(zzc2, zzgfrVar.zza().zzc());
            }
            zzd.put(zzc2, true);
            atomicReference.set(zzgbbVar);
        }
    }

    public static synchronized void zzo(zzgbv zzgbvVar) throws GeneralSecurityException {
        synchronized (zzgby.class) {
            if (zzgbvVar == null) {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
            Class zzb2 = zzgbvVar.zzb();
            ConcurrentMap concurrentMap = zzf;
            if (concurrentMap.containsKey(zzb2)) {
                zzgbv zzgbvVar2 = (zzgbv) concurrentMap.get(zzb2);
                if (!zzgbvVar.getClass().getName().equals(zzgbvVar2.getClass().getName())) {
                    zza.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(zzb2.toString()));
                    throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", zzb2.getName(), zzgbvVar2.getClass().getName(), zzgbvVar.getClass().getName()));
                }
            }
            concurrentMap.put(zzb2, zzgbvVar);
        }
    }

    private static synchronized void zzp(String str, Map map, boolean z) throws GeneralSecurityException {
        synchronized (zzgby.class) {
            if (z) {
                ConcurrentMap concurrentMap = zzd;
                if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                }
                if (((zzgbb) zzb.get()).zzf(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!zzg.containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (zzg.containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.gms.internal.ads.zzgso, java.lang.Object] */
    private static void zzq(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzg.put((String) entry.getKey(), zzgbd.zze(str, ((zzgfp) entry.getValue()).zza.zzax(), ((zzgfp) entry.getValue()).zzb));
        }
    }

    public static synchronized void zzm(zzgau zzgauVar, boolean z) throws GeneralSecurityException {
        synchronized (zzgby.class) {
            try {
                if (zzgauVar == null) {
                    throw new IllegalArgumentException("key manager must be non-null.");
                }
                AtomicReference atomicReference = zzb;
                zzgbb zzgbbVar = new zzgbb((zzgbb) atomicReference.get());
                zzgbbVar.zzd(zzgauVar);
                if (!zzgds.zza(1)) {
                    throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
                }
                String zzf2 = zzgauVar.zzf();
                zzp(zzf2, Collections.emptyMap(), z);
                zzd.put(zzf2, Boolean.valueOf(z));
                atomicReference.set(zzgbbVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
