package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzfcs implements zzfdi {
    private final zzcer zza;
    private final zzhdi zzb;
    private final Context zzc;

    public zzfcs(zzcer zzcerVar, zzhdi zzhdiVar, Context context) {
        this.zza = zzcerVar;
        this.zzb = zzhdiVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcr
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfcs.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 34;
    }

    final /* synthetic */ zzfct zzc() {
        zzcer zzcerVar = this.zza;
        Context context = this.zzc;
        if (!zzcerVar.zzb(context)) {
            return new zzfct(null, null, null, null, null);
        }
        String zzi = zzcerVar.zzi(context);
        String str = zzi == null ? "" : zzi;
        String zzj = zzcerVar.zzj(context);
        String str2 = zzj == null ? "" : zzj;
        String zzk = zzcerVar.zzk(context);
        String str3 = zzk == null ? "" : zzk;
        String str4 = true != zzcerVar.zzb(context) ? null : "fa";
        return new zzfct(str, str2, str3, str4 == null ? "" : str4, "TIME_OUT".equals(str2) ? (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzba) : null);
    }
}
