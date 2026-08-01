package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.fortuneodd.shadegrid.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: l.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0251t0 extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f3064a;

    /* renamed from: b, reason: collision with root package name */
    public int f3065b;

    /* renamed from: c, reason: collision with root package name */
    public int f3066c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3067e;

    /* renamed from: f, reason: collision with root package name */
    public int f3068f;

    /* renamed from: g, reason: collision with root package name */
    public C0247r0 f3069g;
    public boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3070j;

    /* renamed from: k, reason: collision with root package name */
    public Q.g f3071k;

    /* renamed from: l, reason: collision with root package name */
    public M0.B f3072l;

    public C0251t0(Context context, boolean z2) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f3064a = new Rect();
        this.f3065b = 0;
        this.f3066c = 0;
        this.d = 0;
        this.f3067e = 0;
        this.i = z2;
        setCacheColorHint(0);
    }

    public final int a(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i3 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i4 = 0;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i6 = layoutParams.height;
            view.measure(i, i6 > 0 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i5 > 0) {
                i3 += dividerHeight;
            }
            i3 += view.getMeasuredHeight();
            if (i3 >= i2) {
                return i2;
            }
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0148 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i) {
        boolean z2;
        boolean z3;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z4 = false;
        if (actionMasked == 1) {
            z2 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z2 = true;
                    if (z2 || z4) {
                        this.f3070j = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f3068f - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z2) {
                        Q.g gVar = this.f3071k;
                        if (gVar != null) {
                            if (gVar.f645p) {
                                gVar.d();
                            }
                            gVar.f645p = false;
                        }
                    } else {
                        if (this.f3071k == null) {
                            this.f3071k = new Q.g(this);
                        }
                        Q.g gVar2 = this.f3071k;
                        boolean z5 = gVar2.f645p;
                        gVar2.f645p = true;
                        gVar2.onTouch(this, motionEvent);
                    }
                    return z2;
                }
                z2 = false;
                if (z2) {
                }
                this.f3070j = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f3068f - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (z2) {
                }
                return z2;
            }
            z2 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex >= 0) {
            int x2 = (int) motionEvent.getX(findPointerIndex);
            int y2 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x2, y2);
            if (pointToPosition == -1) {
                z4 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f2 = x2;
                float f3 = y2;
                this.f3070j = true;
                int i2 = Build.VERSION.SDK_INT;
                AbstractC0241o0.a(this, f2, f3);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i3 = this.f3068f;
                if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f3068f = pointToPosition;
                AbstractC0241o0.a(childAt3, f2 - childAt3.getLeft(), f3 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z6 = (selector == null || pointToPosition == -1) ? false : true;
                if (z6) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f3064a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f3065b;
                rect.top -= this.f3066c;
                rect.right += this.d;
                rect.bottom += this.f3067e;
                if (i2 >= 33) {
                    z3 = AbstractC0245q0.a(this);
                } else {
                    Field field = AbstractC0249s0.f3060a;
                    if (field != null) {
                        try {
                            z3 = field.getBoolean(this);
                        } catch (IllegalAccessException e2) {
                            e2.printStackTrace();
                        }
                    }
                    z3 = false;
                }
                if (childAt3.isEnabled() != z3) {
                    boolean z7 = !z3;
                    if (Build.VERSION.SDK_INT >= 33) {
                        AbstractC0245q0.b(this, z7);
                    } else {
                        Field field2 = AbstractC0249s0.f3060a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z7));
                            } catch (IllegalAccessException e3) {
                                e3.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z6) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    D.a.e(selector, exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    D.a.e(selector2, f2, f3);
                }
                C0247r0 c0247r0 = this.f3069g;
                if (c0247r0 != null) {
                    c0247r0.f3056b = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z2 = true;
                z4 = false;
            }
            if (z2) {
            }
            this.f3070j = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f3068f - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z2) {
            }
            return z2;
        }
        z2 = false;
        if (z2) {
        }
        this.f3070j = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f3068f - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z2) {
        }
        return z2;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f3064a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f3072l != null) {
            return;
        }
        super.drawableStateChanged();
        C0247r0 c0247r0 = this.f3069g;
        if (c0247r0 != null) {
            c0247r0.f3056b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f3070j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.i && this.h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f3072l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f3072l == null) {
            M0.B b2 = new M0.B(9, this);
            this.f3072l = b2;
            post(b2);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !AbstractC0243p0.d) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            AbstractC0243p0.f3044a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            AbstractC0243p0.f3045b.invoke(this, Integer.valueOf(pointToPosition));
                            AbstractC0243p0.f3046c.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException e2) {
                            e2.printStackTrace();
                        } catch (InvocationTargetException e3) {
                            e3.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f3070j && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f3068f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        M0.B b2 = this.f3072l;
        if (b2 != null) {
            C0251t0 c0251t0 = (C0251t0) b2.f497b;
            c0251t0.f3072l = null;
            c0251t0.removeCallbacks(b2);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.h = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0247r0 c0247r0 = null;
        if (drawable != null) {
            C0247r0 c0247r02 = new C0247r0();
            Drawable drawable2 = c0247r02.f3055a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c0247r02.f3055a = drawable;
            drawable.setCallback(c0247r02);
            c0247r02.f3056b = true;
            c0247r0 = c0247r02;
        }
        this.f3069g = c0247r0;
        super.setSelector(c0247r0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f3065b = rect.left;
        this.f3066c = rect.top;
        this.d = rect.right;
        this.f3067e = rect.bottom;
    }
}
