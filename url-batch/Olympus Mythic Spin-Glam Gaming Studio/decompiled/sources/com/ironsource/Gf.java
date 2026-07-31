package com.ironsource;

import com.ironsource.If;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes12.dex */
public interface Gf {

    public static final class a {

        @NotNull
        private final If.a a;
        private boolean b;

        public a(@NotNull If.a onCancel) {
            Intrinsics.checkNotNullParameter(onCancel, "onCancel");
            this.a = onCancel;
        }

        public final void a() {
            this.a.cancel();
            this.b = true;
        }

        public final boolean b() {
            return this.b;
        }
    }

    public static final class b {

        @NotNull
        public static final a b = new a(null);

        @NotNull
        private final AbstractRunnableC4756le a;

        public static final class a {

            /* renamed from: com.ironsource.Gf$b$a$a, reason: collision with other inner class name */
            public static final class C0345a extends AbstractRunnableC4756le {
                final /* synthetic */ WeakReference<T> b;
                final /* synthetic */ Function1 c;

                C0345a(WeakReference<T> weakReference, Function1 function1) {
                    this.b = weakReference;
                    this.c = function1;
                }

                @Override // com.ironsource.AbstractRunnableC4756le
                public void a() {
                    Object obj = this.b.get();
                    if (obj != null) {
                        this.c.invoke(obj);
                    }
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final <T> b a(T t, @NotNull Function1 block) {
                Intrinsics.checkNotNullParameter(block, "block");
                return new b(new C0345a(new WeakReference(t), block), null);
            }

            private a() {
            }
        }

        public /* synthetic */ b(AbstractRunnableC4756le abstractRunnableC4756le, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractRunnableC4756le);
        }

        @NotNull
        public final AbstractRunnableC4756le a() {
            return this.a;
        }

        private b(AbstractRunnableC4756le abstractRunnableC4756le) {
            this.a = abstractRunnableC4756le;
        }
    }

    @NotNull
    default a a(@NotNull b task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        return a(task.a(), j);
    }

    @NotNull
    a a(@NotNull Runnable runnable, long j);
}
