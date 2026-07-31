package com.vungle.ads.internal.ui;

import android.app.Activity;
import android.content.Intent;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class k implements com.vungle.ads.internal.presenter.y {
    public final /* synthetic */ l a;

    public k(l lVar) {
        this.a = lVar;
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.d);
        p0.startActivityForResult(p1, p2);
    }

    public final Pair a(Intent intent) {
        Object m8023constructorimpl;
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        Intrinsics.checkNotNullParameter(intent, "intent");
        l lVar = this.a;
        try {
            Result.Companion companion = Result.INSTANCE;
            atomicBoolean2 = lVar.g;
            atomicBoolean2.set(true);
            safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(lVar, intent, Sdk.SDKError.Reason.AD_NO_FILL_VALUE);
            m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        l lVar2 = this.a;
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl == null) {
            return new Pair(Boolean.TRUE, null);
        }
        atomicBoolean = lVar2.g;
        atomicBoolean.set(false);
        return new Pair(Boolean.FALSE, m8026exceptionOrNullimpl.getLocalizedMessage());
    }
}
