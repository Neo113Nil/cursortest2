package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class id2 extends BroadcastReceiver {
    public static final gd2 h = new gd2();
    public static volatile id2 i;
    public final Context a;
    public final vw2 b;
    public final fd2 c;
    public final ed2 d;
    public final WeakHashMap e;
    public final Object f;
    public dd2 g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public id2(Context context, Executor executor) {
        this(context, executor, r4, new fd2(context), new ed2());
        vw2 vw2Var;
        vw2 vw2Var2;
        vw2 vw2Var3 = vw2.l;
        if (vw2Var3 == null) {
            synchronized (vw2.k) {
                vw2Var2 = vw2.l;
                if (vw2Var2 == null) {
                    vw2Var2 = new vw2();
                    vw2.l = vw2Var2;
                }
            }
            vw2Var = vw2Var2;
        } else {
            vw2Var = vw2Var3;
        }
    }

    public static final void a(id2 id2Var) {
        dd2 a = id2Var.c.a();
        id2Var.g = a;
        Objects.toString(a);
        boolean z = ob1.a;
        try {
            id2Var.d.getClass();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (Build.VERSION.SDK_INT >= 33) {
                id2Var.a.registerReceiver(id2Var, intentFilter, 2);
            } else {
                id2Var.a.registerReceiver(id2Var, intentFilter);
            }
        } catch (Exception unused) {
            boolean z2 = ob1.a;
        }
    }

    public final void b(hd2 hd2Var) {
        synchronized (this.f) {
            this.e.remove(hd2Var);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dd2 dd2Var;
        HashSet hashSet;
        synchronized (this.f) {
            try {
                dd2 dd2Var2 = this.g;
                String action = intent.getAction();
                dd2 dd2Var3 = Intrinsics.areEqual(action, "android.intent.action.SCREEN_OFF") ? dd2.c : Intrinsics.areEqual(action, "android.intent.action.USER_PRESENT") ? dd2.d : (this.g == dd2.d || !Intrinsics.areEqual(action, "android.intent.action.SCREEN_ON")) ? this.g : dd2.b;
                this.g = dd2Var3;
                if (dd2Var2 != dd2Var3) {
                    Objects.toString(dd2Var3);
                    boolean z = ob1.a;
                }
                dd2Var = this.g;
                hashSet = new HashSet(this.e.keySet());
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((hd2) it.next()).a(dd2Var);
        }
    }

    public id2(Context context, Executor executor, vw2 vw2Var, fd2 fd2Var, ed2 ed2Var) {
        this.a = context;
        this.b = vw2Var;
        this.c = fd2Var;
        this.d = ed2Var;
        this.e = new WeakHashMap();
        this.f = new Object();
        this.g = dd2.d;
        executor.execute(new Runnable() { // from class: yads.id2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                id2.a(id2.this);
            }
        });
    }

    public final void a(hd2 hd2Var) {
        synchronized (this.f) {
            this.e.put(hd2Var, null);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r4.g == yads.dd2.d) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        boolean z;
        bu2 a = this.b.a(this.a);
        synchronized (this.f) {
            z = true;
            if (a != null) {
                try {
                    if (a.h) {
                        dd2 dd2Var = this.g;
                        if (dd2Var != dd2.b) {
                            if (dd2Var == dd2.d) {
                            }
                            z = false;
                        }
                    }
                } finally {
                }
            }
        }
        return z;
    }
}
