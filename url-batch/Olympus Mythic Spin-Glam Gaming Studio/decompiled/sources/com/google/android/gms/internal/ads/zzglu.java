package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import com.safedk.android.analytics.brandsafety.m;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzglu implements zzgac {
    private final Context zza;
    private final zzgqc zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;

    zzglu(Context context, zzgei zzgeiVar, zzgqc zzgqcVar) {
        this.zza = context;
        this.zzc = zzgeiVar.zzd();
        this.zzd = zzgeiVar.zzl();
        this.zze = zzgeiVar.zzm();
        this.zzb = zzgqcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zza(Map map) {
        String str;
        ListenableFuture listenableFuture;
        zzaza zzazaVar;
        map.put("v", this.zzc);
        map.put("t", new Throwable());
        try {
            listenableFuture = (ListenableFuture) map.get("gs");
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (listenableFuture != null && ((Build.VERSION.SDK_INT < 31 || listenableFuture.isDone()) && (zzazaVar = (zzaza) listenableFuture.get(this.zzd, TimeUnit.MILLISECONDS)) != null && zzazaVar.zzb().length() > 1)) {
            str = zzazaVar.zzb();
            if (str.equals("E")) {
                try {
                    ListenableFuture listenableFuture2 = (ListenableFuture) map.get("ai");
                    if (listenableFuture2 != null) {
                        String str2 = (String) listenableFuture2.get(this.zze, TimeUnit.MILLISECONDS);
                        if (!zzgvb.zzc(str2)) {
                            str = str2;
                        }
                    }
                } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
                }
            }
            map.put(m.w, str);
        }
        str = "E";
        if (str.equals("E")) {
        }
        map.put(m.w, str);
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final Map zzb() {
        Map zzb = this.zzb.zzb();
        zza(zzb);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final Map zzc() {
        Map zzc = this.zzb.zzc(this.zza, null);
        zza(zzc);
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final Map zzd() {
        Map zzd = this.zzb.zzd();
        zza(zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgac
    public final Map zze() {
        HashMap hashMap = new HashMap();
        hashMap.put("t", new Throwable());
        return hashMap;
    }
}
