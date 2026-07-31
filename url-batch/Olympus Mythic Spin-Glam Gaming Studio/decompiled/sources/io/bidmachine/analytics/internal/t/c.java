package io.bidmachine.analytics.internal.t;

import android.content.Context;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.a.C5890a;
import io.bidmachine.analytics.internal.r.a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes10.dex */
public final class c extends io.bidmachine.analytics.internal.r.a {
    public static final b k = new b(null);
    private final C5890a g;
    private final Function1 h;
    private final String i;
    private final Lazy j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends Lambda implements Function1 {
        public static final a a = new a();

        a() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(e eVar) {
            return new d(eVar, null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.t.c$c, reason: collision with other inner class name */
    static final class C1760c extends Lambda implements Function0 {
        C1760c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d mo4828invoke() {
            return (d) c.this.h.invoke(c.this.e());
        }
    }

    public /* synthetic */ c(C5890a c5890a, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c5890a, (i & 2) != 0 ? a.a : function1);
    }

    private final d d() {
        return (d) this.j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e e() {
        return this.g.d().b();
    }

    @Override // io.bidmachine.analytics.internal.h.AbstractC5909d
    public void d(Context context) {
    }

    @Override // io.bidmachine.analytics.internal.r.a, io.bidmachine.analytics.internal.h.AbstractC5909d
    public void f(Context context) {
        d().b();
        super.f(context);
    }

    @Override // io.bidmachine.analytics.internal.h.AbstractC5909d
    public String a() {
        return this.i;
    }

    @Override // io.bidmachine.analytics.internal.r.a, io.bidmachine.analytics.internal.h.AbstractC5909d
    public void e(Context context) {
        super.e(context);
        d().a();
    }

    public c(C5890a c5890a, Function1 function1) {
        this.g = c5890a;
        this.h = function1;
        this.i = "alog";
        this.j = LazyKt.lazy(new C1760c());
    }

    @Override // io.bidmachine.analytics.internal.r.a, io.bidmachine.analytics.internal.h.AbstractC5909d
    /* renamed from: a */
    public void b(a.C1756a c1756a) {
        super.b(c1756a);
        d().a(c1756a);
    }

    @Override // io.bidmachine.analytics.internal.r.a
    public Object a(ReaderConfig.Rule rule, Continuation continuation) {
        return d().a(rule);
    }
}
