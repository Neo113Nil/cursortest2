package com.moloco.sdk.service_locator;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.Init;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.C;
import com.moloco.sdk.internal.C5015b;
import com.moloco.sdk.internal.D;
import com.moloco.sdk.internal.InterfaceC5014a;
import com.moloco.sdk.internal.services.B;
import com.moloco.sdk.internal.services.C5037b;
import com.moloco.sdk.internal.services.C5042e;
import com.moloco.sdk.internal.services.C5044g;
import com.moloco.sdk.internal.services.C5046i;
import com.moloco.sdk.internal.services.F;
import com.moloco.sdk.internal.services.G;
import com.moloco.sdk.internal.services.I;
import com.moloco.sdk.internal.services.InterfaceC5036a;
import com.moloco.sdk.internal.services.InterfaceC5041d;
import com.moloco.sdk.internal.services.InterfaceC5043f;
import com.moloco.sdk.internal.services.InterfaceC5048k;
import com.moloco.sdk.internal.services.J;
import com.moloco.sdk.internal.services.K;
import com.moloco.sdk.internal.services.SingleObserverBackgroundThenForegroundAnalyticsListener;
import com.moloco.sdk.internal.services.init.g;
import com.moloco.sdk.internal.services.l;
import com.moloco.sdk.internal.services.n;
import com.moloco.sdk.internal.services.o;
import com.moloco.sdk.internal.services.q;
import com.moloco.sdk.internal.services.r;
import com.moloco.sdk.internal.services.s;
import com.moloco.sdk.internal.services.t;
import com.moloco.sdk.internal.services.u;
import com.moloco.sdk.internal.services.v;
import com.moloco.sdk.internal.services.y;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5066o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5069s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC5064m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w;
import io.ktor.client.HttpClient;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes10.dex */
public final class a {

    @NotNull
    public static final a a = new a();
    public static final int b = 0;

    @StabilityInferred
    /* renamed from: com.moloco.sdk.service_locator.a$a, reason: collision with other inner class name */
    public static final class C1563a {

        @NotNull
        public static final C1563a a = new C1563a();

        @NotNull
        public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$a$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.C1563a.c();
            }
        });
        public static final int c = 8;

        public static final K c() {
            return new K(a.a.a(), MetricsRecorder.INSTANCE.withNoMediation());
        }

        @NotNull
        public final InterfaceC5064m a() {
            return C5066o.a(g.a.a(), b.a.f());
        }

        @NotNull
        public final K b() {
            return (K) b.getValue();
        }
    }

    @StabilityInferred
    public static final class b {

        @NotNull
        public static final b a = new b();

        @NotNull
        public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$b$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.b.a();
            }
        });

        @NotNull
        public static final Lazy c = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$b$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.b.j();
            }
        });

        @NotNull
        public static final Lazy d = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$b$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.b.b();
            }
        });

        @NotNull
        public static final Lazy e = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$b$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.b.c();
            }
        });

        @NotNull
        public static final Lazy f = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$b$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.b.i();
            }
        });
        public static final int g = 8;

        public static final com.moloco.sdk.internal.services.analytics.b a() {
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i c2 = i.a.c();
            k kVar = k.a;
            return new com.moloco.sdk.internal.services.analytics.b(c2, kVar.b(), kVar.c());
        }

        public static final C5044g b() {
            return new C5044g(ProcessLifecycleOwner.INSTANCE.get().getLifecycle(), a.h());
        }

        public static final com.moloco.sdk.internal.error.c c() {
            return new com.moloco.sdk.internal.error.c(c.a.b(), new com.moloco.sdk.internal.error.api.b(h.a.i(), com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c.a()));
        }

        public static final com.moloco.sdk.internal.ilrd.b i() {
            return new com.moloco.sdk.internal.ilrd.b(a.a.a());
        }

        public static final SingleObserverBackgroundThenForegroundAnalyticsListener j() {
            return new SingleObserverBackgroundThenForegroundAnalyticsListener(a.d(), h.a.i());
        }

        @NotNull
        public final com.moloco.sdk.internal.services.analytics.a d() {
            return (com.moloco.sdk.internal.services.analytics.a) b.getValue();
        }

        @NotNull
        public final InterfaceC5043f e() {
            return (InterfaceC5043f) d.getValue();
        }

        @NotNull
        public final com.moloco.sdk.internal.error.b f() {
            return (com.moloco.sdk.internal.error.b) e.getValue();
        }

        @NotNull
        public final com.moloco.sdk.internal.ilrd.b g() {
            return (com.moloco.sdk.internal.ilrd.b) f.getValue();
        }

        @NotNull
        public final SingleObserverBackgroundThenForegroundAnalyticsListener h() {
            return (SingleObserverBackgroundThenForegroundAnalyticsListener) c.getValue();
        }
    }

    @StabilityInferred
    public static final class c {

        @NotNull
        public static final c a = new c();

        @NotNull
        public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$c$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.c.a();
            }
        });
        public static final int c = 8;

        public static final com.moloco.sdk.internal.services.config.b a() {
            return new com.moloco.sdk.internal.services.config.b();
        }

        @NotNull
        public final com.moloco.sdk.internal.services.config.a b() {
            return (com.moloco.sdk.internal.services.config.a) b.getValue();
        }
    }

    @StabilityInferred
    public static final class d {

        @NotNull
        public static final d a = new d();

        @NotNull
        public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$d$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.d.a();
            }
        });
        public static final int c = 8;

        public static final com.moloco.sdk.internal.error.crash.b a() {
            return new com.moloco.sdk.internal.error.crash.b(new com.moloco.sdk.internal.error.crash.d(CollectionsKt.listOf(new com.moloco.sdk.internal.error.crash.filters.b()), new com.moloco.sdk.internal.error.api.b(h.a.i(), com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c.a()), MetricsRecorder.INSTANCE.withNoMediation()));
        }

        @NotNull
        public final com.moloco.sdk.internal.error.crash.a b() {
            return (com.moloco.sdk.internal.error.crash.a) b.getValue();
        }
    }

    @StabilityInferred
    public static final class e {

        @NotNull
        public static final e a = new e();

        @NotNull
        public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$e$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.e.b();
            }
        });

        @NotNull
        public static final Lazy c = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$e$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.e.f();
            }
        });

        @NotNull
        public static final Lazy d = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$e$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.e.c();
            }
        });

        @NotNull
        public static final Lazy e = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$e$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.e.n();
            }
        });

        @NotNull
        public static final Lazy f = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$e$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.e.e();
            }
        });

        @NotNull
        public static final Lazy g = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$e$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.e.d();
            }
        });

        @NotNull
        public static final Lazy h = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$e$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.e.a();
            }
        });
        public static final int i = 8;

        public static final C5037b a() {
            return new C5037b(a.a.a());
        }

        public static final l b() {
            return new l(a.a.a());
        }

        public static final o c() {
            return new o(a.a.a());
        }

        public static final r d() {
            return new r(a.a.a());
        }

        public static final v e() {
            return new v(a.a.a());
        }

        public static final C5046i f() {
            return new C5046i(a.a.a());
        }

        public static final G n() {
            return new G(a.a.a());
        }

        @NotNull
        public final InterfaceC5036a g() {
            return (InterfaceC5036a) h.getValue();
        }

        @NotNull
        public final InterfaceC5048k h() {
            return (InterfaceC5048k) b.getValue();
        }

        @NotNull
        public final n i() {
            return (n) d.getValue();
        }

        @NotNull
        public final q j() {
            return (q) g.getValue();
        }

        @NotNull
        public final u k() {
            return (u) f.getValue();
        }

        @NotNull
        public final y l() {
            return (y) c.getValue();
        }

        @NotNull
        public final F m() {
            return (F) e.getValue();
        }
    }

    @StabilityInferred
    public static final class g {

        @NotNull
        public static final g a = new g();

        @NotNull
        public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$g$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.g.d();
            }
        });

        @NotNull
        public static final Lazy c = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$g$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.g.c();
            }
        });
        public static final int d = 8;

        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j c() {
            g gVar = a;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l b2 = gVar.b();
            e eVar = e.a;
            u k = eVar.k();
            b bVar = b.a;
            com.moloco.sdk.internal.error.b f = bVar.f();
            i iVar = i.a;
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j(gVar.b(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d(eVar.k(), bVar.f(), iVar.a()), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b(b2, k, f, iVar.a()), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g(a.a.a(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.k.a));
        }

        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l d() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l) c.a.b().a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l.class, m.a());
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i a() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i) c.getValue();
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l b() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l) b.getValue();
        }
    }

    @StabilityInferred
    public static final class h {

        @NotNull
        public static final h a = new h();

        @NotNull
        public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$h$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.h.m();
            }
        });

        @NotNull
        public static final Lazy c = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$h$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.h.l();
            }
        });

        @NotNull
        public static final Lazy d = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$h$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.h.b();
            }
        });

        @NotNull
        public static final Lazy e = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$h$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.h.n();
            }
        });

        @NotNull
        public static final Lazy f = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$h$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.h.a();
            }
        });
        public static final int g = 8;

        public static final ActivityManager a() {
            Object systemService = a.a.a().getSystemService("activity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            return (ActivityManager) systemService;
        }

        public static final C5042e b() {
            return new C5042e(a.a.a());
        }

        public static final com.moloco.sdk.internal.services.proto.b l() {
            return new com.moloco.sdk.internal.services.proto.b();
        }

        public static final J m() {
            return new J();
        }

        public static final D n() {
            return new D();
        }

        @NotNull
        public final ActivityManager c() {
            return (ActivityManager) f.getValue();
        }

        @NotNull
        public final InterfaceC5041d d() {
            return (InterfaceC5041d) d.getValue();
        }

        @NotNull
        public final s e() {
            return new t(f(), k.a.b());
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r f() {
            return new C5069s(a.a.a());
        }

        @NotNull
        public final Q g() {
            return new w();
        }

        @NotNull
        public final com.moloco.sdk.internal.services.proto.a h() {
            return (com.moloco.sdk.internal.services.proto.a) c.getValue();
        }

        @NotNull
        public final I i() {
            return (I) b.getValue();
        }

        @NotNull
        public final C j() {
            return (C) e.getValue();
        }

        @NotNull
        public final Q k() {
            return new S();
        }
    }

    @StabilityInferred
    public static final class i {

        @NotNull
        public static final i a = new i();

        @NotNull
        public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$i$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.i.e();
            }
        });

        @NotNull
        public static final Lazy c = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$i$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.i.f();
            }
        });

        @NotNull
        public static final Lazy d = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$i$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.i.h();
            }
        });

        @NotNull
        public static final Lazy e = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$i$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.i.g();
            }
        });
        public static final int f = 8;

        public static final HttpClient e() {
            e eVar = e.a;
            return com.moloco.sdk.internal.http.a.a(eVar.h().invoke(), eVar.l().invoke());
        }

        public static final com.moloco.sdk.internal.services.C f() {
            return new com.moloco.sdk.internal.services.C(a.a.a(), e.a.l());
        }

        public static final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i g() {
            return com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i.a.a(a.d());
        }

        public static final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.m h() {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.m(a.a.a());
        }

        @NotNull
        public final HttpClient a() {
            return (HttpClient) b.getValue();
        }

        @NotNull
        public final B b() {
            return (B) c.getValue();
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i c() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i) e.getValue();
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l d() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l) d.getValue();
        }
    }

    @StabilityInferred
    public static final class j {

        @NotNull
        public static final j a = new j();

        @NotNull
        public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$j$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.j.a();
            }
        });
        public static final int c = 8;

        public static final com.moloco.sdk.internal.services.D a() {
            SharedPreferences sharedPreferences = a.a.a().getSharedPreferences("moloco_sdk_preferences", 0);
            Intrinsics.checkNotNull(sharedPreferences);
            return new com.moloco.sdk.internal.services.D(sharedPreferences);
        }

        @NotNull
        public final com.moloco.sdk.internal.services.w b() {
            return (com.moloco.sdk.internal.services.w) b.getValue();
        }
    }

    @StabilityInferred
    public static final class k {

        @NotNull
        public static final k a = new k();

        @NotNull
        public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$k$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.k.g();
            }
        });

        @NotNull
        public static final Lazy c = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$k$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.k.h();
            }
        });

        @NotNull
        public static final Lazy d = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$k$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.k.a();
            }
        });
        public static final int e = 8;

        public static final com.moloco.sdk.internal.services.events.c a() {
            return new com.moloco.sdk.internal.services.events.c();
        }

        public static final com.moloco.sdk.internal.services.usertracker.c g() {
            return new com.moloco.sdk.internal.services.usertracker.c(j.a.b());
        }

        public static final com.moloco.sdk.internal.services.usertracker.g h() {
            k kVar = a;
            return new com.moloco.sdk.internal.services.usertracker.g(kVar.e(), kVar.d());
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a b() {
            e eVar = e.a;
            InterfaceC5048k h = eVar.h();
            B b2 = i.a.b();
            y l = eVar.l();
            F m = eVar.m();
            com.moloco.sdk.internal.services.usertracker.f f = f();
            h hVar = h.a;
            return new com.moloco.sdk.internal.services.events.a(h, b2, l, m, f, hVar.d(), hVar.h(), c(), BuildConfig.SDK_VERSION_NAME);
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c c() {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c) d.getValue();
        }

        @NotNull
        public final com.moloco.sdk.internal.services.usertracker.b d() {
            return (com.moloco.sdk.internal.services.usertracker.b) b.getValue();
        }

        @NotNull
        public final com.moloco.sdk.internal.services.usertracker.e e() {
            return new com.moloco.sdk.internal.services.usertracker.a();
        }

        @NotNull
        public final com.moloco.sdk.internal.services.usertracker.f f() {
            return (com.moloco.sdk.internal.services.usertracker.f) c.getValue();
        }
    }

    @NotNull
    public final Context a() {
        return com.moloco.sdk.internal.android_context.b.a(null, 1, null);
    }

    @StabilityInferred
    public static final class f {

        @Nullable
        public static volatile InterfaceC5014a b;

        @NotNull
        public static final f a = new f();

        @NotNull
        public static final Lazy c = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$f$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.f.f();
            }
        });

        @NotNull
        public static final Lazy d = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$f$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.f.d();
            }
        });

        @NotNull
        public static final Lazy e = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.service_locator.a$f$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return a.f.e();
            }
        });
        public static final int f = 8;

        public static final com.moloco.sdk.internal.services.init.e d() {
            e eVar = e.a;
            return new com.moloco.sdk.internal.services.init.e(eVar.l(), eVar.h(), k.a.f(), BuildConfig.SDK_VERSION_NAME, BuildConfig.MOLOCO_ENDPOINT_INIT_CONFIG, 3000L, i.a.a());
        }

        public static final com.moloco.sdk.internal.services.init.l e() {
            com.moloco.sdk.internal.services.init.d a2 = a.a();
            g.a aVar = com.moloco.sdk.internal.services.init.g.a;
            SharedPreferences sharedPreferences = a.a.a().getSharedPreferences("moloco_sdk_init_cache", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
            return new com.moloco.sdk.internal.services.init.l(a2, aVar.a(sharedPreferences), CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getIo().plus(SupervisorKt.SupervisorJob$default(null, 1, null))));
        }

        public static final com.moloco.sdk.internal.services.init.o f() {
            return new com.moloco.sdk.internal.services.init.o(BuildConfig.MOLOCO_ENDPOINT_INIT_TRACKING, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c.a());
        }

        @NotNull
        public final InterfaceC5014a a(@NotNull Init.SDKInitResponse initResponse) {
            Intrinsics.checkNotNullParameter(initResponse, "initResponse");
            InterfaceC5014a interfaceC5014a = b;
            if (interfaceC5014a == null) {
                synchronized (this) {
                    interfaceC5014a = b;
                    if (interfaceC5014a == null) {
                        interfaceC5014a = new C5015b(initResponse, k.a.b(), h.a.e());
                        b = interfaceC5014a;
                    }
                }
            }
            return interfaceC5014a;
        }

        @NotNull
        public final com.moloco.sdk.internal.services.init.k b() {
            return (com.moloco.sdk.internal.services.init.k) e.getValue();
        }

        @NotNull
        public final com.moloco.sdk.internal.services.init.n c() {
            return (com.moloco.sdk.internal.services.init.n) c.getValue();
        }

        @NotNull
        public final com.moloco.sdk.internal.services.init.d a() {
            return (com.moloco.sdk.internal.services.init.d) d.getValue();
        }
    }
}
