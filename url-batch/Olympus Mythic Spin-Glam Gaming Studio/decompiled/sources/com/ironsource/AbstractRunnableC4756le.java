package com.ironsource;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.le, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC4756le implements Runnable {

    @NotNull
    public static final a a = new a(null);

    /* renamed from: com.ironsource.le$a */
    public static final class a {

        /* renamed from: com.ironsource.le$a$a, reason: collision with other inner class name */
        public static final class C1366a extends AbstractRunnableC4756le {
            final /* synthetic */ Function0 b;

            C1366a(Function0 function0) {
                this.b = function0;
            }

            @Override // com.ironsource.AbstractRunnableC4756le
            public void a() {
                this.b.mo4828invoke();
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AbstractRunnableC4756le a(@NotNull Function0 block) {
            Intrinsics.checkNotNullParameter(block, "block");
            return new C1366a(block);
        }

        private a() {
        }
    }

    public abstract void a() throws Exception;

    public void a(@NotNull Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        Jf.a(t);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable th) {
            C4782n4.d().a(th);
            try {
                a(th);
            } catch (Throwable th2) {
                C4782n4.d().a(th2);
            }
        }
    }
}
