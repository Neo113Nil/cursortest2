package yads;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes6.dex */
public final class zj0 {
    public static final op2 h = new op2(1);
    public final wj0 a;
    public final CopyOnWriteArraySet b;
    public int c;
    public boolean d;
    public int e;
    public boolean f;
    public List g;

    public zj0(Context context, hd0 hd0Var, id0 id0Var) {
        context.getApplicationContext();
        this.d = true;
        this.g = Collections.emptyList();
        this.b = new CopyOnWriteArraySet();
        Handler b = sb3.b(new Handler.Callback() { // from class: yads.zj0$$ExternalSyntheticLambda0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return zj0.this.a(message);
            }
        });
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        wj0 wj0Var = new wj0(handlerThread, hd0Var, id0Var, b, this.d);
        this.a = wj0Var;
        int c = new sp2(context, new qp2() { // from class: yads.zj0$$ExternalSyntheticLambda1
            @Override // yads.qp2
            public final void a(sp2 sp2Var, int i) {
                zj0.this.a(sp2Var, i);
            }
        }).c();
        this.e = c;
        this.c = 1;
        wj0Var.obtainMessage(0, c, 0).sendToTarget();
    }

    public final void a(sp2 sp2Var, int i) {
        op2 op2Var = sp2Var.c;
        if (this.e != i) {
            this.e = i;
            this.c++;
            this.a.obtainMessage(2, i, 0).sendToTarget();
        }
        boolean a = a();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((xj0) it.next()).getClass();
        }
        if (a) {
            Iterator it2 = this.b.iterator();
            while (it2.hasNext()) {
                ((xj0) it2.next()).getClass();
            }
        }
    }

    public final boolean a() {
        boolean z;
        if (!this.d && this.e != 0) {
            for (int i = 0; i < this.g.size(); i++) {
                if (((tj0) this.g.get(i)).b == 0) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        boolean z2 = this.f != z;
        this.f = z;
        return z2;
    }

    public final boolean a(Message message) {
        int i = message.what;
        if (i == 0) {
            this.g = Collections.unmodifiableList((List) message.obj);
            boolean a = a();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((xj0) it.next()).getClass();
            }
            if (a) {
                Iterator it2 = this.b.iterator();
                while (it2.hasNext()) {
                    ((xj0) it2.next()).getClass();
                }
            }
        } else if (i == 1) {
            int i2 = message.arg1;
            int i3 = message.arg2;
            int i4 = this.c - i2;
            this.c = i4;
            if (i3 == 0 && i4 == 0) {
                Iterator it3 = this.b.iterator();
                while (it3.hasNext()) {
                    ((xj0) it3.next()).getClass();
                }
            }
        } else if (i == 2) {
            vj0 vj0Var = (vj0) message.obj;
            this.g = Collections.unmodifiableList(vj0Var.c);
            tj0 tj0Var = vj0Var.a;
            boolean a2 = a();
            if (vj0Var.b) {
                Iterator it4 = this.b.iterator();
                while (it4.hasNext()) {
                    ((xj0) it4.next()).getClass();
                }
            } else {
                Iterator it5 = this.b.iterator();
                while (it5.hasNext()) {
                    tn3 tn3Var = (tn3) ((xj0) it5.next());
                    tn3Var.getClass();
                    if (Intrinsics.areEqual(tj0Var.a.b, tn3Var.a)) {
                        if (tn3.d.contains(Integer.valueOf(tj0Var.b))) {
                            qm2 qm2Var = tn3Var.b;
                            KProperty kProperty = tn3.c[0];
                            kh3 kh3Var = (kh3) qm2Var.a.get();
                            if (kh3Var != null) {
                                kh3Var.a();
                            }
                        }
                        if (tn3.e.contains(Integer.valueOf(tj0Var.b))) {
                            qm2 qm2Var2 = tn3Var.b;
                            KProperty kProperty2 = tn3.c[0];
                            kh3 kh3Var2 = (kh3) qm2Var2.a.get();
                            if (kh3Var2 != null) {
                                kh3Var2.c();
                            }
                        }
                        if (tn3.f.contains(Integer.valueOf(tj0Var.b))) {
                            this.b.remove(tn3Var);
                        }
                    }
                }
            }
            if (a2) {
                Iterator it6 = this.b.iterator();
                while (it6.hasNext()) {
                    ((xj0) it6.next()).getClass();
                }
            }
        } else {
            throw new IllegalStateException();
        }
        return true;
    }
}
