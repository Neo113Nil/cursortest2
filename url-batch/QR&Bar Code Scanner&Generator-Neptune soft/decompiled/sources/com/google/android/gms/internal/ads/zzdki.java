package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdki extends zzdij implements zzbbq {
    private final Map zzb;
    private final Context zzc;
    private final zzfdk zzd;

    public zzdki(Context context, Set set, zzfdk zzfdkVar) {
        super(set);
        this.zzb = new WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzfdkVar;
    }

    public final synchronized void zza(View view) {
        zzbbr zzbbrVar = (zzbbr) this.zzb.get(view);
        if (zzbbrVar == null) {
            zzbbrVar = new zzbbr(this.zzc, view);
            zzbbrVar.zzc(this);
            this.zzb.put(view, zzbbrVar);
        }
        if (this.zzd.zzY) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbh)).booleanValue()) {
                zzbbrVar.zzg(((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbg)).longValue());
                return;
            }
        }
        zzbbrVar.zzf();
    }

    public final synchronized void zzb(View view) {
        if (this.zzb.containsKey(view)) {
            ((zzbbr) this.zzb.get(view)).zze(this);
            this.zzb.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final synchronized void zzc(final zzbbp zzbbpVar) {
        zzo(new zzdii() { // from class: com.google.android.gms.internal.ads.zzdkh
            @Override // com.google.android.gms.internal.ads.zzdii
            public final void zza(Object obj) {
                ((zzbbq) obj).zzc(zzbbp.this);
            }
        });
    }
}
