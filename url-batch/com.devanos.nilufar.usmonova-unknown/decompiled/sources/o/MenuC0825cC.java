package o;

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
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: o.cC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC0825cC implements Menu {
    public static final int[] y = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public final Resources b;
    public boolean c;
    public final boolean d;
    public InterfaceC0694aC e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public CharSequence m;
    public Drawable n;

    /* renamed from: o, reason: collision with root package name */
    public View f144o;
    public C1284jC v;
    public boolean x;
    public int l = 0;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public final ArrayList t = new ArrayList();
    public final CopyOnWriteArrayList u = new CopyOnWriteArrayList();
    public boolean w = false;

    public MenuC0825cC(Context context) {
        boolean z;
        boolean z2 = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = JZ.a;
            if (Build.VERSION.SDK_INT >= 28) {
                z = HZ.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z) {
                z2 = true;
            }
        }
        this.d = z2;
    }

    public final C1284jC a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (y[i5] << 16) | (65535 & i3);
        C1284jC c1284jC = new C1284jC(this, i, i2, i3, i6, charSequence, this.l);
        ArrayList arrayList = this.f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((C1284jC) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, c1284jC);
        p(true);
        return c1284jC;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.a.getPackageManager();
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
            C1284jC a = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            a.setIcon(resolveInfo.loadIcon(packageManager));
            a.g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = a;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(InterfaceC2141wC interfaceC2141wC, Context context) {
        this.u.add(new WeakReference(interfaceC2141wC));
        interfaceC2141wC.h(context, this);
        this.k = true;
    }

    public final void c(boolean z) {
        if (this.s) {
            return;
        }
        this.s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC2141wC interfaceC2141wC = (InterfaceC2141wC) weakReference.get();
            if (interfaceC2141wC == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC2141wC.b(this, z);
            }
        }
        this.s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C1284jC c1284jC = this.v;
        if (c1284jC != null) {
            d(c1284jC);
        }
        this.f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.n = null;
        this.m = null;
        this.f144o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(C1284jC c1284jC) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        boolean z = false;
        if (!copyOnWriteArrayList.isEmpty() && this.v == c1284jC) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC2141wC interfaceC2141wC = (InterfaceC2141wC) weakReference.get();
                if (interfaceC2141wC == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z = interfaceC2141wC.k(c1284jC);
                    if (z) {
                        break;
                    }
                }
            }
            v();
            if (z) {
                this.v = null;
            }
        }
        return z;
    }

    public boolean e(MenuC0825cC menuC0825cC, MenuItem menuItem) {
        InterfaceC0694aC interfaceC0694aC = this.e;
        return interfaceC0694aC != null && interfaceC0694aC.C(menuC0825cC, menuItem);
    }

    public boolean f(C1284jC c1284jC) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        boolean z = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC2141wC interfaceC2141wC = (InterfaceC2141wC) weakReference.get();
            if (interfaceC2141wC == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z = interfaceC2141wC.e(c1284jC);
                if (z) {
                    break;
                }
            }
        }
        v();
        if (z) {
            this.v = c1284jC;
        }
        return z;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1284jC c1284jC = (C1284jC) arrayList.get(i2);
            if (c1284jC.a == i) {
                return c1284jC;
            }
            if (c1284jC.hasSubMenu() && (findItem = c1284jC.f181o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final C1284jC g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.t;
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
            return (C1284jC) arrayList.get(0);
        }
        boolean n = n();
        for (int i2 = 0; i2 < size; i2++) {
            C1284jC c1284jC = (C1284jC) arrayList.get(i2);
            char c = n ? c1284jC.j : c1284jC.h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (n && c == '\b' && i == 67))) {
                return c1284jC;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f.get(i);
    }

    public final void h(List list, int i, KeyEvent keyEvent) {
        boolean n = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1284jC c1284jC = (C1284jC) arrayList.get(i2);
                if (c1284jC.hasSubMenu()) {
                    c1284jC.f181o.h(list, i, keyEvent);
                }
                char c = n ? c1284jC.j : c1284jC.h;
                if ((modifiers & 69647) == ((n ? c1284jC.k : c1284jC.i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (n && c == '\b' && i == 67)) && c1284jC.isEnabled()) {
                        list.add(c1284jC);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.x) {
            return true;
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C1284jC) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l = l();
        if (this.k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC2141wC interfaceC2141wC = (InterfaceC2141wC) weakReference.get();
                if (interfaceC2141wC == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z |= interfaceC2141wC.i();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.j;
            if (z) {
                arrayList.clear();
                arrayList2.clear();
                int size = l.size();
                for (int i = 0; i < size; i++) {
                    C1284jC c1284jC = (C1284jC) l.get(i);
                    if ((c1284jC.x & 32) == 32) {
                        arrayList.add(c1284jC);
                    } else {
                        arrayList2.add(c1284jC);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z = this.h;
        ArrayList arrayList = this.g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C1284jC c1284jC = (C1284jC) arrayList2.get(i);
            if (c1284jC.isVisible()) {
                arrayList.add(c1284jC);
            }
        }
        this.h = false;
        this.k = true;
        return arrayList;
    }

    public boolean m() {
        return this.w;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z) {
        if (this.p) {
            this.q = true;
            if (z) {
                this.r = true;
                return;
            }
            return;
        }
        if (z) {
            this.h = true;
            this.k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC2141wC interfaceC2141wC = (InterfaceC2141wC) weakReference.get();
            if (interfaceC2141wC == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC2141wC.c();
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
        C1284jC g = g(i, keyEvent);
        boolean q = g != null ? q(g, null, i2) : false;
        if ((i2 & 2) != 0) {
            c(true);
        }
        return q;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(MenuItem menuItem, InterfaceC2141wC interfaceC2141wC, int i) {
        boolean z;
        C1284jC c1284jC = (C1284jC) menuItem;
        if (c1284jC == null || !c1284jC.isEnabled()) {
            return false;
        }
        MenuC0825cC menuC0825cC = c1284jC.n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c1284jC.p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c1284jC)) && !menuC0825cC.e(menuC0825cC, c1284jC)) {
            Intent intent = c1284jC.g;
            if (intent != null) {
                try {
                    menuC0825cC.a.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                }
            }
            ActionProviderVisibilityListenerC1350kC actionProviderVisibilityListenerC1350kC = c1284jC.A;
            if (actionProviderVisibilityListenerC1350kC == null || !actionProviderVisibilityListenerC1350kC.b.onPerformDefaultAction()) {
                z = false;
                ActionProviderVisibilityListenerC1350kC actionProviderVisibilityListenerC1350kC2 = c1284jC.A;
                boolean z2 = actionProviderVisibilityListenerC1350kC2 == null && actionProviderVisibilityListenerC1350kC2.b.hasSubMenu();
                if (!c1284jC.e()) {
                    z |= c1284jC.expandActionView();
                    if (z) {
                        c(true);
                    }
                } else if (c1284jC.hasSubMenu() || z2) {
                    if ((i & 4) == 0) {
                        c(false);
                    }
                    if (!c1284jC.hasSubMenu()) {
                        SubMenuC0909dU subMenuC0909dU = new SubMenuC0909dU(this.a, this, c1284jC);
                        c1284jC.f181o = subMenuC0909dU;
                        subMenuC0909dU.setHeaderTitle(c1284jC.e);
                    }
                    SubMenuC0909dU subMenuC0909dU2 = c1284jC.f181o;
                    if (z2) {
                        actionProviderVisibilityListenerC1350kC2.b.onPrepareSubMenu(subMenuC0909dU2);
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = this.u;
                    if (!copyOnWriteArrayList.isEmpty()) {
                        r0 = interfaceC2141wC != null ? interfaceC2141wC.j(subMenuC0909dU2) : false;
                        Iterator it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            WeakReference weakReference = (WeakReference) it.next();
                            InterfaceC2141wC interfaceC2141wC2 = (InterfaceC2141wC) weakReference.get();
                            if (interfaceC2141wC2 == null) {
                                copyOnWriteArrayList.remove(weakReference);
                            } else if (!r0) {
                                r0 = interfaceC2141wC2.j(subMenuC0909dU2);
                            }
                        }
                    }
                    z |= r0;
                    if (!z) {
                        c(true);
                    }
                } else if ((i & 1) == 0) {
                    c(true);
                }
                return z;
            }
        }
        z = true;
        ActionProviderVisibilityListenerC1350kC actionProviderVisibilityListenerC1350kC22 = c1284jC.A;
        if (actionProviderVisibilityListenerC1350kC22 == null) {
        }
        if (!c1284jC.e()) {
        }
        return z;
    }

    public final void r(InterfaceC2141wC interfaceC2141wC) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC2141wC interfaceC2141wC2 = (InterfaceC2141wC) weakReference.get();
            if (interfaceC2141wC2 == null || interfaceC2141wC2 == interfaceC2141wC) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C1284jC) arrayList.get(i3)).b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((C1284jC) arrayList.get(i3)).b != i) {
                    break;
                }
                if (i3 >= 0) {
                    ArrayList arrayList2 = this.f;
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
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C1284jC) arrayList.get(i2)).a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList2 = this.f;
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
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0909dU) item.getSubMenu()).s(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1284jC c1284jC = (C1284jC) arrayList.get(i2);
            if (c1284jC.b == i) {
                c1284jC.x = (c1284jC.x & (-5)) | (z2 ? 4 : 0);
                c1284jC.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.w = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1284jC c1284jC = (C1284jC) arrayList.get(i2);
            if (c1284jC.b == i) {
                c1284jC.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C1284jC c1284jC = (C1284jC) arrayList.get(i2);
            if (c1284jC.b == i) {
                int i3 = c1284jC.x;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                c1284jC.x = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f.size();
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
                ((SubMenuC0909dU) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f144o = view;
            this.m = null;
            this.n = null;
        } else {
            if (i > 0) {
                this.m = this.b.getText(i);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i2 > 0) {
                this.n = AbstractC1774qe.b(this.a, i2);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.f144o = null;
        }
        p(false);
    }

    public final void v() {
        this.p = false;
        if (this.q) {
            this.q = false;
            p(this.r);
        }
    }

    public final void w() {
        if (this.p) {
            return;
        }
        this.p = true;
        this.q = false;
        this.r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C1284jC a = a(i, i2, i3, charSequence);
        SubMenuC0909dU subMenuC0909dU = new SubMenuC0909dU(this.a, this, a);
        a.f181o = subMenuC0909dU;
        subMenuC0909dU.setHeaderTitle(a.e);
        return subMenuC0909dU;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.b.getString(i4));
    }

    public MenuC0825cC k() {
        return this;
    }
}
