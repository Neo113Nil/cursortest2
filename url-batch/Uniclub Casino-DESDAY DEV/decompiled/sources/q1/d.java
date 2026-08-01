package q1;

import J0.u;
import K.C0011l;
import K.InterfaceC0010k;
import K.Q;
import K.S;
import K.b0;
import Q.o;
import Q.p;
import Q.r;
import T.s;
import a.y;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.fortuneodd.shadegrid.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.C0219d0;
import l.N0;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f3564a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Method f3565b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f3566c = false;
    public static Field d;

    public d() {
        new ConcurrentHashMap();
    }

    public static boolean C(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean D() {
        return e.d;
    }

    public static Typeface E(Configuration configuration, Typeface typeface) {
        int i;
        int i2;
        int weight;
        int i3;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i = configuration.fontWeightAdjustment;
        if (i == Integer.MAX_VALUE) {
            return null;
        }
        i2 = configuration.fontWeightAdjustment;
        if (i2 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i3 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, d(i3 + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    public static long J(String str, int i) {
        int l2 = l(str, 0, i, false);
        Matcher matcher = i1.i.f2440m.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        while (l2 < i) {
            int l3 = l(str, l2 + 1, i, true);
            matcher.region(l2, l3);
            if (i3 == -1 && matcher.usePattern(i1.i.f2440m).matches()) {
                String group = matcher.group(1);
                X0.d.d(group, "matcher.group(1)");
                i3 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                X0.d.d(group2, "matcher.group(2)");
                i6 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                X0.d.d(group3, "matcher.group(3)");
                i7 = Integer.parseInt(group3);
            } else if (i4 == -1 && matcher.usePattern(i1.i.f2439l).matches()) {
                String group4 = matcher.group(1);
                X0.d.d(group4, "matcher.group(1)");
                i4 = Integer.parseInt(group4);
            } else {
                if (i5 == -1) {
                    Pattern pattern = i1.i.f2438k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        X0.d.d(group5, "matcher.group(1)");
                        Locale locale = Locale.US;
                        X0.d.d(locale, "US");
                        String lowerCase = group5.toLowerCase(locale);
                        X0.d.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        X0.d.d(pattern2, "MONTH_PATTERN.pattern()");
                        i5 = e1.d.m0(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i2 == -1 && matcher.usePattern(i1.i.f2437j).matches()) {
                    String group6 = matcher.group(1);
                    X0.d.d(group6, "matcher.group(1)");
                    i2 = Integer.parseInt(group6);
                }
            }
            l2 = l(str, l3 + 1, i, false);
        }
        if (70 <= i2 && i2 < 100) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i5 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i4 || i4 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i3 < 0 || i3 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i6 < 0 || i6 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i7 < 0 || i7 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(j1.b.d);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, i5 - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i6);
        gregorianCalendar.set(13, i7);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static void L(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        D.a.h(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public static final void M(View view, y yVar) {
        X0.d.e(view, "<this>");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, yVar);
    }

    public static void Q(Window window, boolean z2) {
        if (Build.VERSION.SDK_INT >= 30) {
            b0.a(window, z2);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z2 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static void S(TextView textView, int i) {
        l.m(i);
        if (Build.VERSION.SDK_INT >= 28) {
            p.d(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void T(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = S.f360a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = onLongClickListener != null;
        boolean z3 = hasOnClickListeners || z2;
        checkableImageButton.setFocusable(z3);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        checkableImageButton.setImportantForAccessibility(z3 ? 1 : 2);
    }

    public static void U(TextView textView, int i) {
        l.m(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void V(TextView textView, int i) {
        l.m(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static void X(Drawable drawable, int i) {
        D.a.g(drawable, i);
    }

    public static int Y(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static void a(Throwable th, Throwable th2) {
        X0.d.e(th, "<this>");
        X0.d.e(th2, "exception");
        if (th != th2) {
            Integer num = T0.a.f764a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = S0.a.f709a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static ActionMode.Callback a0(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof r) || callback == null) ? callback : new r(callback, textView);
    }

    public static void b(StringBuilder sb, Object obj, W0.l lVar) {
        if (lVar != null) {
            sb.append((CharSequence) lVar.c(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    public static void c(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                D.a.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                D.a.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                D.a.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static int d(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static ImageView.ScaleType g(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s h(Context context) {
        ProviderInfo providerInfo;
        H.e eVar;
        ApplicationInfo applicationInfo;
        J0.e cVar = Build.VERSION.SDK_INT >= 28 ? new T.c(5) : new J0.e(5);
        PackageManager packageManager = context.getPackageManager();
        l.n(packageManager, "Package manager required to locate emoji font provider");
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
                Signature[] k2 = cVar.k(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : k2) {
                    arrayList.add(signature.toByteArray());
                }
                eVar = new H.e(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
            }
            if (eVar != null) {
                return null;
            }
            return new s(new T.r(context, eVar));
        }
        eVar = null;
        if (eVar != null) {
        }
    }

    public static int l(String str, int i, int i2, boolean z2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z2)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static boolean m(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = S.f360a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = Q.d;
        Q q2 = (Q) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (q2 == null) {
            q2 = new Q();
            q2.f357a = null;
            q2.f358b = null;
            q2.f359c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, q2);
        }
        WeakReference weakReference2 = q2.f359c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        q2.f359c = new WeakReference(keyEvent);
        if (q2.f358b == null) {
            q2.f358b = new SparseArray();
        }
        SparseArray sparseArray = q2.f358b;
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

    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean n(InterfaceC0010k interfaceC0010k, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z2 = false;
        if (interfaceC0010k == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return interfaceC0010k.d(keyEvent);
        }
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window2 = activity.getWindow();
            if (window2.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                    if (!f3564a) {
                        try {
                            f3565b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                        } catch (NoSuchMethodException unused) {
                        }
                        f3564a = true;
                    }
                    Method method = f3565b;
                    if (method != null) {
                        try {
                            Object invoke = method.invoke(actionBar, keyEvent);
                            if (invoke != null) {
                                z2 = ((Boolean) invoke).booleanValue();
                            }
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
            if (window2.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window2.getDecorView();
            if (S.b(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
        }
        if (!(callback instanceof Dialog)) {
            return (view != null && S.b(view, keyEvent)) || interfaceC0010k.d(keyEvent);
        }
        Dialog dialog = (Dialog) callback;
        if (!f3566c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f3566c = true;
        }
        Field field = d;
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
            if (S.b(decorView2, keyEvent)) {
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
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.f32c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList p(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        B.m mVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        B.n nVar = new B.n(resources, theme);
        synchronized (B.r.f43c) {
            try {
                SparseArray sparseArray = (SparseArray) B.r.f42b.get(nVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (mVar = (B.m) sparseArray.get(i)) != null) {
                    if (mVar.f31b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (mVar.f32c != 0) {
                            }
                            colorStateList2 = mVar.f30a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = B.r.f41a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateList = B.c.a(resources, resources.getXml(i), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateList == null) {
            return B.l.b(resources, i, theme);
        }
        synchronized (B.r.f43c) {
            try {
                WeakHashMap weakHashMap = B.r.f42b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(nVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(nVar, sparseArray2);
                }
                sparseArray2.append(i, new B.m(colorStateList, nVar.f33a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public static ColorStateList q(Context context, C0011l c0011l, int i) {
        int resourceId;
        ColorStateList p2;
        TypedArray typedArray = (TypedArray) c0011l.f414c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (p2 = p(context, resourceId)) == null) ? c0011l.g(i) : p2;
    }

    public static ColorStateList r(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList p2;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (p2 = p(context, resourceId)) == null) ? typedArray.getColorStateList(i) : p2;
    }

    public static ColorStateList s(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !B0.a.r(drawable)) {
            return null;
        }
        colorStateList = B0.a.e(drawable).getColorStateList();
        return colorStateList;
    }

    public static Drawable u(Context context, int i) {
        return N0.b().c(context, i);
    }

    public static Drawable v(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable u2;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (u2 = u(context, resourceId)) == null) ? typedArray.getDrawable(i) : u2;
    }

    public static Set w() {
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

    public static I.d y(C0219d0 c0219d0) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new I.d(p.c(c0219d0));
        }
        TextPaint textPaint = new TextPaint(c0219d0.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a2 = Q.n.a(c0219d0);
        int d2 = Q.n.d(c0219d0);
        if (c0219d0.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i < 28 || (c0219d0.getInputType() & 15) != 3) {
                boolean z2 = c0219d0.getLayoutDirection() == 1;
                switch (c0219d0.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z2) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(p.b(o.a(c0219d0.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new I.d(textPaint, textDirectionHeuristic, a2, d2);
    }

    public int A() {
        return 0;
    }

    public abstract void B();

    public void F(View view, int i) {
    }

    public abstract void G(int i);

    public abstract void H(View view, int i, int i2);

    public abstract void I(View view, float f2, float f3);

    public abstract Object K(Intent intent, int i);

    public abstract void N(boolean z2);

    public abstract void O(boolean z2);

    public abstract void P(boolean z2);

    public abstract void R(boolean z2);

    public abstract void W();

    public abstract boolean Z(View view, int i);

    public abstract int e(View view, int i);

    public abstract int f(View view, int i);

    public abstract Typeface i(Context context, B.g gVar, Resources resources, int i);

    public abstract Typeface j(Context context, H.k[] kVarArr, int i);

    public Typeface k(Context context, Resources resources, int i, String str, int i2) {
        File P2 = l.P(context);
        if (P2 == null) {
            return null;
        }
        try {
            if (l.w(P2, resources, i)) {
                return Typeface.createFromFile(P2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            P2.delete();
        }
    }

    public H.k o(int i, H.k[] kVarArr) {
        new J0.e(1);
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z2 = (i & 2) != 0;
        H.k kVar = null;
        int i3 = Integer.MAX_VALUE;
        for (H.k kVar2 : kVarArr) {
            int abs = (Math.abs(kVar2.f224c - i2) * 2) + (kVar2.d == z2 ? 0 : 1);
            if (kVar == null || i3 > abs) {
                kVar = kVar2;
                i3 = abs;
            }
        }
        return kVar;
    }

    public abstract void t(u uVar, float f2, float f3);

    public abstract InputFilter[] x(InputFilter[] inputFilterArr);

    public int z(View view) {
        return 0;
    }
}
