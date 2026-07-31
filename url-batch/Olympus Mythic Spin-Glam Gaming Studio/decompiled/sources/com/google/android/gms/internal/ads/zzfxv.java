package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public abstract class zzfxv extends zzfxw {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfxv(zzfxo zzfxoVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfxoVar);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j;
    }
}
