package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzemb implements zzehc {
    private final zzehe zza;
    private final zzehj zzb;
    private final zzfih zzc;
    private final zzfzq zzd;

    public zzemb(zzfih zzfihVar, zzfzq zzfzqVar, zzehe zzeheVar, zzehj zzehjVar) {
        this.zzc = zzfihVar;
        this.zzd = zzfzqVar;
        this.zzb = zzehjVar;
        this.zza = zzeheVar;
    }

    static final String zze(String str, int i) {
        return "Error from: " + str + ", code: " + i;
    }

    @Override // com.google.android.gms.internal.ads.zzehc
    public final zzfzp zza(final zzfdw zzfdwVar, final zzfdk zzfdkVar) {
        final zzehf zzehfVar;
        Iterator it = zzfdkVar.zzu.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzehfVar = null;
                break;
            }
            try {
                zzehfVar = this.zza.zza((String) it.next(), zzfdkVar.zzw);
                break;
            } catch (zzfek unused) {
            }
        }
        if (zzehfVar == null) {
            return zzfzg.zzh(new zzekd("Unable to instantiate mediation adapter class."));
        }
        zzchh zzchhVar = new zzchh();
        zzehfVar.zzc.zza(new zzema(this, zzehfVar, zzchhVar));
        if (zzfdkVar.zzN) {
            Bundle bundle = zzfdwVar.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfih zzfihVar = this.zzc;
        return zzfhr.zzd(new zzfhl() { // from class: com.google.android.gms.internal.ads.zzely
            @Override // com.google.android.gms.internal.ads.zzfhl
            public final void zza() {
                zzemb.this.zzd(zzfdwVar, zzfdkVar, zzehfVar);
            }
        }, this.zzd, zzfib.ADAPTER_LOAD_AD_SYN, zzfihVar).zzb(zzfib.ADAPTER_LOAD_AD_ACK).zzd(zzchhVar).zzb(zzfib.ADAPTER_WRAP_ADAPTER).zze(new zzfhk() { // from class: com.google.android.gms.internal.ads.zzelz
            @Override // com.google.android.gms.internal.ads.zzfhk
            public final Object zza(Object obj) {
                return zzemb.this.zzc(zzfdwVar, zzfdkVar, zzehfVar, (Void) obj);
            }
        }).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzehc
    public final boolean zzb(zzfdw zzfdwVar, zzfdk zzfdkVar) {
        return !zzfdkVar.zzu.isEmpty();
    }

    final /* synthetic */ Object zzc(zzfdw zzfdwVar, zzfdk zzfdkVar, zzehf zzehfVar, Void r4) throws Exception {
        return this.zzb.zza(zzfdwVar, zzfdkVar, zzehfVar);
    }

    final /* synthetic */ void zzd(zzfdw zzfdwVar, zzfdk zzfdkVar, zzehf zzehfVar) throws Exception {
        this.zzb.zzb(zzfdwVar, zzfdkVar, zzehfVar);
    }
}
