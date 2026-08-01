package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import k.C0199j;
import k.C0204o;
import k.MenuC0202m;

/* loaded from: classes.dex */
public final class K0 extends C0278t0 {

    /* renamed from: m, reason: collision with root package name */
    public final int f3331m;

    /* renamed from: n, reason: collision with root package name */
    public final int f3332n;

    /* renamed from: o, reason: collision with root package name */
    public H0 f3333o;

    /* renamed from: p, reason: collision with root package name */
    public C0204o f3334p;

    public K0(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f3331m = 21;
            this.f3332n = 22;
        } else {
            this.f3331m = 22;
            this.f3332n = 21;
        }
    }

    @Override // l.C0278t0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0199j c0199j;
        int i;
        int pointToPosition;
        int i2;
        if (this.f3333o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                c0199j = (C0199j) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0199j = (C0199j) adapter;
                i = 0;
            }
            C0204o item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= c0199j.getCount()) ? null : c0199j.getItem(i2);
            C0204o c0204o = this.f3334p;
            if (c0204o != item) {
                MenuC0202m menuC0202m = c0199j.f3181a;
                if (c0204o != null) {
                    this.f3333o.o(menuC0202m, c0204o);
                }
                this.f3334p = item;
                if (item != null) {
                    this.f3333o.e(menuC0202m, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f3331m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f3332n) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0199j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0199j) adapter).f3181a.c(false);
        return true;
    }

    public void setHoverListener(H0 h02) {
        this.f3333o = h02;
    }

    @Override // l.C0278t0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
