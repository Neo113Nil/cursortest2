package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfmi implements zzfln {
    private static final zzfmi zza = new zzfmi();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzd = new zzfme();
    private static final Runnable zze = new zzfmf();
    private int zzg;
    private long zzm;
    private final List zzf = new ArrayList();
    private boolean zzh = false;
    private final List zzi = new ArrayList();
    private final zzfmb zzk = new zzfmb();
    private final zzflp zzj = new zzflp();
    private final zzfmc zzl = new zzfmc(new zzfml());

    zzfmi() {
    }

    public static zzfmi zzd() {
        return zza;
    }

    static /* bridge */ /* synthetic */ void zzg(zzfmi zzfmiVar) {
        zzfmiVar.zzg = 0;
        zzfmiVar.zzi.clear();
        zzfmiVar.zzh = false;
        for (zzfkv zzfkvVar : zzflg.zza().zzb()) {
        }
        zzfmiVar.zzm = System.nanoTime();
        zzfmiVar.zzk.zzi();
        long nanoTime = System.nanoTime();
        zzflo zza2 = zzfmiVar.zzj.zza();
        if (zzfmiVar.zzk.zze().size() > 0) {
            Iterator it = zzfmiVar.zzk.zze().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject zza3 = zzflw.zza(0, 0, 0, 0);
                View zza4 = zzfmiVar.zzk.zza(str);
                zzflo zzb2 = zzfmiVar.zzj.zzb();
                String zzc2 = zzfmiVar.zzk.zzc(str);
                if (zzc2 != null) {
                    JSONObject zza5 = zzb2.zza(zza4);
                    zzflw.zzb(zza5, str);
                    zzflw.zzf(zza5, zzc2);
                    zzflw.zzc(zza3, zza5);
                }
                zzflw.zzi(zza3);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfmiVar.zzl.zzc(zza3, hashSet, nanoTime);
            }
        }
        if (zzfmiVar.zzk.zzf().size() > 0) {
            JSONObject zza6 = zzflw.zza(0, 0, 0, 0);
            zzfmiVar.zzk(null, zza2, zza6, 1, false);
            zzflw.zzi(zza6);
            zzfmiVar.zzl.zzd(zza6, zzfmiVar.zzk.zzf(), nanoTime);
            boolean z = zzfmiVar.zzh;
        } else {
            zzfmiVar.zzl.zzb();
        }
        zzfmiVar.zzk.zzg();
        long nanoTime2 = System.nanoTime() - zzfmiVar.zzm;
        if (zzfmiVar.zzf.size() > 0) {
            for (zzfmh zzfmhVar : zzfmiVar.zzf) {
                int i = zzfmiVar.zzg;
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfmhVar.zzb();
                if (zzfmhVar instanceof zzfmg) {
                    int i2 = zzfmiVar.zzg;
                    ((zzfmg) zzfmhVar).zza();
                }
            }
        }
    }

    private final void zzk(View view, zzflo zzfloVar, JSONObject jSONObject, int i, boolean z) {
        zzfloVar.zzb(view, jSONObject, this, i == 1, z);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final void zza(View view, zzflo zzfloVar, JSONObject jSONObject, boolean z) {
        int zzk;
        boolean z2;
        if (zzflz.zzb(view) != null || (zzk = this.zzk.zzk(view)) == 3) {
            return;
        }
        JSONObject zza2 = zzfloVar.zza(view);
        zzflw.zzc(jSONObject, zza2);
        String zzd2 = this.zzk.zzd(view);
        if (zzd2 != null) {
            zzflw.zzb(zza2, zzd2);
            zzflw.zze(zza2, Boolean.valueOf(this.zzk.zzj(view)));
            this.zzk.zzh();
        } else {
            zzfma zzb2 = this.zzk.zzb(view);
            if (zzb2 != null) {
                zzflw.zzd(zza2, zzb2);
                z2 = true;
            } else {
                z2 = false;
            }
            zzk(view, zzfloVar, zza2, zzk, z || z2);
        }
        this.zzg++;
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200L);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzfmd(this));
    }
}
