package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfnr implements zzfms {
    private static final zzfnr zza = new zzfnr();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzk = new zzfnn();
    private static final Runnable zzl = new zzfno();
    private int zze;
    private long zzj;
    private final List zzd = new ArrayList();
    private final List zzf = new ArrayList();
    private final zzfnk zzh = new zzfnk();
    private final zzfmu zzg = new zzfmu();
    private final zzfnl zzi = new zzfnl(new zzfnu());

    zzfnr() {
    }

    public static zzfnr zzb() {
        return zza;
    }

    private final void zzk(View view, zzfmt zzfmtVar, JSONObject jSONObject, int i, boolean z) {
        zzfmtVar.zzb(view, jSONObject, this, i == 1, z);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zzl);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfms
    public final void zza(View view, zzfmt zzfmtVar, JSONObject jSONObject, boolean z) {
        zzfnk zzfnkVar;
        int zzl2;
        boolean z2;
        zzfnr zzfnrVar;
        View view2;
        zzfmt zzfmtVar2;
        boolean z3;
        if (zzfni.zza(view) != null || (zzl2 = (zzfnkVar = this.zzh).zzl(view)) == 3) {
            return;
        }
        JSONObject zza2 = zzfmtVar.zza(view);
        zzfnd.zze(jSONObject, zza2);
        String zzg = zzfnkVar.zzg(view);
        if (zzg != null) {
            zzfnd.zzd(zza2, zzg);
            try {
                zza2.put("hasWindowFocus", Boolean.valueOf(this.zzh.zzj(view)));
            } catch (JSONException e) {
                zzfne.zza("Error with setting has window focus", e);
            }
            Boolean valueOf = Boolean.valueOf(this.zzh.zzk(zzg));
            if (valueOf.booleanValue()) {
                try {
                    zza2.put("isPipActive", valueOf);
                } catch (JSONException e2) {
                    zzfne.zza("Error with setting is picture-in-picture active", e2);
                }
            }
            this.zzh.zzf();
            zzfnrVar = this;
        } else {
            zzfnj zzi = zzfnkVar.zzi(view);
            if (zzi != null) {
                zzfmk zzb2 = zzi.zzb();
                JSONArray jSONArray = new JSONArray();
                ArrayList zzc2 = zzi.zzc();
                int size = zzc2.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put((String) zzc2.get(i));
                }
                try {
                    zza2.put("isFriendlyObstructionFor", jSONArray);
                    zza2.put("friendlyObstructionClass", zzb2.zzb());
                    zza2.put("friendlyObstructionPurpose", zzb2.zzc());
                    zza2.put("friendlyObstructionReason", zzb2.zzd());
                } catch (JSONException e3) {
                    zzfne.zza("Error with setting friendly obstruction", e3);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || z2) {
                zzfnrVar = this;
                view2 = view;
                zzfmtVar2 = zzfmtVar;
                z3 = true;
            } else {
                view2 = view;
                zzfmtVar2 = zzfmtVar;
                z3 = false;
                zzfnrVar = this;
            }
            zzfnrVar.zzk(view2, zzfmtVar2, zza2, zzl2, z3);
        }
        zzfnrVar.zze++;
    }

    public final void zzc() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzk);
            zzc.postDelayed(zzl, 200L);
        }
    }

    public final void zzd() {
        zzl();
        this.zzd.clear();
        zzb.post(new zzfnm(this));
    }

    public final void zze() {
        zzl();
    }

    final /* synthetic */ void zzf() {
        zzfnr zzfnrVar;
        this.zze = 0;
        this.zzf.clear();
        for (zzfln zzflnVar : zzfmh.zza().zzf()) {
        }
        this.zzj = System.nanoTime();
        zzfnk zzfnkVar = this.zzh;
        zzfnkVar.zzd();
        zzfmu zzfmuVar = this.zzg;
        long nanoTime = System.nanoTime();
        zzfmt zza2 = zzfmuVar.zza();
        if (zzfnkVar.zzb().size() > 0) {
            Iterator it = zzfnkVar.zzb().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject zza3 = zza2.zza(null);
                View zzh = zzfnkVar.zzh(str);
                zzfmt zzb2 = zzfmuVar.zzb();
                String zzc2 = zzfnkVar.zzc(str);
                if (zzc2 != null) {
                    JSONObject zza4 = zzb2.zza(zzh);
                    zzfnd.zzd(zza4, str);
                    try {
                        zza4.put("notVisibleReason", zzc2);
                    } catch (JSONException e) {
                        zzfne.zza("Error with setting not visible reason", e);
                    }
                    zzfnd.zze(zza3, zza4);
                }
                zzfnd.zzf(zza3);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                this.zzi.zzb(zza3, hashSet, nanoTime);
            }
        }
        zzfnk zzfnkVar2 = this.zzh;
        if (zzfnkVar2.zza().size() > 0) {
            JSONObject zza5 = zza2.zza(null);
            zzfnrVar = this;
            zzfnrVar.zzk(null, zza2, zza5, 1, false);
            zzfnd.zzf(zza5);
            zzfnrVar.zzi.zza(zza5, zzfnkVar2.zza(), nanoTime);
        } else {
            zzfnrVar = this;
            zzfnrVar.zzi.zzc();
        }
        zzfnkVar2.zze();
        long nanoTime2 = System.nanoTime() - zzfnrVar.zzj;
        List<zzfnq> list = zzfnrVar.zzd;
        if (list.size() > 0) {
            for (zzfnq zzfnqVar : list) {
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfnqVar.zzb();
                if (zzfnqVar instanceof zzfnp) {
                    ((zzfnp) zzfnqVar).zza();
                }
            }
        }
        zzfmr.zza().zzc();
    }

    final /* synthetic */ zzfnl zzh() {
        return this.zzi;
    }
}
