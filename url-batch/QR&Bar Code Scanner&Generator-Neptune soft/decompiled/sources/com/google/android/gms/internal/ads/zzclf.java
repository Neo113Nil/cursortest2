package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzclf extends zzclb {
    public zzclf(zzciy zzciyVar) {
        super(zzciyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final boolean zzq(String str) {
        String zze = zzcgi.zze(str);
        zzciy zzciyVar = (zzciy) this.zzc.get();
        if (zzciyVar != null && zze != null) {
            zzciyVar.zzv(zze, this);
        }
        com.google.android.gms.ads.internal.util.zze.zzj("VideoStreamNoopCache is doing nothing.");
        zzc(str, zze, "noop", "Noop cache is a noop.");
        return false;
    }
}
