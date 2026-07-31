package sg.bigo.ads.common.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.common.utils.f;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes10.dex */
public class MixtureTextView extends RelativeLayout {
    private static int[] s = {R.attr.textSize, R.attr.textColor, R.attr.text};
    private Layout a;
    private int b;
    private int c;
    private int d;
    private CharSequence e;
    private TextPaint f;
    private List<List<Rect>> g;
    private List<Integer> h;
    private List<Layout> i;
    private List<Integer> j;
    private HashSet<Integer> k;
    private int l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;
    private int r;
    private Map<Integer, Point> t;
    private a u;
    private boolean v;

    public interface a {
        void a(UnderlineSpan underlineSpan);
    }

    public MixtureTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = null;
        this.c = -9601400;
        this.g = new ArrayList();
        this.h = null;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new HashSet<>();
        this.t = new HashMap();
        this.v = true;
        this.d = f.b(getContext(), 14);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s);
        this.d = obtainStyledAttributes.getDimensionPixelSize(0, this.d);
        this.c = obtainStyledAttributes.getColor(1, this.c);
        this.e = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        TextPaint textPaint = new TextPaint();
        this.f = textPaint;
        textPaint.setDither(true);
        this.f.setAntiAlias(true);
        this.f.setColor(this.c);
        if (TextUtils.isEmpty(this.e)) {
            return;
        }
        this.q = true;
    }

    private static CharSequence a(CharSequence charSequence, int i, int i2) {
        if (r.a(charSequence)) {
            return null;
        }
        if (!(charSequence instanceof SpannableString)) {
            if (charSequence instanceof String) {
                return ((String) charSequence).substring(i, i2);
            }
            return null;
        }
        SpannableString spannableString = (SpannableString) charSequence;
        SpannableString spannableString2 = new SpannableString(TextUtils.substring(spannableString, i, i2));
        Object[] spans = spannableString.getSpans(i, i2, Object.class);
        for (int length = spans.length - 1; length >= 0; length--) {
            Object obj = spans[length];
            int spanStart = spannableString.getSpanStart(obj) - i;
            int spanEnd = spannableString.getSpanEnd(obj) - i;
            try {
                int length2 = spannableString2.length();
                if (spanEnd >= spanStart && spanStart <= length2 && spanEnd <= length2 && spanStart >= 0) {
                    spannableString2.setSpan(obj, spanStart, spanEnd, 33);
                }
            } catch (Exception unused) {
            }
        }
        return spannableString2;
    }

    private List<Rect> a(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            Point point = this.t.get(Integer.valueOf(i3));
            int i4 = point.x;
            int i5 = point.y;
            if (i4 <= i && i5 >= i2) {
                arrayList.add(new Rect(childAt.getLeft(), i, childAt.getRight(), i2));
            }
        }
        Collections.sort(arrayList, new Comparator<Rect>() { // from class: sg.bigo.ads.common.view.MixtureTextView.1
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(Rect rect, Rect rect2) {
                return rect.left > rect2.left ? 1 : -1;
            }
        });
        if (arrayList.size() < 2) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Rect rect = (Rect) arrayList.get(0);
        Rect rect2 = (Rect) arrayList.get(1);
        for (int i6 = 1; i6 < arrayList.size(); i6++) {
            if (!Rect.intersects(rect, rect2)) {
                if (arrayList2.size() - i6 < 2) {
                    break;
                }
                Rect rect3 = rect2;
                rect2 = (Rect) arrayList.get(i6 + 1);
                rect = rect3;
            } else {
                int min = Math.min(rect.left, rect2.left);
                int max = Math.max(rect.right, rect2.right);
                arrayList2.remove(rect);
                arrayList2.remove(rect2);
                arrayList2.add(new Rect(min, i, max, i2));
                if (arrayList2.size() < 2) {
                    break;
                }
                rect = (Rect) arrayList.get(0);
                rect2 = (Rect) arrayList.get(1);
            }
        }
        return arrayList2;
    }

    private static void a(Rect rect, List<Rect> list, int i, int i2, int i3) {
        if (rect.right < i3) {
            list.add(new Rect(rect.right, i, i3, i2));
        }
    }

    private boolean a(Canvas canvas) {
        boolean z = canvas == null;
        int i = this.b;
        List<List<Rect>> list = this.g;
        CharSequence charSequence = this.e;
        int length = charSequence != null ? charSequence.length() : 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            Rect rect = list.get(i4).get(0);
            int width = rect.width();
            int height = rect.height();
            CharSequence a2 = a(this.e, i2, length);
            StaticLayout staticLayout = (r.a(a2) || this.f == null) ? null : new StaticLayout(a2, this.f, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.a = staticLayout;
            if (staticLayout != null) {
                int min = Math.min(staticLayout.getLineCount(), height / i);
                if (!z) {
                    canvas.save();
                    canvas.translate(rect.left, rect.top);
                    canvas.clipRect(0, 0, rect.width(), this.a.getLineBottom(min - 1) - this.a.getLineTop(0));
                    this.a.draw(canvas);
                    canvas.restore();
                }
                i2 += this.a.getLineEnd(min - 1);
                if (canvas != null) {
                    this.i.add(this.a);
                    this.j.add(Integer.valueOf(min));
                }
                i3 += min;
                if (i2 >= length) {
                    break;
                }
            }
        }
        if (z) {
            int i5 = this.l + (i3 * i);
            this.l = i5;
            if (i5 > this.r) {
                int height2 = getHeight();
                int i6 = this.l;
                if (height2 != i6 && this.n != 1073741824) {
                    this.o = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                    this.p = true;
                    requestLayout();
                    return true;
                }
            }
        }
        return false;
    }

    private static void b(Rect rect, List<Rect> list, int i, int i2, int i3) {
        if (rect.left > i3) {
            list.add(new Rect(i3, i, rect.left, i2));
        }
    }

    private void getAllYCors() {
        int i = this.b;
        HashSet<Integer> hashSet = this.k;
        hashSet.clear();
        this.t.clear();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                childAt.getTop();
                int top = (((childAt.getTop() - getPaddingTop()) / i) * i) + getPaddingTop();
                hashSet.add(Integer.valueOf(top));
                int bottom = childAt.getBottom() - getPaddingTop();
                if (bottom % i != 0) {
                    bottom = ((bottom / i) + 1) * i;
                }
                int paddingTop = bottom + getPaddingTop();
                hashSet.add(Integer.valueOf(paddingTop));
                this.t.put(Integer.valueOf(i2), new Point(top, paddingTop));
            }
        }
        hashSet.add(Integer.valueOf(getPaddingTop()));
        hashSet.add(Integer.valueOf(this.n == 1073741824 ? getHeight() : Integer.MAX_VALUE));
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);
        this.h = arrayList;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        this.l = getPaddingBottom() + getPaddingTop();
        int i = this.b;
        List<List<Rect>> list = this.g;
        List<Integer> list2 = this.h;
        list.clear();
        if (list2 != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= list2.size() - 1) {
                    break;
                }
                int intValue = list2.get(i3).intValue();
                i3++;
                int intValue2 = list2.get(i3).intValue();
                ArrayList arrayList = new ArrayList();
                List<Rect> a2 = a(intValue, intValue2);
                int size = a2.size();
                if (size == 0) {
                    arrayList.add(new Rect(paddingLeft, intValue, width, intValue2));
                } else if (size != 1) {
                    b(a2.get(i2), arrayList, intValue, intValue2, paddingLeft);
                    int i4 = i2;
                    for (int i5 = 1; i4 < a2.size() - i5; i5 = 1) {
                        Rect rect = a2.get(i4);
                        i4++;
                        Rect rect2 = a2.get(i4);
                        if (rect.right < rect2.left) {
                            arrayList.add(new Rect(rect.right, intValue, rect2.left, intValue2));
                        }
                    }
                    a(a2.get(a2.size() - 1), arrayList, intValue, intValue2, width);
                } else {
                    Rect rect3 = a2.get(i2);
                    b(rect3, arrayList, intValue, intValue2, paddingLeft);
                    a(rect3, arrayList, intValue, intValue2, width);
                }
                list.add(arrayList);
                i2 = 0;
            }
            ArrayList arrayList2 = new ArrayList(list);
            int size2 = list.size();
            int i6 = 0;
            int i7 = 0;
            while (i7 < size2) {
                List<Rect> list3 = list.get(i7);
                if (list3.size() > 1) {
                    int i8 = i6 + i7;
                    arrayList2.remove(list3);
                    i6--;
                    int i9 = 0;
                    Rect rect4 = list3.get(0);
                    int height = rect4.height() / i;
                    this.l -= ((list3.size() - 1) * height) * i;
                    int i10 = i8;
                    int i11 = 0;
                    while (i11 < height) {
                        int i12 = i10;
                        int i13 = i9;
                        while (i13 < list3.size()) {
                            int i14 = i * i11;
                            arrayList2.add(i12, Arrays.asList(new Rect(list3.get(i13).left, rect4.top + i14, list3.get(i13).right, rect4.top + i14 + i)));
                            i13++;
                            i12++;
                            list = list;
                            i6++;
                            size2 = size2;
                        }
                        i11++;
                        i10 = i12;
                        i9 = 0;
                    }
                }
                i7++;
                list = list;
                size2 = size2;
            }
            this.g = arrayList2;
        }
        if (a(null)) {
            return;
        }
        a(canvas);
        super.dispatchDraw(canvas);
    }

    public CharSequence getText() {
        return this.e;
    }

    public int getTextColor() {
        return this.c;
    }

    public int getTextSize() {
        return this.d;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i;
        a aVar;
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0 && r.b(this.e)) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (!this.i.isEmpty() && !this.j.isEmpty()) {
                int i2 = 0;
                i = 0;
                int i3 = 0;
                while (true) {
                    if (i2 >= this.i.size()) {
                        break;
                    }
                    Layout layout = this.i.get(i2);
                    int intValue = this.j.get(i2).intValue();
                    if (layout != null) {
                        int lineForVertical = layout.getLineForVertical(y);
                        if (lineForVertical + 1 <= intValue) {
                            i += layout.getOffsetForHorizontal(Math.min(lineForVertical, layout.getLineCount() - 1), x);
                            break;
                        }
                        i3 += intValue;
                        y -= this.b * i3;
                        i += layout.getLineEnd(intValue - 1);
                    }
                    i2++;
                }
            } else {
                i = 0;
            }
            if (i < this.e.length()) {
                CharSequence charSequence = this.e;
                if (charSequence instanceof SpannableString) {
                    UnderlineSpan[] underlineSpanArr = (UnderlineSpan[]) ((SpannableString) charSequence).getSpans(i, i, UnderlineSpan.class);
                    if (underlineSpanArr.length > 0 && (aVar = this.u) != null) {
                        aVar.a(underlineSpanArr[0]);
                        return true;
                    }
                }
            }
        }
        return onInterceptTouchEvent;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.v) {
            this.n = View.MeasureSpec.getMode(this.m);
            this.v = false;
            this.r = getMeasuredHeight();
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.q) {
            getAllYCors();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (!this.q) {
            super.onMeasure(i, i2);
            return;
        }
        this.m = i2;
        this.f.setTextSize(this.d);
        StaticLayout staticLayout = new StaticLayout("测量行高", this.f, 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.a = staticLayout;
        this.b = staticLayout.getLineBottom(0) - this.a.getLineTop(0);
        if (this.p) {
            super.onMeasure(i, this.o);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setClickListener(a aVar) {
        this.u = aVar;
    }

    public void setText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.q = false;
            requestLayout();
        } else {
            this.q = true;
            this.e = charSequence;
            requestLayout();
            invalidate();
        }
    }

    public void setTextColor(int i) {
        this.f.setColor(i);
        this.c = i;
        invalidate();
    }

    public void setTextSize(int i) {
        this.d = i;
        this.f.setTextSize(i);
        requestLayout();
        invalidate();
    }
}
