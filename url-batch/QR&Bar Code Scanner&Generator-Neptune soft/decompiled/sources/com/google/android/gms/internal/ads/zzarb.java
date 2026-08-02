package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzarb extends zzarq {
    private final zzapi zzi;
    private final long zzj;
    private final long zzk;

    public zzarb(zzaqe zzaqeVar, String str, String str2, zzamk zzamkVar, int i, int i2, zzapi zzapiVar, long j, long j2) {
        super(zzaqeVar, "X9PgbTHLX0FFxbl3gdPDuVwcglfXy5CDrzo8siaVNaH+OIJ6JI34Wu3QK5rLega4", "JLulXGPEHVwHK+0FG96HP9my+NvwpTQbwIaIZrjn9OU=", zzamkVar, i, 11);
        this.zzi = zzapiVar;
        this.zzj = j;
        this.zzk = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzarq
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzapi zzapiVar = this.zzi;
        if (zzapiVar != null) {
            zzapg zzapgVar = new zzapg((String) this.zzf.invoke(null, zzapiVar.zzb(), Long.valueOf(this.zzj), Long.valueOf(this.zzk)));
            synchronized (this.zze) {
                this.zze.zzz(zzapgVar.zza.longValue());
                if (zzapgVar.zzb.longValue() >= 0) {
                    this.zze.zzQ(zzapgVar.zzb.longValue());
                }
                if (zzapgVar.zzc.longValue() >= 0) {
                    this.zze.zzf(zzapgVar.zzc.longValue());
                }
            }
        }
    }
}
