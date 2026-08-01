package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ft extends bg {
    public final int r;
    public final int s;
    public us t;
    public vs u;

    public ft(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.r = 21;
            this.s = 22;
        } else {
            this.r = 22;
            this.s = 21;
        }
    }

    @Override // defpackage.bg, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        ps psVar;
        int i;
        int pointToPosition;
        int i2;
        if (this.t != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                psVar = (ps) headerViewListAdapter.getWrappedAdapter();
            } else {
                psVar = (ps) adapter;
                i = 0;
            }
            vs item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= psVar.getCount()) ? null : psVar.getItem(i2);
            vs vsVar = this.u;
            if (vsVar != item) {
                ss ssVar = psVar.a;
                if (vsVar != null) {
                    this.t.g(ssVar, vsVar);
                }
                this.u = item;
                if (item != null) {
                    this.t.j(ssVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.r) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.s) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (ps) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (ps) adapter).a.c(false);
        return true;
    }

    public void setHoverListener(us usVar) {
        this.t = usVar;
    }

    @Override // defpackage.bg, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
