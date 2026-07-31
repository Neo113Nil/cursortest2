package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import androidx.annotation.VisibleForTesting;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@VisibleForTesting
/* loaded from: classes13.dex */
final class zzbgk {

    @VisibleForTesting
    ByteArrayOutputStream zza = new ByteArrayOutputStream(4096);

    @VisibleForTesting
    Base64OutputStream zzb = new Base64OutputStream(this.zza, 10);

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        try {
            this.zzb.close();
        } catch (IOException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("HashManager: Unable to convert to Base64.", e);
        }
        try {
            try {
                this.zza.close();
                str = this.zza.toString();
            } catch (IOException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("HashManager: Unable to convert to Base64.", e2);
                str = "";
            }
            return str;
        } finally {
            this.zza = null;
            this.zzb = null;
        }
    }
}
