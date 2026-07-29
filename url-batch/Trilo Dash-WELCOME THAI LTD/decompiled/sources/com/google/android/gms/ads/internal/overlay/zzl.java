package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbdl;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbnl;
import com.google.android.gms.internal.ads.zzbnn;
import com.google.android.gms.internal.ads.zzbwu;
import com.google.android.gms.internal.ads.zzbxt;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzcli;
import com.google.android.gms.internal.ads.zzclu;
import com.google.android.gms.internal.ads.zzcmt;
import com.google.android.gms.internal.ads.zzcmv;
import com.google.android.gms.internal.ads.zzcmx;
import com.google.android.gms.internal.ads.zzdcf;
import com.google.android.gms.internal.ads.zzdjf;
import com.google.android.gms.internal.ads.zzeev;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzl extends zzbxt implements zzaa {
    static final int zza = Color.argb(0, 0, 0, 0);
    protected final Activity zzb;
    AdOverlayInfoParcel zzc;
    zzcli zzd;
    zzh zze;
    zzr zzf;
    FrameLayout zzh;
    WebChromeClient.CustomViewCallback zzi;
    zzg zzl;
    private Runnable zzp;
    private boolean zzq;
    private boolean zzr;
    boolean zzg = false;
    boolean zzj = false;
    boolean zzk = false;
    boolean zzm = false;
    int zzn = 1;
    private final Object zzo = new Object();
    private boolean zzs = false;
    private boolean zzt = false;
    private boolean zzu = true;

    public zzl(Activity activity) {
        this.zzb = activity;
    }

    private final void zzG(Configuration configuration) {
        com.google.android.gms.ads.internal.zzj zzjVar;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (adOverlayInfoParcel == null || (zzjVar2 = adOverlayInfoParcel.zzo) == null || !zzjVar2.zzb) ? false : true;
        boolean zze = com.google.android.gms.ads.internal.zzt.zzq().zze(this.zzb, configuration);
        if ((!this.zzk || z3) && !zze) {
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
            if (adOverlayInfoParcel2 != null && (zzjVar = adOverlayInfoParcel2.zzo) != null && zzjVar.zzg) {
                z2 = true;
            }
        } else {
            z = false;
        }
        Window window = this.zzb.getWindow();
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzaY)).booleanValue()) {
            window.getDecorView().setSystemUiVisibility(z ? z2 ? 5894 : 5380 : 256);
            return;
        }
        if (!z) {
            window.addFlags(2048);
            window.clearFlags(1024);
            return;
        }
        window.addFlags(1024);
        window.clearFlags(2048);
        if (z2) {
            window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
        }
    }

    private static final void zzH(IObjectWrapper iObjectWrapper, View view) {
        if (iObjectWrapper == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzc(iObjectWrapper, view);
    }

    public final void zzA(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.zzb);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.zzh.addView(view, -1, -1);
        this.zzb.setContentView(this.zzh);
        this.zzr = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    protected final void zzB(boolean z) throws zzf {
        if (!this.zzr) {
            this.zzb.requestWindowFeature(1);
        }
        Window window = this.zzb.getWindow();
        if (window == null) {
            throw new zzf("Invalid activity, no window available.");
        }
        zzcli zzcliVar = this.zzc.zzd;
        zzcmv zzP = zzcliVar != null ? zzcliVar.zzP() : null;
        boolean z2 = zzP != null && zzP.zzJ();
        this.zzm = false;
        if (z2) {
            int i = this.zzc.zzj;
            if (i == 6) {
                r4 = this.zzb.getResources().getConfiguration().orientation == 1;
                this.zzm = r4;
            } else if (i == 7) {
                r4 = this.zzb.getResources().getConfiguration().orientation == 2;
                this.zzm = r4;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zze("Delay onShow to next orientation change: " + r4);
        zzy(this.zzc.zzj);
        window.setFlags(16777216, 16777216);
        com.google.android.gms.ads.internal.util.zze.zze("Hardware acceleration on the AdActivity window enabled.");
        if (this.zzk) {
            this.zzl.setBackgroundColor(zza);
        } else {
            this.zzl.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        this.zzb.setContentView(this.zzl);
        this.zzr = true;
        if (z) {
            try {
                com.google.android.gms.ads.internal.zzt.zzz();
                Activity activity = this.zzb;
                zzcli zzcliVar2 = this.zzc.zzd;
                zzcmx zzQ = zzcliVar2 != null ? zzcliVar2.zzQ() : null;
                zzcli zzcliVar3 = this.zzc.zzd;
                String zzU = zzcliVar3 != null ? zzcliVar3.zzU() : null;
                AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
                zzcfo zzcfoVar = adOverlayInfoParcel.zzm;
                zzcli zzcliVar4 = adOverlayInfoParcel.zzd;
                zzcli zza2 = zzclu.zza(activity, zzQ, zzU, true, z2, null, null, zzcfoVar, null, null, zzcliVar4 != null ? zzcliVar4.zzm() : null, zzbdl.zza(), null, null);
                this.zzd = zza2;
                zzcmv zzP2 = zza2.zzP();
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                zzbnl zzbnlVar = adOverlayInfoParcel2.zzp;
                zzbnn zzbnnVar = adOverlayInfoParcel2.zze;
                zzw zzwVar = adOverlayInfoParcel2.zzi;
                zzcli zzcliVar5 = adOverlayInfoParcel2.zzd;
                zzP2.zzL(null, zzbnlVar, null, zzbnnVar, zzwVar, true, null, zzcliVar5 != null ? zzcliVar5.zzP().zzd() : null, null, null, null, null, null, null, null, null);
                this.zzd.zzP().zzz(new zzcmt() { // from class: com.google.android.gms.ads.internal.overlay.zzd
                    @Override // com.google.android.gms.internal.ads.zzcmt
                    public final void zza(boolean z3) {
                        zzcli zzcliVar6 = zzl.this.zzd;
                        if (zzcliVar6 != null) {
                            zzcliVar6.zzZ();
                        }
                    }
                });
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                String str = adOverlayInfoParcel3.zzl;
                if (str != null) {
                    this.zzd.loadUrl(str);
                } else {
                    String str2 = adOverlayInfoParcel3.zzh;
                    if (str2 == null) {
                        throw new zzf("No URL or HTML to display in ad overlay.");
                    }
                    this.zzd.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str2, "text/html", "UTF-8", null);
                }
                zzcli zzcliVar6 = this.zzc.zzd;
                if (zzcliVar6 != null) {
                    zzcliVar6.zzat(this);
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.zze.zzh("Error obtaining webview.", e);
                throw new zzf("Could not obtain webview for the overlay.");
            }
        } else {
            zzcli zzcliVar7 = this.zzc.zzd;
            this.zzd = zzcliVar7;
            zzcliVar7.zzam(this.zzb);
        }
        this.zzd.zzah(this);
        zzcli zzcliVar8 = this.zzc.zzd;
        if (zzcliVar8 != null) {
            zzH(zzcliVar8.zzS(), this.zzl);
        }
        if (this.zzc.zzk != 5) {
            ViewParent parent = this.zzd.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.zzd.zzH());
            }
            if (this.zzk) {
                this.zzd.zzal();
            }
            this.zzl.addView(this.zzd.zzH(), -1, -1);
        }
        if (!z && !this.zzm) {
            zze();
        }
        AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
        if (adOverlayInfoParcel4.zzk == 5) {
            zzeev.zzh(this.zzb, this, adOverlayInfoParcel4.zzu, adOverlayInfoParcel4.zzr, adOverlayInfoParcel4.zzs, adOverlayInfoParcel4.zzt, adOverlayInfoParcel4.zzq, adOverlayInfoParcel4.zzv);
            return;
        }
        zzu(z2);
        if (this.zzd.zzay()) {
            zzw(z2, true);
        }
    }

    public final void zzC() {
        synchronized (this.zzo) {
            this.zzq = true;
            if (this.zzp != null) {
                com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(this.zzp);
                com.google.android.gms.ads.internal.util.zzs.zza.post(this.zzp);
            }
        }
    }

    protected final void zzD() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzo zzoVar;
        if (!this.zzb.isFinishing() || this.zzs) {
            return;
        }
        this.zzs = true;
        zzcli zzcliVar = this.zzd;
        if (zzcliVar != null) {
            zzcliVar.zzY(this.zzn - 1);
            synchronized (this.zzo) {
                if (!this.zzq && this.zzd.zzaz()) {
                    if (((Boolean) zzay.zzc().zzb(zzbhy.zzdP)).booleanValue() && !this.zzt && (adOverlayInfoParcel = this.zzc) != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
                        zzoVar.zzbC();
                    }
                    this.zzp = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zze
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzl.this.zzc();
                        }
                    };
                    com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(this.zzp, ((Long) zzay.zzc().zzb(zzbhy.zzaR)).longValue());
                    return;
                }
            }
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final boolean zzE() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzhr)).booleanValue() && this.zzd.canGoBack()) {
            this.zzd.goBack();
            return false;
        }
        boolean zzaE = this.zzd.zzaE();
        if (!zzaE) {
            this.zzd.zzd("onbackblocked", Collections.emptyMap());
        }
        return zzaE;
    }

    public final void zzb() {
        this.zzn = 3;
        this.zzb.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        this.zzb.overridePendingTransition(0, 0);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zzbJ() {
        this.zzn = 2;
        this.zzb.finish();
    }

    final void zzc() {
        zzcli zzcliVar;
        zzo zzoVar;
        if (this.zzt) {
            return;
        }
        this.zzt = true;
        zzcli zzcliVar2 = this.zzd;
        if (zzcliVar2 != null) {
            this.zzl.removeView(zzcliVar2.zzH());
            zzh zzhVar = this.zze;
            if (zzhVar != null) {
                this.zzd.zzam(zzhVar.zzd);
                this.zzd.zzap(false);
                ViewGroup viewGroup = this.zze.zzc;
                View zzH = this.zzd.zzH();
                zzh zzhVar2 = this.zze;
                viewGroup.addView(zzH, zzhVar2.zza, zzhVar2.zzb);
                this.zze = null;
            } else if (this.zzb.getApplicationContext() != null) {
                this.zzd.zzam(this.zzb.getApplicationContext());
            }
            this.zzd = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzf(this.zzn);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 == null || (zzcliVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        zzH(zzcliVar.zzS(), this.zzc.zzd.zzH());
    }

    public final void zzd() {
        this.zzl.zzb = true;
    }

    protected final void zze() {
        this.zzd.zzZ();
    }

    public final void zzf() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzy(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzr = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzg(int i, int i2, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzh() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzj(IObjectWrapper iObjectWrapper) {
        zzG((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[Catch: zzf -> 0x00f5, TryCatch #0 {zzf -> 0x00f5, blocks: (B:8:0x0017, B:10:0x0025, B:12:0x002e, B:13:0x0030, B:15:0x0038, B:16:0x0046, B:18:0x004d, B:21:0x005a, B:23:0x005e, B:25:0x0063, B:27:0x0071, B:29:0x0075, B:31:0x007b, B:32:0x007e, B:34:0x0084, B:35:0x0087, B:37:0x008d, B:39:0x0091, B:40:0x0094, B:42:0x009a, B:43:0x009d, B:50:0x00cc, B:53:0x00d0, B:54:0x00d7, B:55:0x00d8, B:57:0x00dc, B:59:0x00e9, B:61:0x0054, B:63:0x0058, B:64:0x006d, B:65:0x00ed, B:66:0x00f4), top: B:7:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e9 A[Catch: zzf -> 0x00f5, TryCatch #0 {zzf -> 0x00f5, blocks: (B:8:0x0017, B:10:0x0025, B:12:0x002e, B:13:0x0030, B:15:0x0038, B:16:0x0046, B:18:0x004d, B:21:0x005a, B:23:0x005e, B:25:0x0063, B:27:0x0071, B:29:0x0075, B:31:0x007b, B:32:0x007e, B:34:0x0084, B:35:0x0087, B:37:0x008d, B:39:0x0091, B:40:0x0094, B:42:0x009a, B:43:0x009d, B:50:0x00cc, B:53:0x00d0, B:54:0x00d7, B:55:0x00d8, B:57:0x00dc, B:59:0x00e9, B:61:0x0054, B:63:0x0058, B:64:0x006d, B:65:0x00ed, B:66:0x00f4), top: B:7:0x0017 }] */
    @Override // com.google.android.gms.internal.ads.zzbxu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zzk(Bundle bundle) {
        int i;
        this.zzb.requestWindowFeature(1);
        this.zzj = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel zza2 = AdOverlayInfoParcel.zza(this.zzb.getIntent());
            this.zzc = zza2;
            if (zza2 == null) {
                throw new zzf("Could not get info for ad overlay.");
            }
            if (zza2.zzm.zzc > 7500000) {
                this.zzn = 4;
            }
            if (this.zzb.getIntent() != null) {
                this.zzu = this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
            com.google.android.gms.ads.internal.zzj zzjVar = adOverlayInfoParcel.zzo;
            if (zzjVar != null) {
                boolean z = zzjVar.zza;
                this.zzk = z;
                if (z) {
                    if (adOverlayInfoParcel.zzk != 5 && zzjVar.zzf != -1) {
                        new zzk(this, null).zzb();
                    }
                }
                if (bundle == null) {
                    if (this.zzu) {
                        zzdcf zzdcfVar = this.zzc.zzx;
                        if (zzdcfVar != null) {
                            zzdcfVar.zzd();
                        }
                        zzo zzoVar = this.zzc.zzc;
                        if (zzoVar != null) {
                            zzoVar.zzb();
                        }
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                    if (adOverlayInfoParcel2.zzk != 1) {
                        com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel2.zzb;
                        if (zzaVar != null) {
                            zzaVar.onAdClicked();
                        }
                        zzdjf zzdjfVar = this.zzc.zzy;
                        if (zzdjfVar != null) {
                            zzdjfVar.zzq();
                        }
                    }
                }
                Activity activity = this.zzb;
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                zzg zzgVar = new zzg(activity, adOverlayInfoParcel3.zzn, adOverlayInfoParcel3.zzm.zza, adOverlayInfoParcel3.zzw);
                this.zzl = zzgVar;
                zzgVar.setId(1000);
                com.google.android.gms.ads.internal.zzt.zzq().zzi(this.zzb);
                AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
                i = adOverlayInfoParcel4.zzk;
                if (i == 1) {
                    zzB(false);
                    return;
                }
                if (i == 2) {
                    this.zze = new zzh(adOverlayInfoParcel4.zzd);
                    zzB(false);
                    return;
                } else if (i == 3) {
                    zzB(true);
                    return;
                } else {
                    if (i != 5) {
                        throw new zzf("Could not determine ad overlay type.");
                    }
                    zzB(false);
                    return;
                }
            }
            if (adOverlayInfoParcel.zzk == 5) {
                this.zzk = true;
                if (adOverlayInfoParcel.zzk != 5) {
                    new zzk(this, null).zzb();
                }
                if (bundle == null) {
                }
                Activity activity2 = this.zzb;
                AdOverlayInfoParcel adOverlayInfoParcel32 = this.zzc;
                zzg zzgVar2 = new zzg(activity2, adOverlayInfoParcel32.zzn, adOverlayInfoParcel32.zzm.zza, adOverlayInfoParcel32.zzw);
                this.zzl = zzgVar2;
                zzgVar2.setId(1000);
                com.google.android.gms.ads.internal.zzt.zzq().zzi(this.zzb);
                AdOverlayInfoParcel adOverlayInfoParcel42 = this.zzc;
                i = adOverlayInfoParcel42.zzk;
                if (i == 1) {
                }
            } else {
                this.zzk = false;
                if (bundle == null) {
                }
                Activity activity22 = this.zzb;
                AdOverlayInfoParcel adOverlayInfoParcel322 = this.zzc;
                zzg zzgVar22 = new zzg(activity22, adOverlayInfoParcel322.zzn, adOverlayInfoParcel322.zzm.zza, adOverlayInfoParcel322.zzw);
                this.zzl = zzgVar22;
                zzgVar22.setId(1000);
                com.google.android.gms.ads.internal.zzt.zzq().zzi(this.zzb);
                AdOverlayInfoParcel adOverlayInfoParcel422 = this.zzc;
                i = adOverlayInfoParcel422.zzk;
                if (i == 1) {
                }
            }
        } catch (zzf e) {
            com.google.android.gms.ads.internal.util.zze.zzj(e.getMessage());
            this.zzn = 4;
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzl() {
        zzcli zzcliVar = this.zzd;
        if (zzcliVar != null) {
            try {
                this.zzl.removeView(zzcliVar.zzH());
            } catch (NullPointerException unused) {
            }
        }
        zzD();
    }

    public final void zzm() {
        if (this.zzm) {
            this.zzm = false;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzn() {
        zzo zzoVar;
        zzf();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbr();
        }
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzdR)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzp() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbK();
        }
        zzG(this.zzb.getResources().getConfiguration());
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzdR)).booleanValue()) {
            return;
        }
        zzcli zzcliVar = this.zzd;
        if (zzcliVar == null || zzcliVar.zzaB()) {
            com.google.android.gms.ads.internal.util.zze.zzj("The webview does not exist. Ignoring action.");
        } else {
            this.zzd.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzq(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzr() {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzdR)).booleanValue()) {
            zzcli zzcliVar = this.zzd;
            if (zzcliVar == null || zzcliVar.zzaB()) {
                com.google.android.gms.ads.internal.util.zze.zzj("The webview does not exist. Ignoring action.");
            } else {
                this.zzd.onResume();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzs() {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzdR)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzt() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzoVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzoVar.zze();
    }

    public final void zzu(boolean z) {
        int intValue = ((Integer) zzay.zzc().zzb(zzbhy.zzdT)).intValue();
        boolean z2 = ((Boolean) zzay.zzc().zzb(zzbhy.zzaU)).booleanValue() || z;
        zzq zzqVar = new zzq();
        zzqVar.zzd = 50;
        zzqVar.zza = true != z2 ? 0 : intValue;
        zzqVar.zzb = true != z2 ? intValue : 0;
        zzqVar.zzc = intValue;
        this.zzf = new zzr(this.zzb, zzqVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        zzw(z, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzv() {
        this.zzr = true;
    }

    public final void zzw(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzj zzjVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) zzay.zzc().zzb(zzbhy.zzaS)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzjVar2 = adOverlayInfoParcel2.zzo) != null && zzjVar2.zzh;
        boolean z5 = ((Boolean) zzay.zzc().zzb(zzbhy.zzaT)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzjVar = adOverlayInfoParcel.zzo) != null && zzjVar.zzi;
        if (z && z2 && z4 && !z5) {
            new zzbwu(this.zzd, "useCustomClose").zzg("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzr zzrVar = this.zzf;
        if (zzrVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzrVar.zzb(z3);
        }
    }

    public final void zzx() {
        this.zzl.removeView(this.zzf);
        zzu(true);
    }

    public final void zzy(int i) {
        if (this.zzb.getApplicationInfo().targetSdkVersion >= ((Integer) zzay.zzc().zzb(zzbhy.zzeU)).intValue()) {
            if (this.zzb.getApplicationInfo().targetSdkVersion <= ((Integer) zzay.zzc().zzb(zzbhy.zzeV)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) zzay.zzc().zzb(zzbhy.zzeW)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) zzay.zzc().zzb(zzbhy.zzeX)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzb.setRequestedOrientation(i);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzs(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzz(boolean z) {
        if (z) {
            this.zzl.setBackgroundColor(0);
        } else {
            this.zzl.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
    }
}
