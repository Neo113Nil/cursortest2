package l;

import android.content.Context;
import android.view.View;
import com.luckycounter.drinkwater.R;
import k.AbstractC0210u;
import k.C0212w;
import k.MenuC0202m;
import k.SubMenuC0189E;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0251g extends C0212w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3426l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0259k f3427m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0251g(C0259k c0259k, Context context, MenuC0202m menuC0202m, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC0202m, true);
        this.f3427m = c0259k;
        this.f3252f = 8388613;
        A1.d dVar = c0259k.f3467w;
        this.h = dVar;
        AbstractC0210u abstractC0210u = this.i;
        if (abstractC0210u != null) {
            abstractC0210u.g(dVar);
        }
    }

    @Override // k.C0212w
    public final void c() {
        switch (this.f3426l) {
            case 0:
                C0259k c0259k = this.f3427m;
                c0259k.f3464t = null;
                c0259k.getClass();
                super.c();
                break;
            default:
                C0259k c0259k2 = this.f3427m;
                MenuC0202m menuC0202m = c0259k2.f3450c;
                if (menuC0202m != null) {
                    menuC0202m.c(true);
                }
                c0259k2.f3463s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0251g(C0259k c0259k, Context context, SubMenuC0189E subMenuC0189E, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC0189E, false);
        this.f3427m = c0259k;
        if (!subMenuC0189E.f3127A.f()) {
            View view2 = c0259k.i;
            this.f3251e = view2 == null ? (View) c0259k.h : view2;
        }
        A1.d dVar = c0259k.f3467w;
        this.h = dVar;
        AbstractC0210u abstractC0210u = this.i;
        if (abstractC0210u != null) {
            abstractC0210u.g(dVar);
        }
    }
}
