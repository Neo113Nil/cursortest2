package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzfco implements zzfdi {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfcp zzc = new zzfcp(new JSONArray().toString(), new Bundle(), "");
    final String zza;
    private final zzhdi zzd;
    private final ScheduledExecutorService zze;
    private final zzesu zzf;
    private final Context zzg;
    private final zzflw zzh;
    private final zzesp zzi;
    private final zzdya zzj;
    private final zzecw zzk;

    zzfco(zzhdi zzhdiVar, ScheduledExecutorService scheduledExecutorService, String str, zzesu zzesuVar, Context context, zzflw zzflwVar, zzesp zzespVar, zzdya zzdyaVar, zzecw zzecwVar) {
        this.zzd = zzhdiVar;
        this.zze = scheduledExecutorService;
        this.zza = str;
        this.zzf = zzesuVar;
        this.zzg = context;
        this.zzh = zzflwVar;
        this.zzi = zzespVar;
        this.zzj = zzdyaVar;
        this.zzk = zzecwVar;
    }

    private final void zzf(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzesy zzesyVar = (zzesy) ((Map.Entry) it.next()).getValue();
            String str = zzesyVar.zza;
            list.add(zzh(str, Collections.singletonList(zzesyVar.zze), zzg(str), zzesyVar.zzb, zzesyVar.zzc));
        }
    }

    @Nullable
    private final Bundle zzg(String str) {
        Bundle bundle = this.zzh.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzhcq zzh(final String str, final List list, final Bundle bundle, final boolean z, final boolean z2) {
        zzhcf zzhcfVar = new zzhcf() { // from class: com.google.android.gms.internal.ads.zzfcj
            @Override // com.google.android.gms.internal.ads.zzhcf
            public final /* synthetic */ ListenableFuture zza() {
                return zzfco.this.zzd(str, list, bundle, z, z2);
            }
        };
        zzhdi zzhdiVar = this.zzd;
        zzhcq zzw = zzhcq.zzw(zzhcy.zzf(zzhcfVar, zzhdiVar));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcp)).booleanValue()) {
            zzw = (zzhcq) zzhcy.zzi(zzw, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzci)).longValue(), TimeUnit.MILLISECONDS, this.zze);
        }
        return (zzhcq) zzhcy.zzg(zzw, Throwable.class, new zzgub() { // from class: com.google.android.gms.internal.ads.zzfck
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                int i = zzfco.zzb;
                String str2 = str;
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Error calling adapter: ".concat(String.valueOf(str2)));
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoR)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzi(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                    return null;
                }
                com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                return null;
            }
        }, zzhdiVar);
    }

    private final void zzi(zzbxt zzbxtVar, Bundle bundle, @NonNull List list, zzesx zzesxVar) throws RemoteException {
        zzbxtVar.zze(ObjectWrapper.wrap(this.zzg), this.zza, bundle, (Bundle) list.get(0), this.zzh.zzf, zzesxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        zzflw zzflwVar = this.zzh;
        if (zzflwVar.zzs) {
            if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcv)).split(StringUtils.COMMA)).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(zzflwVar.zzd)))) {
                return zzhcy.zza(zzc);
            }
        }
        return zzhcy.zzf(new zzhcf() { // from class: com.google.android.gms.internal.ads.zzfcm
            @Override // com.google.android.gms.internal.ads.zzhcf
            public final /* synthetic */ ListenableFuture zza() {
                return zzfco.this.zzc();
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 32;
    }

    final /* synthetic */ ListenableFuture zzc() {
        final String str;
        String lowerCase = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmA)).booleanValue() ? this.zzh.zzg.toLowerCase(Locale.ROOT) : this.zzh.zzg;
        final Bundle zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzct)).booleanValue() ? this.zzk.zzg() : new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfl)).booleanValue()) {
            int zzk = com.google.android.gms.ads.internal.zzt.zzh().zzp().zzi().zzk();
            str = zzk != 1 ? zzk != 2 ? "EMPTY" : "INVALID" : "VALID";
        } else {
            str = "";
        }
        final ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = this.zzh.zzw;
        if (jSONArray != null) {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
                    String string = (optJSONArray == null || optJSONArray.length() <= 0) ? "" : optJSONArray.getString(0);
                    if (!TextUtils.isEmpty(string)) {
                        JSONObject optJSONObject = jSONObject.optJSONObject("data");
                        Bundle bundle = new Bundle();
                        if (optJSONObject != null) {
                            Iterator<String> keys = optJSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                bundle.putString(next, optJSONObject.optString(next, ""));
                            }
                        }
                        hashMap.put(string, new zzesy(string, true, true, false, bundle));
                    }
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(new JSONException("Malformed RTB adapter config."), "RecursiveRtbAdapterMap.parseAdapters");
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed RTB adapter config.", e);
                }
            }
            zzf(arrayList, hashMap);
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcC)).booleanValue()) {
            zzf(arrayList, this.zzf.zzd(this.zza, lowerCase));
        } else {
            zzesu zzesuVar = this.zzf;
            for (Map.Entry entry : zzesuVar.zzc(this.zza, lowerCase).entrySet()) {
                String str2 = (String) entry.getKey();
                arrayList.add(zzh(str2, (List) entry.getValue(), zzg(str2), true, true));
            }
            zzf(arrayList, zzesuVar.zzb());
        }
        return zzhcy.zzp(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfci
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i2 = zzfco.zzb;
                JSONArray jSONArray2 = new JSONArray();
                for (ListenableFuture listenableFuture : arrayList) {
                    if (((JSONObject) listenableFuture.get()) != null) {
                        jSONArray2.put(listenableFuture.get());
                    }
                }
                String str3 = str;
                Bundle bundle2 = zzg;
                if (jSONArray2.length() != 0) {
                    return new zzfcp(jSONArray2.toString(), bundle2, str3);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfl)).booleanValue()) {
                    return new zzfcp(new JSONArray().toString(), bundle2, str3);
                }
                return null;
            }
        }, this.zzd);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(3:5|(2:7|(1:9)(1:12))(3:13|(1:15)|(2:17|(1:19)(1:20))(1:21))|10))|22|23|(0)(0)|10) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002b, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002c, code lost:
    
        com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", r13);
        r13 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ ListenableFuture zzd(String str, final List list, final Bundle bundle, boolean z, boolean z2) {
        zzbxt zzbxtVar;
        final zzcgo zzcgoVar = new zzcgo();
        if (z2) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcu)).booleanValue()) {
                zzesp zzespVar = this.zzi;
                zzespVar.zza(str);
                zzbxtVar = zzespVar.zzb(str);
                if (zzbxtVar != null) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzck)).booleanValue()) {
                        throw null;
                    }
                    zzesx.zzc(str, zzcgoVar);
                } else {
                    final zzesx zzesxVar = new zzesx(str, zzbxtVar, zzcgoVar, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcp)).booleanValue()) {
                        this.zze.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcn
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzesx.this.zzb();
                            }
                        }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzci)).longValue(), TimeUnit.MILLISECONDS);
                    }
                    if (z) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcw)).booleanValue()) {
                            final zzbxt zzbxtVar2 = zzbxtVar;
                            this.zzd.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcl
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    zzfco.this.zze(zzbxtVar2, bundle, list, zzesxVar, zzcgoVar);
                                }
                            });
                        } else {
                            zzi(zzbxtVar, bundle, list, zzesxVar);
                        }
                    } else {
                        zzesxVar.zza();
                    }
                }
                return zzcgoVar;
            }
        }
        zzbxtVar = this.zzj.zzb(str);
        if (zzbxtVar != null) {
        }
        return zzcgoVar;
    }

    final /* synthetic */ void zze(zzbxt zzbxtVar, Bundle bundle, List list, zzesx zzesxVar, zzcgo zzcgoVar) {
        try {
            zzi(zzbxtVar, bundle, list, zzesxVar);
        } catch (RemoteException e) {
            zzcgoVar.zzd(e);
        }
    }
}
