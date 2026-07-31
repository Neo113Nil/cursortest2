package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes5.dex */
public final class zzbms implements zzbmk, zzbmi {
    private final zzcek zza;

    public zzbms(Context context, VersionInfoParcel versionInfoParcel, zzauu zzauuVar, com.google.android.gms.ads.internal.zza zzaVar) throws zzcez {
        com.google.android.gms.ads.internal.zzt.zzd();
        zzcek zza = zzcfa.zza(context, zzcgt.zzb(), "", false, false, null, null, versionInfoParcel, null, null, null, zzbbh.zza(), null, null, null, null, null);
        this.zza = zza;
        zza.zzE().setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzbb.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzz()) {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (com.google.android.gms.ads.internal.util.zzs.zza.post(runnable)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzi("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmt
    public final void zza(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("invokeJavascript on adWebView from js");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbms.this.zzo(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final void zzf(String str) {
        String.valueOf(str);
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbms.this.zzp(format);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final void zzg(final String str) {
        String.valueOf(str);
        com.google.android.gms.ads.internal.util.zze.zza("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbms.this.zzr(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final void zzh(final String str) {
        com.google.android.gms.ads.internal.util.zze.zza("loadHtml on adWebView from html");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbms.this.zzq(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final void zzi(final zzbmj zzbmjVar) {
        zzcgi zzP = this.zza.zzP();
        Objects.requireNonNull(zzbmjVar);
        zzP.zzH(new zzcgh() { // from class: com.google.android.gms.internal.ads.zzbmm
            @Override // com.google.android.gms.internal.ads.zzcgh
            public final /* synthetic */ void zza() {
                zzbmj.this.zza();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final void zzj() {
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final boolean zzk() {
        return this.zza.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final zzbnr zzl() {
        return new zzbnr(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbnq
    public final void zzm(String str, zzbjl zzbjlVar) {
        this.zza.zzab(str, new zzbml(this, zzbjlVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbnq
    public final void zzn(String str, final zzbjl zzbjlVar) {
        this.zza.zzad(str, new Predicate() { // from class: com.google.android.gms.internal.ads.zzbmq
            @Override // com.google.android.gms.common.util.Predicate
            public final /* synthetic */ boolean apply(Object obj) {
                zzbjl zzbjlVar2 = (zzbjl) obj;
                if (zzbjlVar2 instanceof zzbml) {
                    return ((zzbml) zzbjlVar2).zzb().equals(zzbjl.this);
                }
                return false;
            }
        });
    }

    final /* synthetic */ void zzo(String str) {
        this.zza.zza(str);
    }

    final /* synthetic */ void zzp(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    final /* synthetic */ void zzq(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    final /* synthetic */ void zzr(String str) {
        this.zza.loadUrl(str);
    }
}
