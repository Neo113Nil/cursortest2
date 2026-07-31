package com.ironsource;

import android.content.Context;
import com.ironsource.We;
import com.ironsource.X;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.InitRequest;
import java.util.ArrayList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O9 {

    @NotNull
    public static final O9 a = new O9();

    @NotNull
    private static final C4698i9 b = new C4698i9();

    public static final class a implements InitListener {
        a() {
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitFailed(@NotNull IronSourceError error) {
            Intrinsics.checkNotNullParameter(error, "error");
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitSuccess() {
        }
    }

    private O9() {
    }

    public final void b(boolean z) {
        a(z);
        new C4826pc().a(z);
    }

    public static final class b implements InterfaceC4921ue {
        final /* synthetic */ Context a;
        final /* synthetic */ C4658g5 b;
        final /* synthetic */ InitListener c;

        b(Context context, C4658g5 c4658g5, InitListener initListener) {
            this.a = context;
            this.b = c4658g5;
            this.c = initListener;
        }

        @Override // com.ironsource.InterfaceC4921ue
        public void a(@NotNull C4810oe sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            O9.a.a(this.a, sdkConfig.d(), this.b, this.c);
        }

        @Override // com.ironsource.InterfaceC4921ue
        public void a(@NotNull C4846qe error, @Nullable C4608d9 c4608d9) {
            Intrinsics.checkNotNullParameter(error, "error");
            O9.a.a(this.c, this.b, error);
        }
    }

    public final void a(@NotNull final Context context, @NotNull final InitRequest initRequest, @NotNull final InitListener initializationListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
        IronLog.API.info("IronSourceAds.init() appkey: " + initRequest.getAppKey() + ", legacyAdFormats: " + initRequest.getLegacyAdFormats() + ", context: " + context.getClass().getSimpleName());
        b.a(new Runnable() { // from class: com.ironsource.O9$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                O9.a(InitRequest.this, context, initializationListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InitRequest initRequest, Context context, InitListener initializationListener) {
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initializationListener, "$initializationListener");
        C4658g5 c4658g5 = new C4658g5();
        De.a.c(context, new C4957we(initRequest.getAppKey(), null, ArraysKt.toMutableList(b.a(initRequest.getLegacyAdFormats())), 2, null), new b(context, c4658g5, initializationListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, We we, C4658g5 c4658g5, InitListener initListener) {
        String o = com.ironsource.mediationsdk.p.h().o();
        Y8 g = we.g();
        Intrinsics.checkNotNullExpressionValue(g, "serverResponse.initialConfiguration");
        NetworkSettings b2 = we.l().b("IronSource");
        Intrinsics.checkNotNullExpressionValue(b2, "serverResponse.providerS…s.IRONSOURCE_CONFIG_NAME)");
        JSONObject interstitialSettings = b2.getInterstitialSettings();
        Intrinsics.checkNotNullExpressionValue(interstitialSettings, "networkSettings.interstitialSettings");
        g.a(new X.a(interstitialSettings, Kb.u.d().h()));
        g.a(ConfigFile.getConfigFile().getPluginType());
        g.b(o);
        new Z(new C4861rc()).a(context, g, new a());
        a(we, c4658g5, initListener);
    }

    private final void a(We we, C4658g5 c4658g5, final InitListener initListener) {
        L1 e;
        C1 b2 = we.c().b();
        new Lb().a((b2 == null || (e = b2.e()) == null) ? null : e.b(), true);
        String sessionId = com.ironsource.mediationsdk.p.h().o();
        C4736kc a2 = C4736kc.e.a();
        a2.a(we.l());
        a2.a(we.c());
        Intrinsics.checkNotNullExpressionValue(sessionId, "sessionId");
        a2.a(sessionId);
        a2.g();
        long a3 = C4658g5.a(c4658g5);
        C4698i9 c4698i9 = b;
        We.a i = we.i();
        Intrinsics.checkNotNullExpressionValue(i, "serverResponse.origin");
        c4698i9.a(a3, i);
        c4698i9.b(new Runnable() { // from class: com.ironsource.O9$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                O9.a(InitListener.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InitListener initListener) {
        IronLog.CALLBACK.info("InitListener.onInitSuccess()");
        if (initListener != null) {
            initListener.onInitSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final InitListener initListener, C4658g5 c4658g5, final C4846qe c4846qe) {
        long a2 = C4658g5.a(c4658g5);
        C4698i9 c4698i9 = b;
        final C4846qe b2 = c4698i9.b(c4846qe);
        c4698i9.a(b2, a2);
        c4698i9.b(new Runnable() { // from class: com.ironsource.O9$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                O9.a(C4846qe.this, initListener, b2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4846qe error, InitListener initListener, C4846qe eventError) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(eventError, "$eventError");
        IronLog.CALLBACK.info("InitListener.onInitFailed() error " + error);
        if (initListener != null) {
            initListener.onInitFailed(b.a(eventError));
        }
    }

    private final void a(boolean z) {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        jsonObjectInit.put(IronSourceConstants.EVENTS_EXT1, String.valueOf(z));
        Kb.u.d().q().a(new C4966x5(EnumC4984y5.CONSENT_IADS, jsonObjectInit));
    }

    public final void a(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList arrayList = new ArrayList();
        arrayList.add(value);
        com.ironsource.mediationsdk.p.h().a(key, arrayList);
    }
}
