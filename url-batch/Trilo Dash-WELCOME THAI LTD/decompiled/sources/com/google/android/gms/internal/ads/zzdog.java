package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzdog {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final zzfby zzb;
    private final zzdnl zzc;
    private final zzdng zzd;
    private final zzdor zze;
    private final zzdoz zzf;
    private final Executor zzg;
    private final Executor zzh;
    private final zzbko zzi;
    private final zzdnd zzj;

    public zzdog(com.google.android.gms.ads.internal.util.zzg zzgVar, zzfby zzfbyVar, zzdnl zzdnlVar, zzdng zzdngVar, zzdor zzdorVar, zzdoz zzdozVar, Executor executor, Executor executor2, zzdnd zzdndVar) {
        this.zza = zzgVar;
        this.zzb = zzfbyVar;
        this.zzi = zzfbyVar.zzi;
        this.zzc = zzdnlVar;
        this.zzd = zzdngVar;
        this.zze = zzdorVar;
        this.zzf = zzdozVar;
        this.zzg = executor;
        this.zzh = executor2;
        this.zzj = zzdndVar;
    }

    private final boolean zzh(ViewGroup viewGroup, boolean z) {
        View zzf = z ? this.zzd.zzf() : this.zzd.zzg();
        if (zzf == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzf.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzf.getParent()).removeView(zzf);
        }
        viewGroup.addView(zzf, ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcS)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    final /* synthetic */ void zza(ViewGroup viewGroup) {
        boolean z = viewGroup != null;
        zzdng zzdngVar = this.zzd;
        if (zzdngVar.zzf() != null) {
            if (zzdngVar.zzc() == 2 || zzdngVar.zzc() == 1) {
                this.zza.zzI(this.zzb.zzf, String.valueOf(zzdngVar.zzc()), z);
            } else if (zzdngVar.zzc() == 6) {
                this.zza.zzI(this.zzb.zzf, "2", z);
                this.zza.zzI(this.zzb.zzf, "1", z);
            }
        }
    }

    final /* synthetic */ void zzb(zzdpb zzdpbVar) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        zzbkx zza;
        Drawable drawable;
        if (this.zzc.zzf() || this.zzc.zze()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            for (int i = 0; i < 2; i++) {
                View zzg = zzdpbVar.zzg(strArr[i]);
                if (zzg != null && (zzg instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) zzg;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context = zzdpbVar.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdng zzdngVar = this.zzd;
        if (zzdngVar.zze() != null) {
            view = zzdngVar.zze();
            zzbko zzbkoVar = this.zzi;
            if (zzbkoVar != null && viewGroup == null) {
                zzg(layoutParams, zzbkoVar.zze);
                view.setLayoutParams(layoutParams);
            }
        } else if (zzdngVar.zzl() instanceof zzbkj) {
            zzbkj zzbkjVar = (zzbkj) zzdngVar.zzl();
            if (viewGroup == null) {
                zzg(layoutParams, zzbkjVar.zzc());
            }
            View zzbkkVar = new zzbkk(context, zzbkjVar, layoutParams);
            zzbkkVar.setContentDescription((CharSequence) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcQ));
            view = zzbkkVar;
        } else {
            view = null;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdpbVar.zzf().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(view);
                FrameLayout zzh = zzdpbVar.zzh();
                if (zzh != null) {
                    zzh.addView(zzaVar);
                }
            }
            zzdpbVar.zzq(zzdpbVar.zzk(), view, true);
        }
        zzfrh zzfrhVar = zzdoc.zza;
        int size = zzfrhVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View zzg2 = zzdpbVar.zzg((String) zzfrhVar.get(i2));
            i2++;
            if (zzg2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) zzg2;
                break;
            }
        }
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdod
            @Override // java.lang.Runnable
            public final void run() {
                zzdog.this.zza(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (zzh(viewGroup2, true)) {
            zzdng zzdngVar2 = this.zzd;
            if (zzdngVar2.zzr() != null) {
                zzdngVar2.zzr().zzaq(new zzdof(zzdpbVar, viewGroup2));
                return;
            }
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhT)).booleanValue() && zzh(viewGroup2, false)) {
            zzdng zzdngVar3 = this.zzd;
            if (zzdngVar3.zzp() != null) {
                zzdngVar3.zzp().zzaq(new zzdof(zzdpbVar, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View zzf = zzdpbVar.zzf();
        Context context2 = zzf != null ? zzf.getContext() : null;
        if (context2 == null || (zza = this.zzj.zza()) == null) {
            return;
        }
        try {
            IObjectWrapper zzi = zza.zzi();
            if (zzi == null || (drawable = (Drawable) ObjectWrapper.unwrap(zzi)) == null) {
                return;
            }
            ImageView imageView = new ImageView(context2);
            imageView.setImageDrawable(drawable);
            IObjectWrapper zzj = zzdpbVar != null ? zzdpbVar.zzj() : null;
            if (zzj != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfe)).booleanValue()) {
                    imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(zzj));
                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    viewGroup2.addView(imageView);
                }
            }
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(imageView);
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.zze.zzj("Could not get main image drawable");
        }
    }

    public final void zzc(zzdpb zzdpbVar) {
        if (zzdpbVar == null || this.zze == null || zzdpbVar.zzh() == null || !this.zzc.zzg()) {
            return;
        }
        try {
            zzdpbVar.zzh().addView(this.zze.zza());
        } catch (zzclt e) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
        }
    }

    public final void zzd(zzdpb zzdpbVar) {
        if (zzdpbVar == null) {
            return;
        }
        Context context = zzdpbVar.zzf().getContext();
        if (com.google.android.gms.ads.internal.util.zzbx.zzh(context, this.zzc.zza)) {
            if (!(context instanceof Activity)) {
                com.google.android.gms.ads.internal.util.zze.zze("Activity context is needed for policy validator.");
                return;
            }
            if (this.zzf == null || zzdpbVar.zzh() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.zzf.zza(zzdpbVar.zzh(), windowManager), com.google.android.gms.ads.internal.util.zzbx.zzb());
            } catch (zzclt e) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
            }
        }
    }

    public final void zze(final zzdpb zzdpbVar) {
        this.zzg.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdoe
            @Override // java.lang.Runnable
            public final void run() {
                zzdog.this.zzb(zzdpbVar);
            }
        });
    }

    public final boolean zzf(ViewGroup viewGroup) {
        return zzh(viewGroup, true);
    }

    private static void zzg(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }
}
