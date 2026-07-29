package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* renamed from: o.tC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1943tC extends C1713pj {
    public final int t;
    public final int u;
    public InterfaceC1220iC v;
    public C1284jC w;

    public C1943tC(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.t = 21;
            this.u = 22;
        } else {
            this.t = 22;
            this.u = 21;
        }
    }

    @Override // o.C1713pj, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        ZB zb;
        int i;
        int pointToPosition;
        int i2;
        if (this.v != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                zb = (ZB) headerViewListAdapter.getWrappedAdapter();
            } else {
                zb = (ZB) adapter;
                i = 0;
            }
            C1284jC item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= zb.getCount()) ? null : zb.getItem(i2);
            C1284jC c1284jC = this.w;
            if (c1284jC != item) {
                MenuC0825cC menuC0825cC = zb.a;
                if (c1284jC != null) {
                    this.v.c(menuC0825cC, c1284jC);
                }
                this.w = item;
                if (item != null) {
                    this.v.j(menuC0825cC, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.t) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.u) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (ZB) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (ZB) adapter).a.c(false);
        return true;
    }

    public void setHoverListener(InterfaceC1220iC interfaceC1220iC) {
        this.v = interfaceC1220iC;
    }

    @Override // o.C1713pj, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
