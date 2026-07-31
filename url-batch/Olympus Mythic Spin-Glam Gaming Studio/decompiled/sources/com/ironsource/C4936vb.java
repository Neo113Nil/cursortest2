package com.ironsource;

import android.content.Context;
import android.view.Choreographer;
import com.ironsource.C4841q9;
import com.ironsource.We;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.ironsource.vb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C4936vb {

    @NotNull
    private final C4876s9 a = new C4876s9();

    /* renamed from: com.ironsource.vb$a */
    public static final class a extends AbstractRunnableC4756le {
        final /* synthetic */ Runnable b;

        a(Runnable runnable) {
            this.b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC4756le
        public void a() {
            this.b.run();
        }
    }

    /* renamed from: com.ironsource.vb$b */
    static final class b extends Lambda implements Function1 {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull Map.Entry<String, Boolean> entry) {
            Intrinsics.checkNotNullParameter(entry, "<name for destructuring parameter 0>");
            return entry.getKey() + "=" + entry.getValue().booleanValue();
        }
    }

    public final void a(@NotNull final Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        a(this, new Runnable() { // from class: com.ironsource.vb$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4936vb.a(C4936vb.this, runnable);
            }
        }, 0L, 2, null);
    }

    public final void b(@NotNull final Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        a(this, new Runnable() { // from class: com.ironsource.vb$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C4936vb.b(C4936vb.this, runnable);
            }
        }, 0L, 2, null);
    }

    public final void c(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.a.a(runnable);
    }

    public final void d(@NotNull Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, callback, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4936vb this$0, Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        this$0.a.a(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final C4936vb this$0, final Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.ironsource.vb$$ExternalSyntheticLambda2
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                C4936vb.a(C4936vb.this, runnable, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4936vb this$0, Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        this$0.a(runnable);
    }

    @NotNull
    public final C4846qe b(@NotNull C4846qe error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return error.c() == 2080 ? new C4846qe(error.c(), "serverResponseIsNotValid") : error;
    }

    public static /* synthetic */ void a(C4936vb c4936vb, Runnable runnable, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postOnUIThread");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        c4936vb.a(runnable, j);
    }

    public final void a(@NotNull Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(runnable), j);
    }

    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C4841q9.a aVar = C4841q9.a;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        aVar.a(applicationContext);
    }

    public final void b(@NotNull String adUnitId, int i, @Nullable String str) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        jsonObjectInit.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
        jsonObjectInit.putOpt("reason", str);
        jsonObjectInit.put("mediationAdUnitId", adUnitId);
        jsonObjectInit.put("isMultipleAdUnits", 1);
        Jf.a(EnumC4984y5.TROUBLESHOOTING_AD_UNIT_REWARD_PARSE_ERROR, jsonObjectInit);
    }

    @NotNull
    public final IronSource.a[] a(@NotNull LevelPlay.AdFormat... adFormats) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        ArrayList arrayList = new ArrayList();
        for (LevelPlay.AdFormat adFormat : adFormats) {
            arrayList.add(a(adFormat));
        }
        return (IronSource.a[]) arrayList.toArray(new IronSource.a[0]);
    }

    public final void b(boolean z) {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        jsonObjectInit.put(IronSourceConstants.EVENTS_EXT1, String.valueOf(z));
        Jf.a(EnumC4984y5.SET_COPPA, jsonObjectInit);
    }

    public final void b() {
        Jf.a(EnumC4984y5.TROUBLESHOOTING_SET_COPPA_AFTER_INIT, IronSourceNetworkBridge.jsonObjectInit());
    }

    @NotNull
    public final IronSource.a a(@NotNull LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        return com.unity3d.mediation.a.a(adFormat);
    }

    public final boolean a(@NotNull AdapterBaseInterface networkAdapter, @NotNull IronSource.a adFormat, @NotNull String providerName) {
        Intrinsics.checkNotNullParameter(networkAdapter, "networkAdapter");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        return Jf.a(networkAdapter, adFormat, providerName);
    }

    public static /* synthetic */ void a(C4936vb c4936vb, long j, We.a aVar, long j2, JSONObject jSONObject, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendInitSuccessEvent");
        }
        if ((i & 8) != 0) {
            jSONObject = IronSourceNetworkBridge.jsonObjectInit();
        }
        c4936vb.a(j, aVar, j2, jSONObject);
    }

    public final void a(long j, @NotNull We.a responseOrigin, long j2, @NotNull JSONObject data) {
        Intrinsics.checkNotNullParameter(responseOrigin, "responseOrigin");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            data.put("isMultipleAdUnits", 1);
            data.put(IronSourceConstants.EVENTS_DURATION, j);
            String b2 = responseOrigin.b();
            Intrinsics.checkNotNullExpressionValue(b2, "responseOrigin.value");
            data.put(IronSourceConstants.EVENTS_EXT1, a(b2, j2));
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Jf.a(EnumC4984y5.SDK_INIT_SUCCESS, data);
    }

    @NotNull
    public final C4846qe a(@NotNull C4846qe error) {
        C4846qe c4846qe;
        Intrinsics.checkNotNullParameter(error, "error");
        int c = error.c();
        if (c == 2070) {
            c4846qe = new C4846qe(error.c(), "noServerResponse");
        } else {
            if (c != 2110) {
                return error;
            }
            c4846qe = new C4846qe(error.c(), IronSourceConstants.FALSE_AVAILABILITY_REASON_BAD_REQUEST);
        }
        return c4846qe;
    }

    private final String a(String str, long j) {
        return "responseOrigin=" + str + ";delayTimeAfterInitProcess=" + j;
    }

    public static /* synthetic */ void a(C4936vb c4936vb, C4846qe c4846qe, long j, JSONObject jSONObject, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendInitFailedEvent");
        }
        if ((i & 4) != 0) {
            jSONObject = IronSourceNetworkBridge.jsonObjectInit();
        }
        c4936vb.a(c4846qe, j, jSONObject);
    }

    public final void a(@NotNull C4846qe error, long j, @NotNull JSONObject data) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            data.put(IronSourceConstants.EVENTS_ERROR_CODE, error.c());
            data.put("reason", error.d());
            data.put("isMultipleAdUnits", 1);
            data.put(IronSourceConstants.EVENTS_DURATION, j);
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        Jf.a(EnumC4984y5.SDK_INIT_FAILED, data);
    }

    public final void a(@NotNull String placementName, @NotNull LevelPlay.AdFormat adFormat, int i, @Nullable String str) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        jsonObjectInit.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
        jsonObjectInit.putOpt("reason", str);
        jsonObjectInit.put("placement", placementName);
        jsonObjectInit.put(Wa.f, adFormat.getValue());
        jsonObjectInit.put("adf", Jf.c(com.unity3d.mediation.a.a(adFormat)));
        jsonObjectInit.put("isMultipleAdUnits", 1);
        Jf.a(EnumC4984y5.TROUBLESHOOTING_PLACEMENT_CAPPING_PARSE_ERROR, jsonObjectInit);
    }

    public final void a(@NotNull String adUnitId, int i, @Nullable String str) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        jsonObjectInit.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
        jsonObjectInit.putOpt("reason", str);
        jsonObjectInit.put("mediationAdUnitId", adUnitId);
        jsonObjectInit.put("isMultipleAdUnits", 1);
        Jf.a(EnumC4984y5.TROUBLESHOOTING_AD_UNIT_CAPPING_PARSE_ERROR, jsonObjectInit);
    }

    public final void a(@NotNull Map<String, Boolean> networkConsents) {
        Intrinsics.checkNotNullParameter(networkConsents, "networkConsents");
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        jsonObjectInit.put(IronSourceConstants.EVENTS_EXT1, CollectionsKt.joinToString$default(networkConsents.entrySet(), ";", null, null, 0, null, b.a, 30, null));
        Jf.a(EnumC4984y5.GDPR_CONSENTS, jsonObjectInit);
    }

    public final void a(boolean z) {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        jsonObjectInit.put(IronSourceConstants.EVENTS_EXT1, String.valueOf(z));
        Jf.a(EnumC4984y5.SET_CCPA, jsonObjectInit);
    }

    public final boolean a() {
        return Kb.u.d().f().c();
    }
}
