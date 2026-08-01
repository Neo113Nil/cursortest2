package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ionia.reidopitaco.libya.MainActivity2;
import com.ionia.reidopitaco.libya.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class j0 implements ht, qs, m5, us, yc, ad, hv, zg, kh, r80, nr, lf {
    public final /* synthetic */ int f;
    public Object g;

    public j0(int i) {
        this.f = i;
        switch (i) {
            case 6:
                break;
            case 10:
                TimeUnit.MINUTES.getClass();
                this.g = new xx(m40.h);
                break;
            case 21:
                this.g = new ArrayList(20);
                break;
            case 25:
                this.g = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.g = new l0(this);
                break;
        }
    }

    public static j0 D(boolean z, int i, int i2, int i3, int i4) {
        return new j0(0, AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }

    public static j0 z(Context context, int i) {
        g8.m("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, jx.s);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList o = oo.o(context, obtainStyledAttributes, 4);
        ColorStateList o2 = oo.o(context, obtainStyledAttributes, 9);
        ColorStateList o3 = oo.o(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        o10 a = o10.f(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0)).a();
        obtainStyledAttributes.recycle();
        return new j0(o, o2, o3, dimensionPixelSize, a, rect);
    }

    public k0 A(int i) {
        return null;
    }

    public k0 B(int i) {
        return null;
    }

    public void C() {
        ((fk) this.g).x.M();
    }

    public boolean F(int i, int i2, Bundle bundle) {
        return false;
    }

    public void G(String str) {
        ArrayList arrayList = (ArrayList) this.g;
        int i = 0;
        while (i < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    @Override // defpackage.ht
    public void a(ss ssVar, boolean z) {
        if (ssVar instanceof v30) {
            ((v30) ssVar).z.k().c(false);
        }
        ht htVar = ((k1) this.g).j;
        if (htVar != null) {
            htVar.a(ssVar, z);
        }
    }

    @Override // defpackage.yc
    public bd build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.g).build();
        return new bd(new j0(build));
    }

    @Override // defpackage.ad
    public ClipData d() {
        ClipData clip;
        clip = ((ContentInfo) this.g).getClip();
        return clip;
    }

    @Override // defpackage.qs
    public boolean f(ss ssVar, MenuItem menuItem) {
        switch (this.f) {
            case 3:
                n1 n1Var = ((ActionMenuView) this.g).E;
                if (n1Var != null) {
                    Iterator it = ((CopyOnWriteArrayList) ((k50) n1Var).f.L.c).iterator();
                    while (it.hasNext()) {
                        if (((mk) it.next()).a.o()) {
                            break;
                        }
                    }
                }
                break;
            default:
                ku kuVar = ((BottomNavigationView) this.g).j;
                if (kuVar != null) {
                    MainActivity2 mainActivity2 = (MainActivity2) ((h) kuVar).g;
                    List list = MainActivity2.O;
                    menuItem.getClass();
                    int itemId = menuItem.getItemId();
                    if (itemId != R.id.nav_habits) {
                        if (itemId != R.id.nav_stats) {
                            if (itemId == R.id.nav_achievements) {
                                mainActivity2.z(2);
                                break;
                            }
                        } else {
                            mainActivity2.z(1);
                            break;
                        }
                    } else {
                        mainActivity2.z(0);
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // defpackage.us
    public void g(ss ssVar, MenuItem menuItem) {
        ((i9) this.g).l.removeCallbacksAndMessages(ssVar);
    }

    @Override // defpackage.r80
    public p80 h(Class cls, wt wtVar) {
        t00 t00Var = null;
        for (q80 q80Var : (q80[]) this.g) {
            q80Var.getClass();
            if (t00.class.equals(cls)) {
                t00Var = new t00();
            }
        }
        if (t00Var != null) {
            return t00Var;
        }
        l8.l("No initializer set for given class ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.lf
    public boolean i(float f) {
        if (f == 0.0f) {
            return false;
        }
        w();
        ((NestedScrollView) this.g).j((int) f);
        return true;
    }

    @Override // defpackage.us
    public void j(ss ssVar, vs vsVar) {
        i9 i9Var = (i9) this.g;
        Handler handler = i9Var.l;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = i9Var.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (ssVar == ((h9) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new g9(this, i2 < arrayList.size() ? (h9) arrayList.get(i2) : null, vsVar, ssVar), ssVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // defpackage.hv
    public db0 k(View view, db0 db0Var) {
        ab0 ab0Var = db0Var.a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.g;
        if (!Objects.equals(coordinatorLayout.s, db0Var)) {
            coordinatorLayout.s = db0Var;
            boolean z = db0Var.d() > 0;
            coordinatorLayout.t = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!ab0Var.r()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = f80.a;
                    if (childAt.getFitsSystemWindows() && ((kd) childAt.getLayoutParams()).a != null && ab0Var.r()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return db0Var;
    }

    @Override // defpackage.ad
    public int l() {
        int flags;
        flags = ((ContentInfo) this.g).getFlags();
        return flags;
    }

    @Override // defpackage.ad
    public ContentInfo m() {
        return (ContentInfo) this.g;
    }

    @Override // defpackage.qs
    public void n(ss ssVar) {
        switch (this.f) {
            case 3:
                k50 k50Var = ((ActionMenuView) this.g).z;
                if (k50Var != null) {
                    k50Var.n(ssVar);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.kh
    public boolean o(CharSequence charSequence, int i, int i2, t60 t60Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), (String) this.g)) {
            return true;
        }
        t60Var.c = (t60Var.c & 3) | 4;
        return false;
    }

    @Override // defpackage.yc
    public void q(Uri uri) {
        ((ContentInfo.Builder) this.g).setLinkUri(uri);
    }

    @Override // defpackage.ad
    public int r() {
        int source;
        source = ((ContentInfo) this.g).getSource();
        return source;
    }

    @Override // defpackage.lf
    public float s() {
        return -((NestedScrollView) this.g).getVerticalScrollFactorCompat();
    }

    @Override // defpackage.yc
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.g).setExtras(bundle);
    }

    public String toString() {
        switch (this.f) {
            case 12:
                return "ContentInfoCompat{" + ((ContentInfo) this.g) + "}";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.zg
    public void u(final vv vvVar) {
        sb sbVar = new sb("EmojiCompatInitializer");
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), sbVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: bh
            @Override // java.lang.Runnable
            public final void run() {
                j0 j0Var = j0.this;
                vv vvVar2 = vvVar;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                try {
                    lj t = g8.t((Context) j0Var.g);
                    if (t == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    kj kjVar = (kj) ((zg) t.b);
                    synchronized (kjVar.i) {
                        kjVar.k = threadPoolExecutor2;
                    }
                    ((zg) t.b).u(new ch(vvVar2, threadPoolExecutor2));
                } catch (Throwable th) {
                    vvVar2.B(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // defpackage.ht
    public boolean v(ss ssVar) {
        k1 k1Var = (k1) this.g;
        if (ssVar == k1Var.h) {
            return false;
        }
        k1Var.D = ((v30) ssVar).A.a;
        ht htVar = k1Var.j;
        if (htVar != null) {
            return htVar.v(ssVar);
        }
        return false;
    }

    @Override // defpackage.lf
    public void w() {
        ((NestedScrollView) this.g).i.abortAnimation();
    }

    @Override // defpackage.yc
    public void x(int i) {
        ((ContentInfo.Builder) this.g).setFlags(i);
    }

    public nm y() {
        return new nm((String[]) ((ArrayList) this.g).toArray(new String[0]));
    }

    public j0(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, o10 o10Var, Rect rect) {
        this.f = 7;
        g8.n(rect.left);
        g8.n(rect.top);
        g8.n(rect.right);
        g8.n(rect.bottom);
        this.g = o10Var;
    }

    public j0(TextView textView) {
        this.f = 18;
        this.g = new nh(textView);
    }

    public j0(EditText editText) {
        this.f = 16;
        this.g = new o4(editText, 12);
    }

    private final void E(ss ssVar) {
    }

    @Override // defpackage.m5
    public void e(int i) {
    }

    @Override // defpackage.m5
    public void p(int i) {
    }

    public /* synthetic */ j0(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    public j0(Context context) {
        this.f = 15;
        this.g = context.getApplicationContext();
    }

    public j0(ContentInfo contentInfo) {
        this.f = 12;
        contentInfo.getClass();
        this.g = a8.l(contentInfo);
    }

    public j0(ClipData clipData, int i) {
        this.f = 11;
        this.g = a8.j(clipData, i);
    }

    @Override // defpackage.kh
    public Object b() {
        return this;
    }

    @Override // defpackage.m5
    public void t(int i, float f) {
    }
}
