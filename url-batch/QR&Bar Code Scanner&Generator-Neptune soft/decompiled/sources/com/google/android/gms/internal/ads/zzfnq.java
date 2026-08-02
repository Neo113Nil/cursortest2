package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfnq {
    private final Context zza;
    private final Executor zzb;
    private final zzfmx zzc;
    private final zzfmz zzd;
    private final zzfnp zze;
    private final zzfnp zzf;
    private Task zzg;
    private Task zzh;

    zzfnq(Context context, Executor executor, zzfmx zzfmxVar, zzfmz zzfmzVar, zzfnn zzfnnVar, zzfno zzfnoVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfmxVar;
        this.zzd = zzfmzVar;
        this.zze = zzfnnVar;
        this.zzf = zzfnoVar;
    }

    public static zzfnq zze(Context context, Executor executor, zzfmx zzfmxVar, zzfmz zzfmzVar) {
        final zzfnq zzfnqVar = new zzfnq(context, executor, zzfmxVar, zzfmzVar, new zzfnn(), new zzfno());
        if (zzfnqVar.zzd.zzd()) {
            zzfnqVar.zzg = zzfnqVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzfnk
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzfnq.this.zzc();
                }
            });
        } else {
            zzfnqVar.zzg = Tasks.forResult(zzfnqVar.zze.zza());
        }
        zzfnqVar.zzh = zzfnqVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzfnl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzfnq.this.zzd();
            }
        });
        return zzfnqVar;
    }

    private static zzana zzg(Task task, zzana zzanaVar) {
        return !task.isSuccessful() ? zzanaVar : (zzana) task.getResult();
    }

    private final Task zzh(Callable callable) {
        return Tasks.call(this.zzb, callable).addOnFailureListener(this.zzb, new OnFailureListener() { // from class: com.google.android.gms.internal.ads.zzfnm
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzfnq.this.zzf(exc);
            }
        });
    }

    public final zzana zza() {
        return zzg(this.zzg, this.zze.zza());
    }

    public final zzana zzb() {
        return zzg(this.zzh, this.zzf.zza());
    }

    final /* synthetic */ zzana zzc() throws Exception {
        Context context = this.zza;
        zzamk zza = zzana.zza();
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
        String id = advertisingIdInfo.getId();
        if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(id);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            id = Base64.encodeToString(bArr, 11);
        }
        if (id != null) {
            zza.zzs(id);
            zza.zzr(advertisingIdInfo.isLimitAdTrackingEnabled());
            zza.zzab(6);
        }
        return (zzana) zza.zzam();
    }

    final /* synthetic */ zzana zzd() throws Exception {
        Context context = this.zza;
        return zzfnf.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    final /* synthetic */ void zzf(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1L, exc);
    }
}
