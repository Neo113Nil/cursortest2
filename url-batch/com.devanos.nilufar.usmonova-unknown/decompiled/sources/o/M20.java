package o;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes.dex */
public final class M20 extends E20 {
    public final /* synthetic */ com.google.android.gms.common.internal.a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M20(com.google.android.gms.common.internal.a aVar, Looper looper) {
        super(looper);
        this.a = aVar;
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        if (this.a.v.get() != message.arg1) {
            int i = message.what;
            if (i == 2 || i == 1 || i == 7) {
                F20 f20 = (F20) message.obj;
                f20.getClass();
                f20.c();
                return;
            }
            return;
        }
        int i2 = message.what;
        if ((i2 == 1 || i2 == 7 || i2 == 4 || i2 == 5) && !this.a.h()) {
            F20 f202 = (F20) message.obj;
            f202.getClass();
            f202.c();
            return;
        }
        int i3 = message.what;
        if (i3 == 4) {
            com.google.android.gms.common.internal.a aVar = this.a;
            aVar.s = new C0162Gd(message.arg2);
            if (!aVar.t && !TextUtils.isEmpty(aVar.r()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(aVar.r());
                    com.google.android.gms.common.internal.a aVar2 = this.a;
                    if (!aVar2.t) {
                        aVar2.v(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            com.google.android.gms.common.internal.a aVar3 = this.a;
            C0162Gd c0162Gd = aVar3.s;
            if (c0162Gd == null) {
                c0162Gd = new C0162Gd(8);
            }
            aVar3.i.f(c0162Gd);
            System.currentTimeMillis();
            return;
        }
        if (i3 == 5) {
            com.google.android.gms.common.internal.a aVar4 = this.a;
            C0162Gd c0162Gd2 = aVar4.s;
            if (c0162Gd2 == null) {
                c0162Gd2 = new C0162Gd(8);
            }
            aVar4.i.f(c0162Gd2);
            System.currentTimeMillis();
            return;
        }
        if (i3 == 3) {
            Object obj = message.obj;
            this.a.i.f(new C0162Gd(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null));
            System.currentTimeMillis();
            return;
        }
        if (i3 == 6) {
            this.a.v(5, null);
            C1818rJ c1818rJ = this.a.n;
            if (c1818rJ != null) {
                ((InterfaceC0356Nq) c1818rJ.i).b(message.arg2);
            }
            System.currentTimeMillis();
            com.google.android.gms.common.internal.a.u(this.a, 5, 1, null);
            return;
        }
        if (i3 == 2 && !this.a.a()) {
            F20 f203 = (F20) message.obj;
            f203.getClass();
            f203.c();
            return;
        }
        int i4 = message.what;
        if (i4 != 2 && i4 != 1 && i4 != 7) {
            Log.wtf("GmsClient", AbstractC2188wx.g(i4, "Don't know how to handle message: "), new Exception());
            return;
        }
        F20 f204 = (F20) message.obj;
        synchronized (f204) {
            try {
                bool = f204.a;
                if (f204.b) {
                    Log.w("GmsClient", "Callback proxy " + f204.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            com.google.android.gms.common.internal.a aVar5 = f204.f;
            int i5 = f204.d;
            if (i5 != 0) {
                aVar5.v(1, null);
                Bundle bundle = f204.e;
                f204.a(new C0162Gd(i5, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!f204.b()) {
                aVar5.v(1, null);
                f204.a(new C0162Gd(8, null));
            }
        }
        synchronized (f204) {
            f204.b = true;
        }
        f204.c();
    }
}
