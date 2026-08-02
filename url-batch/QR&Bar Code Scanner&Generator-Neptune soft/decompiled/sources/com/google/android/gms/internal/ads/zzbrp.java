package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbrp implements zzajw {
    private volatile zzbrc zza;
    private final Context zzb;

    public zzbrp(Context context) {
        this.zzb = context;
    }

    static /* bridge */ /* synthetic */ void zzc(zzbrp zzbrpVar) {
        if (zzbrpVar.zza == null) {
            return;
        }
        zzbrpVar.zza.disconnect();
        Binder.flushPendingCommands();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzajw
    public final zzajz zza(zzakd zzakdVar) throws zzakm {
        Parcelable.Creator<zzbrd> creator = zzbrd.CREATOR;
        Map zzl = zzakdVar.zzl();
        int size = zzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : zzl.entrySet()) {
            strArr[i2] = (String) entry.getKey();
            strArr2[i2] = (String) entry.getValue();
            i2++;
        }
        zzbrd zzbrdVar = new zzbrd(zzakdVar.zzk(), strArr, strArr2);
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        try {
            zzchh zzchhVar = new zzchh();
            this.zza = new zzbrc(this.zzb, com.google.android.gms.ads.internal.zzt.zzt().zzb(), new zzbrn(this, zzchhVar), new zzbro(this, zzchhVar));
            this.zza.checkAvailabilityAndConnect();
            zzfzp zzo = zzfzg.zzo(zzfzg.zzn(zzchhVar, new zzbrl(this, zzbrdVar), zzchc.zza), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdE)).intValue(), TimeUnit.MILLISECONDS, zzchc.zzd);
            zzo.zzc(new zzbrm(this), zzchc.zza);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzo.get();
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime) + "ms");
            zzbrf zzbrfVar = (zzbrf) new zzcba(parcelFileDescriptor).zza(zzbrf.CREATOR);
            if (zzbrfVar == null) {
                return null;
            }
            if (zzbrfVar.zza) {
                throw new zzakm(zzbrfVar.zzb);
            }
            if (zzbrfVar.zze.length != zzbrfVar.zzf.length) {
                return null;
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String[] strArr3 = zzbrfVar.zze;
                if (i >= strArr3.length) {
                    return new zzajz(zzbrfVar.zzc, zzbrfVar.zzd, hashMap, zzbrfVar.zzg, zzbrfVar.zzh);
                }
                hashMap.put(strArr3[i], zzbrfVar.zzf[i]);
                i++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime) + "ms");
            return null;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime) + "ms");
            throw th;
        }
    }
}
