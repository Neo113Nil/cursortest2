package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzcim extends FrameLayout implements zzcid {
    final zzcja zza;
    private final zzciy zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbjr zze;
    private final long zzf;
    private final zzcie zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;
    private final Integer zzs;

    public zzcim(Context context, zzciy zzciyVar, int i, boolean z, zzbjr zzbjrVar, zzcix zzcixVar, Integer num) {
        super(context);
        this.zzb = zzciyVar;
        this.zze = zzbjrVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzciyVar.zzm());
        zzcif zzcifVar = zzciyVar.zzm().zza;
        zzcie zzcjqVar = i == 2 ? new zzcjq(context, new zzciz(context, zzciyVar.zzp(), zzciyVar.zzu(), zzbjrVar, zzciyVar.zzn()), zzciyVar, z, zzciq.zza(zzciyVar), zzcixVar, num) : new zzcic(context, zzciyVar, z, zzciq.zza(zzciyVar), zzcixVar, new zzciz(context, zzciyVar.zzp(), zzciyVar.zzu(), zzbjrVar, zzciyVar.zzn()), num);
        this.zzg = zzcjqVar;
        this.zzs = num;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcjqVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzD)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzA)).booleanValue()) {
            zzn();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzF)).longValue();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzC)).booleanValue();
        this.zzk = booleanValue;
        if (zzbjrVar != null) {
            zzbjrVar.zzd("spinner_used", true != booleanValue ? "0" : "1");
        }
        this.zza = new zzcja(this);
        zzcjqVar.zzr(this);
    }

    private final void zzJ() {
        if (this.zzb.zzk() == null || !this.zzi || this.zzj) {
            return;
        }
        this.zzb.zzk().getWindow().clearFlags(128);
        this.zzi = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzK(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        Integer zzl = zzl();
        if (zzl != null) {
            hashMap.put("playerId", zzl.toString());
        }
        hashMap.put(NotificationCompat.CATEGORY_EVENT, str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zzd("onVideoEvent", hashMap);
    }

    private final boolean zzL() {
        return this.zzq.getParent() != null;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            final zzcie zzcieVar = this.zzg;
            if (zzcieVar != null) {
                zzchc.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcig
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcie.this.zzt();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcih
            @Override // java.lang.Runnable
            public final void run() {
                zzcim.this.zzq(z);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcid
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.zza.zzb();
            z = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z = false;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcil(this, z));
    }

    public final void zzA(int i) {
        zzcie zzcieVar = this.zzg;
        if (zzcieVar == null) {
            return;
        }
        zzcieVar.zzy(i);
    }

    public final void zzB(int i) {
        zzcie zzcieVar = this.zzg;
        if (zzcieVar == null) {
            return;
        }
        zzcieVar.zzz(i);
    }

    public final void zzC(int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzD)).booleanValue()) {
            this.zzc.setBackgroundColor(i);
            this.zzd.setBackgroundColor(i);
        }
    }

    public final void zzD(int i) {
        zzcie zzcieVar = this.zzg;
        if (zzcieVar == null) {
            return;
        }
        zzcieVar.zzA(i);
    }

    public final void zzE(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzF(int i, int i2, int i3, int i4) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Set video bounds to x:" + i + ";y:" + i2 + ";w:" + i3 + ";h:" + i4);
        }
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzG(float f) {
        zzcie zzcieVar = this.zzg;
        if (zzcieVar == null) {
            return;
        }
        zzcieVar.zzb.zze(f);
        zzcieVar.zzn();
    }

    public final void zzH(float f, float f2) {
        zzcie zzcieVar = this.zzg;
        if (zzcieVar != null) {
            zzcieVar.zzu(f, f2);
        }
    }

    public final void zzI() {
        zzcie zzcieVar = this.zzg;
        if (zzcieVar == null) {
            return;
        }
        zzcieVar.zzb.zzd(false);
        zzcieVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcid
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbG)).booleanValue()) {
            this.zza.zza();
        }
        zzK("ended", new String[0]);
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcid
    public final void zzb(String str, String str2) {
        zzK("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcid
    public final void zzc(String str, String str2) {
        zzK("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcid
    public final void zzd() {
        zzK("pause", new String[0]);
        zzJ();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcid
    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbG)).booleanValue()) {
            this.zza.zzb();
        }
        if (this.zzb.zzk() != null && !this.zzi) {
            boolean z = (this.zzb.zzk().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z;
            if (!z) {
                this.zzb.zzk().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcid
    public final void zzf() {
        if (this.zzg != null && this.zzm == 0) {
            zzK("canplaythrough", TypedValues.TransitionType.S_DURATION, String.valueOf(r0.zzc() / 1000.0f), "videoWidth", String.valueOf(this.zzg.zze()), "videoHeight", String.valueOf(this.zzg.zzd()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcid
    public final void zzg() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcii
            @Override // java.lang.Runnable
            public final void run() {
                zzcim.this.zzp();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcid
    public final void zzh() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcij(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcid
    public final void zzi() {
        if (this.zzr && this.zzp != null && !zzL()) {
            this.zzq.setImageBitmap(this.zzp);
            this.zzq.invalidate();
            this.zzc.addView(this.zzq, new FrameLayout.LayoutParams(-1, -1));
            this.zzc.bringChildToFront(this.zzq);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcik(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcid
    public final void zzj(int i, int i2) {
        if (this.zzk) {
            int max = Math.max(i / ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzE)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzE)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == max && this.zzp.getHeight() == max2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcid
    public final void zzk() {
        if (this.zzh && zzL()) {
            this.zzc.removeView(this.zzq);
        }
        if (this.zzg == null || this.zzp == null) {
            return;
        }
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        if (this.zzg.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Spinner frame grab took " + elapsedRealtime2 + "ms");
        }
        if (elapsedRealtime2 > this.zzf) {
            com.google.android.gms.ads.internal.util.zze.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbjr zzbjrVar = this.zze;
            if (zzbjrVar != null) {
                zzbjrVar.zzd("spinner_jank", Long.toString(elapsedRealtime2));
            }
        }
    }

    public final Integer zzl() {
        zzcie zzcieVar = this.zzg;
        return zzcieVar != null ? zzcieVar.zzc : this.zzs;
    }

    public final void zzn() {
        zzcie zzcieVar = this.zzg;
        if (zzcieVar == null) {
            return;
        }
        TextView textView = new TextView(zzcieVar.getContext());
        textView.setText("AdMob - ".concat(this.zzg.zzj()));
        textView.setTextColor(SupportMenu.CATEGORY_MASK);
        textView.setBackgroundColor(InputDeviceCompat.SOURCE_ANY);
        this.zzc.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.zzc.bringChildToFront(textView);
    }

    public final void zzo() {
        this.zza.zza();
        zzcie zzcieVar = this.zzg;
        if (zzcieVar != null) {
            zzcieVar.zzt();
        }
        zzJ();
    }

    final /* synthetic */ void zzp() {
        zzK("firstFrameRendered", new String[0]);
    }

    final /* synthetic */ void zzq(boolean z) {
        zzK("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    public final void zzr() {
        if (this.zzg == null) {
            return;
        }
        if (TextUtils.isEmpty(this.zzn)) {
            zzK("no_src", new String[0]);
        } else {
            this.zzg.zzB(this.zzn, this.zzo);
        }
    }

    public final void zzs() {
        zzcie zzcieVar = this.zzg;
        if (zzcieVar == null) {
            return;
        }
        zzcieVar.zzb.zzd(true);
        zzcieVar.zzn();
    }

    final void zzt() {
        zzcie zzcieVar = this.zzg;
        if (zzcieVar == null) {
            return;
        }
        long zza = zzcieVar.zza();
        if (this.zzl == zza || zza <= 0) {
            return;
        }
        float f = zza / 1000.0f;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbD)).booleanValue()) {
            zzK("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(this.zzg.zzh()), "qoeCachedBytes", String.valueOf(this.zzg.zzf()), "qoeLoadedBytes", String.valueOf(this.zzg.zzg()), "droppedFrames", String.valueOf(this.zzg.zzb()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
        } else {
            zzK("timeupdate", "time", String.valueOf(f));
        }
        this.zzl = zza;
    }

    public final void zzu() {
        zzcie zzcieVar = this.zzg;
        if (zzcieVar == null) {
            return;
        }
        zzcieVar.zzo();
    }

    public final void zzv() {
        zzcie zzcieVar = this.zzg;
        if (zzcieVar == null) {
            return;
        }
        zzcieVar.zzp();
    }

    public final void zzw(int i) {
        zzcie zzcieVar = this.zzg;
        if (zzcieVar == null) {
            return;
        }
        zzcieVar.zzq(i);
    }

    public final void zzx(MotionEvent motionEvent) {
        zzcie zzcieVar = this.zzg;
        if (zzcieVar == null) {
            return;
        }
        zzcieVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzy(int i) {
        zzcie zzcieVar = this.zzg;
        if (zzcieVar == null) {
            return;
        }
        zzcieVar.zzw(i);
    }

    public final void zzz(int i) {
        zzcie zzcieVar = this.zzg;
        if (zzcieVar == null) {
            return;
        }
        zzcieVar.zzx(i);
    }
}
