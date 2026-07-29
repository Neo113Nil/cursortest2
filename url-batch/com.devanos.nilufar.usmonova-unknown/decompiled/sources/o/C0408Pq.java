package o;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.Pq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0408Pq implements Handler.Callback {

    /* renamed from: o, reason: collision with root package name */
    public static final Status f87o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status p = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object q = new Object();
    public static C0408Pq r;
    public long a;
    public boolean b;
    public VU c;
    public B20 d;
    public final Context e;
    public final C0305Lq f;
    public final KX g;
    public final AtomicInteger h;
    public final AtomicInteger i;
    public final ConcurrentHashMap j;
    public final N6 k;
    public final N6 l;
    public final E20 m;
    public volatile boolean n;

    public C0408Pq(Context context, Looper looper) {
        C0305Lq c0305Lq = C0305Lq.c;
        this.a = 10000L;
        this.b = false;
        this.h = new AtomicInteger(1);
        this.i = new AtomicInteger(0);
        this.j = new ConcurrentHashMap(5, 0.75f, 1);
        this.k = new N6(0);
        this.l = new N6(0);
        this.n = true;
        this.e = context;
        E20 e20 = new E20(looper, this);
        this.m = e20;
        this.f = c0305Lq;
        this.g = new KX(5);
        PackageManager packageManager = context.getPackageManager();
        if (EB.z == null) {
            EB.z = Boolean.valueOf(PX.d0() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (EB.z.booleanValue()) {
            this.n = false;
        }
        e20.sendMessage(e20.obtainMessage(6));
    }

    public static Status b(G4 g4, C0162Gd c0162Gd) {
        return new Status(17, "API: " + ((String) g4.b.j) + " is not available on this device. Connection failed with: " + String.valueOf(c0162Gd), c0162Gd.j, c0162Gd);
    }

    public static C0408Pq d(Context context) {
        C0408Pq c0408Pq;
        HandlerThread handlerThread;
        synchronized (q) {
            if (r == null) {
                synchronized (m30.g) {
                    try {
                        handlerThread = m30.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            m30.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = m30.i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = C0305Lq.b;
                r = new C0408Pq(applicationContext, looper);
            }
            c0408Pq = r;
        }
        return c0408Pq;
    }

    public final boolean a(C0162Gd c0162Gd, int i) {
        boolean booleanValue;
        boolean isInstantApp;
        PendingIntent activity;
        Boolean bool;
        C0305Lq c0305Lq = this.f;
        Context context = this.e;
        c0305Lq.getClass();
        synchronized (AbstractC0868ct.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = AbstractC0868ct.a;
            if (context2 != null && (bool = AbstractC0868ct.b) != null && context2 == applicationContext) {
                booleanValue = bool.booleanValue();
            }
            AbstractC0868ct.b = null;
            if (PX.d0()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                AbstractC0868ct.b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    AbstractC0868ct.b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    AbstractC0868ct.b = Boolean.FALSE;
                }
            }
            AbstractC0868ct.a = applicationContext;
            booleanValue = AbstractC0868ct.b.booleanValue();
        }
        if (booleanValue) {
            return false;
        }
        int i2 = c0162Gd.i;
        if ((i2 == 0 || c0162Gd.j == null) ? false : true) {
            activity = c0162Gd.j;
        } else {
            Intent a = c0305Lq.a(i2, context, null);
            activity = a != null ? PendingIntent.getActivity(context, 0, a, 201326592) : null;
        }
        if (activity == null) {
            return false;
        }
        int i3 = c0162Gd.i;
        int i4 = GoogleApiActivity.i;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        c0305Lq.f(context, i3, PendingIntent.getActivity(context, 0, intent, C20.a | 134217728));
        return true;
    }

    public final C1274j20 c(B20 b20) {
        G4 g4 = b20.e;
        ConcurrentHashMap concurrentHashMap = this.j;
        C1274j20 c1274j20 = (C1274j20) concurrentHashMap.get(g4);
        if (c1274j20 == null) {
            c1274j20 = new C1274j20(this, b20);
            concurrentHashMap.put(g4, c1274j20);
        }
        if (c1274j20.b.m()) {
            this.l.add(g4);
        }
        c1274j20.m();
        return c1274j20;
    }

    public final void e(C0162Gd c0162Gd, int i) {
        if (a(c0162Gd, i)) {
            return;
        }
        E20 e20 = this.m;
        e20.sendMessage(e20.obtainMessage(5, i, 0, c0162Gd));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        if (r2 != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0122, code lost:
    
        if (r0 != 0) goto L84;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        C1274j20 c1274j20;
        C0300Ll[] b;
        HO ho;
        HO ho2;
        Context context = this.e;
        N6 n6 = this.l;
        E20 e20 = this.m;
        ConcurrentHashMap concurrentHashMap = this.j;
        int i = message.what;
        int i2 = 0;
        switch (i) {
            case 1:
                this.a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                e20.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    e20.sendMessageDelayed(e20.obtainMessage(12, (G4) it.next()), this.a);
                }
                return true;
            case 2:
                message.obj.getClass();
                throw new ClassCastException();
            case 3:
                for (C1274j20 c1274j202 : concurrentHashMap.values()) {
                    AbstractC1473m3.j(c1274j202.k.m);
                    c1274j202.j = null;
                    c1274j202.m();
                }
                return true;
            case 4:
            case 8:
            case 13:
                C1867s20 c1867s20 = (C1867s20) message.obj;
                B20 b20 = c1867s20.c;
                C2131w20 c2131w20 = c1867s20.a;
                C1274j20 c1274j203 = (C1274j20) concurrentHashMap.get(b20.e);
                if (c1274j203 == null) {
                    c1274j203 = c(c1867s20.c);
                }
                if (!c1274j203.b.m() || this.i.get() == c1867s20.b) {
                    c1274j203.n(c2131w20);
                    return true;
                }
                c2131w20.c(f87o);
                c1274j203.p();
                return true;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                int i3 = message.arg1;
                C0162Gd c0162Gd = (C0162Gd) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        c1274j20 = (C1274j20) it2.next();
                        if (c1274j20.g == i3) {
                        }
                    } else {
                        c1274j20 = null;
                    }
                }
                if (c1274j20 == null) {
                    Log.wtf("GoogleApiManager", AbstractC2188wx.i(i3, "Could not find API instance ", " while trying to fail enqueued calls.").toString(), new Exception());
                    return true;
                }
                int i4 = c0162Gd.i;
                if (i4 != 13) {
                    c1274j20.e(b(c1274j20.c, c0162Gd));
                    return true;
                }
                this.f.getClass();
                int i5 = AbstractC0434Qq.c;
                c1274j20.e(new Status(17, "Error resolution was canceled by the user, original error message: " + C0162Gd.a(i4) + ": " + c0162Gd.k, null, null));
                return true;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                if (context.getApplicationContext() instanceof Application) {
                    U7.a((Application) context.getApplicationContext());
                    U7 u7 = U7.l;
                    C1210i20 c1210i20 = new C1210i20(this);
                    u7.getClass();
                    synchronized (u7) {
                        u7.j.add(c1210i20);
                    }
                    AtomicBoolean atomicBoolean = u7.h;
                    AtomicBoolean atomicBoolean2 = u7.i;
                    if (!atomicBoolean2.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean.set(true);
                        }
                    }
                    if (!atomicBoolean.get()) {
                        this.a = 300000L;
                        return true;
                    }
                }
                return true;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                c((B20) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    C1274j20 c1274j204 = (C1274j20) concurrentHashMap.get(message.obj);
                    AbstractC1473m3.j(c1274j204.k.m);
                    if (c1274j204.h) {
                        c1274j204.m();
                        return true;
                    }
                }
                return true;
            case 10:
                n6.getClass();
                F6 f6 = new F6(n6);
                while (f6.hasNext()) {
                    C1274j20 c1274j205 = (C1274j20) concurrentHashMap.remove((G4) f6.next());
                    if (c1274j205 != null) {
                        c1274j205.p();
                    }
                }
                n6.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    C1274j20 c1274j206 = (C1274j20) concurrentHashMap.get(message.obj);
                    C0408Pq c0408Pq = c1274j206.k;
                    AbstractC1473m3.j(c0408Pq.m);
                    boolean z = c1274j206.h;
                    if (z) {
                        G4 g4 = c1274j206.c;
                        E20 e202 = c1274j206.k.m;
                        if (z) {
                            e202.removeMessages(11, g4);
                            e202.removeMessages(9, g4);
                            c1274j206.h = false;
                        }
                        c1274j206.e(c0408Pq.f.b(c0408Pq.e, AbstractC0330Mq.a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        c1274j206.b.d("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    C1274j20 c1274j207 = (C1274j20) concurrentHashMap.get(message.obj);
                    AbstractC1473m3.j(c1274j207.k.m);
                    D4 d4 = c1274j207.b;
                    if (d4.a() && c1274j207.f.size() == 0) {
                        KX kx = c1274j207.d;
                        if (((Map) kx.h).isEmpty() && ((Map) kx.i).isEmpty()) {
                            d4.d("Timing out service connection.");
                            return true;
                        }
                        c1274j207.j();
                        return true;
                    }
                }
                return true;
            case 14:
                message.obj.getClass();
                throw new ClassCastException();
            case 15:
                C1340k20 c1340k20 = (C1340k20) message.obj;
                if (concurrentHashMap.containsKey(c1340k20.a)) {
                    C1274j20 c1274j208 = (C1274j20) concurrentHashMap.get(c1340k20.a);
                    if (c1274j208.i.contains(c1340k20) && !c1274j208.h) {
                        if (c1274j208.b.a()) {
                            c1274j208.g();
                            return true;
                        }
                        c1274j208.m();
                        return true;
                    }
                }
                return true;
            case 16:
                C1340k20 c1340k202 = (C1340k20) message.obj;
                if (concurrentHashMap.containsKey(c1340k202.a)) {
                    C1274j20 c1274j209 = (C1274j20) concurrentHashMap.get(c1340k202.a);
                    ArrayList arrayList = c1274j209.i;
                    C0408Pq c0408Pq2 = c1274j209.k;
                    LinkedList<AbstractC1538n20> linkedList = c1274j209.a;
                    if (arrayList.remove(c1340k202)) {
                        c0408Pq2.m.removeMessages(15, c1340k202);
                        c0408Pq2.m.removeMessages(16, c1340k202);
                        C0300Ll c0300Ll = c1340k202.b;
                        ArrayList arrayList2 = new ArrayList(linkedList.size());
                        for (AbstractC1538n20 abstractC1538n20 : linkedList) {
                            if (abstractC1538n20 != null && (b = abstractC1538n20.b(c1274j209)) != null) {
                                int length = b.length;
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= length) {
                                        break;
                                    }
                                    if (!EB.o(b[i6], c0300Ll)) {
                                        i6++;
                                    } else if (i6 >= 0) {
                                        arrayList2.add(abstractC1538n20);
                                    }
                                }
                            }
                        }
                        int size = arrayList2.size();
                        while (i2 < size) {
                            AbstractC1538n20 abstractC1538n202 = (AbstractC1538n20) arrayList2.get(i2);
                            linkedList.remove(abstractC1538n202);
                            abstractC1538n202.d(new C2031uY(c0300Ll));
                            i2++;
                        }
                    }
                }
                return true;
            case 17:
                VU vu = this.c;
                if (vu != null) {
                    if (vu.h <= 0) {
                        if (!this.b) {
                            synchronized (HO.class) {
                                try {
                                    if (HO.i == null) {
                                        HO.i = new HO(i2);
                                    }
                                    ho = HO.i;
                                } finally {
                                }
                            }
                            ho.getClass();
                            int i7 = ((SparseIntArray) this.g.h).get(203400000, -1);
                            if (i7 != -1) {
                            }
                        }
                        this.c = null;
                        return true;
                    }
                    if (this.d == null) {
                        this.d = new B20(this.e, B20.i, C0279Kq.b);
                    }
                    this.d.a(vu);
                    this.c = null;
                    return true;
                }
                return true;
            case 18:
                ((AbstractC1801r20) message.obj).getClass();
                if (0 == 0) {
                    VU vu2 = new VU(0, Arrays.asList(null));
                    if (this.d == null) {
                        this.d = new B20(this.e, B20.i, C0279Kq.b);
                    }
                    this.d.a(vu2);
                    return true;
                }
                VU vu3 = this.c;
                if (vu3 != null) {
                    List list = vu3.i;
                    if (vu3.h != 0 || (list != null && list.size() >= 0)) {
                        e20.removeMessages(17);
                        VU vu4 = this.c;
                        if (vu4 != null) {
                            if (vu4.h <= 0) {
                                if (!this.b) {
                                    synchronized (HO.class) {
                                        try {
                                            if (HO.i == null) {
                                                HO.i = new HO(i2);
                                            }
                                            ho2 = HO.i;
                                        } finally {
                                        }
                                    }
                                    ho2.getClass();
                                    int i8 = ((SparseIntArray) this.g.h).get(203400000, -1);
                                    if (i8 != -1) {
                                    }
                                }
                                this.c = null;
                            }
                            if (this.d == null) {
                                this.d = new B20(this.e, B20.i, C0279Kq.b);
                            }
                            this.d.a(vu4);
                            this.c = null;
                        }
                    } else {
                        VU vu5 = this.c;
                        if (vu5.i == null) {
                            vu5.i = new ArrayList();
                        }
                        vu5.i.add(null);
                    }
                }
                if (this.c == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(null);
                    this.c = new VU(0, arrayList3);
                    e20.sendMessageDelayed(e20.obtainMessage(17), 0L);
                    return true;
                }
                return true;
            case 19:
                this.b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i);
                return false;
        }
    }
}
