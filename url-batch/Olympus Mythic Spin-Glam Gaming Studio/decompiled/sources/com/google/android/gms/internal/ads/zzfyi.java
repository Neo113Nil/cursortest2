package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public class zzfyi {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    public zzfyi(@NonNull Context context, @NonNull Executor executor, @NonNull Task task, boolean z) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z;
    }

    public static zzfyi zza(@NonNull final Context context, @NonNull Executor executor, boolean z) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfye
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i = zzfyi.zza;
                    taskCompletionSource.setResult(zzgae.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfyg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i = zzfyi.zza;
                    TaskCompletionSource.this.setResult(zzgae.zzc());
                }
            });
        }
        return new zzfyi(context, executor, taskCompletionSource.getTask(), z);
    }

    static void zzg(int i) {
        zzf = i;
    }

    private final Task zzh(final int i, long j, Exception exc, String str, Map map, String str2) {
        if (!this.zze) {
            return this.zzd.continueWith(this.zzc, zzfyh.zza);
        }
        Context context = this.zzb;
        final zzaxg zza2 = zzaxk.zza();
        zza2.zza(context.getPackageName());
        zza2.zzb(j);
        zza2.zzg(zzf);
        if (exc != null) {
            int i2 = zzgvg.zza;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            zza2.zzc(stringWriter.toString());
            zza2.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zza2.zze(str2);
        }
        if (str != null) {
            zza2.zzf(str);
        }
        return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfyf
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Object then(Task task) {
                int i3 = zzfyi.zza;
                if (!task.isSuccessful()) {
                    return Boolean.FALSE;
                }
                int i4 = i;
                zzgad zza3 = ((zzgae) task.getResult()).zza(((zzaxk) zzaxg.this.zzbu()).zzaN());
                zza3.zzc(i4);
                zza3.zza();
                return Boolean.TRUE;
            }
        });
    }

    public Task zzb(int i, long j) {
        return zzh(i, j, null, null, null, null);
    }

    public Task zzc(int i, long j, Exception exc) {
        return zzh(i, j, exc, null, null, null);
    }

    public final Task zzd(int i, long j, String str, Map map) {
        return zzh(i, j, null, str, null, null);
    }

    public Task zze(int i, String str) {
        return zzh(i, 0L, null, null, null, str);
    }

    public final Task zzf(int i, long j, String str) {
        return zzh(i, j, null, null, null, str);
    }
}
