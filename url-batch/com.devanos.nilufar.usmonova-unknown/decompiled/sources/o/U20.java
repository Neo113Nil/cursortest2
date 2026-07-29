package o;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class U20 implements ServiceConnection {
    public final int a;
    public final /* synthetic */ com.google.android.gms.common.internal.a b;

    public U20(com.google.android.gms.common.internal.a aVar, int i) {
        this.b = aVar;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        com.google.android.gms.common.internal.a aVar = this.b;
        if (iBinder == null) {
            synchronized (aVar.f) {
                i = aVar.m;
            }
            if (i == 3) {
                aVar.t = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            M20 m20 = aVar.e;
            m20.sendMessage(m20.obtainMessage(i2, aVar.v.get(), 16));
            return;
        }
        synchronized (aVar.g) {
            try {
                com.google.android.gms.common.internal.a aVar2 = this.b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar2.h = (queryLocalInterface == null || !(queryLocalInterface instanceof I20)) ? new I20(iBinder) : (I20) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.common.internal.a aVar3 = this.b;
        int i3 = this.a;
        X20 x20 = new X20(aVar3, 0);
        M20 m202 = aVar3.e;
        m202.sendMessage(m202.obtainMessage(7, i3, -1, x20));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.a aVar;
        synchronized (this.b.g) {
            aVar = this.b;
            aVar.h = null;
        }
        int i = this.a;
        M20 m20 = aVar.e;
        m20.sendMessage(m20.obtainMessage(6, i, 1));
    }
}
