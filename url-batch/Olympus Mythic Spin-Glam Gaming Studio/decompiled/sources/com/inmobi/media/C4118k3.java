package com.inmobi.media;

import android.os.Message;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.k3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4118k3 implements InterfaceC4355t3 {
    public final /* synthetic */ HandlerC4224o3 a;

    public C4118k3(HandlerC4224o3 handlerC4224o3) {
        this.a = handlerC4224o3;
    }

    @Override // com.inmobi.media.InterfaceC4355t3
    public final void a(Z2 click) {
        Intrinsics.checkNotNullParameter(click, "click");
        HandlerC4224o3 handlerC4224o3 = this.a;
        Message obtain = Message.obtain();
        obtain.what = 4;
        obtain.obj = click;
        handlerC4224o3.sendMessage(obtain);
    }

    @Override // com.inmobi.media.InterfaceC4355t3
    public final void a(Z2 click, EnumC4069i6 enumC4069i6) {
        EnumC4069i6 errorCode = EnumC4069i6.d;
        Intrinsics.checkNotNullParameter(click, "click");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        E3 e3 = E3.a;
        Intrinsics.checkNotNullExpressionValue("E3", "access$getTAG$p(...)");
        String str = click.b;
        E3.b(click);
        this.a.b(click);
    }
}
