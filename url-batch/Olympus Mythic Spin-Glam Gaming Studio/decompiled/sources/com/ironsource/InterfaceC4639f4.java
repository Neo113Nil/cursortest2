package com.ironsource;

import com.ironsource.InterfaceC4570b7;
import com.ironsource.InterfaceC4740kg;
import com.ironsource.Y6;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.f4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC4639f4 {

    @NotNull
    public static final c a = c.a;

    /* renamed from: com.ironsource.f4$a */
    public static final class a implements InterfaceC4639f4 {

        @NotNull
        private final X6 b;

        @NotNull
        private final InterfaceC4740kg c;

        @NotNull
        private final AtomicBoolean d;

        /* renamed from: com.ironsource.f4$a$a, reason: collision with other inner class name */
        public static final class C1362a implements InterfaceC4740kg.a {
            final /* synthetic */ d a;
            final /* synthetic */ a b;

            C1362a(d dVar, a aVar) {
                this.a = dVar;
                this.b = aVar;
            }

            @Override // com.ironsource.InterfaceC4740kg.a
            public void a() {
                this.a.a(new InterfaceC4570b7.a(new Y6.a(this.b.b.b())));
                this.b.d.set(false);
            }
        }

        public a(@NotNull X6 config, @NotNull InterfaceC4740kg timer) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(timer, "timer");
            this.b = config;
            this.c = timer;
            this.d = new AtomicBoolean(false);
        }

        @Override // com.ironsource.InterfaceC4639f4
        public synchronized void a(@NotNull d callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (this.d.compareAndSet(false, true)) {
                this.c.a(new C1362a(callback, this));
            }
        }

        @Override // com.ironsource.InterfaceC4639f4
        public synchronized void a() {
            this.c.cancel();
            this.d.set(false);
        }
    }

    /* renamed from: com.ironsource.f4$b */
    public static final class b implements InterfaceC4639f4 {

        @NotNull
        public static final b b = new b();

        private b() {
        }

        @Override // com.ironsource.InterfaceC4639f4
        public void a() {
        }

        @Override // com.ironsource.InterfaceC4639f4
        public void a(@NotNull d callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
        }
    }

    /* renamed from: com.ironsource.f4$d */
    public interface d {
        void a(@NotNull InterfaceC4570b7 interfaceC4570b7);
    }

    @NotNull
    static InterfaceC4639f4 a(@NotNull Z6 z6) {
        return a.a(z6);
    }

    void a();

    void a(@NotNull d dVar);

    /* renamed from: com.ironsource.f4$c */
    public static final class c {
        static final /* synthetic */ c a = new c();

        private c() {
        }

        @NotNull
        public final InterfaceC4639f4 a(@NotNull Z6 featureFlag) {
            Intrinsics.checkNotNullParameter(featureFlag, "featureFlag");
            if (!featureFlag.b()) {
                return b.b;
            }
            W6 w6 = new W6(featureFlag);
            InterfaceC4740kg.b bVar = new InterfaceC4740kg.b();
            bVar.b(w6.a());
            bVar.a(w6.a());
            return new a(w6, new InterfaceC4740kg.d().a(bVar));
        }

        @NotNull
        public final InterfaceC4639f4 a() {
            return b.b;
        }
    }
}
