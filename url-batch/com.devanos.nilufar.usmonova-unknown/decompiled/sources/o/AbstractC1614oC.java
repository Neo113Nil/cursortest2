package o;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: o.oC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1614oC implements InterfaceC1629oR, InterfaceC2141wC, AdapterView.OnItemClickListener {
    public Rect h;

    public static int m(ListAdapter listAdapter, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    @Override // o.InterfaceC2141wC
    public final boolean e(C1284jC c1284jC) {
        return false;
    }

    @Override // o.InterfaceC2141wC
    public final boolean k(C1284jC c1284jC) {
        return false;
    }

    public abstract void l(MenuC0825cC menuC0825cC);

    public abstract void n(View view);

    public abstract void o(boolean z);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (ZB) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (ZB) listAdapter).a.q((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC1901sa) ? 0 : 4);
    }

    public abstract void p(int i);

    public abstract void q(int i);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z);

    public abstract void t(int i);

    @Override // o.InterfaceC2141wC
    public final void h(Context context, MenuC0825cC menuC0825cC) {
    }
}
