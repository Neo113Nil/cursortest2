package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzcjh implements zzbqh {
    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcif zzcifVar = (zzcif) obj;
        zzcms zzh = zzcifVar.zzh();
        if (zzh == null) {
            try {
                zzcms zzcmsVar = new zzcms(zzcifVar, Float.parseFloat((String) map.get(IronSourceConstants.EVENTS_DURATION)), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzcifVar.zzw(zzcmsVar);
                zzh = zzcmsVar;
            } catch (NullPointerException e) {
                e = e;
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e2) {
                e = e2;
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get(IronSourceConstants.EVENTS_DURATION));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        int i3 = 0;
        if (parseInt >= 0 && parseInt <= 3) {
            i3 = parseInt;
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(parseFloat2).length() + 45 + String.valueOf(parseFloat).length() + 13 + String.valueOf(equals).length() + 19 + String.valueOf(i3).length() + 17 + String.valueOf(str).length());
            sb.append("Video Meta GMSG: currentTime : ");
            sb.append(parseFloat2);
            sb.append(" , duration : ");
            sb.append(parseFloat);
            sb.append(" , isMuted : ");
            sb.append(equals);
            sb.append(" , playbackState : ");
            sb.append(i3);
            sb.append(" , aspectRatio : ");
            sb.append(str);
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb.toString());
        }
        zzh.zzr(parseFloat2, parseFloat, i3, equals, parseFloat3);
    }
}
