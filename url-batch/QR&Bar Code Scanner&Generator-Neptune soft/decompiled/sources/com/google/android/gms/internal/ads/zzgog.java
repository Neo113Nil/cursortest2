package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgog {
    public static final zzgog zza;
    public static final zzgog zzb;
    public static final zzgog zzc;
    public static final zzgog zzd;
    public static final zzgog zze;
    public static final zzgog zzf;
    public static final zzgog zzg;
    private static final Logger zzh = Logger.getLogger(zzgog.class.getName());
    private static final List zzi;
    private static final boolean zzj;
    private final zzgoo zzk;

    static {
        if (zzgdt.zzb()) {
            zzi = zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL", "Conscrypt");
            zzj = false;
        } else if (zzgoy.zzb()) {
            zzi = zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL");
            zzj = true;
        } else {
            zzi = new ArrayList();
            zzj = true;
        }
        zza = new zzgog(new zzgoh());
        zzb = new zzgog(new zzgol());
        zzc = new zzgog(new zzgon());
        zzd = new zzgog(new zzgom());
        zze = new zzgog(new zzgoi());
        zzf = new zzgog(new zzgok());
        zzg = new zzgog(new zzgoj());
    }

    public zzgog(zzgoo zzgooVar) {
        this.zzk = zzgooVar;
    }

    public static List zzb(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                zzh.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = zzi.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.zzk.zza(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        if (zzj) {
            return this.zzk.zza(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
