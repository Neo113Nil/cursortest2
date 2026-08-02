package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzbvb;
import com.google.android.gms.internal.ads.zzdxk;
import com.google.android.gms.internal.ads.zzdyq;
import com.google.android.gms.internal.ads.zzgbq;
import com.google.android.gms.internal.ads.zzgcj;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzaw implements zzgbq {
    private final Executor zza;
    private final zzdxk zzb;

    public zzaw(Executor executor, zzdxk zzdxkVar) {
        this.zza = executor;
        this.zzb = zzdxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgbq
    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        final zzbvb zzbvbVar = (zzbvb) obj;
        return zzgcj.zzn(this.zzb.zzc(zzbvbVar), new zzgbq() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzav
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final ListenableFuture zza(Object obj2) {
                zzdyq zzdyqVar = (zzdyq) obj2;
                zzay zzayVar = new zzay(new JsonReader(new InputStreamReader(zzdyqVar.zzb())), zzdyqVar.zza());
                try {
                    zzayVar.zzb = com.google.android.gms.ads.internal.client.zzay.zzb().zzi(zzbvb.this.zza).toString();
                } catch (JSONException unused) {
                    zzayVar.zzb = "{}";
                }
                return zzgcj.zzh(zzayVar);
            }
        }, this.zza);
    }
}
