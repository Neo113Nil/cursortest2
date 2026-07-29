package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import android.content.Intent;
import com.onevcat.uniwebview.UniWebViewAuthenticationActivity;
import com.onevcat.uniwebview.UniWebViewProxyActivity;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class A0 extends Lambda implements Function0 {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(String str) {
        super(0);
        this.a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C0014d c0014d = C0014d.b;
        String name = this.a;
        c0014d.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        D handler = (D) c0014d.a.get(name);
        if (handler != null) {
            B.a.getClass();
            Intrinsics.checkNotNullParameter(handler, "handler");
            String handlerId = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(handlerId, "randomUUID().toString()");
            A.b.put(handlerId, handler);
            handler.g = handlerId;
            C c = UniWebViewAuthenticationActivity.Companion;
            Activity context = handler.b;
            if (handlerId == null) {
                Intrinsics.throwUninitializedPropertyAccessException("handlerId");
                handlerId = null;
            }
            c.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(handlerId, "handlerId");
            Intent intent = new Intent(context, (Class<?>) UniWebViewAuthenticationActivity.class);
            intent.putExtra(UniWebViewProxyActivity.HANDLER_ID, handlerId);
            context.startActivity(intent);
        }
        return Unit.INSTANCE;
    }
}
