package com.google.android.gms.internal.ads;

import androidx.media3.extractor.avi.AviExtractor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzaeo implements zzaek {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzaeo(int i, int i2, int i3, int i4) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static zzaeo zzb(zzef zzefVar) {
        int zzC = zzefVar.zzC();
        zzefVar.zzk(8);
        int zzC2 = zzefVar.zzC();
        int zzC3 = zzefVar.zzC();
        zzefVar.zzk(4);
        int zzC4 = zzefVar.zzC();
        zzefVar.zzk(12);
        return new zzaeo(zzC, zzC2, zzC3, zzC4);
    }

    @Override // com.google.android.gms.internal.ads.zzaek
    public final int zza() {
        return AviExtractor.FOURCC_avih;
    }
}
