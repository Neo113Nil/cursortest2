package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vectorharbor.planetvectorsurvey.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class hi0 extends FrameLayout {
    public static final Object f = new Object();
    public final ArrayList d;
    public gi0 e;

    public hi0(Context context, List list) {
        super(context);
        this.d = new ArrayList();
        setProtections(list);
    }

    private ou0 getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof ou0) {
            return (ou0) tag;
        }
        ou0 ou0Var = new ou0(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, ou0Var);
        return ou0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00aa A[LOOP:0: B:4:0x0023->B:18:0x00aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i;
        int i2;
        int i3;
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return;
        }
        this.e = new gi0(getOrInstallSystemBarStateMonitor(), arrayList);
        int childCount = getChildCount();
        int size = this.e.a.size();
        for (int i4 = 0; i4 < size; i4++) {
            je jeVar = (je) this.e.a.get(i4);
            Context context = getContext();
            int i5 = i4 + childCount;
            fi0 fi0Var = jeVar.b;
            int i6 = jeVar.a;
            int i7 = -1;
            if (i6 != 1) {
                if (i6 == 2) {
                    i3 = fi0Var.b;
                    i2 = 48;
                } else if (i6 == 4) {
                    i = fi0Var.a;
                    i2 = 5;
                } else if (i6 != 8) {
                    g8.f("Unexpected side: ", i6);
                    return;
                } else {
                    i3 = fi0Var.b;
                    i2 = 80;
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i7, i3, i2);
                oy oyVar = fi0Var.c;
                layoutParams.leftMargin = oyVar.a;
                layoutParams.topMargin = oyVar.b;
                layoutParams.rightMargin = oyVar.c;
                layoutParams.bottomMargin = oyVar.d;
                View view = new View(context);
                view.setTag(f);
                view.setTranslationX(fi0Var.f);
                view.setTranslationY(fi0Var.g);
                view.setAlpha(fi0Var.h);
                view.setVisibility(fi0Var.d ? 0 : 4);
                view.setBackground(fi0Var.e);
                j3 j3Var = new j3(10, layoutParams, view);
                if (fi0Var.i == null) {
                    g8.s("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
                    return;
                } else {
                    fi0Var.i = j3Var;
                    addView(view, i5, layoutParams);
                }
            } else {
                i = fi0Var.a;
                i2 = 3;
            }
            i7 = i;
            i3 = -1;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i7, i3, i2);
            oy oyVar2 = fi0Var.c;
            layoutParams2.leftMargin = oyVar2.a;
            layoutParams2.topMargin = oyVar2.b;
            layoutParams2.rightMargin = oyVar2.c;
            layoutParams2.bottomMargin = oyVar2.d;
            View view2 = new View(context);
            view2.setTag(f);
            view2.setTranslationX(fi0Var.f);
            view2.setTranslationY(fi0Var.g);
            view2.setAlpha(fi0Var.h);
            view2.setVisibility(fi0Var.d ? 0 : 4);
            view2.setBackground(fi0Var.e);
            j3 j3Var2 = new j3(10, layoutParams2, view2);
            if (fi0Var.i == null) {
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != f) {
            gi0 gi0Var = this.e;
            int childCount = getChildCount() - (gi0Var != null ? gi0Var.a.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b() {
        gi0 gi0Var;
        if (this.e != null) {
            removeViews(getChildCount() - this.e.a.size(), this.e.a.size());
            int size = this.e.a.size();
            int i = 0;
            while (true) {
                gi0Var = this.e;
                if (i >= size) {
                    break;
                }
                ((je) gi0Var.a.get(i)).b.i = null;
                i++;
            }
            ArrayList arrayList = gi0Var.a;
            if (!gi0Var.f) {
                gi0Var.f = true;
                gi0Var.b.b.remove(gi0Var);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((je) arrayList.get(size2)).e = null;
                }
                arrayList.clear();
            }
            this.e = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.e != null) {
            b();
        }
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof ou0) {
            ou0 ou0Var = (ou0) tag;
            if (ou0Var.b.isEmpty()) {
                ou0Var.a.post(new w2(8, ou0Var));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<je> list) {
        ArrayList arrayList = this.d;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            b();
            a();
            requestApplyInsets();
        }
    }
}
