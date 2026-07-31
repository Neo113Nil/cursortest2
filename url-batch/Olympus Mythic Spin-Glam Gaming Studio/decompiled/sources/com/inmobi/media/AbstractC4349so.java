package com.inmobi.media;

import android.os.Handler;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* renamed from: com.inmobi.media.so, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4349so {
    public final WeakHashMap a;
    public final Handler b;
    public final byte c;
    public final InterfaceC4466x9 d;
    public long f;
    public InterfaceC4271po h;
    public boolean k;
    public final ArrayList e = new ArrayList(50);
    public final AtomicBoolean g = new AtomicBoolean(true);
    public final Lazy i = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.so$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return AbstractC4349so.a(AbstractC4349so.this);
        }
    });
    public final Lazy j = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.so$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return AbstractC4349so.b(AbstractC4349so.this);
        }
    });

    public AbstractC4349so(WeakHashMap weakHashMap, Handler handler, byte b, InterfaceC4466x9 interfaceC4466x9) {
        this.a = weakHashMap;
        this.b = handler;
        this.c = b;
        this.d = interfaceC4466x9;
    }

    public static final RunnableC4245oo a(AbstractC4349so abstractC4349so) {
        return new RunnableC4245oo(abstractC4349so, abstractC4349so.g);
    }

    public static final Runnable b(final AbstractC4349so abstractC4349so) {
        return new Runnable() { // from class: com.inmobi.media.so$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4349so.c(AbstractC4349so.this);
            }
        };
    }

    public static final void c(AbstractC4349so abstractC4349so) {
        abstractC4349so.b.post((RunnableC4245oo) abstractC4349so.i.getValue());
    }

    public abstract int c();

    public abstract void d();

    public final void e() {
        InterfaceC4466x9 interfaceC4466x9 = this.d;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).c("VisibilityTracker", "pause " + this);
        }
        ((RunnableC4245oo) this.i.getValue()).run();
        this.b.removeCallbacksAndMessages(null);
        this.k = false;
        this.g.set(true);
    }

    public final void f() {
        InterfaceC4466x9 interfaceC4466x9 = this.d;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).c("VisibilityTracker", "resume " + this);
        }
        this.g.set(false);
        if (this.k || this.g.get()) {
            return;
        }
        this.k = true;
        BuildersKt__Builders_commonKt.launch$default(L9.d, null, null, new C4323ro(this, null), 3, null);
    }

    public final void a(View rootView, View view, View view2, int i) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC4466x9 interfaceC4466x9 = this.d;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).c("VisibilityTracker", "add view to tracker - minPercent - " + i + "  " + this);
        }
        C4297qo c4297qo = (C4297qo) this.a.get(view);
        if (c4297qo == null) {
            c4297qo = new C4297qo();
            this.a.put(view, c4297qo);
            this.f++;
        }
        c4297qo.a = i;
        long j = this.f;
        c4297qo.b = j;
        c4297qo.c = rootView;
        long j2 = 50;
        if (j % j2 == 0) {
            long j3 = j - j2;
            for (Map.Entry entry : this.a.entrySet()) {
                View view3 = (View) entry.getKey();
                if (((C4297qo) entry.getValue()).b < j3) {
                    this.e.add(view3);
                }
            }
            Iterator it = this.e.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                a((View) it.next());
            }
            this.e.clear();
        }
        if (this.a.size() == 1) {
            f();
        }
    }

    public final void b() {
        InterfaceC4466x9 interfaceC4466x9 = this.d;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).c("VisibilityTracker", "destroy " + this);
        }
        a();
        this.h = null;
        this.g.set(true);
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC4466x9 interfaceC4466x9 = this.d;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).c("VisibilityTracker", "removed view from tracker " + this);
        }
        if (((C4297qo) this.a.remove(view)) != null) {
            this.f--;
            if (this.a.isEmpty()) {
                e();
            }
        }
    }

    public final void a() {
        InterfaceC4466x9 interfaceC4466x9 = this.d;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).c("VisibilityTracker", "clear " + this);
        }
        this.a.clear();
        this.b.removeMessages(0);
        this.k = false;
    }
}
