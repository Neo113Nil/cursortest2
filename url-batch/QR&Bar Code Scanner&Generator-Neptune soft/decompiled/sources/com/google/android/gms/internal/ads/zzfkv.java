package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfkv extends zzfkr {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final zzfkt zzb;
    private final zzfks zzc;
    private zzfmp zze;
    private zzfls zzf;
    private final List zzd = new ArrayList();
    private boolean zzg = false;
    private boolean zzh = false;
    private final String zzi = UUID.randomUUID().toString();

    zzfkv(zzfks zzfksVar, zzfkt zzfktVar) {
        this.zzc = zzfksVar;
        this.zzb = zzfktVar;
        zzk(null);
        if (zzfktVar.zzd() == zzfku.HTML || zzfktVar.zzd() == zzfku.JAVASCRIPT) {
            this.zzf = new zzflt(zzfktVar.zza());
        } else {
            this.zzf = new zzflv(zzfktVar.zzi(), null);
        }
        this.zzf.zzj();
        zzflg.zza().zzd(this);
        zzfll.zza().zzd(this.zzf.zza(), zzfksVar.zzb());
    }

    private final void zzk(View view) {
        this.zze = new zzfmp(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfkr
    public final void zzb(View view, zzfkx zzfkxVar, String str) {
        zzfli zzfliVar;
        if (this.zzh) {
            return;
        }
        if (!zza.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        Iterator it = this.zzd.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzfliVar = null;
                break;
            } else {
                zzfliVar = (zzfli) it.next();
                if (zzfliVar.zzb().get() == view) {
                    break;
                }
            }
        }
        if (zzfliVar == null) {
            this.zzd.add(new zzfli(view, zzfkxVar, "Ad overlay"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfkr
    public final void zzc() {
        if (this.zzh) {
            return;
        }
        this.zze.clear();
        if (!this.zzh) {
            this.zzd.clear();
        }
        this.zzh = true;
        zzfll.zza().zzc(this.zzf.zza());
        zzflg.zza().zze(this);
        this.zzf.zzc();
        this.zzf = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfkr
    public final void zzd(View view) {
        if (this.zzh || zzf() == view) {
            return;
        }
        zzk(view);
        this.zzf.zzb();
        Collection<zzfkv> zzc = zzflg.zza().zzc();
        if (zzc == null || zzc.isEmpty()) {
            return;
        }
        for (zzfkv zzfkvVar : zzc) {
            if (zzfkvVar != this && zzfkvVar.zzf() == view) {
                zzfkvVar.zze.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfkr
    public final void zze() {
        if (this.zzg) {
            return;
        }
        this.zzg = true;
        zzflg.zza().zzf(this);
        this.zzf.zzh(zzflm.zzb().zza());
        this.zzf.zzf(this, this.zzb);
    }

    public final View zzf() {
        return (View) this.zze.get();
    }

    public final zzfls zzg() {
        return this.zzf;
    }

    public final String zzh() {
        return this.zzi;
    }

    public final List zzi() {
        return this.zzd;
    }

    public final boolean zzj() {
        return this.zzg && !this.zzh;
    }
}
