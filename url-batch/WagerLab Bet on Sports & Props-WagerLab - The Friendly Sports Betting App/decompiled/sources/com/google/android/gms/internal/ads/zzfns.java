package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public abstract class zzfns extends zzfnt {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfns(zzfnl zzfnlVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfnlVar);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j;
    }
}
