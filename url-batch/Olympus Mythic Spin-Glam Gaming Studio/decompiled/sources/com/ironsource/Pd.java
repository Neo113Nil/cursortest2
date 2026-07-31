package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.OutcomeReceiver;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.unity3d.mediation.LevelPlay;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class Pd {

    @NotNull
    private final C7 a;

    @NotNull
    private final Function0 b;

    @NotNull
    private final I7 c;

    @NotNull
    private final Executor d;

    /* synthetic */ class a extends FunctionReferenceImpl implements Function0 {
        public static final a a = new a();

        a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long mo4828invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    public static final class b implements OutcomeReceiver {
        b() {
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(@NotNull Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            Pd.this.a(error.getMessage());
        }

        public void onResult(@Nullable Object obj) {
            Pd.this.c();
        }
    }

    public Pd() {
        this(null, null, null, null, 15, null);
    }

    private final boolean b(Context context) {
        return IronSourceUtils.c(context);
    }

    private final void d() {
        this.a.a(new C4966x5(EnumC4984y5.REGISTER_TRIGGER, (JSONObject) null));
    }

    @SuppressLint({"NewApi"})
    public final void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        d();
        try {
            MeasurementManager a2 = C4742l0.a(context);
            if (a2 == null) {
                a("could not obtain measurement manager");
            } else {
                a2.registerTrigger(a(context), this.d, a());
            }
        } catch (Exception e) {
            a(e.getMessage());
            C4782n4.d().a(e);
        }
    }

    public Pd(@NotNull C7 eventManager, @NotNull Function0 getTimeFunction, @NotNull I7 serviceProvider, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(getTimeFunction, "getTimeFunction");
        Intrinsics.checkNotNullParameter(serviceProvider, "serviceProvider");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.a = eventManager;
        this.b = getTimeFunction;
        this.c = serviceProvider;
        this.d = executor;
    }

    private final String b() {
        ConcurrentHashMap<String, List<String>> c = C4770ma.b().c();
        List<String> list = c != null ? c.get(com.ironsource.mediationsdk.metadata.a.b) : null;
        String str = list != null ? (String) CollectionsKt.first((List) list) : null;
        return str == null ? "" : str;
    }

    private final Uri a(Context context) {
        InterfaceC4986y7 a2 = this.c.a();
        String a3 = IronSourceUtils.a(context);
        Uri build = new Uri.Builder().scheme("https").authority("android-att.ironsrc.mobi").path("register_trigger").appendQueryParameter("osVersion", Build.VERSION.RELEASE).appendQueryParameter("apiLevel", String.valueOf(Build.VERSION.SDK_INT)).appendQueryParameter("deviceModel", Build.MODEL).appendQueryParameter("sdkVersion", LevelPlay.getSdkVersion()).appendQueryParameter("bundleID", context.getPackageName()).appendQueryParameter(O6.X0, a2.I(context)).appendQueryParameter(O6.M0, a2.z(context)).appendQueryParameter("auid", a2.e(context)).appendQueryParameter("isFirstSession", String.valueOf(b(context))).appendQueryParameter("coppa", b()).appendQueryParameter(O6.j0, String.valueOf(C4742l0.a())).appendQueryParameter("origin", "1").appendQueryParameter("timestamp", String.valueOf(((Number) this.b.mo4828invoke()).longValue())).appendQueryParameter(X3.j.x, a2.d(context)).appendQueryParameter("deviceCarrier", a2.v(context)).appendQueryParameter("connectionType", a3).appendQueryParameter(T3.b, String.valueOf(StringsKt.equals(a3, T3.b, true))).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n        .schem…arameter\n        .build()");
        return build;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Pd(C7 c7, Function0 function0, I7 i7, Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c7, function0, i7, executor);
        c7 = (i & 1) != 0 ? Kb.u.d().q() : c7;
        function0 = (i & 2) != 0 ? a.a : function0;
        i7 = (i & 4) != 0 ? Kb.u.d() : i7;
        if ((i & 8) != 0) {
            executor = Executors.newSingleThreadExecutor();
            Intrinsics.checkNotNullExpressionValue(executor, "newSingleThreadExecutor()");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        this.a.a(new C4966x5(EnumC4984y5.REGISTER_TRIGGER_SUCCESS, (JSONObject) null));
    }

    @SuppressLint({"NewApi"})
    private final OutcomeReceiver a() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        this.a.a(new C4966x5(EnumC4984y5.REGISTER_TRIGGER_FAIL, IronSourceNetworkBridge.jsonObjectInit().put("reason", str)));
    }
}
