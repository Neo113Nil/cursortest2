package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzajl;
import com.google.android.gms.internal.ads.zzakh;
import com.google.android.gms.internal.ads.zzaki;
import com.google.android.gms.internal.ads.zzali;
import com.google.android.gms.internal.ads.zzcgo;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes.dex */
final class zzbi extends zzali {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ zzcgo zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbi(zzbo zzboVar, int i, String str, zzaki zzakiVar, zzakh zzakhVar, byte[] bArr, Map map, zzcgo zzcgoVar) {
        super(i, str, zzakiVar, zzakhVar);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzcgoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final Map zzl() throws zzajl {
        Map map = this.zzb;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // com.google.android.gms.internal.ads.zzali, com.google.android.gms.internal.ads.zzakd
    protected final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzo((String) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final byte[] zzx() throws zzajl {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzali
    /* renamed from: zzz */
    public final void zzo(String str) {
        this.zzc.zzg(str);
        super.zzo(str);
    }
}
