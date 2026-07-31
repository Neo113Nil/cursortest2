package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhpa {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    /* synthetic */ zzhpa(zzhox zzhoxVar, byte[] bArr) {
        this.zza = new HashMap(zzhoxVar.zze());
        this.zzb = new HashMap(zzhoxVar.zzf());
        this.zzc = new HashMap(zzhoxVar.zzg());
        this.zzd = new HashMap(zzhoxVar.zzh());
    }

    public final boolean zza(zzhow zzhowVar) {
        return this.zzb.containsKey(new zzhoy(zzhowVar.getClass(), zzhowVar.zzf(), null));
    }

    public final zzhes zzb(zzhow zzhowVar, zzhfr zzhfrVar) throws GeneralSecurityException {
        zzhoy zzhoyVar = new zzhoy(zzhowVar.getClass(), zzhowVar.zzf(), null);
        Map map = this.zzb;
        if (map.containsKey(zzhoyVar)) {
            return ((zzhmx) map.get(zzhoyVar)).zza(zzhowVar, zzhfrVar);
        }
        String obj = zzhoyVar.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 47);
        sb.append("No Key Parser for requested key type ");
        sb.append(obj);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    public final zzhow zzc(zzhes zzhesVar, Class cls, zzhfr zzhfrVar) throws GeneralSecurityException {
        zzhoz zzhozVar = new zzhoz(zzhesVar.getClass(), cls, null);
        Map map = this.zza;
        if (map.containsKey(zzhozVar)) {
            return ((zzhna) map.get(zzhozVar)).zza(zzhesVar, zzhfrVar);
        }
        String obj = zzhozVar.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 32);
        sb.append("No Key serializer for ");
        sb.append(obj);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    public final boolean zzd(zzhow zzhowVar) {
        return this.zzd.containsKey(new zzhoy(zzhowVar.getClass(), zzhowVar.zzf(), null));
    }

    public final zzhfj zze(zzhow zzhowVar) throws GeneralSecurityException {
        zzhoy zzhoyVar = new zzhoy(zzhowVar.getClass(), zzhowVar.zzf(), null);
        Map map = this.zzd;
        if (map.containsKey(zzhoyVar)) {
            return ((zzhoa) map.get(zzhoyVar)).zza(zzhowVar);
        }
        String obj = zzhoyVar.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 54);
        sb.append("No Parameters Parser for requested key type ");
        sb.append(obj);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    public final zzhow zzf(zzhfj zzhfjVar, Class cls) throws GeneralSecurityException {
        zzhoz zzhozVar = new zzhoz(zzhfjVar.getClass(), cls, null);
        Map map = this.zzc;
        if (map.containsKey(zzhozVar)) {
            return ((zzhod) map.get(zzhozVar)).zza(zzhfjVar);
        }
        String obj = zzhozVar.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 39);
        sb.append("No Key Format serializer for ");
        sb.append(obj);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    final /* synthetic */ Map zzg() {
        return this.zza;
    }

    final /* synthetic */ Map zzh() {
        return this.zzb;
    }

    final /* synthetic */ Map zzi() {
        return this.zzc;
    }

    final /* synthetic */ Map zzj() {
        return this.zzd;
    }
}
