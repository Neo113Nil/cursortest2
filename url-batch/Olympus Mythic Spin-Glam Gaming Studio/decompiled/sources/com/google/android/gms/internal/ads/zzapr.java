package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
public final class zzapr implements zzanz {
    private final zzeu zza = new zzeu();
    private final zzapi zzb = new zzapi();

    @Override // com.google.android.gms.internal.ads.zzanz
    public final void zza(byte[] bArr, int i, int i2, zzany zzanyVar, zzdu zzduVar) {
        zzeu zzeuVar = this.zza;
        zzeuVar.zzb(bArr, i2 + i);
        zzeuVar.zzh(i);
        ArrayList arrayList = new ArrayList();
        try {
            int zzg = zzeuVar.zzg();
            Charset charset = StandardCharsets.UTF_8;
            String zzN = zzeuVar.zzN(charset);
            if (zzN == null || !zzN.startsWith("WEBVTT")) {
                zzeuVar.zzh(zzg);
                throw zzat.zzb("Expected WEBVTT. Got ".concat(String.valueOf(zzeuVar.zzN(charset))), null);
            }
            while (!TextUtils.isEmpty(zzeuVar.zzN(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                char c = 65535;
                int i3 = 0;
                while (c == 65535) {
                    i3 = zzeuVar.zzg();
                    String zzN2 = zzeuVar.zzN(StandardCharsets.UTF_8);
                    c = zzN2 == null ? (char) 0 : "STYLE".equals(zzN2) ? (char) 2 : zzN2.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                zzeuVar.zzh(i3);
                if (c == 0) {
                    zzant.zza(new zzapu(arrayList2), zzanyVar, zzduVar);
                    return;
                }
                if (c == 1) {
                    while (!TextUtils.isEmpty(zzeuVar.zzN(StandardCharsets.UTF_8))) {
                    }
                } else if (c != 2) {
                    zzapk zza = zzapq.zza(zzeuVar, arrayList);
                    if (zza != null) {
                        arrayList2.add(zza);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    zzeuVar.zzN(StandardCharsets.UTF_8);
                    arrayList.addAll(this.zzb.zza(zzeuVar));
                }
            }
        } catch (zzat e) {
            throw new IllegalArgumentException(e);
        }
    }
}
