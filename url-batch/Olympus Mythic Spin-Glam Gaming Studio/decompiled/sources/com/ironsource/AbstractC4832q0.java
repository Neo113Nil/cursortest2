package com.ironsource;

import com.ironsource.F0;
import com.ironsource.InterfaceC4724k0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.q0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC4832q0 {

    @NotNull
    private final AbstractC4961x0 a;

    @NotNull
    private final V0 b;

    @Nullable
    private M0 c;

    @Nullable
    private InterfaceC4997z0 d;

    @NotNull
    private final Lg e;

    @NotNull
    private final WeakReference<K0> f;

    @Nullable
    private C4658g5 g;

    @NotNull
    private final C5002z5 h;

    /* renamed from: com.ironsource.q0$b */
    public static final class b implements Tg {
        b() {
        }

        @Override // com.ironsource.Tg
        public void a(int i, @NotNull String errorReason) {
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            AbstractC4832q0.this.a(i, errorReason);
        }

        @Override // com.ironsource.Tg
        public void b(@NotNull B instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            AbstractC4832q0.this.h.e().a(C4658g5.a(AbstractC4832q0.this.g), AbstractC4832q0.this.e().u());
            M0 j = AbstractC4832q0.this.j();
            if (j != null) {
                j.a(new C4903u0(AbstractC4832q0.this, instance.e()));
            }
        }

        @Override // com.ironsource.Tg
        public void a(@NotNull B instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            AbstractC4832q0.this.f().f().a().e(AbstractC4832q0.this.h());
            M0 j = AbstractC4832q0.this.j();
            if (j != null) {
                j.b(new C4903u0(AbstractC4832q0.this, instance.e()));
            }
        }
    }

    public AbstractC4832q0(@NotNull C4814p0 adTools, @NotNull AbstractC4961x0 adUnitData, @NotNull K0 listener) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a = adUnitData;
        V0 v0 = new V0(adTools, adUnitData, F0.b.MEDIATION);
        this.b = v0;
        this.e = new Lg(v0, adUnitData, false, c(), null, null, 48, null);
        this.f = new WeakReference<>(listener);
        this.h = v0.f();
        IronLog.INTERNAL.verbose("adFormat = " + adUnitData.b().a() + ", adUnitId = " + adUnitData.b().c());
    }

    @NotNull
    protected abstract E a();

    @NotNull
    public InterfaceC4724k0 d() {
        return this.e.h() ? InterfaceC4724k0.b.a : new InterfaceC4724k0.a(null, 1, null);
    }

    @NotNull
    protected final AbstractC4961x0 e() {
        return this.a;
    }

    @NotNull
    protected final V0 f() {
        return this.b;
    }

    @Nullable
    protected final C4684hd g() {
        return this.a.b().f();
    }

    @NotNull
    protected final String h() {
        return this.a.l();
    }

    @Nullable
    protected final InterfaceC4997z0 i() {
        return this.d;
    }

    @Nullable
    protected final M0 j() {
        return this.c;
    }

    @NotNull
    protected final Lg k() {
        return this.e;
    }

    private final b c() {
        return new b();
    }

    protected final void a(@Nullable InterfaceC4997z0 interfaceC4997z0) {
        this.d = interfaceC4997z0;
    }

    protected final void b(@Nullable M0 m0) {
        this.c = m0;
    }

    public void a(@NotNull M0 loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        IronLog.INTERNAL.verbose(C4814p0.a(this.b, (String) null, (String) null, 3, (Object) null));
        this.b.a(b());
        this.c = loadListener;
        this.h.a(this.a.u());
        this.g = new C4658g5();
        this.e.a(a());
    }

    @NotNull
    public C4867s0 b() {
        return new C4867s0(this.a.b());
    }

    /* renamed from: com.ironsource.q0$a */
    protected class a implements F {
        public a() {
        }

        @Override // com.ironsource.F
        public void a(@NotNull B instance, @NotNull IronSourceError error) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(error, "error");
            IronLog.INTERNAL.verbose(AbstractC4832q0.this.a(instance.q()));
            AbstractC4832q0.this.h.a().a(AbstractC4832q0.this.h(), error.getErrorCode(), error.getErrorMessage(), null);
            InterfaceC4997z0 i = AbstractC4832q0.this.i();
            if (i != null) {
                i.c(error);
            }
        }

        @Override // com.ironsource.F
        public void b(@NotNull B instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(AbstractC4832q0.this.a(instance.q()));
            AbstractC4832q0.this.k().d(instance);
            AbstractC4832q0.this.h.a().g(AbstractC4832q0.this.h());
            AbstractC4832q0.this.f().l().b(AbstractC4832q0.this.e().b().a());
        }

        @Override // com.ironsource.F
        public void a(@NotNull B instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            AbstractC4832q0.this.h.a().a(AbstractC4832q0.this.h());
            K0 k0 = (K0) AbstractC4832q0.this.f.get();
            if (k0 != null) {
                k0.e();
            }
        }
    }

    public final void a(@NotNull K adInstancePresenter, @NotNull InterfaceC4997z0 displayListener) {
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        Intrinsics.checkNotNullParameter(displayListener, "displayListener");
        this.d = displayListener;
        this.e.a(adInstancePresenter, false);
    }

    public final void a(boolean z) {
        IronLog.INTERNAL.verbose(C4814p0.a(this.b, (String) null, (String) null, 3, (Object) null));
        this.e.d();
        if (z) {
            this.b.f().e().a(this.b.g());
        }
    }

    protected final void a(int i, @NotNull String errorReason) {
        Intrinsics.checkNotNullParameter(errorReason, "errorReason");
        IronLog.INTERNAL.verbose(a("errorCode = " + i + ", errorReason = " + errorReason));
        this.h.e().a(C4658g5.a(this.g), i, errorReason, this.a.u());
        M0 m0 = this.c;
        if (m0 != null) {
            m0.a(new IronSourceError(i, errorReason));
        }
    }

    @NotNull
    protected final String a(@Nullable String str) {
        return C4814p0.a(this.b, str, (String) null, 2, (Object) null);
    }
}
