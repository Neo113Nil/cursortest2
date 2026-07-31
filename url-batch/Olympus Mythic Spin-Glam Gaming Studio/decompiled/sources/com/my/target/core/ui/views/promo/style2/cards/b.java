package com.my.target.core.ui.views.promo.style2.cards;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.my.target.b5;
import com.my.target.core.ui.views.promo.style2.cards.CardsLayoutManagerS2;
import com.my.target.core.ui.views.promo.style2.cards.a;
import com.my.target.o1;
import com.my.target.qi;
import com.my.target.zb;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes15.dex */
public class b extends FrameLayout implements a, CardsLayoutManagerS2.a, zb.a {
    private final zb a;
    private final LinearLayoutManager b;
    private final b5 c;
    private a.InterfaceC1682a d;

    public b(Context context) {
        super(context);
        zb zbVar = new zb(context);
        this.a = zbVar;
        CardsLayoutManagerS2 cardsLayoutManagerS2 = new CardsLayoutManagerS2(context);
        cardsLayoutManagerS2.a(this);
        zbVar.setLayoutManager(cardsLayoutManagerS2);
        this.b = cardsLayoutManagerS2;
        b5 b5Var = new b5(17);
        this.c = b5Var;
        b5Var.attachToRecyclerView(zbVar);
        zbVar.setHasFixedSize(true);
        zbVar.setMoveStopListener(this);
        addView(zbVar, new FrameLayout.LayoutParams(-1, -1));
    }

    private void c() {
        int[] iArr;
        if (this.d != null) {
            int findFirstVisibleItemPosition = this.b.findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = this.b.findLastVisibleItemPosition();
            if (findFirstVisibleItemPosition < 0 || findLastVisibleItemPosition < 0) {
                return;
            }
            if (a(this.b.findViewByPosition(findFirstVisibleItemPosition))) {
                findFirstVisibleItemPosition++;
            }
            if (a(this.b.findViewByPosition(findLastVisibleItemPosition))) {
                findLastVisibleItemPosition--;
            }
            if (findFirstVisibleItemPosition > findLastVisibleItemPosition) {
                return;
            }
            if (findFirstVisibleItemPosition == findLastVisibleItemPosition) {
                iArr = new int[]{findFirstVisibleItemPosition};
            } else {
                int i = (findLastVisibleItemPosition - findFirstVisibleItemPosition) + 1;
                int[] iArr2 = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr2[i2] = findFirstVisibleItemPosition;
                    findFirstVisibleItemPosition++;
                }
                iArr = iArr2;
            }
            this.d.a(iArr);
        }
    }

    @Override // com.my.target.core.ui.views.promo.style2.cards.a
    public void a(int i) {
        this.c.b(i);
    }

    @Override // com.my.target.core.ui.views.promo.style2.cards.a
    public boolean b(int i) {
        return i >= this.b.findFirstCompletelyVisibleItemPosition() && i <= this.b.findLastCompletelyVisibleItemPosition();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setAdapter(@NonNull o1 o1Var) {
        this.a.setAdapter(o1Var);
    }

    @Override // com.my.target.core.ui.views.promo.style2.cards.a
    public void setListener(@NonNull a.InterfaceC1682a interfaceC1682a) {
        this.d = interfaceC1682a;
    }

    @Override // com.my.target.core.ui.views.promo.style2.cards.CardsLayoutManagerS2.a
    public void a() {
        int findFirstCompletelyVisibleItemPosition = this.b.findFirstCompletelyVisibleItemPosition();
        View findViewByPosition = findFirstCompletelyVisibleItemPosition >= 0 ? this.b.findViewByPosition(findFirstCompletelyVisibleItemPosition) : null;
        if (this.a.getChildCount() == 0 || findViewByPosition == null || getWidth() > findViewByPosition.getWidth() * 1.7d) {
            this.c.a(8388611);
        } else {
            this.c.a(17);
        }
        c();
    }

    @Override // com.my.target.zb.a
    public void b() {
        c();
    }

    private boolean a(View view) {
        return qi.a(view) < 50.0f;
    }
}
