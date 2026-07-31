package yads;

import android.content.Context;
import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class rg0 {
    public final tg0 a;
    public final wg1 b;
    public final ls2 c;

    public rg0() {
        tg0 tg0Var = new tg0();
        wg1 wg1Var = new wg1();
        this.a = tg0Var;
        this.b = wg1Var;
        this.c = ls2.a;
    }

    public static String a() {
        return Build.MANUFACTURER;
    }

    public static String b() {
        return Build.VERSION.RELEASE;
    }

    public final String a(Context context) {
        String lowerCase = this.a.a(context).name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
