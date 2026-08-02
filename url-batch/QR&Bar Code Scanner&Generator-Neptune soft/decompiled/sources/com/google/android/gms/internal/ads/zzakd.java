package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzakd implements Comparable {
    private final zzako zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzakh zzf;
    private Integer zzg;
    private zzakg zzh;
    private boolean zzi;
    private zzajm zzj;
    private zzakc zzk;
    private final zzajr zzl;

    public zzakd(int i, String str, zzakh zzakhVar) {
        Uri parse;
        String host;
        this.zza = zzako.zza ? new zzako() : null;
        this.zze = new Object();
        int i2 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i;
        this.zzc = str;
        this.zzf = zzakhVar;
        this.zzl = new zzajr();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i2 = host.hashCode();
        }
        this.zzd = i2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzakd) obj).zzg.intValue();
    }

    public final String toString() {
        String hexString = Integer.toHexString(this.zzd);
        zzw();
        return "[ ] " + this.zzc + " " + "0x".concat(String.valueOf(hexString)) + " NORMAL " + this.zzg;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.zzb();
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzajm zzd() {
        return this.zzj;
    }

    public final zzakd zze(zzajm zzajmVar) {
        this.zzj = zzajmVar;
        return this;
    }

    public final zzakd zzf(zzakg zzakgVar) {
        this.zzh = zzakgVar;
        return this;
    }

    public final zzakd zzg(int i) {
        this.zzg = Integer.valueOf(i);
        return this;
    }

    protected abstract zzakj zzh(zzajz zzajzVar);

    public final String zzj() {
        String str = this.zzc;
        if (this.zzb == 0) {
            return str;
        }
        return Integer.toString(1) + "-" + str;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() throws zzajl {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (zzako.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzakm zzakmVar) {
        zzakh zzakhVar;
        synchronized (this.zze) {
            zzakhVar = this.zzf;
        }
        if (zzakhVar != null) {
            zzakhVar.zza(zzakmVar);
        }
    }

    protected abstract void zzo(Object obj);

    final void zzp(String str) {
        zzakg zzakgVar = this.zzh;
        if (zzakgVar != null) {
            zzakgVar.zzb(this);
        }
        if (zzako.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzakb(this, str, id));
            } else {
                this.zza.zza(str, id);
                this.zza.zzb(toString());
            }
        }
    }

    public final void zzq() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    final void zzr() {
        zzakc zzakcVar;
        synchronized (this.zze) {
            zzakcVar = this.zzk;
        }
        if (zzakcVar != null) {
            zzakcVar.zza(this);
        }
    }

    final void zzs(zzakj zzakjVar) {
        zzakc zzakcVar;
        synchronized (this.zze) {
            zzakcVar = this.zzk;
        }
        if (zzakcVar != null) {
            zzakcVar.zzb(this, zzakjVar);
        }
    }

    final void zzt(int i) {
        zzakg zzakgVar = this.zzh;
        if (zzakgVar != null) {
            zzakgVar.zzc(this, i);
        }
    }

    final void zzu(zzakc zzakcVar) {
        synchronized (this.zze) {
            this.zzk = zzakcVar;
        }
    }

    public final boolean zzv() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzi;
        }
        return z;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() throws zzajl {
        return null;
    }

    public final zzajr zzy() {
        return this.zzl;
    }
}
