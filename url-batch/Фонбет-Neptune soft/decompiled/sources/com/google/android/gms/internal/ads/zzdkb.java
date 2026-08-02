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

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdkb {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzffg zzc;
    private final zzdjg zzd;
    private final zzdjb zze;
    private final zzdkn zzf;
    private final zzdkv zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbes zzj;
    private final zzdiy zzk;

    public zzdkb(com.google.android.gms.ads.internal.util.zzg zzgVar, zzffg zzffgVar, zzdjg zzdjgVar, zzdjb zzdjbVar, zzdkn zzdknVar, zzdkv zzdkvVar, Executor executor, Executor executor2, zzdiy zzdiyVar) {
        this.zzb = zzgVar;
        this.zzc = zzffgVar;
        this.zzj = zzffgVar.zzi;
        this.zzd = zzdjgVar;
        this.zze = zzdjbVar;
        this.zzf = zzdknVar;
        this.zzg = zzdkvVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdiyVar;
    }

    private final boolean zzi(ViewGroup viewGroup, boolean z) {
        View zzf = z ? this.zze.zzf() : this.zze.zzg();
        if (zzf == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzf.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzf.getParent()).removeView(zzf);
        }
        viewGroup.addView(zzf, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdw)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    final /* synthetic */ void zza(ViewGroup viewGroup) {
        zzdjb zzdjbVar = this.zze;
        if (zzdjbVar.zzf() != null) {
            boolean z = viewGroup != null;
            if (zzdjbVar.zzc() == 2 || zzdjbVar.zzc() == 1) {
                this.zzb.zzK(this.zzc.zzf, String.valueOf(zzdjbVar.zzc()), z);
            } else if (zzdjbVar.zzc() == 6) {
                this.zzb.zzK(this.zzc.zzf, "2", z);
                this.zzb.zzK(this.zzc.zzf, "1", z);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void zzb(zzdkx zzdkxVar) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        zzbfa zza2;
        Drawable drawable;
        if (this.zzd.zzf() || this.zzd.zze()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            for (int i = 0; i < 2; i++) {
                View zzg = zzdkxVar.zzg(strArr[i]);
                if (zzg != null && (zzg instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) zzg;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context = zzdkxVar.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdjb zzdjbVar = this.zze;
        if (zzdjbVar.zze() != null) {
            zzbes zzbesVar = this.zzj;
            view = zzdjbVar.zze();
            if (zzbesVar != null && viewGroup == null) {
                zzh(layoutParams, zzbesVar.zze);
                view.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (zzdjbVar.zzl() instanceof zzben) {
            zzben zzbenVar = (zzben) zzdjbVar.zzl();
            if (viewGroup == null) {
                zzh(layoutParams, zzbenVar.zzc());
                viewGroup = null;
            }
            View zzbeoVar = new zzbeo(context, zzbenVar, layoutParams);
            zzbeoVar.setContentDescription((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdu));
            view = zzbeoVar;
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
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdkxVar.zzf().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(view);
                FrameLayout zzh = zzdkxVar.zzh();
                if (zzh != null) {
                    zzh.addView(zzaVar);
                }
            }
            zzdkxVar.zzq(zzdkxVar.zzk(), view, true);
        }
        zzfxr zzfxrVar = zzdjx.zza;
        int size = zzfxrVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View zzg2 = zzdkxVar.zzg((String) zzfxrVar.get(i2));
            i2++;
            if (zzg2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) zzg2;
                break;
            }
        }
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjy
            @Override // java.lang.Runnable
            public final void run() {
                zzdkb.this.zza(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (zzi(viewGroup2, true)) {
            zzdjb zzdjbVar2 = this.zze;
            if (zzdjbVar2.zzs() != null) {
                zzdjbVar2.zzs().zzar(new zzdka(zzdkxVar, viewGroup2));
                return;
            }
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjf)).booleanValue() && zzi(viewGroup2, false)) {
            zzdjb zzdjbVar3 = this.zze;
            if (zzdjbVar3.zzq() != null) {
                zzdjbVar3.zzq().zzar(new zzdka(zzdkxVar, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View zzf = zzdkxVar.zzf();
        Context context2 = zzf != null ? zzf.getContext() : null;
        if (context2 == null || (zza2 = this.zzk.zza()) == null) {
            return;
        }
        try {
            IObjectWrapper zzi = zza2.zzi();
            if (zzi == null || (drawable = (Drawable) ObjectWrapper.unwrap(zzi)) == null) {
                return;
            }
            ImageView imageView = new ImageView(context2);
            imageView.setImageDrawable(drawable);
            IObjectWrapper zzj = zzdkxVar.zzj();
            if (zzj != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfA)).booleanValue()) {
                    imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(zzj));
                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    viewGroup2.addView(imageView);
                }
            }
            imageView.setScaleType(zza);
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(imageView);
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not get main image drawable");
        }
    }

    public final void zzc(zzdkx zzdkxVar) {
        if (zzdkxVar == null || this.zzf == null || zzdkxVar.zzh() == null || !this.zzd.zzg()) {
            return;
        }
        try {
            zzdkxVar.zzh().addView(this.zzf.zza());
        } catch (zzcev e) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
        }
    }

    public final void zzd(zzdkx zzdkxVar) {
        if (zzdkxVar == null) {
            return;
        }
        Context context = zzdkxVar.zzf().getContext();
        if (com.google.android.gms.ads.internal.util.zzbv.zzh(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Activity context is needed for policy validator.");
                return;
            }
            if (this.zzg == null || zzdkxVar.zzh() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.zzg.zza(zzdkxVar.zzh(), windowManager), com.google.android.gms.ads.internal.util.zzbv.zzb());
            } catch (zzcev e) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
            }
        }
    }

    public final void zze(final zzdkx zzdkxVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjz
            @Override // java.lang.Runnable
            public final void run() {
                zzdkb.this.zzb(zzdkxVar);
            }
        });
    }

    public final boolean zzf(ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    public final boolean zzg(ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i) {
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
