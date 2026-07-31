package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzgjv extends zzgka {
    private final Context zza;
    private final Map zzb;

    zzgjv(zzaya zzayaVar, zzgiw zzgiwVar, Map map, Context context, zzgrh zzgrhVar) {
        super("SZhD94EfxCH1aUaqL3kliCVXsuzYhOJtOn/V0ec5JepY8dU6lMpt78s7q3QiFI+n", "9JUJL19Ne/lezLGl66/0Sq/KunPDyKseh4J4ncxdc50=", zzayaVar, zzgiwVar, zzgrhVar.zza(120));
        this.zza = context;
        this.zzb = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgka
    protected final void zza(Method method, zzaya zzayaVar) throws IllegalAccessException, InvocationTargetException {
        Long l = -1L;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                Long l2 = (Long) method.invoke("", this.zza);
                if (l2 == null) {
                    throw null;
                }
                l = l2;
            } else {
                ListenableFuture listenableFuture = (ListenableFuture) this.zzb.get("gs");
                if (listenableFuture != null && listenableFuture.isDone()) {
                    l = Long.valueOf(((zzaza) listenableFuture.get()).zze());
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        synchronized (zzayaVar) {
            zzayaVar.zzR(l.longValue());
        }
    }
}
