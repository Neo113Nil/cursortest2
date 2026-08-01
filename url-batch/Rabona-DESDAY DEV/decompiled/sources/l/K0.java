package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import k.C0155j;
import k.C0160o;
import k.MenuC0158m;

/* loaded from: classes.dex */
public final class K0 extends C0262t0 {

    /* renamed from: m, reason: collision with root package name */
    public final int f2893m;

    /* renamed from: n, reason: collision with root package name */
    public final int f2894n;

    /* renamed from: o, reason: collision with root package name */
    public H0 f2895o;

    /* renamed from: p, reason: collision with root package name */
    public C0160o f2896p;

    public K0(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f2893m = 21;
            this.f2894n = 22;
        } else {
            this.f2893m = 22;
            this.f2894n = 21;
        }
    }

    @Override // l.C0262t0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0155j c0155j;
        int i;
        int pointToPosition;
        int i2;
        if (this.f2895o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                c0155j = (C0155j) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0155j = (C0155j) adapter;
                i = 0;
            }
            C0160o item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= c0155j.getCount()) ? null : c0155j.getItem(i2);
            C0160o c0160o = this.f2896p;
            if (c0160o != item) {
                MenuC0158m menuC0158m = c0155j.f2682a;
                if (c0160o != null) {
                    this.f2895o.q(menuC0158m, c0160o);
                }
                this.f2896p = item;
                if (item != null) {
                    this.f2895o.e(menuC0158m, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f2893m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f2894n) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0155j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0155j) adapter).f2682a.c(false);
        return true;
    }

    public void setHoverListener(H0 h02) {
        this.f2895o = h02;
    }

    @Override // l.C0262t0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
