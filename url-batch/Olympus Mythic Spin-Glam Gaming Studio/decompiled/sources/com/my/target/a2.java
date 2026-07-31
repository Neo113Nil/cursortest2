package com.my.target;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.my.target.common.models.ImageData;
import com.my.target.ia;
import com.my.target.nativeads.constants.NativeAdColor;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public class a2 extends ViewGroup implements View.OnTouchListener, ia {
    private final TextView a;
    private final TextView b;
    private final TextView c;
    private final w5 d;
    private final qi e;
    private final fh f;
    private final z1 g;
    private final HashMap h;
    private final m i;
    private final Button j;
    private final int k;
    private final int l;
    private final int m;
    private final boolean n;
    private final double o;
    private boolean p;
    private ia.a q;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ia.a aVar = a2.this.q;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface b {
        void a(k8 k8Var, int i, n2 n2Var);

        void a(List list);
    }

    public a2(Context context) {
        super(context);
        this.p = false;
        qi.a(this, -1, NativeAdColor.BACKGROUND_TOUCH);
        boolean z = (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        this.n = z;
        this.o = z ? 0.5d : 0.7d;
        w5 w5Var = new w5(context);
        this.d = w5Var;
        qi g = qi.g(context);
        this.e = g;
        TextView textView = new TextView(context);
        this.a = textView;
        TextView textView2 = new TextView(context);
        this.b = textView2;
        TextView textView3 = new TextView(context);
        this.c = textView3;
        fh fhVar = new fh(context);
        this.f = fhVar;
        Button button = new Button(context);
        this.j = button;
        z1 z1Var = new z1(context);
        this.g = z1Var;
        w5Var.setContentDescription("close");
        w5Var.setVisibility(4);
        fhVar.setContentDescription("icon");
        textView.setLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView2.setLines(1);
        textView2.setEllipsize(truncateAt);
        textView3.setTextColor(-16777216);
        button.setPadding(g.b(15), g.b(10), g.b(15), g.b(10));
        button.setMinimumWidth(g.b(100));
        button.setMaxEms(12);
        button.setTransformationMethod(null);
        button.setSingleLine();
        button.setTextSize(18.0f);
        button.setEllipsize(truncateAt);
        button.setElevation(g.b(2));
        qi.b(button, -16733198, -16746839, g.b(2));
        button.setTextColor(-1);
        z1Var.setPadding(0, 0, 0, g.b(8));
        z1Var.setSideSlidesMargins(g.b(10));
        if (z) {
            int b2 = g.b(18);
            this.l = b2;
            this.k = b2;
            textView.setTextSize(g.d(24));
            textView3.setTextSize(g.d(20));
            textView2.setTextSize(g.d(20));
            this.m = g.b(96);
            textView.setTypeface(null, 1);
        } else {
            this.k = g.b(12);
            this.l = g.b(10);
            textView.setTextSize(22.0f);
            textView3.setTextSize(18.0f);
            textView2.setTextSize(18.0f);
            this.m = g.b(64);
        }
        m mVar = new m(context);
        this.i = mVar;
        qi.b(this, "ad_view");
        qi.b(textView, "title_text");
        qi.b(textView3, "description_text");
        qi.b(fhVar, ViewHierarchyConstants.ICON_BITMAP);
        qi.b(w5Var, "close_button");
        qi.b(textView2, "category_text");
        addView(z1Var);
        addView(fhVar);
        addView(textView);
        addView(textView2);
        addView(mVar);
        addView(textView3);
        addView(w5Var);
        addView(button);
        this.h = new HashMap();
    }

    private void a(e eVar) {
        this.i.setImageBitmap(eVar.g().getBitmap());
        this.i.setOnClickListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        ia.a aVar = this.q;
        if (aVar != null) {
            aVar.a(1, q2.a());
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setClickAreaActual(@NonNull e2 e2Var) {
        if (e2Var.m) {
            qi.a(this, -1, NativeAdColor.BACKGROUND_TOUCH);
        }
        boolean z = true;
        this.h.put(this.a, Boolean.valueOf(e2Var.a || e2Var.m));
        this.h.put(this.b, Boolean.valueOf(e2Var.k || e2Var.m));
        this.h.put(this.f, Boolean.valueOf(e2Var.c || e2Var.m));
        this.h.put(this.c, Boolean.valueOf(e2Var.b || e2Var.m));
        this.h.put(this.j, Boolean.valueOf(e2Var.l || e2Var.g || e2Var.m));
        HashMap hashMap = this.h;
        if (!e2Var.l && !e2Var.m) {
            z = false;
        }
        hashMap.put(this, Boolean.valueOf(z));
        this.a.setOnTouchListener(this);
        this.b.setOnTouchListener(this);
        this.f.setOnTouchListener(this);
        this.c.setOnTouchListener(this);
        this.j.setOnTouchListener(this);
        setOnTouchListener(this);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setClickAreaLegacy(@NonNull e2 e2Var) {
        boolean z = true;
        if (e2Var.m) {
            setOnClickListener(new View.OnClickListener() { // from class: com.my.target.a2$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a2.this.b(view);
                }
            });
            qi.a(this, -1, NativeAdColor.BACKGROUND_TOUCH);
            setClickable(true);
            this.j.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.a2$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a2.this.c(view);
                }
            });
            return;
        }
        this.a.setOnTouchListener(this);
        this.b.setOnTouchListener(this);
        this.f.setOnTouchListener(this);
        this.c.setOnTouchListener(this);
        this.j.setOnTouchListener(this);
        setOnTouchListener(this);
        this.h.put(this.a, Boolean.valueOf(e2Var.a));
        this.h.put(this.b, Boolean.valueOf(e2Var.k));
        this.h.put(this.f, Boolean.valueOf(e2Var.c));
        this.h.put(this.c, Boolean.valueOf(e2Var.b));
        HashMap hashMap = this.h;
        Button button = this.j;
        if (!e2Var.l && !e2Var.g) {
            z = false;
        }
        hashMap.put(button, Boolean.valueOf(z));
        this.h.put(this, Boolean.valueOf(e2Var.l));
    }

    @Override // com.my.target.ia
    public void c() {
        this.d.setVisibility(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.my.target.ia
    @NonNull
    public View getCloseButton() {
        return this.d;
    }

    @NonNull
    public int[] getNumbersOfCurrentShowingCards() {
        int findFirstVisibleItemPosition = this.g.getCardLayoutManager().findFirstVisibleItemPosition();
        int findLastCompletelyVisibleItemPosition = this.g.getCardLayoutManager().findLastCompletelyVisibleItemPosition();
        int i = 0;
        if (findFirstVisibleItemPosition == -1 || findLastCompletelyVisibleItemPosition == -1) {
            return new int[0];
        }
        int i2 = (findLastCompletelyVisibleItemPosition - findFirstVisibleItemPosition) + 1;
        int[] iArr = new int[i2];
        while (i < i2) {
            iArr[i] = findFirstVisibleItemPosition;
            i++;
            findFirstVisibleItemPosition++;
        }
        return iArr;
    }

    @Override // com.my.target.ia
    @NonNull
    public View getView() {
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i3 - i;
        int i7 = i4 - i2;
        w5 w5Var = this.d;
        w5Var.layout(i3 - w5Var.getMeasuredWidth(), i2, i3, this.d.getMeasuredHeight() + i2);
        qi.a(this.i, this.d.getLeft() - this.i.getMeasuredWidth(), this.d.getTop(), this.d.getLeft(), this.d.getBottom());
        if (i7 > i6 || this.n) {
            int bottom = this.d.getBottom();
            int measuredHeight = this.g.getMeasuredHeight() + Math.max(this.a.getMeasuredHeight() + this.b.getMeasuredHeight(), this.f.getMeasuredHeight()) + this.c.getMeasuredHeight();
            int i8 = this.l;
            int i9 = measuredHeight + (i8 * 2);
            if (i9 < i7 && (i5 = (i7 - i9) / 2) > bottom) {
                bottom = i5;
            }
            fh fhVar = this.f;
            fhVar.layout(i8 + i, bottom, fhVar.getMeasuredWidth() + i + this.l, i2 + this.f.getMeasuredHeight() + bottom);
            this.a.layout(this.f.getRight(), bottom, this.f.getRight() + this.a.getMeasuredWidth(), this.a.getMeasuredHeight() + bottom);
            this.b.layout(this.f.getRight(), this.a.getBottom(), this.f.getRight() + this.b.getMeasuredWidth(), this.a.getBottom() + this.b.getMeasuredHeight());
            int max = Math.max(Math.max(this.f.getBottom(), this.b.getBottom()), this.a.getBottom());
            TextView textView = this.c;
            int i10 = this.l + i;
            textView.layout(i10, max, textView.getMeasuredWidth() + i10, this.c.getMeasuredHeight() + max);
            int max2 = Math.max(max, this.c.getBottom());
            int i11 = this.l;
            int i12 = max2 + i11;
            z1 z1Var = this.g;
            z1Var.layout(i + i11, i12, i3, z1Var.getMeasuredHeight() + i12);
            this.g.a(!this.n);
            return;
        }
        this.g.a(false);
        fh fhVar2 = this.f;
        int i13 = this.l;
        fhVar2.layout(i13, (i4 - i13) - fhVar2.getMeasuredHeight(), this.l + this.f.getMeasuredWidth(), i4 - this.l);
        int max3 = ((Math.max(this.f.getMeasuredHeight(), this.j.getMeasuredHeight()) - this.a.getMeasuredHeight()) - this.b.getMeasuredHeight()) / 2;
        if (max3 < 0) {
            max3 = 0;
        }
        this.b.layout(this.f.getRight(), ((i4 - this.l) - max3) - this.b.getMeasuredHeight(), this.f.getRight() + this.b.getMeasuredWidth(), (i4 - this.l) - max3);
        this.a.layout(this.f.getRight(), this.b.getTop() - this.a.getMeasuredHeight(), this.f.getRight() + this.a.getMeasuredWidth(), this.b.getTop());
        int max4 = (Math.max(this.f.getMeasuredHeight(), this.a.getMeasuredHeight() + this.b.getMeasuredHeight()) - this.j.getMeasuredHeight()) / 2;
        if (max4 < 0) {
            max4 = 0;
        }
        Button button = this.j;
        int measuredWidth = (i3 - this.l) - button.getMeasuredWidth();
        int measuredHeight2 = ((i4 - this.l) - max4) - this.j.getMeasuredHeight();
        int i14 = this.l;
        button.layout(measuredWidth, measuredHeight2, i3 - i14, (i4 - i14) - max4);
        z1 z1Var2 = this.g;
        int i15 = this.l;
        z1Var2.layout(i15, i15, i3, z1Var2.getMeasuredHeight() + i15);
        this.c.layout(0, 0, 0, 0);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.d.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        this.f.measure(View.MeasureSpec.makeMeasureSpec(this.m, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.m, Integer.MIN_VALUE));
        this.i.measure(i, i2);
        if (size2 > size || this.n) {
            this.j.setVisibility(8);
            int measuredHeight = this.d.getMeasuredHeight();
            if (this.n) {
                measuredHeight = this.l;
            }
            this.a.measure(View.MeasureSpec.makeMeasureSpec((size - (this.l * 2)) - this.f.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            this.b.measure(View.MeasureSpec.makeMeasureSpec((size - (this.l * 2)) - this.f.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            this.c.measure(View.MeasureSpec.makeMeasureSpec(size - (this.l * 2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            int max = ((size2 - measuredHeight) - Math.max(this.a.getMeasuredHeight() + this.b.getMeasuredHeight(), this.f.getMeasuredHeight() - (this.l * 2))) - this.c.getMeasuredHeight();
            int i3 = size - this.l;
            if (size2 > size) {
                double d = max / size2;
                double d2 = this.o;
                if (d > d2) {
                    max = (int) (size2 * d2);
                }
            }
            if (this.n) {
                this.g.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(max - (this.l * 2), Integer.MIN_VALUE));
            } else {
                this.g.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(max - (this.l * 2), 1073741824));
            }
        } else {
            this.j.setVisibility(0);
            this.j.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            int measuredWidth = this.j.getMeasuredWidth();
            int i4 = (size / 2) - (this.l * 2);
            if (measuredWidth > i4) {
                this.j.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            }
            this.a.measure(View.MeasureSpec.makeMeasureSpec((((size - this.f.getMeasuredWidth()) - measuredWidth) - this.k) - this.l, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            this.b.measure(View.MeasureSpec.makeMeasureSpec((((size - this.f.getMeasuredWidth()) - measuredWidth) - this.k) - this.l, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            this.g.measure(View.MeasureSpec.makeMeasureSpec(size - this.l, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec((((size2 - Math.max(this.f.getMeasuredHeight(), Math.max(this.j.getMeasuredHeight(), this.a.getMeasuredHeight() + this.b.getMeasuredHeight()))) - (this.l * 2)) - this.g.getPaddingBottom()) - this.g.getPaddingTop(), Integer.MIN_VALUE));
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.p ? a(view, motionEvent) : b(view, motionEvent);
    }

    @Override // com.my.target.ia
    public void setBanner(@NonNull d9 d9Var) {
        this.p = d9Var.f().b();
        ImageData Z = d9Var.Z();
        if (Z == null || Z.getData() == null) {
            Bitmap a2 = a1.a(this.e.b(28));
            if (a2 != null) {
                this.d.a(a2, false);
            }
        } else {
            this.d.a(Z.getData(), true);
        }
        this.j.setText(d9Var.l());
        ImageData w = d9Var.w();
        if (w != null) {
            this.f.setPlaceholderDimensions(w.getWidth(), w.getHeight());
            b6.b(w, this.f);
        }
        this.a.setTextColor(-16777216);
        this.a.setText(d9Var.K());
        String h = d9Var.h();
        String J = d9Var.J();
        String str = "";
        if (!TextUtils.isEmpty(h)) {
            str = "" + h;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(J)) {
            str = str + ", ";
        }
        if (!TextUtils.isEmpty(J)) {
            str = str + J;
        }
        if (TextUtils.isEmpty(str)) {
            this.b.setVisibility(8);
        } else {
            this.b.setText(str);
            this.b.setVisibility(0);
        }
        this.c.setText(d9Var.n());
        this.g.a(d9Var.g0());
        e a3 = d9Var.a();
        if (a3 != null) {
            a(a3);
        } else {
            this.i.setVisibility(8);
        }
    }

    public void setCarouselListener(@Nullable b bVar) {
        this.g.setCarouselListener(bVar);
    }

    @Override // com.my.target.ia
    @SuppressLint({"ClickableViewAccessibility"})
    public void setClickArea(@NonNull e2 e2Var) {
        if (this.p) {
            setClickAreaActual(e2Var);
        } else {
            setClickAreaLegacy(e2Var);
        }
    }

    @Override // com.my.target.ia
    public void setInterstitialPromoViewListener(@Nullable ia.a aVar) {
        this.q = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        ia.a aVar = this.q;
        if (aVar != null) {
            aVar.a(2, q2.a());
        }
    }

    private int a(View view) {
        Button button = this.j;
        if (view == button && Boolean.TRUE.equals(this.h.get(button))) {
            return 64;
        }
        if (view == this.a) {
            return 1;
        }
        if (view == this.b) {
            return 1024;
        }
        if (view == this.f) {
            return 4;
        }
        return view == this.c ? 2 : 2048;
    }

    private boolean b(View view, MotionEvent motionEvent) {
        if (!this.h.containsKey(view)) {
            return false;
        }
        if (!((Boolean) this.h.get(view)).booleanValue()) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            setBackgroundColor(NativeAdColor.BACKGROUND_TOUCH);
        } else if (action == 1) {
            setBackgroundColor(-1);
            if (this.q != null) {
                Button button = this.j;
                this.q.a((view == button && Boolean.TRUE.equals(this.h.get(button))) ? 2 : 1, q2.a());
            }
        } else if (action == 3) {
            setBackgroundColor(-1);
        }
        return true;
    }

    private boolean a(View view, MotionEvent motionEvent) {
        if (!this.h.containsKey(view)) {
            return false;
        }
        if (!((Boolean) this.h.get(view)).booleanValue()) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            setBackgroundColor(NativeAdColor.BACKGROUND_TOUCH);
        } else if (action == 1) {
            setBackgroundColor(-1);
            if (this.q != null) {
                Button button = this.j;
                int i = (view == button && Boolean.TRUE.equals(this.h.get(button))) ? 2 : 1;
                h2 a2 = j2.a(view).a(motionEvent);
                if (a2 == null) {
                    a2 = h2.a();
                }
                this.q.a(i, t2.a(a(view), a2));
            }
        } else if (action == 3) {
            setBackgroundColor(-1);
        }
        return true;
    }
}
