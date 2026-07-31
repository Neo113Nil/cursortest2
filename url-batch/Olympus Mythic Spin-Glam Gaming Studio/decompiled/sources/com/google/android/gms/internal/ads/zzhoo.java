package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhoo {
    private final Map zza;
    private final Map zzb;

    /* synthetic */ zzhoo(zzhol zzholVar, byte[] bArr) {
        this.zza = new HashMap(zzholVar.zzc());
        this.zzb = new HashMap(zzholVar.zzd());
    }

    private final Object zzf(zzhes zzhesVar, Class cls) throws GeneralSecurityException {
        zzhom zzhomVar = new zzhom(zzhesVar.getClass(), cls, null);
        Map map = this.zza;
        if (map.containsKey(zzhomVar)) {
            return ((zzhok) map.get(zzhomVar)).zza(zzhesVar);
        }
        String obj = zzhomVar.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 102);
        sb.append("No PrimitiveConstructor for ");
        sb.append(obj);
        sb.append(" available, see https://developers.google.com/tink/faq/registration_errors");
        throw new GeneralSecurityException(sb.toString());
    }

    public final Object zza(zzhes zzhesVar, Class cls) throws GeneralSecurityException {
        return zzf(zzhesVar, cls);
    }

    public final Object zzb(zzhfe zzhfeVar, Class cls) throws GeneralSecurityException {
        Map map = this.zzb;
        if (!map.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        final zzhoq zzhoqVar = (zzhoq) map.get(cls);
        return zzhoqVar.zzd(zzhfeVar, new zzhop() { // from class: com.google.android.gms.internal.ads.zzhon
            @Override // com.google.android.gms.internal.ads.zzhop
            public final /* synthetic */ Object zza(zzhfb zzhfbVar) {
                return zzhoo.this.zze(zzhoqVar, zzhfbVar);
            }
        });
    }

    final /* synthetic */ Map zzc() {
        return this.zza;
    }

    final /* synthetic */ Map zzd() {
        return this.zzb;
    }

    final /* synthetic */ Object zze(zzhoq zzhoqVar, zzhfb zzhfbVar) {
        return zzf(zzhfbVar.zza(), zzhoqVar.zzb());
    }
}
