package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzfyx extends zzfzq {
    private final Map zza;
    private final Context zzb;
    private final zzfvd zzc;
    private final long zzd;
    private final long zze;

    zzfyx(zzarw zzarwVar, zzfym zzfymVar, Map map, Context context, zzfvd zzfvdVar, zzfui zzfuiVar, zzgea zzgeaVar) {
        super("mLLgbGPnthnmbtiY4qwSRZlP76fxHEn5RINQ3z6Wy79B89SpuoxQV8DFaf5u5bey", "s6mOQtxGebk+yjD4WdDHHvKqxnbPaF0rtJwo8mM3ABY=", zzarwVar, zzfymVar, zzgeaVar.zza(113));
        this.zzb = context;
        this.zza = map;
        this.zzc = zzfvdVar;
        this.zzd = zzfuiVar.zzj();
        this.zze = zzfuiVar.zzk();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfzq
    protected final void zza(Method method, zzarw zzarwVar) throws IllegalAccessException, InvocationTargetException {
        zzast zzastVar;
        Object[] objArr = (Object[]) method.invoke("", this.zzb, Integer.valueOf(this.zzc.ordinal()));
        objArr.getClass();
        Object[] objArr2 = objArr;
        String str = ExifInterface.LONGITUDE_EAST;
        int i = 1;
        try {
            ListenableFuture listenableFuture = (ListenableFuture) this.zza.get("gs");
            if (listenableFuture != null && ((Build.VERSION.SDK_INT < 31 || listenableFuture.isDone()) && (zzastVar = (zzast) listenableFuture.get(this.zzd, TimeUnit.MILLISECONDS)) != null && zzastVar.zzb().length() > 1)) {
                str = zzastVar.zzb();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (str.equals(ExifInterface.LONGITUDE_EAST)) {
            try {
                ListenableFuture listenableFuture2 = (ListenableFuture) this.zza.get("ai");
                if (listenableFuture2 != null) {
                    String str2 = (String) listenableFuture2.get(this.zze, TimeUnit.MILLISECONDS);
                    if (!zzghs.zzc(str2)) {
                        str = str2;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr2[5];
        synchronized (zzarwVar) {
            zzarwVar.zzu(((Long) objArr2[0]).longValue());
            zzarwVar.zzt((String) objArr2[1]);
            zzarwVar.zzD((String) objArr2[2]);
            zzarwVar.zzE((String) objArr2[3]);
            zzgmk zzi = zzgmk.zzn().zzi();
            byte[] bArr = (byte[]) objArr2[4];
            zzarwVar.zzp(zzi.zzj(bArr, 0, bArr.length));
            zzarwVar.zzo(str);
            if (bool != null) {
                if (true == bool.booleanValue()) {
                    i = 2;
                }
                zzarwVar.zzai(i);
            }
        }
    }
}
