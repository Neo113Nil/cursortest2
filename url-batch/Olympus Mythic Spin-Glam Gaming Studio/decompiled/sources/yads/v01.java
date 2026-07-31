package yads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes4.dex */
public class v01 extends r30 {
    public final int d;

    public v01() {
        super(2008);
        this.d = 1;
    }

    public static v01 a(IOException iOException, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !lh.a(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new u01(iOException) : new v01(i2, i, iOException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v01(int i, int i2, IOException iOException) {
        super(iOException, i);
        if (i == 2000 && i2 == 1) {
            i = 2001;
        }
        this.d = i2;
    }

    public v01(String str, IOException iOException, int i) {
        super(str, iOException, i == 2000 ? 2001 : i);
        this.d = 1;
    }
}
