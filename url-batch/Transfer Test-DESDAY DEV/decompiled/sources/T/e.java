package T;

import Q.k;
import U.s;
import U.v;
import X0.g;
import X0.h;
import X0.i;
import X0.j;
import Y.V;
import a.x;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.InputFilter;
import android.util.Log;
import android.view.View;
import androidx.room.t;
import com.football.transfertrivia.R;
import f1.p;
import g0.I;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l.L0;
import o1.AbstractC0299p;

/* loaded from: classes.dex */
public abstract class e implements k {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class A(l1.b bVar) {
        g1.f.e(bVar, "<this>");
        Class a2 = ((g1.b) bVar).a();
        if (!a2.isPrimitive()) {
            return a2;
        }
        String name = a2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return a2;
    }

    public static X0.d D(X0.d dVar) {
        g1.f.e(dVar, "<this>");
        Z0.c cVar = dVar instanceof Z0.c ? (Z0.c) dVar : null;
        if (cVar == null) {
            return dVar;
        }
        X0.d dVar2 = cVar.f1177c;
        if (dVar2 != null) {
            return dVar2;
        }
        i iVar = cVar.f1176b;
        g1.f.b(iVar);
        X0.f fVar = (X0.f) iVar.j(X0.e.f935a);
        X0.d fVar2 = fVar != null ? new s1.f((AbstractC0299p) fVar, cVar) : cVar;
        cVar.f1177c = fVar2;
        return fVar2;
    }

    public static List E(Object obj) {
        List singletonList = Collections.singletonList(obj);
        g1.f.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static i F(g gVar, h hVar) {
        g1.f.e(hVar, "key");
        return g1.f.a(gVar.getKey(), hVar) ? j.f936a : gVar;
    }

    public static i P(i iVar, i iVar2) {
        g1.f.e(iVar2, "context");
        return iVar2 == j.f936a ? iVar : (i) iVar2.t(iVar, X0.b.d);
    }

    public static final Cursor Q(t tVar, j0.d dVar) {
        g1.f.e(tVar, "db");
        g1.f.e(dVar, "sqLiteQuery");
        return tVar.query(dVar, (CancellationSignal) null);
    }

    public static V.b R(MappedByteBuffer mappedByteBuffer) {
        long j2;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j2 = -1;
                break;
            }
            int i3 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j2 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j2 != -1) {
            duplicate.position(duplicate.position() + ((int) (j2 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j3 = duplicate.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j3; i4++) {
                int i5 = duplicate.getInt();
                long j4 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (j4 + j2));
                    V.b bVar = new V.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    bVar.d = duplicate;
                    bVar.f362a = position;
                    int i6 = position - duplicate.getInt(position);
                    bVar.f363b = i6;
                    bVar.f364c = ((ByteBuffer) bVar.d).getShort(i6);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final void S(Object[] objArr, int i, int i2) {
        g1.f.e(objArr, "<this>");
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final void T(View view, x xVar) {
        g1.f.e(view, "<this>");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, xVar);
    }

    public static final void W(Object obj) {
        if (obj instanceof U0.e) {
            throw ((U0.e) obj).f865a;
        }
    }

    public static int X(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final boolean e(Object[] objArr, int i, int i2, List list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!g1.f.a(objArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public static final String f(Object[] objArr, int i, int i2, V0.a aVar) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == aVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        g1.f.d(sb2, "toString(...)");
        return sb2;
    }

    public static void g(Throwable th, Throwable th2) {
        g1.f.e(th, "<this>");
        g1.f.e(th2, "exception");
        if (th != th2) {
            Integer num = b1.a.f1726a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = a1.a.f1236a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static W0.c h(W0.c cVar) {
        cVar.f();
        cVar.f908c = true;
        return cVar.f907b > 0 ? cVar : W0.c.d;
    }

    public static W0.i i(W0.i iVar) {
        W0.f fVar = iVar.f927a;
        fVar.b();
        return fVar.i > 0 ? iVar : W0.i.f926b;
    }

    public static void j(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i > i2) {
                throw new IllegalArgumentException(V.d(i, i2, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
    }

    public static final void m(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                g(th, th2);
            }
        }
    }

    public static int n(g0.V v2, U.g gVar, View view, View view2, I i, boolean z2) {
        if (i.v() == 0 || v2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(I.H(view) - I.H(view2)) + 1;
        }
        return Math.min(gVar.l(), gVar.b(view2) - gVar.e(view));
    }

    public static int o(g0.V v2, U.g gVar, View view, View view2, I i, boolean z2, boolean z3) {
        if (i.v() == 0 || v2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z3 ? Math.max(0, (v2.b() - Math.max(I.H(view), I.H(view2))) - 1) : Math.max(0, Math.min(I.H(view), I.H(view2)));
        if (z2) {
            return Math.round((max * (Math.abs(gVar.b(view2) - gVar.e(view)) / (Math.abs(I.H(view) - I.H(view2)) + 1))) + (gVar.k() - gVar.e(view)));
        }
        return max;
    }

    public static int p(g0.V v2, U.g gVar, View view, View view2, I i, boolean z2) {
        if (i.v() == 0 || v2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return v2.b();
        }
        return (int) (((gVar.b(view2) - gVar.e(view)) / (Math.abs(I.H(view) - I.H(view2)) + 1)) * v2.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static U.t q(Context context) {
        ProviderInfo providerInfo;
        H.e eVar;
        ApplicationInfo applicationInfo;
        O0.e cVar = Build.VERSION.SDK_INT >= 28 ? new U.c(7) : new O0.e(7);
        PackageManager packageManager = context.getPackageManager();
        A.c.l(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] d = cVar.d(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : d) {
                    arrayList.add(signature.toByteArray());
                }
                eVar = new H.e(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
            }
            if (eVar != null) {
                return null;
            }
            return new U.t(new s(context, eVar));
        }
        eVar = null;
        if (eVar != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static X0.d r(X0.d dVar, X0.d dVar2, p pVar) {
        g1.f.e(pVar, "<this>");
        if (pVar instanceof Z0.a) {
            return ((Z0.a) pVar).a(dVar, dVar2);
        }
        i h = dVar2.h();
        return h == j.f936a ? new Y0.b(dVar2, dVar, pVar) : new Y0.c(dVar2, h, pVar, dVar);
    }

    public static final U0.e s(Throwable th) {
        g1.f.e(th, "exception");
        return new U0.e(th);
    }

    public static boolean t(String str, String str2) {
        g1.f.e(str, "current");
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i2++;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    String substring = str.substring(1, str.length() - 1);
                    g1.f.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    int length = substring.length() - 1;
                    int i5 = 0;
                    boolean z2 = false;
                    while (i5 <= length) {
                        char charAt2 = substring.charAt(!z2 ? i5 : length);
                        boolean z3 = Character.isWhitespace(charAt2) || Character.isSpaceChar(charAt2);
                        if (z2) {
                            if (!z3) {
                                break;
                            }
                            length--;
                        } else if (z3) {
                            i5++;
                        } else {
                            z2 = true;
                        }
                    }
                    return g1.f.a(substring.subSequence(i5, length + 1).toString(), str2);
                }
            }
        }
        return false;
    }

    public static g u(g gVar, h hVar) {
        g1.f.e(hVar, "key");
        if (g1.f.a(gVar.getKey(), hVar)) {
            return gVar;
        }
        return null;
    }

    public static final int v(Cursor cursor, String str) {
        String str2;
        g1.f.e(cursor, "c");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            g1.f.d(columnNames, "c.columnNames");
            str2 = V0.d.b0(columnNames);
        } catch (Exception e2) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e2);
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }

    public static Drawable w(Context context, int i) {
        return L0.b().c(context, i);
    }

    public static Set x() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.emptySet();
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static final Class z(g1.c cVar) {
        Class a2 = cVar.a();
        g1.f.c(a2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a2;
    }

    public int B(View view) {
        return 0;
    }

    public int C() {
        return 0;
    }

    public abstract void G(Throwable th);

    public abstract View H(int i);

    public abstract boolean I();

    public abstract void J(v vVar);

    public void K(View view, int i) {
    }

    public abstract void L(int i);

    public abstract void M(View view, int i, int i2);

    public abstract void N(View view, float f2, float f3);

    public abstract Object O(Intent intent, int i);

    public abstract void U(boolean z2);

    public abstract void V(boolean z2);

    public abstract boolean Y(View view, int i);

    public abstract int k(View view, int i);

    public abstract int l(View view, int i);

    public abstract InputFilter[] y(InputFilter[] inputFilterArr);
}
