package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzcvl extends com.google.android.gms.ads.internal.client.zzdz {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;
    private final zzeee zzh;
    private final Bundle zzi;
    private final double zzj;

    public zzcvl(zzfcj zzfcjVar, String str, zzeee zzeeeVar, zzfcm zzfcmVar, String str2) {
        String str3 = null;
        this.zzb = zzfcjVar == null ? null : zzfcjVar.zzab;
        this.zzc = str2;
        this.zzd = zzfcmVar == null ? null : zzfcmVar.zzb;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && zzfcjVar != null) {
            try {
                str3 = zzfcjVar.zzv.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = str3 != null ? str3 : str;
        this.zze = zzeeeVar.zzh();
        this.zzh = zzeeeVar;
        this.zzj = zzfcjVar == null ? 0.0d : zzfcjVar.zzaz;
        this.zzf = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() / 1000;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhi)).booleanValue() || zzfcmVar == null) {
            this.zzi = new Bundle();
        } else {
            this.zzi = zzfcmVar.zzk;
        }
        this.zzg = (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjZ)).booleanValue() || zzfcmVar == null || TextUtils.isEmpty(zzfcmVar.zzi)) ? "" : zzfcmVar.zzi;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final String zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final String zzf() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final List zzg() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final com.google.android.gms.ads.internal.client.zzv zzh() {
        zzeee zzeeeVar = this.zzh;
        if (zzeeeVar != null) {
            return zzeeeVar.zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final Bundle zzi() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final String zzj() {
        return this.zzc;
    }

    public final String zzk() {
        return this.zzd;
    }

    public final double zzl() {
        return this.zzj;
    }
}
