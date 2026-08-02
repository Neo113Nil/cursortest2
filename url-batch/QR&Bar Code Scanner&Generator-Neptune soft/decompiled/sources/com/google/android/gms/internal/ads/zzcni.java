package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzfpz;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
final class zzcni extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcmp {
    public static final /* synthetic */ int zza = 0;
    private boolean zzA;
    private boolean zzB;
    private zzblr zzC;
    private zzblp zzD;
    private zzbdd zzE;
    private int zzF;
    private int zzG;
    private zzbjo zzH;
    private final zzbjo zzI;
    private zzbjo zzJ;
    private final zzbjp zzK;
    private int zzL;
    private int zzM;
    private int zzN;
    private com.google.android.gms.ads.internal.overlay.zzl zzO;
    private boolean zzP;
    private final com.google.android.gms.ads.internal.util.zzci zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private Map zzV;
    private final WindowManager zzW;
    private final zzbep zzX;
    private final zzcod zzb;
    private final zzape zzc;
    private final zzbkb zzd;
    private final zzcgv zze;
    private com.google.android.gms.ads.internal.zzl zzf;
    private final com.google.android.gms.ads.internal.zza zzg;
    private final DisplayMetrics zzh;
    private final float zzi;
    private zzfdk zzj;
    private zzfdn zzk;
    private boolean zzl;
    private boolean zzm;
    private zzcmw zzn;
    private com.google.android.gms.ads.internal.overlay.zzl zzo;
    private IObjectWrapper zzp;
    private zzcoe zzq;
    private final String zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private Boolean zzw;
    private boolean zzx;
    private final String zzy;
    private zzcnl zzz;

    protected zzcni(zzcod zzcodVar, zzcoe zzcoeVar, String str, boolean z, boolean z2, zzape zzapeVar, zzbkb zzbkbVar, zzcgv zzcgvVar, zzbjr zzbjrVar, com.google.android.gms.ads.internal.zzl zzlVar, com.google.android.gms.ads.internal.zza zzaVar, zzbep zzbepVar, zzfdk zzfdkVar, zzfdn zzfdnVar) {
        super(zzcodVar);
        zzfdn zzfdnVar2;
        this.zzl = false;
        this.zzm = false;
        this.zzx = true;
        this.zzy = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzb = zzcodVar;
        this.zzq = zzcoeVar;
        this.zzr = str;
        this.zzu = z;
        this.zzc = zzapeVar;
        this.zzd = zzbkbVar;
        this.zze = zzcgvVar;
        this.zzf = zzlVar;
        this.zzg = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzW = windowManager;
        com.google.android.gms.ads.internal.zzt.zzp();
        DisplayMetrics zzr = com.google.android.gms.ads.internal.util.zzs.zzr(windowManager);
        this.zzh = zzr;
        this.zzi = zzr.density;
        this.zzX = zzbepVar;
        this.zzj = zzfdkVar;
        this.zzk = zzfdnVar;
        this.zzQ = new com.google.android.gms.ads.internal.util.zzci(zzcodVar.zza(), this, this, null);
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.util.zze.zzh("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzt.zzp().zzc(zzcodVar, zzcgvVar.zza));
        com.google.android.gms.ads.internal.zzt.zzp();
        final Context context = getContext();
        com.google.android.gms.ads.internal.util.zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WebSettings webSettings = settings;
                Context context2 = context;
                zzfpz zzfpzVar = zzs.zza;
                webSettings.setDatabasePath(context2.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzaE)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return true;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        zzaU();
        addJavascriptInterface(new zzcnp(this, new zzcno(this), null), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbc();
        zzbjp zzbjpVar = new zzbjp(new zzbjr(true, "make_wv", this.zzr));
        this.zzK = zzbjpVar;
        zzbjpVar.zza().zzc(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbD)).booleanValue() && (zzfdnVar2 = this.zzk) != null && zzfdnVar2.zzb != null) {
            zzbjpVar.zza().zzd("gqi", this.zzk.zzb);
        }
        zzbjpVar.zza();
        zzbjo zzf = zzbjr.zzf();
        this.zzI = zzf;
        zzbjpVar.zzb("native:view_create", zzf);
        this.zzJ = null;
        this.zzH = null;
        com.google.android.gms.ads.internal.util.zzce.zza().zzb(zzcodVar);
        com.google.android.gms.ads.internal.zzt.zzo().zzq();
    }

    private final synchronized void zzaU() {
        zzfdk zzfdkVar = this.zzj;
        if (zzfdkVar != null && zzfdkVar.zzao) {
            com.google.android.gms.ads.internal.util.zze.zze("Disabling hardware acceleration on an overlay.");
            zzaW();
            return;
        }
        if (!this.zzu && !this.zzq.zzi()) {
            com.google.android.gms.ads.internal.util.zze.zze("Enabling hardware acceleration on an AdView.");
            zzaY();
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zze("Enabling hardware acceleration on an overlay.");
        zzaY();
    }

    private final synchronized void zzaV() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        com.google.android.gms.ads.internal.zzt.zzo().zzp();
    }

    private final synchronized void zzaW() {
        if (!this.zzv) {
            setLayerType(1, null);
        }
        this.zzv = true;
    }

    private final void zzaX(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z ? "0" : "1");
        zzd("onAdVisibilityChanged", hashMap);
    }

    private final synchronized void zzaY() {
        if (this.zzv) {
            setLayerType(0, null);
        }
        this.zzv = false;
    }

    private final synchronized void zzaZ(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "AdWebViewImpl.loadUrlUnsafe");
            com.google.android.gms.ads.internal.util.zze.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void zzba() {
        zzbjj.zza(this.zzK.zza(), this.zzI, "aeh2");
    }

    private final synchronized void zzbb() {
        Map map = this.zzV;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((zzclb) it.next()).release();
            }
        }
        this.zzV = null;
    }

    private final void zzbc() {
        zzbjp zzbjpVar = this.zzK;
        if (zzbjpVar == null) {
            return;
        }
        zzbjr zza2 = zzbjpVar.zza();
        zzbjh zzf = com.google.android.gms.ads.internal.zzt.zzo().zzf();
        if (zzf != null) {
            zzf.zzf(zza2);
        }
    }

    private final synchronized void zzbd() {
        Boolean zzk = com.google.android.gms.ads.internal.zzt.zzo().zzk();
        this.zzw = zzk;
        if (zzk == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaS(true);
            } catch (IllegalStateException unused) {
                zzaS(false);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcmp
    public final synchronized void destroy() {
        zzbc();
        this.zzQ.zza();
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzb();
            this.zzo.zzl();
            this.zzo = null;
        }
        this.zzp = null;
        this.zzn.zzy();
        this.zzE = null;
        this.zzf = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.zzt) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzy().zzd(this);
        zzbb();
        this.zzt = true;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzix)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
            zzW();
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
            com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
            zzaZ("about:blank");
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (!zzaB()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        zzcgp.zzl("#004 The webview is destroyed. Ignoring action.", null);
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.zzt) {
                    this.zzn.zzy();
                    com.google.android.gms.ads.internal.zzt.zzy().zzd(this);
                    zzbb();
                    zzaV();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcmp
    public final synchronized void loadData(String str, String str2, String str3) {
        if (zzaB()) {
            com.google.android.gms.ads.internal.util.zze.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcmp
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (zzaB()) {
            com.google.android.gms.ads.internal.util.zze.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcmp
    public final synchronized void loadUrl(String str) {
        if (zzaB()) {
            com.google.android.gms.ads.internal.util.zze.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "AdWebViewImpl.loadUrl");
            com.google.android.gms.ads.internal.util.zze.zzk("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcmw zzcmwVar = this.zzn;
        if (zzcmwVar != null) {
            zzcmwVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!zzaB()) {
            this.zzQ.zzc();
        }
        boolean z = this.zzA;
        zzcmw zzcmwVar = this.zzn;
        if (zzcmwVar != null && zzcmwVar.zzK()) {
            if (!this.zzB) {
                this.zzn.zza();
                this.zzn.zzb();
                this.zzB = true;
            }
            zzaT();
            z = true;
        }
        zzaX(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        zzcmw zzcmwVar;
        synchronized (this) {
            if (!zzaB()) {
                this.zzQ.zzd();
            }
            super.onDetachedFromWindow();
            if (this.zzB && (zzcmwVar = this.zzn) != null && zzcmwVar.zzK() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzn.zza();
                this.zzn.zzb();
                this.zzB = false;
            }
        }
        zzaX(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzJ(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            com.google.android.gms.ads.internal.util.zze.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (zzaB()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zzaT = zzaT();
        com.google.android.gms.ads.internal.overlay.zzl zzN = zzN();
        if (zzN == null || !zzaT) {
            return;
        }
        zzN.zzm();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01b8 A[Catch: all -> 0x01de, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x000d, B:11:0x0013, B:13:0x0017, B:16:0x0021, B:18:0x0029, B:21:0x002e, B:23:0x0036, B:25:0x0048, B:28:0x004d, B:30:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0075, B:40:0x0086, B:46:0x0080, B:49:0x0093, B:51:0x009b, B:53:0x00ad, B:56:0x00b2, B:58:0x00ce, B:59:0x00d6, B:62:0x00d2, B:63:0x00db, B:65:0x00e3, B:68:0x00f0, B:75:0x0114, B:77:0x011b, B:81:0x0123, B:83:0x0135, B:85:0x0143, B:88:0x0150, B:92:0x0155, B:94:0x01a0, B:95:0x01a4, B:97:0x01ab, B:102:0x01b8, B:104:0x01be, B:105:0x01c1, B:107:0x01c5, B:108:0x01ce, B:114:0x01d9), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0135 A[Catch: all -> 0x01de, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x000d, B:11:0x0013, B:13:0x0017, B:16:0x0021, B:18:0x0029, B:21:0x002e, B:23:0x0036, B:25:0x0048, B:28:0x004d, B:30:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0075, B:40:0x0086, B:46:0x0080, B:49:0x0093, B:51:0x009b, B:53:0x00ad, B:56:0x00b2, B:58:0x00ce, B:59:0x00d6, B:62:0x00d2, B:63:0x00db, B:65:0x00e3, B:68:0x00f0, B:75:0x0114, B:77:0x011b, B:81:0x0123, B:83:0x0135, B:85:0x0143, B:88:0x0150, B:92:0x0155, B:94:0x01a0, B:95:0x01a4, B:97:0x01ab, B:102:0x01b8, B:104:0x01be, B:105:0x01c1, B:107:0x01c5, B:108:0x01ce, B:114:0x01d9), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0155 A[Catch: all -> 0x01de, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x000d, B:11:0x0013, B:13:0x0017, B:16:0x0021, B:18:0x0029, B:21:0x002e, B:23:0x0036, B:25:0x0048, B:28:0x004d, B:30:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0075, B:40:0x0086, B:46:0x0080, B:49:0x0093, B:51:0x009b, B:53:0x00ad, B:56:0x00b2, B:58:0x00ce, B:59:0x00d6, B:62:0x00d2, B:63:0x00db, B:65:0x00e3, B:68:0x00f0, B:75:0x0114, B:77:0x011b, B:81:0x0123, B:83:0x0135, B:85:0x0143, B:88:0x0150, B:92:0x0155, B:94:0x01a0, B:95:0x01a4, B:97:0x01ab, B:102:0x01b8, B:104:0x01be, B:105:0x01c1, B:107:0x01c5, B:108:0x01ce, B:114:0x01d9), top: B:2:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final synchronized void onMeasure(int i, int i2) {
        int i3;
        zzcoe zzcoeVar;
        boolean z;
        int i4 = 0;
        if (zzaB()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.zzu && !this.zzq.zzf()) {
            if (this.zzq.zzh()) {
                super.onMeasure(i, i2);
                return;
            }
            if (this.zzq.zzj()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcX)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                zzcnl zzs = zzs();
                float zze = zzs != null ? zzs.zze() : 0.0f;
                if (zze == 0.0f) {
                    super.onMeasure(i, i2);
                    return;
                }
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                int i5 = (int) (size2 * zze);
                int i6 = (int) (size / zze);
                if (size2 == 0) {
                    if (i6 != 0) {
                        i5 = (int) (i6 * zze);
                        i4 = size;
                        size2 = i6;
                        setMeasuredDimension(Math.min(i5, i4), Math.min(i6, size2));
                        return;
                    }
                    size2 = 0;
                }
                if (size != 0) {
                    i4 = size;
                } else if (i5 != 0) {
                    i6 = (int) (i5 / zze);
                    i4 = i5;
                }
                setMeasuredDimension(Math.min(i5, i4), Math.min(i6, size2));
                return;
            }
            if (this.zzq.zzg()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdd)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                zzaf("/contentHeight", new zzcng(this));
                zzaQ("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f = this.zzh.density;
                int size3 = View.MeasureSpec.getSize(i);
                int i7 = this.zzG;
                setMeasuredDimension(size3, i7 != -1 ? (int) (i7 * f) : View.MeasureSpec.getSize(i2));
                return;
            }
            if (this.zzq.zzi()) {
                setMeasuredDimension(this.zzh.widthPixels, this.zzh.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i);
            int size4 = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size5 = View.MeasureSpec.getSize(i2);
            if (mode != Integer.MIN_VALUE && mode != 1073741824) {
                i3 = Integer.MAX_VALUE;
                int i8 = (mode2 != Integer.MIN_VALUE || mode2 == 1073741824) ? size5 : Integer.MAX_VALUE;
                zzcoeVar = this.zzq;
                if (zzcoeVar.zzb <= i3 && zzcoeVar.zza <= i8) {
                    z = false;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzez)).booleanValue()) {
                        zzcoe zzcoeVar2 = this.zzq;
                        int i9 = zzcoeVar2.zzb;
                        float f2 = this.zzi;
                        z &= ((float) i9) / f2 <= ((float) i3) / f2 && ((float) zzcoeVar2.zza) / f2 <= ((float) i8) / f2;
                    }
                    if (z) {
                        if (getVisibility() != 8) {
                            setVisibility(0);
                        }
                        if (!this.zzm) {
                            this.zzX.zzc(10002);
                            this.zzm = true;
                        }
                        zzcoe zzcoeVar3 = this.zzq;
                        setMeasuredDimension(zzcoeVar3.zzb, zzcoeVar3.zza);
                        return;
                    }
                    zzcoe zzcoeVar4 = this.zzq;
                    int i10 = zzcoeVar4.zzb;
                    float f3 = this.zzi;
                    com.google.android.gms.ads.internal.util.zze.zzj("Not enough space to show ad. Needs " + ((int) (i10 / f3)) + "x" + ((int) (zzcoeVar4.zza / f3)) + " dp, but only has " + ((int) (size4 / f3)) + "x" + ((int) (size5 / f3)) + " dp.");
                    if (getVisibility() != 8) {
                        setVisibility(4);
                    }
                    setMeasuredDimension(0, 0);
                    if (this.zzl) {
                        return;
                    }
                    this.zzX.zzc(10001);
                    this.zzl = true;
                    return;
                }
                z = true;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzez)).booleanValue()) {
                }
                if (z) {
                }
            }
            i3 = size4;
            if (mode2 != Integer.MIN_VALUE) {
            }
            zzcoeVar = this.zzq;
            if (zzcoeVar.zzb <= i3) {
                z = false;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzez)).booleanValue()) {
                }
                if (z) {
                }
            }
            z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzez)).booleanValue()) {
            }
            if (z) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcmp
    public final void onPause() {
        if (zzaB()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zze.zzh("Could not pause webview.", e);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcmp
    public final void onResume() {
        if (zzaB()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zze.zzh("Could not resume webview.", e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.zzn.zzK() || this.zzn.zzI()) {
            zzape zzapeVar = this.zzc;
            if (zzapeVar != null) {
                zzapeVar.zzd(motionEvent);
            }
            zzbkb zzbkbVar = this.zzd;
            if (zzbkbVar != null) {
                zzbkbVar.zzb(motionEvent);
            }
        } else {
            synchronized (this) {
                zzblr zzblrVar = this.zzC;
                if (zzblrVar != null) {
                    zzblrVar.zzd(motionEvent);
                }
            }
        }
        if (zzaB()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcmp
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcmw) {
            this.zzn = (zzcmw) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzaB()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zze.zzh("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final void zzA(int i) {
        this.zzM = i;
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final void zzB(boolean z) {
        this.zzn.zzB(false);
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final synchronized void zzC(int i) {
        this.zzL = i;
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final void zzD(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcmp, com.google.android.gms.internal.ads.zzciy
    public final synchronized void zzE(zzcnl zzcnlVar) {
        if (this.zzz != null) {
            com.google.android.gms.ads.internal.util.zze.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzz = zzcnlVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmp, com.google.android.gms.internal.ads.zzcmg
    public final zzfdk zzF() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final Context zzG() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp, com.google.android.gms.internal.ads.zzcnz
    public final View zzH() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final WebView zzI() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final WebViewClient zzJ() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp, com.google.android.gms.internal.ads.zzcnx
    public final zzape zzK() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final synchronized zzbdd zzL() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final synchronized zzblr zzM() {
        return this.zzC;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzN() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzO() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final /* synthetic */ zzcoc zzP() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp, com.google.android.gms.internal.ads.zzcnw
    public final synchronized zzcoe zzQ() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp, com.google.android.gms.internal.ads.zzcnm
    public final zzfdn zzR() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final synchronized IObjectWrapper zzS() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final zzfzp zzT() {
        zzbkb zzbkbVar = this.zzd;
        return zzbkbVar == null ? zzfzg.zzi(null) : zzbkbVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final synchronized String zzU() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzV(zzfdk zzfdkVar, zzfdn zzfdnVar) {
        this.zzj = zzfdkVar;
        this.zzk = zzfdnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final synchronized void zzW() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzaV();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcnh(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzX() {
        zzba();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zze.zza);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzY(int i) {
        if (i == 0) {
            zzbjj.zza(this.zzK.zza(), this.zzI, "aebb2");
        }
        zzba();
        this.zzK.zza();
        this.zzK.zza().zzd("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.zze.zza);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzZ() {
        if (this.zzH == null) {
            zzbjj.zza(this.zzK.zza(), this.zzI, "aes2");
            this.zzK.zza();
            zzbjo zzf = zzbjr.zzf();
            this.zzH = zzf;
            this.zzK.zzb("native:view_show", zzf);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zze.zza);
        zzd("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbta
    public final void zza(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final boolean zzaA(final boolean z, final int i) {
        destroy();
        this.zzX.zzb(new zzbeo() { // from class: com.google.android.gms.internal.ads.zzcnf
            @Override // com.google.android.gms.internal.ads.zzbeo
            public final void zza(zzbge zzbgeVar) {
                boolean z2 = z;
                int i2 = i;
                int i3 = zzcni.zza;
                zzbij zza2 = zzbik.zza();
                if (zza2.zzc() != z2) {
                    zza2.zza(z2);
                }
                zza2.zzb(i2);
                zzbgeVar.zzj((zzbik) zza2.zzam());
            }
        });
        this.zzX.zzc(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final synchronized boolean zzaB() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final synchronized boolean zzaC() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final boolean zzaD() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final synchronized boolean zzaE() {
        return this.zzx;
    }

    @Override // com.google.android.gms.internal.ads.zzcnu
    public final void zzaF(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) {
        this.zzn.zzr(zzcVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzcnu
    public final void zzaG(com.google.android.gms.ads.internal.util.zzbr zzbrVar, zzego zzegoVar, zzdxq zzdxqVar, zzfir zzfirVar, String str, String str2, int i) {
        this.zzn.zzs(zzbrVar, zzegoVar, zzdxqVar, zzfirVar, str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcnu
    public final void zzaH(boolean z, int i, boolean z2) {
        this.zzn.zzt(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcnu
    public final void zzaI(boolean z, int i, String str, boolean z2) {
        this.zzn.zzv(z, i, str, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcnu
    public final void zzaJ(boolean z, int i, String str, String str2, boolean z2) {
        this.zzn.zzw(z, i, str, str2, z2);
    }

    public final zzcmw zzaL() {
        return this.zzn;
    }

    final synchronized Boolean zzaM() {
        return this.zzw;
    }

    protected final synchronized void zzaP(String str, ValueCallback valueCallback) {
        if (zzaB()) {
            com.google.android.gms.ads.internal.util.zze.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    protected final void zzaQ(String str) {
        if (!PlatformVersion.isAtLeastKitKat()) {
            zzaR("javascript:".concat(str));
            return;
        }
        if (zzaM() == null) {
            zzbd();
        }
        if (zzaM().booleanValue()) {
            zzaP(str, null);
        } else {
            zzaR("javascript:".concat(str));
        }
    }

    protected final synchronized void zzaR(String str) {
        if (zzaB()) {
            com.google.android.gms.ads.internal.util.zze.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    final void zzaS(Boolean bool) {
        synchronized (this) {
            this.zzw = bool;
        }
        com.google.android.gms.ads.internal.zzt.zzo().zzu(bool);
    }

    public final boolean zzaT() {
        int i;
        int i2;
        if (!this.zzn.zzJ() && !this.zzn.zzK()) {
            return false;
        }
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        DisplayMetrics displayMetrics = this.zzh;
        int zzu = zzcgi.zzu(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        DisplayMetrics displayMetrics2 = this.zzh;
        int zzu2 = zzcgi.zzu(displayMetrics2, displayMetrics2.heightPixels);
        Activity zza2 = this.zzb.zza();
        if (zza2 == null || zza2.getWindow() == null) {
            i = zzu;
            i2 = zzu2;
        } else {
            com.google.android.gms.ads.internal.zzt.zzp();
            int[] zzN = com.google.android.gms.ads.internal.util.zzs.zzN(zza2);
            com.google.android.gms.ads.internal.client.zzaw.zzb();
            int zzu3 = zzcgi.zzu(this.zzh, zzN[0]);
            com.google.android.gms.ads.internal.client.zzaw.zzb();
            i2 = zzcgi.zzu(this.zzh, zzN[1]);
            i = zzu3;
        }
        int i3 = this.zzS;
        if (i3 == zzu && this.zzR == zzu2 && this.zzT == i && this.zzU == i2) {
            return false;
        }
        boolean z = (i3 == zzu && this.zzR == zzu2) ? false : true;
        this.zzS = zzu;
        this.zzR = zzu2;
        this.zzT = i;
        this.zzU = i2;
        new zzbyf(this, "").zzi(zzu, zzu2, i, i2, this.zzh.density, this.zzW.getDefaultDisplay().getRotation());
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzaa() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzab(boolean z) {
        this.zzn.zzh(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzac() {
        this.zzQ.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final synchronized void zzad(String str, String str2, String str3) {
        String str4;
        if (zzaB()) {
            com.google.android.gms.ads.internal.util.zze.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        String[] strArr = new String[1];
        String str5 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzN);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", str5);
            jSONObject.put("sdk", "Google Mobile Ads");
            jSONObject.put("sdkVersion", "12.4.51-000");
            str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzk("Unable to build MRAID_ENV", e);
            str4 = null;
        }
        strArr[0] = str4;
        super.loadDataWithBaseURL(str, zzcnv.zza(str2, strArr), "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzae() {
        if (this.zzJ == null) {
            this.zzK.zza();
            zzbjo zzf = zzbjr.zzf();
            this.zzJ = zzf;
            this.zzK.zzb("native:view_load", zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzaf(String str, zzbpu zzbpuVar) {
        zzcmw zzcmwVar = this.zzn;
        if (zzcmwVar != null) {
            zzcmwVar.zzx(str, zzbpuVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzag() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final synchronized void zzah(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzo = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final synchronized void zzai(zzcoe zzcoeVar) {
        this.zzq = zzcoeVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final synchronized void zzaj(zzbdd zzbddVar) {
        this.zzE = zzbddVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final synchronized void zzak(boolean z) {
        this.zzx = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzal() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzam(Context context) {
        this.zzb.setBaseContext(context);
        this.zzQ.zze(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final synchronized void zzan(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzw(this.zzn.zzJ(), z);
        } else {
            this.zzs = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final synchronized void zzao(zzblp zzblpVar) {
        this.zzD = zzblpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final synchronized void zzap(boolean z) {
        boolean z2 = this.zzu;
        this.zzu = z;
        zzaU();
        if (z != z2) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzO)).booleanValue() || !this.zzq.zzi()) {
                new zzbyf(this, "").zzk(true != z ? "default" : "expanded");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final synchronized void zzaq(zzblr zzblrVar) {
        this.zzC = zzblrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final synchronized void zzar(IObjectWrapper iObjectWrapper) {
        this.zzp = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final synchronized void zzas(int i) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzy(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final synchronized void zzat(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzO = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final synchronized void zzau(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar;
        int i = this.zzF + (true != z ? -1 : 1);
        this.zzF = i;
        if (i > 0 || (zzlVar = this.zzo) == null) {
            return;
        }
        zzlVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final synchronized void zzav(boolean z) {
        if (z) {
            setBackgroundColor(0);
        }
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzz(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzaw(String str, zzbpu zzbpuVar) {
        zzcmw zzcmwVar = this.zzn;
        if (zzcmwVar != null) {
            zzcmwVar.zzG(str, zzbpuVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final void zzax(String str, Predicate predicate) {
        zzcmw zzcmwVar = this.zzn;
        if (zzcmwVar != null) {
            zzcmwVar.zzH(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final synchronized boolean zzay() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp
    public final synchronized boolean zzaz() {
        return this.zzF > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbta
    public final void zzb(String str, String str2) {
        zzaQ(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbn() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.zzf;
        if (zzlVar != null) {
            zzlVar.zzbn();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbo() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.zzf;
        if (zzlVar != null) {
            zzlVar.zzbo();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final zzcin zzbp() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zzc(zzbbp zzbbpVar) {
        synchronized (this) {
            this.zzA = zzbbpVar.zzj;
        }
        zzaX(zzbbpVar.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzd(String str, Map map) {
        try {
            zze(str, com.google.android.gms.ads.internal.client.zzaw.zzb().zzi(map));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        com.google.android.gms.ads.internal.util.zze.zze("Dispatching AFMA event: ".concat(sb.toString()));
        zzaQ(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final int zzf() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final int zzg() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final synchronized int zzh() {
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final int zzi() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final int zzj() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcmp, com.google.android.gms.internal.ads.zzcnq, com.google.android.gms.internal.ads.zzciy
    public final Activity zzk() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbta
    public final void zzl(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcmp, com.google.android.gms.internal.ads.zzciy
    public final com.google.android.gms.ads.internal.zza zzm() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final zzbjo zzn() {
        return this.zzI;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp, com.google.android.gms.internal.ads.zzciy
    public final zzbjp zzo() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp, com.google.android.gms.internal.ads.zzcny, com.google.android.gms.internal.ads.zzciy
    public final zzcgv zzp() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdkn
    public final void zzq() {
        zzcmw zzcmwVar = this.zzn;
        if (zzcmwVar != null) {
            zzcmwVar.zzq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final synchronized zzclb zzr(String str) {
        Map map = this.zzV;
        if (map == null) {
            return null;
        }
        return (zzclb) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcmp, com.google.android.gms.internal.ads.zzciy
    public final synchronized zzcnl zzs() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final synchronized String zzt() {
        zzfdn zzfdnVar = this.zzk;
        if (zzfdnVar == null) {
            return null;
        }
        return zzfdnVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final synchronized String zzu() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzcmp, com.google.android.gms.internal.ads.zzciy
    public final synchronized void zzv(String str, zzclb zzclbVar) {
        if (this.zzV == null) {
            this.zzV = new HashMap();
        }
        this.zzV.put(str, zzclbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final void zzw() {
        com.google.android.gms.ads.internal.overlay.zzl zzN = zzN();
        if (zzN != null) {
            zzN.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final void zzx(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z ? "0" : "1");
        hashMap.put(TypedValues.TransitionType.S_DURATION, Long.toString(j));
        zzd("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final synchronized void zzy() {
        zzblp zzblpVar = this.zzD;
        if (zzblpVar != null) {
            final zzdsn zzdsnVar = (zzdsn) zzblpVar;
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsl
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdsn.this.zzd();
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciy
    public final void zzz(int i) {
        this.zzN = i;
    }
}
