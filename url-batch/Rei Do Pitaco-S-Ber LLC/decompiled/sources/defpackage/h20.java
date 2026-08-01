package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class h20 implements Handler.Callback {
    public final /* synthetic */ oe a;

    public h20(oe oeVar) {
        this.a = oeVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        oe oeVar = this.a;
        i20 i20Var = (i20) message.obj;
        synchronized (oeVar.f) {
            if (((i20) oeVar.h) == i20Var || ((i20) oeVar.i) == i20Var) {
                oeVar.e(i20Var, 2);
            }
        }
        return true;
    }
}
