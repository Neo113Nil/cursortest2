package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.h;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@TargetApi(26)
/* loaded from: classes3.dex */
public final class zzcnb extends zzcna {
    public zzcnb(zzclm zzclmVar, zzbif zzbifVar, boolean z, @Nullable zzelp zzelpVar) {
        super(zzclmVar, zzbifVar, z, zzelpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcna, com.google.android.gms.internal.ads.zzcmz, com.google.android.gms.internal.ads.zzclx, android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(h.h, view, url);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        int rendererPriorityAtExit;
        zzclm zzclmVar = this.zza;
        didCrash = renderProcessGoneDetail.didCrash();
        rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        return zzclmVar.zzaA(didCrash, rendererPriorityAtExit);
    }
}
