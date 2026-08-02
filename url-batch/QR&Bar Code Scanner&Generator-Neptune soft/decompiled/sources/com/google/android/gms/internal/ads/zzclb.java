package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public abstract class zzclb implements Releasable {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzclb(zzciy zzciyVar) {
        Context context = zzciyVar.getContext();
        this.zza = context;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzp().zzc(context, zzciyVar.zzp().zza);
        this.zzc = new WeakReference(zzciyVar);
    }

    static /* bridge */ /* synthetic */ void zza(zzclb zzclbVar, String str, Map map) {
        zzciy zzciyVar = (zzciy) zzclbVar.zzc.get();
        if (zzciyVar != null) {
            zzciyVar.zzd("onPrecacheEvent", map);
        }
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    public abstract void zzb();

    public final void zzc(String str, String str2, String str3, String str4) {
        zzcgi.zza.post(new zzcla(this, str, str2, str3, str4));
    }

    protected final void zzd(String str, String str2, int i) {
        zzcgi.zza.post(new zzcky(this, str, str2, i));
    }

    public final void zze(String str, String str2, long j) {
        zzcgi.zza.post(new zzckz(this, str, str2, j));
    }

    public final void zzf(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        zzcgi.zza.post(new zzckx(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    public final void zzg(String str, String str2, long j, long j2, boolean z, long j3, long j4, long j5, int i, int i2) {
        zzcgi.zza.post(new zzckw(this, str, str2, j, j2, j3, j4, j5, z, i, i2));
    }

    protected void zzh(int i) {
    }

    protected void zzn(int i) {
    }

    protected void zzo(int i) {
    }

    protected void zzp(int i) {
    }

    public abstract boolean zzq(String str);

    public boolean zzr(String str, String[] strArr) {
        return zzq(str);
    }

    public boolean zzs(String str, String[] strArr, zzckt zzcktVar) {
        return zzq(str);
    }
}
