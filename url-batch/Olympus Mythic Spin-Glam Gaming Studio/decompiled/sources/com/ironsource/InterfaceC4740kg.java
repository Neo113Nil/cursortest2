package com.ironsource;

import com.ironsource.C4776mg;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.kg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC4740kg {

    /* renamed from: com.ironsource.kg$a */
    public interface a {
        void a();
    }

    /* renamed from: com.ironsource.kg$b */
    public static final class b {
        private long a;
        private long b;

        public final long a() {
            return this.b;
        }

        public final long b() {
            return this.a;
        }

        public final void a(long j) {
            this.b = j;
        }

        public final void b(long j) {
            this.a = j;
        }
    }

    /* renamed from: com.ironsource.kg$c */
    public interface c {
        @NotNull
        InterfaceC4740kg a(@NotNull b bVar);
    }

    /* renamed from: com.ironsource.kg$d */
    public static final class d implements c {
        @Override // com.ironsource.InterfaceC4740kg.c
        @NotNull
        public InterfaceC4740kg a(@NotNull b timerConfig) {
            Intrinsics.checkNotNullParameter(timerConfig, "timerConfig");
            return new e(new C4776mg(timerConfig.b()));
        }
    }

    /* renamed from: com.ironsource.kg$e */
    private static final class e implements InterfaceC4740kg {

        @NotNull
        private final C4776mg a;

        /* renamed from: com.ironsource.kg$e$a */
        public static final class a implements C4776mg.a {
            final /* synthetic */ a a;

            a(a aVar) {
                this.a = aVar;
            }

            @Override // com.ironsource.C4776mg.a
            public void a() {
                this.a.a();
            }
        }

        public e(@NotNull C4776mg timer) {
            Intrinsics.checkNotNullParameter(timer, "timer");
            this.a = timer;
        }

        @Override // com.ironsource.InterfaceC4740kg
        public void a(@NotNull a callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.a.a((C4776mg.a) new a(callback));
        }

        @Override // com.ironsource.InterfaceC4740kg
        public void cancel() {
            this.a.e();
        }
    }

    void a(@NotNull a aVar);

    void cancel();
}
