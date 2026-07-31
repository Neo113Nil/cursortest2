package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.safedk.android.internal.partials.AdMobFilesBridge;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzgge extends zzgfw {
    private final ExecutorService zzb;
    private final zzggd zzc;
    private final zzgub zzd;

    public zzgge(File file, ExecutorService executorService, zzggd zzggdVar, zzgub zzgubVar) {
        super(file);
        this.zzb = executorService;
        this.zzc = zzggdVar;
        this.zzd = zzgubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final ListenableFuture zzb() {
        return zzhcy.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzggb
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgge.this.zzd();
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final ListenableFuture zzc(final Object obj) {
        return zzhcy.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgga
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzgge.this.zze(obj);
                return null;
            }
        }, this.zzb);
    }

    final /* synthetic */ Object zzd() {
        Object apply;
        synchronized (this) {
            try {
                try {
                    FileInputStream fileInputStream = new FileInputStream(this.zza);
                    try {
                        apply = this.zzc.zzb(fileInputStream);
                        fileInputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (FileNotFoundException unused) {
                    apply = this.zzc.zzc();
                }
            } catch (zzgfz e) {
                apply = this.zzd.apply(e);
            } catch (IOException e2) {
                apply = this.zzd.apply(new zzgfz(e2));
            }
        }
        return apply;
    }

    final /* synthetic */ Void zze(Object obj) {
        synchronized (this) {
            File file = this.zza;
            zzhat.zzb(file);
            String parent = file.getParent();
            String name = file.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 5);
            sb.append(name);
            sb.append(".temp");
            File file2 = new File(parent, sb.toString());
            try {
                FileOutputStream fileOutputStreamCtor = AdMobFilesBridge.fileOutputStreamCtor(file2);
                try {
                    this.zzc.zza(obj, fileOutputStreamCtor);
                    fileOutputStreamCtor.close();
                    if (!file2.renameTo(this.zza)) {
                        throw new IOException("Failed to rename file.");
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStreamCtor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                file2.delete();
                throw e;
            }
        }
        return null;
    }
}
