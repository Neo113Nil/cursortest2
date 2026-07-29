package com.onevcat.uniwebview.internal.obfuscated;

import android.graphics.Rect;
import java.io.ByteArrayOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class v2 extends Lambda implements Function1 {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(String str) {
        super(1);
        this.a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0031h0 it = (C0031h0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        String str = this.a;
        ByteArrayOutputStream byteArrayOutputStream = it.n;
        if (byteArrayOutputStream != null) {
            try {
                byteArrayOutputStream.close();
            } catch (Exception e) {
                C0058o c0058o = C0058o.b;
                C0058o c0058o2 = C0058o.b;
                String message = "Snapshot buffer close exception: " + e;
                c0058o2.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                c0058o2.a(EnumC0054n.CRITICAL, message);
            }
        }
        it.n = new ByteArrayOutputStream();
        if (it.e.getHeight() > 0 && it.e.getWidth() > 0) {
            it.o = it.a((Rect) null);
            if (str != null) {
                it.c.a(it.b, P2.SnapshotRenderingStarted, str);
            }
        }
        return Unit.INSTANCE;
    }
}
