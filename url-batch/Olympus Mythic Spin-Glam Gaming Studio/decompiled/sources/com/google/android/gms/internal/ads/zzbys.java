package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
import com.ironsource.X3;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzbys extends zzbyy {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzclm zzj;
    private final Activity zzk;
    private zzcnw zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbyz zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        CollectionUtils.setOf(X3.e.c, X3.e.b, "top-center", "center", X3.e.e, X3.e.d, "bottom-center");
    }

    public zzbys(zzclm zzclmVar, zzbyz zzbyzVar) {
        super(zzclmVar, n.g);
        this.zza = X3.e.b;
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzclmVar;
        this.zzk = zzclmVar.zzj();
        this.zzo = zzbyzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzf(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmw)).booleanValue()) {
            this.zzq.removeView((View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((View) this.zzj);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmx)).booleanValue()) {
            View view = (View) this.zzj;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmy)).booleanValue()) {
                try {
                    ViewGroup viewGroup2 = this.zzr;
                    zzclm zzclmVar = this.zzj;
                    viewGroup2.addView((View) zzclmVar);
                    zzclmVar.zzaf(this.zzl);
                } catch (IllegalStateException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to add webview back to view hierarchy.", e);
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "MraidCallResizeHandler.collapseInternal");
                }
            } else {
                ViewGroup viewGroup3 = this.zzr;
                zzclm zzclmVar2 = this.zzj;
                viewGroup3.addView((View) zzclmVar2);
                zzclmVar2.zzaf(this.zzl);
            }
        }
        if (z) {
            zzk("default");
            zzbyz zzbyzVar = this.zzo;
            if (zzbyzVar != null) {
                zzbyzVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ef A[Catch: all -> 0x0014, TryCatch #1 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:10:0x0017, B:12:0x001f, B:13:0x0024, B:15:0x0026, B:17:0x0030, B:18:0x0035, B:20:0x0037, B:22:0x003d, B:23:0x0042, B:25:0x0044, B:27:0x0052, B:28:0x0063, B:30:0x0071, B:31:0x0082, B:33:0x0090, B:34:0x00a1, B:36:0x00af, B:37:0x00c0, B:39:0x00ce, B:40:0x00dc, B:42:0x00ea, B:43:0x00ec, B:45:0x00f0, B:47:0x00f4, B:49:0x00fa, B:52:0x0102, B:56:0x0124, B:62:0x0130, B:64:0x0260, B:65:0x0265, B:67:0x0267, B:69:0x0284, B:71:0x0290, B:72:0x02c8, B:88:0x037d, B:89:0x03ac, B:91:0x03c4, B:92:0x03e0, B:94:0x03e8, B:95:0x03ef, B:96:0x0415, B:100:0x0418, B:102:0x0446, B:103:0x0458, B:105:0x0384, B:106:0x038b, B:107:0x0392, B:108:0x0399, B:109:0x039f, B:110:0x03a6, B:127:0x02c5, B:128:0x045a, B:129:0x045f, B:131:0x0139, B:133:0x013d, B:146:0x0192, B:147:0x019c, B:149:0x01ef, B:151:0x01f4, B:153:0x01f9, B:156:0x01a0, B:157:0x01aa, B:158:0x01b1, B:159:0x01bd, B:160:0x01c5, B:161:0x01d9, B:162:0x01e5, B:180:0x0201, B:181:0x0210, B:185:0x023a, B:188:0x024a, B:189:0x0240, B:191:0x0248, B:192:0x0230, B:194:0x0236, B:196:0x024f, B:197:0x0257, B:198:0x0461, B:199:0x0466, B:201:0x0468, B:202:0x046d), top: B:3:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0260 A[Catch: all -> 0x0014, TryCatch #1 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:10:0x0017, B:12:0x001f, B:13:0x0024, B:15:0x0026, B:17:0x0030, B:18:0x0035, B:20:0x0037, B:22:0x003d, B:23:0x0042, B:25:0x0044, B:27:0x0052, B:28:0x0063, B:30:0x0071, B:31:0x0082, B:33:0x0090, B:34:0x00a1, B:36:0x00af, B:37:0x00c0, B:39:0x00ce, B:40:0x00dc, B:42:0x00ea, B:43:0x00ec, B:45:0x00f0, B:47:0x00f4, B:49:0x00fa, B:52:0x0102, B:56:0x0124, B:62:0x0130, B:64:0x0260, B:65:0x0265, B:67:0x0267, B:69:0x0284, B:71:0x0290, B:72:0x02c8, B:88:0x037d, B:89:0x03ac, B:91:0x03c4, B:92:0x03e0, B:94:0x03e8, B:95:0x03ef, B:96:0x0415, B:100:0x0418, B:102:0x0446, B:103:0x0458, B:105:0x0384, B:106:0x038b, B:107:0x0392, B:108:0x0399, B:109:0x039f, B:110:0x03a6, B:127:0x02c5, B:128:0x045a, B:129:0x045f, B:131:0x0139, B:133:0x013d, B:146:0x0192, B:147:0x019c, B:149:0x01ef, B:151:0x01f4, B:153:0x01f9, B:156:0x01a0, B:157:0x01aa, B:158:0x01b1, B:159:0x01bd, B:160:0x01c5, B:161:0x01d9, B:162:0x01e5, B:180:0x0201, B:181:0x0210, B:185:0x023a, B:188:0x024a, B:189:0x0240, B:191:0x0248, B:192:0x0230, B:194:0x0236, B:196:0x024f, B:197:0x0257, B:198:0x0461, B:199:0x0466, B:201:0x0468, B:202:0x046d), top: B:3:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0267 A[Catch: all -> 0x0014, TryCatch #1 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:10:0x0017, B:12:0x001f, B:13:0x0024, B:15:0x0026, B:17:0x0030, B:18:0x0035, B:20:0x0037, B:22:0x003d, B:23:0x0042, B:25:0x0044, B:27:0x0052, B:28:0x0063, B:30:0x0071, B:31:0x0082, B:33:0x0090, B:34:0x00a1, B:36:0x00af, B:37:0x00c0, B:39:0x00ce, B:40:0x00dc, B:42:0x00ea, B:43:0x00ec, B:45:0x00f0, B:47:0x00f4, B:49:0x00fa, B:52:0x0102, B:56:0x0124, B:62:0x0130, B:64:0x0260, B:65:0x0265, B:67:0x0267, B:69:0x0284, B:71:0x0290, B:72:0x02c8, B:88:0x037d, B:89:0x03ac, B:91:0x03c4, B:92:0x03e0, B:94:0x03e8, B:95:0x03ef, B:96:0x0415, B:100:0x0418, B:102:0x0446, B:103:0x0458, B:105:0x0384, B:106:0x038b, B:107:0x0392, B:108:0x0399, B:109:0x039f, B:110:0x03a6, B:127:0x02c5, B:128:0x045a, B:129:0x045f, B:131:0x0139, B:133:0x013d, B:146:0x0192, B:147:0x019c, B:149:0x01ef, B:151:0x01f4, B:153:0x01f9, B:156:0x01a0, B:157:0x01aa, B:158:0x01b1, B:159:0x01bd, B:160:0x01c5, B:161:0x01d9, B:162:0x01e5, B:180:0x0201, B:181:0x0210, B:185:0x023a, B:188:0x024a, B:189:0x0240, B:191:0x0248, B:192:0x0230, B:194:0x0236, B:196:0x024f, B:197:0x0257, B:198:0x0461, B:199:0x0466, B:201:0x0468, B:202:0x046d), top: B:3:0x0009, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Map map) {
        char c;
        int i;
        char c2;
        int i2;
        int i3;
        int i4;
        int i5;
        synchronized (this.zzi) {
            try {
                Activity activity = this.zzk;
                if (activity == null) {
                    zzg("Not an activity context. Cannot resize.");
                    return;
                }
                zzclm zzclmVar = this.zzj;
                if (zzclmVar.zzN() == null) {
                    zzg("Webview is not yet available, size is not set.");
                    return;
                }
                if (zzclmVar.zzN().zzg()) {
                    zzg("Is interstitial. Cannot resize an interstitial.");
                    return;
                }
                if (zzclmVar.zzW()) {
                    zzg("Cannot resize an expanded banner.");
                    return;
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    this.zzh = com.google.android.gms.ads.internal.util.zzs.zzS((String) map.get("width"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    this.zze = com.google.android.gms.ads.internal.util.zzs.zzS((String) map.get("height"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    this.zzf = com.google.android.gms.ads.internal.util.zzs.zzS((String) map.get("offsetX"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    this.zzg = com.google.android.gms.ads.internal.util.zzs.zzS((String) map.get("offsetY"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                    this.zzb = Boolean.parseBoolean((String) map.get("allowOffscreen"));
                }
                String str = (String) map.get("customClosePosition");
                if (!TextUtils.isEmpty(str)) {
                    this.zza = str;
                }
                if (this.zzh < 0 || this.zze < 0) {
                    zzg("Invalid width and height options. Cannot resize.");
                    return;
                }
                Window window = activity.getWindow();
                if (window != null && window.getDecorView() != null) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    int[] zzaa = com.google.android.gms.ads.internal.util.zzs.zzaa(activity);
                    com.google.android.gms.ads.internal.zzt.zzc();
                    int[] zzW = com.google.android.gms.ads.internal.util.zzs.zzW(activity);
                    int i6 = zzaa[0];
                    int i7 = zzaa[1];
                    int i8 = this.zzh;
                    int[] iArr = null;
                    if (i8 >= 50 && i8 <= i6) {
                        int i9 = this.zze;
                        if (i9 >= 50 && i9 <= i7) {
                            if (i9 == i7 && i8 == i6) {
                                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot resize to a full-screen ad.");
                            } else {
                                boolean z = this.zzb;
                                if (z) {
                                    String str2 = this.zza;
                                    switch (str2.hashCode()) {
                                        case -1364013995:
                                            if (str2.equals("center")) {
                                                c2 = 2;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1012429441:
                                            if (str2.equals(X3.e.c)) {
                                                c2 = 0;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -655373719:
                                            if (str2.equals(X3.e.e)) {
                                                c2 = 3;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1163912186:
                                            if (str2.equals(X3.e.d)) {
                                                c2 = 5;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1288627767:
                                            if (str2.equals("bottom-center")) {
                                                c2 = 4;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1755462605:
                                            if (str2.equals("top-center")) {
                                                c2 = 1;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        default:
                                            c2 = 65535;
                                            break;
                                    }
                                    if (c2 == 0) {
                                        i2 = this.zzc + this.zzf;
                                        i3 = this.zzd;
                                    } else if (c2 != 1) {
                                        if (c2 != 2) {
                                            if (c2 == 3) {
                                                i2 = this.zzc + this.zzf;
                                                i5 = this.zzd;
                                            } else if (c2 == 4) {
                                                i2 = ((this.zzc + this.zzf) + (i8 >> 1)) - 25;
                                                i5 = this.zzd;
                                            } else if (c2 != 5) {
                                                i2 = ((this.zzc + this.zzf) + i8) - 50;
                                                i3 = this.zzd;
                                            } else {
                                                i2 = ((this.zzc + this.zzf) + i8) - 50;
                                                i5 = this.zzd;
                                            }
                                            i4 = ((i5 + this.zzg) + i9) - 50;
                                        } else {
                                            i2 = ((this.zzc + this.zzf) + (i8 >> 1)) - 25;
                                            i4 = ((this.zzd + this.zzg) + (i9 >> 1)) - 25;
                                        }
                                        if (i2 >= 0) {
                                            if (i2 + 50 <= i6) {
                                                if (i4 >= zzW[0]) {
                                                    if (i4 + 50 <= zzW[1]) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i2 = ((this.zzc + this.zzf) + (i8 >> 1)) - 25;
                                        i3 = this.zzd;
                                    }
                                    i4 = i3 + this.zzg;
                                    if (i2 >= 0) {
                                    }
                                }
                                if (z) {
                                    iArr = new int[]{this.zzc + this.zzf, this.zzd + this.zzg};
                                } else {
                                    com.google.android.gms.ads.internal.zzt.zzc();
                                    int[] zzaa2 = com.google.android.gms.ads.internal.util.zzs.zzaa(activity);
                                    com.google.android.gms.ads.internal.zzt.zzc();
                                    int[] zzW2 = com.google.android.gms.ads.internal.util.zzs.zzW(activity);
                                    int i11 = zzaa2[0];
                                    int i12 = this.zzc + this.zzf;
                                    int i13 = this.zzd + this.zzg;
                                    if (i12 < 0) {
                                        i = 0;
                                    } else {
                                        int i14 = this.zzh;
                                        i = i12 + i14 > i11 ? i11 - i14 : i12;
                                    }
                                    int i15 = zzW2[0];
                                    if (i13 < i15) {
                                        i13 = i15;
                                    } else {
                                        int i16 = this.zze;
                                        int i17 = i13 + i16;
                                        int i18 = zzW2[1];
                                        if (i17 > i18) {
                                            i13 = i18 - i16;
                                        }
                                    }
                                    iArr = new int[]{i, i13};
                                }
                            }
                            if (iArr == null) {
                                zzg("Resize location out of screen or close button is not visible.");
                                return;
                            }
                            com.google.android.gms.ads.internal.client.zzay.zza();
                            int zzE = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, this.zzh);
                            com.google.android.gms.ads.internal.client.zzay.zza();
                            int zzE2 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, this.zze);
                            ViewParent parent = ((View) zzclmVar).getParent();
                            if (!(parent instanceof ViewGroup)) {
                                zzg("Webview is detached, probably in the middle of a resize or expand.");
                                return;
                            }
                            ViewGroup viewGroup = (ViewGroup) parent;
                            viewGroup.removeView((View) zzclmVar);
                            PopupWindow popupWindow = this.zzp;
                            if (popupWindow == null) {
                                this.zzr = viewGroup;
                                com.google.android.gms.ads.internal.zzt.zzc();
                                ((View) zzclmVar).setDrawingCacheEnabled(true);
                                Bitmap createBitmap = Bitmap.createBitmap(((View) zzclmVar).getDrawingCache());
                                ((View) zzclmVar).setDrawingCacheEnabled(false);
                                ImageView imageView = new ImageView(activity);
                                this.zzm = imageView;
                                imageView.setImageBitmap(createBitmap);
                                this.zzl = zzclmVar.zzN();
                                this.zzr.addView(this.zzm);
                            } else {
                                popupWindow.dismiss();
                            }
                            RelativeLayout relativeLayout = new RelativeLayout(activity);
                            this.zzq = relativeLayout;
                            relativeLayout.setBackgroundColor(0);
                            this.zzq.setLayoutParams(new ViewGroup.LayoutParams(zzE, zzE2));
                            com.google.android.gms.ads.internal.zzt.zzc();
                            PopupWindow popupWindow2 = new PopupWindow((View) this.zzq, zzE, zzE2, false);
                            this.zzp = popupWindow2;
                            popupWindow2.setOutsideTouchable(false);
                            this.zzp.setTouchable(true);
                            this.zzp.setClippingEnabled(!this.zzb);
                            this.zzq.addView((View) zzclmVar, -1, -1);
                            this.zzn = new LinearLayout(activity);
                            com.google.android.gms.ads.internal.client.zzay.zza();
                            int zzE3 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, 50);
                            com.google.android.gms.ads.internal.client.zzay.zza();
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(zzE3, com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, 50));
                            String str3 = this.zza;
                            switch (str3.hashCode()) {
                                case -1364013995:
                                    if (str3.equals("center")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1012429441:
                                    if (str3.equals(X3.e.c)) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -655373719:
                                    if (str3.equals(X3.e.e)) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1163912186:
                                    if (str3.equals(X3.e.d)) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1288627767:
                                    if (str3.equals("bottom-center")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1755462605:
                                    if (str3.equals("top-center")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                layoutParams.addRule(10);
                                layoutParams.addRule(9);
                            } else if (c == 1) {
                                layoutParams.addRule(10);
                                layoutParams.addRule(14);
                            } else if (c == 2) {
                                layoutParams.addRule(13);
                            } else if (c == 3) {
                                layoutParams.addRule(12);
                                layoutParams.addRule(9);
                            } else if (c == 4) {
                                layoutParams.addRule(12);
                                layoutParams.addRule(14);
                            } else if (c != 5) {
                                layoutParams.addRule(10);
                                layoutParams.addRule(11);
                            } else {
                                layoutParams.addRule(12);
                                layoutParams.addRule(11);
                            }
                            this.zzn.setOnClickListener(new zzbyq(this));
                            this.zzn.setContentDescription("Close button");
                            this.zzq.addView(this.zzn, layoutParams);
                            try {
                                PopupWindow popupWindow3 = this.zzp;
                                View decorView = window.getDecorView();
                                com.google.android.gms.ads.internal.client.zzay.zza();
                                int zzE4 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, iArr[0]);
                                com.google.android.gms.ads.internal.client.zzay.zza();
                                popupWindow3.showAtLocation(decorView, 0, zzE4, com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, iArr[1]));
                                int i19 = iArr[0];
                                int i20 = iArr[1];
                                zzbyz zzbyzVar = this.zzo;
                                if (zzbyzVar != null) {
                                    zzbyzVar.zza(i19, i20, this.zzh, this.zze);
                                }
                                this.zzj.zzaf(zzcnw.zzc(zzE, zzE2));
                                int i21 = iArr[0];
                                int i22 = iArr[1];
                                com.google.android.gms.ads.internal.zzt.zzc();
                                zzi(i21, i22 - com.google.android.gms.ads.internal.util.zzs.zzW(this.zzk)[0], this.zzh, this.zze);
                                zzk("resized");
                                return;
                            } catch (RuntimeException e) {
                                String message = e.getMessage();
                                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                                sb.append("Cannot show popup window: ");
                                sb.append(message);
                                zzg(sb.toString());
                                RelativeLayout relativeLayout2 = this.zzq;
                                zzclm zzclmVar2 = this.zzj;
                                relativeLayout2.removeView((View) zzclmVar2);
                                ViewGroup viewGroup2 = this.zzr;
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(this.zzm);
                                    this.zzr.addView((View) zzclmVar2);
                                    zzclmVar2.zzaf(this.zzl);
                                }
                                return;
                            }
                        }
                        int i23 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Height is too small or too large.");
                        if (iArr == null) {
                        }
                    }
                    int i24 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Width is too small or too large.");
                    if (iArr == null) {
                    }
                }
                zzg("Activity context is not ready, cannot get window or decor view.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(final boolean z) {
        synchronized (this.zzi) {
            try {
                if (this.zzp != null) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmv)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        zzf(z);
                    } else {
                        zzcgj.zzf.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbyr
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzbys.this.zzf(z);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc(int i, int i2, boolean z) {
        synchronized (this.zzi) {
            this.zzc = i;
            this.zzd = i2;
        }
    }

    public final boolean zzd() {
        boolean z;
        synchronized (this.zzi) {
            z = this.zzp != null;
        }
        return z;
    }

    public final void zze(int i, int i2) {
        this.zzc = i;
        this.zzd = i2;
    }
}
