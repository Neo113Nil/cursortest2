package com.moloco.sdk.internal.services;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.moloco.sdk.internal.services.AbstractC5040c;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* renamed from: com.moloco.sdk.internal.services.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5042e implements InterfaceC5041d {
    public static final int b = 8;

    @NotNull
    public final Context a;

    public C5042e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC5041d
    @NotNull
    public AbstractC5040c a() {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(AdvertisingIdClient.getAdvertisingIdInfo(this.a));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        AbstractC5040c abstractC5040c = null;
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = null;
        }
        AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) m8023constructorimpl;
        if (info != null) {
            if (info.isLimitAdTrackingEnabled()) {
                abstractC5040c = AbstractC5040c.b.b;
            } else {
                String id = info.getId();
                if (id != null) {
                    abstractC5040c = new AbstractC5040c.a(id);
                }
            }
            if (abstractC5040c != null) {
                return abstractC5040c;
            }
        }
        return AbstractC5040c.b.b;
    }
}
