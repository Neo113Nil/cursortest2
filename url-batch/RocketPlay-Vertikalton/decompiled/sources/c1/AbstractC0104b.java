package c1;

import F1.d;
import Q.j;
import V0.i;
import a1.AbstractC0067d;
import android.database.Cursor;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.luckycounter.drinkwater.R;
import h1.l;
import h1.p;
import i1.f;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m1.c;
import o0.x;
import p.C0311c;
import p.g;
import q1.AbstractC0335a;
import x1.h;
import x1.q;
import x1.u;

/* renamed from: c1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0104b implements j {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f2117a = true;

    /* renamed from: b, reason: collision with root package name */
    public static Field f2118b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2119c;

    public static m1.a A(c cVar, int i) {
        f.e(cVar, "<this>");
        boolean z2 = i > 0;
        Integer valueOf = Integer.valueOf(i);
        if (z2) {
            if (cVar.f3559c <= 0) {
                i = -i;
            }
            return new m1.a(cVar.f3557a, cVar.f3558b, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static c B(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new c(i, i2 - 1, 1);
        }
        c cVar = c.d;
        return c.d;
    }

    public static void a(StringBuilder sb, Object obj, l lVar) {
        if (lVar != null) {
            sb.append((CharSequence) lVar.g(obj));
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

    public static void e(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('!' > charAt || charAt >= 127) {
                throw new IllegalArgumentException(y1.b.g("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
            }
        }
    }

    public static void f(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append(y1.b.g("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2));
                sb.append(y1.b.o(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void g(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                d.k(th, th2);
            }
        }
    }

    public static int h(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static int i(String str, int i, int i2, boolean z2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z2)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static boolean j(String str, String str2) {
        f.e(str, "current");
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
                    f.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return f.a(p1.d.a0(substring).toString(), str2);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static u k(String str) {
        f.e(str, "javaName");
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return u.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return u.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return u.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return u.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return u.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static q l(String str) {
        if (str.equals("http/1.0")) {
            return q.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return q.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return q.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return q.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return q.SPDY_3;
        }
        if (str.equals("quic")) {
            return q.QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public static final int m(Cursor cursor, String str) {
        String str2;
        f.e(cursor, "c");
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
            f.d(columnNames, "c.columnNames");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "");
            int i = 0;
            for (String str3 : columnNames) {
                i++;
                if (i > 1) {
                    sb.append((CharSequence) ", ");
                }
                a(sb, str3, null);
            }
            sb.append((CharSequence) "");
            str2 = sb.toString();
            f.d(str2, "toString(...)");
        } catch (Exception e2) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e2);
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }

    public static final Class n(i1.c cVar) {
        Class a2 = cVar.a();
        f.c(a2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class o(n1.b bVar) {
        f.e(bVar, "<this>");
        Class a2 = ((i1.b) bVar).a();
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

    public static final int p(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            int i4 = i2 % i3;
            if (i4 < 0) {
                i4 += i3;
            }
            int i5 = i % i3;
            if (i5 < 0) {
                i5 += i3;
            }
            int i6 = (i4 - i5) % i3;
            if (i6 < 0) {
                i6 += i3;
            }
            return i2 - i6;
        }
        if (i3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i <= i2) {
            return i2;
        }
        int i7 = -i3;
        int i8 = i % i7;
        if (i8 < 0) {
            i8 += i7;
        }
        int i9 = i2 % i7;
        if (i9 < 0) {
            i9 += i7;
        }
        int i10 = (i8 - i9) % i7;
        if (i10 < 0) {
            i10 += i7;
        }
        return i2 + i10;
    }

    public static x1.j r(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr2[i2];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i2] = p1.d.a0(str).toString();
        }
        int p2 = p(0, strArr2.length - 1, 2);
        if (p2 >= 0) {
            while (true) {
                String str2 = strArr2[i];
                String str3 = strArr2[i + 1];
                e(str2);
                f(str3, str2);
                if (i == p2) {
                    break;
                }
                i += 2;
            }
        }
        return new x1.j(strArr2);
    }

    public static void s(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static long t(String str, int i) {
        int i2 = i(str, 0, i, false);
        Matcher matcher = h.f4516m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (i2 < i) {
            int i9 = i(str, i2 + 1, i, true);
            matcher.region(i2, i9);
            if (i4 == -1 && matcher.usePattern(h.f4516m).matches()) {
                String group = matcher.group(1);
                f.d(group, "matcher.group(1)");
                i4 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                f.d(group2, "matcher.group(2)");
                i7 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                f.d(group3, "matcher.group(3)");
                i8 = Integer.parseInt(group3);
            } else if (i5 == -1 && matcher.usePattern(h.f4515l).matches()) {
                String group4 = matcher.group(1);
                f.d(group4, "matcher.group(1)");
                i5 = Integer.parseInt(group4);
            } else {
                if (i6 == -1) {
                    Pattern pattern = h.f4514k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        f.d(group5, "matcher.group(1)");
                        Locale locale = Locale.US;
                        f.d(locale, "US");
                        String lowerCase = group5.toLowerCase(locale);
                        f.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        f.d(pattern2, "MONTH_PATTERN.pattern()");
                        i6 = p1.d.Q(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(h.f4513j).matches()) {
                    String group6 = matcher.group(1);
                    f.d(group6, "matcher.group(1)");
                    i3 = Integer.parseInt(group6);
                }
            }
            i2 = i(str, i9 + 1, i, false);
        }
        if (70 <= i3 && i3 < 100) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 < 70) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i6 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i5 || i5 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i4 < 0 || i4 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i7 < 0 || i7 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i8 < 0 || i8 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(y1.b.f4651e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, i6 - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i7);
        gregorianCalendar.set(13, i8);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final void w(View view, i0.f fVar) {
        f.e(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, fVar);
    }

    public static void z(p pVar, AbstractC0335a abstractC0335a, AbstractC0335a abstractC0335a2) {
        try {
            u1.a.c(AbstractC0067d.m(AbstractC0067d.e(abstractC0335a, abstractC0335a2, pVar)), i.f1250a, null);
        } catch (Throwable th) {
            abstractC0335a2.resumeWith(F1.l.t(th));
            throw th;
        }
    }

    public abstract boolean b(g gVar, C0311c c0311c);

    public abstract boolean c(g gVar, Object obj, Object obj2);

    public abstract boolean d(g gVar, p.f fVar, p.f fVar2);

    public float q(View view) {
        if (f2117a) {
            try {
                return x.a(view);
            } catch (NoSuchMethodError unused) {
                f2117a = false;
            }
        }
        return view.getAlpha();
    }

    public abstract void u(p.f fVar, p.f fVar2);

    public abstract void v(p.f fVar, Thread thread);

    public void x(View view, float f2) {
        if (f2117a) {
            try {
                x.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                f2117a = false;
            }
        }
        view.setAlpha(f2);
    }

    public void y(View view, int i) {
        if (!f2119c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f2118b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f2119c = true;
        }
        Field field = f2118b;
        if (field != null) {
            try {
                f2118b.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
