package o;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Region;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import android.util.Xml;
import android.widget.EdgeEffect;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: o.fg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1052fg {
    public static final Object b = new Object();
    public static final C1883sI c = new C1883sI(new C1488mI());
    public static final T2 d = new T2(2);
    public static final C0457Rn e = new C0457Rn("NULL", 5);
    public static final C1032fM f = new C1032fM(0.0f, 0.0f, 10.0f, 10.0f);
    public static final GU g = new GU(6);
    public final /* synthetic */ int a = 22;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static C1143h2 A(Context context, C1216i8 c1216i8) {
        ?? r8;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) c1216i8.i;
        String str2 = (String) c1216i8.j;
        int i = 0;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(AbstractC1888sN.s("No package found for authority: ", str));
        }
        if (!resolveContentProvider.packageName.equals(str2)) {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
        }
        Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        T2 t2 = d;
        Collections.sort(arrayList, t2);
        List list = (List) c1216i8.l;
        if (list == null) {
            list = AbstractC0022At.D(resources, 0);
        }
        int i2 = 0;
        loop1: while (true) {
            r8 = 0;
            r8 = 0;
            r8 = 0;
            r8 = 0;
            if (i2 >= list.size()) {
                resolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) list.get(i2));
            Collections.sort(arrayList2, t2);
            if (arrayList.size() == arrayList2.size()) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (!Arrays.equals((byte[]) arrayList.get(i3), (byte[]) arrayList2.get(i3))) {
                        break;
                    }
                }
                break loop1;
            }
            i2++;
        }
        int i4 = 1;
        if (resolveContentProvider == null) {
            return new C1143h2((Object[]) r8, i4);
        }
        String str3 = resolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str3).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str3).appendPath("file").build();
        ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
        try {
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            String[] strArr2 = {(String) c1216i8.k};
            if (acquireUnstableContentProviderClient != null) {
                try {
                    r8 = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                } catch (RemoteException e2) {
                    Log.w("FontsProvider", "Unable to query the content provider", e2);
                }
            }
            if (r8 != 0 && r8.getCount() > 0) {
                int columnIndex = r8.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = r8.getColumnIndex("_id");
                int columnIndex3 = r8.getColumnIndex("file_id");
                int columnIndex4 = r8.getColumnIndex("font_ttc_index");
                int columnIndex5 = r8.getColumnIndex("font_weight");
                int columnIndex6 = r8.getColumnIndex("font_italic");
                while (r8.moveToNext()) {
                    arrayList3.add(new C1718po(columnIndex3 == -1 ? ContentUris.withAppendedId(build, r8.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, r8.getLong(columnIndex3)), columnIndex4 != -1 ? r8.getInt(columnIndex4) : 0, columnIndex5 != -1 ? r8.getInt(columnIndex5) : 400, columnIndex6 != -1 && r8.getInt(columnIndex6) == 1, columnIndex != -1 ? r8.getInt(columnIndex) : 0));
                }
            }
            if (r8 != 0) {
                r8.close();
            }
            if (acquireUnstableContentProviderClient != null) {
                acquireUnstableContentProviderClient.close();
            }
            return new C1143h2((C1718po[]) arrayList3.toArray(new C1718po[0]), i);
        } catch (Throwable th) {
            if (r8 != 0) {
                r8.close();
            }
            if (acquireUnstableContentProviderClient != null) {
                acquireUnstableContentProviderClient.close();
            }
            throw th;
        }
    }

    public static final String B(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0827cE C(InterfaceC0893dE interfaceC0893dE, int i) {
        AbstractC0048Bt.n(interfaceC0893dE, "<this>");
        return C0827cE.d(interfaceC0893dE.getString(i));
    }

    public static final void D(C2023uQ c2023uQ) {
        InterfaceC2114vp interfaceC2114vp;
        ArrayList arrayList = new ArrayList();
        Object obj = c2023uQ.h.get(C1957tQ.a);
        if (obj == null) {
            obj = null;
        }
        C1599o0 c1599o0 = (C1599o0) obj;
        if (c1599o0 != null && (interfaceC2114vp = (InterfaceC2114vp) c1599o0.b) != null && ((Boolean) interfaceC2114vp.invoke(arrayList)).booleanValue() && arrayList.get(0) != null) {
            throw new ClassCastException();
        }
    }

    public static final Method E(Class cls, InterfaceC2204x9 interfaceC2204x9) {
        AbstractC0048Bt.n(interfaceC2204x9, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            AbstractC0048Bt.m(declaredMethod, "{\n        getDeclaredMet…LINE_CLASS_MEMBERS)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new C0526Ue("No unbox method found in inline class: " + cls + " (calling " + interfaceC2204x9 + ')');
        }
    }

    public static boolean F(InterfaceC1738q4 interfaceC1738q4, C2245xo c2245xo) {
        AbstractC0048Bt.n(c2245xo, "fqName");
        return interfaceC1738q4.c(c2245xo) != null;
    }

    public static final boolean G(C0405Pn c0405Pn) {
        C0027Ay c0027Ay;
        ME me;
        C0027Ay c0027Ay2;
        ME me2 = c0405Pn.h;
        return (me2 == null || (c0027Ay = me2.l) == null || !c0027Ay.w() || (me = c0405Pn.h) == null || (c0027Ay2 = me.l) == null || !c0027Ay2.v()) ? false : true;
    }

    public static final boolean H(C2287yQ c2287yQ) {
        C2023uQ c2023uQ = c2287yQ.d;
        if (c2023uQ.i) {
            return true;
        }
        Set keySet = c2023uQ.h.keySet();
        if ((keySet instanceof Collection) && keySet.isEmpty()) {
            return false;
        }
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            if (((FQ) it.next()).c) {
                return true;
            }
        }
        return false;
    }

    public static float I(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0064Cj.c(edgeEffect, f2, f3);
        }
        AbstractC0038Bj.a(edgeEffect, f2, f3);
        return f2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r5 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        if (r5 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void J(Context context, String str) {
        synchronized (b) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer newSerializer = Xml.newSerializer();
                try {
                    try {
                        newSerializer.setOutput(openFileOutput, null);
                        newSerializer.startDocument("UTF-8", Boolean.TRUE);
                        newSerializer.startTag(null, "locales");
                        newSerializer.attribute(null, "application_locales", str);
                        newSerializer.endTag(null, "locales");
                        newSerializer.endDocument();
                    } catch (Throwable th) {
                        if (openFileOutput != null) {
                            try {
                                openFileOutput.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e2);
                }
            } catch (FileNotFoundException unused2) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
            }
        }
    }

    public static void K(IC ic, MediaExtractor mediaExtractor) {
        try {
            int trackCount = mediaExtractor.getTrackCount();
            for (int i = 0; i < trackCount; i++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
                String string = trackFormat.getString("mime");
                if (string != null && string.startsWith("image/")) {
                    int integer = trackFormat.containsKey("rotation-degrees") ? trackFormat.getInteger("rotation-degrees") : 0;
                    int i2 = ic.g;
                    int i3 = ic.f;
                    if (integer != 90 && integer != 270) {
                        i3 = i2;
                        i2 = i3;
                    }
                    ic.b = i2;
                    ic.a = i3;
                    ic.c = integer;
                    return;
                }
            }
        } catch (Exception e2) {
            Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r2 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002e, code lost:
    
        if (r5 != 4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x003b, code lost:
    
        if (r3.getName().equals("locales") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003d, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0053, code lost:
    
        if (r2 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String L(Context context) {
        String str;
        synchronized (b) {
            str = "";
            try {
                FileInputStream openFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                try {
                    try {
                        XmlPullParser newPullParser = Xml.newPullParser();
                        newPullParser.setInput(openFileInput, "UTF-8");
                        int depth = newPullParser.getDepth();
                        while (true) {
                            int next = newPullParser.next();
                            if (next != 1) {
                                if (next == 3 && newPullParser.getDepth() <= depth) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    } catch (IOException | XmlPullParserException unused) {
                        Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    }
                } catch (Throwable th) {
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused3) {
                return "";
            }
        }
        return str;
        if (str.isEmpty()) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
        }
        return str;
    }

    public static LinkedHashSet M(C0827cE c0827cE, Collection collection, Collection collection2, InterfaceC1245ib interfaceC1245ib, InterfaceC0143Fk interfaceC0143Fk, XG xg, boolean z) {
        if (c0827cE == null) {
            a(12);
            throw null;
        }
        if (collection == null) {
            a(13);
            throw null;
        }
        if (interfaceC1245ib == null) {
            a(15);
            throw null;
        }
        if (interfaceC0143Fk == null) {
            a(16);
            throw null;
        }
        if (xg == null) {
            a(17);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        xg.h(c0827cE, collection, collection2, interfaceC1245ib, new C0088Dh(interfaceC0143Fk, linkedHashSet, z));
        return linkedHashSet;
    }

    public static LinkedHashSet N(C0827cE c0827cE, AbstractCollection abstractCollection, Collection collection, InterfaceC1245ib interfaceC1245ib, InterfaceC0143Fk interfaceC0143Fk, XG xg) {
        if (c0827cE == null) {
            a(0);
            throw null;
        }
        if (interfaceC1245ib == null) {
            a(3);
            throw null;
        }
        if (interfaceC0143Fk == null) {
            a(4);
            throw null;
        }
        if (xg != null) {
            return M(c0827cE, abstractCollection, collection, interfaceC1245ib, interfaceC0143Fk, xg, false);
        }
        a(5);
        throw null;
    }

    public static LinkedHashSet O(C0827cE c0827cE, Collection collection, AbstractCollection abstractCollection, C0390Oy c0390Oy, InterfaceC0143Fk interfaceC0143Fk, XG xg) {
        if (c0827cE == null) {
            a(6);
            throw null;
        }
        if (collection == null) {
            a(7);
            throw null;
        }
        if (c0390Oy == null) {
            a(9);
            throw null;
        }
        if (interfaceC0143Fk == null) {
            a(10);
            throw null;
        }
        if (xg != null) {
            return M(c0827cE, collection, abstractCollection, c0390Oy, interfaceC0143Fk, xg, true);
        }
        a(11);
        throw null;
    }

    public static final void P(T3 t3, int i) {
        Object obj;
        Iterator<T> it = t3.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((C0027Ay) ((Map.Entry) obj).getKey()).c == i) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null && entry.getValue() != null) {
            throw new ClassCastException();
        }
    }

    public static final void Q(KG kg, int i, int i2) {
        int i3 = 1 << i;
        int i4 = kg.y;
        if ((i4 & i3) == 0) {
            kg.y = i3 | i4;
            kg.u[(kg.v - kg.i0().a) + i] = i2;
        } else {
            T("Already pushed argument " + kg.i0().b(i));
            throw null;
        }
    }

    public static final void R(KG kg, int i, Object obj) {
        int i2 = 1 << i;
        int i3 = kg.z;
        if ((i3 & i2) == 0) {
            kg.z = i2 | i3;
            kg.w[(kg.x - kg.i0().b) + i] = obj;
        } else {
            T("Already pushed argument " + kg.i0().c(i));
            throw null;
        }
    }

    public static final void S(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void T(String str) {
        throw new IllegalStateException(str);
    }

    public static final String U(InterfaceC2235xe interfaceC2235xe) {
        Object d2;
        if (interfaceC2235xe instanceof C0011Ai) {
            return ((C0011Ai) interfaceC2235xe).toString();
        }
        try {
            d2 = interfaceC2235xe + '@' + B(interfaceC2235xe);
        } catch (Throwable th) {
            d2 = AbstractC1494mO.d(th);
        }
        if (C1428lO.a(d2) != null) {
            d2 = interfaceC2235xe.getClass().getName() + '@' + B(interfaceC2235xe);
        }
        return (String) d2;
    }

    public static final Class V(InterfaceC1118gg interfaceC1118gg) {
        if (!(interfaceC1118gg instanceof InterfaceC1245ib) || !AbstractC0306Ls.b(interfaceC1118gg)) {
            return null;
        }
        InterfaceC1245ib interfaceC1245ib = (InterfaceC1245ib) interfaceC1118gg;
        Class j = JY.j(interfaceC1245ib);
        if (j != null) {
            return j;
        }
        throw new C0526Ue("Class object for the class " + interfaceC1245ib.getName() + " cannot be found (classId=" + AbstractC0192Hh.f((InterfaceC2364zb) interfaceC1118gg) + ')');
    }

    public static final Class W(AbstractC1004ey abstractC1004ey) {
        JR f2;
        AbstractC0048Bt.n(abstractC1004ey, "<this>");
        Class V = V(abstractC1004ey.B0().c());
        if (V == null) {
            return null;
        }
        if (AbstractC2228xX.e(abstractC1004ey) && ((f2 = AbstractC0306Ls.f(abstractC1004ey)) == null || AbstractC2228xX.e(f2) || AbstractC0545Ux.F(f2))) {
            return null;
        }
        return V;
    }

    public static final String X(float f2) {
        if (Float.isNaN(f2)) {
            return "NaN";
        }
        if (Float.isInfinite(f2)) {
            return f2 < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f3 = f2 * pow;
        int i = (int) f3;
        if (f3 - i >= 0.5f) {
            i++;
        }
        float f4 = i / pow;
        return max > 0 ? String.valueOf(f4) : String.valueOf((int) f4);
    }

    public static final void Y(InterfaceC2214xJ interfaceC2214xJ, Object obj) {
        Object f2 = ((C2148wJ) interfaceC2214xJ).k.f(obj);
        if (!(f2 instanceof C0340Na)) {
        } else {
            Object obj2 = ((C0366Oa) AbstractC0868ct.S(C1188hk.h, new C0418Qa(interfaceC2214xJ, obj, null))).a;
        }
    }

    public static void Z(Object obj) {
        if (obj instanceof V10) {
            throw ((V10) obj).a;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 18 ? 3 : 2];
        switch (i) {
            case 1:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 18) {
            throw new IllegalStateException(format);
        }
    }

    public static final int a0(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static final void b(UC uc, InterfaceC2114vp interfaceC2114vp, InterfaceC1377kd interfaceC1377kd, int i) {
        C1575nd c1575nd = (C1575nd) interfaceC1377kd;
        c1575nd.J(-932836462);
        int i2 = 2;
        if ((((c1575nd.d(uc) ? 4 : 2) | i | (c1575nd.e(interfaceC2114vp) ? 32 : 16)) & 19) == 18 && c1575nd.t()) {
            c1575nd.F();
        } else {
            UC a = androidx.compose.ui.draw.a.a(uc, interfaceC2114vp);
            int i3 = c1575nd.M;
            c1575nd.I(439770924);
            if (!a.a(I2.w)) {
                c1575nd.G(1219399079, null, 0, null);
                a = (UC) a.b(RC.a, new SP(i2, 16));
                c1575nd.n(false);
            }
            c1575nd.n(false);
            JH j = c1575nd.j();
            InterfaceC1181hd.a.getClass();
            C2234xd c2234xd = C1115gd.b;
            c1575nd.G(125, null, 2, null);
            c1575nd.q = true;
            boolean z = c1575nd.L;
            if (z) {
                c1575nd.i(c2234xd);
            } else {
                c1575nd.q = false;
                if (z) {
                    EB.h("useNode() called while inserting");
                    throw null;
                }
                C0776bS c0776bS = c1575nd.D;
                Object i4 = c0776bS.i(c0776bS.i);
                C1443ld c1443ld = c1575nd.I;
                c1443ld.c();
                c1443ld.h.a.add(i4);
            }
            TM.B(KS.a, c1575nd, C1115gd.e);
            TM.B(j, c1575nd, C1115gd.d);
            TM.B(a, c1575nd, C1115gd.c);
            C1268j c1268j = C1115gd.f;
            if (c1575nd.L || !AbstractC0048Bt.h(c1575nd.C(), Integer.valueOf(i3))) {
                c1575nd.P(Integer.valueOf(i3));
                c1575nd.b(Integer.valueOf(i3), c1268j);
            }
            c1575nd.n(true);
        }
        WL o2 = c1575nd.o();
        if (o2 != null) {
            o2.d = new C1671p3(uc, interfaceC2114vp, i, 1);
        }
    }

    public static Object b0(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if (obj instanceof JSONArray) {
            return obj;
        }
        if (obj instanceof JSONObject) {
            return obj;
        }
        if (obj.equals(JSONObject.NULL)) {
            return obj;
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(b0(it.next()));
            }
            return jSONArray;
        }
        if (obj.getClass().isArray()) {
            JSONArray jSONArray2 = new JSONArray();
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                jSONArray2.put(b0(Array.get(obj, i)));
            }
            return jSONArray2;
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONObject.put((String) entry.getKey(), b0(entry.getValue()));
            }
            return jSONObject;
        }
        if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short)) {
            return obj;
        }
        if (obj instanceof String) {
            return obj;
        }
        if (obj.getClass().getPackage().getName().startsWith("java.")) {
            return obj.toString();
        }
        return null;
    }

    public static final C2103ve c(InterfaceC0189He interfaceC0189He) {
        if (interfaceC0189He.k(C0460Rq.K) == null) {
            interfaceC0189He = interfaceC0189He.D(new C0127Eu(null));
        }
        return new C2103ve(interfaceC0189He);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        if (r3 <= 1.0000008f) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r3 >= (-8.34465E-7f)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000f, code lost:
    
        r3 = Float.NaN;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int c0(float f2, float[] fArr, int i) {
        float f3 = 0.0f;
        if (f2 >= 0.0f) {
            f3 = 1.0f;
            if (f2 > 1.0f) {
            }
        }
        fArr[i] = f2;
        return !Float.isNaN(f2) ? 1 : 0;
    }

    public static final int d(AbstractC1415lB abstractC1415lB, AbstractC2248xr abstractC2248xr) {
        AbstractC1415lB K = abstractC1415lB.K();
        if (K == null) {
            AbstractC0868ct.W("Child of " + abstractC1415lB + " cannot be null when calculating alignment line");
            throw null;
        }
        if (abstractC1415lB.P().k().containsKey(abstractC2248xr)) {
            Integer num = (Integer) abstractC1415lB.P().k().get(abstractC2248xr);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int J = K.J(abstractC2248xr);
            if (J != Integer.MIN_VALUE) {
                K.g = true;
                abstractC1415lB.h = true;
                abstractC1415lB.U();
                K.g = false;
                abstractC1415lB.h = false;
                return J + ((int) (abstractC2248xr instanceof AbstractC2248xr ? K.R() & 4294967295L : K.R() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final void e(AbstractCollection abstractCollection, Object obj) {
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    public static final void g(InterfaceC0422Qe interfaceC0422Qe, CancellationException cancellationException) {
        InterfaceC0075Cu interfaceC0075Cu = (InterfaceC0075Cu) interfaceC0422Qe.m().k(C0460Rq.K);
        if (interfaceC0075Cu != null) {
            interfaceC0075Cu.c(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC0422Qe).toString());
        }
    }

    public static final Object h(Object obj, InterfaceC2204x9 interfaceC2204x9) {
        AbstractC1004ey z;
        Class W;
        return (((interfaceC2204x9 instanceof PJ) && AbstractC0306Ls.d((SY) interfaceC2204x9)) || (z = z(interfaceC2204x9)) == null || (W = W(z)) == null) ? obj : E(W, interfaceC2204x9).invoke(obj, null);
    }

    public static final List i(ArrayList arrayList) {
        AbstractC0048Bt.n(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return C1318jk.h;
        }
        if (size == 1) {
            return AbstractC0868ct.J(AbstractC0720ac.n0(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final Object j(InterfaceC2312yp interfaceC2312yp, InterfaceC2235xe interfaceC2235xe) {
        C1102gQ c1102gQ = new C1102gQ(interfaceC2235xe, interfaceC2235xe.getContext());
        return AbstractC0773bP.k(c1102gQ, c1102gQ, interfaceC2312yp);
    }

    public static final G9 k(InterfaceC2204x9 interfaceC2204x9, G9 g9, boolean z) {
        AbstractC1004ey z2;
        AbstractC0048Bt.n(interfaceC2204x9, "descriptor");
        if (!AbstractC0306Ls.a(interfaceC2204x9)) {
            List t0 = interfaceC2204x9.t0();
            AbstractC0048Bt.m(t0, "descriptor.valueParameters");
            if (!t0.isEmpty()) {
                Iterator it = t0.iterator();
                while (it.hasNext()) {
                    AbstractC1004ey c2 = ((RY) it.next()).c();
                    AbstractC0048Bt.m(c2, "it.type");
                    if (AbstractC0306Ls.c(c2)) {
                        break;
                    }
                }
            }
            AbstractC1004ey returnType = interfaceC2204x9.getReturnType();
            if ((returnType == null || !AbstractC0306Ls.c(returnType)) && ((g9 instanceof InterfaceC2071v8) || (z2 = z(interfaceC2204x9)) == null || !AbstractC0306Ls.c(z2))) {
                return g9;
            }
        }
        return new C0255Js(interfaceC2204x9, g9, z);
    }

    public static String l(String str, List list) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) String.valueOf(obj));
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0035, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C0405Pn m(C0405Pn c0405Pn) {
        C0405Pn m;
        int ordinal = c0405Pn.s().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                TC tc = c0405Pn.b;
                if (!tc.m) {
                    throw new IllegalStateException("visitChildren called on an unattached node");
                }
                YD yd = new YD(new TC[16]);
                TC tc2 = tc.f;
                if (tc2 == null) {
                    AbstractC0946e20.c(yd, tc);
                } else {
                    yd.b(tc2);
                }
                while (yd.l()) {
                    TC tc3 = (TC) yd.n(yd.j - 1);
                    if ((tc3.d & 1024) == 0) {
                        AbstractC0946e20.c(yd, tc3);
                    } else {
                        while (true) {
                            if (tc3 == null) {
                                break;
                            }
                            if ((tc3.c & 1024) != 0) {
                                while (tc3 != null) {
                                    if ((tc3 instanceof C0405Pn) && (m = m((C0405Pn) tc3)) != null) {
                                        return m;
                                    }
                                    tc3 = null;
                                }
                            } else {
                                tc3 = tc3.f;
                            }
                        }
                    }
                }
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new C0057Cc();
                }
            }
            return null;
        }
        return c0405Pn;
    }

    public static InterfaceC0948e4 n(InterfaceC1738q4 interfaceC1738q4, C2245xo c2245xo) {
        Object obj;
        AbstractC0048Bt.n(c2245xo, "fqName");
        Iterator it = interfaceC1738q4.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (AbstractC0048Bt.h(((InterfaceC0948e4) obj).e(), c2245xo)) {
                break;
            }
        }
        return (InterfaceC0948e4) obj;
    }

    public static final InterfaceC1245ib o(InterfaceC0761bD interfaceC0761bD, C1639ob c1639ob) {
        AbstractC0048Bt.n(interfaceC0761bD, "<this>");
        AbstractC0048Bt.n(c1639ob, "classId");
        InterfaceC2364zb p = p(interfaceC0761bD, c1639ob);
        if (p instanceof InterfaceC1245ib) {
            return (InterfaceC1245ib) p;
        }
        return null;
    }

    public static final InterfaceC2364zb p(InterfaceC0761bD interfaceC0761bD, C1639ob c1639ob) {
        AbstractC0048Bt.n(interfaceC0761bD, "<this>");
        AbstractC0048Bt.n(c1639ob, "classId");
        if (interfaceC0761bD.q(AbstractC0946e20.f) != null) {
            throw new ClassCastException();
        }
        C2245xo g2 = c1639ob.g();
        AbstractC0048Bt.m(g2, "classId.packageFqName");
        InterfaceC1289jH S = interfaceC0761bD.S(g2);
        List e2 = c1639ob.h().a.e();
        C1531mz c1531mz = ((C1465lz) S).n;
        Object n0 = AbstractC0720ac.n0(e2);
        AbstractC0048Bt.m(n0, "segments.first()");
        DE de = DE.n;
        InterfaceC2364zb g3 = c1531mz.g((C0827cE) n0, de);
        if (g3 != null) {
            for (C0827cE c0827cE : e2.subList(1, e2.size())) {
                if (g3 instanceof InterfaceC1245ib) {
                    WB g0 = ((InterfaceC1245ib) g3).g0();
                    AbstractC0048Bt.m(c0827cE, "name");
                    InterfaceC2364zb g4 = g0.g(c0827cE, de);
                    g3 = g4 instanceof InterfaceC1245ib ? (InterfaceC1245ib) g4 : null;
                    if (g3 != null) {
                    }
                }
            }
            return g3;
        }
        return null;
    }

    public static final InterfaceC1245ib q(InterfaceC0761bD interfaceC0761bD, C1639ob c1639ob, C1334k c1334k) {
        AbstractC0048Bt.n(interfaceC0761bD, "<this>");
        AbstractC0048Bt.n(c1639ob, "classId");
        AbstractC0048Bt.n(c1334k, "notFoundClasses");
        InterfaceC1245ib o2 = o(interfaceC0761bD, c1639ob);
        return o2 != null ? o2 : c1334k.x(c1639ob, PQ.B(PQ.z(PQ.x(c1639ob, C0861cm.j), I2.E)));
    }

    public static long r(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int min = Math.min(i3, 262142);
        int min2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i6 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    throw new IllegalArgumentException(AbstractC1888sN.h(i6, "Can't represent a size of ", " in Constraints"));
                }
                i5 = 8190;
            }
        }
        return AbstractC0868ct.b(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, min, min2);
    }

    public static final C1032fM s(C0405Pn c0405Pn) {
        ME me = c0405Pn.h;
        return me != null ? AbstractC1807r8.F(me).d(me, false) : C1032fM.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x001e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C0405Pn t(C0405Pn c0405Pn) {
        int ordinal;
        TC tc = c0405Pn.b;
        boolean z = tc.m;
        if (z) {
            if (!z) {
                throw new IllegalStateException("visitChildren called on an unattached node");
            }
            YD yd = new YD(new TC[16]);
            TC tc2 = tc.f;
            if (tc2 == null) {
                AbstractC0946e20.c(yd, tc);
            } else {
                yd.b(tc2);
            }
            while (yd.l()) {
                TC tc3 = (TC) yd.n(yd.j - 1);
                if ((tc3.d & 1024) == 0) {
                    AbstractC0946e20.c(yd, tc3);
                } else {
                    while (true) {
                        if (tc3 == null) {
                            break;
                        }
                        if ((tc3.c & 1024) != 0) {
                            while (tc3 != null) {
                                if (tc3 instanceof C0405Pn) {
                                    C0405Pn c0405Pn2 = (C0405Pn) tc3;
                                    if (c0405Pn2.b.m && ((ordinal = c0405Pn2.s().ordinal()) == 0 || ordinal == 1 || ordinal == 2)) {
                                        return c0405Pn2;
                                    }
                                }
                                tc3 = null;
                            }
                        } else {
                            tc3 = tc3.f;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final C2340zD u(BQ bq) {
        C2287yQ a = bq.a();
        C2340zD c2340zD = AbstractC0999et.a;
        C2340zD c2340zD2 = new C2340zD();
        C0027Ay c0027Ay = a.c;
        if (c0027Ay.w() && c0027Ay.v()) {
            C1032fM e2 = a.e();
            v(new Region(Math.round(e2.a), Math.round(e2.b), Math.round(e2.c), Math.round(e2.d)), a, c2340zD2, a, new Region());
        }
        return c2340zD2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void v(Region region, C2287yQ c2287yQ, C2340zD c2340zD, C2287yQ c2287yQ2, Region region2) {
        C1032fM c1032fM;
        C0027Ay c0027Ay;
        List g2;
        InterfaceC0725ah n;
        int i = c2287yQ.g;
        C0027Ay c0027Ay2 = c2287yQ2.c;
        int i2 = c2287yQ2.g;
        boolean z = (c0027Ay2.w() && c0027Ay2.v()) ? false : true;
        if (region.isEmpty() && i2 != i) {
            return;
        }
        if (z && !c2287yQ2.e) {
            return;
        }
        InterfaceC0725ah interfaceC0725ah = c2287yQ2.a;
        C2023uQ c2023uQ = c2287yQ2.d;
        if (c2023uQ.i && (n = AbstractC2219xO.n(c0027Ay2)) != null) {
            interfaceC0725ah = n;
        }
        TC tc = ((TC) interfaceC0725ah).b;
        Object obj = c2023uQ.h.get(C1957tQ.b);
        if (obj == null) {
            obj = null;
        }
        boolean z2 = obj != null;
        if (tc.b.m) {
            if (z2) {
                ME I = AbstractC0946e20.I(tc, 8);
                if (I.h0().m) {
                    InterfaceC1991ty F = AbstractC1807r8.F(I);
                    LD ld = I.x;
                    if (ld == null) {
                        ld = new LD();
                        ld.a = 0.0f;
                        ld.b = 0.0f;
                        ld.c = 0.0f;
                        ld.d = 0.0f;
                        I.x = ld;
                    }
                    long X = I.X(I.g0());
                    ld.a = -ZR.b(X);
                    ld.b = -ZR.a(X);
                    ld.c = ZR.b(X) + I.C();
                    ld.d = ZR.a(X) + ((int) (I.d & 4294967295L));
                    while (I != F) {
                        I.w0(ld, false, true);
                        if (!ld.a()) {
                            I = I.n;
                            AbstractC0048Bt.k(I);
                        }
                    }
                    c1032fM = new C1032fM(ld.a, ld.b, ld.c, ld.d);
                }
            } else {
                ME I2 = AbstractC0946e20.I(tc, 8);
                c1032fM = AbstractC1807r8.F(I2).d(I2, true);
            }
            int round = Math.round(c1032fM.a);
            int round2 = Math.round(c1032fM.b);
            int round3 = Math.round(c1032fM.c);
            int round4 = Math.round(c1032fM.d);
            region2.set(round, round2, round3, round4);
            if (i2 == i) {
                i2 = -1;
            }
            if (region2.op(region, Region.Op.INTERSECT)) {
                if (c2287yQ2.e) {
                    C2287yQ j = c2287yQ2.j();
                    C1032fM e2 = (j == null || (c0027Ay = j.c) == null || !c0027Ay.w()) ? f : j.e();
                    c2340zD.h(i2, new AQ(c2287yQ2, new Rect(Math.round(e2.a), Math.round(e2.b), Math.round(e2.c), Math.round(e2.d))));
                    return;
                } else {
                    if (i2 == -1) {
                        c2340zD.h(i2, new AQ(c2287yQ2, region2.getBounds()));
                        return;
                    }
                    return;
                }
            }
            c2340zD.h(i2, new AQ(c2287yQ2, region2.getBounds()));
            g2 = c2287yQ2.g((r4 & 1) != 0 ? !c2287yQ2.b : false, (r4 & 2) == 0);
            for (int size = g2.size() - 1; -1 < size; size--) {
                v(region, c2287yQ, c2340zD, (C2287yQ) g2.get(size), region2);
            }
            if (H(c2287yQ2)) {
                region.op(round, round2, round3, round4, Region.Op.DIFFERENCE);
                return;
            }
            return;
        }
        c1032fM = C1032fM.e;
        int round5 = Math.round(c1032fM.a);
        int round22 = Math.round(c1032fM.b);
        int round32 = Math.round(c1032fM.c);
        int round42 = Math.round(c1032fM.d);
        region2.set(round5, round22, round32, round42);
        if (i2 == i) {
        }
        if (region2.op(region, Region.Op.INTERSECT)) {
        }
    }

    public static RY w(C0827cE c0827cE, InterfaceC1245ib interfaceC1245ib) {
        if (c0827cE == null) {
            a(19);
            throw null;
        }
        if (interfaceC1245ib == null) {
            a(20);
            throw null;
        }
        Collection E = interfaceC1245ib.E();
        if (E.size() != 1) {
            return null;
        }
        for (RY ry : ((C0981eb) E.iterator().next()).t0()) {
            if (ry.getName().equals(c0827cE)) {
                return ry;
            }
        }
        return null;
    }

    public static final C1639ob x(InterfaceC0893dE interfaceC0893dE, int i) {
        AbstractC0048Bt.n(interfaceC0893dE, "<this>");
        return C1639ob.e(interfaceC0893dE.z0(i), interfaceC0893dE.n0(i));
    }

    public static float y(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0064Cj.b(edgeEffect);
        }
        return 0.0f;
    }

    public static final AbstractC1004ey z(InterfaceC2204x9 interfaceC2204x9) {
        C0261Jy J = interfaceC2204x9.J();
        C0261Jy x = interfaceC2204x9.x();
        if (J != null) {
            return J.c();
        }
        if (x != null) {
            if (interfaceC2204x9 instanceof InterfaceC0629Yd) {
                return x.c();
            }
            InterfaceC1118gg n = interfaceC2204x9.n();
            InterfaceC1245ib interfaceC1245ib = n instanceof InterfaceC1245ib ? (InterfaceC1245ib) n : null;
            if (interfaceC1245ib != null) {
                return interfaceC1245ib.i();
            }
        }
        return null;
    }

    public abstract String f();

    public String toString() {
        switch (this.a) {
            case 22:
                return f();
            default:
                return super.toString();
        }
    }
}
