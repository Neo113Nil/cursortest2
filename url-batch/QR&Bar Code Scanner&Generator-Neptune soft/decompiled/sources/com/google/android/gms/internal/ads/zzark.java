package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzark extends zzarq {
    private final zzaql zzi;
    private long zzj;

    public zzark(zzaqe zzaqeVar, String str, String str2, zzamk zzamkVar, int i, int i2, zzaql zzaqlVar) {
        super(zzaqeVar, "mkunJHFc5vhTAVOcsaNSYx7OvFB6slgbORGrA/joIDO0IYq5rQvDcAbp2AI6CPUh", "k8GEQUoJxJPI/0jAlfeUix8QD7WaaXAfMcSQAzrpgrU=", zzamkVar, i, 53);
        this.zzi = zzaqlVar;
        if (zzaqlVar != null) {
            this.zzj = zzaqlVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarq
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            this.zze.zzP(((Long) this.zzf.invoke(null, Long.valueOf(this.zzj))).longValue());
        }
    }
}
