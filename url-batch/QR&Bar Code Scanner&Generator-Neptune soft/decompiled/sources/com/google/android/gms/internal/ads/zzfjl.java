package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfjl implements zzfjj {
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

    zzfjl(Context context, int i) {
        this.zza = context;
        this.zzl = i;
    }

    public final synchronized zzfjl zzA(int i) {
        this.zzm = i;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfjj
    public final /* bridge */ /* synthetic */ zzfjj zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzo(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfjj
    public final /* bridge */ /* synthetic */ zzfjj zzb(zzfdv zzfdvVar) {
        zzp(zzfdvVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfjj
    public final /* bridge */ /* synthetic */ zzfjj zzc(String str) {
        zzq(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfjj
    public final /* bridge */ /* synthetic */ zzfjj zzd(String str) {
        zzr(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfjj
    public final /* bridge */ /* synthetic */ zzfjj zze(boolean z) {
        zzs(z);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfjj
    public final /* bridge */ /* synthetic */ zzfjj zzf() {
        zzt();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfjj
    public final /* bridge */ /* synthetic */ zzfjj zzg() {
        zzu();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfjj
    public final synchronized boolean zzh() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzfjj
    public final boolean zzi() {
        return !TextUtils.isEmpty(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfjj
    public final synchronized zzfjn zzj() {
        zzfjm zzfjmVar = null;
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
        return new zzfjn(this, zzfjmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfjj
    public final /* bridge */ /* synthetic */ zzfjj zzk(int i) {
        zzA(i);
        return this;
    }

    public final synchronized zzfjl zzo(com.google.android.gms.ads.internal.client.zze zzeVar) {
        IBinder iBinder = zzeVar.zze;
        if (iBinder == null) {
            return this;
        }
        zzdct zzdctVar = (zzdct) iBinder;
        String zzk = zzdctVar.zzk();
        if (!TextUtils.isEmpty(zzk)) {
            this.zzf = zzk;
        }
        String zzi = zzdctVar.zzi();
        if (!TextUtils.isEmpty(zzi)) {
            this.zzg = zzi;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r2.zzg = r0.zzac;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized zzfjl zzp(zzfdv zzfdvVar) {
        if (!TextUtils.isEmpty(zzfdvVar.zzb.zzb)) {
            this.zzf = zzfdvVar.zzb.zzb;
        }
        Iterator it = zzfdvVar.zza.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfdk zzfdkVar = (zzfdk) it.next();
            if (!TextUtils.isEmpty(zzfdkVar.zzac)) {
                break;
            }
        }
        return this;
    }

    public final synchronized zzfjl zzq(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfjl zzr(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfjl zzs(boolean z) {
        this.zzd = z;
        return this;
    }

    public final synchronized zzfjl zzt() {
        Configuration configuration;
        this.zze = com.google.android.gms.ads.internal.zzt.zzq().zzl(this.zza);
        Resources resources = this.zza.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzn = i;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        this.zzk = true;
        return this;
    }

    public final synchronized zzfjl zzu() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        return this;
    }
}
