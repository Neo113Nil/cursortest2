package com.google.android.gms.ads.internal.util;

import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.internal.ads.zzajz;
import com.google.android.gms.internal.ads.zzakd;
import com.google.android.gms.internal.ads.zzakj;
import com.google.android.gms.internal.ads.zzala;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzchh;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes.dex */
public final class zzbn extends zzakd {
    private final zzchh zza;
    private final zzcgo zzb;

    public zzbn(String str, Map map, zzchh zzchhVar) {
        super(0, str, new zzbm(zzchhVar));
        this.zza = zzchhVar;
        zzcgo zzcgoVar = new zzcgo(null);
        this.zzb = zzcgoVar;
        zzcgoVar.zzd(str, ShareTarget.METHOD_GET, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    protected final zzakj zzh(zzajz zzajzVar) {
        return zzakj.zzb(zzajzVar, zzala.zzb(zzajzVar));
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    protected final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzajz zzajzVar = (zzajz) obj;
        this.zzb.zzf(zzajzVar.zzc, zzajzVar.zza);
        zzcgo zzcgoVar = this.zzb;
        byte[] bArr = zzajzVar.zzb;
        if (zzcgo.zzl() && bArr != null) {
            zzcgoVar.zzh(bArr);
        }
        this.zza.zzd(zzajzVar);
    }
}
