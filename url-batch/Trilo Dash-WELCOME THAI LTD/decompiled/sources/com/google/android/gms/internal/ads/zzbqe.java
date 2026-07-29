package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbqe implements zzaiu {
    private volatile zzbpr zza;
    private final Context zzb;

    public zzbqe(Context context) {
        this.zzb = context;
    }

    static /* bridge */ /* synthetic */ void zzc(zzbqe zzbqeVar) {
        if (zzbqeVar.zza == null) {
            return;
        }
        zzbqeVar.zza.disconnect();
        Binder.flushPendingCommands();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzaiu
    public final zzaix zza(zzajb zzajbVar) throws zzajk {
        Parcelable.Creator<zzbps> creator = zzbps.CREATOR;
        Map zzl = zzajbVar.zzl();
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
        zzbps zzbpsVar = new zzbps(zzajbVar.zzk(), strArr, strArr2);
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
        try {
            zzcga zzcgaVar = new zzcga();
            this.zza = new zzbpr(this.zzb, com.google.android.gms.ads.internal.zzt.zzt().zzb(), new zzbqc(this, zzcgaVar), new zzbqd(this, zzcgaVar));
            this.zza.checkAvailabilityAndConnect();
            zzfvj zzo = zzfva.zzo(zzfva.zzn(zzcgaVar, new zzbqa(this, zzbpsVar), zzcfv.zza), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdy)).intValue(), TimeUnit.MILLISECONDS, zzcfv.zzd);
            zzo.zzc(new zzbqb(this), zzcfv.zza);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzo.get();
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - elapsedRealtime) + "ms");
            zzbpu zzbpuVar = (zzbpu) new zzbzs(parcelFileDescriptor).zza(zzbpu.CREATOR);
            if (zzbpuVar == null) {
                return null;
            }
            if (zzbpuVar.zza) {
                throw new zzajk(zzbpuVar.zzb);
            }
            if (zzbpuVar.zze.length != zzbpuVar.zzf.length) {
                return null;
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String[] strArr3 = zzbpuVar.zze;
                if (i >= strArr3.length) {
                    return new zzaix(zzbpuVar.zzc, zzbpuVar.zzd, hashMap, zzbpuVar.zzg, zzbpuVar.zzh);
                }
                hashMap.put(strArr3[i], zzbpuVar.zzf[i]);
                i++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - elapsedRealtime) + "ms");
            return null;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - elapsedRealtime) + "ms");
            throw th;
        }
    }
}
