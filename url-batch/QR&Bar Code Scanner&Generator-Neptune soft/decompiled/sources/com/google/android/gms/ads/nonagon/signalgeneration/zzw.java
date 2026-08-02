package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzcfd;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzdxl;
import com.google.android.gms.internal.ads.zzdxv;
import com.google.android.gms.internal.ads.zzfjj;
import com.google.android.gms.internal.ads.zzfju;
import com.google.android.gms.internal.ads.zzfzc;
import com.google.android.gms.internal.ads.zzfzp;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes.dex */
final class zzw implements zzfzc {
    final /* synthetic */ zzfzp zza;
    final /* synthetic */ zzcfk zzb;
    final /* synthetic */ zzcfd zzc;
    final /* synthetic */ zzfjj zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzaa zzf;

    zzw(zzaa zzaaVar, zzfzp zzfzpVar, zzcfk zzcfkVar, zzcfd zzcfdVar, zzfjj zzfjjVar, long j) {
        this.zzf = zzaaVar;
        this.zza = zzfzpVar;
        this.zzb = zzcfkVar;
        this.zzc = zzcfdVar;
        this.zzd = zzfjjVar;
        this.zze = j;
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final void zza(Throwable th) {
        zzdxv zzdxvVar;
        zzdxl zzdxlVar;
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        long j = this.zze;
        String message = th.getMessage();
        com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "SignalGeneratorImpl.generateSignals");
        zzaa zzaaVar = this.zzf;
        zzdxvVar = zzaaVar.zzr;
        zzdxlVar = zzaaVar.zzj;
        zzf.zzc(zzdxvVar, zzdxlVar, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(currentTimeMillis - j)));
        zzfju zzr = zzaa.zzr(this.zza, this.zzb);
        if (((Boolean) zzbkl.zze.zze()).booleanValue() && zzr != null) {
            zzfjj zzfjjVar = this.zzd;
            zzfjjVar.zze(false);
            zzr.zza(zzfjjVar);
            zzr.zzg();
        }
        try {
            this.zzc.zzb("Internal error. " + message);
        } catch (RemoteException e) {
            zzcgp.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdxv zzdxvVar;
        zzdxl zzdxlVar;
        zzdxl zzdxlVar2;
        boolean z;
        boolean z2;
        zzdxv zzdxvVar2;
        zzdxl zzdxlVar3;
        String str;
        String str2;
        String str3;
        String str4;
        Context context;
        zzcgv zzcgvVar;
        String str5;
        String str6;
        AtomicInteger atomicInteger;
        zzdxv zzdxvVar3;
        zzdxl zzdxlVar4;
        zzdxv zzdxvVar4;
        zzdxl zzdxlVar5;
        zzam zzamVar = (zzam) obj;
        zzfju zzr = zzaa.zzr(this.zza, this.zzb);
        if (!((Boolean) zzay.zzc().zzb(zzbjc.zzgF)).booleanValue()) {
            try {
                this.zzc.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzg("QueryInfo generation has been disabled.".concat(e.toString()));
            }
            if (!((Boolean) zzbkl.zze.zze()).booleanValue() || zzr == null) {
                return;
            }
            zzfjj zzfjjVar = this.zzd;
            zzfjjVar.zze(false);
            zzr.zza(zzfjjVar);
            zzr.zzg();
            return;
        }
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zze;
        try {
            try {
                if (zzamVar == null) {
                    this.zzc.zzc(null, null, null);
                    zzaa zzaaVar = this.zzf;
                    zzdxvVar4 = zzaaVar.zzr;
                    zzdxlVar5 = zzaaVar.zzj;
                    zzf.zzc(zzdxvVar4, zzdxlVar5, "sgs", new Pair("rid", "-1"));
                    this.zzd.zze(true);
                    if (!((Boolean) zzbkl.zze.zze()).booleanValue() || zzr == null) {
                        return;
                    }
                    zzr.zza(this.zzd);
                    zzr.zzg();
                    return;
                }
                try {
                    String optString = new JSONObject(zzamVar.zzb).optString("request_id", "");
                    if (TextUtils.isEmpty(optString)) {
                        com.google.android.gms.ads.internal.util.zze.zzj("The request ID is empty in request JSON.");
                        this.zzc.zzb("Internal error: request ID is empty in request JSON.");
                        zzaa zzaaVar2 = this.zzf;
                        zzdxvVar3 = zzaaVar2.zzr;
                        zzdxlVar4 = zzaaVar2.zzj;
                        zzf.zzc(zzdxvVar3, zzdxlVar4, "sgf", new Pair("sgf_reason", "rid_missing"));
                        this.zzd.zze(false);
                        if (!((Boolean) zzbkl.zze.zze()).booleanValue() || zzr == null) {
                            return;
                        }
                        zzr.zza(this.zzd);
                        zzr.zzg();
                        return;
                    }
                    zzaa zzaaVar3 = this.zzf;
                    String str7 = zzamVar.zzb;
                    zzdxlVar2 = zzaaVar3.zzj;
                    zzaa.zzG(zzaaVar3, optString, str7, zzdxlVar2);
                    Bundle bundle = zzamVar.zzc;
                    zzaa zzaaVar4 = this.zzf;
                    z = zzaaVar4.zzw;
                    if (z && bundle != null) {
                        str5 = zzaaVar4.zzy;
                        if (bundle.getInt(str5, -1) == -1) {
                            zzaa zzaaVar5 = this.zzf;
                            str6 = zzaaVar5.zzy;
                            atomicInteger = zzaaVar5.zzz;
                            bundle.putInt(str6, atomicInteger.get());
                        }
                    }
                    zzaa zzaaVar6 = this.zzf;
                    z2 = zzaaVar6.zzv;
                    if (z2 && bundle != null) {
                        str = zzaaVar6.zzx;
                        if (TextUtils.isEmpty(bundle.getString(str))) {
                            str2 = this.zzf.zzB;
                            if (TextUtils.isEmpty(str2)) {
                                zzaa zzaaVar7 = this.zzf;
                                com.google.android.gms.ads.internal.util.zzs zzp = com.google.android.gms.ads.internal.zzt.zzp();
                                zzaa zzaaVar8 = this.zzf;
                                context = zzaaVar8.zzg;
                                zzcgvVar = zzaaVar8.zzA;
                                zzaaVar7.zzB = zzp.zzc(context, zzcgvVar.zza);
                            }
                            zzaa zzaaVar9 = this.zzf;
                            str3 = zzaaVar9.zzx;
                            str4 = zzaaVar9.zzB;
                            bundle.putString(str3, str4);
                        }
                    }
                    this.zzc.zzc(zzamVar.zza, zzamVar.zzb, bundle);
                    zzaa zzaaVar10 = this.zzf;
                    zzdxvVar2 = zzaaVar10.zzr;
                    zzdxlVar3 = zzaaVar10.zzj;
                    zzf.zzc(zzdxvVar2, zzdxlVar3, "sgs", new Pair("tqgt", String.valueOf(currentTimeMillis)));
                    this.zzd.zze(true);
                    if (!((Boolean) zzbkl.zze.zze()).booleanValue() || zzr == null) {
                        return;
                    }
                    zzr.zza(this.zzd);
                    zzr.zzg();
                } catch (JSONException e2) {
                    com.google.android.gms.ads.internal.util.zze.zzj("Failed to create JSON object from the request string.");
                    this.zzc.zzb("Internal error for request JSON: " + e2.toString());
                    zzaa zzaaVar11 = this.zzf;
                    zzdxvVar = zzaaVar11.zzr;
                    zzdxlVar = zzaaVar11.zzj;
                    zzf.zzc(zzdxvVar, zzdxlVar, "sgf", new Pair("sgf_reason", "request_invalid"));
                    this.zzd.zze(false);
                    if (!((Boolean) zzbkl.zze.zze()).booleanValue() || zzr == null) {
                        return;
                    }
                    zzr.zza(this.zzd);
                    zzr.zzg();
                }
            } catch (RemoteException e3) {
                this.zzd.zze(false);
                zzcgp.zzh("", e3);
                if (!((Boolean) zzbkl.zze.zze()).booleanValue() || zzr == null) {
                    return;
                }
                zzr.zza(this.zzd);
                zzr.zzg();
            }
        } catch (Throwable th) {
            if (((Boolean) zzbkl.zze.zze()).booleanValue() && zzr != null) {
                zzr.zza(this.zzd);
                zzr.zzg();
            }
            throw th;
        }
    }
}
