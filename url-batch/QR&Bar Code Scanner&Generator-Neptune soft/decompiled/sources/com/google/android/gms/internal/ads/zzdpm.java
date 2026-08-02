package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdpm extends zzbmh implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdql {
    public static final zzfvn zza = zzfvn.zzr("2011", "1009", "3010");
    private final String zzb;
    private FrameLayout zzd;
    private FrameLayout zze;
    private final zzfzq zzf;
    private View zzg;
    private zzdol zzi;
    private zzbbr zzj;
    private zzbmb zzl;
    private boolean zzm;
    private Map zzc = new HashMap();
    private IObjectWrapper zzk = null;
    private boolean zzn = false;
    private final int zzh = 223104000;

    public zzdpm(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        this.zzd = frameLayout;
        this.zze = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        String str = "3012";
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
        }
        this.zzb = str;
        com.google.android.gms.ads.internal.zzt.zzx();
        zzchp.zza(frameLayout, this);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzchp.zzb(frameLayout, this);
        this.zzf = zzchc.zze;
        this.zzj = new zzbbr(this.zzd.getContext(), this.zzd);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void zzs(String str) {
        DisplayMetrics displayMetrics;
        FrameLayout frameLayout = new FrameLayout(this.zze.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = this.zze.getContext();
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        if (!TextUtils.isEmpty(str)) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Resources resources = context.getResources();
            if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                try {
                    byte[] decode = Base64.decode(str, 0);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                    bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    bitmapDrawable.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
                    frameLayout.setBackground(bitmapDrawable);
                } catch (IllegalArgumentException e) {
                    zzcgp.zzk("Encountered invalid base64 watermark.", e);
                }
            }
        }
        this.zze.addView(frameLayout);
    }

    private final synchronized void zzt() {
        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpl
            @Override // java.lang.Runnable
            public final void run() {
                zzdpm.this.zzr();
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdol zzdolVar = this.zzi;
        if (zzdolVar != null) {
            zzdolVar.zzk();
            this.zzi.zzx(view, this.zzd, zzl(), zzm(), false);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdol zzdolVar = this.zzi;
        if (zzdolVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdolVar.zzv(frameLayout, zzl(), zzm(), zzdol.zzP(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdol zzdolVar = this.zzi;
        if (zzdolVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdolVar.zzv(frameLayout, zzl(), zzm(), zzdol.zzP(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdol zzdolVar = this.zzi;
        if (zzdolVar != null) {
            zzdolVar.zzD(view, motionEvent, this.zzd);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final synchronized IObjectWrapper zzb(String str) {
        return ObjectWrapper.wrap(zzg(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final synchronized void zzbA(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof zzdol)) {
            com.google.android.gms.ads.internal.util.zze.zzj("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        zzdol zzdolVar = this.zzi;
        if (zzdolVar != null) {
            zzdolVar.zzL(this);
        }
        zzt();
        zzdol zzdolVar2 = (zzdol) unwrap;
        this.zzi = zzdolVar2;
        zzdolVar2.zzK(this);
        this.zzi.zzC(this.zzd);
        this.zzi.zzi(this.zze);
        if (this.zzm) {
            this.zzi.zza().zzb(this.zzl);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdc)).booleanValue() || TextUtils.isEmpty(this.zzi.zzd())) {
            return;
        }
        zzs(this.zzi.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final synchronized void zzbw(String str, IObjectWrapper iObjectWrapper) {
        zzq(str, (View) ObjectWrapper.unwrap(iObjectWrapper), true);
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final synchronized void zzbx(IObjectWrapper iObjectWrapper) {
        this.zzi.zzF((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final synchronized void zzby(zzbmb zzbmbVar) {
        if (this.zzn) {
            return;
        }
        this.zzm = true;
        this.zzl = zzbmbVar;
        zzdol zzdolVar = this.zzi;
        if (zzdolVar != null) {
            zzdolVar.zza().zzb(zzbmbVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final synchronized void zzbz(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        this.zzk = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final synchronized void zzc() {
        if (this.zzn) {
            return;
        }
        zzdol zzdolVar = this.zzi;
        if (zzdolVar != null) {
            zzdolVar.zzL(this);
            this.zzi = null;
        }
        this.zzc.clear();
        this.zzd.removeAllViews();
        this.zze.removeAllViews();
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzg = null;
        this.zzj = null;
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zzd(IObjectWrapper iObjectWrapper) {
        onTouch(this.zzd, (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final synchronized void zze(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzdql
    public final /* synthetic */ View zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdql
    public final synchronized View zzg(String str) {
        if (this.zzn) {
            return null;
        }
        WeakReference weakReference = (WeakReference) this.zzc.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdql
    public final FrameLayout zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdql
    public final zzbbr zzi() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzdql
    public final IObjectWrapper zzj() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzdql
    public final synchronized String zzk() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdql
    public final synchronized Map zzl() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdql
    public final synchronized Map zzm() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdql
    public final synchronized Map zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdql
    public final synchronized JSONObject zzo() {
        zzdol zzdolVar = this.zzi;
        if (zzdolVar == null) {
            return null;
        }
        return zzdolVar.zzf(this.zzd, zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzdql
    public final synchronized JSONObject zzp() {
        zzdol zzdolVar = this.zzi;
        if (zzdolVar == null) {
            return null;
        }
        return zzdolVar.zzg(this.zzd, zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzdql
    public final synchronized void zzq(String str, View view, boolean z) {
        if (this.zzn) {
            return;
        }
        if (view == null) {
            this.zzc.remove(str);
            return;
        }
        this.zzc.put(str, new WeakReference(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            if (com.google.android.gms.ads.internal.util.zzbx.zzi(this.zzh)) {
                view.setOnTouchListener(this);
            }
            view.setClickable(true);
            view.setOnClickListener(this);
        }
    }

    final /* synthetic */ void zzr() {
        if (this.zzg == null) {
            View view = new View(this.zzd.getContext());
            this.zzg = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.zzd != this.zzg.getParent()) {
            this.zzd.addView(this.zzg);
        }
    }
}
