package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.j;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes12.dex */
public final class m implements l {
    public static final int i = 8;

    @NotNull
    public final Context a;

    @NotNull
    public final ActivityResultLauncher<Intent> b;

    @NotNull
    public final CoroutineScope c;

    @NotNull
    public final Flow d;
    public final long e;

    @NotNull
    public final Function3 f;

    @NotNull
    public final Function2 g;

    @Nullable
    public a h;

    public static final class a {
        public boolean a;

        @NotNull
        public final Function1 b;

        @NotNull
        public final Job c;

        @NotNull
        public final Job d;

        public a(boolean z, @NotNull Function1 onOutcome, @NotNull Job timeoutJob, @NotNull Job fgJob) {
            Intrinsics.checkNotNullParameter(onOutcome, "onOutcome");
            Intrinsics.checkNotNullParameter(timeoutJob, "timeoutJob");
            Intrinsics.checkNotNullParameter(fgJob, "fgJob");
            this.a = z;
            this.b = onOutcome;
            this.c = timeoutJob;
            this.d = fgJob;
        }

        public final boolean a() {
            return this.a;
        }

        @NotNull
        public final Function1 b() {
            return this.b;
        }

        @NotNull
        public final Job c() {
            return this.c;
        }

        @NotNull
        public final Job d() {
            return this.d;
        }

        public final boolean e() {
            return this.a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c) && Intrinsics.areEqual(this.d, aVar.d);
        }

        @NotNull
        public final Job f() {
            return this.d;
        }

        @NotNull
        public final Function1 g() {
            return this.b;
        }

        @NotNull
        public final Job h() {
            return this.c;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        @NotNull
        public String toString() {
            return "LaunchState(backgroundedSinceLaunch=" + this.a + ", onOutcome=" + this.b + ", timeoutJob=" + this.c + ", fgJob=" + this.d + ')';
        }

        @NotNull
        public final a a(boolean z, @NotNull Function1 onOutcome, @NotNull Job timeoutJob, @NotNull Job fgJob) {
            Intrinsics.checkNotNullParameter(onOutcome, "onOutcome");
            Intrinsics.checkNotNullParameter(timeoutJob, "timeoutJob");
            Intrinsics.checkNotNullParameter(fgJob, "fgJob");
            return new a(z, onOutcome, timeoutJob, fgJob);
        }

        public static /* synthetic */ a a(a aVar, boolean z, Function1 function1, Job job, Job job2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.a;
            }
            if ((i & 2) != 0) {
                function1 = aVar.b;
            }
            if ((i & 4) != 0) {
                job = aVar.c;
            }
            if ((i & 8) != 0) {
                job2 = aVar.d;
            }
            return aVar.a(z, function1, job, job2);
        }

        public final void a(boolean z) {
            this.a = z;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.StoreLauncherImpl$launch$fgJob$1", f = "StoreLauncher.kt", l = {88}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements Function2 {
        public int a;

        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ m a;

            public a(m mVar) {
                this.a = mVar;
            }

            public final Object a(boolean z, Continuation continuation) {
                a aVar;
                if (!z && (aVar = this.a.h) != null) {
                    aVar.a(true);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return m.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flow = m.this.d;
                a aVar = new a(m.this);
                this.a = 1;
                if (flow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.StoreLauncherImpl$launch$timeoutJob$1", f = "StoreLauncher.kt", l = {93}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements Function2 {
        public int a;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return m.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = m.this.e;
                this.a = 1;
                if (DelayKt.m8203delayVtjQ1oo(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            m.this.cancel();
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ m(Context context, ActivityResultLauncher activityResultLauncher, CoroutineScope coroutineScope, Flow flow, long j, Function3 function3, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, activityResultLauncher, coroutineScope, flow, j, function3, function2);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l
    public void cancel() {
        Job f;
        Job h;
        a aVar = this.h;
        if (aVar != null && (h = aVar.h()) != null) {
            Job.DefaultImpls.cancel$default(h, null, 1, null);
        }
        a aVar2 = this.h;
        if (aVar2 != null && (f = aVar2.f()) != null) {
            Job.DefaultImpls.cancel$default(f, null, 1, null);
        }
        this.h = null;
    }

    public m(Context context, ActivityResultLauncher<Intent> installLauncher, CoroutineScope scope, Flow foregroundFlow, long j, Function3 intentFactory, Function2 canResolve) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(installLauncher, "installLauncher");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(foregroundFlow, "foregroundFlow");
        Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
        Intrinsics.checkNotNullParameter(canResolve, "canResolve");
        this.a = context;
        this.b = installLauncher;
        this.c = scope;
        this.d = foregroundFlow;
        this.e = j;
        this.f = intentFactory;
        this.g = canResolve;
    }

    public static final Intent a(String bundleId, String str, String caller) {
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        Intrinsics.checkNotNullParameter(caller, "caller");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        String str2 = "https://play.google.com/d?id=" + bundleId;
        if (str != null) {
            str2 = str2 + "&referrer=" + str;
        }
        Uri parse = Uri.parse(str2);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
        intent.setData(parse);
        intent.putExtra("overlay", true);
        intent.putExtra("callerId", caller);
        return intent;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ m(Context context, ActivityResultLauncher activityResultLauncher, CoroutineScope coroutineScope, Flow flow, long j, Function3 function3, Function2 function2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, activityResultLauncher, coroutineScope, flow, r7, (i2 & 32) != 0 ? new Function3() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return m.a((String) obj, (String) obj2, (String) obj3);
            }
        } : function3, (i2 & 64) != 0 ? new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(m.a((PackageManager) obj, (Intent) obj2));
            }
        } : function2, null);
        long j2;
        if ((i2 & 16) != 0) {
            Duration.Companion companion = Duration.Companion;
            j2 = DurationKt.toDuration(60, DurationUnit.SECONDS);
        } else {
            j2 = j;
        }
    }

    public static final boolean a(PackageManager pm, Intent i2) {
        Intrinsics.checkNotNullParameter(pm, "pm");
        Intrinsics.checkNotNullParameter(i2, "i");
        return i2.resolveActivity(pm) != null;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l
    public boolean a(@NotNull String bundleId, @Nullable String str, @NotNull Function1 onOutcome) {
        Job launch$default;
        Job launch$default2;
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        Intrinsics.checkNotNullParameter(onOutcome, "onOutcome");
        cancel();
        Function3 function3 = this.f;
        String packageName = this.a.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        Intent intent = (Intent) function3.invoke(bundleId, str, packageName);
        Function2 function2 = this.g;
        PackageManager packageManager = this.a.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        if (!((Boolean) function2.invoke(packageManager, intent)).booleanValue()) {
            return false;
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new b(null), 3, null);
        launch$default2 = BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new c(null), 3, null);
        this.h = new a(false, onOutcome, launch$default2, launch$default);
        this.b.launch(intent);
        return true;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l
    public void a(int i2) {
        a aVar = this.h;
        if (aVar == null) {
            return;
        }
        Job.DefaultImpls.cancel$default(aVar.h(), null, 1, null);
        Job.DefaultImpls.cancel$default(aVar.f(), null, 1, null);
        aVar.g().invoke(aVar.e() ? j.a.b : j.c.b);
        this.h = null;
    }
}
