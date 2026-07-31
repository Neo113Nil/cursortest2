package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzcxx extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcxx(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcxx zza(Context context, View view, zzfld zzfldVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcxx zzcxxVar = new zzcxx(context);
        List list = zzfldVar.zzu;
        if (!list.isEmpty() && (resources = zzcxxVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f = ((zzfle) list.get(0)).zza;
            float f2 = displayMetrics.density;
            zzcxxVar.setLayoutParams(new FrameLayout.LayoutParams((int) (f * f2), (int) (r4.zzb * f2)));
        }
        zzcxxVar.zzb = view;
        zzcxxVar.addView(view);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcgw.zzb(zzcxxVar, zzcxxVar);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcgw.zza(zzcxxVar, zzcxxVar);
        JSONObject jSONObject = zzfldVar.zzah;
        RelativeLayout relativeLayout = new RelativeLayout(zzcxxVar.zza);
        JSONObject optJSONObject = jSONObject.optJSONObject(POBCTAOverlayData.KEY_CTA_HEADER);
        if (optJSONObject != null) {
            zzcxxVar.zzb(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            zzcxxVar.zzb(optJSONObject2, relativeLayout, 12);
        }
        zzcxxVar.addView(relativeLayout);
        return zzcxxVar;
    }

    private final void zzb(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int zzc = zzc(jSONObject.optDouble(VastAttributes.PADDING, 0.0d));
        textView.setPadding(0, zzc, 0, zzc);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzc(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    private final int zzc(double d) {
        com.google.android.gms.ads.internal.client.zzay.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzE(this.zza, (int) d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.h, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }
}
