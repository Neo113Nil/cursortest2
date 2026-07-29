package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.unity3d.player.UnityPlayer;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

/* loaded from: classes.dex */
public final class V0 extends Lambda implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(String str, int i, int i2, int i3, int i4) {
        super(0);
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Activity activity = UnityPlayer.currentActivity;
        Intrinsics.checkNotNullExpressionValue(activity, "activity");
        String name = this.a;
        C0031h0 container = new C0031h0(activity, name, new C0034i());
        activity.addContentView(container.e, new FrameLayout.LayoutParams(-1, -1));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 1.0f);
        container.y.addView(container.w);
        container.y.addView(container.v, layoutParams);
        container.e.setBackgroundColor(0);
        container.e.setClipChildren(false);
        container.e.setClipToPadding(false);
        container.e.addView(container.x);
        container.e.addView(container.y);
        E2 e2 = container.y;
        C0011c0 c0011c0 = container.u;
        e2.a(c0011c0.a, c0011c0.b, c0011c0.c, c0011c0.d);
        M2 m2 = container.x;
        C0011c0 c0011c02 = container.u;
        float f = c0011c02.a;
        float f2 = c0011c02.b;
        float f3 = c0011c02.c;
        float f4 = c0011c02.d;
        m2.getClass();
        float[] fArr = {RangesKt.coerceAtLeast(f, 0.0f), RangesKt.coerceAtLeast(f2, 0.0f), RangesKt.coerceAtLeast(f3, 0.0f), RangesKt.coerceAtLeast(f4, 0.0f)};
        if (!Arrays.equals(m2.b, fArr)) {
            m2.b = fArr;
            m2.invalidate();
        }
        C0026g c0026g = C0026g.b;
        c0026g.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.DEBUG, AbstractC0018e.a("Adding web view container to manager: ", name, c0058o, "message"));
        c0026g.a.put(name, container);
        if (AbstractC0089y.e) {
            E2 frameLayout = container.y;
            Intrinsics.checkNotNullParameter(frameLayout, "frameLayout");
            Intrinsics.checkNotNullParameter(activity, "activity");
            container.p = new C0006b(frameLayout, activity);
        }
        container.a(this.b, this.c, this.d, this.e);
        return Unit.INSTANCE;
    }
}
