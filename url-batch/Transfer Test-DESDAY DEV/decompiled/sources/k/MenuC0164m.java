package k;

import K.V;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: k.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC0164m implements Menu {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f2755y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f2756a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f2757b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2758c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0162k f2759e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2760f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2761g;
    public boolean h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2762j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2763k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f2765m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f2766n;

    /* renamed from: o, reason: collision with root package name */
    public View f2767o;

    /* renamed from: v, reason: collision with root package name */
    public C0166o f2774v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2776x;

    /* renamed from: l, reason: collision with root package name */
    public int f2764l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2768p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2769q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2770r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2771s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f2772t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f2773u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f2775w = false;

    public MenuC0164m(Context context) {
        boolean z2;
        boolean z3 = false;
        this.f2756a = context;
        Resources resources = context.getResources();
        this.f2757b = resources;
        this.f2760f = new ArrayList();
        this.f2761g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.f2762j = new ArrayList();
        this.f2763k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                z2 = V.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z2 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z2) {
                z3 = true;
            }
        }
        this.d = z3;
    }

    public final C0166o a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (f2755y[i5] << 16) | (65535 & i3);
        C0166o c0166o = new C0166o(this, i, i2, i3, i6, charSequence, this.f2764l);
        ArrayList arrayList = this.f2760f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((C0166o) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, c0166o);
        p(true);
        return c0166o;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f2756a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C0166o a2 = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            a2.setIcon(resolveInfo.loadIcon(packageManager));
            a2.f2788g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = a2;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(InterfaceC0176y interfaceC0176y, Context context) {
        this.f2773u.add(new WeakReference(interfaceC0176y));
        interfaceC0176y.j(context, this);
        this.f2763k = true;
    }

    public final void c(boolean z2) {
        if (this.f2771s) {
            return;
        }
        this.f2771s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2773u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0176y interfaceC0176y = (InterfaceC0176y) weakReference.get();
            if (interfaceC0176y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0176y.b(this, z2);
            }
        }
        this.f2771s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C0166o c0166o = this.f2774v;
        if (c0166o != null) {
            d(c0166o);
        }
        this.f2760f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f2766n = null;
        this.f2765m = null;
        this.f2767o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(C0166o c0166o) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2773u;
        boolean z2 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f2774v == c0166o) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0176y interfaceC0176y = (InterfaceC0176y) weakReference.get();
                if (interfaceC0176y == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 = interfaceC0176y.h(c0166o);
                    if (z2) {
                        break;
                    }
                }
            }
            v();
            if (z2) {
                this.f2774v = null;
            }
        }
        return z2;
    }

    public boolean e(MenuC0164m menuC0164m, MenuItem menuItem) {
        InterfaceC0162k interfaceC0162k = this.f2759e;
        return interfaceC0162k != null && interfaceC0162k.q(menuC0164m, menuItem);
    }

    public boolean f(C0166o c0166o) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2773u;
        boolean z2 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0176y interfaceC0176y = (InterfaceC0176y) weakReference.get();
            if (interfaceC0176y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z2 = interfaceC0176y.d(c0166o);
                if (z2) {
                    break;
                }
            }
        }
        v();
        if (z2) {
            this.f2774v = c0166o;
        }
        return z2;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.f2760f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0166o c0166o = (C0166o) arrayList.get(i2);
            if (c0166o.f2783a == i) {
                return c0166o;
            }
            if (c0166o.hasSubMenu() && (findItem = c0166o.f2794o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final C0166o g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f2772t;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C0166o) arrayList.get(0);
        }
        boolean n2 = n();
        for (int i2 = 0; i2 < size; i2++) {
            C0166o c0166o = (C0166o) arrayList.get(i2);
            char c2 = n2 ? c0166o.f2789j : c0166o.h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (n2 && c2 == '\b' && i == 67))) {
                return c0166o;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f2760f.get(i);
    }

    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        int i2;
        boolean n2 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f2760f;
            int size = arrayList2.size();
            for (0; i2 < size; i2 + 1) {
                C0166o c0166o = (C0166o) arrayList2.get(i2);
                if (c0166o.hasSubMenu()) {
                    c0166o.f2794o.h(arrayList, i, keyEvent);
                }
                char c2 = n2 ? c0166o.f2789j : c0166o.h;
                if ((modifiers & 69647) == ((n2 ? c0166o.f2790k : c0166o.i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if (c2 != cArr[0] && c2 != cArr[2]) {
                        if (n2 && c2 == '\b') {
                            i2 = i != 67 ? i2 + 1 : 0;
                        }
                    }
                    if (c0166o.isEnabled()) {
                        arrayList.add(c0166o);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f2776x) {
            return true;
        }
        ArrayList arrayList = this.f2760f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C0166o) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l2 = l();
        if (this.f2763k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f2773u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0176y interfaceC0176y = (InterfaceC0176y) weakReference.get();
                if (interfaceC0176y == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 |= interfaceC0176y.k();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.f2762j;
            if (z2) {
                arrayList.clear();
                arrayList2.clear();
                int size = l2.size();
                for (int i = 0; i < size; i++) {
                    C0166o c0166o = (C0166o) l2.get(i);
                    if (c0166o.f()) {
                        arrayList.add(c0166o);
                    } else {
                        arrayList2.add(c0166o);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f2763k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public MenuC0164m k() {
        return this;
    }

    public final ArrayList l() {
        boolean z2 = this.h;
        ArrayList arrayList = this.f2761g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f2760f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C0166o c0166o = (C0166o) arrayList2.get(i);
            if (c0166o.isVisible()) {
                arrayList.add(c0166o);
            }
        }
        this.h = false;
        this.f2763k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f2775w;
    }

    public boolean n() {
        return this.f2758c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z2) {
        if (this.f2768p) {
            this.f2769q = true;
            if (z2) {
                this.f2770r = true;
                return;
            }
            return;
        }
        if (z2) {
            this.h = true;
            this.f2763k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2773u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0176y interfaceC0176y = (InterfaceC0176y) weakReference.get();
            if (interfaceC0176y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0176y.c();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0166o g2 = g(i, keyEvent);
        boolean q2 = g2 != null ? q(g2, null, i2) : false;
        if ((i2 & 2) != 0) {
            c(true);
        }
        return q2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(MenuItem menuItem, InterfaceC0176y interfaceC0176y, int i) {
        boolean z2;
        C0166o c0166o = (C0166o) menuItem;
        if (c0166o == null || !c0166o.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c0166o.f2795p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c0166o)) {
            MenuC0164m menuC0164m = c0166o.f2793n;
            if (!menuC0164m.e(menuC0164m, c0166o)) {
                Intent intent = c0166o.f2788g;
                if (intent != null) {
                    try {
                        menuC0164m.f2756a.startActivity(intent);
                    } catch (ActivityNotFoundException e2) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
                    }
                }
                ActionProviderVisibilityListenerC0167p actionProviderVisibilityListenerC0167p = c0166o.f2780A;
                if (actionProviderVisibilityListenerC0167p == null || !actionProviderVisibilityListenerC0167p.f2807b.onPerformDefaultAction()) {
                    z2 = false;
                    ActionProviderVisibilityListenerC0167p actionProviderVisibilityListenerC0167p2 = c0166o.f2780A;
                    boolean z3 = actionProviderVisibilityListenerC0167p2 == null && actionProviderVisibilityListenerC0167p2.f2807b.hasSubMenu();
                    if (!c0166o.e()) {
                        z2 |= c0166o.expandActionView();
                        if (z2) {
                            c(true);
                        }
                    } else if (c0166o.hasSubMenu() || z3) {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!c0166o.hasSubMenu()) {
                            SubMenuC0151E subMenuC0151E = new SubMenuC0151E(this.f2756a, this, c0166o);
                            c0166o.f2794o = subMenuC0151E;
                            subMenuC0151E.setHeaderTitle(c0166o.f2786e);
                        }
                        SubMenuC0151E subMenuC0151E2 = c0166o.f2794o;
                        if (z3) {
                            actionProviderVisibilityListenerC0167p2.f2808c.getClass();
                            actionProviderVisibilityListenerC0167p2.f2807b.onPrepareSubMenu(subMenuC0151E2);
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList = this.f2773u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            r0 = interfaceC0176y != null ? interfaceC0176y.f(subMenuC0151E2) : false;
                            Iterator it = copyOnWriteArrayList.iterator();
                            while (it.hasNext()) {
                                WeakReference weakReference = (WeakReference) it.next();
                                InterfaceC0176y interfaceC0176y2 = (InterfaceC0176y) weakReference.get();
                                if (interfaceC0176y2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!r0) {
                                    r0 = interfaceC0176y2.f(subMenuC0151E2);
                                }
                            }
                        }
                        z2 |= r0;
                        if (!z2) {
                            c(true);
                        }
                    } else if ((i & 1) == 0) {
                        c(true);
                    }
                    return z2;
                }
            }
        }
        z2 = true;
        ActionProviderVisibilityListenerC0167p actionProviderVisibilityListenerC0167p22 = c0166o.f2780A;
        if (actionProviderVisibilityListenerC0167p22 == null) {
        }
        if (!c0166o.e()) {
        }
        return z2;
    }

    public final void r(InterfaceC0176y interfaceC0176y) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2773u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0176y interfaceC0176y2 = (InterfaceC0176y) weakReference.get();
            if (interfaceC0176y2 == null || interfaceC0176y2 == interfaceC0176y) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f2760f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C0166o) arrayList.get(i3)).f2784b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((C0166o) arrayList.get(i3)).f2784b != i) {
                    break;
                }
                if (i3 >= 0) {
                    ArrayList arrayList2 = this.f2760f;
                    if (i3 < arrayList2.size()) {
                        arrayList2.remove(i3);
                    }
                }
                i2 = i4;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f2760f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C0166o) arrayList.get(i2)).f2783a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList2 = this.f2760f;
            if (i2 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i2);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f2760f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0151E) item.getSubMenu()).s(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z2, boolean z3) {
        ArrayList arrayList = this.f2760f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0166o c0166o = (C0166o) arrayList.get(i2);
            if (c0166o.f2784b == i) {
                c0166o.f2803x = (c0166o.f2803x & (-5)) | (z3 ? 4 : 0);
                c0166o.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f2775w = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z2) {
        ArrayList arrayList = this.f2760f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0166o c0166o = (C0166o) arrayList.get(i2);
            if (c0166o.f2784b == i) {
                c0166o.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z2) {
        ArrayList arrayList = this.f2760f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0166o c0166o = (C0166o) arrayList.get(i2);
            if (c0166o.f2784b == i) {
                int i3 = c0166o.f2803x;
                int i4 = (i3 & (-9)) | (z2 ? 0 : 8);
                c0166o.f2803x = i4;
                if (i3 != i4) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f2758c = z2;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f2760f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f2760f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0151E) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f2767o = view;
            this.f2765m = null;
            this.f2766n = null;
        } else {
            if (i > 0) {
                this.f2765m = this.f2757b.getText(i);
            } else if (charSequence != null) {
                this.f2765m = charSequence;
            }
            if (i2 > 0) {
                this.f2766n = A.a.b(this.f2756a, i2);
            } else if (drawable != null) {
                this.f2766n = drawable;
            }
            this.f2767o = null;
        }
        p(false);
    }

    public final void v() {
        this.f2768p = false;
        if (this.f2769q) {
            this.f2769q = false;
            p(this.f2770r);
        }
    }

    public final void w() {
        if (this.f2768p) {
            return;
        }
        this.f2768p = true;
        this.f2769q = false;
        this.f2770r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f2757b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f2757b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0166o a2 = a(i, i2, i3, charSequence);
        SubMenuC0151E subMenuC0151E = new SubMenuC0151E(this.f2756a, this, a2);
        a2.f2794o = subMenuC0151E;
        subMenuC0151E.setHeaderTitle(a2.f2786e);
        return subMenuC0151E;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.f2757b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f2757b.getString(i4));
    }
}
