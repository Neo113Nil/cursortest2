package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeue implements zzeve {
    final String zza;
    private final zzfzq zzb;
    private final ScheduledExecutorService zzc;
    private final zzenc zzd;
    private final Context zze;
    private final zzfef zzf;
    private final zzemy zzg;
    private final zzdvl zzh;

    public zzeue(zzfzq zzfzqVar, ScheduledExecutorService scheduledExecutorService, String str, zzenc zzencVar, Context context, zzfef zzfefVar, zzemy zzemyVar, zzdvl zzdvlVar) {
        this.zzb = zzfzqVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = zzencVar;
        this.zze = context;
        this.zzf = zzfefVar;
        this.zzg = zzemyVar;
        this.zzh = zzdvlVar;
    }

    public static /* synthetic */ zzfzp zzc(zzeue zzeueVar) {
        Map zza = zzeueVar.zzd.zza(zzeueVar.zza, ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zziz)).booleanValue() ? zzeueVar.zzf.zzf.toLowerCase(Locale.ROOT) : zzeueVar.zzf.zzf);
        final ArrayList arrayList = new ArrayList();
        Iterator it = ((zzfvq) zza).entrySet().iterator();
        while (true) {
            Bundle bundle = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            Bundle bundle2 = zzeueVar.zzf.zzd.zzm;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str);
            }
            arrayList.add(zzeueVar.zze(str, list, bundle, true, true));
        }
        Iterator it2 = ((zzfvq) zzeueVar.zzd.zzb()).entrySet().iterator();
        while (it2.hasNext()) {
            zzeng zzengVar = (zzeng) ((Map.Entry) it2.next()).getValue();
            String str2 = zzengVar.zza;
            Bundle bundle3 = zzeueVar.zzf.zzd.zzm;
            arrayList.add(zzeueVar.zze(str2, Collections.singletonList(zzengVar.zzd), bundle3 != null ? bundle3.getBundle(str2) : null, zzengVar.zzb, zzengVar.zzc));
        }
        return zzfzg.zzc(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeub
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<zzfzp> list2 = arrayList;
                JSONArray jSONArray = new JSONArray();
                for (zzfzp zzfzpVar : list2) {
                    if (((JSONObject) zzfzpVar.get()) != null) {
                        jSONArray.put(zzfzpVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzeuf(jSONArray.toString());
            }
        }, zzeueVar.zzb);
    }

    private final zzfyx zze(final String str, final List list, final Bundle bundle, final boolean z, final boolean z2) {
        zzfyx zzv = zzfyx.zzv(zzfzg.zzl(new zzfym() { // from class: com.google.android.gms.internal.ads.zzeuc
            @Override // com.google.android.gms.internal.ads.zzfym
            public final zzfzp zza() {
                return zzeue.this.zzd(str, list, bundle, z, z2);
            }
        }, this.zzb));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbs)).booleanValue()) {
            zzv = (zzfyx) zzfzg.zzo(zzv, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbl)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return (zzfyx) zzfzg.zzf(zzv, Throwable.class, new zzfsm() { // from class: com.google.android.gms.internal.ads.zzeud
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj) {
                com.google.android.gms.ads.internal.util.zze.zzg("Error calling adapter: ".concat(String.valueOf(str)));
                return null;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        return zzfzg.zzl(new zzfym() { // from class: com.google.android.gms.internal.ads.zzetz
            @Override // com.google.android.gms.internal.ads.zzfym
            public final zzfzp zza() {
                return zzeue.zzc(zzeue.this);
            }
        }, this.zzb);
    }

    final /* synthetic */ zzfzp zzd(String str, List list, Bundle bundle, boolean z, boolean z2) throws Exception {
        zzbxd zzbxdVar;
        zzbxd zzb;
        zzchh zzchhVar = new zzchh();
        if (z2) {
            this.zzg.zzb(str);
            zzb = this.zzg.zza(str);
        } else {
            try {
                zzb = this.zzh.zzb(str);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzh("Couldn't create RTB adapter : ", e);
                zzbxdVar = null;
            }
        }
        zzbxdVar = zzb;
        if (zzbxdVar == null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbn)).booleanValue()) {
                throw null;
            }
            zzenf.zzb(str, zzchhVar);
        } else {
            final zzenf zzenfVar = new zzenf(str, zzbxdVar, zzchhVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbs)).booleanValue()) {
                this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeua
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzenf.this.zzc();
                    }
                }, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbl)).longValue(), TimeUnit.MILLISECONDS);
            }
            if (z) {
                zzbxdVar.zzh(ObjectWrapper.wrap(this.zze), this.zza, bundle, (Bundle) list.get(0), this.zzf.zze, zzenfVar);
            } else {
                zzenfVar.zzd();
            }
        }
        return zzchhVar;
    }
}
