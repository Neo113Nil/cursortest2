package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzblm;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzeao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzj {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Context zzc;
    private final zzeao zzd;
    private final ExecutorService zze;

    zzj(Context context, zzeao zzeaoVar, ExecutorService executorService) {
        this.zzc = context;
        this.zzd = zzeaoVar;
        this.zze = executorService;
    }

    private final void zzh(final boolean z) {
        Map map = this.zzb;
        Boolean valueOf = Boolean.valueOf(z);
        if (map.containsKey(valueOf)) {
            return;
        }
        map.put(valueOf, new ArrayList());
        this.zze.submit(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzj.this.zzf(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final synchronized void zze(boolean z, boolean z2) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            bundle.putBoolean("accept_3p_cookie", z);
            Map map = this.zza;
            Boolean valueOf = Boolean.valueOf(z);
            zzl zzlVar = (zzl) map.get(valueOf);
            int i = 0;
            if (z2 && zzlVar != null) {
                i = zzlVar.zzd() + 1;
            }
            zzl zzlVar2 = (zzl) map.get(valueOf);
            final zzk zzkVar = new zzk(this, z, i, zzlVar2 == null ? null : Boolean.valueOf(zzlVar2.zze()), this.zzd);
            final AdRequest build = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmJ)).booleanValue()) {
                this.zze.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzh
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return zzj.this.zzg(build, zzkVar);
                    }
                });
            } else {
                QueryInfo.generate(this.zzc, AdFormat.BANNER, build, zzkVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void zzj(zzl zzlVar, Pair pair, boolean z) {
        zzlVar.zzf();
        QueryInfo zza = zzlVar.zza();
        if (zza != null) {
            ((QueryInfoGenerationCallback) pair.first).onSuccess(zza);
        } else {
            ((QueryInfoGenerationCallback) pair.first).onFailure(zzlVar.zzb());
        }
        zzv.zze(this.zzd, null, "sgpcr", new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("lat_ms", Long.toString(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z)), new Pair("sgpc_rs", Boolean.toString(zzlVar.zza() != null)));
    }

    public final synchronized void zza() {
        zzh(true);
        zzh(false);
    }

    public final synchronized void zzb(final Object obj, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        final Pair pair = new Pair(queryInfoGenerationCallback, Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
        zzcgj.zzf.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzj.this.zzd(obj, pair);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0015, B:9:0x001b, B:12:0x0027, B:14:0x002d, B:15:0x003e, B:18:0x004c, B:24:0x006b, B:25:0x006f, B:27:0x0075, B:31:0x0036, B:32:0x0024), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0015, B:9:0x001b, B:12:0x0027, B:14:0x002d, B:15:0x003e, B:18:0x004c, B:24:0x006b, B:25:0x006f, B:27:0x0075, B:31:0x0036, B:32:0x0024), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0036 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0015, B:9:0x001b, B:12:0x0027, B:14:0x002d, B:15:0x003e, B:18:0x004c, B:24:0x006b, B:25:0x006f, B:27:0x0075, B:31:0x0036, B:32:0x0024), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final synchronized void zzc(final boolean z, zzl zzlVar) {
        List list;
        try {
            Map map = this.zza;
            Boolean valueOf = Boolean.valueOf(z);
            zzl zzlVar2 = (zzl) map.get(valueOf);
            if (zzlVar2 != null) {
                if (!zzlVar2.zzc()) {
                    if (zzlVar2.zza() != null) {
                        if (zzlVar.zza() != null) {
                        }
                        long longValue = (zzlVar.zza() == null ? (Long) zzblm.zzf.zze() : (Long) zzblm.zzg.zze()).longValue();
                        final boolean z2 = zzlVar.zza() != null;
                        zzcgj.zzd.schedule(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzf
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzj.this.zze(z, z2);
                            }
                        }, longValue, TimeUnit.SECONDS);
                        Map map2 = this.zzb;
                        list = (List) map2.get(valueOf);
                        map2.put(valueOf, new ArrayList());
                        if (list == null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                zzj(zzlVar, (Pair) it.next(), false);
                            }
                        }
                    }
                }
            }
            map.put(valueOf, zzlVar);
            long longValue2 = (zzlVar.zza() == null ? (Long) zzblm.zzf.zze() : (Long) zzblm.zzg.zze()).longValue();
            if (zzlVar.zza() != null) {
            }
            zzcgj.zzd.schedule(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzj.this.zze(z, z2);
                }
            }, longValue2, TimeUnit.SECONDS);
            Map map22 = this.zzb;
            list = (List) map22.get(valueOf);
            map22.put(valueOf, new ArrayList());
            if (list == null) {
            }
        } finally {
        }
    }

    final /* synthetic */ void zzd(Object obj, Pair pair) {
        boolean z = false;
        if (obj instanceof WebView) {
            CookieManager zza = com.google.android.gms.ads.internal.zzt.zzf().zza(this.zzc);
            if (zza != null) {
                z = zza.acceptThirdPartyCookies((WebView) obj);
            }
        }
        Map map = this.zza;
        Boolean valueOf = Boolean.valueOf(z);
        zzl zzlVar = (zzl) map.get(valueOf);
        if (zzlVar != null && !zzlVar.zzc()) {
            zzj(zzlVar, pair, true);
            return;
        }
        Map map2 = this.zzb;
        List list = (List) map2.get(valueOf);
        if (list == null) {
            list = new ArrayList();
            map2.put(valueOf, list);
        }
        list.add(pair);
    }

    final /* synthetic */ void zzf(boolean z) {
        zze(z, false);
    }

    final /* synthetic */ Object zzg(AdRequest adRequest, zzk zzkVar) {
        QueryInfo.generate(this.zzc, AdFormat.BANNER, adRequest, zzkVar);
        return Boolean.TRUE;
    }
}
