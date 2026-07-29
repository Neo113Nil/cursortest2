package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfxi {
    private static final Logger zza = Logger.getLogger(zzfxi.class.getName());
    private static final ConcurrentMap zzb = new ConcurrentHashMap();
    private static final ConcurrentMap zzc = new ConcurrentHashMap();
    private static final ConcurrentMap zzd = new ConcurrentHashMap();
    private static final ConcurrentMap zze = new ConcurrentHashMap();
    private static final ConcurrentMap zzf = new ConcurrentHashMap();
    private static final ConcurrentMap zzg = new ConcurrentHashMap();

    private zzfxi() {
    }

    @Deprecated
    public static zzfwg zza(String str) throws GeneralSecurityException {
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        zzfwg zzfwgVar = (zzfwg) zze.get(str.toLowerCase(Locale.US));
        if (zzfwgVar != null) {
            return zzfwgVar;
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

    public static zzfwm zzb(String str) throws GeneralSecurityException {
        return zzp(str).zzb();
    }

    public static synchronized zzgfh zzc(zzgfm zzgfmVar) throws GeneralSecurityException {
        zzgfh zza2;
        synchronized (zzfxi.class) {
            zzfwm zzb2 = zzb(zzgfmVar.zzf());
            if (!((Boolean) zzd.get(zzgfmVar.zzf())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgfmVar.zzf())));
            }
            zza2 = zzb2.zza(zzgfmVar.zze());
        }
        return zza2;
    }

    public static synchronized zzgly zzd(zzgfm zzgfmVar) throws GeneralSecurityException {
        zzgly zzb2;
        synchronized (zzfxi.class) {
            zzfwm zzb3 = zzb(zzgfmVar.zzf());
            if (!((Boolean) zzd.get(zzgfmVar.zzf())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgfmVar.zzf())));
            }
            zzb2 = zzb3.zzb(zzgfmVar.zze());
        }
        return zzb2;
    }

    public static Class zze(Class cls) {
        zzfxb zzfxbVar = (zzfxb) zzf.get(cls);
        if (zzfxbVar == null) {
            return null;
        }
        return zzfxbVar.zza();
    }

    public static Object zzf(zzgfh zzgfhVar, Class cls) throws GeneralSecurityException {
        return zzq(zzgfhVar.zzf(), zzgfhVar.zze(), cls);
    }

    public static Object zzg(String str, zzgly zzglyVar, Class cls) throws GeneralSecurityException {
        return zzo(str, cls).zze(zzglyVar);
    }

    public static Object zzh(String str, byte[] bArr, Class cls) throws GeneralSecurityException {
        return zzq(str, zzgjg.zzv(bArr), cls);
    }

    public static Object zzi(zzfxa zzfxaVar, Class cls) throws GeneralSecurityException {
        zzfxb zzfxbVar = (zzfxb) zzf.get(cls);
        if (zzfxbVar == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(zzfxaVar.zzd().getName())));
        }
        if (zzfxbVar.zza().equals(zzfxaVar.zzd())) {
            return zzfxbVar.zzc(zzfxaVar);
        }
        throw new GeneralSecurityException("Wrong input primitive class, expected " + zzfxbVar.zza().toString() + ", got " + zzfxaVar.zzd().toString());
    }

    static synchronized Map zzj() {
        Map unmodifiableMap;
        synchronized (zzfxi.class) {
            unmodifiableMap = Collections.unmodifiableMap(zzg);
        }
        return unmodifiableMap;
    }

    public static synchronized void zzk(zzgas zzgasVar, zzgar zzgarVar, boolean z) throws GeneralSecurityException {
        Class zzd2;
        synchronized (zzfxi.class) {
            String zzc2 = zzgasVar.zzc();
            String zzc3 = zzgarVar.zzc();
            zzr(zzc2, zzgasVar.getClass(), zzgasVar.zza().zzc(), true);
            zzr(zzc3, zzgarVar.getClass(), Collections.emptyMap(), false);
            if (zzc2.equals(zzc3)) {
                throw new GeneralSecurityException("Private and public key type must be different.");
            }
            int zze2 = zzgarVar.zze();
            if (!zzfzc.zza(1)) {
                throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzgasVar.getClass()) + " as it is not FIPS compatible.");
            }
            if (!zzfzc.zza(zze2)) {
                throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzgarVar.getClass()) + " as it is not FIPS compatible.");
            }
            ConcurrentMap concurrentMap = zzb;
            if (concurrentMap.containsKey(zzc2) && (zzd2 = ((zzfxh) concurrentMap.get(zzc2)).zzd()) != null && !zzd2.getName().equals(zzgarVar.getClass().getName())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + zzc2 + " with inconsistent public key type " + zzc3);
                throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", zzgasVar.getClass().getName(), zzd2.getName(), zzgarVar.getClass().getName()));
            }
            if (!concurrentMap.containsKey(zzc2) || ((zzfxh) concurrentMap.get(zzc2)).zzd() == null) {
                concurrentMap.put(zzc2, new zzfxf(zzgasVar, zzgarVar));
                zzc.put(zzc2, new zzfxg(zzgasVar));
                zzs(zzgasVar.zzc(), zzgasVar.zza().zzc());
            }
            ConcurrentMap concurrentMap2 = zzd;
            concurrentMap2.put(zzc2, true);
            if (!concurrentMap.containsKey(zzc3)) {
                concurrentMap.put(zzc3, new zzfxe(zzgarVar));
            }
            concurrentMap2.put(zzc3, false);
        }
    }

    public static synchronized void zzm(zzgar zzgarVar, boolean z) throws GeneralSecurityException {
        synchronized (zzfxi.class) {
            String zzc2 = zzgarVar.zzc();
            zzr(zzc2, zzgarVar.getClass(), zzgarVar.zza().zzc(), true);
            if (!zzfzc.zza(zzgarVar.zze())) {
                throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzgarVar.getClass()) + " as it is not FIPS compatible.");
            }
            ConcurrentMap concurrentMap = zzb;
            if (!concurrentMap.containsKey(zzc2)) {
                concurrentMap.put(zzc2, new zzfxe(zzgarVar));
                zzc.put(zzc2, new zzfxg(zzgarVar));
                zzs(zzc2, zzgarVar.zza().zzc());
            }
            zzd.put(zzc2, true);
        }
    }

    public static synchronized void zzn(zzfxb zzfxbVar) throws GeneralSecurityException {
        synchronized (zzfxi.class) {
            if (zzfxbVar == null) {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
            Class zzb2 = zzfxbVar.zzb();
            ConcurrentMap concurrentMap = zzf;
            if (concurrentMap.containsKey(zzb2)) {
                zzfxb zzfxbVar2 = (zzfxb) concurrentMap.get(zzb2);
                if (!zzfxbVar.getClass().getName().equals(zzfxbVar2.getClass().getName())) {
                    zza.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(zzb2.toString()));
                    throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", zzb2.getName(), zzfxbVar2.getClass().getName(), zzfxbVar.getClass().getName()));
                }
            }
            concurrentMap.put(zzb2, zzfxbVar);
        }
    }

    private static zzfwm zzo(String str, Class cls) throws GeneralSecurityException {
        zzfxh zzp = zzp(str);
        if (zzp.zze().contains(cls)) {
            return zzp.zza(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzp.zzc());
        Set<Class> zze2 = zzp.zze();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : zze2) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", supported primitives: " + sb.toString());
    }

    private static synchronized zzfxh zzp(String str) throws GeneralSecurityException {
        zzfxh zzfxhVar;
        synchronized (zzfxi.class) {
            ConcurrentMap concurrentMap = zzb;
            if (!concurrentMap.containsKey(str)) {
                throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
            }
            zzfxhVar = (zzfxh) concurrentMap.get(str);
        }
        return zzfxhVar;
    }

    private static Object zzq(String str, zzgjg zzgjgVar, Class cls) throws GeneralSecurityException {
        return zzo(str, cls).zzd(zzgjgVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        r6 = com.google.android.gms.internal.ads.zzfxi.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (r6.containsKey(r5) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (((java.lang.Boolean) r6.get(r5)).booleanValue() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        throw new java.security.GeneralSecurityException("New keys are already disallowed for key type ".concat(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r1.containsKey(r5) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        r6 = r7.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        if (r6.hasNext() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        r7 = (java.util.Map.Entry) r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if (com.google.android.gms.internal.ads.zzfxi.zzg.containsKey(r7.getKey()) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bb, code lost:
    
        throw new java.security.GeneralSecurityException("Attempted to register a new key template " + ((java.lang.String) r7.getKey()) + " from an existing key manager of type " + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bc, code lost:
    
        r5 = r7.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c8, code lost:
    
        if (r5.hasNext() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ca, code lost:
    
        r6 = (java.util.Map.Entry) r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00da, code lost:
    
        if (com.google.android.gms.internal.ads.zzfxi.zzg.containsKey(r6.getKey()) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f2, code lost:
    
        throw new java.security.GeneralSecurityException("Attempted overwrite of a registered key template ".concat(java.lang.String.valueOf((java.lang.String) r6.getKey())));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static synchronized void zzr(String str, Class cls, Map map, boolean z) throws GeneralSecurityException {
        synchronized (zzfxi.class) {
            ConcurrentMap concurrentMap = zzb;
            zzfxh zzfxhVar = (zzfxh) concurrentMap.get(str);
            if (zzfxhVar != null && !zzfxhVar.zzc().equals(cls)) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, zzfxhVar.zzc().getName(), cls.getName()));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.gms.internal.ads.zzgly, java.lang.Object] */
    private static void zzs(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzg.put((String) entry.getKey(), zzfwp.zze(str, ((zzgao) entry.getValue()).zza.zzau(), ((zzgao) entry.getValue()).zzb));
        }
    }

    public static synchronized void zzl(zzfwm zzfwmVar, boolean z) throws GeneralSecurityException {
        synchronized (zzfxi.class) {
            if (zzfwmVar == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            String zzf2 = zzfwmVar.zzf();
            zzr(zzf2, zzfwmVar.getClass(), Collections.emptyMap(), z);
            zzb.putIfAbsent(zzf2, new zzfxd(zzfwmVar));
            zzd.put(zzf2, Boolean.valueOf(z));
        }
    }
}
