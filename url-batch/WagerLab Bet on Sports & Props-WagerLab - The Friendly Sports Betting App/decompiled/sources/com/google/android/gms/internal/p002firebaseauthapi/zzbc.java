package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzvv;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzbc implements zzby {
    private final OutputStream zza;

    public static zzby zza(OutputStream outputStream) {
        return new zzbc(outputStream);
    }

    private zzbc(OutputStream outputStream) {
        this.zza = outputStream;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzby
    public final void zza(zzvv zzvvVar) throws IOException {
        try {
            zzvv.zza zzn = zzvvVar.zzn();
            zzvv.zza zzaVar = zzn;
            ((zzvv) ((zzalf) zzn.zza().zze())).zza(this.zza);
        } finally {
            this.zza.close();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzby
    public final void zza(zzxh zzxhVar) throws IOException {
        try {
            zzxhVar.zza(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
