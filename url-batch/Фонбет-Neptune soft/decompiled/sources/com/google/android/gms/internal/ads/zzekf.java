package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzekf implements zzeet {
    private final zzeev zza;
    private final zzeez zzb;
    private final zzfjl zzc;
    private final zzgcu zzd;

    public zzekf(zzfjl zzfjlVar, zzgcu zzgcuVar, zzeev zzeevVar, zzeez zzeezVar) {
        this.zzc = zzfjlVar;
        this.zzd = zzgcuVar;
        this.zzb = zzeezVar;
        this.zza = zzeevVar;
    }

    static final String zze(String str, int i) {
        return "Error from: " + str + ", code: " + i;
    }

    @Override // com.google.android.gms.internal.ads.zzeet
    public final ListenableFuture zza(final zzfex zzfexVar, final zzfel zzfelVar) {
        final zzeew zzeewVar;
        Iterator it = zzfelVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzeewVar = null;
                break;
            }
            try {
                zzeewVar = this.zza.zza((String) it.next(), zzfelVar.zzv);
                break;
            } catch (zzffn unused) {
            }
        }
        if (zzeewVar == null) {
            return zzgcj.zzg(new zzehv("Unable to instantiate mediation adapter class."));
        }
        zzbzt zzbztVar = new zzbzt();
        zzeewVar.zzc.zza(new zzeke(this, zzeewVar, zzbztVar));
        if (zzfelVar.zzM) {
            Bundle bundle = zzfexVar.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfjl zzfjlVar = this.zzc;
        return zzfiv.zzd(new zzfip() { // from class: com.google.android.gms.internal.ads.zzekc
            @Override // com.google.android.gms.internal.ads.zzfip
            public final void zza() {
                zzekf.this.zzd(zzfexVar, zzfelVar, zzeewVar);
            }
        }, this.zzd, zzfjf.ADAPTER_LOAD_AD_SYN, zzfjlVar).zzb(zzfjf.ADAPTER_LOAD_AD_ACK).zzd(zzbztVar).zzb(zzfjf.ADAPTER_WRAP_ADAPTER).zze(new zzfio() { // from class: com.google.android.gms.internal.ads.zzekd
            @Override // com.google.android.gms.internal.ads.zzfio
            public final Object zza(Object obj) {
                return zzekf.this.zzc(zzfexVar, zzfelVar, zzeewVar, (Void) obj);
            }
        }).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeet
    public final boolean zzb(zzfex zzfexVar, zzfel zzfelVar) {
        return !zzfelVar.zzt.isEmpty();
    }

    final /* synthetic */ Object zzc(zzfex zzfexVar, zzfel zzfelVar, zzeew zzeewVar, Void r4) throws Exception {
        return this.zzb.zza(zzfexVar, zzfelVar, zzeewVar);
    }

    final /* synthetic */ void zzd(zzfex zzfexVar, zzfel zzfelVar, zzeew zzeewVar) throws Exception {
        this.zzb.zzb(zzfexVar, zzfelVar, zzeewVar);
    }
}
