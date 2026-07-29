package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfhi implements zzfhg {
    private final Context zza;
    private final int zzl;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzm = 2;
    private int zzn = 2;
    private int zze = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private boolean zzj = false;
    private boolean zzk = false;

    zzfhi(Context context, int i) {
        this.zza = context;
        this.zzl = i;
    }

    public final synchronized zzfhi zzA(int i) {
        this.zzm = i;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final /* bridge */ /* synthetic */ zzfhg zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzo(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final /* bridge */ /* synthetic */ zzfhg zzb(zzfbr zzfbrVar) {
        zzp(zzfbrVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final /* bridge */ /* synthetic */ zzfhg zzc(String str) {
        zzq(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final /* bridge */ /* synthetic */ zzfhg zzd(String str) {
        zzr(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final /* bridge */ /* synthetic */ zzfhg zze(boolean z) {
        zzs(z);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final /* bridge */ /* synthetic */ zzfhg zzf() {
        zzt();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final /* bridge */ /* synthetic */ zzfhg zzg() {
        zzu();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final synchronized boolean zzh() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final boolean zzi() {
        return !TextUtils.isEmpty(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final synchronized zzfhk zzj() {
        zzfhj zzfhjVar = null;
        if (this.zzj) {
            return null;
        }
        this.zzj = true;
        if (!this.zzk) {
            zzt();
        }
        if (this.zzc < 0) {
            zzu();
        }
        return new zzfhk(this, zzfhjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfhg
    public final /* bridge */ /* synthetic */ zzfhg zzk(int i) {
        zzA(i);
        return this;
    }

    public final synchronized zzfhi zzo(com.google.android.gms.ads.internal.client.zze zzeVar) {
        IBinder iBinder = zzeVar.zze;
        if (iBinder == null) {
            return this;
        }
        zzdbl zzdblVar = (zzdbl) iBinder;
        String zzj = zzdblVar.zzj();
        if (!TextUtils.isEmpty(zzj)) {
            this.zzf = zzj;
        }
        String zzh = zzdblVar.zzh();
        if (!TextUtils.isEmpty(zzh)) {
            this.zzg = zzh;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r2.zzg = r0.zzac;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized zzfhi zzp(zzfbr zzfbrVar) {
        if (!TextUtils.isEmpty(zzfbrVar.zzb.zzb)) {
            this.zzf = zzfbrVar.zzb.zzb;
        }
        Iterator it = zzfbrVar.zza.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfbg zzfbgVar = (zzfbg) it.next();
            if (!TextUtils.isEmpty(zzfbgVar.zzac)) {
                break;
            }
        }
        return this;
    }

    public final synchronized zzfhi zzq(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfhi zzr(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfhi zzs(boolean z) {
        this.zzd = z;
        return this;
    }

    public final synchronized zzfhi zzt() {
        Configuration configuration;
        this.zze = com.google.android.gms.ads.internal.zzt.zzq().zzk(this.zza);
        Resources resources = this.zza.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzn = i;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
        this.zzk = true;
        return this;
    }

    public final synchronized zzfhi zzu() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
        return this;
    }
}
