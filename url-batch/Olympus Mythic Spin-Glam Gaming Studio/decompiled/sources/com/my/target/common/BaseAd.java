package com.my.target.common;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.webform.WebFormClient;
import com.my.target.mediation.AdNetworkConfig;
import com.my.target.mi;
import com.my.target.n;
import com.my.target.tb;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public abstract class BaseAd {
    protected final n a;
    protected final tb.a b;
    private final AtomicBoolean c = new AtomicBoolean();
    protected final String d = UUID.randomUUID().toString();
    protected WebFormClient e;

    protected BaseAd(int i, @NonNull String str, @NonNull Context context) {
        this.a = n.a(i, str);
        this.b = tb.a(i);
        if (MyTargetManager.isSdkInitialized()) {
            return;
        }
        MyTargetManager.initSdk(context);
    }

    public n a() {
        return this.a;
    }

    @NonNull
    public CustomParams getCustomParams() {
        return this.a.h();
    }

    @Nullable
    public String getTag() {
        return this.a.k();
    }

    @Nullable
    public WebFormClient getWebFormClient() {
        return this.e;
    }

    protected boolean isLoadCalled() {
        return !this.c.compareAndSet(false, true);
    }

    public void setAdNetworkConfig(@NonNull String str, @NonNull AdNetworkConfig adNetworkConfig) {
        this.a.a(str, adNetworkConfig);
    }

    public void setTag(@Nullable String str) {
        if (str == null || str.length() <= 255) {
            this.a.d(str);
        } else {
            mi.b("setTag error: tag length must be less or equal to 255");
        }
    }

    public void setWebFormClient(@Nullable WebFormClient webFormClient) {
        this.e = webFormClient;
    }
}
