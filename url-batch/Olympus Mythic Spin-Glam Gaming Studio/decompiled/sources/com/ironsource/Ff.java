package com.ironsource;

import com.ironsource.Gf;
import com.ironsource.environment.thread.IronSourceThreadManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes12.dex */
public final class Ff implements Gf {

    @NotNull
    public static final a c = new a(null);

    @NotNull
    private static If d = new M5(IronSourceThreadManager.INSTANCE.getLevelPlayThread());

    @NotNull
    private final If a;

    @NotNull
    private final InterfaceC4669gg b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final If a() {
            return Ff.d;
        }

        private a() {
        }

        public final void a(@NotNull If r2) {
            Intrinsics.checkNotNullParameter(r2, "<set-?>");
            Ff.d = r2;
        }
    }

    public static final class b extends AbstractRunnableC4756le {
        final /* synthetic */ Runnable b;

        b(Runnable runnable) {
            this.b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC4756le
        public void a() {
            this.b.run();
        }
    }

    /* synthetic */ class c extends FunctionReferenceImpl implements Function0 {
        c(Object obj) {
            super(0, obj, AbstractRunnableC4756le.class, "run", "run()V", 0);
        }

        public final void a() {
            ((AbstractRunnableC4756le) this.receiver).run();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ff() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public Ff(@NotNull If engine, @NotNull InterfaceC4669gg dispatcher) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.a = engine;
        this.b = dispatcher;
    }

    @Override // com.ironsource.Gf
    @NotNull
    public Gf.a a(@NotNull Runnable task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        final AbstractRunnableC4756le a2 = a(task);
        return new Gf.a(this.a.a(Duration.m8147getInWholeMillisecondsimpl(j), new Runnable() { // from class: com.ironsource.Ff$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Ff.a(Ff.this, a2);
            }
        }));
    }

    public /* synthetic */ Ff(If r1, InterfaceC4669gg interfaceC4669gg, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? d : r1, (i & 2) != 0 ? C4687hg.a(new C4876s9()) : interfaceC4669gg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ff this$0, AbstractRunnableC4756le checkedRunnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(checkedRunnable, "$checkedRunnable");
        this$0.b.a(new c(checkedRunnable));
    }

    private final AbstractRunnableC4756le a(Runnable runnable) {
        return runnable instanceof AbstractRunnableC4756le ? (AbstractRunnableC4756le) runnable : new b(runnable);
    }
}
