package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfqc {
    public static zzfzp zza(Task task) {
        final zzfqb zzfqbVar = new zzfqb(task);
        task.addOnCompleteListener(zzfzw.zzb(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfqa
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                zzfqb zzfqbVar2 = zzfqb.this;
                if (task2.isCanceled()) {
                    zzfqbVar2.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzfqbVar2.zzd(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception == null) {
                    throw new IllegalStateException();
                }
                zzfqbVar2.zze(exception);
            }
        });
        return zzfqbVar;
    }
}
