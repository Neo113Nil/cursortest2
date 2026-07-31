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
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.internal.Preconditions;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzcht extends FrameLayout implements zzchk {

    @VisibleForTesting
    final zzcih zza;
    private final zzcif zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbjv zze;
    private final long zzf;

    @Nullable
    private final zzchl zzg;
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

    public zzcht(Context context, zzcif zzcifVar, int i, boolean z, zzbjv zzbjvVar, zzcie zzcieVar, @Nullable zzeaj zzeajVar) {
        super(context);
        this.zzb = zzcifVar;
        this.zze = zzbjvVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzt)).booleanValue()) {
            frameLayout.setBackgroundColor(-16777216);
        }
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzcifVar.zzk());
        zzchm zzchmVar = zzcifVar.zzk().zza;
        zzcig zzcigVar = new zzcig(context, zzcifVar.zzs(), zzcifVar.zzm(), zzbjvVar, zzcifVar.zzi());
        zzchl zzclbVar = i == 3 ? new zzclb(context, zzcigVar) : i == 2 ? new zzcix(context, zzcigVar, zzcifVar, z, zzchm.zza(zzcifVar), zzcieVar, zzeajVar) : new zzchj(context, zzcifVar, z, zzchm.zza(zzcifVar), zzcieVar, new zzcig(context, zzcifVar.zzs(), zzcifVar.zzm(), zzbjvVar, zzcifVar.zzi()), zzeajVar);
        this.zzg = zzclbVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzclbVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzay)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzav)).booleanValue()) {
            zzD();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaA)).longValue();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzax)).booleanValue();
        this.zzk = booleanValue;
        if (zzbjvVar != null) {
            zzbjvVar.zzd("spinner_used", true != booleanValue ? "0" : "1");
        }
        this.zza = new zzcih(this);
        zzclbVar.zzb(this);
    }

    private final boolean zzJ() {
        return this.zzq.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzK, reason: merged with bridge method [inline-methods] */
    public final void zzI(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        Integer zzl = zzl();
        if (zzl != null) {
            hashMap.put("playerId", zzl.toString());
        }
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zze("onVideoEvent", hashMap);
    }

    private final void zzL() {
        zzcif zzcifVar = this.zzb;
        if (zzcifVar.zzj() == null || !this.zzi || this.zzj) {
            return;
        }
        zzcifVar.zzj().getWindow().clearFlags(128);
        this.zzi = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.h, this, me);
        return super.dispatchTouchEvent(me);
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            final zzchl zzchlVar = this.zzg;
            if (zzchlVar != null) {
                zzcgj.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchq
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzchl.this.zzd();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
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
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcht.this.zzG(z);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzchk
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
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzchp(this, z));
    }

    public final void zzA(int i) {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        zzchlVar.zzB(i);
    }

    public final void zzB(int i) {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        zzchlVar.zzC(i);
    }

    public final void zzC(MotionEvent motionEvent) {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        zzchlVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzD() {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        TextView textView = new TextView(zzchlVar.getContext());
        Resources zzg = com.google.android.gms.ads.internal.zzt.zzh().zzg();
        textView.setText(String.valueOf(zzg == null ? "AdMob - " : zzg.getString(R.string.watermark_label_prefix)).concat(zzchlVar.zza()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout frameLayout = this.zzc;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.bringChildToFront(textView);
    }

    public final void zzE() {
        this.zza.zza();
        zzchl zzchlVar = this.zzg;
        if (zzchlVar != null) {
            zzchlVar.zzd();
        }
        zzL();
    }

    final void zzF() {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        long zzh = zzchlVar.zzh();
        if (this.zzl == zzh || zzh <= 0) {
            return;
        }
        float f = zzh / 1000.0f;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcG)).booleanValue()) {
            zzI("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(zzchlVar.zzo()), "qoeCachedBytes", String.valueOf(zzchlVar.zzn()), "qoeLoadedBytes", String.valueOf(zzchlVar.zzm()), "droppedFrames", String.valueOf(zzchlVar.zzp()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
        } else {
            zzI("timeupdate", "time", String.valueOf(f));
        }
        this.zzl = zzh;
    }

    final /* synthetic */ void zzG(boolean z) {
        zzI("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    final /* synthetic */ void zzH() {
        zzI("firstFrameRendered", new String[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zza() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzchn(this));
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzb() {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar != null && this.zzm == 0) {
            zzI("canplaythrough", IronSourceConstants.EVENTS_DURATION, String.valueOf(zzchlVar.zzg() / 1000.0f), "videoWidth", String.valueOf(zzchlVar.zzk()), "videoHeight", String.valueOf(zzchlVar.zzl()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcI)).booleanValue()) {
            this.zza.zzb();
        }
        zzcif zzcifVar = this.zzb;
        if (zzcifVar.zzj() != null && !this.zzi) {
            boolean z = (zzcifVar.zzj().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z;
            if (!z) {
                zzcifVar.zzj().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzd() {
        zzI("pause", new String[0]);
        zzL();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcI)).booleanValue()) {
            this.zza.zza();
        }
        zzI(X3.i.g0, new String[0]);
        zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzf(String str, @Nullable String str2) {
        zzI("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzg(String str, @Nullable String str2) {
        zzI(TelemetryCategory.EXCEPTION, "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzh() {
        if (this.zzr && this.zzp != null && !zzJ()) {
            ImageView imageView = this.zzq;
            imageView.setImageBitmap(this.zzp);
            imageView.invalidate();
            FrameLayout frameLayout = this.zzc;
            frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(imageView);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcho(this));
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzi() {
        if (this.zzh && zzJ()) {
            this.zzc.removeView(this.zzq);
        }
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null || this.zzp == null) {
            return;
        }
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        if (zzchlVar.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime2).length() + 26);
            sb.append("Spinner frame grab took ");
            sb.append(elapsedRealtime2);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        if (elapsedRealtime2 > this.zzf) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbjv zzbjvVar = this.zze;
            if (zzbjvVar != null) {
                zzbjvVar.zzd("spinner_jank", Long.toString(elapsedRealtime2));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzj(int i, int i2) {
        if (this.zzk) {
            zzbix zzbixVar = zzbjg.zzaz;
            int max = Math.max(i / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == max && this.zzp.getHeight() == max2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzk() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcht.this.zzH();
            }
        });
    }

    @Nullable
    public final Integer zzl() {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar != null) {
            return zzchlVar.zzw();
        }
        return null;
    }

    public final void zzm(int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzay)).booleanValue()) {
            this.zzc.setBackgroundColor(i);
            this.zzd.setBackgroundColor(i);
        }
    }

    public final void zzn(int i, int i2, int i3, int i4) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            int length = String.valueOf(i).length();
            StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(i2).length() + 3 + String.valueOf(i3).length() + 3 + String.valueOf(i4).length());
            sb.append("Set video bounds to x:");
            sb.append(i);
            sb.append(";y:");
            sb.append(i2);
            sb.append(";w:");
            sb.append(i3);
            sb.append(";h:");
            sb.append(i4);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzo(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzp(float f, float f2) {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar != null) {
            zzchlVar.zzj(f, f2);
        }
    }

    public final void zzq(Integer num) {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        if (TextUtils.isEmpty(this.zzn)) {
            zzI("no_src", new String[0]);
        } else {
            zzchlVar.zzx(this.zzn, this.zzo, num);
        }
    }

    public final void zzr() {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        zzchlVar.zzf();
    }

    public final void zzs() {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        zzchlVar.zze();
    }

    public final void zzt(int i) {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        zzchlVar.zzi(i);
    }

    public final void zzu() {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        zzchlVar.zzb.zza(true);
        zzchlVar.zzq();
    }

    public final void zzv() {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        zzchlVar.zzb.zza(false);
        zzchlVar.zzq();
    }

    public final void zzw(float f) {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        zzchlVar.zzb.zzb(f);
        zzchlVar.zzq();
    }

    public final void zzx(int i) {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        zzchlVar.zzy(i);
    }

    public final void zzy(int i) {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        zzchlVar.zzz(i);
    }

    public final void zzz(int i) {
        zzchl zzchlVar = this.zzg;
        if (zzchlVar == null) {
            return;
        }
        zzchlVar.zzA(i);
    }
}
