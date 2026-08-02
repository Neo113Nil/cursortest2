package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.work.WorkRequest;
import com.google.android.gms.common.util.Predicate;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbsz implements zzbsr, zzbsp {
    private final zzcmp zza;

    /* JADX WARN: Multi-variable type inference failed */
    public zzbsz(Context context, zzcgv zzcgvVar, zzape zzapeVar, com.google.android.gms.ads.internal.zza zzaVar) throws zzcna {
        com.google.android.gms.ads.internal.zzt.zzz();
        zzcmp zza = zzcnb.zza(context, zzcoe.zza(), "", false, false, null, null, zzcgvVar, null, null, null, zzbep.zza(), null, null);
        this.zza = zza;
        ((View) zza).setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        if (zzcgi.zzt()) {
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbta
    public final void zza(final String str) {
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsu
            @Override // java.lang.Runnable
            public final void run() {
                zzbsz.this.zzm(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbta
    public final /* synthetic */ void zzb(String str, String str2) {
        zzbso.zzc(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void zzc() {
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final /* synthetic */ void zzd(String str, Map map) {
        zzbso.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbso.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void zzf(final String str) {
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsv
            @Override // java.lang.Runnable
            public final void run() {
                zzbsz.this.zzn(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void zzg(final String str) {
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsx
            @Override // java.lang.Runnable
            public final void run() {
                zzbsz.this.zzo(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void zzh(String str) {
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsw
            @Override // java.lang.Runnable
            public final void run() {
                zzbsz.this.zzp(format);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final boolean zzi() {
        return this.zza.zzaB();
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final zzbty zzj() {
        return new zzbty(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void zzk(final zzbtf zzbtfVar) {
        final byte[] bArr = null;
        this.zza.zzP().zzF(new zzcob(bArr) { // from class: com.google.android.gms.internal.ads.zzbss
            @Override // com.google.android.gms.internal.ads.zzcob
            public final void zza() {
                zzbtf zzbtfVar2 = zzbtf.this;
                final zzbtw zzbtwVar = zzbtfVar2.zza;
                final zzbtv zzbtvVar = zzbtfVar2.zzb;
                final zzbsr zzbsrVar = zzbtfVar2.zzc;
                com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbte
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbtw.this.zzi(zzbtvVar, zzbsrVar);
                    }
                }, WorkRequest.MIN_BACKOFF_MILLIS);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbta
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbso.zzd(this, str, jSONObject);
    }

    final /* synthetic */ void zzm(String str) {
        this.zza.zza(str);
    }

    final /* synthetic */ void zzn(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    final /* synthetic */ void zzo(String str) {
        this.zza.loadUrl(str);
    }

    final /* synthetic */ void zzp(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.zzbtx
    public final void zzq(String str, zzbpu zzbpuVar) {
        this.zza.zzaf(str, new zzbsy(this, zzbpuVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbtx
    public final void zzr(String str, final zzbpu zzbpuVar) {
        this.zza.zzax(str, new Predicate() { // from class: com.google.android.gms.internal.ads.zzbst
            @Override // com.google.android.gms.common.util.Predicate
            public final boolean apply(Object obj) {
                zzbpu zzbpuVar2;
                zzbpu zzbpuVar3 = zzbpu.this;
                zzbpu zzbpuVar4 = (zzbpu) obj;
                if (!(zzbpuVar4 instanceof zzbsy)) {
                    return false;
                }
                zzbpuVar2 = ((zzbsy) zzbpuVar4).zzb;
                return zzbpuVar2.equals(zzbpuVar3);
            }
        });
    }
}
