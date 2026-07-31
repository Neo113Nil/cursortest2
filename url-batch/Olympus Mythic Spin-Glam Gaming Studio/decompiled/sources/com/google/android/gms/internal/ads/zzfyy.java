package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzfyy {
    private final Context zza;
    private final Executor zzb;
    private final zzfyi zzc;
    private final zzfyx zzd;
    private Task zze;

    @VisibleForTesting
    zzfyy(Context context, Executor executor, zzfyi zzfyiVar, zzfyk zzfykVar, zzfyu zzfyuVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfyiVar;
        this.zzd = zzfyuVar;
    }

    public static zzfyy zza(@NonNull Context context, @NonNull Executor executor, @NonNull zzfyi zzfyiVar, @NonNull zzfyk zzfykVar) {
        final zzfyy zzfyyVar = new zzfyy(context, executor, zzfyiVar, zzfykVar, new zzfyu());
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzfyw
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfyy.this.zzc();
            }
        };
        Executor executor2 = zzfyyVar.zzb;
        zzfyyVar.zze = Tasks.call(executor2, callable).addOnFailureListener(executor2, new OnFailureListener() { // from class: com.google.android.gms.internal.ads.zzfyv
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final /* synthetic */ void onFailure(Exception exc) {
                zzfyy.this.zzd(exc);
            }
        });
        return zzfyyVar;
    }

    public final zzaza zzb() {
        zzfyx zzfyxVar = this.zzd;
        Task task = this.zze;
        return !task.isSuccessful() ? zzfyxVar.zza() : (zzaza) task.getResult();
    }

    final /* synthetic */ zzaza zzc() {
        Context context = this.zza;
        return zzfyp.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    final /* synthetic */ void zzd(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1L, exc);
    }
}
