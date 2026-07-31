package io.appmetrica.analytics.impl;

import android.annotation.SuppressLint;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@DoNotInline
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0003J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lio/appmetrica/analytics/impl/Yf;", "Lio/appmetrica/analytics/impl/Xf;", "", "b", "a", "Ljava/lang/String;", "mProcessName", "<init>", "()V", "analytics_binaryProdRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class Yf implements Xf {

    /* renamed from: a, reason: from kotlin metadata */
    @Nullable
    private volatile String mProcessName;

    @SuppressLint({"PrivateApi"})
    private final String b() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("getProcessName", null).invoke(cls.getMethod("currentActivityThread", null).invoke(null, null), null);
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.String");
            return (String) invoke;
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    @Override // io.appmetrica.analytics.impl.Xf
    @Nullable
    public String a() {
        if (this.mProcessName != null) {
            return this.mProcessName;
        }
        synchronized (this) {
            try {
                if (this.mProcessName == null) {
                    this.mProcessName = b();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.mProcessName;
    }
}
