package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbty implements zzbsp, zzbtx {
    private final zzbtx zza;
    private final HashSet zzb = new HashSet();

    public zzbty(zzbtx zzbtxVar) {
        this.zza = zzbtxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsp, com.google.android.gms.internal.ads.zzbta
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbsp, com.google.android.gms.internal.ads.zzbta
    public final /* synthetic */ void zzb(String str, String str2) {
        zzbso.zzc(this, str, str2);
    }

    public final void zzc() {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            com.google.android.gms.ads.internal.util.zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzbpu) simpleEntry.getValue()).toString())));
            this.zza.zzr((String) simpleEntry.getKey(), (zzbpu) simpleEntry.getValue());
        }
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final /* synthetic */ void zzd(String str, Map map) {
        zzbso.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbsp, com.google.android.gms.internal.ads.zzbsn
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbso.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbta
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbso.zzd(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbtx
    public final void zzq(String str, zzbpu zzbpuVar) {
        this.zza.zzq(str, zzbpuVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbpuVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbtx
    public final void zzr(String str, zzbpu zzbpuVar) {
        this.zza.zzr(str, zzbpuVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbpuVar));
    }
}
