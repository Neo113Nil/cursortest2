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
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbrk extends zzbrq {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzcej zzj;
    private final Activity zzk;
    private zzcgd zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbrr zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    }

    public zzbrk(zzcej zzcejVar, zzbrr zzbrrVar) {
        super(zzcejVar, "resize");
        this.zza = "top-right";
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzcejVar;
        this.zzk = zzcejVar.zzi();
        this.zzo = zzbrrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzc(boolean z) {
        this.zzp.dismiss();
        this.zzq.removeView((View) this.zzj);
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            this.zzr.addView((View) this.zzj);
            this.zzj.zzaj(this.zzl);
        }
        if (z) {
            zzl("default");
            zzbrr zzbrrVar = this.zzo;
            if (zzbrrVar != null) {
                zzbrrVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    public final void zza(final boolean z) {
        synchronized (this.zzi) {
            if (this.zzp != null) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjU)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    zzc(z);
                } else {
                    zzbzo.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbri
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzbrk.this.zzc(z);
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0267, code lost:
    
        zzh("Resize location out of screen or close button is not visible.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x026d, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x028e A[Catch: all -> 0x0483, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:10:0x0014, B:12:0x001c, B:13:0x0021, B:15:0x0023, B:17:0x002f, B:18:0x0034, B:20:0x0036, B:22:0x003e, B:23:0x0043, B:25:0x0045, B:27:0x0053, B:28:0x0064, B:30:0x0072, B:31:0x0083, B:33:0x0091, B:34:0x00a2, B:36:0x00b0, B:37:0x00c1, B:39:0x00cf, B:40:0x00dd, B:42:0x00eb, B:43:0x00ed, B:45:0x00f1, B:47:0x00f5, B:49:0x00fd, B:52:0x0105, B:56:0x012d, B:62:0x0139, B:64:0x0267, B:65:0x026c, B:67:0x026e, B:69:0x028e, B:71:0x0292, B:73:0x029f, B:74:0x02dc, B:89:0x0397, B:90:0x03c6, B:92:0x03de, B:93:0x03ff, B:95:0x0407, B:96:0x040e, B:97:0x0434, B:101:0x0437, B:103:0x0457, B:104:0x046c, B:106:0x039e, B:107:0x03a5, B:108:0x03ac, B:109:0x03b3, B:110:0x03b9, B:111:0x03c0, B:128:0x02d9, B:129:0x046e, B:130:0x0473, B:132:0x0140, B:134:0x0144, B:145:0x0197, B:146:0x01e7, B:147:0x01f2, B:149:0x01f5, B:151:0x01f8, B:153:0x01fd, B:156:0x0203, B:157:0x01a2, B:158:0x01b8, B:159:0x01c3, B:160:0x01ad, B:161:0x01bb, B:162:0x01c8, B:163:0x01dc, B:164:0x01ea, B:181:0x0217, B:185:0x0245, B:188:0x0255, B:189:0x024b, B:191:0x0253, B:192:0x023b, B:194:0x0241, B:196:0x025a, B:197:0x0260, B:198:0x0475, B:199:0x047a, B:201:0x047c, B:202:0x0481), top: B:3:0x0009, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzb(Map map) {
        ViewParent parent;
        char c;
        int i;
        char c2;
        int i2;
        int i3;
        int i4;
        int i5;
        synchronized (this.zzi) {
            if (this.zzk == null) {
                zzh("Not an activity context. Cannot resize.");
                return;
            }
            if (this.zzj.zzO() == null) {
                zzh("Webview is not yet available, size is not set.");
                return;
            }
            if (this.zzj.zzO().zzi()) {
                zzh("Is interstitial. Cannot resize an interstitial.");
                return;
            }
            if (this.zzj.zzaF()) {
                zzh("Cannot resize an expanded banner.");
                return;
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                com.google.android.gms.ads.internal.zzu.zzp();
                this.zzh = com.google.android.gms.ads.internal.util.zzt.zzO((String) map.get("width"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                com.google.android.gms.ads.internal.zzu.zzp();
                this.zze = com.google.android.gms.ads.internal.util.zzt.zzO((String) map.get("height"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                com.google.android.gms.ads.internal.zzu.zzp();
                this.zzf = com.google.android.gms.ads.internal.util.zzt.zzO((String) map.get("offsetX"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                com.google.android.gms.ads.internal.zzu.zzp();
                this.zzg = com.google.android.gms.ads.internal.util.zzt.zzO((String) map.get("offsetY"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                this.zzb = Boolean.parseBoolean((String) map.get("allowOffscreen"));
            }
            String str = (String) map.get("customClosePosition");
            if (!TextUtils.isEmpty(str)) {
                this.zza = str;
            }
            if (this.zzh < 0 || this.zze < 0) {
                zzh("Invalid width and height options. Cannot resize.");
                return;
            }
            Window window = this.zzk.getWindow();
            if (window != null && window.getDecorView() != null) {
                com.google.android.gms.ads.internal.zzu.zzp();
                int[] zzV = com.google.android.gms.ads.internal.util.zzt.zzV(this.zzk);
                com.google.android.gms.ads.internal.zzu.zzp();
                int[] zzR = com.google.android.gms.ads.internal.util.zzt.zzR(this.zzk);
                int i6 = zzV[0];
                int i7 = zzV[1];
                int i8 = this.zzh;
                int[] iArr = null;
                if (i8 >= 50 && i8 <= i6) {
                    int i9 = this.zze;
                    if (i9 >= 50 && i9 <= i7) {
                        if (i9 == i7 && i8 == i6) {
                            com.google.android.gms.ads.internal.util.client.zzm.zzj("Cannot resize to a full-screen ad.");
                        } else if (this.zzb) {
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
                                if (i2 >= 0 && i2 + 50 <= i6 && i4 >= zzR[0] && i4 + 50 <= zzR[1]) {
                                    iArr = new int[]{this.zzc + this.zzf, this.zzd + this.zzg};
                                }
                            } else {
                                i2 = ((this.zzc + this.zzf) + (i8 >> 1)) - 25;
                                i3 = this.zzd;
                            }
                            i4 = i3 + this.zzg;
                            if (i2 >= 0) {
                                iArr = new int[]{this.zzc + this.zzf, this.zzd + this.zzg};
                            }
                        } else {
                            com.google.android.gms.ads.internal.zzu.zzp();
                            int[] zzV2 = com.google.android.gms.ads.internal.util.zzt.zzV(this.zzk);
                            com.google.android.gms.ads.internal.zzu.zzp();
                            int[] zzR2 = com.google.android.gms.ads.internal.util.zzt.zzR(this.zzk);
                            int i10 = zzV2[0];
                            int i11 = this.zzc + this.zzf;
                            int i12 = this.zzd + this.zzg;
                            if (i11 < 0) {
                                i = 0;
                            } else {
                                int i13 = this.zzh;
                                i = i11 + i13 > i10 ? i10 - i13 : i11;
                            }
                            int i14 = zzR2[0];
                            if (i12 < i14) {
                                i12 = i14;
                            } else {
                                int i15 = this.zze;
                                int i16 = i12 + i15;
                                int i17 = zzR2[1];
                                if (i16 > i17) {
                                    i12 = i17 - i15;
                                }
                            }
                            iArr = new int[]{i, i12};
                        }
                        com.google.android.gms.ads.internal.client.zzay.zzb();
                        int zzy = com.google.android.gms.ads.internal.util.client.zzf.zzy(this.zzk, this.zzh);
                        com.google.android.gms.ads.internal.client.zzay.zzb();
                        int zzy2 = com.google.android.gms.ads.internal.util.client.zzf.zzy(this.zzk, this.zze);
                        parent = ((View) this.zzj).getParent();
                        if (parent != null || !(parent instanceof ViewGroup)) {
                            zzh("Webview is detached, probably in the middle of a resize or expand.");
                            return;
                        }
                        ViewGroup viewGroup = (ViewGroup) parent;
                        viewGroup.removeView((View) this.zzj);
                        PopupWindow popupWindow = this.zzp;
                        if (popupWindow == null) {
                            this.zzr = viewGroup;
                            com.google.android.gms.ads.internal.zzu.zzp();
                            Object obj = this.zzj;
                            ((View) obj).setDrawingCacheEnabled(true);
                            Bitmap createBitmap = Bitmap.createBitmap(((View) obj).getDrawingCache());
                            ((View) obj).setDrawingCacheEnabled(false);
                            ImageView imageView = new ImageView(this.zzk);
                            this.zzm = imageView;
                            imageView.setImageBitmap(createBitmap);
                            this.zzl = this.zzj.zzO();
                            this.zzr.addView(this.zzm);
                        } else {
                            popupWindow.dismiss();
                        }
                        RelativeLayout relativeLayout = new RelativeLayout(this.zzk);
                        this.zzq = relativeLayout;
                        relativeLayout.setBackgroundColor(0);
                        this.zzq.setLayoutParams(new ViewGroup.LayoutParams(zzy, zzy2));
                        com.google.android.gms.ads.internal.zzu.zzp();
                        PopupWindow popupWindow2 = new PopupWindow((View) this.zzq, zzy, zzy2, false);
                        this.zzp = popupWindow2;
                        popupWindow2.setOutsideTouchable(false);
                        this.zzp.setTouchable(true);
                        this.zzp.setClippingEnabled(!this.zzb);
                        this.zzq.addView((View) this.zzj, -1, -1);
                        this.zzn = new LinearLayout(this.zzk);
                        com.google.android.gms.ads.internal.client.zzay.zzb();
                        int zzy3 = com.google.android.gms.ads.internal.util.client.zzf.zzy(this.zzk, 50);
                        com.google.android.gms.ads.internal.client.zzay.zzb();
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(zzy3, com.google.android.gms.ads.internal.util.client.zzf.zzy(this.zzk, 50));
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
                        this.zzn.setOnClickListener(new zzbrj(this));
                        this.zzn.setContentDescription("Close button");
                        this.zzq.addView(this.zzn, layoutParams);
                        try {
                            PopupWindow popupWindow3 = this.zzp;
                            View decorView = window.getDecorView();
                            com.google.android.gms.ads.internal.client.zzay.zzb();
                            int zzy4 = com.google.android.gms.ads.internal.util.client.zzf.zzy(this.zzk, iArr[0]);
                            com.google.android.gms.ads.internal.client.zzay.zzb();
                            popupWindow3.showAtLocation(decorView, 0, zzy4, com.google.android.gms.ads.internal.util.client.zzf.zzy(this.zzk, iArr[1]));
                            int i18 = iArr[0];
                            int i19 = iArr[1];
                            zzbrr zzbrrVar = this.zzo;
                            if (zzbrrVar != null) {
                                zzbrrVar.zza(i18, i19, this.zzh, this.zze);
                            }
                            this.zzj.zzaj(zzcgd.zzb(zzy, zzy2));
                            int i20 = iArr[0];
                            int i21 = iArr[1];
                            com.google.android.gms.ads.internal.zzu.zzp();
                            zzk(i20, i21 - com.google.android.gms.ads.internal.util.zzt.zzR(this.zzk)[0], this.zzh, this.zze);
                            zzl("resized");
                            return;
                        } catch (RuntimeException e) {
                            zzh("Cannot show popup window: " + e.getMessage());
                            this.zzq.removeView((View) this.zzj);
                            ViewGroup viewGroup2 = this.zzr;
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(this.zzm);
                                this.zzr.addView((View) this.zzj);
                                this.zzj.zzaj(this.zzl);
                            }
                            return;
                        }
                    }
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Height is too small or too large.");
                    com.google.android.gms.ads.internal.client.zzay.zzb();
                    int zzy5 = com.google.android.gms.ads.internal.util.client.zzf.zzy(this.zzk, this.zzh);
                    com.google.android.gms.ads.internal.client.zzay.zzb();
                    int zzy22 = com.google.android.gms.ads.internal.util.client.zzf.zzy(this.zzk, this.zze);
                    parent = ((View) this.zzj).getParent();
                    if (parent != null) {
                    }
                    zzh("Webview is detached, probably in the middle of a resize or expand.");
                    return;
                }
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Width is too small or too large.");
                com.google.android.gms.ads.internal.client.zzay.zzb();
                int zzy52 = com.google.android.gms.ads.internal.util.client.zzf.zzy(this.zzk, this.zzh);
                com.google.android.gms.ads.internal.client.zzay.zzb();
                int zzy222 = com.google.android.gms.ads.internal.util.client.zzf.zzy(this.zzk, this.zze);
                parent = ((View) this.zzj).getParent();
                if (parent != null) {
                }
                zzh("Webview is detached, probably in the middle of a resize or expand.");
                return;
            }
            zzh("Activity context is not ready, cannot get window or decor view.");
        }
    }

    public final void zzd(int i, int i2, boolean z) {
        synchronized (this.zzi) {
            this.zzc = i;
            this.zzd = i2;
        }
    }

    public final void zze(int i, int i2) {
        this.zzc = i;
        this.zzd = i2;
    }

    public final boolean zzf() {
        boolean z;
        synchronized (this.zzi) {
            z = this.zzp != null;
        }
        return z;
    }
}
