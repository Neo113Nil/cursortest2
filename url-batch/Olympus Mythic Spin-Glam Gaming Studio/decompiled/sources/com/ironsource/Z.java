package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.InitListener;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Z implements Y {

    @NotNull
    private final InterfaceC4844qc a;

    public static final class a implements Nc {
        final /* synthetic */ Y8 a;
        final /* synthetic */ InitListener b;

        a(Y8 y8, InitListener initListener) {
            this.a = y8;
            this.b = initListener;
        }

        @Override // com.ironsource.Nc
        public void onFail(@NotNull C4840q8 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            IronLog.ADAPTER_API.verbose("initSDKWithNetworkConfigurations error: " + error);
            this.b.onInitFailed(C4908u5.a.a(new IronSourceError(error.a(), error.b())));
        }

        @Override // com.ironsource.Nc
        public void onSuccess() {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("initSDKWithNetworkConfigurations success");
            X e = this.a.e();
            ironLog.verbose("controllerURL = " + (e != null ? e.a() : null));
            X e2 = this.a.e();
            ironLog.verbose("controllerConfig = " + (e2 != null ? e2.b() : null));
            X e3 = this.a.e();
            ironLog.verbose("debugMode = " + (e3 != null ? Integer.valueOf(e3.c()) : null));
            ironLog.verbose("applicationKey = " + this.a.d());
            ironLog.verbose("userId = " + this.a.h());
            this.b.onInitSuccess();
        }
    }

    public Z(@NotNull InterfaceC4844qc networkInitApi) {
        Intrinsics.checkNotNullParameter(networkInitApi, "networkInitApi");
        this.a = networkInitApi;
    }

    @Override // com.ironsource.Y
    public void a(@NotNull Context context, @NotNull Y8 initConfig, @NotNull InitListener initListener) {
        JSONObject b;
        String a2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initConfig, "initConfig");
        Intrinsics.checkNotNullParameter(initListener, "initListener");
        InterfaceC4844qc interfaceC4844qc = this.a;
        X e = initConfig.e();
        interfaceC4844qc.a(e != null ? e.c() : 0);
        X e2 = initConfig.e();
        if (e2 != null && (a2 = e2.a()) != null) {
            this.a.b(a2);
        }
        X e3 = initConfig.e();
        if (e3 != null && (b = e3.b()) != null) {
            InterfaceC4844qc interfaceC4844qc2 = this.a;
            String jSONObject = b.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "applicationConfig.toString()");
            interfaceC4844qc2.a(jSONObject);
        }
        Map<String, String> a3 = new C4808oc().a();
        this.a.a(new a(initConfig, initListener));
        this.a.a(context, initConfig.d(), initConfig.h(), a3);
    }
}
