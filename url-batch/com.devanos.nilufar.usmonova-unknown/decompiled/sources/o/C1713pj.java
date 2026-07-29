package o;

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
import com.devanos.nilufar.usmonova.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: o.pj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1713pj extends ListView {
    public final Rect h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public C1581nj n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f212o;
    public final boolean p;
    public boolean q;
    public ViewOnTouchListenerC1875sA r;
    public R2 s;

    public C1713pj(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.h = new Rect();
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.p = z;
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = false;
        if (actionMasked == 1) {
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z = true;
                    if (z || z3) {
                        this.q = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.m - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z) {
                        ViewOnTouchListenerC1875sA viewOnTouchListenerC1875sA = this.r;
                        if (viewOnTouchListenerC1875sA != null) {
                            if (viewOnTouchListenerC1875sA.w) {
                                viewOnTouchListenerC1875sA.d();
                            }
                            viewOnTouchListenerC1875sA.w = false;
                        }
                    } else {
                        if (this.r == null) {
                            this.r = new ViewOnTouchListenerC1875sA(this);
                        }
                        ViewOnTouchListenerC1875sA viewOnTouchListenerC1875sA2 = this.r;
                        boolean z4 = viewOnTouchListenerC1875sA2.w;
                        viewOnTouchListenerC1875sA2.w = true;
                        viewOnTouchListenerC1875sA2.onTouch(this, motionEvent);
                    }
                    return z;
                }
                z = false;
                if (z) {
                }
                this.q = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.m - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (z) {
                }
                return z;
            }
            z = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex >= 0) {
            int x = (int) motionEvent.getX(findPointerIndex);
            int y = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x, y);
            if (pointToPosition == -1) {
                z3 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.q = true;
                int i2 = Build.VERSION.SDK_INT;
                AbstractC1383kj.a(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i3 = this.m;
                if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.m = pointToPosition;
                AbstractC1383kj.a(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z5 = (selector == null || pointToPosition == -1) ? false : true;
                if (z5) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.h;
                rect.set(left, top, right, bottom);
                rect.left -= this.i;
                rect.top -= this.j;
                rect.right += this.k;
                rect.bottom += this.l;
                if (i2 >= 33) {
                    z2 = AbstractC1515mj.a(this);
                } else {
                    Field field = AbstractC1647oj.a;
                    if (field != null) {
                        try {
                            z2 = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                    z2 = false;
                }
                if (childAt3.isEnabled() != z2) {
                    boolean z6 = !z2;
                    if (Build.VERSION.SDK_INT >= 33) {
                        AbstractC1515mj.b(this, z6);
                    } else {
                        Field field2 = AbstractC1647oj.a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z6));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z5) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    AbstractC1187hj.e(selector, exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    AbstractC1187hj.e(selector2, f, f2);
                }
                C1581nj c1581nj = this.n;
                if (c1581nj != null) {
                    c1581nj.i = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z = true;
                z3 = false;
            }
            if (z) {
            }
            this.q = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.m - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z) {
            }
            return z;
        }
        z = false;
        if (z) {
        }
        this.q = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.m - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z) {
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.h;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.s != null) {
            return;
        }
        super.drawableStateChanged();
        C1581nj c1581nj = this.n;
        if (c1581nj != null) {
            c1581nj.i = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.q && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.p || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.p || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.p || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.p && this.f212o) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.s = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.s == null) {
            R2 r2 = new R2(3, this);
            this.s = r2;
            post(r2);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return onHoverEvent;
        }
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i < 30 || !AbstractC1449lj.d) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC1449lj.a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC1449lj.b.invoke(this, Integer.valueOf(pointToPosition));
                        AbstractC1449lj.c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.q && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.m = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        R2 r2 = this.s;
        if (r2 != null) {
            C1713pj c1713pj = (C1713pj) r2.i;
            c1713pj.s = null;
            c1713pj.removeCallbacks(r2);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f212o = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C1581nj c1581nj = null;
        if (drawable != null) {
            C1581nj c1581nj2 = new C1581nj();
            Drawable drawable2 = c1581nj2.h;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c1581nj2.h = drawable;
            drawable.setCallback(c1581nj2);
            c1581nj2.i = true;
            c1581nj = c1581nj2;
        }
        this.n = c1581nj;
        super.setSelector(c1581nj);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.i = rect.left;
        this.j = rect.top;
        this.k = rect.right;
        this.l = rect.bottom;
    }
}
