package l;

import android.content.Context;
import android.view.View;
import com.football.transfertrivia.R;
import k.AbstractC0172u;
import k.C0174w;
import k.MenuC0164m;
import k.SubMenuC0151E;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0210g extends C0174w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2995l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0218k f2996m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0210g(C0218k c0218k, Context context, MenuC0164m menuC0164m, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC0164m, true);
        this.f2996m = c0218k;
        this.f2821f = 8388613;
        A0.h hVar = c0218k.f3035w;
        this.h = hVar;
        AbstractC0172u abstractC0172u = this.i;
        if (abstractC0172u != null) {
            abstractC0172u.g(hVar);
        }
    }

    @Override // k.C0174w
    public final void c() {
        switch (this.f2995l) {
            case 0:
                C0218k c0218k = this.f2996m;
                c0218k.f3032t = null;
                c0218k.getClass();
                super.c();
                break;
            default:
                C0218k c0218k2 = this.f2996m;
                MenuC0164m menuC0164m = c0218k2.f3018c;
                if (menuC0164m != null) {
                    menuC0164m.c(true);
                }
                c0218k2.f3031s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0210g(C0218k c0218k, Context context, SubMenuC0151E subMenuC0151E, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC0151E, false);
        this.f2996m = c0218k;
        if (!subMenuC0151E.f2696A.f()) {
            View view2 = c0218k.i;
            this.f2820e = view2 == null ? (View) c0218k.h : view2;
        }
        A0.h hVar = c0218k.f3035w;
        this.h = hVar;
        AbstractC0172u abstractC0172u = this.i;
        if (abstractC0172u != null) {
            abstractC0172u.g(hVar);
        }
    }
}
