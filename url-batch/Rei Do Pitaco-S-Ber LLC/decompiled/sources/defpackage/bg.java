package defpackage;

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
import com.ionia.reidopitaco.libya.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class bg extends ListView {
    public final Rect f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public zf l;
    public boolean m;
    public final boolean n;
    public boolean o;
    public kq p;
    public u6 q;

    public bg(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f = new Rect();
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.n = z;
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0148 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = true;
        if (actionMasked == 1) {
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z = true;
                    z3 = false;
                    if (z || z3) {
                        this.o = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.k - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    kq kqVar = this.p;
                    if (!z) {
                        if (kqVar == null) {
                            this.p = new kq(this);
                        }
                        kq kqVar2 = this.p;
                        boolean z4 = kqVar2.u;
                        kqVar2.u = true;
                        kqVar2.onTouch(this, motionEvent);
                    } else if (kqVar != null) {
                        if (kqVar.u) {
                            kqVar.d();
                        }
                        kqVar.u = false;
                    }
                    return z;
                }
                z = false;
                z3 = false;
                if (z) {
                }
                this.o = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.k - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                kq kqVar3 = this.p;
                if (!z) {
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
            if (pointToPosition != -1) {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.o = true;
                wf.a(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.k;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.k = pointToPosition;
                wf.a(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
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
                Rect rect = this.f;
                rect.set(left, top, right, bottom);
                rect.left -= this.g;
                rect.top -= this.h;
                rect.right += this.i;
                rect.bottom += this.j;
                if (Build.VERSION.SDK_INT >= 33) {
                    z2 = yf.a(this);
                } else {
                    Field field = ag.a;
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
                        yf.b(this, z6);
                    } else {
                        Field field2 = ag.a;
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
                    selector.setHotspot(exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    selector2.setHotspot(f, f2);
                }
                zf zfVar = this.l;
                if (zfVar != null) {
                    zfVar.g = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z3 = false;
                z = true;
            }
            if (z) {
            }
            this.o = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.k - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            kq kqVar32 = this.p;
            if (!z) {
            }
            return z;
        }
        z = false;
        z3 = false;
        if (z) {
        }
        this.o = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.k - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        kq kqVar322 = this.p;
        if (!z) {
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.q != null) {
            return;
        }
        super.drawableStateChanged();
        zf zfVar = this.l;
        if (zfVar != null) {
            zfVar.g = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.o && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.n || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.n || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.n || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.n && this.m) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.q = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.q == null) {
            u6 u6Var = new u6(4, this);
            this.q = u6Var;
            post(u6Var);
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
                if (Build.VERSION.SDK_INT < 30 || !xf.d) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        xf.a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        xf.b.invoke(this, Integer.valueOf(pointToPosition));
                        xf.c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.o && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.k = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        u6 u6Var = this.q;
        if (u6Var != null) {
            bg bgVar = (bg) u6Var.g;
            bgVar.q = null;
            bgVar.removeCallbacks(u6Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.m = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        zf zfVar = null;
        if (drawable != null) {
            zf zfVar2 = new zf();
            Drawable drawable2 = zfVar2.f;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            zfVar2.f = drawable;
            drawable.setCallback(zfVar2);
            zfVar2.g = true;
            zfVar = zfVar2;
        }
        this.l = zfVar;
        super.setSelector(zfVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.g = rect.left;
        this.h = rect.top;
        this.i = rect.right;
        this.j = rect.bottom;
    }
}
