package com.google.firebase.auth.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.firebase.FirebaseApp;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes6.dex */
public final class zzca {
    private volatile int zza;
    private final zzaq zzb;
    private volatile boolean zzc;

    public zzca(FirebaseApp firebaseApp) {
        this(firebaseApp.getApplicationContext(), new zzaq(firebaseApp));
    }

    private zzca(Context context, zzaq zzaqVar) {
        this.zzc = false;
        this.zza = 0;
        this.zzb = zzaqVar;
        BackgroundDetector.initialize((Application) context.getApplicationContext());
        BackgroundDetector.getInstance().addListener(new zzcd(this));
    }

    public final void zza() {
        this.zzb.zzb();
    }

    public final void zza(int i) {
        if (i > 0 && this.zza == 0) {
            this.zza = i;
            if (zzb()) {
                this.zzb.zzc();
            }
        } else if (i == 0 && this.zza != 0) {
            this.zzb.zzb();
        }
        this.zza = i;
    }

    public final void zza(zzahv zzahvVar) {
        if (zzahvVar == null) {
            return;
        }
        long zza = zzahvVar.zza();
        if (zza <= 0) {
            zza = 3600;
        }
        long zzb = zzahvVar.zzb() + (zza * 1000);
        zzaq zzaqVar = this.zzb;
        zzaqVar.zza = zzb;
        zzaqVar.zzb = -1L;
        if (zzb()) {
            this.zzb.zzc();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzb() {
        return this.zza > 0 && !this.zzc;
    }
}
