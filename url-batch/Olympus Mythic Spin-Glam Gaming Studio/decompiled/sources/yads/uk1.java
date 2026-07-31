package yads;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes6.dex */
public final class uk1 implements wj1, Handler.Callback {
    public final Handler b;
    public final /* synthetic */ vk1 c;

    public uk1(vk1 vk1Var, xj1 xj1Var) {
        this.c = vk1Var;
        Handler a = sb3.a(this);
        this.b = a;
        xj1Var.a(this, a);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        int i3 = sb3.a;
        long j = ((i & 4294967295L) << 32) | (4294967295L & i2);
        vk1 vk1Var = this.c;
        if (this == vk1Var.n1) {
            if (j == Long.MAX_VALUE) {
                vk1Var.z0 = true;
            } else {
                try {
                    vk1Var.b(j);
                    vk1Var.A();
                    vk1Var.B0.e++;
                    vk1Var.V0 = true;
                    if (!vk1Var.T0) {
                        vk1Var.T0 = true;
                        vk1Var.I0.a(vk1Var.P0);
                        vk1Var.R0 = true;
                    }
                    vk1Var.a(j);
                } catch (nn0 e) {
                    this.c.A0 = e;
                }
            }
        }
        return true;
    }
}
