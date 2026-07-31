package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KFunction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes11.dex */
public final class R7 implements InterfaceC4704ig {
    private static boolean c = false;

    @NotNull
    public static final String d = "deviceStatus";

    @NotNull
    public static final String e = "iabTokenAPI";

    @NotNull
    public static final String f = "dsSharedSignalsAPI";

    @NotNull
    public static final String g = "deleteFolder";

    @NotNull
    public static final String h = "deleteFile";

    @NotNull
    public static final String i = "getCachedFilesMap";

    @NotNull
    public static final String j = "permissionsAPI";

    @NotNull
    public static final String k = "deviceDataAPI";

    @NotNull
    public static final String l = "adViewAPI";

    @NotNull
    private static final S9 o;

    @NotNull
    private static final S9 p;

    @NotNull
    private static final S9 q;

    @NotNull
    public static final R7 a = new R7();

    @NotNull
    private static final Handler b = new Handler(Looper.getMainLooper());

    @NotNull
    private static final Lazy m = LazyKt.lazy(a.a);

    @NotNull
    private static final Lazy n = LazyKt.lazy(b.a);

    static final class a extends Lambda implements Function0 {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4774me mo4828invoke() {
            return new C4774me(0, null, 3, null);
        }
    }

    static final class b extends Lambda implements Function0 {
        public static final b a = new b();

        /* synthetic */ class a extends FunctionReferenceImpl implements Function0 {
            a(Object obj) {
                super(0, obj, A7.class, "shouldRunOnBackgroundThreadDeviceStatus", "shouldRunOnBackgroundThreadDeviceStatus()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean mo4828invoke() {
                return Boolean.valueOf(((A7) this.receiver).o());
            }
        }

        /* renamed from: com.ironsource.R7$b$b, reason: collision with other inner class name */
        /* synthetic */ class C0354b extends FunctionReferenceImpl implements Function0 {
            C0354b(Object obj) {
                super(0, obj, A7.class, "shouldRunOnBackgroundThreadIabToken", "shouldRunOnBackgroundThreadIabToken()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean mo4828invoke() {
                return Boolean.valueOf(((A7) this.receiver).r());
            }
        }

        /* synthetic */ class c extends FunctionReferenceImpl implements Function0 {
            c(Object obj) {
                super(0, obj, A7.class, "shouldRunOnBackgroundThreadSharedSignals", "shouldRunOnBackgroundThreadSharedSignals()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean mo4828invoke() {
                return Boolean.valueOf(((A7) this.receiver).q());
            }
        }

        /* synthetic */ class d extends FunctionReferenceImpl implements Function0 {
            d(Object obj) {
                super(0, obj, A7.class, "shouldRunOnBackgroundThreadDeleteFolder", "shouldRunOnBackgroundThreadDeleteFolder()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean mo4828invoke() {
                return Boolean.valueOf(((A7) this.receiver).k());
            }
        }

        /* synthetic */ class e extends FunctionReferenceImpl implements Function0 {
            e(Object obj) {
                super(0, obj, A7.class, "shouldRunOnBackgroundThreadDeleteFile", "shouldRunOnBackgroundThreadDeleteFile()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean mo4828invoke() {
                return Boolean.valueOf(((A7) this.receiver).p());
            }
        }

        /* synthetic */ class f extends FunctionReferenceImpl implements Function0 {
            f(Object obj) {
                super(0, obj, A7.class, "shouldRunOnBackgroundThreadCachedFiles", "shouldRunOnBackgroundThreadCachedFiles()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean mo4828invoke() {
                return Boolean.valueOf(((A7) this.receiver).b());
            }
        }

        /* synthetic */ class g extends FunctionReferenceImpl implements Function0 {
            g(Object obj) {
                super(0, obj, A7.class, "shouldRunOnBackgroundThreadPermissions", "shouldRunOnBackgroundThreadPermissions()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean mo4828invoke() {
                return Boolean.valueOf(((A7) this.receiver).H());
            }
        }

        /* synthetic */ class h extends FunctionReferenceImpl implements Function0 {
            h(Object obj) {
                super(0, obj, A7.class, "shouldRunOnBackgroundThreadDeviceData", "shouldRunOnBackgroundThreadDeviceData()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean mo4828invoke() {
                return Boolean.valueOf(((A7) this.receiver).G());
            }
        }

        /* synthetic */ class i extends FunctionReferenceImpl implements Function0 {
            i(Object obj) {
                super(0, obj, A7.class, "shouldRunOnBackgroundThreadAdView", "shouldRunOnBackgroundThreadAdView()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean mo4828invoke() {
                return Boolean.valueOf(((A7) this.receiver).J());
            }
        }

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<String, KFunction<Boolean>> mo4828invoke() {
            A7 h2 = Kb.u.d().h();
            return MapsKt.mapOf(TuplesKt.to(R7.d, new a(h2)), TuplesKt.to(R7.e, new C0354b(h2)), TuplesKt.to(R7.f, new c(h2)), TuplesKt.to("deleteFolder", new d(h2)), TuplesKt.to("deleteFile", new e(h2)), TuplesKt.to(R7.i, new f(h2)), TuplesKt.to(R7.j, new g(h2)), TuplesKt.to(R7.k, new h(h2)), TuplesKt.to(R7.l, new i(h2)));
        }
    }

    static {
        S9 s9 = new S9("isadplayer-background");
        s9.start();
        s9.a();
        o = s9;
        S9 s92 = new S9("isadplayer-publisher-callbacks");
        s92.start();
        s92.a();
        p = s92;
        S9 s93 = new S9("isadplayer-release");
        s93.start();
        s93.a();
        q = s93;
    }

    private R7() {
    }

    private final boolean f(Runnable runnable) {
        return c && b().getQueue().contains(runnable);
    }

    public final void a(boolean z) {
        c = z;
    }

    public final void b(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        a(this, action, 0L, 2, (Object) null);
    }

    public final void c(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        b(this, action, 0L, 2, null);
    }

    public final void d(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        c(this, action, 0L, 2, null);
    }

    public final boolean e() {
        return c;
    }

    private final C4774me b() {
        return (C4774me) m.getValue();
    }

    private final Map<String, Function0> c() {
        return (Map) n.getValue();
    }

    @Override // com.ironsource.InterfaceC4704ig
    public void a(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        c(this, action, 0L, 2, null);
    }

    public final void d(@NotNull Runnable action, long j2) {
        Intrinsics.checkNotNullParameter(action, "action");
        b.postDelayed(action, j2);
    }

    public final void e(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (f(action)) {
            b().remove(action);
        } else {
            q.b(action);
        }
    }

    public static /* synthetic */ void a(R7 r7, Runnable runnable, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        r7.b(runnable, j2);
    }

    public static /* synthetic */ void c(R7 r7, Runnable runnable, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        r7.d(runnable, j2);
    }

    public final void b(@NotNull Runnable action, long j2) {
        Intrinsics.checkNotNullParameter(action, "action");
        o.a(action, j2);
    }

    @NotNull
    public final ThreadPoolExecutor d() {
        return b();
    }

    public static /* synthetic */ void b(R7 r7, Runnable runnable, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        r7.c(runnable, j2);
    }

    @Override // com.ironsource.InterfaceC4704ig
    public void a(@NotNull Runnable action, long j2) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (c) {
            b().schedule(action, j2, TimeUnit.MILLISECONDS);
        } else {
            q.a(action, j2);
        }
    }

    public final void c(@NotNull Runnable action, long j2) {
        Intrinsics.checkNotNullParameter(action, "action");
        p.a(action, j2);
    }

    @Nullable
    public final Looper a() {
        return o.getLooper();
    }

    public final void a(@NotNull Runnable action, @NotNull String name) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(name, "name");
        Function0 function0 = c().get(name);
        if (function0 != null ? ((Boolean) function0.mo4828invoke()).booleanValue() : false) {
            a(this, action, 0L, 2, (Object) null);
        } else {
            action.run();
        }
    }
}
