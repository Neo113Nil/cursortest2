package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class Pm implements UnderlyingNetworkTask {
    public final Rm a;
    public C5731um b;
    public EnumC5213am c;
    public final RequestDataHolder d;
    public final ConfigProvider e;
    public final ResponseDataHolder f;
    public final FullUrlFormer g;
    public final C5419im h;

    public Pm(@NonNull Rm rm, @NonNull FullUrlFormer<C5679sm> fullUrlFormer, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull ConfigProvider<C5679sm> configProvider) {
        this(rm, new C5419im(), fullUrlFormer, requestDataHolder, responseDataHolder, configProvider);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final String description() {
        return "Startup task for component: " + this.a.a.f.toString();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.g;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final RequestDataHolder getRequestDataHolder() {
        return this.d;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @Nullable
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C5679sm) this.e.getConfig()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @Nullable
    public final SSLSocketFactory getSslSocketFactory() {
        ((Rl) Ka.I.z()).getClass();
        return null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onCreateTask() {
        this.d.setHeader("Accept-Encoding", "encrypted");
        return this.a.g();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z) {
        if (z) {
            return;
        }
        this.c = EnumC5213am.PARSE;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        C5731um handle = this.h.handle(this.f);
        this.b = handle;
        return handle != null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(@Nullable Throwable th) {
        this.c = EnumC5213am.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.c = EnumC5213am.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        if (this.b == null || this.f.getResponseHeaders() == null) {
            return;
        }
        this.a.a(this.b, (C5679sm) this.e.getConfig(), this.f.getResponseHeaders());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
        if (this.c == null) {
            this.c = EnumC5213am.UNKNOWN;
        }
        this.a.a(this.c);
    }

    public Pm(Rm rm, C5419im c5419im, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider configProvider) {
        this.a = rm;
        this.h = c5419im;
        this.d = requestDataHolder;
        this.f = responseDataHolder;
        this.e = configProvider;
        this.g = fullUrlFormer;
        fullUrlFormer.setHosts(((C5679sm) configProvider.getConfig()).k());
    }
}
