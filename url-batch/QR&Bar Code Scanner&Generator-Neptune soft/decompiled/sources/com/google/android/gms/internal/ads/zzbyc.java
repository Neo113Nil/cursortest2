package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbyc extends zzbyf {
    private final Map zza;
    private final Context zzb;

    public zzbyc(zzcmp zzcmpVar, Map map) {
        super(zzcmpVar, "storePicture");
        this.zza = map;
        this.zzb = zzcmpVar.zzk();
    }

    public final void zzb() {
        if (this.zzb == null) {
            zzg("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        if (!new zzbim(this.zzb).zzc()) {
            zzg("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzg("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            zzg("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        com.google.android.gms.ads.internal.zzt.zzp();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            zzg("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources zzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder zzG = com.google.android.gms.ads.internal.util.zzs.zzG(this.zzb);
        zzG.setTitle(zzd != null ? zzd.getString(R.string.s1) : "Save image");
        zzG.setMessage(zzd != null ? zzd.getString(R.string.s2) : "Allow Ad to store image in Picture gallery?");
        zzG.setPositiveButton(zzd != null ? zzd.getString(R.string.s3) : "Accept", new zzbya(this, str, lastPathSegment));
        zzG.setNegativeButton(zzd != null ? zzd.getString(R.string.s4) : "Decline", new zzbyb(this));
        zzG.create().show();
    }
}
