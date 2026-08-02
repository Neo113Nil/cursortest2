package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbtq extends zzcho {
    private final Object zza = new Object();
    private final zzbtv zzb;
    private boolean zzc;

    public zzbtq(zzbtv zzbtvVar) {
        this.zzb = zzbtvVar;
    }

    public final void zzb() {
        synchronized (this.zza) {
            if (this.zzc) {
                return;
            }
            this.zzc = true;
            zzi(new zzbtn(this), new zzchk());
            zzi(new zzbto(this), new zzbtp(this));
        }
    }
}
