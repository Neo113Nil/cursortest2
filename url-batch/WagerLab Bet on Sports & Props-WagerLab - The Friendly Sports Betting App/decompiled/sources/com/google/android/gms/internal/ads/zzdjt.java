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
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdjt {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzfdc zzc;
    private final zzdiz zzd;
    private final zzdiu zze;
    private final zzdkh zzf;
    private final zzdkp zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbfl zzj;
    private final zzdir zzk;

    public zzdjt(com.google.android.gms.ads.internal.util.zzg zzgVar, zzfdc zzfdcVar, zzdiz zzdizVar, zzdiu zzdiuVar, zzdkh zzdkhVar, zzdkp zzdkpVar, Executor executor, Executor executor2, zzdir zzdirVar) {
        this.zzb = zzgVar;
        this.zzc = zzfdcVar;
        this.zzj = zzfdcVar.zzj;
        this.zzd = zzdizVar;
        this.zze = zzdiuVar;
        this.zzf = zzdkhVar;
        this.zzg = zzdkpVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdirVar;
    }

    private final boolean zzi(ViewGroup viewGroup, boolean z) {
        View zzJ = z ? this.zze.zzJ() : this.zze.zzK();
        if (zzJ == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzJ.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzJ.getParent()).removeView(zzJ);
        }
        viewGroup.addView(zzJ, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzen)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    public final void zza(final zzdkr zzdkrVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzdjt.this.zzf(zzdkrVar);
            }
        });
    }

    public final void zzb(zzdkr zzdkrVar) {
        zzdkh zzdkhVar;
        if (zzdkrVar == null || (zzdkhVar = this.zzf) == null || zzdkrVar.zzdF() == null || !this.zzd.zzb()) {
            return;
        }
        try {
            zzdkrVar.zzdF().addView(zzdkhVar.zza());
        } catch (zzcez e) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
        }
    }

    public final void zzc(zzdkr zzdkrVar) {
        if (zzdkrVar == null) {
            return;
        }
        Context context = zzdkrVar.zzdJ().getContext();
        if (com.google.android.gms.ads.internal.util.zzbs.zzi(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Activity context is needed for policy validator.");
                return;
            }
            zzdkp zzdkpVar = this.zzg;
            if (zzdkpVar == null || zzdkrVar.zzdF() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(zzdkpVar.zza(zzdkrVar.zzdF(), windowManager), com.google.android.gms.ads.internal.util.zzbs.zzk());
            } catch (zzcez e) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
            }
        }
    }

    public final boolean zzd(ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }

    public final boolean zze(ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    final /* synthetic */ void zzf(zzdkr zzdkrVar) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        zzbft zza2;
        Drawable drawable;
        zzdiz zzdizVar = this.zzd;
        if (zzdizVar.zze() || zzdizVar.zzc()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            for (int i = 0; i < 2; i++) {
                View zzm = zzdkrVar.zzm(strArr[i]);
                if (zzm instanceof ViewGroup) {
                    viewGroup = (ViewGroup) zzm;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context = zzdkrVar.zzdJ().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdiu zzdiuVar = this.zze;
        if (zzdiuVar.zzA() != null) {
            view = zzdiuVar.zzA();
            zzbfl zzbflVar = this.zzj;
            if (zzbflVar != null && viewGroup == null) {
                zzh(layoutParams, zzbflVar.zze);
                view.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (zzdiuVar.zzz() instanceof zzbfe) {
            zzbfe zzbfeVar = (zzbfe) zzdiuVar.zzz();
            if (viewGroup == null) {
                zzh(layoutParams, zzbfeVar.zzi());
                viewGroup = null;
            }
            View zzbffVar = new zzbff(context, zzbfeVar, layoutParams);
            zzbffVar.setContentDescription((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzel));
            view = zzbffVar;
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
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdkrVar.zzdJ().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(view);
                FrameLayout zzdF = zzdkrVar.zzdF();
                if (zzdF != null) {
                    zzdF.addView(zzaVar);
                }
            }
            zzdkrVar.zzi(zzdkrVar.zzn(), view, true);
        }
        zzgjz zzgjzVar = zzdjp.zza;
        int size = zzgjzVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View zzm2 = zzdkrVar.zzm((String) zzgjzVar.get(i2));
            i2++;
            if (zzm2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) zzm2;
                break;
            }
        }
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzdjt.this.zzg(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (zzi(viewGroup2, true)) {
            if (zzdiuVar.zzT() != null) {
                zzdiuVar.zzT().zzaq(new zzdjq(zzdkrVar, viewGroup2));
                return;
            }
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkP)).booleanValue() && zzi(viewGroup2, false)) {
            if (zzdiuVar.zzU() != null) {
                zzdiuVar.zzU().zzaq(new zzdjq(zzdkrVar, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View zzdJ = zzdkrVar.zzdJ();
        Context context2 = zzdJ != null ? zzdJ.getContext() : null;
        if (context2 == null || (zza2 = this.zzk.zza()) == null) {
            return;
        }
        try {
            IObjectWrapper zzg = zza2.zzg();
            if (zzg == null || (drawable = (Drawable) ObjectWrapper.unwrap(zzg)) == null) {
                return;
            }
            ImageView imageView = new ImageView(context2);
            imageView.setImageDrawable(drawable);
            IObjectWrapper zzo = zzdkrVar.zzo();
            if (zzo == null || !((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgE)).booleanValue()) {
                imageView.setScaleType(zza);
            } else {
                imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(zzo));
            }
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(imageView);
        } catch (RemoteException unused) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not get main image drawable");
        }
    }

    final /* synthetic */ void zzg(ViewGroup viewGroup) {
        zzdiu zzdiuVar = this.zze;
        if (zzdiuVar.zzJ() != null) {
            boolean z = viewGroup != null;
            if (zzdiuVar.zzx() == 2 || zzdiuVar.zzx() == 1) {
                this.zzb.zzr(this.zzc.zzg, String.valueOf(zzdiuVar.zzx()), z);
            } else if (zzdiuVar.zzx() == 6) {
                com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
                String str = this.zzc.zzg;
                zzgVar.zzr(str, ExifInterface.GPS_MEASUREMENT_2D, z);
                zzgVar.zzr(str, "1", z);
            }
        }
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
