package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class b30 implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ j30 i;

    public /* synthetic */ b30(j30 j30Var, int i) {
        this.h = i;
        this.i = j30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.h) {
            case 0:
                break;
            case 1:
                j30 j30Var = this.i;
                synchronized (j30Var) {
                    if (j30Var.a == 1) {
                        j30Var.a("Timed out while binding");
                    }
                }
                return;
            default:
                this.i.a("Service disconnected");
                return;
        }
        while (true) {
            j30 j30Var2 = this.i;
            synchronized (j30Var2) {
                try {
                    if (j30Var2.a != 2) {
                        return;
                    }
                    if (j30Var2.d.isEmpty()) {
                        j30Var2.c();
                        return;
                    }
                    l30 l30Var = (l30) j30Var2.d.poll();
                    j30Var2.e.put(l30Var.a, l30Var);
                    ((ScheduledExecutorService) j30Var2.f.c).schedule(new RunnableC1996u1(16, j30Var2, l30Var, false), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(l30Var)));
                    }
                    n30 n30Var = j30Var2.f;
                    Messenger messenger = j30Var2.b;
                    int i = l30Var.c;
                    Context context = (Context) n30Var.b;
                    Message obtain = Message.obtain();
                    obtain.what = i;
                    obtain.arg1 = l30Var.a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", l30Var.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, l30Var.d);
                    obtain.setData(bundle);
                    try {
                        KX kx = j30Var2.c;
                        Messenger messenger2 = (Messenger) kx.h;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            T20 t20 = (T20) kx.i;
                            if (t20 == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = t20.h;
                            messenger3.getClass();
                            messenger3.send(obtain);
                        }
                    } catch (RemoteException e) {
                        j30Var2.a(e.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
