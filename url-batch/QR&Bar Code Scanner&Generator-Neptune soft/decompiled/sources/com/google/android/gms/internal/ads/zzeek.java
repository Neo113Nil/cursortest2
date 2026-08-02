package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeek extends zzcat {
    private final Context zza;
    private final Executor zzb;
    private final zzfzq zzc;
    private final zzcbn zzd;
    private final zzctt zze;
    private final ArrayDeque zzf;
    private final zzfjw zzg;
    private final zzcbo zzh;
    private final zzeep zzi;

    public zzeek(Context context, Executor executor, zzfzq zzfzqVar, zzcbo zzcboVar, zzctt zzcttVar, zzcbn zzcbnVar, ArrayDeque arrayDeque, zzeep zzeepVar, zzfjw zzfjwVar, byte[] bArr) {
        zzbjc.zzc(context);
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfzqVar;
        this.zzh = zzcboVar;
        this.zzd = zzcbnVar;
        this.zze = zzcttVar;
        this.zzf = arrayDeque;
        this.zzi = zzeepVar;
        this.zzg = zzfjwVar;
    }

    private final synchronized zzeeh zzl(String str) {
        Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            zzeeh zzeehVar = (zzeeh) it.next();
            if (zzeehVar.zzd.equals(str)) {
                it.remove();
                return zzeehVar;
            }
        }
        return null;
    }

    private final synchronized zzeeh zzm(String str) {
        Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            zzeeh zzeehVar = (zzeeh) it.next();
            if (zzeehVar.zzc.equals(str)) {
                it.remove();
                return zzeehVar;
            }
        }
        return null;
    }

    private static zzfzp zzn(zzfzp zzfzpVar, zzfih zzfihVar, zzbuk zzbukVar, zzfju zzfjuVar, zzfjj zzfjjVar) {
        zzbua zza = zzbukVar.zza("AFMA_getAdDictionary", zzbuh.zza, new zzbuc() { // from class: com.google.android.gms.internal.ads.zzeeb
            @Override // com.google.android.gms.internal.ads.zzbuc
            public final Object zza(JSONObject jSONObject) {
                return new zzcbf(jSONObject);
            }
        });
        zzfjt.zzd(zzfzpVar, zzfjjVar);
        zzfhm zza2 = zzfihVar.zzb(zzfib.BUILD_URL, zzfzpVar).zzf(zza).zza();
        zzfjt.zzc(zza2, zzfjuVar, zzfjjVar);
        return zza2;
    }

    private static zzfzp zzo(zzcbc zzcbcVar, zzfih zzfihVar, final zzevw zzevwVar) {
        zzfyn zzfynVar = new zzfyn() { // from class: com.google.android.gms.internal.ads.zzedv
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzevw.this.zzb().zza(com.google.android.gms.ads.internal.client.zzaw.zzb().zzh((Bundle) obj));
            }
        };
        return zzfihVar.zzb(zzfib.GMS_SIGNALS, zzfzg.zzi(zzcbcVar.zza)).zzf(zzfynVar).zze(new zzfhk() { // from class: com.google.android.gms.internal.ads.zzedw
            @Override // com.google.android.gms.internal.ads.zzfhk
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zza();
    }

    private final synchronized void zzp(zzeeh zzeehVar) {
        zzq();
        this.zzf.addLast(zzeehVar);
    }

    private final synchronized void zzq() {
        int intValue = ((Long) zzbky.zzc.zze()).intValue();
        while (this.zzf.size() >= intValue) {
            this.zzf.removeFirst();
        }
    }

    private final void zzr(zzfzp zzfzpVar, zzcay zzcayVar) {
        zzfzg.zzr(zzfzg.zzn(zzfzpVar, new zzfyn() { // from class: com.google.android.gms.internal.ads.zzeee
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                final InputStream inputStream = (InputStream) obj;
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                final ParcelFileDescriptor parcelFileDescriptor2 = createPipe[1];
                zzchc.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffd
                    @Override // java.lang.Runnable
                    public final void run() {
                        InputStream inputStream2 = inputStream;
                        try {
                            try {
                                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor2);
                                try {
                                    IOUtils.copyStream(inputStream2, autoCloseOutputStream);
                                    autoCloseOutputStream.close();
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } catch (IOException unused) {
                        }
                    }
                });
                return zzfzg.zzi(parcelFileDescriptor);
            }
        }, zzchc.zza), new zzeeg(this, zzcayVar), zzchc.zzf);
    }

    public final zzfzp zzb(final zzcbc zzcbcVar, int i) {
        if (!((Boolean) zzbky.zza.zze()).booleanValue()) {
            return zzfzg.zzh(new Exception("Split request is disabled."));
        }
        zzffx zzffxVar = zzcbcVar.zzi;
        if (zzffxVar == null) {
            return zzfzg.zzh(new Exception("Pool configuration missing from request."));
        }
        if (zzffxVar.zzc == 0 || zzffxVar.zzd == 0) {
            return zzfzg.zzh(new Exception("Caching is disabled."));
        }
        zzbuk zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzcgv.zza(), this.zzg);
        zzevw zzp = this.zze.zzp(zzcbcVar, i);
        zzfih zzc = zzp.zzc();
        final zzfzp zzo = zzo(zzcbcVar, zzc, zzp);
        zzfju zzd = zzp.zzd();
        final zzfjj zza = zzfji.zza(this.zza, 9);
        final zzfzp zzn = zzn(zzo, zzc, zzb, zzd, zza);
        return zzc.zza(zzfib.GET_URL_AND_CACHE_KEY, zzo, zzn).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeea
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeek.this.zzj(zzn, zzo, zzcbcVar, zza);
            }
        }).zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzfzp zzc(zzcbc zzcbcVar, int i) {
        zzeeh zzl;
        zzfhm zza;
        zzbuk zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzcgv.zza(), this.zzg);
        zzevw zzp = this.zze.zzp(zzcbcVar, i);
        zzbua zza2 = zzb.zza("google.afma.response.normalize", zzeej.zza, zzbuh.zzb);
        zzeeh zzeehVar = null;
        if (((Boolean) zzbky.zza.zze()).booleanValue()) {
            if (((Boolean) zzbky.zzd.zze()).booleanValue()) {
                zzl = zzm(zzcbcVar.zzh);
            } else {
                if (!TextUtils.isEmpty(zzcbcVar.zzj)) {
                    zzl = zzl(zzcbcVar.zzj);
                }
                if (zzeehVar == null) {
                    com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
                }
            }
            zzeehVar = zzl;
            if (zzeehVar == null) {
            }
        } else {
            String str = zzcbcVar.zzj;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        zzeeh zzeehVar2 = zzeehVar;
        zzfjj zza3 = zzeehVar2 == null ? zzfji.zza(this.zza, 9) : zzeehVar2.zze;
        zzfju zzd = zzp.zzd();
        zzd.zzd(zzcbcVar.zza.getStringArrayList("ad_types"));
        zzeer zzeerVar = new zzeer(zzcbcVar.zzg, zzd, zza3);
        zzeeo zzeeoVar = new zzeeo(this.zza, zzcbcVar.zzb.zza, this.zzh, i, null);
        zzfih zzc = zzp.zzc();
        zzfjj zza4 = zzfji.zza(this.zza, 11);
        if (zzeehVar2 == null) {
            final zzfzp zzo = zzo(zzcbcVar, zzc, zzp);
            final zzfzp zzn = zzn(zzo, zzc, zzb, zzd, zza3);
            zzfjj zza5 = zzfji.zza(this.zza, 10);
            final zzfhm zza6 = zzc.zza(zzfib.HTTP, zzn, zzo).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzedy
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzeeq((JSONObject) zzfzp.this.get(), (zzcbf) zzn.get());
                }
            }).zze(zzeerVar).zze(new zzfjp(zza5)).zze(zzeeoVar).zza();
            zzfjt.zza(zza6, zzd, zza5);
            zzfjt.zzd(zza6, zza4);
            zza = zzc.zza(zzfib.PRE_PROCESS, zzo, zzn, zza6).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzedz
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzeej((zzeen) zzfzp.this.get(), (JSONObject) zzo.get(), (zzcbf) zzn.get());
                }
            }).zzf(zza2).zza();
        } else {
            zzeeq zzeeqVar = new zzeeq(zzeehVar2.zzb, zzeehVar2.zza);
            zzfjj zza7 = zzfji.zza(this.zza, 10);
            final zzfhm zza8 = zzc.zzb(zzfib.HTTP, zzfzg.zzi(zzeeqVar)).zze(zzeerVar).zze(new zzfjp(zza7)).zze(zzeeoVar).zza();
            zzfjt.zza(zza8, zzd, zza7);
            final zzfzp zzi = zzfzg.zzi(zzeehVar2);
            zzfjt.zzd(zza8, zza4);
            zza = zzc.zza(zzfib.PRE_PROCESS, zza8, zzi).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeed
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzfzp zzfzpVar = zzfzp.this;
                    zzfzp zzfzpVar2 = zzi;
                    return new zzeej((zzeen) zzfzpVar.get(), ((zzeeh) zzfzpVar2.get()).zzb, ((zzeeh) zzfzpVar2.get()).zza);
                }
            }).zzf(zza2).zza();
        }
        zzfjt.zza(zza, zzd, zza4);
        return zza;
    }

    public final zzfzp zzd(zzcbc zzcbcVar, int i) {
        zzbuk zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzcgv.zza(), this.zzg);
        if (!((Boolean) zzbld.zza.zze()).booleanValue()) {
            return zzfzg.zzh(new Exception("Signal collection disabled."));
        }
        zzevw zzp = this.zze.zzp(zzcbcVar, i);
        final zzevh zza = zzp.zza();
        zzbua zza2 = zzb.zza("google.afma.request.getSignals", zzbuh.zza, zzbuh.zzb);
        zzfjj zza3 = zzfji.zza(this.zza, 22);
        zzfhm zza4 = zzp.zzc().zzb(zzfib.GET_SIGNALS, zzfzg.zzi(zzcbcVar.zza)).zze(new zzfjp(zza3)).zzf(new zzfyn() { // from class: com.google.android.gms.internal.ads.zzeec
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzevh.this.zza(com.google.android.gms.ads.internal.client.zzaw.zzb().zzh((Bundle) obj));
            }
        }).zzb(zzfib.JS_SIGNALS).zzf(zza2).zza();
        zzfju zzd = zzp.zzd();
        zzd.zzd(zzcbcVar.zza.getStringArrayList("ad_types"));
        zzfjt.zzb(zza4, zzd, zza3);
        return zza4;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zze(zzcbc zzcbcVar, zzcay zzcayVar) {
        zzr(zzb(zzcbcVar, Binder.getCallingUid()), zzcayVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzf(zzcbc zzcbcVar, zzcay zzcayVar) {
        zzr(zzd(zzcbcVar, Binder.getCallingUid()), zzcayVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzg(zzcbc zzcbcVar, zzcay zzcayVar) {
        zzfzp zzc = zzc(zzcbcVar, Binder.getCallingUid());
        zzr(zzc, zzcayVar);
        if (((Boolean) zzbkq.zzj.zze()).booleanValue()) {
            zzc.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedx
                @Override // java.lang.Runnable
                public final void run() {
                    zzchf.zza(zzeek.this.zzd.zza(), "persistFlags");
                }
            }, this.zzc);
        } else {
            zzc.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedx
                @Override // java.lang.Runnable
                public final void run() {
                    zzchf.zza(zzeek.this.zzd.zza(), "persistFlags");
                }
            }, this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzh(String str, zzcay zzcayVar) {
        zzr(zzi(str), zzcayVar);
    }

    public final zzfzp zzi(String str) {
        if (!((Boolean) zzbky.zza.zze()).booleanValue()) {
            return zzfzg.zzh(new Exception("Split request is disabled."));
        }
        return (((Boolean) zzbky.zzd.zze()).booleanValue() ? zzm(str) : zzl(str)) == null ? zzfzg.zzh(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zzfzg.zzi(new zzeef(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ InputStream zzj(zzfzp zzfzpVar, zzfzp zzfzpVar2, zzcbc zzcbcVar, zzfjj zzfjjVar) throws Exception {
        String zzc = ((zzcbf) zzfzpVar.get()).zzc();
        zzp(new zzeeh((zzcbf) zzfzpVar.get(), (JSONObject) zzfzpVar2.get(), zzcbcVar.zzh, zzc, zzfjjVar));
        return new ByteArrayInputStream(zzc.getBytes(zzfsk.zzc));
    }
}
