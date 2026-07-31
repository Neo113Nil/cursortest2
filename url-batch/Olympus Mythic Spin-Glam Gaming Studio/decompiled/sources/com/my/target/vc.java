package com.my.target;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.my.target.b6;
import com.my.target.common.menu.MenuFactory;
import com.my.target.g;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class vc extends g {
    int g;
    private a h;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements View.OnLayoutChangeListener {
        a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int paddingLeft;
            int paddingTop;
            int i9;
            int i10;
            int paddingBottom;
            int paddingBottom2;
            WeakReference weakReference = vc.this.f;
            m mVar = weakReference != null ? (m) weakReference.get() : null;
            if (mVar == null) {
                return;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int measuredWidth2 = mVar.getMeasuredWidth();
            int measuredHeight2 = mVar.getMeasuredHeight();
            int i11 = vc.this.g;
            if (i11 != 1) {
                if (i11 == 2) {
                    int paddingLeft2 = (measuredWidth - measuredWidth2) - view.getPaddingLeft();
                    paddingBottom = (measuredHeight - view.getPaddingBottom()) - measuredHeight2;
                    i10 = measuredWidth - view.getPaddingRight();
                    paddingBottom2 = measuredHeight - view.getPaddingBottom();
                    paddingLeft = paddingLeft2;
                } else if (i11 == 3) {
                    int paddingLeft3 = view.getPaddingLeft();
                    paddingBottom = (measuredHeight - view.getPaddingBottom()) - measuredHeight2;
                    int paddingLeft4 = measuredWidth2 + view.getPaddingLeft();
                    paddingBottom2 = measuredHeight - view.getPaddingBottom();
                    paddingLeft = paddingLeft3;
                    i10 = paddingLeft4;
                } else {
                    if (i11 == 4 || i11 == 5) {
                        return;
                    }
                    paddingLeft = (measuredWidth - measuredWidth2) - view.getPaddingLeft();
                    i9 = view.getPaddingTop();
                    i10 = measuredWidth - view.getPaddingRight();
                    paddingTop = measuredHeight2 + view.getPaddingTop();
                }
                i9 = paddingBottom;
                paddingTop = paddingBottom2;
            } else {
                paddingLeft = view.getPaddingLeft();
                int paddingTop2 = view.getPaddingTop();
                int paddingLeft5 = measuredWidth2 + view.getPaddingLeft();
                paddingTop = measuredHeight2 + view.getPaddingTop();
                i9 = paddingTop2;
                i10 = paddingLeft5;
            }
            mVar.layout(paddingLeft, i9, i10, paddingTop);
        }
    }

    private vc(e eVar, MenuFactory menuFactory, b6.b bVar) {
        super(eVar, menuFactory, bVar);
        if (eVar == null) {
            return;
        }
        this.h = new a();
    }

    public static vc b(e eVar, MenuFactory menuFactory, b6.b bVar) {
        return new vc(eVar, menuFactory, bVar);
    }

    public void a(ViewGroup viewGroup, ae aeVar, g.a aVar, int i) {
        View b = aeVar.b();
        this.g = i;
        if (i == 5) {
            f fVar = this.b;
            if (fVar != null) {
                fVar.a(aVar);
            }
            mi.a("NativeAdChoicesController: No need to add AdChoicesView, adChoicesPlacement is DRAWING_MANUAL");
            return;
        }
        if (b != null && !(b instanceof m)) {
            mi.a("NativeAdChoicesController: Warning! You must use AdChoicesView class for placement " + i);
            return;
        }
        m mVar = (m) b;
        if (this.a == null) {
            if (mVar != null) {
                a(mVar);
                return;
            }
            return;
        }
        if (mVar == null) {
            Context context = viewGroup.getContext();
            m mVar2 = new m(context);
            qi.b(mVar2, "ad_choices");
            int a2 = qi.a(2, context);
            mVar2.setPadding(a2, a2, a2, a2);
            aeVar.a(mVar2);
            mVar = mVar2;
        }
        if (mVar.getParent() == null) {
            try {
                viewGroup.addView(mVar);
            } catch (Throwable th) {
                mi.a("NativeAdChoicesController: Unable to add AdChoices View - " + th.getMessage());
            }
        }
        if (i != 4) {
            viewGroup.addOnLayoutChangeListener(this.h);
        }
        super.a(mVar, aVar);
    }

    public void b(View view) {
        super.a();
        a aVar = this.h;
        if (aVar == null) {
            return;
        }
        view.removeOnLayoutChangeListener(aVar);
    }
}
