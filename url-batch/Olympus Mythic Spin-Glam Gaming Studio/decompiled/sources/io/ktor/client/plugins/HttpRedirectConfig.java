package io.ktor.client.plugins;

/* compiled from: HttpRedirect.kt */
/* loaded from: classes14.dex */
public final class HttpRedirectConfig {
    private boolean allowHttpsDowngrade;
    private boolean checkHttpMethod = true;

    public final boolean getCheckHttpMethod() {
        return this.checkHttpMethod;
    }

    public final boolean getAllowHttpsDowngrade() {
        return this.allowHttpsDowngrade;
    }
}
