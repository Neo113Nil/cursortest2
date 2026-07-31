package com.ogury.ad.internal;

import android.view.MotionEvent;
import android.view.View;
import java.util.Calendar;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class p2 implements n2 {
    public static final o2 e = new o2();
    public final g a;
    public float b;
    public float c;
    public long d;

    public p2(g adLayout) {
        Intrinsics.checkNotNullParameter(adLayout, "adLayout");
        this.a = adLayout;
    }

    @Override // com.ogury.ad.internal.n2
    public final boolean a(MotionEvent ev) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(ev, "ev");
        int action = ev.getAction();
        if (action == 0) {
            this.d = Calendar.getInstance().getTimeInMillis();
        } else if (action == 1) {
            g gVar = this.a;
            Function1 function1 = gVar.g;
            if (function1 != null) {
                function1.invoke(gVar);
            }
            Function1 function12 = gVar.f;
            if (function12 != null) {
                function12.invoke(gVar);
            }
            if (!gVar.m && gVar.n && (function0 = gVar.l) != null) {
                function0.mo4828invoke();
            }
            if (Calendar.getInstance().getTimeInMillis() - this.d >= 200) {
                int childCount = this.a.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.a.getChildAt(i);
                    if (childAt instanceof y7) {
                        b8.a(((y7) childAt).getMraidCommandExecutor().a, "ogySdkMraidGateway.callEventListeners(\"ogyOnTouchEnd\", {})");
                    }
                }
                return true;
            }
            return false;
        }
        int action2 = ev.getAction();
        if (action2 == 0) {
            this.b = this.a.getX() - ev.getRawX();
            this.c = this.a.getY() - ev.getRawY();
        } else if (action2 == 2) {
            this.a.bringToFront();
            float rawX = ev.getRawX() + this.b + (this.a.getWidth() / 4);
            if (rawX > 0.0f && rawX + (this.a.getWidth() / 2) < this.a.getContainerWidth()) {
                this.a.setX(ev.getRawX() + this.b);
            }
            float rawY = ev.getRawY() + this.c + (this.a.getHeight() / 4);
            if (rawY > 0.0f && rawY + (this.a.getHeight() / 2) < this.a.getContainerHeight()) {
                this.a.setY(ev.getRawY() + this.c);
            }
        }
        return false;
    }
}
