package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfvt extends zzfvl {
    private final ExecutorService zzb;
    private final zzfvs zzc;
    private final Function zzd;

    public zzfvt(File file, ExecutorService executorService, zzfvs zzfvsVar, Function function) {
        super(file);
        this.zzb = executorService;
        this.zzc = zzfvsVar;
        this.zzd = function;
    }

    @Override // com.google.android.gms.internal.ads.zzfvl
    public final ListenableFuture zzb() {
        return zzgot.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzfvq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfvt.this.zzd();
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfvl
    public final ListenableFuture zzc(final Object obj) {
        return zzgot.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzfvp
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzfvt.this.zze(obj);
                return null;
            }
        }, this.zzb);
    }

    final /* synthetic */ Object zzd() {
        Object apply;
        Object zzb;
        synchronized (this) {
            try {
                FileInputStream fileInputStream = new FileInputStream(this.zza);
                try {
                    zzb = this.zzc.zzb(fileInputStream);
                    fileInputStream.close();
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (zzfvo e) {
                apply = this.zzd.apply(e);
                return apply;
            } catch (FileNotFoundException unused) {
                apply = this.zzc.zzc();
                return apply;
            } catch (IOException e2) {
                apply = this.zzd.apply(new zzfvo(e2));
                return apply;
            }
        }
        return zzb;
    }

    final /* synthetic */ Void zze(Object obj) {
        synchronized (this) {
            File file = this.zza;
            zzgmr.zzb(file);
            if (!file.exists() && !file.createNewFile()) {
                String absolutePath = this.zza.getAbsolutePath();
                StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 23);
                sb.append("Failed to create file: ");
                sb.append(absolutePath);
                throw new IOException(sb.toString());
            }
            file.setWritable(true);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                this.zzc.zza(obj, fileOutputStream);
                fileOutputStream.close();
            } finally {
            }
        }
        return null;
    }
}
