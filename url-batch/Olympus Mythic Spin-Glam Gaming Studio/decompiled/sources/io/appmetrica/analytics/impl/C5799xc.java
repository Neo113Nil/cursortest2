package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.xc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5799xc extends Lambda implements Function0 {
    public final /* synthetic */ C5825yc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5799xc(C5825yc c5825yc) {
        super(0);
        this.a = c5825yc;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        Pc c5335ff;
        C5825yc c5825yc = this.a;
        Qc qc = c5825yc.f;
        L9 l9 = c5825yc.b;
        Zg zg = c5825yc.a;
        F4 f4 = c5825yc.c;
        C5621qf c5621qf = c5825yc.d;
        qc.getClass();
        if (FrameworkDetector.isNative()) {
            C5382ha i = Ka.I.i();
            Bundle applicationMetaData = i.d.getApplicationMetaData(i.a);
            if (StringUtils.isNullOrEmpty(applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null)) {
                c5335ff = new C5489le();
                return c5335ff.a();
            }
        }
        c5335ff = new C5335ff(l9, zg, f4, c5621qf);
        return c5335ff.a();
    }
}
