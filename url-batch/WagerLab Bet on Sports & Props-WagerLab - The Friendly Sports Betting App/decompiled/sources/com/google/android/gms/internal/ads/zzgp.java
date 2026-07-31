package com.google.android.gms.internal.ads;

import androidx.media3.common.PlaybackException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public class zzgp extends zzgb {
    public final int zzb;

    public zzgp(zzge zzgeVar, int i, int i2) {
        super(zzb(2008, 1));
        this.zzb = 1;
    }

    public static zzgp zza(IOException iOException, zzge zzgeVar, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT : iOException instanceof InterruptedIOException ? 1004 : (message == null || !zzggj.zza(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new zzgo(iOException, zzgeVar) : new zzgp(iOException, zzgeVar, i2, i);
    }

    private static int zzb(int i, int i2) {
        if (i != 2000) {
            return i;
        }
        if (i2 != 1) {
            return 2000;
        }
        return PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED;
    }

    public zzgp(IOException iOException, zzge zzgeVar, int i, int i2) {
        super(iOException, zzb(i, i2));
        this.zzb = i2;
    }

    public zzgp(String str, zzge zzgeVar, int i, int i2) {
        super(str, zzb(i, i2));
        this.zzb = i2;
    }

    public zzgp(String str, IOException iOException, zzge zzgeVar, int i, int i2) {
        super(str, iOException, zzb(i, i2));
        this.zzb = i2;
    }
}
