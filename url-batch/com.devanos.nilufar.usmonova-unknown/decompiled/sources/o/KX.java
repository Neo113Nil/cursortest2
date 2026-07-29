package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class KX implements T00, InterfaceC0764bG, InterfaceC2301ye {
    public final Object h;
    public final Object i;

    public /* synthetic */ KX(Object obj, Object obj2) {
        this.i = obj;
        this.h = obj2;
    }

    public void a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.h)) {
            hashMap = new HashMap((Map) this.h);
        }
        synchronized (((Map) this.i)) {
            hashMap2 = new HashMap((Map) this.i);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((NU) entry2.getKey()).c(new F4(status));
            }
        }
    }

    @Override // o.InterfaceC2301ye
    public Object n(MU mu) {
        TO to = (TO) this.h;
        Bundle bundle = (Bundle) this.i;
        to.getClass();
        if (!mu.i()) {
            return mu;
        }
        Bundle bundle2 = (Bundle) mu.g();
        if (bundle2 == null || !bundle2.containsKey("google.messenger")) {
            return mu;
        }
        p30 a = to.a(bundle);
        ExecutorC2239xi executorC2239xi = ExecutorC2239xi.k;
        C1097gL c1097gL = C1097gL.s;
        a.getClass();
        p30 p30Var = new p30();
        a.b.e(new Y20(executorC2239xi, c1097gL, p30Var));
        a.n();
        return p30Var;
    }

    @Override // o.InterfaceC0764bG
    public void onComplete(MU mu) {
        ((Map) ((KX) this.i).i).remove((NU) this.h);
    }

    public /* synthetic */ KX(TO to, Bundle bundle) {
        this.h = to;
        this.i = bundle;
    }

    public KX(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.h = new Messenger(iBinder);
            this.i = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.i = new T20(iBinder);
            this.h = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public KX(C1818rJ c1818rJ) {
        C2002u5 c2002u5 = new C2002u5(13);
        this.h = c1818rJ;
        this.i = c2002u5;
    }

    public KX(int i) {
        switch (i) {
            case 1:
                this.h = new YD(new Reference[16]);
                this.i = new ReferenceQueue();
                break;
            case 2:
            case 3:
            default:
                this.h = new C0218Ih(29);
                this.i = new C0557Vj();
                break;
            case 4:
                this.h = Collections.synchronizedMap(new WeakHashMap());
                this.i = Collections.synchronizedMap(new WeakHashMap());
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                C0305Lq c0305Lq = C0305Lq.c;
                this.h = new SparseIntArray();
                this.i = c0305Lq;
                break;
        }
    }
}
