package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzbsg implements zzatl {
    private volatile zzbrt zza;
    private final Context zzb;

    public zzbsg(Context context) {
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzatl
    @Nullable
    public final zzato zza(zzats zzatsVar) throws zzaub {
        Parcelable.Creator<zzbru> creator = zzbru.CREATOR;
        Map zzm = zzatsVar.zzm();
        int size = zzm.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Map.Entry entry : zzm.entrySet()) {
            strArr[i] = (String) entry.getKey();
            strArr2[i] = (String) entry.getValue();
            i++;
        }
        zzbru zzbruVar = new zzbru(zzatsVar.zzh(), strArr, strArr2);
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        try {
            zzcgo zzcgoVar = new zzcgo();
            this.zza = new zzbrt(this.zzb, com.google.android.gms.ads.internal.zzt.zzs().zza(), new zzbse(this, zzcgoVar), new zzbsf(this, zzcgoVar));
            this.zza.checkAvailabilityAndConnect();
            zzbsc zzbscVar = new zzbsc(this, zzbruVar);
            zzhdi zzhdiVar = zzcgj.zza;
            ListenableFuture zzi = zzhcy.zzi(zzhcy.zzj(zzcgoVar, zzbscVar, zzhdiVar), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfA)).intValue(), TimeUnit.MILLISECONDS, zzcgj.zzd);
            zzi.addListener(new zzbsd(this), zzhdiVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzi.get();
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
            StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime2).length() + 32);
            sb.append("Http assets remote cache took ");
            sb.append(elapsedRealtime2);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
            zzbrw zzbrwVar = (zzbrw) new zzcbt(parcelFileDescriptor).zza(zzbrw.CREATOR);
            if (zzbrwVar == null) {
                return null;
            }
            if (zzbrwVar.zza) {
                throw new zzaub(zzbrwVar.zzb);
            }
            String[] strArr3 = zzbrwVar.zze;
            String[] strArr4 = zzbrwVar.zzf;
            if (strArr3.length != strArr4.length) {
                return null;
            }
            HashMap hashMap = new HashMap();
            for (int i2 = 0; i2 < strArr3.length; i2++) {
                hashMap.put(strArr3[i2], strArr4[i2]);
            }
            return new zzato(zzbrwVar.zzc, zzbrwVar.zzd, hashMap, zzbrwVar.zzg, zzbrwVar.zzh);
        } catch (InterruptedException | ExecutionException unused) {
            long elapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
            StringBuilder sb2 = new StringBuilder(String.valueOf(elapsedRealtime3).length() + 32);
            sb2.append("Http assets remote cache took ");
            sb2.append(elapsedRealtime3);
            sb2.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
            return null;
        } catch (Throwable th) {
            long elapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
            StringBuilder sb3 = new StringBuilder(String.valueOf(elapsedRealtime4).length() + 32);
            sb3.append("Http assets remote cache took ");
            sb3.append(elapsedRealtime4);
            sb3.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
            throw th;
        }
    }

    final /* synthetic */ void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zza.disconnect();
        Binder.flushPendingCommands();
    }

    final /* synthetic */ zzbrt zzc() {
        return this.zza;
    }
}
