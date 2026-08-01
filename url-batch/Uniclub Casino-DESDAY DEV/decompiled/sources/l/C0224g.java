package l;

import android.content.Context;
import android.view.View;
import com.fortuneodd.shadegrid.R;
import k.AbstractC0176u;
import k.C0178w;
import k.MenuC0168m;
import k.SubMenuC0155E;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0224g extends C0178w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2992l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0232k f2993m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0224g(C0232k c0232k, Context context, MenuC0168m menuC0168m, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC0168m, true);
        this.f2993m = c0232k;
        this.f2756f = 8388613;
        C.g gVar = c0232k.f3032w;
        this.h = gVar;
        AbstractC0176u abstractC0176u = this.i;
        if (abstractC0176u != null) {
            abstractC0176u.g(gVar);
        }
    }

    @Override // k.C0178w
    public final void c() {
        switch (this.f2992l) {
            case 0:
                C0232k c0232k = this.f2993m;
                c0232k.f3029t = null;
                c0232k.getClass();
                super.c();
                break;
            default:
                C0232k c0232k2 = this.f2993m;
                MenuC0168m menuC0168m = c0232k2.f3015c;
                if (menuC0168m != null) {
                    menuC0168m.c(true);
                }
                c0232k2.f3028s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0224g(C0232k c0232k, Context context, SubMenuC0155E subMenuC0155E, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC0155E, false);
        this.f2993m = c0232k;
        if (!subMenuC0155E.f2631A.f()) {
            View view2 = c0232k.i;
            this.f2755e = view2 == null ? (View) c0232k.h : view2;
        }
        C.g gVar = c0232k.f3032w;
        this.h = gVar;
        AbstractC0176u abstractC0176u = this.i;
        if (abstractC0176u != null) {
            abstractC0176u.g(gVar);
        }
    }
}
