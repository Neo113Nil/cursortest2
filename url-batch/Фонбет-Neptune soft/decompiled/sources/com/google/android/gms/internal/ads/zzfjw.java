package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfjw implements zzfju {
    private final Context zza;
    private final int zzp;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzq = 2;
    private int zzr = 2;
    private int zze = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private zzfkl zzj = zzfkl.SCAR_REQUEST_TYPE_UNSPECIFIED;
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private boolean zzn = false;
    private boolean zzo = false;

    zzfjw(Context context, int i) {
        this.zza = context;
        this.zzp = i;
    }

    public final synchronized zzfjw zzA() {
        this.zzc = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
        return this;
    }

    public final synchronized zzfjw zzK(int i) {
        this.zzq = i;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final /* bridge */ /* synthetic */ zzfju zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzr(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final /* bridge */ /* synthetic */ zzfju zzb(zzfew zzfewVar) {
        zzs(zzfewVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final /* bridge */ /* synthetic */ zzfju zzc(String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final /* bridge */ /* synthetic */ zzfju zzd(String str) {
        zzu(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final /* bridge */ /* synthetic */ zzfju zze(String str) {
        zzv(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final /* bridge */ /* synthetic */ zzfju zzf(zzfkl zzfklVar) {
        zzw(zzfklVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final /* bridge */ /* synthetic */ zzfju zzg(boolean z) {
        zzx(z);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final /* bridge */ /* synthetic */ zzfju zzh(Throwable th) {
        zzy(th);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final /* bridge */ /* synthetic */ zzfju zzi() {
        zzz();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final /* bridge */ /* synthetic */ zzfju zzj() {
        zzA();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final synchronized boolean zzk() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final synchronized zzfjy zzm() {
        zzfjx zzfjxVar = null;
        if (this.zzn) {
            return null;
        }
        this.zzn = true;
        if (!this.zzo) {
            zzz();
        }
        if (this.zzc < 0) {
            zzA();
        }
        return new zzfjy(this, zzfjxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final /* bridge */ /* synthetic */ zzfju zzn(int i) {
        zzK(i);
        return this;
    }

    public final synchronized zzfjw zzr(com.google.android.gms.ads.internal.client.zze zzeVar) {
        IBinder iBinder = zzeVar.zze;
        if (iBinder != null) {
            zzcwj zzcwjVar = (zzcwj) iBinder;
            String zzk = zzcwjVar.zzk();
            if (!TextUtils.isEmpty(zzk)) {
                this.zzf = zzk;
            }
            String zzi = zzcwjVar.zzi();
            if (!TextUtils.isEmpty(zzi)) {
                this.zzg = zzi;
            }
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r2.zzg = r0.zzab;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized zzfjw zzs(zzfew zzfewVar) {
        if (!TextUtils.isEmpty(zzfewVar.zzb.zzb)) {
            this.zzf = zzfewVar.zzb.zzb;
        }
        Iterator it = zzfewVar.zza.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfel zzfelVar = (zzfel) it.next();
            if (!TextUtils.isEmpty(zzfelVar.zzab)) {
                break;
            }
        }
        return this;
    }

    public final synchronized zzfjw zzt(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzhV)).booleanValue()) {
            this.zzm = str;
        }
        return this;
    }

    public final synchronized zzfjw zzu(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfjw zzv(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfjw zzw(zzfkl zzfklVar) {
        this.zzj = zzfklVar;
        return this;
    }

    public final synchronized zzfjw zzx(boolean z) {
        this.zzd = z;
        return this;
    }

    public final synchronized zzfjw zzy(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzhV)).booleanValue()) {
            this.zzl = zzbtq.zzf(th);
            this.zzk = (String) zzfvh.zzb(zzfui.zzc('\n')).zzc(zzbtq.zze(th)).iterator().next();
        }
        return this;
    }

    public final synchronized zzfjw zzz() {
        Configuration configuration;
        this.zze = com.google.android.gms.ads.internal.zzu.zzq().zzm(this.zza);
        Resources resources = this.zza.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzr = i;
        this.zzb = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
        this.zzo = true;
        return this;
    }
}
