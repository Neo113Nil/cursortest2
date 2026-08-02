package com.google.android.gms.internal.ads;

import androidx.core.view.PointerIconCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public class zzfq extends zzey {
    public final zzfc zzb;
    public final int zzc;

    public zzfq(zzfc zzfcVar, int i, int i2) {
        super(zzb(2008, 1));
        this.zzb = zzfcVar;
        this.zzc = 1;
    }

    public static zzfq zza(IOException iOException, zzfc zzfcVar, int i) {
        String message = iOException.getMessage();
        int i2 = 2001;
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = PointerIconCompat.TYPE_WAIT;
        } else if (message != null && zzfse.zza(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        }
        return i2 == 2007 ? new zzfp(iOException, zzfcVar) : new zzfq(iOException, zzfcVar, i2, i);
    }

    private static int zzb(int i, int i2) {
        return i == 2000 ? i2 != 1 ? 2000 : 2001 : i;
    }

    public zzfq(IOException iOException, zzfc zzfcVar, int i, int i2) {
        super(iOException, zzb(i, i2));
        this.zzb = zzfcVar;
        this.zzc = i2;
    }

    public zzfq(String str, zzfc zzfcVar, int i, int i2) {
        super(str, zzb(i, i2));
        this.zzb = zzfcVar;
        this.zzc = i2;
    }

    public zzfq(String str, IOException iOException, zzfc zzfcVar, int i, int i2) {
        super(str, iOException, zzb(i, i2));
        this.zzb = zzfcVar;
        this.zzc = i2;
    }
}
