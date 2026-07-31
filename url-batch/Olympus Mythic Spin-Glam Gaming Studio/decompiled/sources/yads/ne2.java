package yads;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;

/* loaded from: classes10.dex */
public class ne2 extends Exception implements nq {
    public final int b;
    public final long c;

    static {
        new mq() { // from class: yads.ne2$$ExternalSyntheticLambda0
            @Override // yads.mq
            public final nq a(Bundle bundle) {
                return new ne2(bundle);
            }
        };
    }

    public ne2(String str, Throwable th, int i, long j) {
        super(str, th);
        this.b = i;
        this.c = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ne2(Bundle bundle) {
        super(r0, r6);
        String string = bundle.getString(Integer.toString(2, 36));
        String string2 = bundle.getString(Integer.toString(3, 36));
        String string3 = bundle.getString(Integer.toString(4, 36));
        if (!TextUtils.isEmpty(string2)) {
            try {
                Class<?> cls = Class.forName(string2, true, ne2.class.getClassLoader());
                r6 = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string3) : null;
                if (r6 == null) {
                    r6 = new RemoteException(string3);
                }
            } catch (Throwable unused) {
                r6 = new RemoteException(string3);
            }
        }
        int i = bundle.getInt(Integer.toString(0, 36), 1000);
        long j = bundle.getLong(Integer.toString(1, 36), SystemClock.elapsedRealtime());
        this.b = i;
        this.c = j;
    }
}
