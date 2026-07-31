package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes6.dex */
final class zziha implements zziho {
    private final zzigw zza;
    private final zziia zzb;
    private final boolean zzc;
    private final zziex zzd;

    private zziha(zziia zziiaVar, zziex zziexVar, zzigw zzigwVar) {
        this.zzb = zziiaVar;
        this.zzc = zzigwVar instanceof zzifi;
        this.zzd = zziexVar;
        this.zza = zzigwVar;
    }

    static zziha zzh(zziia zziiaVar, zziex zziexVar, zzigw zzigwVar) {
        return new zziha(zziiaVar, zziexVar, zzigwVar);
    }

    @Override // com.google.android.gms.internal.ads.zziho
    public final Object zza() {
        zzigw zzigwVar = this.zza;
        return zzigwVar instanceof zzifm ? ((zzifm) zzigwVar).zzbg() : zzigwVar.zzcY().zzbt();
    }

    @Override // com.google.android.gms.internal.ads.zziho
    public final boolean zzb(Object obj, Object obj2) {
        if (!((zzifm) obj).zzt.equals(((zzifm) obj2).zzt)) {
            return false;
        }
        if (this.zzc) {
            return ((zzifi) obj).zza.equals(((zzifi) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zziho
    public final int zzc(Object obj) {
        int hashCode = ((zzifm) obj).zzt.hashCode();
        return this.zzc ? (hashCode * 53) + ((zzifi) obj).zza.zza.hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zziho
    public final void zzd(Object obj, Object obj2) {
        zzihp.zzH(this.zzb, obj, obj2);
        if (this.zzc) {
            zzihp.zzG(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziho
    public final int zze(Object obj) {
        int zzh = ((zzifm) obj).zzt.zzh();
        return this.zzc ? zzh + ((zzifi) obj).zza.zzg() : zzh;
    }

    @Override // com.google.android.gms.internal.ads.zziho
    public final void zzf(Object obj, zziip zziipVar) throws IOException {
        Iterator zzc = ((zzifi) obj).zza.zzc();
        while (zzc.hasNext()) {
            Map.Entry entry = (Map.Entry) zzc.next();
            zzifa zzifaVar = (zzifa) entry.getKey();
            if (zzifaVar.zzc() != zziio.MESSAGE || zzifaVar.zzd() || zzifaVar.zze()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof zziga) {
                zziipVar.zzv(zzifaVar.zza(), ((zziga) entry).zza().zzc());
            } else {
                zziipVar.zzv(zzifaVar.zza(), entry.getValue());
            }
        }
        ((zzifm) obj).zzt.zzf(zziipVar);
    }

    @Override // com.google.android.gms.internal.ads.zziho
    public final void zzg(Object obj, zzihj zzihjVar, zziew zziewVar) throws IOException {
        zziic.zzk(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zziho
    public final void zzj(Object obj, byte[] bArr, int i, int i2, zzidw zzidwVar) throws IOException {
        zzifm zzifmVar = (zzifm) obj;
        if (zzifmVar.zzt == zziib.zza()) {
            zzifmVar.zzt = zziib.zzb();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zziho
    public final void zzk(Object obj) {
        ((zzifm) obj).zzt.zzd();
        ((zzifi) obj).zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zziho
    public final boolean zzl(Object obj) {
        return ((zzifi) obj).zza.zze();
    }
}
