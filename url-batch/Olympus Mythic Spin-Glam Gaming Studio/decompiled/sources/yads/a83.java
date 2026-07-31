package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a83 extends Handler {
    public final q92 a;

    public a83(q92 q92Var) {
        super(Looper.getMainLooper());
        this.a = q92Var;
    }

    public final void a(s83 s83Var, jx1 jx1Var, cc3 cc3Var) {
        long elapsedRealtime;
        Long l = s83Var.e;
        if (l != null) {
            elapsedRealtime = l.longValue();
        } else {
            elapsedRealtime = SystemClock.elapsedRealtime();
            s83Var.e = Long.valueOf(elapsedRealtime);
        }
        if (SystemClock.elapsedRealtime() - elapsedRealtime >= s83Var.b) {
            sendMessage(Message.obtain(this, 1, new z73(new WeakReference(jx1Var), s83Var, cc3Var)));
        }
        if (!jx1Var.n) {
            jx1Var.n = true;
            t41 t41Var = jx1Var.m;
            if (t41Var != null) {
                t41Var.c();
            }
        }
        this.a.a(s83Var.d, cc3Var);
    }

    public final void b() {
        removeMessages(2);
        removeMessages(1);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        a93 a93Var;
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            Object obj = message.obj;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.ref.WeakReference<com.monetization.ads.base.impression.tracking.MrcNoticeTrackingManager?>");
            jx1 jx1Var = (jx1) ((WeakReference) obj).get();
            if (jx1Var != null) {
                List<s83> list = CollectionsKt.toList(jx1Var.p);
                list.size();
                boolean z = ob1.a;
                int i2 = Integer.MIN_VALUE;
                for (s83 s83Var : list) {
                    if (s83Var.c > i2) {
                        ec3 b = jx1Var.b(s83Var);
                        if (b instanceof cc3) {
                            i2 = s83Var.c;
                            a(s83Var, jx1Var, (cc3) b);
                        } else if (b instanceof bc3) {
                            s83Var.e = null;
                            this.a.a(s83Var.d, (bc3) b);
                        }
                    } else {
                        a(s83Var, jx1Var, new cc3());
                    }
                }
                if (list.isEmpty()) {
                    return;
                }
                sendMessageDelayed(Message.obtain(this, 2, new WeakReference(jx1Var)), 200L);
                return;
            }
            return;
        }
        Object obj2 = message.obj;
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.monetization.ads.base.impression.tracking.handler.TrackHandler.TrackNoticeObject");
        z73 z73Var = (z73) obj2;
        jx1 jx1Var2 = (jx1) z73Var.a.get();
        if (jx1Var2 != null) {
            boolean z2 = ob1.a;
            s83 s83Var2 = z73Var.b;
            int ordinal = s83Var2.d.ordinal();
            if (ordinal == 0) {
                a93Var = a93.e;
            } else if (ordinal == 1) {
                a93Var = a93.f;
            } else {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                a93Var = a93.k;
            }
            u9.a(jx1Var2.h, s83Var2.a, a93Var, jx1Var2.l.a(jx1Var2.b, jx1Var2.c), 4);
            jx1Var2.p.remove(s83Var2);
            if (!jx1Var2.o && jx1Var2.p.isEmpty()) {
                jx1Var2.o = true;
                t41 t41Var = jx1Var2.m;
                if (t41Var != null) {
                    t41Var.g();
                }
            }
            q92 q92Var = this.a;
            fz2 fz2Var = z73Var.b.d;
            List list2 = CollectionsKt.toList(jx1Var2.p);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((s83) it.next()).d);
            }
            q92Var.a(fz2Var, arrayList, z73Var.c);
        }
    }

    public final boolean a() {
        return hasMessages(2);
    }

    public final void a(jx1 jx1Var) {
        sendMessage(Message.obtain(this, 2, new WeakReference(jx1Var)));
    }
}
