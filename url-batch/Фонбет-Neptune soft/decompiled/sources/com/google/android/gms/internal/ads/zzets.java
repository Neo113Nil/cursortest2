package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzets implements zzevo {
    private final zzgcu zza;
    private final Context zzb;
    private final Set zzc;

    public zzets(zzgcu zzgcuVar, Context context, Set set) {
        this.zza = zzgcuVar;
        this.zzb = context;
        this.zzc = set;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzets.this.zzc();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r0.contains("banner") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ zzett zzc() throws Exception {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzez)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzeJ)).booleanValue()) {
                Set set = this.zzc;
                if (!set.contains("rewarded")) {
                    if (!set.contains("interstitial")) {
                        if (!set.contains("native")) {
                        }
                    }
                }
            }
            return new zzett(com.google.android.gms.ads.internal.zzu.zzA().zzf(this.zzb));
        }
        return new zzett(null);
    }
}
