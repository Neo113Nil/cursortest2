package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import k.C0165j;
import k.C0170o;
import k.MenuC0168m;

/* loaded from: classes.dex */
public final class K0 extends C0251t0 {

    /* renamed from: m, reason: collision with root package name */
    public final int f2896m;

    /* renamed from: n, reason: collision with root package name */
    public final int f2897n;

    /* renamed from: o, reason: collision with root package name */
    public H0 f2898o;

    /* renamed from: p, reason: collision with root package name */
    public C0170o f2899p;

    public K0(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f2896m = 21;
            this.f2897n = 22;
        } else {
            this.f2896m = 22;
            this.f2897n = 21;
        }
    }

    @Override // l.C0251t0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0165j c0165j;
        int i;
        int pointToPosition;
        int i2;
        if (this.f2898o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                c0165j = (C0165j) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0165j = (C0165j) adapter;
                i = 0;
            }
            C0170o item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= c0165j.getCount()) ? null : c0165j.getItem(i2);
            C0170o c0170o = this.f2899p;
            if (c0170o != item) {
                MenuC0168m menuC0168m = c0165j.f2685a;
                if (c0170o != null) {
                    this.f2898o.p(menuC0168m, c0170o);
                }
                this.f2899p = item;
                if (item != null) {
                    this.f2898o.e(menuC0168m, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f2896m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f2897n) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0165j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0165j) adapter).f2685a.c(false);
        return true;
    }

    public void setHoverListener(H0 h02) {
        this.f2898o = h02;
    }

    @Override // l.C0251t0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
