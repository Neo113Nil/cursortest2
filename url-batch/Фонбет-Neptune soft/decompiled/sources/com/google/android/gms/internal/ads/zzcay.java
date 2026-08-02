package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.view.InputDeviceCompat;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.messaging.Constants;
import java.util.HashMap;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzcay extends FrameLayout implements zzcap {
    final zzcbm zza;
    private final zzcbk zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbcl zze;
    private final long zzf;
    private final zzcaq zzg;
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

    public zzcay(Context context, zzcbk zzcbkVar, int i, boolean z, zzbcl zzbclVar, zzcbj zzcbjVar) {
        super(context);
        this.zzb = zzcbkVar;
        this.zze = zzbclVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzcbkVar.zzj());
        zzcar zzcarVar = zzcbkVar.zzj().zza;
        zzcaq zzcccVar = i == 2 ? new zzccc(context, new zzcbl(context, zzcbkVar.zzn(), zzcbkVar.zzdi(), zzbclVar, zzcbkVar.zzk()), zzcbkVar, z, zzcbc.zza(zzcbkVar), zzcbjVar) : new zzcao(context, zzcbkVar, z, zzcbc.zza(zzcbkVar), zzcbjVar, new zzcbl(context, zzcbkVar.zzn(), zzcbkVar.zzdi(), zzbclVar, zzcbkVar.zzk()));
        this.zzg = zzcccVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcccVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzz)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzw)).booleanValue()) {
            zzn();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzB)).longValue();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzy)).booleanValue();
        this.zzk = booleanValue;
        if (zzbclVar != null) {
            zzbclVar.zzd("spinner_used", true != booleanValue ? "0" : "1");
        }
        this.zza = new zzcbm(this);
        zzcccVar.zzr(this);
    }

    private final void zzJ() {
        if (this.zzb.zzi() == null || !this.zzi || this.zzj) {
            return;
        }
        this.zzb.zzi().getWindow().clearFlags(128);
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
            final zzcaq zzcaqVar = this.zzg;
            if (zzcaqVar != null) {
                zzgcu zzgcuVar = zzbzo.zze;
                Objects.requireNonNull(zzcaqVar);
                zzgcuVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcas
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcaq.this.zzt();
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
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcau
            @Override // java.lang.Runnable
            public final void run() {
                zzcay.this.zzq(z);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcap
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
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcax(this, z));
    }

    public final void zzA(int i) {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar == null) {
            return;
        }
        zzcaqVar.zzz(i);
    }

    public final void zzB(int i) {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar == null) {
            return;
        }
        zzcaqVar.zzA(i);
    }

    public final void zzC(int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzz)).booleanValue()) {
            this.zzc.setBackgroundColor(i);
            this.zzd.setBackgroundColor(i);
        }
    }

    public final void zzD(int i) {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar == null) {
            return;
        }
        zzcaqVar.zzB(i);
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
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar == null) {
            return;
        }
        zzcaqVar.zzb.zze(f);
        zzcaqVar.zzn();
    }

    public final void zzH(float f, float f2) {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar != null) {
            zzcaqVar.zzu(f, f2);
        }
    }

    public final void zzI() {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar == null) {
            return;
        }
        zzcaqVar.zzb.zzd(false);
        zzcaqVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbI)).booleanValue()) {
            this.zza.zza();
        }
        zzK("ended", new String[0]);
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzb(String str, String str2) {
        zzK(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzc(String str, String str2) {
        zzK("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzd() {
        zzK("pause", new String[0]);
        zzJ();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbI)).booleanValue()) {
            this.zza.zzb();
        }
        if (this.zzb.zzi() != null && !this.zzi) {
            boolean z = (this.zzb.zzi().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z;
            if (!z) {
                this.zzb.zzi().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzf() {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar != null && this.zzm == 0) {
            float zzc = zzcaqVar.zzc();
            zzcaq zzcaqVar2 = this.zzg;
            zzK("canplaythrough", TypedValues.TransitionType.S_DURATION, String.valueOf(zzc / 1000.0f), "videoWidth", String.valueOf(zzcaqVar2.zze()), "videoHeight", String.valueOf(zzcaqVar2.zzd()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzg() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcat
            @Override // java.lang.Runnable
            public final void run() {
                zzcay.this.zzp();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzh() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcav(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzi() {
        if (this.zzr && this.zzp != null && !zzL()) {
            this.zzq.setImageBitmap(this.zzp);
            this.zzq.invalidate();
            this.zzc.addView(this.zzq, new FrameLayout.LayoutParams(-1, -1));
            this.zzc.bringChildToFront(this.zzq);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcaw(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzj(int i, int i2) {
        if (this.zzk) {
            int max = Math.max(i / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzA)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzA)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == max && this.zzp.getHeight() == max2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzk() {
        if (this.zzh && zzL()) {
            this.zzc.removeView(this.zzq);
        }
        if (this.zzg == null || this.zzp == null) {
            return;
        }
        long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
        if (this.zzg.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        long elapsedRealtime2 = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - elapsedRealtime;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Spinner frame grab took " + elapsedRealtime2 + "ms");
        }
        if (elapsedRealtime2 > this.zzf) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbcl zzbclVar = this.zze;
            if (zzbclVar != null) {
                zzbclVar.zzd("spinner_jank", Long.toString(elapsedRealtime2));
            }
        }
    }

    public final Integer zzl() {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar != null) {
            return zzcaqVar.zzw();
        }
        return null;
    }

    public final void zzn() {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar == null) {
            return;
        }
        TextView textView = new TextView(zzcaqVar.getContext());
        Resources zze = com.google.android.gms.ads.internal.zzu.zzo().zze();
        textView.setText(String.valueOf(zze == null ? "AdMob - " : zze.getString(R.string.watermark_label_prefix)).concat(this.zzg.zzj()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(InputDeviceCompat.SOURCE_ANY);
        this.zzc.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.zzc.bringChildToFront(textView);
    }

    public final void zzo() {
        this.zza.zza();
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar != null) {
            zzcaqVar.zzt();
        }
        zzJ();
    }

    final /* synthetic */ void zzp() {
        zzK("firstFrameRendered", new String[0]);
    }

    final /* synthetic */ void zzq(boolean z) {
        zzK("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    public final void zzr(Integer num) {
        if (this.zzg == null) {
            return;
        }
        if (TextUtils.isEmpty(this.zzn)) {
            zzK("no_src", new String[0]);
        } else {
            this.zzg.zzC(this.zzn, this.zzo, num);
        }
    }

    public final void zzs() {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar == null) {
            return;
        }
        zzcaqVar.zzb.zzd(true);
        zzcaqVar.zzn();
    }

    final void zzt() {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar == null) {
            return;
        }
        long zza = zzcaqVar.zza();
        if (this.zzl == zza || zza <= 0) {
            return;
        }
        float f = zza / 1000.0f;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbG)).booleanValue()) {
            zzK("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(this.zzg.zzh()), "qoeCachedBytes", String.valueOf(this.zzg.zzf()), "qoeLoadedBytes", String.valueOf(this.zzg.zzg()), "droppedFrames", String.valueOf(this.zzg.zzb()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()));
        } else {
            zzK("timeupdate", "time", String.valueOf(f));
        }
        this.zzl = zza;
    }

    public final void zzu() {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar == null) {
            return;
        }
        zzcaqVar.zzo();
    }

    public final void zzv() {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar == null) {
            return;
        }
        zzcaqVar.zzp();
    }

    public final void zzw(int i) {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar == null) {
            return;
        }
        zzcaqVar.zzq(i);
    }

    public final void zzx(MotionEvent motionEvent) {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar == null) {
            return;
        }
        zzcaqVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzy(int i) {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar == null) {
            return;
        }
        zzcaqVar.zzx(i);
    }

    public final void zzz(int i) {
        zzcaq zzcaqVar = this.zzg;
        if (zzcaqVar == null) {
            return;
        }
        zzcaqVar.zzy(i);
    }
}
