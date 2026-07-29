package o;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: o.y20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2263y20 implements IInterface {
    public final IBinder a;
    public final String b;

    public C2263y20(IBinder iBinder, String str) {
        this.a = iBinder;
        this.b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
