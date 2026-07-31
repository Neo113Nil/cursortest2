package io.bidmachine.analytics.internal.u;

import android.content.Context;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.a.C5890a;
import io.bidmachine.analytics.internal.a.f;
import io.bidmachine.analytics.internal.h.InterfaceC5906a;
import io.bidmachine.analytics.internal.r.a;
import java.io.FileNotFoundException;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes12.dex */
public final class f extends io.bidmachine.analytics.internal.r.a implements InterfaceC5906a {
    public static final b n = new b(null);
    private final C5890a g;
    private final Function1 h;
    private Context i;
    private io.bidmachine.analytics.internal.u.b j;
    private e k;
    private boolean l;
    private final String m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends Lambda implements Function1 {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.u.b invoke(Context context) {
            return new io.bidmachine.analytics.internal.u.b(context);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static final class c extends ContinuationImpl {
        Object a;
        /* synthetic */ Object b;
        int d;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return f.this.a(null, this);
        }
    }

    public /* synthetic */ f(C5890a c5890a, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c5890a, (i & 2) != 0 ? a.a : function1);
    }

    private final g d() {
        return this.g.d().c();
    }

    @Override // io.bidmachine.analytics.internal.h.AbstractC5909d
    public String a() {
        return this.m;
    }

    @Override // io.bidmachine.analytics.internal.r.a
    public boolean c() {
        return this.l;
    }

    @Override // io.bidmachine.analytics.internal.r.a, io.bidmachine.analytics.internal.h.AbstractC5909d
    public void e(Context context) {
        super.e(context);
        io.bidmachine.analytics.internal.u.b bVar = this.j;
        if (bVar != null) {
            bVar.j();
        }
    }

    @Override // io.bidmachine.analytics.internal.r.a, io.bidmachine.analytics.internal.h.AbstractC5909d
    public void f(Context context) {
        io.bidmachine.analytics.internal.u.b bVar = this.j;
        if (bVar != null) {
            bVar.i();
        }
        super.f(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // io.bidmachine.analytics.internal.r.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(ReaderConfig.Rule rule, Continuation continuation) {
        c cVar;
        int i;
        f fVar;
        io.bidmachine.analytics.internal.u.a aVar;
        e eVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.d = i2 - Integer.MIN_VALUE;
                Object obj = cVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    io.bidmachine.analytics.internal.u.b bVar = this.j;
                    if (bVar == null) {
                        throw new IllegalArgumentException("Not configured");
                    }
                    Duration.Companion companion = Duration.Companion;
                    long m8147getInWholeMillisecondsimpl = Duration.m8147getInWholeMillisecondsimpl(DurationKt.toDuration(10, DurationUnit.SECONDS));
                    cVar.a = this;
                    cVar.d = 1;
                    obj = bVar.a(m8147getInWholeMillisecondsimpl, cVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    fVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = (f) cVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                aVar = (io.bidmachine.analytics.internal.u.a) obj;
                fVar.d().a(aVar);
                eVar = fVar.k;
                if (aVar != null && eVar != null) {
                    eVar.a();
                    eVar.a(io.bidmachine.analytics.internal.v.b.a.a(aVar));
                }
                if (aVar != null) {
                    throw new FileNotFoundException("Data not received yet");
                }
                if (aVar.f()) {
                    throw new FileNotFoundException("Data is empty");
                }
                return aVar.b();
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.d;
        if (i != 0) {
        }
        aVar = (io.bidmachine.analytics.internal.u.a) obj2;
        fVar.d().a(aVar);
        eVar = fVar.k;
        if (aVar != null) {
            eVar.a();
            eVar.a(io.bidmachine.analytics.internal.v.b.a.a(aVar));
        }
        if (aVar != null) {
        }
    }

    @Override // io.bidmachine.analytics.internal.h.AbstractC5909d
    public void d(Context context) {
        this.i = context;
    }

    public f(C5890a c5890a, Function1 function1) {
        this.g = c5890a;
        this.h = function1;
        this.l = true;
        this.m = "apur";
    }

    @Override // io.bidmachine.analytics.internal.r.a, io.bidmachine.analytics.internal.h.AbstractC5909d
    /* renamed from: a */
    public void b(a.C1756a c1756a) {
        super.b(c1756a);
        Context context = this.i;
        if (context != null) {
            if (c1756a.c().size() == 1) {
                ReaderConfig.Rule rule = (ReaderConfig.Rule) CollectionsKt.first(c1756a.c());
                if (rule instanceof ReaderConfig.Rule.PurRule) {
                    ReaderConfig.Rule.PurRule purRule = (ReaderConfig.Rule.PurRule) rule;
                    List split$default = StringsKt.split$default((CharSequence) io.bidmachine.analytics.internal.I.g.b(purRule.getPath()), new String[]{"-"}, false, 0, 6, (Object) null);
                    if (split$default.size() == 2) {
                        f.a aVar = io.bidmachine.analytics.internal.a.f.d;
                        io.bidmachine.analytics.internal.a.f a2 = aVar.a(StringsKt.trim((String) split$default.get(0)).toString());
                        if (a2 != null) {
                            io.bidmachine.analytics.internal.a.f a3 = aVar.a(StringsKt.trim((String) split$default.get(1)).toString());
                            if (a3 != null) {
                                io.bidmachine.analytics.internal.u.b bVar = this.j;
                                if (bVar == null) {
                                    bVar = (io.bidmachine.analytics.internal.u.b) this.h.invoke(context);
                                }
                                this.j = bVar;
                                io.bidmachine.analytics.internal.a.f l = bVar.l();
                                if (l != null) {
                                    if (l.compareTo(a2) >= 0 && l.compareTo(a3) <= 0) {
                                        if (bVar.u()) {
                                            if (bVar.t()) {
                                                this.l = purRule.getShouldReport();
                                                e eVar = this.k;
                                                if (eVar != null) {
                                                    Result.m8022boximpl(eVar.b());
                                                }
                                                String query = purRule.getQuery();
                                                this.k = query != null ? e.c.a(query) : null;
                                                return;
                                            }
                                            throw new IllegalStateException("No permission");
                                        }
                                        throw new IllegalStateException("No host found");
                                    }
                                    throw new IllegalStateException(("Version " + l + " not supported by config").toString());
                                }
                                throw new IllegalStateException("Version not found");
                            }
                            throw new IllegalStateException("Max version not found");
                        }
                        throw new IllegalStateException("Min version not found");
                    }
                    throw new IllegalStateException("Path should contains min and max value");
                }
                throw new IllegalStateException(("Reader " + a() + " accept only PurRule").toString());
            }
            throw new IllegalStateException(("Reader " + a() + " should contains only one rule, received " + c1756a.c().size()).toString());
        }
        throw new IllegalArgumentException("Context is null");
    }

    @Override // io.bidmachine.analytics.internal.h.InterfaceC5906a
    public Object a(String str) {
        e eVar;
        if (!Intrinsics.areEqual(str, "iap") || (eVar = this.k) == null) {
            return null;
        }
        Object c2 = eVar.c();
        return (Boolean) (Result.m8028isFailureimpl(c2) ? null : c2);
    }
}
