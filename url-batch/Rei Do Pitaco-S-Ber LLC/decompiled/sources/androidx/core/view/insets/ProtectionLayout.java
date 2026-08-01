package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ionia.reidopitaco.libya.R;
import defpackage.ax;
import defpackage.cb;
import defpackage.h40;
import defpackage.l8;
import defpackage.n20;
import defpackage.p1;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {
    public static final Object h = new Object();
    public final ArrayList f;
    public ax g;

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.f = new ArrayList();
    }

    private h40 getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof h40) {
            return (h40) tag;
        }
        h40 h40Var = new h40(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, h40Var);
        return h40Var;
    }

    public final void a() {
        ArrayList arrayList = this.f;
        if (arrayList.isEmpty()) {
            b();
            return;
        }
        h40 orInstallSystemBarStateMonitor = getOrInstallSystemBarStateMonitor();
        b();
        this.g = new ax(orInstallSystemBarStateMonitor, arrayList);
        getChildCount();
        if (this.g.a.size() <= 0) {
            return;
        }
        cb cbVar = (cb) this.g.a.get(0);
        getContext();
        cbVar.getClass();
        l8.l(n20.e("Unexpected side: ", 0));
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != h) {
            ax axVar = this.g;
            int childCount = getChildCount() - (axVar != null ? axVar.a.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b() {
        if (this.g != null) {
            removeViews(getChildCount() - this.g.a.size(), this.g.a.size());
            int size = this.g.a.size();
            ax axVar = this.g;
            if (size > 0) {
                ((cb) axVar.a.get(0)).getClass();
                throw null;
            }
            ArrayList arrayList = axVar.a;
            if (!axVar.f) {
                axVar.f = true;
                axVar.b.b.remove(axVar);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((cb) arrayList.get(size2)).c = null;
                }
                arrayList.clear();
            }
            this.g = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof h40) {
            h40 h40Var = (h40) tag;
            if (h40Var.b.isEmpty()) {
                h40Var.a.post(new p1(14, h40Var));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<cb> list) {
        ArrayList arrayList = this.f;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            a();
            requestApplyInsets();
        }
    }
}
