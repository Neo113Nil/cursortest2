package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC4832q0;
import com.ironsource.F0;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.fc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4647fc extends AbstractC4832q0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4647fc(@NotNull C4814p0 adTools, @NotNull C4665gc adUnitData, @NotNull InterfaceC4683hc listener) {
        super(adTools, adUnitData, listener);
        String format;
        int b;
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        C4684hd g = g();
        IronLog.INTERNAL.verbose("placement = " + g);
        if (g == null || TextUtils.isEmpty(g.c())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            format = String.format("can't load native ad - %s", Arrays.copyOf(new Object[]{g == null ? "placement is null" : "placement name is empty"}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            b = B0.b(adUnitData.b().a());
        } else {
            format = null;
            b = 510;
        }
        if (format != null) {
            IronLog.API.error(a(format));
            a(b, format);
        }
    }

    @Override // com.ironsource.AbstractC4832q0
    @NotNull
    protected E a() {
        return new E() { // from class: com.ironsource.fc$$ExternalSyntheticLambda0
            @Override // com.ironsource.E
            public final B a(C c, I i) {
                B a;
                a = C4647fc.a(C4647fc.this, c, i);
                return a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B a(C4647fc this$0, C adInstanceData, I adInstancePayload) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInstanceData, "adInstanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        return new Xb(new V0(this$0.f(), F0.b.PROVIDER), adInstanceData, adInstancePayload, new AbstractC4832q0.a());
    }
}
