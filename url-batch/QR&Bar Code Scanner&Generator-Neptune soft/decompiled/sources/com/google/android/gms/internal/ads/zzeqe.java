package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeqe implements zzeve {
    private final zzfzq zza;
    private final zzdvl zzb;
    private final zzdzs zzc;
    private final zzeqh zzd;

    public zzeqe(zzfzq zzfzqVar, zzdvl zzdvlVar, zzdzs zzdzsVar, zzeqh zzeqhVar) {
        this.zza = zzfzqVar;
        this.zzb = zzdvlVar;
        this.zzc = zzdzsVar;
        this.zzd = zzeqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        if (zzftm.zzd((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbk)) || this.zzd.zzb() || !this.zzc.zzt()) {
            return zzfzg.zzi(new zzeqg(new Bundle(), null));
        }
        this.zzd.zza(true);
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqe.this.zzc();
            }
        });
    }

    final /* synthetic */ zzeqg zzc() throws Exception {
        List<String> asList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbk)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                zzffa zzc = this.zzb.zzc(str, new JSONObject());
                zzc.zzA();
                Bundle bundle2 = new Bundle();
                try {
                    zzbxq zzf = zzc.zzf();
                    if (zzf != null) {
                        bundle2.putString("sdk_version", zzf.toString());
                    }
                } catch (zzfek unused) {
                }
                try {
                    zzbxq zze = zzc.zze();
                    if (zze != null) {
                        bundle2.putString("adapter_version", zze.toString());
                    }
                } catch (zzfek unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfek unused3) {
            }
        }
        return new zzeqg(bundle, null);
    }
}
