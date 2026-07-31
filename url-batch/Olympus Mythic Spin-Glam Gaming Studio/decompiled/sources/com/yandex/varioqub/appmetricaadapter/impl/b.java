package com.yandex.varioqub.appmetricaadapter.impl;

import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import io.appmetrica.analytics.StartupParamsCallback;

/* loaded from: classes11.dex */
public final class b implements StartupParamsCallback {
    public final /* synthetic */ AdapterIdentifiersCallback a;

    public b(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.a = adapterIdentifiersCallback;
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onReceive(StartupParamsCallback.Result result) {
        String str;
        AdapterIdentifiersCallback adapterIdentifiersCallback = this.a;
        if (result == null || (str = result.uuid) == null) {
            str = "";
        }
        adapterIdentifiersCallback.onSuccess(str);
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onRequestError(StartupParamsCallback.Reason reason, StartupParamsCallback.Result result) {
        this.a.onError(reason.value);
    }
}
