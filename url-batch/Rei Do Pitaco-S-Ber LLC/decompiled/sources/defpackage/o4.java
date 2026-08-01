package defpackage;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.ActionMode;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;
import android.view.animation.Animation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import androidx.cardview.widget.CardView;
import com.ionia.reidopitaco.libya.MainActivity;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class o4 implements z8, kh, hv {
    public static final int[] i = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public final /* synthetic */ int f;
    public Object g;
    public Object h;

    public o4(EditText editText, int i2) {
        this.f = i2;
        switch (i2) {
            case 12:
                this.g = editText;
                ph phVar = new ph(editText);
                this.h = phVar;
                editText.addTextChangedListener(phVar);
                if (eh.b == null) {
                    synchronized (eh.a) {
                        try {
                            if (eh.b == null) {
                                eh ehVar = new eh();
                                try {
                                    eh.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, eh.class.getClassLoader());
                                } catch (Throwable unused) {
                                }
                                eh.b = ehVar;
                            }
                        } finally {
                        }
                    }
                }
                editText.setEditableFactory(eh.b);
                return;
            default:
                this.g = editText;
                this.h = new j0(editText);
                return;
        }
    }

    public static int w(int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            i4++;
            if (i4 == i3) {
                i5++;
                i4 = 0;
            } else if (i4 > i3) {
                i5++;
                i4 = 1;
            }
        }
        return i4 + 1 > i3 ? i5 + 1 : i5;
    }

    public void A(int i2, int i3) {
        int[] iArr = (int[]) this.g;
        if (iArr == null || i2 >= iArr.length) {
            return;
        }
        int i4 = i2 + i3;
        t(i4);
        int[] iArr2 = (int[]) this.g;
        System.arraycopy(iArr2, i2, iArr2, i4, (iArr2.length - i2) - i3);
        Arrays.fill((int[]) this.g, i2, i4, -1);
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            z20 z20Var = (z20) ((ArrayList) this.h).get(size);
            int i5 = z20Var.f;
            if (i5 >= i2) {
                z20Var.f = i5 + i3;
            }
        }
    }

    public void B(int i2, int i3) {
        int[] iArr = (int[]) this.g;
        if (iArr == null || i2 >= iArr.length) {
            return;
        }
        int i4 = i2 + i3;
        t(i4);
        int[] iArr2 = (int[]) this.g;
        System.arraycopy(iArr2, i4, iArr2, i2, (iArr2.length - i2) - i3);
        int[] iArr3 = (int[]) this.g;
        Arrays.fill(iArr3, iArr3.length - i3, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            z20 z20Var = (z20) ((ArrayList) this.h).get(size);
            int i5 = z20Var.f;
            if (i5 >= i2) {
                if (i5 < i4) {
                    ((ArrayList) this.h).remove(size);
                } else {
                    z20Var.f = i5 - i3;
                }
            }
        }
    }

    public gh C(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        j0 j0Var = (j0) this.h;
        if (inputConnection == null) {
            j0Var.getClass();
            inputConnection2 = null;
        } else {
            o4 o4Var = (o4) j0Var.g;
            o4Var.getClass();
            if (!(inputConnection instanceof gh)) {
                inputConnection = new gh(editorInfo, inputConnection, (EditText) o4Var.g);
            }
            inputConnection2 = inputConnection;
        }
        return (gh) inputConnection2;
    }

    public void D(o1 o1Var) {
        oe oeVar = (oe) this.g;
        ((ActionMode.Callback) oeVar.f).onDestroyActionMode(oeVar.k(o1Var));
        c4 c4Var = (c4) this.h;
        if (c4Var.A != null) {
            c4Var.q.getDecorView().removeCallbacks(c4Var.B);
        }
        if (c4Var.z != null) {
            v80 v80Var = c4Var.C;
            if (v80Var != null) {
                v80Var.b();
            }
            v80 a = f80.a(c4Var.z);
            a.a(0.0f);
            c4Var.C = a;
            a.d(new r3(2, this));
        }
        c4Var.y = null;
        ViewGroup viewGroup = c4Var.E;
        WeakHashMap weakHashMap = f80.a;
        viewGroup.requestApplyInsets();
        c4Var.H();
    }

    public void E(tx txVar, IOException iOException) {
        MainActivity mainActivity = (MainActivity) this.h;
        mainActivity.runOnUiThread(new p1(8, mainActivity));
    }

    public boolean F(o1 o1Var, Menu menu) {
        ViewGroup viewGroup = ((c4) this.h).E;
        WeakHashMap weakHashMap = f80.a;
        viewGroup.requestApplyInsets();
        oe oeVar = (oe) this.g;
        ActionMode.Callback callback = (ActionMode.Callback) oeVar.f;
        x30 k = oeVar.k(o1Var);
        e20 e20Var = (e20) oeVar.i;
        Menu menu2 = (Menu) e20Var.get(menu);
        if (menu2 == null) {
            menu2 = new mt((Context) oeVar.g, (ss) menu);
            e20Var.put(menu, menu2);
        }
        return callback.onPrepareActionMode(k, menu2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void G(tx txVar, zz zzVar) {
        String str;
        Charset charset;
        String str2;
        final String q = MainActivity.q(new byte[]{116, 58, 113, 62, 102, 39, 112, 123, 103, 48, 117});
        final String q2 = MainActivity.q(new byte[]{33, 38, 119, 52, 119, 32, 112, 119, 57, 119, 108, 62, 33});
        final String str3 = ((xn) zzVar.f.b).h;
        b00 b00Var = zzVar.l;
        if (b00Var != null) {
            o8 o = b00Var.o();
            try {
                os n = b00Var.n();
                if (n != null) {
                    charset = r9.a;
                    String[] strArr = n.b;
                    int i2 = 0;
                    int r = oo.r(0, strArr.length - 1, 2);
                    if (r >= 0) {
                        while (!u30.i0(strArr[i2], "charset")) {
                            if (i2 != r) {
                                i2 += 2;
                            }
                        }
                        str2 = strArr[i2 + 1];
                        if (str2 != null) {
                            try {
                                charset = Charset.forName(str2);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                    }
                    str2 = null;
                    if (str2 != null) {
                    }
                }
                charset = r9.a;
                str = o.l(z60.p(o, charset));
                o.close();
            } finally {
            }
        } else {
            str = "";
        }
        final String str4 = str;
        final MainActivity mainActivity = (MainActivity) this.h;
        mainActivity.runOnUiThread(new Runnable() { // from class: uq
            @Override // java.lang.Runnable
            public final void run() {
                String str5 = str3;
                boolean n0 = m30.n0(str5, q);
                MainActivity mainActivity2 = mainActivity;
                if (n0) {
                    if (m30.n0(str4, q2)) {
                        int i3 = MainActivity.L;
                        mainActivity2.r();
                        return;
                    } else {
                        int i4 = MainActivity.L;
                        mainActivity2.r();
                        return;
                    }
                }
                SharedPreferences sharedPreferences = mainActivity2.J;
                if (sharedPreferences == null) {
                    oo.P("prefs");
                    throw null;
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.getClass();
                edit.putString((String) this.g, str5);
                edit.apply();
                mainActivity2.G = str5;
                mainActivity2.s(str5);
            }
        });
    }

    public void H(oj ojVar) {
        pz pzVar = (pz) this.h;
        uv uvVar = (uv) this.g;
        int i2 = ojVar.b;
        if (i2 == 0) {
            pzVar.execute(new g1(uvVar, ojVar.a, 4));
        } else {
            pzVar.execute(new w8(i2, 0, uvVar));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0209, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0109 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TryCatch #2 {IOException -> 0x0091, XmlPullParserException -> 0x0094, blocks: (B:19:0x0062, B:28:0x0209, B:29:0x0074, B:30:0x0082, B:33:0x0087, B:41:0x0097, B:44:0x00b1, B:47:0x00a0, B:51:0x00a9, B:54:0x00bf, B:57:0x00ce, B:59:0x00d6, B:62:0x00e0, B:66:0x0109, B:69:0x0110, B:70:0x0128, B:72:0x00e9, B:74:0x00f1, B:77:0x00ff, B:80:0x0129, B:82:0x0131, B:85:0x013f, B:88:0x0149, B:91:0x0154, B:92:0x016c, B:94:0x016d, B:97:0x0177, B:100:0x0182, B:101:0x019a, B:103:0x019b, B:105:0x01a3, B:108:0x01ac, B:111:0x01b6, B:114:0x01c0, B:115:0x01d8, B:117:0x01d9, B:120:0x01e3, B:123:0x01ed, B:124:0x0205, B:127:0x0206), top: B:18:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0110 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void I(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        nc ncVar;
        sc scVar = new sc();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = xmlResourceParser.getAttributeName(i2);
            String attributeValue = xmlResourceParser.getAttributeValue(i2);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    ncVar = null;
                } catch (IOException e) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e);
                } catch (XmlPullParserException e2) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e2);
                }
                while (eventType != 1) {
                    if (eventType == 0) {
                        xmlResourceParser.getName();
                    } else if (eventType == 2) {
                        String name = xmlResourceParser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (name.equals("Layout")) {
                                    if (ncVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    ncVar.d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    if (ncVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    ncVar.c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1962203927:
                                if (name.equals("ConstraintOverride")) {
                                    ncVar = sc.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                } else {
                                    break;
                                }
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    if (ncVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    ncVar.b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    if (ncVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    ncVar.e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    ncVar = sc.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    ncVar.d.a = true;
                                    break;
                                } else {
                                    break;
                                }
                            case 366511058:
                                if (!name.equals("CustomMethod")) {
                                    continue;
                                }
                                if (ncVar != null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                fc.a(context, xmlResourceParser, ncVar.f);
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    ncVar = sc.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    ncVar.d.h0 = 1;
                                    break;
                                } else {
                                    break;
                                }
                            case 1791837707:
                                if (!name.equals("CustomAttribute")) {
                                    continue;
                                } else if (ncVar != null) {
                                }
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    ncVar = sc.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (eventType == 3) {
                        String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                        switch (lowerCase.hashCode()) {
                            case -2075718416:
                                if (!lowerCase.equals("guideline")) {
                                    break;
                                }
                                scVar.c.put(Integer.valueOf(ncVar.a), ncVar);
                                ncVar = null;
                                break;
                            case -190376483:
                                if (lowerCase.equals("constraint")) {
                                    scVar.c.put(Integer.valueOf(ncVar.a), ncVar);
                                    ncVar = null;
                                    break;
                                } else {
                                    break;
                                }
                            case 426575017:
                                if (lowerCase.equals("constraintoverride")) {
                                    scVar.c.put(Integer.valueOf(ncVar.a), ncVar);
                                    ncVar = null;
                                    break;
                                } else {
                                    break;
                                }
                            case 2146106725:
                                if (lowerCase.equals("constraintset")) {
                                    ((SparseArray) this.h).put(identifier, scVar);
                                    return;
                                }
                                break;
                        }
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.h).put(identifier, scVar);
                return;
            }
        }
    }

    public av J(dz dzVar, int i2) {
        n80 n80Var;
        av avVar;
        e20 e20Var = (e20) this.g;
        int d = e20Var.d(dzVar);
        if (d >= 0 && (n80Var = (n80) e20Var.i(d)) != null) {
            int i3 = n80Var.a;
            if ((i3 & i2) != 0) {
                int i4 = i3 & (~i2);
                n80Var.a = i4;
                if (i2 == 4) {
                    avVar = n80Var.b;
                } else if (i2 == 8) {
                    avVar = n80Var.c;
                } else {
                    l8.l("Must provide flag PRE or POST");
                }
                if ((i4 & 12) == 0) {
                    e20Var.g(d);
                    n80Var.a = 0;
                    n80Var.b = null;
                    n80Var.c = null;
                    n80.d.c(n80Var);
                }
                return avVar;
            }
        }
        return null;
    }

    public void K(dz dzVar) {
        n80 n80Var = (n80) ((e20) this.g).get(dzVar);
        if (n80Var == null) {
            return;
        }
        n80Var.a &= -2;
    }

    public void L(dz dzVar) {
        rq rqVar = (rq) this.h;
        int e = rqVar.e() - 1;
        while (true) {
            if (e < 0) {
                break;
            }
            if (dzVar == rqVar.f(e)) {
                Object[] objArr = rqVar.h;
                Object obj = objArr[e];
                Object obj2 = g8.c;
                if (obj != obj2) {
                    objArr[e] = obj2;
                    rqVar.f = true;
                }
            } else {
                e--;
            }
        }
        n80 n80Var = (n80) ((e20) this.g).remove(dzVar);
        if (n80Var != null) {
            n80Var.a = 0;
            n80Var.b = null;
            n80Var.c = null;
            n80.d.c(n80Var);
        }
    }

    public void M(boolean z) {
        ph phVar = (ph) ((o4) ((j0) this.h).g).h;
        if (phVar.h != z) {
            if (phVar.g != null) {
                ah a = ah.a();
                oh ohVar = phVar.g;
                a.getClass();
                g8.p(ohVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a.b.remove(ohVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            phVar.h = z;
            if (z) {
                ph.a(phVar.f, ah.a().b());
            }
        }
    }

    public void N(int i2, int i3, int i4, int i5) {
        CardView cardView = (CardView) this.h;
        cardView.i.set(i2, i3, i4, i5);
        Rect rect = cardView.h;
        super/*android.view.View*/.setPadding(i2 + rect.left, i3 + rect.top, i4 + rect.right, i5 + rect.bottom);
    }

    public Drawable O(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.h) == null) {
                this.h = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            int id = layerDrawable.getId(i2);
            drawableArr[i2] = O(layerDrawable.getDrawable(i2), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i3 = 0; i3 < numberOfLayers; i3++) {
            layerDrawable2.setId(i3, layerDrawable.getId(i3));
            layerDrawable2.setLayerGravity(i3, layerDrawable.getLayerGravity(i3));
            layerDrawable2.setLayerWidth(i3, layerDrawable.getLayerWidth(i3));
            layerDrawable2.setLayerHeight(i3, layerDrawable.getLayerHeight(i3));
            layerDrawable2.setLayerInsetLeft(i3, layerDrawable.getLayerInsetLeft(i3));
            layerDrawable2.setLayerInsetRight(i3, layerDrawable.getLayerInsetRight(i3));
            layerDrawable2.setLayerInsetTop(i3, layerDrawable.getLayerInsetTop(i3));
            layerDrawable2.setLayerInsetBottom(i3, layerDrawable.getLayerInsetBottom(i3));
            layerDrawable2.setLayerInsetStart(i3, layerDrawable.getLayerInsetStart(i3));
            layerDrawable2.setLayerInsetEnd(i3, layerDrawable.getLayerInsetEnd(i3));
        }
        return layerDrawable2;
    }

    public void P() {
        Object parcelable;
        Integer num;
        nb nbVar = (nb) this.g;
        String str = (String) this.h;
        Bundle bundle = nbVar.g;
        LinkedHashMap linkedHashMap = nbVar.f;
        if (!nbVar.d.contains(str) && (num = (Integer) nbVar.b.remove(str)) != null) {
            nbVar.a.remove(num);
        }
        nbVar.e.remove(str);
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        if (bundle.containsKey(str)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = f0.b(bundle, str);
            } else {
                parcelable = bundle.getParcelable(str);
                if (!t1.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((t1) parcelable));
            bundle.remove(str);
        }
        if (nbVar.c.get(str) == null) {
            return;
        }
        l8.c();
    }

    public void a(dz dzVar, av avVar) {
        e20 e20Var = (e20) this.g;
        n80 n80Var = (n80) e20Var.get(dzVar);
        if (n80Var == null) {
            n80Var = n80.a();
            e20Var.put(dzVar, n80Var);
        }
        n80Var.c = avVar;
        n80Var.a |= 8;
    }

    @Override // defpackage.kh
    public Object b() {
        return (w60) this.g;
    }

    public void c() {
        int[] iArr = (int[]) this.g;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.h = null;
    }

    public void d(boolean z) {
        dk dkVar = ((sk) this.h).v;
        if (dkVar != null) {
            dkVar.j().l.d(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void e(boolean z) {
        sk skVar = (sk) this.h;
        b3 b3Var = skVar.t.v;
        dk dkVar = skVar.v;
        if (dkVar != null) {
            dkVar.j().l.e(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void f(boolean z) {
        dk dkVar = ((sk) this.h).v;
        if (dkVar != null) {
            dkVar.j().l.f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void g(boolean z) {
        dk dkVar = ((sk) this.h).v;
        if (dkVar != null) {
            dkVar.j().l.g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void h(boolean z) {
        dk dkVar = ((sk) this.h).v;
        if (dkVar != null) {
            dkVar.j().l.h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void i(boolean z) {
        dk dkVar = ((sk) this.h).v;
        if (dkVar != null) {
            dkVar.j().l.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void j(boolean z) {
        sk skVar = (sk) this.h;
        b3 b3Var = skVar.t.v;
        dk dkVar = skVar.v;
        if (dkVar != null) {
            dkVar.j().l.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // defpackage.hv
    public db0 k(View view, db0 db0Var) {
        d90 d90Var = (d90) this.g;
        e90 e90Var = (e90) this.h;
        e90 e90Var2 = new e90();
        e90Var2.a = e90Var.a;
        e90Var2.b = e90Var.b;
        e90Var2.c = e90Var.c;
        e90Var2.d = e90Var.d;
        return d90Var.e(view, db0Var, e90Var2);
    }

    public void l(boolean z) {
        dk dkVar = ((sk) this.h).v;
        if (dkVar != null) {
            dkVar.j().l.l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void m(boolean z) {
        dk dkVar = ((sk) this.h).v;
        if (dkVar != null) {
            dkVar.j().l.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void n(boolean z) {
        dk dkVar = ((sk) this.h).v;
        if (dkVar != null) {
            dkVar.j().l.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // defpackage.kh
    public boolean o(CharSequence charSequence, int i2, int i3, t60 t60Var) {
        if ((t60Var.c & 4) > 0) {
            return true;
        }
        if (((w60) this.g) == null) {
            this.g = new w60(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((tg) this.h).getClass();
        ((w60) this.g).setSpan(new u60(t60Var), i2, i3, 33);
        return true;
    }

    @Override // defpackage.z8
    public void onCancel() {
        ((Animator) this.g).end();
        if (sk.G(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((u20) this.h) + " has been canceled.");
        }
    }

    public void p(boolean z) {
        dk dkVar = ((sk) this.h).v;
        if (dkVar != null) {
            dkVar.j().l.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void q(boolean z) {
        dk dkVar = ((sk) this.h).v;
        if (dkVar != null) {
            dkVar.j().l.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void r(boolean z) {
        dk dkVar = ((sk) this.h).v;
        if (dkVar != null) {
            dkVar.j().l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void s(boolean z) {
        dk dkVar = ((sk) this.h).v;
        if (dkVar != null) {
            dkVar.j().l.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.g).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l8.c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void t(int i2) {
        int[] iArr = (int[]) this.g;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i2, 10) + 1];
            this.g = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i2 >= iArr.length) {
            int length = iArr.length;
            while (length <= i2) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.g = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.g;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public String toString() {
        switch (this.f) {
            case 20:
                String str = "[ ";
                if (((o20) this.g) != null) {
                    for (int i2 = 0; i2 < 9; i2++) {
                        str = str + ((o20) this.g).m[i2] + " ";
                    }
                }
                return str + "] " + ((o20) this.g);
            case 26:
                return "Bounds{lower=" + ((io) this.g) + " upper=" + ((io) this.h) + "}";
            default:
                return super.toString();
        }
    }

    public View u(int i2, int i3, int i4, int i5) {
        View u;
        r70 r70Var = (r70) this.h;
        ly lyVar = (ly) this.g;
        int d = lyVar.d();
        int c = lyVar.c();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            switch (lyVar.a) {
                case 0:
                    u = lyVar.b.u(i2);
                    break;
                default:
                    u = lyVar.b.u(i2);
                    break;
            }
            int b = lyVar.b(u);
            int a = lyVar.a(u);
            r70Var.b = d;
            r70Var.c = c;
            r70Var.d = b;
            r70Var.e = a;
            if (i4 != 0) {
                r70Var.a = i4;
                if (r70Var.a()) {
                    return u;
                }
            }
            if (i5 != 0) {
                r70Var.a = i5;
                if (r70Var.a()) {
                    view = u;
                }
            }
            i2 += i6;
        }
        return view;
    }

    public KeyListener v(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((o4) ((j0) this.h).g).getClass();
        if (keyListener instanceof jh) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new jh(keyListener);
    }

    public void x() {
        ((SparseIntArray) this.g).clear();
    }

    public boolean y(View view) {
        r70 r70Var = (r70) this.h;
        ly lyVar = (ly) this.g;
        int d = lyVar.d();
        int c = lyVar.c();
        int b = lyVar.b(view);
        int a = lyVar.a(view);
        r70Var.b = d;
        r70Var.c = c;
        r70Var.d = b;
        r70Var.e = a;
        r70Var.a = 24579;
        return r70Var.a();
    }

    public void z(AttributeSet attributeSet, int i2) {
        switch (this.f) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.g;
                y5 l = y5.l(i2, 0, absSeekBar.getContext(), attributeSet, i);
                Drawable g = l.g(0);
                if (g != null) {
                    if (g instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) g;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i3 = 0; i3 < numberOfFrames; i3++) {
                            Drawable O = O(animationDrawable.getFrame(i3), true);
                            O.setLevel(10000);
                            animationDrawable2.addFrame(O, animationDrawable.getDuration(i3));
                        }
                        animationDrawable2.setLevel(10000);
                        g = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(g);
                }
                Drawable g2 = l.g(1);
                if (g2 != null) {
                    absSeekBar.setProgressDrawable(O(g2, false));
                }
                l.n();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.g).getContext().obtainStyledAttributes(attributeSet, kx.i, i2, 0);
                try {
                    boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    M(z);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public /* synthetic */ o4(int i2, boolean z) {
        this.f = i2;
    }

    public /* synthetic */ o4(LayoutInflater.Factory2 factory2, Object obj, int i2) {
        this.f = i2;
        this.h = factory2;
        this.g = obj;
    }

    public /* synthetic */ o4(Object obj, Object obj2, int i2) {
        this.f = i2;
        this.g = obj;
        this.h = obj2;
    }

    public o4(AbsSeekBar absSeekBar) {
        this.f = 0;
        this.g = absSeekBar;
    }

    public /* synthetic */ o4(int i2, Object obj) {
        this.f = i2;
        this.h = obj;
    }

    public o4(sk skVar) {
        this.f = 16;
        this.g = new CopyOnWriteArrayList();
        this.h = skVar;
    }

    public o4(ly lyVar) {
        this.f = 23;
        this.g = lyVar;
        r70 r70Var = new r70();
        r70Var.a = 0;
        this.h = r70Var;
    }

    public o4(Animation animation) {
        this.f = 15;
        this.g = animation;
        this.h = null;
    }

    public o4(Animator animator) {
        this.f = 15;
        this.g = null;
        this.h = animator;
    }

    public o4(ArrayList arrayList, ArrayList arrayList2) {
        this.f = 17;
        int size = arrayList.size();
        this.g = new int[size];
        this.h = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            ((int[]) this.g)[i2] = ((Integer) arrayList.get(i2)).intValue();
            ((float[]) this.h)[i2] = ((Float) arrayList2.get(i2)).floatValue();
        }
    }

    public o4(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.f = 26;
        lowerBound = bounds.getLowerBound();
        this.g = io.d(lowerBound);
        upperBound = bounds.getUpperBound();
        this.h = io.d(upperBound);
    }

    public o4(int i2, int i3) {
        this.f = 17;
        this.g = new int[]{i2, i3};
        this.h = new float[]{0.0f, 1.0f};
    }

    public o4(int i2) {
        this.f = i2;
        switch (i2) {
            case 18:
                this.g = new SparseIntArray();
                this.h = new SparseIntArray();
                break;
            case 24:
                this.g = new e20(0);
                this.h = new rq();
                break;
            default:
                this.g = Choreographer.getInstance();
                this.h = Looper.myLooper();
                break;
        }
    }

    public o4(int i2, int i3, int i4) {
        this.f = 17;
        this.g = new int[]{i2, i3, i4};
        this.h = new float[]{0.0f, 0.5f, 1.0f};
    }
}
