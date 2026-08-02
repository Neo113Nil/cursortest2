package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcne extends FrameLayout implements zzcmp {
    private final zzcmp zza;
    private final zzcin zzb;
    private final AtomicBoolean zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public zzcne(zzcmp zzcmpVar) {
        super(zzcmpVar.getContext());
        this.zzc = new AtomicBoolean();
        this.zza = zzcmpVar;
        this.zzb = new zzcin(zzcmpVar.zzG(), this, this);
        addView((View) zzcmpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void destroy() {
        final IObjectWrapper zzS = zzS();
        if (zzS == null) {
            this.zza.destroy();
            return;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnc
            @Override // java.lang.Runnable
            public final void run() {
                IObjectWrapper iObjectWrapper = IObjectWrapper.this;
                com.google.android.gms.ads.internal.zzt.zzA();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeg)).booleanValue() && zzfkp.zzb()) {
                    Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
                    if (unwrap instanceof zzfkr) {
                        ((zzfkr) unwrap).zzc();
                    }
                }
            }
        });
        zzfpz zzfpzVar = com.google.android.gms.ads.internal.util.zzs.zza;
        final zzcmp zzcmpVar = this.zza;
        zzcmpVar.getClass();
        zzfpzVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnd
            @Override // java.lang.Runnable
            public final void run() {
                zzcmp.this.destroy();
            }
        }, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeh)).intValue());
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void goBack() {
        this.zza.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void loadData(String str, String str2, String str3) {
        this.zza.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void loadUrl(String str) {
        this.zza.loadUrl(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcmp zzcmpVar = this.zza;
        if (zzcmpVar != null) {
            zzcmpVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void onPause() {
        this.zzb.zze();
        this.zza.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void onResume() {
        this.zza.onResume();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcmp
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcmp
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final void zzA(int i) {
        this.zza.zzA(i);
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final void zzB(boolean z) {
        this.zza.zzB(false);
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final void zzC(int i) {
        this.zza.zzC(i);
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final void zzD(int i) {
        this.zzb.zzf(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp, com.google.android.gms.internal.ads.zzciy
    public final void zzE(zzcnl zzcnlVar) {
        this.zza.zzE(zzcnlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp, com.google.android.gms.internal.ads.zzcmg
    public final zzfdk zzF() {
        return this.zza.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final Context zzG() {
        return this.zza.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp, com.google.android.gms.internal.ads.zzcnz
    public final View zzH() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final WebView zzI() {
        return (WebView) this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final WebViewClient zzJ() {
        return this.zza.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp, com.google.android.gms.internal.ads.zzcnx
    public final zzape zzK() {
        return this.zza.zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final zzbdd zzL() {
        return this.zza.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final zzblr zzM() {
        return this.zza.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final com.google.android.gms.ads.internal.overlay.zzl zzN() {
        return this.zza.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final com.google.android.gms.ads.internal.overlay.zzl zzO() {
        return this.zza.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final zzcoc zzP() {
        return ((zzcni) this.zza).zzaL();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp, com.google.android.gms.internal.ads.zzcnw
    public final zzcoe zzQ() {
        return this.zza.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp, com.google.android.gms.internal.ads.zzcnm
    public final zzfdn zzR() {
        return this.zza.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final IObjectWrapper zzS() {
        return this.zza.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final zzfzp zzT() {
        return this.zza.zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final String zzU() {
        return this.zza.zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzV(zzfdk zzfdkVar, zzfdn zzfdnVar) {
        this.zza.zzV(zzfdkVar, zzfdnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzW() {
        this.zzb.zzd();
        this.zza.zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzX() {
        this.zza.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzY(int i) {
        this.zza.zzY(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzZ() {
        this.zza.zzZ();
    }

    @Override // com.google.android.gms.internal.ads.zzbta
    public final void zza(String str) {
        ((zzcni) this.zza).zzaQ(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final boolean zzaA(boolean z, int i) {
        if (!this.zzc.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzaF)).booleanValue()) {
            return false;
        }
        if (this.zza.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.zza.getParent()).removeView((View) this.zza);
        }
        this.zza.zzaA(z, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final boolean zzaB() {
        return this.zza.zzaB();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final boolean zzaC() {
        return this.zza.zzaC();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final boolean zzaD() {
        return this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final boolean zzaE() {
        return this.zza.zzaE();
    }

    @Override // com.google.android.gms.internal.ads.zzcnu
    public final void zzaF(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) {
        this.zza.zzaF(zzcVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzcnu
    public final void zzaG(com.google.android.gms.ads.internal.util.zzbr zzbrVar, zzego zzegoVar, zzdxq zzdxqVar, zzfir zzfirVar, String str, String str2, int i) {
        this.zza.zzaG(zzbrVar, zzegoVar, zzdxqVar, zzfirVar, str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcnu
    public final void zzaH(boolean z, int i, boolean z2) {
        this.zza.zzaH(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcnu
    public final void zzaI(boolean z, int i, String str, boolean z2) {
        this.zza.zzaI(z, i, str, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcnu
    public final void zzaJ(boolean z, int i, String str, String str2, boolean z2) {
        this.zza.zzaJ(z, i, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzaa() {
        zzcmp zzcmpVar = this.zza;
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzt.zzr().zze()));
        hashMap.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzt.zzr().zza()));
        zzcni zzcniVar = (zzcni) zzcmpVar;
        hashMap.put("device_volume", String.valueOf(com.google.android.gms.ads.internal.util.zzab.zzb(zzcniVar.getContext())));
        zzcniVar.zzd("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzab(boolean z) {
        this.zza.zzab(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzac() {
        this.zza.zzac();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzad(String str, String str2, String str3) {
        this.zza.zzad(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzae() {
        this.zza.zzae();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzaf(String str, zzbpu zzbpuVar) {
        this.zza.zzaf(str, zzbpuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzag() {
        TextView textView = new TextView(getContext());
        com.google.android.gms.ads.internal.zzt.zzp();
        textView.setText(com.google.android.gms.ads.internal.util.zzs.zzv());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzah(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zza.zzah(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzai(zzcoe zzcoeVar) {
        this.zza.zzai(zzcoeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzaj(zzbdd zzbddVar) {
        this.zza.zzaj(zzbddVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzak(boolean z) {
        this.zza.zzak(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzal() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzam(Context context) {
        this.zza.zzam(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzan(boolean z) {
        this.zza.zzan(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzao(zzblp zzblpVar) {
        this.zza.zzao(zzblpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzap(boolean z) {
        this.zza.zzap(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzaq(zzblr zzblrVar) {
        this.zza.zzaq(zzblrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzar(IObjectWrapper iObjectWrapper) {
        this.zza.zzar(iObjectWrapper);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzas(int i) {
        this.zza.zzas(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzat(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zza.zzat(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzau(boolean z) {
        this.zza.zzau(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzav(boolean z) {
        this.zza.zzav(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzaw(String str, zzbpu zzbpuVar) {
        this.zza.zzaw(str, zzbpuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzax(String str, Predicate predicate) {
        this.zza.zzax(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final boolean zzay() {
        return this.zza.zzay();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final boolean zzaz() {
        return this.zza.zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzbta
    public final void zzb(String str, String str2) {
        this.zza.zzb("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbn() {
        this.zza.zzbn();
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbo() {
        this.zza.zzbo();
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final zzcin zzbp() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zzc(zzbbp zzbbpVar) {
        this.zza.zzc(zzbbpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzd(String str, Map map) {
        this.zza.zzd(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zze(String str, JSONObject jSONObject) {
        this.zza.zze(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final int zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final int zzg() {
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final int zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final int zzi() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcY)).booleanValue() ? this.zza.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final int zzj() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcY)).booleanValue() ? this.zza.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp, com.google.android.gms.internal.ads.zzcnq, com.google.android.gms.internal.ads.zzciy
    public final Activity zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbta
    public final void zzl(String str, JSONObject jSONObject) {
        ((zzcni) this.zza).zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcmp, com.google.android.gms.internal.ads.zzciy
    public final com.google.android.gms.ads.internal.zza zzm() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final zzbjo zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp, com.google.android.gms.internal.ads.zzciy
    public final zzbjp zzo() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp, com.google.android.gms.internal.ads.zzcny, com.google.android.gms.internal.ads.zzciy
    public final zzcgv zzp() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzdkn
    public final void zzq() {
        zzcmp zzcmpVar = this.zza;
        if (zzcmpVar != null) {
            zzcmpVar.zzq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final zzclb zzr(String str) {
        return this.zza.zzr(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp, com.google.android.gms.internal.ads.zzciy
    public final zzcnl zzs() {
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final String zzt() {
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final String zzu() {
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp, com.google.android.gms.internal.ads.zzciy
    public final void zzv(String str, zzclb zzclbVar) {
        this.zza.zzv(str, zzclbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final void zzw() {
        this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final void zzx(boolean z, long j) {
        this.zza.zzx(z, j);
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final void zzy() {
        this.zza.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final void zzz(int i) {
        this.zza.zzz(i);
    }
}
