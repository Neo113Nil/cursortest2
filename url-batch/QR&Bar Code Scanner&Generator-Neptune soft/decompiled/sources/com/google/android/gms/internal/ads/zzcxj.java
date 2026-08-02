package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public class zzcxj {
    private final zzczc zza;
    private final View zzb;
    private final zzfdl zzc;
    private final zzcmp zzd;

    public zzcxj(View view, zzcmp zzcmpVar, zzczc zzczcVar, zzfdl zzfdlVar) {
        this.zzb = view;
        this.zzd = zzcmpVar;
        this.zza = zzczcVar;
        this.zzc = zzfdlVar;
    }

    public static final zzdkg zzf(final Context context, final zzcgv zzcgvVar, final zzfdk zzfdkVar, final zzfef zzfefVar) {
        return new zzdkg(new zzdeo() { // from class: com.google.android.gms.internal.ads.zzcxh
            @Override // com.google.android.gms.internal.ads.zzdeo
            public final void zzn() {
                com.google.android.gms.ads.internal.zzt.zzs().zzn(context, zzcgvVar.zza, zzfdkVar.zzD.toString(), zzfefVar.zzf);
            }
        }, zzchc.zzf);
    }

    public static final Set zzg(zzcyt zzcytVar) {
        return Collections.singleton(new zzdkg(zzcytVar, zzchc.zzf));
    }

    public static final zzdkg zzh(zzcyr zzcyrVar) {
        return new zzdkg(zzcyrVar, zzchc.zze);
    }

    public final View zza() {
        return this.zzb;
    }

    public final zzcmp zzb() {
        return this.zzd;
    }

    public final zzczc zzc() {
        return this.zza;
    }

    public zzdem zzd(Set set) {
        return new zzdem(set);
    }

    public final zzfdl zze() {
        return this.zzc;
    }
}
