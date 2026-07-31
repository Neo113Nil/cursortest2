package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* renamed from: io.appmetrica.analytics.impl.wn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5784wn {
    public final B0 a;
    public final ap b;
    public final C5552o c;
    public final C5627ql d;
    public final U5 e;
    public final C5849za f;

    public C5784wn(B0 b0, ap apVar, C5552o c5552o, C5627ql c5627ql, U5 u5, C5849za c5849za) {
        this.a = b0;
        this.b = apVar;
        this.c = c5552o;
        this.d = c5627ql;
        this.e = u5;
        this.f = c5849za;
    }

    public static Intent a(Activity activity) {
        return (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new FunctionWithThrowable() { // from class: io.appmetrica.analytics.impl.wn$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return C5784wn.b((Activity) obj);
            }
        });
    }

    public static final Intent b(Activity activity) {
        return activity.getIntent();
    }

    public C5784wn(B0 b0, ap apVar) {
        this(b0, apVar, C5661s4.l().a(), C5661s4.l().o(), C5661s4.l().h(), C5661s4.l().k());
    }
}
