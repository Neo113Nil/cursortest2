package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzgjh extends zzgka {
    private final Map zza;
    private final Context zzb;
    private final zzgff zzc;
    private final long zzd;
    private final long zze;

    zzgjh(zzaya zzayaVar, zzgiw zzgiwVar, Map map, Context context, zzgff zzgffVar, zzgei zzgeiVar, zzgrh zzgrhVar) {
        super("+PCjsR8uUrE+ODYObgFJ15LzzbP31PRWxMEYlQ7sSRGBdHPl6GvLcY6T0RM0sryv", "LK6oYs0YHGkrF/9CgiECppIXTefV1s/9lm3/dqGO06I=", zzayaVar, zzgiwVar, zzgrhVar.zza(113));
        this.zzb = context;
        this.zza = map;
        this.zzc = zzgffVar;
        this.zzd = zzgeiVar.zzl();
        this.zze = zzgeiVar.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzgka
    protected final void zza(Method method, zzaya zzayaVar) throws IllegalAccessException, InvocationTargetException {
        String str;
        zzaza zzazaVar;
        Object[] objArr = (Object[]) method.invoke("", this.zzb, Integer.valueOf(this.zzc.ordinal()));
        objArr.getClass();
        String str2 = "E";
        int i = 1;
        try {
            ListenableFuture listenableFuture = (ListenableFuture) this.zza.get("gs");
            if (listenableFuture != null && ((Build.VERSION.SDK_INT < 31 || listenableFuture.isDone()) && (zzazaVar = (zzaza) listenableFuture.get(this.zzd, TimeUnit.MILLISECONDS)) != null && zzazaVar.zzb().length() > 1)) {
                str2 = zzazaVar.zzb();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (str2.equals("E")) {
            try {
                ListenableFuture listenableFuture2 = (ListenableFuture) this.zza.get("ai");
                if (listenableFuture2 != null) {
                    String str3 = (String) listenableFuture2.get(this.zze, TimeUnit.MILLISECONDS);
                    if (!zzgvb.zzc(str3)) {
                        str2 = str3;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr[5];
        synchronized (zzayaVar) {
            try {
                Object obj = objArr[4];
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    str = Base64.encodeToString(zzhah.zzn().zzi().zzj(bArr, 0, bArr.length).getBytes(StandardCharsets.UTF_8), 11);
                } else {
                    str = (String) obj;
                }
                zzayaVar.zzu(((Long) objArr[0]).longValue());
                zzayaVar.zzt((String) objArr[1]);
                zzayaVar.zzD((String) objArr[2]);
                zzayaVar.zzE((String) objArr[3]);
                zzayaVar.zzp(str);
                zzayaVar.zzo(str2);
                if (bool != null) {
                    if (true == bool.booleanValue()) {
                        i = 2;
                    }
                    zzayaVar.zzai(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
