package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzata;
import com.google.android.gms.internal.ads.zzatw;
import com.google.android.gms.internal.ads.zzatx;
import com.google.android.gms.internal.ads.zzauv;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzbh extends zzauv {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzl zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbh(zzbl zzblVar, int i, String str, zzatx zzatxVar, zzatw zzatwVar, byte[] bArr, Map map, com.google.android.gms.ads.internal.util.client.zzl zzlVar) {
        super(i, str, zzatxVar, zzatwVar);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzlVar;
        Objects.requireNonNull(zzblVar);
    }

    @Override // com.google.android.gms.internal.ads.zzats
    public final Map zzm() throws zzata {
        Map map = this.zzb;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // com.google.android.gms.internal.ads.zzats
    public final byte[] zzn() throws zzata {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzauv, com.google.android.gms.internal.ads.zzats
    protected final /* bridge */ /* synthetic */ void zzs(Object obj) {
        zzs((String) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzauv
    /* renamed from: zzz */
    public final void zzs(String str) {
        this.zzc.zze(str);
        super.zzs(str);
    }
}
