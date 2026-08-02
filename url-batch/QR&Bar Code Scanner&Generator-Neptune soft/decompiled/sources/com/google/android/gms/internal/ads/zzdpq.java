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

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdpq {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final zzfef zzb;
    private final zzdov zzc;
    private final zzdoq zzd;
    private final zzdqb zze;
    private final zzdqj zzf;
    private final Executor zzg;
    private final Executor zzh;
    private final zzbls zzi;
    private final zzdon zzj;

    public zzdpq(com.google.android.gms.ads.internal.util.zzg zzgVar, zzfef zzfefVar, zzdov zzdovVar, zzdoq zzdoqVar, zzdqb zzdqbVar, zzdqj zzdqjVar, Executor executor, Executor executor2, zzdon zzdonVar) {
        this.zza = zzgVar;
        this.zzb = zzfefVar;
        this.zzi = zzfefVar.zzi;
        this.zzc = zzdovVar;
        this.zzd = zzdoqVar;
        this.zze = zzdqbVar;
        this.zzf = zzdqjVar;
        this.zzg = executor;
        this.zzh = executor2;
        this.zzj = zzdonVar;
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
        viewGroup.addView(zzf, ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcX)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    final /* synthetic */ void zza(ViewGroup viewGroup) {
        boolean z = viewGroup != null;
        zzdoq zzdoqVar = this.zzd;
        if (zzdoqVar.zzf() != null) {
            if (zzdoqVar.zzc() == 2 || zzdoqVar.zzc() == 1) {
                this.zza.zzI(this.zzb.zzf, String.valueOf(zzdoqVar.zzc()), z);
            } else if (zzdoqVar.zzc() == 6) {
                this.zza.zzI(this.zzb.zzf, "2", z);
                this.zza.zzI(this.zzb.zzf, "1", z);
            }
        }
    }

    final /* synthetic */ void zzb(zzdql zzdqlVar) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        zzbmb zza;
        Drawable drawable;
        if (this.zzc.zzf() || this.zzc.zze()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            for (int i = 0; i < 2; i++) {
                View zzg = zzdqlVar.zzg(strArr[i]);
                if (zzg != null && (zzg instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) zzg;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context = zzdqlVar.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdoq zzdoqVar = this.zzd;
        if (zzdoqVar.zze() != null) {
            view = zzdoqVar.zze();
            zzbls zzblsVar = this.zzi;
            if (zzblsVar != null && viewGroup == null) {
                zzg(layoutParams, zzblsVar.zze);
                view.setLayoutParams(layoutParams);
            }
        } else if (zzdoqVar.zzl() instanceof zzbln) {
            zzbln zzblnVar = (zzbln) zzdoqVar.zzl();
            if (viewGroup == null) {
                zzg(layoutParams, zzblnVar.zzc());
            }
            View zzbloVar = new zzblo(context, zzblnVar, layoutParams);
            zzbloVar.setContentDescription((CharSequence) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcV));
            view = zzbloVar;
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
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdqlVar.zzf().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(view);
                FrameLayout zzh = zzdqlVar.zzh();
                if (zzh != null) {
                    zzh.addView(zzaVar);
                }
            }
            zzdqlVar.zzq(zzdqlVar.zzk(), view, true);
        }
        zzfvn zzfvnVar = zzdpm.zza;
        int size = zzfvnVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View zzg2 = zzdqlVar.zzg((String) zzfvnVar.get(i2));
            i2++;
            if (zzg2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) zzg2;
                break;
            }
        }
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpn
            @Override // java.lang.Runnable
            public final void run() {
                zzdpq.this.zza(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (zzh(viewGroup2, true)) {
            zzdoq zzdoqVar2 = this.zzd;
            if (zzdoqVar2.zzr() != null) {
                zzdoqVar2.zzr().zzaq(new zzdpp(zzdqlVar, viewGroup2));
                return;
            }
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzik)).booleanValue() && zzh(viewGroup2, false)) {
            zzdoq zzdoqVar3 = this.zzd;
            if (zzdoqVar3.zzp() != null) {
                zzdoqVar3.zzp().zzaq(new zzdpp(zzdqlVar, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View zzf = zzdqlVar.zzf();
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
            IObjectWrapper zzj = zzdqlVar != null ? zzdqlVar.zzj() : null;
            if (zzj != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfl)).booleanValue()) {
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

    public final void zzc(zzdql zzdqlVar) {
        if (zzdqlVar == null || this.zze == null || zzdqlVar.zzh() == null || !this.zzc.zzg()) {
            return;
        }
        try {
            zzdqlVar.zzh().addView(this.zze.zza());
        } catch (zzcna e) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
        }
    }

    public final void zzd(zzdql zzdqlVar) {
        if (zzdqlVar == null) {
            return;
        }
        Context context = zzdqlVar.zzf().getContext();
        if (com.google.android.gms.ads.internal.util.zzbx.zzh(context, this.zzc.zza)) {
            if (!(context instanceof Activity)) {
                com.google.android.gms.ads.internal.util.zze.zze("Activity context is needed for policy validator.");
                return;
            }
            if (this.zzf == null || zzdqlVar.zzh() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.zzf.zza(zzdqlVar.zzh(), windowManager), com.google.android.gms.ads.internal.util.zzbx.zzb());
            } catch (zzcna e) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
            }
        }
    }

    public final void zze(final zzdql zzdqlVar) {
        this.zzg.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpo
            @Override // java.lang.Runnable
            public final void run() {
                zzdpq.this.zzb(zzdqlVar);
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
