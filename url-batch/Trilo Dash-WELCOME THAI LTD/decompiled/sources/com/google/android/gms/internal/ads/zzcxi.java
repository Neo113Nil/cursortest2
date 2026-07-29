package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzcxi extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcxi(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcxi zza(Context context, View view, zzfbg zzfbgVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcxi zzcxiVar = new zzcxi(context);
        if (!zzfbgVar.zzv.isEmpty() && (resources = zzcxiVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzfbh zzfbhVar = (zzfbh) zzfbgVar.zzv.get(0);
            zzcxiVar.setLayoutParams(new FrameLayout.LayoutParams((int) (zzfbhVar.zza * displayMetrics.density), (int) (zzfbhVar.zzb * displayMetrics.density)));
        }
        zzcxiVar.zzb = view;
        zzcxiVar.addView(view);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcgi.zzb(zzcxiVar, zzcxiVar);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcgi.zza(zzcxiVar, zzcxiVar);
        JSONObject jSONObject = zzfbgVar.zzaj;
        RelativeLayout relativeLayout = new RelativeLayout(zzcxiVar.zza);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            zzcxiVar.zzc(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            zzcxiVar.zzc(optJSONObject2, relativeLayout, 12);
        }
        zzcxiVar.addView(relativeLayout);
        return zzcxiVar;
    }

    private final int zzb(double d) {
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        return zzcfb.zzv(this.zza, (int) d);
    }

    private final void zzc(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int zzb = zzb(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, zzb, 0, zzb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }
}
