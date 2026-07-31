package com.ironsource;

import com.ironsource.Mb;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.KotlinVersion;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class Kf {

    @NotNull
    public static final Kf a = new Kf();

    @NotNull
    private static Function0 b = d.a;

    @NotNull
    private static final Lazy c = LazyKt.lazy(c.a);

    @NotNull
    private static final Lazy d = LazyKt.lazy(a.a);

    static final class a extends Lambda implements Function0 {
        public static final a a = new a();

        /* renamed from: com.ironsource.Kf$a$a, reason: collision with other inner class name */
        public static final class C0347a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
            public C0347a(CoroutineExceptionHandler.Key key) {
                super(key);
            }

            @Override // kotlinx.coroutines.CoroutineExceptionHandler
            public void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
                IronLog.INTERNAL.error("CoroutineExceptionHandler caught: " + th.getMessage());
            }
        }

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineScope mo4828invoke() {
            return CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(new C0347a(CoroutineExceptionHandler.Key)));
        }
    }

    @DebugMetadata(c = "com.unity3d.mediation.internal.TempThreadManager$launchCoroutineTask$1", f = "TempThreadManager.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2 {
        int a;
        final /* synthetic */ Runnable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable, Continuation continuation) {
            super(2, continuation);
            this.b = runnable;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new b(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                Kf.a.a(this.b, true).run();
            } catch (Throwable th) {
                C4782n4.d().a(th);
                IronLog.INTERNAL.error("Exception in TempThreadManager coroutine: " + th.getMessage());
            }
            return Unit.INSTANCE;
        }
    }

    static final class c extends Lambda implements Function0 {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4774me mo4828invoke() {
            return new C4774me(16, null, 2, null);
        }
    }

    static final class d extends Lambda implements Function0 {
        public static final d a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo4828invoke() {
            return Boolean.valueOf(RangesKt.random(new IntRange(0, 9), Random.Default) == 0);
        }
    }

    private Kf() {
    }

    private final C4774me b() {
        return (C4774me) c.getValue();
    }

    @NotNull
    public final Function0 c() {
        return b;
    }

    public final void a(@NotNull Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        b = function0;
    }

    public final void b(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (a(action)) {
            return;
        }
        b().execute(a(action, false));
    }

    private final CoroutineScope a() {
        return (CoroutineScope) d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable a(final Runnable runnable, final boolean z) {
        return new Runnable() { // from class: com.ironsource.Kf$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Kf.b(runnable, z);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Runnable action, boolean z) {
        Intrinsics.checkNotNullParameter(action, "$action");
        action.run();
        a.a(z);
    }

    private final boolean a(Runnable runnable) {
        if (!Kb.u.d().h().F()) {
            return false;
        }
        try {
            BuildersKt__Builders_commonKt.launch$default(a(), null, null, new b(runnable, null), 3, null);
            return true;
        } catch (Throwable th) {
            try {
                Jf.a(th);
            } catch (Exception e) {
                C4782n4.d().a(e);
            }
            IronLog.INTERNAL.error("Failed to launch coroutine: " + th.getMessage());
            return false;
        }
    }

    private final void a(boolean z) {
        if (((Boolean) b.mo4828invoke()).booleanValue()) {
            try {
                int activeCount = Thread.activeCount();
                Mb mb = new Mb.a.C0348a().get();
                String kotlinVersion = KotlinVersion.CURRENT.toString();
                StringBuilder sb = new StringBuilder();
                sb.append("kotlinVersion=" + kotlinVersion + ";");
                if (z) {
                    sb.append("coroutineVersion=" + new C4728k4().a() + ";");
                }
                sb.append("threadCount=" + activeCount + ";");
                sb.append("javaHeapKb=" + mb.d() + ";");
                sb.append("nativeHeapKb=" + mb.e() + ";");
                sb.append("sharedOtherKb=" + mb.f());
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
                JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
                jsonObjectInit.put(IronSourceConstants.EVENTS_EXT1, sb2);
                Jf.a(EnumC4984y5.TROUBLESHOOTING_COROUTINE_USAGE_METRICS, jsonObjectInit);
            } catch (Exception e) {
                IronLog.INTERNAL.error("Failed to send usage metrics: " + e.getMessage());
            }
        }
    }
}
