package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbjg;
import com.safedk.android.analytics.brandsafety.m;
import java.util.List;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@TargetApi(28)
/* loaded from: classes5.dex */
public class zzx extends zzv {
    static final /* synthetic */ WindowInsets zzj(Activity activity, View view, WindowInsets windowInsets) {
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        if (com.google.android.gms.ads.internal.zzt.zzh().zzp().zzu() == null) {
            displayCutout = windowInsets.getDisplayCutout();
            String str = "";
            if (displayCutout != null) {
                zzg zzp = com.google.android.gms.ads.internal.zzt.zzh().zzp();
                boundingRects = displayCutout.getBoundingRects();
                for (Rect rect : boundingRects) {
                    String format = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                    if (!TextUtils.isEmpty(str)) {
                        str = str.concat(m.ad);
                    }
                    str = str.concat(format);
                }
                zzp.zzv(str);
            } else {
                com.google.android.gms.ads.internal.zzt.zzh().zzp().zzv("");
            }
        }
        zzl(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static final void zzl(boolean z, Activity activity) {
        int i;
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        i = attributes.layoutInDisplayCutoutMode;
        int i2 = true != z ? 2 : 1;
        if (i2 != i) {
            attributes.layoutInDisplayCutoutMode = i2;
            window.setAttributes(attributes);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final void zzh(final Activity activity) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbW)).booleanValue() && com.google.android.gms.ads.internal.zzt.zzh().zzp().zzu() == null && !activity.isInMultiWindowMode()) {
            zzl(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(this) { // from class: com.google.android.gms.ads.internal.util.zzw
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final /* synthetic */ WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return zzx.zzj(activity, view, windowInsets);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final int zzi(AudioManager audioManager) {
        int streamMinVolume;
        streamMinVolume = audioManager.getStreamMinVolume(3);
        return streamMinVolume;
    }
}
