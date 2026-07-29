package o;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import com.devanos.nilufar.usmonova.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: o.jX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1305jX {
    public static final Object h = new Object();
    public static final String[] i = new String[0];
    public static final C0457Rn j = new C0457Rn("KotlinTypeRefiner", 4);
    public static final C0140Fh k = new C0140Fh(21);
    public static final C0457Rn l = new C0457Rn("NONE", 5);
    public static final C0457Rn m = new C0457Rn("PENDING", 5);
    public static boolean n = false;

    /* renamed from: o, reason: collision with root package name */
    public static Method f185o = null;
    public static boolean p = false;
    public static Field q;

    public AbstractC1305jX(RS rs) {
        AbstractC0048Bt.n(rs, "operation");
    }

    public static boolean A(String str) {
        String path;
        if (str == null || UT.J(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (!AbstractC0778bU.w(parse.getHost(), AbstractC1473m3.f0(AbstractC1473m3.f(73, 48, 116, 93, 40, 244, 72, 7, 68, 48, 106, 93, 34, 248, 82, 19, 76, 62, 107, 93, 57, 226, 83, 9, 68, 48, 111, 18))) || (path = parse.getPath()) == null) {
                return false;
            }
            return path.equalsIgnoreCase(AbstractC1473m3.f0(AbstractC1473m3.f(5, 47, 107, 26, 58, 240, 93, 31, 90, 48, 117, 26, 47, 232)));
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void B(TC tc, InterfaceC1455lp interfaceC1455lp) {
        AF af = tc.g;
        if (af == null) {
            af = new AF((InterfaceC2342zF) tc);
            tc.g = af;
        }
        ((S2) AbstractC0946e20.K(tc)).getSnapshotObserver().a(af, C2316yt.z, interfaceC1455lp);
    }

    public static final void E(C0849ca c0849ca, InterfaceC2235xe interfaceC2235xe, boolean z) {
        Object obj = C0849ca.n.get(c0849ca);
        Throwable d = c0849ca.d(obj);
        Object d2 = d != null ? AbstractC1494mO.d(d) : c0849ca.e(obj);
        if (!z) {
            interfaceC2235xe.resumeWith(d2);
            return;
        }
        AbstractC0048Bt.l(interfaceC2235xe, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C0011Ai c0011Ai = (C0011Ai) interfaceC2235xe;
        AbstractC2367ze abstractC2367ze = c0011Ai.l;
        Object obj2 = c0011Ai.n;
        InterfaceC0189He context = abstractC2367ze.getContext();
        Object R0 = PX.R0(context, obj2);
        YX V = R0 != PX.l ? AbstractC0946e20.V(abstractC2367ze, context, R0) : null;
        try {
            abstractC2367ze.resumeWith(d2);
            if (V == null || V.d0()) {
                PX.K0(context, R0);
            }
        } catch (Throwable th) {
            if (V == null || V.d0()) {
                PX.K0(context, R0);
            }
            throw th;
        }
    }

    public static void F(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    public static void G(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }

    public static final String H(InterfaceC1245ib interfaceC1245ib, String str) {
        String q2;
        AbstractC0048Bt.n(interfaceC1245ib, "classDescriptor");
        String str2 = C1460lu.a;
        C2377zo i2 = AbstractC0192Hh.g(interfaceC1245ib).i();
        AbstractC0048Bt.m(i2, "fqNameSafe.toUnsafe()");
        C1639ob f = C1460lu.f(i2);
        if (f != null) {
            q2 = C0870cv.b(f).e();
            AbstractC0048Bt.m(q2, "byClassId(it).internalName");
        } else {
            q2 = AbstractC1473m3.q(interfaceC1245ib, C1097gL.n);
        }
        AbstractC0048Bt.n(q2, "internalName");
        return q2 + '.' + str;
    }

    public static void I(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        AbstractC0048Bt.Z(classCastException, AbstractC1305jX.class.getName());
        throw classCastException;
    }

    public static C1658ou J(int i2, boolean z, C1267iz c1267iz, int i3) {
        boolean z2 = (i3 & 1) != 0 ? false : z;
        boolean z3 = (i3 & 2) == 0;
        if ((i3 & 4) != 0) {
            c1267iz = null;
        }
        AbstractC1888sN.p(i2, "<this>");
        return new C1658ou(i2, z3, z2, c1267iz != null ? AbstractC0773bP.i(c1267iz) : null, 34);
    }

    public static final String K(String str) {
        AbstractC0048Bt.n(str, "<this>");
        int i2 = -1;
        int i3 = 0;
        if (!UT.E(str, ":")) {
            try {
                String ascii = IDN.toASCII(str);
                AbstractC0048Bt.m(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                AbstractC0048Bt.m(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                AbstractC0048Bt.m(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i4 = 0; i4 < length; i4++) {
                    char charAt = lowerCase.charAt(i4);
                    if (AbstractC0048Bt.t(charAt, 31) <= 0 || AbstractC0048Bt.t(charAt, 127) >= 0 || UT.H(" #%/:?@[\\]", charAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress o2 = (AbstractC0778bU.B(str, "[", false) && AbstractC0778bU.v(str, "]", false)) ? o(str, 1, str.length() - 1) : o(str, 0, str.length());
        if (o2 == null) {
            return null;
        }
        byte[] address = o2.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return o2.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < address.length) {
            int i7 = i5;
            while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                i7 += 2;
            }
            int i8 = i7 - i5;
            if (i8 > i6 && i8 >= 4) {
                i2 = i5;
                i6 = i8;
            }
            i5 = i7 + 2;
        }
        G8 g8 = new G8();
        while (i3 < address.length) {
            if (i3 == i2) {
                g8.N(58);
                i3 += i6;
                if (i3 == 16) {
                    g8.N(58);
                }
            } else {
                if (i3 > 0) {
                    g8.N(58);
                }
                byte b = address[i3];
                byte[] bArr = HY.a;
                g8.P(((b & 255) << 8) | (address[i3 + 1] & 255));
                i3 += 2;
            }
        }
        return g8.F();
    }

    public static final Class L(ClassLoader classLoader, String str) {
        AbstractC0048Bt.n(str, "fqName");
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static long b(float f) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
        int i2 = AbstractC0111Ee.b;
        return floatToRawIntBits;
    }

    public static final long c(int i2, int i3) {
        return (i3 & 4294967295L) | (i2 << 32);
    }

    public static final ET d(Object obj) {
        if (obj == null) {
            obj = AbstractC1052fg.e;
        }
        return new ET(obj);
    }

    public static List e(Object obj) {
        if ((obj instanceof InterfaceC1594nw) && !(obj instanceof InterfaceC1726pw)) {
            I(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            AbstractC0048Bt.Z(e, AbstractC1305jX.class.getName());
            throw e;
        }
    }

    public static Map f(Object obj) {
        if ((obj instanceof InterfaceC1594nw) && !(obj instanceof InterfaceC1792qw)) {
            I(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            AbstractC0048Bt.Z(e, AbstractC1305jX.class.getName());
            throw e;
        }
    }

    public static Set g(Object obj) {
        if ((obj instanceof InterfaceC1594nw) && !(obj instanceof InterfaceC0103Dw)) {
            I(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            AbstractC0048Bt.Z(e, AbstractC1305jX.class.getName());
            throw e;
        }
    }

    public static final void h(UZ uz, KP kp, AbstractC0106Dz abstractC0106Dz) {
        AbstractC0048Bt.n(kp, "registry");
        AbstractC0048Bt.n(abstractC0106Dz, "lifecycle");
        EP ep = (EP) uz.c("androidx.lifecycle.savedstate.vm.tag");
        if (ep == null || ep.j) {
            return;
        }
        ep.m(abstractC0106Dz, kp);
        EnumC0080Cz enumC0080Cz = ((C0417Pz) abstractC0106Dz).d;
        if (enumC0080Cz == EnumC0080Cz.i || enumC0080Cz.compareTo(EnumC0080Cz.k) >= 0) {
            kp.d();
        } else {
            abstractC0106Dz.a(new C0113Eg(abstractC0106Dz, kp));
        }
    }

    public static void i(int i2, Object obj) {
        if (obj == null || w(i2, obj)) {
            return;
        }
        I(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static int j(Context context, String str) {
        int c;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String d = AbstractC1148h6.d(str);
            if (d != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                    c = AbstractC1148h6.c((AppOpsManager) AbstractC1148h6.a(context, AppOpsManager.class), d, packageName);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager c2 = AbstractC1214i6.c(context);
                    c = AbstractC1214i6.a(c2, d, Binder.getCallingUid(), packageName);
                    if (c == 0) {
                        c = AbstractC1214i6.a(c2, d, myUid, AbstractC1214i6.b(context));
                    }
                } else {
                    c = AbstractC1148h6.c((AppOpsManager) AbstractC1148h6.a(context, AppOpsManager.class), d, packageName);
                }
                if (c != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static int l(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final n30 m(C1818rJ c1818rJ, int i2) {
        InterfaceC2363za.a.getClass();
        int i3 = C2297ya.b;
        if (i2 >= i3) {
            i3 = i2;
        }
        return new n30(i3 - i2, H8.h, C1188hk.h, c1818rJ);
    }

    public static RW n(boolean z, C1332jy c1332jy, int i2) {
        C1097gL c1097gL = C1097gL.k;
        if ((i2 & 8) != 0) {
            c1332jy = C1332jy.a;
        }
        return new RW(z, true, c1097gL, c1332jy, C1398ky.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InetAddress o(String str, int i2, int i3) {
        int i4;
        byte[] bArr = new byte[16];
        int i5 = i2;
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        while (true) {
            if (i5 >= i3) {
                break;
            }
            if (i6 == 16) {
                return null;
            }
            int i9 = i5 + 2;
            if (i9 <= i3 && AbstractC0778bU.A(i5, str, "::", false)) {
                if (i7 != -1) {
                    return null;
                }
                i6 += 2;
                i7 = i6;
                if (i9 == i3) {
                    break;
                }
                i8 = i9;
                int i10 = 0;
                i5 = i8;
                while (i5 < i3) {
                }
                i4 = i5 - i8;
                return i4 == 0 ? null : null;
            }
            if (i6 != 0) {
                if (AbstractC0778bU.A(i5, str, ":", false)) {
                    i5++;
                } else {
                    if (!AbstractC0778bU.A(i5, str, ".", false)) {
                        return null;
                    }
                    int i11 = i6 - 2;
                    int i12 = i11;
                    while (i8 < i3) {
                        if (i12 == 16) {
                            return null;
                        }
                        if (i12 != i11) {
                            if (str.charAt(i8) != '.') {
                                return null;
                            }
                            i8++;
                        }
                        int i13 = 0;
                        int i14 = i8;
                        while (i14 < i3) {
                            char charAt = str.charAt(i14);
                            if (AbstractC0048Bt.t(charAt, 48) < 0 || AbstractC0048Bt.t(charAt, 57) > 0) {
                                break;
                            }
                            if ((i13 == 0 && i8 != i14) || ((i13 * 10) + charAt) - 48 > 255) {
                                return null;
                            }
                            i14++;
                        }
                        if (i14 - i8 == 0) {
                            return null;
                        }
                        bArr[i12] = (byte) i13;
                        i12++;
                        i8 = i14;
                    }
                    if (i12 != i6 + 2) {
                        return null;
                    }
                    i6 += 2;
                }
            }
            i8 = i5;
            int i102 = 0;
            i5 = i8;
            while (i5 < i3) {
                int p2 = HY.p(str.charAt(i5));
                if (p2 == -1) {
                    break;
                }
                i102 = (i102 << 4) + p2;
                i5++;
            }
            i4 = i5 - i8;
            if (i4 == 0 && i4 <= 4) {
                int i15 = i6 + 1;
                bArr[i6] = (byte) (255 & (i102 >>> 8));
                i6 += 2;
                bArr[i15] = (byte) (i102 & 255);
            }
        }
        if (i6 != 16) {
            if (i7 == -1) {
                return null;
            }
            int i16 = i6 - i7;
            System.arraycopy(bArr, i7, bArr, 16 - i16, i16);
            Arrays.fill(bArr, i7, (16 - i6) + i7, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static boolean p(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = AZ.a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = C2362zZ.d;
        C2362zZ c2362zZ = (C2362zZ) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (c2362zZ == null) {
            c2362zZ = new C2362zZ();
            c2362zZ.a = null;
            c2362zZ.b = null;
            c2362zZ.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c2362zZ);
        }
        WeakReference weakReference2 = c2362zZ.c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c2362zZ.c = new WeakReference(keyEvent);
        if (c2362zZ.b == null) {
            c2362zZ.b = new SparseArray();
        }
        SparseArray sparseArray = c2362zZ.b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean q(InterfaceC0130Ex interfaceC0130Ex, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z = false;
        if (interfaceC0130Ex != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return interfaceC0130Ex.superDispatchKeyEvent(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window2 = activity.getWindow();
                if (window2.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!n) {
                            try {
                                f185o = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            n = true;
                        }
                        Method method = f185o;
                        if (method != null) {
                            try {
                                Object invoke = method.invoke(actionBar, keyEvent);
                                if (invoke != null) {
                                    z = ((Boolean) invoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (z) {
                            return true;
                        }
                    }
                }
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window2.getDecorView();
                if (AZ.b(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!p) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        q = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    p = true;
                }
                Field field = q;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                    }
                    if (onKeyListener == null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                        return true;
                    }
                    window = dialog.getWindow();
                    if (!window.superDispatchKeyEvent(keyEvent)) {
                        return true;
                    }
                    View decorView2 = window.getDecorView();
                    if (AZ.b(decorView2, keyEvent)) {
                        return true;
                    }
                    return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
                }
                onKeyListener = null;
                if (onKeyListener == null) {
                }
                window = dialog.getWindow();
                if (!window.superDispatchKeyEvent(keyEvent)) {
                }
            } else if ((view != null && AZ.b(view, keyEvent)) || interfaceC0130Ex.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static final int r(C1586no c1586no, int i2) {
        boolean z = AbstractC0048Bt.t(c1586no.h, C1586no.i.h) >= 0;
        boolean z2 = i2 == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public static final Object s(AbstractC1917sq abstractC1917sq, C2049uq c2049uq) {
        AbstractC0048Bt.n(abstractC1917sq, "<this>");
        AbstractC0048Bt.n(c2049uq, "extension");
        if (abstractC1917sq.l(c2049uq)) {
            return abstractC1917sq.k(c2049uq);
        }
        return null;
    }

    public static final Object t(AbstractC1917sq abstractC1917sq, C2049uq c2049uq, int i2) {
        AbstractC0048Bt.n(abstractC1917sq, "<this>");
        AbstractC0048Bt.n(c2049uq, "extension");
        abstractC1917sq.o(c2049uq);
        C0377Ol c0377Ol = abstractC1917sq.h;
        C1983tq c1983tq = c2049uq.d;
        c0377Ol.getClass();
        C1038fS c1038fS = c0377Ol.a;
        if (!c1983tq.j) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj = c1038fS.get(c1983tq);
        if (i2 >= (obj == null ? 0 : ((List) obj).size())) {
            return null;
        }
        abstractC1917sq.o(c2049uq);
        if (!c1983tq.j) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj2 = c1038fS.get(c1983tq);
        if (obj2 != null) {
            return c2049uq.a(((List) obj2).get(i2));
        }
        throw new IndexOutOfBoundsException();
    }

    public static final YB u(CK ck, InterfaceC0893dE interfaceC0893dE, C0695aD c0695aD, boolean z, boolean z2, boolean z3) {
        AbstractC0048Bt.n(ck, "proto");
        AbstractC0048Bt.n(interfaceC0893dE, "nameResolver");
        C2049uq c2049uq = AbstractC0180Gv.d;
        AbstractC0048Bt.m(c2049uq, "propertySignature");
        C0024Av c0024Av = (C0024Av) s(ck, c2049uq);
        if (c0024Av != null) {
            if (z) {
                C1649ol c1649ol = C0206Hv.a;
                C1395kv b = C0206Hv.b(ck, interfaceC0893dE, c0695aD, z3);
                if (b != null) {
                    return AbstractC0048Bt.E(b);
                }
            } else if (z2 && (c0024Av.i & 2) == 2) {
                C2318yv c2318yv = c0024Av.k;
                AbstractC0048Bt.m(c2318yv, "signature.syntheticMethod");
                return new YB(interfaceC0893dE.getString(c2318yv.j).concat(interfaceC0893dE.getString(c2318yv.k)));
            }
        }
        return null;
    }

    public static boolean w(int i2, Object obj) {
        int i3;
        if (obj instanceof InterfaceC0174Gp) {
            if (obj instanceof InterfaceC0200Hp) {
                i3 = ((InterfaceC0200Hp) obj).getArity();
            } else if (obj instanceof InterfaceC1455lp) {
                i3 = 0;
            } else if (obj instanceof InterfaceC2114vp) {
                i3 = 1;
            } else if (obj instanceof InterfaceC2312yp) {
                i3 = 2;
            } else if (obj instanceof InterfaceC2378zp) {
                i3 = 3;
            } else if (obj instanceof InterfaceC0018Ap) {
                i3 = 4;
            } else if (obj instanceof InterfaceC0044Bp) {
                i3 = 5;
            } else if (obj instanceof InterfaceC0070Cp) {
                i3 = 6;
            } else if (obj instanceof InterfaceC0096Dp) {
                i3 = 7;
            } else if (obj instanceof InterfaceC0122Ep) {
                i3 = 8;
            } else if (obj instanceof InterfaceC0148Fp) {
                i3 = 9;
            } else if (obj instanceof InterfaceC1521mp) {
                i3 = 10;
            } else if (obj instanceof InterfaceC1587np) {
                i3 = 11;
            } else {
                boolean z = obj instanceof InterfaceC0537Up;
                i3 = z ? 12 : obj instanceof InterfaceC1653op ? 13 : obj instanceof InterfaceC1719pp ? 14 : obj instanceof InterfaceC1785qp ? 15 : obj instanceof InterfaceC1850rp ? 16 : obj instanceof InterfaceC1916sp ? 17 : obj instanceof InterfaceC1982tp ? 18 : obj instanceof InterfaceC2048up ? 19 : obj instanceof InterfaceC2180wp ? 20 : obj instanceof InterfaceC2246xp ? 21 : z ? 22 : -1;
            }
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean x(Throwable th) {
        Class<?> cls = th.getClass();
        while (!AbstractC0048Bt.h(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    public static final C2257y z(Object[] objArr) {
        AbstractC0048Bt.n(objArr, "array");
        return new C2257y(objArr);
    }

    public abstract View C(int i2);

    public abstract boolean D();

    public abstract void M(byte[] bArr, int i2, int i3);

    public abstract List k(String str, List list);

    public boolean y() {
        throw null;
    }
}
