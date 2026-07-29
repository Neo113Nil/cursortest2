package o;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.firebase.messaging.Constants;

/* loaded from: classes.dex */
public final /* synthetic */ class f30 implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f30(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                int i = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i);
                }
                j30 j30Var = (j30) this.b;
                synchronized (j30Var) {
                    try {
                        l30 l30Var = (l30) j30Var.e.get(i);
                        if (l30Var == null) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                            return true;
                        }
                        j30Var.e.remove(i);
                        j30Var.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            l30Var.b(new F4("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (l30Var.e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    l30Var.c(null);
                                    return true;
                                }
                                l30Var.b(new F4("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                l30Var.c(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
            default:
                int i2 = message.what;
                if (i2 == 0) {
                    synchronized (((m30) this.b).a) {
                        try {
                            h30 h30Var = (h30) message.obj;
                            i30 i30Var = (i30) ((m30) this.b).a.get(h30Var);
                            if (i30Var != null && i30Var.a.isEmpty()) {
                                if (i30Var.c) {
                                    i30Var.g.c.removeMessages(1, i30Var.e);
                                    m30 m30Var = i30Var.g;
                                    m30Var.d.e0(m30Var.b, i30Var);
                                    i30Var.c = false;
                                    i30Var.b = 2;
                                }
                                ((m30) this.b).a.remove(h30Var);
                            }
                        } finally {
                        }
                    }
                } else {
                    if (i2 != 1) {
                        return false;
                    }
                    synchronized (((m30) this.b).a) {
                        try {
                            h30 h30Var2 = (h30) message.obj;
                            i30 i30Var2 = (i30) ((m30) this.b).a.get(h30Var2);
                            if (i30Var2 != null && i30Var2.b == 3) {
                                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(h30Var2)), new Exception());
                                ComponentName componentName = i30Var2.f;
                                if (componentName == null) {
                                    h30Var2.getClass();
                                    componentName = null;
                                }
                                if (componentName == null) {
                                    String str = h30Var2.b;
                                    AbstractC1473m3.n(str);
                                    componentName = new ComponentName(str, "unknown");
                                }
                                i30Var2.onServiceDisconnected(componentName);
                            }
                        } finally {
                        }
                    }
                }
                return true;
        }
    }
}
