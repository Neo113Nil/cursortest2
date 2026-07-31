package com.ironsource;

import android.os.Handler;
import com.ironsource.environment.thread.IronSourceThreadManager;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.s9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4876s9 {

    @NotNull
    public static final a a = new a(null);

    @NotNull
    private static final AtomicReference<InterfaceC4722jg> b = new AtomicReference<>(new U6(new Handler(IronSourceThreadManager.INSTANCE.getSharedManagersThread().getLooper())));

    /* renamed from: com.ironsource.s9$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a() {
            if (Kb.u.d().h().B()) {
                C4876s9.b.set(new L5());
            }
        }

        private a() {
        }
    }

    /* renamed from: com.ironsource.s9$b */
    /* synthetic */ class b extends FunctionReferenceImpl implements Function0 {
        b(Object obj) {
            super(0, obj, Runnable.class, "run", "run()V", 0);
        }

        public final void a() {
            ((Runnable) this.receiver).run();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public final void a(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractRunnableC4756le abstractRunnableC4756le = runnable instanceof AbstractRunnableC4756le ? (AbstractRunnableC4756le) runnable : null;
        if (abstractRunnableC4756le == null) {
            abstractRunnableC4756le = AbstractRunnableC4756le.a.a(new b(runnable));
        }
        InterfaceC4722jg interfaceC4722jg = b.get();
        if (interfaceC4722jg.a()) {
            abstractRunnableC4756le.run();
        } else {
            interfaceC4722jg.a(abstractRunnableC4756le);
        }
    }
}
