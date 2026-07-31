package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzbgg extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzbfx zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;

    public zzbgg() {
        zzbfx zzbfxVar = new zzbfx();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzbfxVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbky.zzd.zze()).intValue();
        this.zzg = ((Long) zzbky.zza.zze()).intValue();
        this.zzh = ((Long) zzbky.zze.zze()).intValue();
        this.zzi = ((Long) zzbky.zzc.zze()).intValue();
        this.zzj = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaL)).intValue();
        this.zzk = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaM)).intValue();
        this.zzl = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaN)).intValue();
        this.zze = ((Long) zzbky.zzf.zze()).intValue();
        this.zzm = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaP);
        this.zzn = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaQ)).booleanValue();
        this.zzo = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaR)).booleanValue();
        ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaS)).booleanValue();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0042, code lost:
    
        if (r3.importance != 100) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0048, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004a, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0052, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0058, code lost:
    
        if (r0.isScreenOn() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x005a, code lost:
    
        r0 = com.google.android.gms.ads.internal.zzt.zzg().zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0062, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0064, code lost:
    
        r1 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("ContentFetchThread: no activity. Sleeping.");
        zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0073, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0078, code lost:
    
        if (r0.getWindow() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0082, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0084, code lost:
    
        r1 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0094, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0095, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzh().zzh(r0, "ContentFetchTask.extractContent");
        r2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0071, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00de, code lost:
    
        r1 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x006f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00cd, code lost:
    
        r1 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error in ContentFetchTask", r0);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e8 A[EXC_TOP_SPLITTER, LOOP:1: B:9:0x00e8->B:16:0x00e8, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        View view;
        while (true) {
            try {
                Context zze = com.google.android.gms.ads.internal.zzt.zzg().zze();
                if (zze != null) {
                    ActivityManager activityManager = (ActivityManager) zze.getSystemService("activity");
                    KeyguardManager keyguardManager = (KeyguardManager) zze.getSystemService("keyguard");
                    if (activityManager != null && keyguardManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ActivityManager.RunningAppProcessInfo next = it.next();
                            if (Process.myPid() == next.pid) {
                                break;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "ContentFetchTask.isInForeground");
            }
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("ContentFetchTask: sleeping");
            zze();
            Thread.sleep(this.zze * 1000);
            obj = this.zzc;
            synchronized (obj) {
                while (this.zzb) {
                    try {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzd("ContentFetchTask: waiting");
                        obj.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        if (view != null) {
            view.post(new zzbgc(this, view));
        }
        Thread.sleep(this.zze * 1000);
        obj = this.zzc;
        synchronized (obj) {
        }
    }

    public final void zza() {
        synchronized (this.zzc) {
            try {
                if (this.zza) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Content hash thread already started, quitting...");
                } else {
                    this.zza = true;
                    start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    final void zzb(View view) {
        try {
            zzbfw zzbfwVar = new zzbfw(this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzo);
            Context zze = com.google.android.gms.ads.internal.zzt.zzg().zze();
            if (zze != null) {
                String str = this.zzm;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = (String) view.getTag(zze.getResources().getIdentifier((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaO), "id", zze.getPackageName()));
                    if (str2 != null && str2.equals(str)) {
                        return;
                    }
                }
            }
            zzbgf zzc = zzc(view, zzbfwVar);
            zzbfwVar.zzi();
            if (zzc.zza == 0 && zzc.zzb == 0) {
                return;
            }
            int i = zzc.zzb;
            if (i == 0 && zzbfwVar.zzl() == 0) {
                return;
            }
            if (i == 0 && this.zzd.zza(zzbfwVar)) {
                return;
            }
            this.zzd.zzc(zzbfwVar);
        } catch (Exception e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception in fetchContentOnUIThread", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "ContentFetchTask.fetchContent");
        }
    }

    @VisibleForTesting
    final zzbgf zzc(@Nullable View view, zzbfw zzbfwVar) {
        if (view == null) {
            return new zzbgf(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new zzbgf(this, 0, 0);
            }
            zzbfwVar.zzg(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new zzbgf(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof zzclm)) {
            WebView webView = (WebView) view;
            zzbfwVar.zze();
            webView.post(new zzbge(this, zzbfwVar, webView, globalVisibleRect));
            return new zzbgf(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new zzbgf(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            zzbgf zzc = zzc(viewGroup.getChildAt(i3), zzbfwVar);
            i += zzc.zza;
            i2 += zzc.zzb;
        }
        return new zzbgf(this, i, i2);
    }

    @VisibleForTesting
    final void zzd(zzbfw zzbfwVar, WebView webView, String str, boolean z) {
        zzbfwVar.zzd();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.zzn || TextUtils.isEmpty(webView.getTitle())) {
                    zzbfwVar.zzf(optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    zzbfwVar.zzf(sb.toString(), z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzbfwVar.zza()) {
                this.zzd.zzb(zzbfwVar);
            }
        } catch (JSONException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Json string may be malformed.");
        } catch (Throwable th) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            this.zzb = true;
            StringBuilder sb = new StringBuilder(40);
            sb.append("ContentFetchThread: paused, pause = ");
            sb.append(true);
            String sb2 = sb.toString();
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2);
        }
    }
}
