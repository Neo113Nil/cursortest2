package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdct extends com.google.android.gms.ads.internal.client.zzdg {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;
    private final zzehh zzh;
    private final Bundle zzi;

    public zzdct(zzfdk zzfdkVar, String str, zzehh zzehhVar, zzfdn zzfdnVar, String str2) {
        String str3 = null;
        this.zzb = zzfdkVar == null ? null : zzfdkVar.zzac;
        this.zzc = str2;
        this.zzd = zzfdnVar == null ? null : zzfdnVar.zzb;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                str3 = zzfdkVar.zzw.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = str3 != null ? str3 : str;
        this.zze = zzehhVar.zzc();
        this.zzh = zzehhVar;
        this.zzf = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() / 1000;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfT)).booleanValue() || zzfdnVar == null) {
            this.zzi = new Bundle();
        } else {
            this.zzi = zzfdnVar.zzj;
        }
        this.zzg = (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhV)).booleanValue() || zzfdnVar == null || TextUtils.isEmpty(zzfdnVar.zzh)) ? "" : zzfdnVar.zzh;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final Bundle zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final com.google.android.gms.ads.internal.client.zzu zzf() {
        zzehh zzehhVar = this.zzh;
        if (zzehhVar != null) {
            return zzehhVar.zza();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final String zzg() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final String zzh() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final String zzi() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final List zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzd;
    }
}
