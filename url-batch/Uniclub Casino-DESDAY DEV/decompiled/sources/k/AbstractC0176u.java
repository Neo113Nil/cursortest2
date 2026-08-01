package k;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: k.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0176u implements InterfaceC0153C, InterfaceC0180y, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Rect f2750a;

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

    public static boolean u(MenuC0168m menuC0168m) {
        int size = menuC0168m.f2695f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menuC0168m.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // k.InterfaceC0180y
    public final boolean d(C0170o c0170o) {
        return false;
    }

    @Override // k.InterfaceC0180y
    public final boolean h(C0170o c0170o) {
        return false;
    }

    @Override // k.InterfaceC0180y
    public final void j(Context context, MenuC0168m menuC0168m) {
    }

    public abstract void l(MenuC0168m menuC0168m);

    public abstract void n(View view);

    public abstract void o(boolean z2);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C0165j) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0165j) listAdapter).f2685a.q((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC0162g) ? 0 : 4);
    }

    public abstract void p(int i);

    public abstract void q(int i);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z2);

    public abstract void t(int i);
}
