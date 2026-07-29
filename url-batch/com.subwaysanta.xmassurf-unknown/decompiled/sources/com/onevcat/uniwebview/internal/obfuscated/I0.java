package com.onevcat.uniwebview.internal.obfuscated;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.io.ByteArrayOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class I0 extends Lambda implements Function1 {
    public static final I0 a = new I0();

    public I0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0031h0 it = (C0031h0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        ViewParent parent = it.e.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(it.e);
        }
        it.b();
        ByteArrayOutputStream byteArrayOutputStream = it.n;
        if (byteArrayOutputStream != null) {
            byteArrayOutputStream.close();
        }
        it.n = null;
        it.o = null;
        it.v.destroy();
        C0026g c0026g = C0026g.b;
        String name = it.b;
        c0026g.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.DEBUG, AbstractC0018e.a("Removing web view container from manager: ", name, c0058o, "message"));
        c0026g.a.remove(name);
        AbstractC0035i0.b();
        return Unit.INSTANCE;
    }
}
