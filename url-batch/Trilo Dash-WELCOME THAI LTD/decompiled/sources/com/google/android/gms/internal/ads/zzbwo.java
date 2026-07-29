package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
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
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbwo extends zzbwu {
    static final Set zza = CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    private String zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private final Object zzj;
    private final zzcli zzk;
    private final Activity zzl;
    private zzcmx zzm;
    private ImageView zzn;
    private LinearLayout zzo;
    private final zzbwv zzp;
    private PopupWindow zzq;
    private RelativeLayout zzr;
    private ViewGroup zzs;

    public zzbwo(zzcli zzcliVar, zzbwv zzbwvVar) {
        super(zzcliVar, "resize");
        this.zzb = "top-right";
        this.zzc = true;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = -1;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = -1;
        this.zzj = new Object();
        this.zzk = zzcliVar;
        this.zzl = zzcliVar.zzk();
        this.zzp = zzbwvVar;
    }

    public final void zza(boolean z) {
        synchronized (this.zzj) {
            PopupWindow popupWindow = this.zzq;
            if (popupWindow != null) {
                popupWindow.dismiss();
                this.zzr.removeView((View) this.zzk);
                ViewGroup viewGroup = this.zzs;
                if (viewGroup != null) {
                    viewGroup.removeView(this.zzn);
                    this.zzs.addView((View) this.zzk);
                    this.zzk.zzai(this.zzm);
                }
                if (z) {
                    zzk("default");
                    zzbwv zzbwvVar = this.zzp;
                    if (zzbwvVar != null) {
                        zzbwvVar.zzb();
                    }
                }
                this.zzq = null;
                this.zzr = null;
                this.zzs = null;
                this.zzo = null;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0257 A[Catch: all -> 0x047c, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:10:0x0012, B:12:0x001a, B:13:0x001f, B:15:0x0021, B:17:0x002d, B:18:0x0032, B:20:0x0034, B:22:0x003c, B:24:0x004a, B:25:0x005b, B:27:0x0069, B:28:0x007a, B:30:0x0088, B:31:0x0099, B:33:0x00a7, B:34:0x00b8, B:36:0x00c6, B:37:0x00d4, B:39:0x00e2, B:40:0x00e4, B:42:0x00e8, B:44:0x00ec, B:46:0x00f4, B:49:0x00fc, B:53:0x0122, B:59:0x012e, B:62:0x0257, B:63:0x025c, B:65:0x025e, B:67:0x027e, B:69:0x0282, B:71:0x028f, B:72:0x02cb, B:87:0x0384, B:88:0x03b3, B:90:0x03cb, B:91:0x03ec, B:93:0x03f4, B:94:0x03fb, B:95:0x0421, B:99:0x0424, B:101:0x0449, B:102:0x045e, B:104:0x038b, B:105:0x0392, B:106:0x0399, B:107:0x03a0, B:108:0x03a6, B:109:0x03ad, B:126:0x02c8, B:127:0x0460, B:128:0x0465, B:130:0x0135, B:132:0x0139, B:143:0x018c, B:144:0x01dc, B:145:0x01e7, B:147:0x01ea, B:149:0x01ed, B:151:0x01f1, B:154:0x01f7, B:155:0x0197, B:156:0x01ad, B:157:0x01b8, B:158:0x01a2, B:159:0x01b0, B:160:0x01bd, B:161:0x01d1, B:162:0x01df, B:179:0x0208, B:182:0x0232, B:185:0x0242, B:186:0x0238, B:188:0x0240, B:189:0x022a, B:191:0x0230, B:192:0x0249, B:193:0x024f, B:194:0x0467, B:195:0x046c, B:197:0x046e, B:198:0x0473, B:200:0x0475, B:201:0x047a), top: B:3:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x025e A[Catch: all -> 0x047c, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:10:0x0012, B:12:0x001a, B:13:0x001f, B:15:0x0021, B:17:0x002d, B:18:0x0032, B:20:0x0034, B:22:0x003c, B:24:0x004a, B:25:0x005b, B:27:0x0069, B:28:0x007a, B:30:0x0088, B:31:0x0099, B:33:0x00a7, B:34:0x00b8, B:36:0x00c6, B:37:0x00d4, B:39:0x00e2, B:40:0x00e4, B:42:0x00e8, B:44:0x00ec, B:46:0x00f4, B:49:0x00fc, B:53:0x0122, B:59:0x012e, B:62:0x0257, B:63:0x025c, B:65:0x025e, B:67:0x027e, B:69:0x0282, B:71:0x028f, B:72:0x02cb, B:87:0x0384, B:88:0x03b3, B:90:0x03cb, B:91:0x03ec, B:93:0x03f4, B:94:0x03fb, B:95:0x0421, B:99:0x0424, B:101:0x0449, B:102:0x045e, B:104:0x038b, B:105:0x0392, B:106:0x0399, B:107:0x03a0, B:108:0x03a6, B:109:0x03ad, B:126:0x02c8, B:127:0x0460, B:128:0x0465, B:130:0x0135, B:132:0x0139, B:143:0x018c, B:144:0x01dc, B:145:0x01e7, B:147:0x01ea, B:149:0x01ed, B:151:0x01f1, B:154:0x01f7, B:155:0x0197, B:156:0x01ad, B:157:0x01b8, B:158:0x01a2, B:159:0x01b0, B:160:0x01bd, B:161:0x01d1, B:162:0x01df, B:179:0x0208, B:182:0x0232, B:185:0x0242, B:186:0x0238, B:188:0x0240, B:189:0x022a, B:191:0x0230, B:192:0x0249, B:193:0x024f, B:194:0x0467, B:195:0x046c, B:197:0x046e, B:198:0x0473, B:200:0x0475, B:201:0x047a), top: B:3:0x0007, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzb(Map map) {
        int[] iArr;
        char c;
        char c2;
        int i;
        int i2;
        int i3;
        int i4;
        synchronized (this.zzj) {
            if (this.zzl == null) {
                zzg("Not an activity context. Cannot resize.");
                return;
            }
            if (this.zzk.zzQ() == null) {
                zzg("Webview is not yet available, size is not set.");
                return;
            }
            if (this.zzk.zzQ().zzi()) {
                zzg("Is interstitial. Cannot resize an interstitial.");
                return;
            }
            if (this.zzk.zzaC()) {
                zzg("Cannot resize an expanded banner.");
                return;
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                com.google.android.gms.ads.internal.zzt.zzp();
                this.zzi = com.google.android.gms.ads.internal.util.zzs.zzJ((String) map.get("width"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                com.google.android.gms.ads.internal.zzt.zzp();
                this.zzf = com.google.android.gms.ads.internal.util.zzs.zzJ((String) map.get("height"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                com.google.android.gms.ads.internal.zzt.zzp();
                this.zzg = com.google.android.gms.ads.internal.util.zzs.zzJ((String) map.get("offsetX"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                com.google.android.gms.ads.internal.zzt.zzp();
                this.zzh = com.google.android.gms.ads.internal.util.zzs.zzJ((String) map.get("offsetY"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                this.zzc = Boolean.parseBoolean((String) map.get("allowOffscreen"));
            }
            String str = (String) map.get("customClosePosition");
            if (!TextUtils.isEmpty(str)) {
                this.zzb = str;
            }
            if (this.zzi < 0 || this.zzf < 0) {
                zzg("Invalid width and height options. Cannot resize.");
                return;
            }
            Window window = this.zzl.getWindow();
            if (window != null && window.getDecorView() != null) {
                com.google.android.gms.ads.internal.zzt.zzp();
                int[] zzQ = com.google.android.gms.ads.internal.util.zzs.zzQ(this.zzl);
                com.google.android.gms.ads.internal.zzt.zzp();
                int[] zzN = com.google.android.gms.ads.internal.util.zzs.zzN(this.zzl);
                int i5 = zzQ[0];
                int i6 = zzQ[1];
                int i7 = this.zzi;
                if (i7 >= 50 && i7 <= i5) {
                    int i8 = this.zzf;
                    if (i8 >= 50 && i8 <= i6) {
                        if (i8 != i6 || i7 != i5) {
                            if (this.zzc) {
                                String str2 = this.zzb;
                                switch (str2.hashCode()) {
                                    case -1364013995:
                                        if (str2.equals("center")) {
                                            c2 = 2;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -1012429441:
                                        if (str2.equals("top-left")) {
                                            c2 = 0;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -655373719:
                                        if (str2.equals("bottom-left")) {
                                            c2 = 3;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 1163912186:
                                        if (str2.equals("bottom-right")) {
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
                                    i = this.zzd + this.zzg;
                                    i2 = this.zze;
                                } else if (c2 != 1) {
                                    if (c2 != 2) {
                                        if (c2 == 3) {
                                            i = this.zzd + this.zzg;
                                            i4 = this.zze;
                                        } else if (c2 == 4) {
                                            i = ((this.zzd + this.zzg) + (i7 >> 1)) - 25;
                                            i4 = this.zze;
                                        } else if (c2 != 5) {
                                            i = ((this.zzd + this.zzg) + i7) - 50;
                                            i2 = this.zze;
                                        } else {
                                            i = ((this.zzd + this.zzg) + i7) - 50;
                                            i4 = this.zze;
                                        }
                                        i3 = ((i4 + this.zzh) + i8) - 50;
                                    } else {
                                        i = ((this.zzd + this.zzg) + (i7 >> 1)) - 25;
                                        i3 = ((this.zze + this.zzh) + (i8 >> 1)) - 25;
                                    }
                                    if (i >= 0 && i + 50 <= i5 && i3 >= zzN[0] && i3 + 50 <= zzN[1]) {
                                        iArr = new int[]{this.zzd + this.zzg, this.zze + this.zzh};
                                    }
                                } else {
                                    i = ((this.zzd + this.zzg) + (i7 >> 1)) - 25;
                                    i2 = this.zze;
                                }
                                i3 = i2 + this.zzh;
                                if (i >= 0) {
                                    iArr = new int[]{this.zzd + this.zzg, this.zze + this.zzh};
                                }
                            } else {
                                com.google.android.gms.ads.internal.zzt.zzp();
                                int[] zzQ2 = com.google.android.gms.ads.internal.util.zzs.zzQ(this.zzl);
                                com.google.android.gms.ads.internal.zzt.zzp();
                                int[] zzN2 = com.google.android.gms.ads.internal.util.zzs.zzN(this.zzl);
                                int i9 = zzQ2[0];
                                int i10 = this.zzd + this.zzg;
                                int i11 = this.zze + this.zzh;
                                if (i10 < 0) {
                                    i10 = 0;
                                } else {
                                    int i12 = this.zzi;
                                    if (i10 + i12 > i9) {
                                        i10 = i9 - i12;
                                    }
                                }
                                int i13 = zzN2[0];
                                if (i11 < i13) {
                                    i11 = i13;
                                } else {
                                    int i14 = this.zzf;
                                    int i15 = i11 + i14;
                                    int i16 = zzN2[1];
                                    if (i15 > i16) {
                                        i11 = i16 - i14;
                                    }
                                }
                                iArr = new int[]{i10, i11};
                            }
                            if (iArr != null) {
                                zzg("Resize location out of screen or close button is not visible.");
                                return;
                            }
                            com.google.android.gms.ads.internal.client.zzaw.zzb();
                            int zzv = zzcfb.zzv(this.zzl, this.zzi);
                            com.google.android.gms.ads.internal.client.zzaw.zzb();
                            int zzv2 = zzcfb.zzv(this.zzl, this.zzf);
                            ViewParent parent = ((View) this.zzk).getParent();
                            if (parent == null || !(parent instanceof ViewGroup)) {
                                zzg("Webview is detached, probably in the middle of a resize or expand.");
                                return;
                            }
                            ViewGroup viewGroup = (ViewGroup) parent;
                            viewGroup.removeView((View) this.zzk);
                            PopupWindow popupWindow = this.zzq;
                            if (popupWindow == null) {
                                this.zzs = viewGroup;
                                com.google.android.gms.ads.internal.zzt.zzp();
                                Object obj = this.zzk;
                                ((View) obj).setDrawingCacheEnabled(true);
                                Bitmap createBitmap = Bitmap.createBitmap(((View) obj).getDrawingCache());
                                ((View) obj).setDrawingCacheEnabled(false);
                                ImageView imageView = new ImageView(this.zzl);
                                this.zzn = imageView;
                                imageView.setImageBitmap(createBitmap);
                                this.zzm = this.zzk.zzQ();
                                this.zzs.addView(this.zzn);
                            } else {
                                popupWindow.dismiss();
                            }
                            RelativeLayout relativeLayout = new RelativeLayout(this.zzl);
                            this.zzr = relativeLayout;
                            relativeLayout.setBackgroundColor(0);
                            this.zzr.setLayoutParams(new ViewGroup.LayoutParams(zzv, zzv2));
                            com.google.android.gms.ads.internal.zzt.zzp();
                            PopupWindow popupWindow2 = new PopupWindow((View) this.zzr, zzv, zzv2, false);
                            this.zzq = popupWindow2;
                            popupWindow2.setOutsideTouchable(false);
                            this.zzq.setTouchable(true);
                            this.zzq.setClippingEnabled(!this.zzc);
                            this.zzr.addView((View) this.zzk, -1, -1);
                            this.zzo = new LinearLayout(this.zzl);
                            com.google.android.gms.ads.internal.client.zzaw.zzb();
                            int zzv3 = zzcfb.zzv(this.zzl, 50);
                            com.google.android.gms.ads.internal.client.zzaw.zzb();
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(zzv3, zzcfb.zzv(this.zzl, 50));
                            String str3 = this.zzb;
                            switch (str3.hashCode()) {
                                case -1364013995:
                                    if (str3.equals("center")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1012429441:
                                    if (str3.equals("top-left")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -655373719:
                                    if (str3.equals("bottom-left")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1163912186:
                                    if (str3.equals("bottom-right")) {
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
                            this.zzo.setOnClickListener(new zzbwn(this));
                            this.zzo.setContentDescription("Close button");
                            this.zzr.addView(this.zzo, layoutParams);
                            try {
                                PopupWindow popupWindow3 = this.zzq;
                                View decorView = window.getDecorView();
                                com.google.android.gms.ads.internal.client.zzaw.zzb();
                                int zzv4 = zzcfb.zzv(this.zzl, iArr[0]);
                                com.google.android.gms.ads.internal.client.zzaw.zzb();
                                popupWindow3.showAtLocation(decorView, 0, zzv4, zzcfb.zzv(this.zzl, iArr[1]));
                                int i17 = iArr[0];
                                int i18 = iArr[1];
                                zzbwv zzbwvVar = this.zzp;
                                if (zzbwvVar != null) {
                                    zzbwvVar.zza(i17, i18, this.zzi, this.zzf);
                                }
                                this.zzk.zzai(zzcmx.zzb(zzv, zzv2));
                                int i19 = iArr[0];
                                int i20 = iArr[1];
                                com.google.android.gms.ads.internal.zzt.zzp();
                                zzj(i19, i20 - com.google.android.gms.ads.internal.util.zzs.zzN(this.zzl)[0], this.zzi, this.zzf);
                                zzk("resized");
                                return;
                            } catch (RuntimeException e) {
                                zzg("Cannot show popup window: " + e.getMessage());
                                this.zzr.removeView((View) this.zzk);
                                ViewGroup viewGroup2 = this.zzs;
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(this.zzn);
                                    this.zzs.addView((View) this.zzk);
                                    this.zzk.zzai(this.zzm);
                                }
                                return;
                            }
                        }
                        com.google.android.gms.ads.internal.util.zze.zzj("Cannot resize to a full-screen ad.");
                        iArr = null;
                        if (iArr != null) {
                        }
                    }
                    com.google.android.gms.ads.internal.util.zze.zzj("Height is too small or too large.");
                    iArr = null;
                    if (iArr != null) {
                    }
                }
                com.google.android.gms.ads.internal.util.zze.zzj("Width is too small or too large.");
                iArr = null;
                if (iArr != null) {
                }
            }
            zzg("Activity context is not ready, cannot get window or decor view.");
        }
    }

    public final void zzc(int i, int i2, boolean z) {
        synchronized (this.zzj) {
            this.zzd = i;
            this.zze = i2;
        }
    }

    public final void zzd(int i, int i2) {
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean zze() {
        boolean z;
        synchronized (this.zzj) {
            z = this.zzq != null;
        }
        return z;
    }
}
