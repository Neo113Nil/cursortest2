package io.bidmachine.internal;

import android.content.Context;
import java.lang.ref.WeakReference;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes10.dex */
public final class K extends Thread {
    public static final d i = new d(null);
    private final long a;
    private final Function0 b;
    private final Function1 c;
    private final Function1 d;
    private volatile long e;
    private volatile int f;
    private volatile WeakReference g;
    private J h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends Lambda implements Function0 {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long mo4828invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class b extends Lambda implements Function1 {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final void a(long j) {
            Thread.sleep(j);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class c extends Lambda implements Function1 {
        public static final c a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final J invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new J(it);
        }
    }

    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    public /* synthetic */ K(long j, Function0 function0, Function1 function1, Function1 function12, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i2 & 2) != 0 ? a.a : function0, (i2 & 4) != 0 ? b.a : function1, (i2 & 8) != 0 ? c.a : function12);
    }

    private final J b() {
        Context context;
        WeakReference weakReference = this.g;
        if (weakReference == null || (context = (Context) weakReference.get()) == null) {
            return null;
        }
        J j = this.h;
        if (j != null) {
            return j;
        }
        J j2 = (J) this.d.invoke(context);
        this.h = j2;
        return j2;
    }

    private final Object e() {
        try {
            Result.Companion companion = Result.INSTANCE;
            J b2 = b();
            if (b2 != null) {
                long j = this.e;
                if (j == 0) {
                    j = ((Number) this.b.mo4828invoke()).longValue();
                }
                long j2 = this.a;
                b2.a(new I(j2, j - j2, j != 0));
            }
            return Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
    }

    private final void f() {
        try {
            setName(a());
        } catch (Throwable unused) {
        }
        e();
    }

    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.g = new WeakReference(context.getApplicationContext());
    }

    public final void c() {
        a(2);
    }

    public final void d() {
        a(1);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (this.f < 2) {
            f();
            try {
                this.c.invoke(200L);
            } catch (InterruptedException unused) {
                if (this.f == 2) {
                    break;
                }
            }
        }
        f();
        try {
            this.c.invoke(5000L);
            Unit unit = Unit.INSTANCE;
        } catch (Throwable unused2) {
        }
    }

    private final String a() {
        long longValue = ((Number) this.b.mo4828invoke()).longValue();
        return "bm:s:" + this.f + ':' + this.a + ':' + (this.e < this.a ? "" : String.valueOf(this.e - this.a)) + ':' + (longValue - this.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(long j, Function0 currentTimeProvider, Function1 sleeper, Function1 storageFactory) {
        super("bm:s:0:" + j);
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(sleeper, "sleeper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        this.a = j;
        this.b = currentTimeProvider;
        this.c = sleeper;
        this.d = storageFactory;
    }

    private final void a(int i2) {
        if (i2 < this.f) {
            return;
        }
        if (i2 == 2) {
            this.e = ((Number) this.b.mo4828invoke()).longValue();
            this.f = i2;
            try {
                interrupt();
                Unit unit = Unit.INSTANCE;
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        this.f = i2;
    }
}
