package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzakr {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzgke zze = zzgke.zzj("auto", "none");
    private static final zzgke zzf = zzgke.zzk(TtmlNode.TEXT_EMPHASIS_MARK_DOT, TtmlNode.TEXT_EMPHASIS_MARK_SESAME, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
    private static final zzgke zzg = zzgke.zzj(TtmlNode.TEXT_EMPHASIS_MARK_FILLED, TtmlNode.TEXT_EMPHASIS_MARK_OPEN);
    private static final zzgke zzh = zzgke.zzk(TtmlNode.ANNOTATION_POSITION_AFTER, TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_OUTSIDE);
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzakr(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static zzakr zza(String str) {
        boolean z;
        if (str == null) {
            return null;
        }
        String zza = zzggj.zza(str.trim());
        if (zza.isEmpty()) {
            return null;
        }
        zzgke zzp = zzgke.zzp(TextUtils.split(zza, zzd));
        String str2 = (String) zzgkf.zzb(zzglz.zza(zzh, zzp), TtmlNode.ANNOTATION_POSITION_OUTSIDE);
        int hashCode = str2.hashCode();
        int i = -1;
        int i2 = 0;
        if (hashCode != -1106037339) {
            if (hashCode == 92734940 && str2.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                z = false;
            }
            z = -1;
        } else {
            if (str2.equals(TtmlNode.ANNOTATION_POSITION_OUTSIDE)) {
                z = true;
            }
            z = -1;
        }
        int i3 = z ? !z ? 1 : -2 : 2;
        zzgly zza2 = zzglz.zza(zze, zzp);
        if (zza2.isEmpty()) {
            zzgly zza3 = zzglz.zza(zzg, zzp);
            zzgly zza4 = zzglz.zza(zzf, zzp);
            if (!zza3.isEmpty() || !zza4.isEmpty()) {
                String str3 = (String) zzgkf.zzb(zza3, TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
                int i4 = (str3.hashCode() == 3417674 && str3.equals(TtmlNode.TEXT_EMPHASIS_MARK_OPEN)) ? 2 : 1;
                String str4 = (String) zzgkf.zzb(zza4, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
                int hashCode2 = str4.hashCode();
                if (hashCode2 != -905816648) {
                    if (hashCode2 == 99657 && str4.equals(TtmlNode.TEXT_EMPHASIS_MARK_DOT)) {
                        i = 0;
                    }
                } else if (str4.equals(TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                    i = 1;
                }
                if (i == 0) {
                    i = 2;
                } else if (i != 1) {
                    i2 = i4;
                    i = 1;
                } else {
                    i = 3;
                }
                i2 = i4;
            }
        } else {
            String str5 = (String) zza2.iterator().next();
            if (str5.hashCode() == 3387192 && str5.equals("none")) {
                i = 0;
            }
        }
        return new zzakr(i, i2, i3);
    }
}
