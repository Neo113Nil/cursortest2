package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
public abstract class zzats implements Comparable {
    private final zzaud zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;

    @Nullable
    @GuardedBy
    private final zzatw zzf;
    private Integer zzg;
    private zzatv zzh;

    @GuardedBy
    private boolean zzi;

    @Nullable
    private zzatb zzj;

    @GuardedBy
    private zzatr zzk;
    private final zzatg zzl;

    public zzats(int i, String str, @Nullable zzatw zzatwVar) {
        Uri parse;
        String host;
        this.zza = zzaud.zza ? new zzaud() : null;
        this.zze = new Object();
        int i2 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i;
        this.zzc = str;
        this.zzf = zzatwVar;
        this.zzl = new zzatg();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i2 = host.hashCode();
        }
        this.zzd = i2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzats) obj).zzg.intValue();
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzl();
        Integer num = this.zzg;
        String str = this.zzc;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(num).length();
        String concat = "0x".concat(valueOf);
        StringBuilder sb = new StringBuilder(length + 5 + concat.length() + 8 + length2);
        sb.append("[ ] ");
        sb.append(str);
        sb.append(" ");
        sb.append(concat);
        sb.append(" NORMAL ");
        sb.append(num);
        return sb.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final void zzc(String str) {
        if (zzaud.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    final void zzd(String str) {
        zzatv zzatvVar = this.zzh;
        if (zzatvVar != null) {
            zzatvVar.zzc(this);
        }
        if (zzaud.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzatq(this, str, id));
                return;
            }
            zzaud zzaudVar = this.zza;
            zzaudVar.zza(str, id);
            zzaudVar.zzb(toString());
        }
    }

    final void zze(int i) {
        zzatv zzatvVar = this.zzh;
        if (zzatvVar != null) {
            zzatvVar.zzd(this, i);
        }
    }

    public final zzats zzf(zzatv zzatvVar) {
        this.zzh = zzatvVar;
        return this;
    }

    public final zzats zzg(int i) {
        this.zzg = Integer.valueOf(i);
        return this;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final String zzi() {
        int i = this.zzb;
        String str = this.zzc;
        if (i == 0) {
            return str;
        }
        String num = Integer.toString(1);
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 1 + String.valueOf(str).length());
        sb.append(num);
        sb.append("-");
        sb.append(str);
        return sb.toString();
    }

    public final zzats zzj(zzatb zzatbVar) {
        this.zzj = zzatbVar;
        return this;
    }

    @Nullable
    public final zzatb zzk() {
        return this.zzj;
    }

    public final boolean zzl() {
        synchronized (this.zze) {
        }
        return false;
    }

    public Map zzm() throws zzata {
        return Collections.emptyMap();
    }

    public byte[] zzn() throws zzata {
        return null;
    }

    public final int zzo() {
        return this.zzl.zza();
    }

    public final void zzp() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    public final boolean zzq() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzi;
        }
        return z;
    }

    protected abstract zzaty zzr(zzato zzatoVar);

    protected abstract void zzs(Object obj);

    public final void zzt(zzaub zzaubVar) {
        zzatw zzatwVar;
        synchronized (this.zze) {
            zzatwVar = this.zzf;
        }
        zzatwVar.zza(zzaubVar);
    }

    final void zzu(zzatr zzatrVar) {
        synchronized (this.zze) {
            this.zzk = zzatrVar;
        }
    }

    final void zzv(zzaty zzatyVar) {
        zzatr zzatrVar;
        synchronized (this.zze) {
            zzatrVar = this.zzk;
        }
        if (zzatrVar != null) {
            zzatrVar.zza(this, zzatyVar);
        }
    }

    final void zzw() {
        zzatr zzatrVar;
        synchronized (this.zze) {
            zzatrVar = this.zzk;
        }
        if (zzatrVar != null) {
            zzatrVar.zzb(this);
        }
    }

    final /* synthetic */ zzaud zzx() {
        return this.zza;
    }

    public final zzatg zzy() {
        return this.zzl;
    }
}
