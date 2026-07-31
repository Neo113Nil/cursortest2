package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzioa extends zzins {
    static {
        zzinx.zza(Collections.emptyMap());
    }

    /* synthetic */ zzioa(Map map, zziny zzinyVar) {
        super(map);
    }

    public static zzinz zzc(int i) {
        return new zzinz(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap zzc = zzint.zzc(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            zzc.put(entry.getKey(), ((zziof) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(zzc);
    }
}
