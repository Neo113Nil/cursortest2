package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes12.dex */
public final class rf1 {
    public final tv a;
    public final s53 b;
    public final pf1 c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e = new ArrayDeque();
    public final ArrayDeque f = new ArrayDeque();
    public boolean g;

    public rf1(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, tv tvVar, pf1 pf1Var) {
        this.a = tvVar;
        this.d = copyOnWriteArraySet;
        this.c = pf1Var;
        Handler.Callback callback = new Handler.Callback() { // from class: yads.rf1$$ExternalSyntheticLambda0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return rf1.this.a(message);
            }
        };
        ((p53) tvVar).getClass();
        this.b = new s53(new Handler(looper, callback));
    }

    public final void a(final int i, final of1 of1Var) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.d);
        this.f.add(new Runnable() { // from class: yads.rf1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                rf1.a(copyOnWriteArraySet, i, of1Var);
            }
        });
    }

    public static void a(CopyOnWriteArraySet copyOnWriteArraySet, int i, of1 of1Var) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            qf1 qf1Var = (qf1) it.next();
            if (!qf1Var.d) {
                if (i != -1) {
                    qf1Var.b.a(i);
                }
                qf1Var.c = true;
                of1Var.invoke(qf1Var.a);
            }
        }
    }

    public final void a() {
        if (this.f.isEmpty()) {
            return;
        }
        if (!this.b.a.hasMessages(0)) {
            s53 s53Var = this.b;
            s53Var.getClass();
            r53 a = s53.a();
            Message obtainMessage = s53Var.a.obtainMessage(0);
            a.a = obtainMessage;
            Handler handler = s53Var.a;
            obtainMessage.getClass();
            handler.sendMessageAtFrontOfQueue(obtainMessage);
            a.a();
        }
        boolean isEmpty = this.e.isEmpty();
        this.e.addAll(this.f);
        this.f.clear();
        if (isEmpty) {
            while (!this.e.isEmpty()) {
                ((Runnable) this.e.peekFirst()).run();
                this.e.removeFirst();
            }
        }
    }

    public final boolean a(Message message) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            qf1 qf1Var = (qf1) it.next();
            pf1 pf1Var = this.c;
            if (!qf1Var.d && qf1Var.c) {
                zu0 a = qf1Var.b.a();
                qf1Var.b = new yu0();
                qf1Var.c = false;
                pf1Var.a(qf1Var.a, a);
            }
            if (this.b.a.hasMessages(0)) {
                return true;
            }
        }
        return true;
    }
}
