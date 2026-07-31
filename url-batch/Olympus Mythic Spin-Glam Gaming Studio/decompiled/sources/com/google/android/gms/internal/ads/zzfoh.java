package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzfoh {
    private final zzfnl zza;
    private final zzfoe zzb;
    private final zzfnh zzc;
    private zzfon zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzfoh(zzfnl zzfnlVar, zzfnh zzfnhVar, zzfoe zzfoeVar) {
        this.zza = zzfnlVar;
        this.zzc = zzfnhVar;
        this.zzb = zzfoeVar;
        zzfnhVar.zza(new zzfng() { // from class: com.google.android.gms.internal.ads.zzfog
            @Override // com.google.android.gms.internal.ads.zzfng
            public final /* synthetic */ void zza() {
                zzfoh.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        r3 = new com.google.android.gms.internal.ads.zzfon(r4.zza, r4.zzb, r0);
        r4.zze = r3;
        r3.zza(new com.google.android.gms.internal.ads.zzfoc(r4, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        return;
     */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzd() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhq)).booleanValue() && !com.google.android.gms.ads.internal.zzt.zzh().zzp().zzi().zzi()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (true) {
                ArrayDeque arrayDeque = this.zzd;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                zzfof zzfofVar = (zzfof) arrayDeque.pollFirst();
                if (zzfofVar == null || (zzfofVar.zzb() != null && this.zza.zzc(zzfofVar.zzb()))) {
                    break;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized void zza(zzfof zzfofVar) {
        this.zzd.add(zzfofVar);
    }

    @Nullable
    public final synchronized ListenableFuture zzb(zzfof zzfofVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zzb(zzfofVar);
    }

    final /* synthetic */ void zzc() {
        synchronized (this) {
            this.zzf = 1;
            zzd();
        }
    }

    final /* synthetic */ ArrayDeque zze() {
        return this.zzd;
    }

    final /* synthetic */ void zzf(zzfon zzfonVar) {
        this.zze = null;
    }

    final /* synthetic */ int zzg() {
        return this.zzf;
    }
}
