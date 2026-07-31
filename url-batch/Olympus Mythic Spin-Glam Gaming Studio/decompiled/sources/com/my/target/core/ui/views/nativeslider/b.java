package com.my.target.core.ui.views.nativeslider;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.af;
import com.my.target.core.ui.views.nativeslider.CardRecyclerLayoutManager;
import com.my.target.core.ui.views.nativeslider.a;
import com.my.target.core.ui.views.nativeslider.c;
import com.my.target.qi;
import com.my.target.uc;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class b extends RecyclerView implements af {
    private final C1681b a;
    private final a.c b;
    private final com.my.target.core.ui.views.nativeslider.a c;
    private boolean d;
    private c.a e;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    /* renamed from: com.my.target.core.ui.views.nativeslider.b$b, reason: collision with other inner class name */
    static class C1681b extends LinearLayoutManager {
        private CardRecyclerLayoutManager.a a;
        private int b;

        public C1681b(Context context) {
            super(context, 0, false);
        }

        public void a(CardRecyclerLayoutManager.a aVar) {
            this.a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void measureChildWithMargins(View view, int i, int i2) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            int width = getWidth();
            if (getHeight() <= 0 || width <= 0) {
                return;
            }
            if (getItemViewType(view) == 1) {
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = this.b;
            } else if (getItemViewType(view) == 2) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = this.b;
            } else {
                int i3 = this.b;
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i3;
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i3;
            }
            super.measureChildWithMargins(view, i, i2);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onLayoutCompleted(RecyclerView.State state) {
            super.onLayoutCompleted(state);
            CardRecyclerLayoutManager.a aVar = this.a;
            if (aVar != null) {
                aVar.a();
            }
        }

        public void a(int i) {
            this.b = i;
        }
    }

    public b(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        c.a aVar = this.e;
        if (aVar != null) {
            aVar.a(getVisibleCardNumbers(), getContext());
        }
    }

    private void setCardLayoutManager(C1681b c1681b) {
        c1681b.a(new CardRecyclerLayoutManager.a() { // from class: com.my.target.core.ui.views.nativeslider.b$$ExternalSyntheticLambda0
            @Override // com.my.target.core.ui.views.nativeslider.CardRecyclerLayoutManager.a
            public final void a() {
                b.this.a();
            }
        });
        super.setLayoutManager(c1681b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.my.target.core.ui.views.nativeslider.c
    public void dispose() {
        this.c.a();
    }

    @Override // com.my.target.core.ui.views.nativeslider.c
    @Nullable
    public Parcelable getState() {
        return this.a.onSaveInstanceState();
    }

    @Override // com.my.target.af
    @NonNull
    public View getView() {
        return this;
    }

    @Override // com.my.target.core.ui.views.nativeslider.c
    @NonNull
    public int[] getVisibleCardNumbers() {
        int findFirstVisibleItemPosition = this.a.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = this.a.findLastVisibleItemPosition();
        if (findFirstVisibleItemPosition < 0 || findLastVisibleItemPosition < 0) {
            return new int[0];
        }
        if (qi.a(this.a.findViewByPosition(findFirstVisibleItemPosition)) < 50.0f) {
            findFirstVisibleItemPosition++;
        }
        if (qi.a(this.a.findViewByPosition(findLastVisibleItemPosition)) < 50.0f) {
            findLastVisibleItemPosition--;
        }
        if (findFirstVisibleItemPosition > findLastVisibleItemPosition) {
            return new int[0];
        }
        if (findFirstVisibleItemPosition == findLastVisibleItemPosition) {
            return new int[]{findFirstVisibleItemPosition};
        }
        int i = (findLastVisibleItemPosition - findFirstVisibleItemPosition) + 1;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = findFirstVisibleItemPosition;
            findFirstVisibleItemPosition++;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        boolean z = i != 0;
        this.d = z;
        if (z) {
            return;
        }
        a();
    }

    @Override // com.my.target.core.ui.views.nativeslider.c
    public void restoreState(Parcelable parcelable) {
        this.a.onRestoreInstanceState(parcelable);
    }

    @Override // com.my.target.core.ui.views.nativeslider.c
    public void setPromoCardSliderListener(@Nullable c.a aVar) {
        this.e = aVar;
    }

    @Override // com.my.target.af
    public void setupCards(@NonNull List<uc> list) {
        this.c.a(list);
        if (isClickable()) {
            this.c.a(this.b);
        }
        setCardLayoutManager(this.a);
        swapAdapter(this.c, true);
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new a();
        C1681b c1681b = new C1681b(context);
        this.a = c1681b;
        c1681b.a(qi.a(4, context));
        this.c = new com.my.target.core.ui.views.nativeslider.a(getContext());
        setHasFixedSize(true);
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private class a implements a.c {
        private a() {
        }

        @Override // com.my.target.ge
        public void a(View view, int i) {
            View findContainingItemView;
            int position;
            b bVar = b.this;
            if (bVar.d || !bVar.isClickable() || (findContainingItemView = b.this.a.findContainingItemView(view)) == null) {
                return;
            }
            b bVar2 = b.this;
            if (bVar2.e == null || (position = bVar2.a.getPosition(findContainingItemView)) < 0) {
                return;
            }
            b.this.e.a(findContainingItemView, position, i);
        }

        @Override // com.my.target.core.ui.views.nativeslider.a.c
        public void a(int i) {
            c.a aVar = b.this.e;
            if (aVar != null) {
                aVar.a(i);
            }
        }
    }
}
