package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaij;
import com.google.android.gms.internal.ads.zzajf;
import com.google.android.gms.internal.ads.zzajg;
import com.google.android.gms.internal.ads.zzakg;
import com.google.android.gms.internal.ads.zzcfh;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
final class zzbi extends zzakg {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ zzcfh zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbi(zzbo zzboVar, int i, String str, zzajg zzajgVar, zzajf zzajfVar, byte[] bArr, Map map, zzcfh zzcfhVar) {
        super(i, str, zzajgVar, zzajfVar);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzcfhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzajb
    public final Map zzl() throws zzaij {
        Map map = this.zzb;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // com.google.android.gms.internal.ads.zzakg, com.google.android.gms.internal.ads.zzajb
    protected final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzo((String) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzajb
    public final byte[] zzx() throws zzaij {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzakg
    /* renamed from: zzz */
    public final void zzo(String str) {
        this.zzc.zzg(str);
        super.zzo(str);
    }
}
