package com.google.android.gms.internal.ads;

import androidx.media3.common.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzald implements zzajv {
    private final zzef zza = new zzef();

    @Override // com.google.android.gms.internal.ads.zzajv
    public final void zza(byte[] bArr, int i, int i2, zzaju zzajuVar, zzdf zzdfVar) {
        zzcl zzr;
        zzef zzefVar = this.zza;
        zzefVar.zzb(bArr, i2 + i);
        zzefVar.zzh(i);
        ArrayList arrayList = new ArrayList();
        while (zzefVar.zzd() > 0) {
            zzghc.zzb(zzefVar.zzd() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int zzB = zzefVar.zzB() - 8;
            if (zzefVar.zzB() == 1987343459) {
                CharSequence charSequence = null;
                zzck zzckVar = null;
                while (zzB > 0) {
                    zzghc.zzb(zzB >= 8, "Incomplete vtt cue box header found.");
                    int zzB2 = zzefVar.zzB();
                    int zzB3 = zzefVar.zzB();
                    int i3 = zzB - 8;
                    int i4 = zzB2 - 8;
                    String zzj = zzeo.zzj(zzefVar.zzi(), zzefVar.zzg(), i4);
                    zzefVar.zzk(i4);
                    if (zzB3 == 1937011815) {
                        zzckVar = zzalm.zzb(zzj);
                    } else if (zzB3 == 1885436268) {
                        charSequence = zzalm.zzc(null, zzj.trim(), Collections.emptyList());
                    }
                    zzB = i3 - i4;
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (zzckVar != null) {
                    zzckVar.zza(charSequence);
                    zzr = zzckVar.zzr();
                } else {
                    Pattern pattern = zzalm.zza;
                    zzall zzallVar = new zzall();
                    zzallVar.zzc = charSequence;
                    zzr = zzallVar.zza().zzr();
                }
                arrayList.add(zzr);
            } else {
                zzefVar.zzk(zzB);
            }
        }
        zzdfVar.zza(new zzajn(arrayList, C.TIME_UNSET, C.TIME_UNSET));
    }
}
