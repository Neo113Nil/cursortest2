package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzals implements zzaka {
    private final zzek zza = new zzek();
    private final zzali zzb = new zzali();

    @Override // com.google.android.gms.internal.ads.zzaka
    public final void zza(byte[] bArr, int i, int i2, zzajz zzajzVar, zzdn zzdnVar) {
        this.zza.zzI(bArr, i2 + i);
        this.zza.zzK(i);
        ArrayList arrayList = new ArrayList();
        try {
            zzek zzekVar = this.zza;
            int zzd = zzekVar.zzd();
            String zzy = zzekVar.zzy(zzfuj.zzc);
            if (zzy == null || !zzy.startsWith("WEBVTT")) {
                zzekVar.zzK(zzd);
                throw zzbo.zza("Expected WEBVTT. Got ".concat(String.valueOf(zzekVar.zzy(zzfuj.zzc))), null);
            }
            while (!TextUtils.isEmpty(this.zza.zzy(zzfuj.zzc))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                zzek zzekVar2 = this.zza;
                char c = 65535;
                int i3 = 0;
                while (c == 65535) {
                    i3 = zzekVar2.zzd();
                    String zzy2 = zzekVar2.zzy(zzfuj.zzc);
                    c = zzy2 == null ? (char) 0 : "STYLE".equals(zzy2) ? (char) 2 : zzy2.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                zzekVar2.zzK(i3);
                if (c == 0) {
                    zzaju.zza(new zzalv(arrayList2), zzajzVar, zzdnVar);
                    return;
                }
                if (c == 1) {
                    while (!TextUtils.isEmpty(this.zza.zzy(zzfuj.zzc))) {
                    }
                } else if (c != 2) {
                    zzalk zzc = zzalr.zzc(this.zza, arrayList);
                    if (zzc != null) {
                        arrayList2.add(zzc);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.zza.zzy(zzfuj.zzc);
                    arrayList.addAll(this.zzb.zzb(this.zza));
                }
            }
        } catch (zzbo e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final /* synthetic */ void zzb() {
    }
}
