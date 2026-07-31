package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzbyp {
    private final Clock zza;
    private final zzbyz zzb;
    private final String zze;
    private final String zzf;
    private final Object zzd = new Object();
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = 0;
    private long zzj = -1;
    private long zzk = -1;
    private final LinkedList zzc = new LinkedList();

    zzbyp(Clock clock, zzbyz zzbyzVar, String str, String str2) {
        this.zza = clock;
        this.zzb = zzbyzVar;
        this.zze = str;
        this.zzf = str2;
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        synchronized (this.zzd) {
            long elapsedRealtime = this.zza.elapsedRealtime();
            this.zzj = elapsedRealtime;
            this.zzb.zzf(zzmVar, elapsedRealtime);
        }
    }

    public final void zzb() {
        synchronized (this.zzd) {
            this.zzb.zzg();
        }
    }

    public final void zzc() {
        synchronized (this.zzd) {
            this.zzb.zzh();
        }
    }

    public final void zzd(long j) {
        synchronized (this.zzd) {
            this.zzk = j;
            if (j != -1) {
                this.zzb.zzb(this);
            }
        }
    }

    public final void zze() {
        synchronized (this.zzd) {
            if (this.zzk != -1 && this.zzg == -1) {
                this.zzg = this.zza.elapsedRealtime();
                this.zzb.zzb(this);
            }
            this.zzb.zze();
        }
    }

    public final void zzf() {
        synchronized (this.zzd) {
            if (this.zzk != -1) {
                zzbyo zzbyoVar = new zzbyo(this);
                zzbyoVar.zzc();
                this.zzc.add(zzbyoVar);
                this.zzi++;
                zzbyz zzbyzVar = this.zzb;
                zzbyzVar.zzd();
                zzbyzVar.zzb(this);
            }
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            if (this.zzk != -1) {
                LinkedList linkedList = this.zzc;
                if (!linkedList.isEmpty()) {
                    zzbyo zzbyoVar = (zzbyo) linkedList.getLast();
                    if (zzbyoVar.zza() == -1) {
                        zzbyoVar.zzb();
                        this.zzb.zzb(this);
                    }
                }
            }
        }
    }

    public final void zzh(boolean z) {
        synchronized (this.zzd) {
            if (this.zzk != -1) {
                this.zzh = this.zza.elapsedRealtime();
            }
        }
    }

    public final Bundle zzi() {
        Bundle bundle;
        synchronized (this.zzd) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.zze);
            bundle.putString("slotid", this.zzf);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.zzj);
            bundle.putLong("tresponse", this.zzk);
            bundle.putLong("timp", this.zzg);
            bundle.putLong("tload", this.zzh);
            bundle.putLong("pcc", this.zzi);
            bundle.putLong("tfetch", -1L);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                arrayList.add(((zzbyo) it.next()).zzd());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    public final String zzj() {
        return this.zze;
    }

    final /* synthetic */ Clock zzk() {
        return this.zza;
    }
}
