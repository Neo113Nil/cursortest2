package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public interface zzcmp extends com.google.android.gms.ads.internal.client.zza, zzdkn, zzcmg, zzbsn, zzcnm, zzcnq, zzbta, zzbbq, zzcnu, com.google.android.gms.ads.internal.zzl, zzcnx, zzcny, zzciy, zzcnz {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzcnq, com.google.android.gms.internal.ads.zzciy
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzciy
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzciy
    void zzE(zzcnl zzcnlVar);

    @Override // com.google.android.gms.internal.ads.zzcmg
    zzfdk zzF();

    Context zzG();

    @Override // com.google.android.gms.internal.ads.zzcnz
    View zzH();

    WebView zzI();

    WebViewClient zzJ();

    @Override // com.google.android.gms.internal.ads.zzcnx
    zzape zzK();

    zzbdd zzL();

    zzblr zzM();

    com.google.android.gms.ads.internal.overlay.zzl zzN();

    com.google.android.gms.ads.internal.overlay.zzl zzO();

    zzcoc zzP();

    @Override // com.google.android.gms.internal.ads.zzcnw
    zzcoe zzQ();

    @Override // com.google.android.gms.internal.ads.zzcnm
    zzfdn zzR();

    IObjectWrapper zzS();

    zzfzp zzT();

    String zzU();

    void zzV(zzfdk zzfdkVar, zzfdn zzfdnVar);

    void zzW();

    void zzX();

    void zzY(int i);

    void zzZ();

    boolean zzaA(boolean z, int i);

    boolean zzaB();

    boolean zzaC();

    boolean zzaD();

    boolean zzaE();

    void zzaa();

    void zzab(boolean z);

    void zzac();

    void zzad(String str, String str2, String str3);

    void zzae();

    void zzaf(String str, zzbpu zzbpuVar);

    void zzag();

    void zzah(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    void zzai(zzcoe zzcoeVar);

    void zzaj(zzbdd zzbddVar);

    void zzak(boolean z);

    void zzal();

    void zzam(Context context);

    void zzan(boolean z);

    void zzao(zzblp zzblpVar);

    void zzap(boolean z);

    void zzaq(zzblr zzblrVar);

    void zzar(IObjectWrapper iObjectWrapper);

    void zzas(int i);

    void zzat(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    void zzau(boolean z);

    void zzav(boolean z);

    void zzaw(String str, zzbpu zzbpuVar);

    void zzax(String str, Predicate predicate);

    boolean zzay();

    boolean zzaz();

    @Override // com.google.android.gms.internal.ads.zzcnq, com.google.android.gms.internal.ads.zzciy
    Activity zzk();

    @Override // com.google.android.gms.internal.ads.zzciy
    com.google.android.gms.ads.internal.zza zzm();

    @Override // com.google.android.gms.internal.ads.zzciy
    zzbjp zzo();

    @Override // com.google.android.gms.internal.ads.zzcny, com.google.android.gms.internal.ads.zzciy
    zzcgv zzp();

    @Override // com.google.android.gms.internal.ads.zzciy
    zzcnl zzs();

    @Override // com.google.android.gms.internal.ads.zzciy
    void zzv(String str, zzclb zzclbVar);
}
