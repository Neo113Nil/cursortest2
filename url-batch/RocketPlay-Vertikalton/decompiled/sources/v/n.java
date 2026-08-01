package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import q.AbstractC0332e;
import r.AbstractC0360a;
import s.C0361a;
import u.AbstractC0372a;

/* loaded from: classes.dex */
public final class n {
    public static final int[] d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f4395e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f4396f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4397a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4398b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4399c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4395e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f4396f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(C0374a c0374a, String str) {
        int i;
        String[] split = str.split(",");
        Context context = c0374a.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            Object obj = null;
            try {
                i = q.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && c0374a.isInEditMode() && (c0374a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c0374a.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f1796m;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f1796m.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Integer) obj).intValue();
                }
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0088. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:128:0x0600. Please report as an issue. */
    public static i d(Context context, AttributeSet attributeSet, boolean z2) {
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        int i3;
        i iVar = new i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2 ? r.f4403c : r.f4401a);
        int[] iArr = d;
        SparseIntArray sparseIntArray = f4395e;
        l lVar = iVar.f4307b;
        String[] strArr = AbstractC0360a.f3926a;
        m mVar = iVar.f4309e;
        k kVar = iVar.f4308c;
        j jVar = iVar.d;
        String str5 = "Unknown attribute 0x";
        String str6 = "ConstraintSet";
        if (z2) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            h hVar = new h();
            hVar.f4297a = new int[10];
            hVar.f4298b = new int[10];
            hVar.f4299c = 0;
            hVar.d = new int[10];
            hVar.f4300e = new float[10];
            hVar.f4301f = 0;
            hVar.f4302g = new int[5];
            hVar.h = new String[5];
            hVar.i = 0;
            hVar.f4303j = new int[4];
            hVar.f4304k = new boolean[4];
            hVar.f4305l = 0;
            kVar.getClass();
            jVar.getClass();
            mVar.getClass();
            int i4 = 0;
            while (i4 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i4);
                int i5 = indexCount;
                switch (f4396f.get(index)) {
                    case 2:
                        str4 = str5;
                        hVar.b(2, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4319I));
                        i3 = 1;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder(str5);
                        str4 = str5;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        i3 = 1;
                        break;
                    case 5:
                        str4 = str5;
                        hVar.d(obtainStyledAttributes.getString(index), 5);
                        i3 = 1;
                        break;
                    case 6:
                        str4 = str5;
                        hVar.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f4314C));
                        i3 = 1;
                        break;
                    case 7:
                        str4 = str5;
                        hVar.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f4315D));
                        i3 = 1;
                        break;
                    case 8:
                        str4 = str5;
                        hVar.b(8, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4320J));
                        i3 = 1;
                        break;
                    case 11:
                        str4 = str5;
                        hVar.b(11, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4326P));
                        i3 = 1;
                        break;
                    case 12:
                        str4 = str5;
                        hVar.b(12, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4327Q));
                        i3 = 1;
                        break;
                    case 13:
                        str4 = str5;
                        hVar.b(13, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4323M));
                        i3 = 1;
                        break;
                    case 14:
                        str4 = str5;
                        hVar.b(14, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4325O));
                        i3 = 1;
                        break;
                    case 15:
                        str4 = str5;
                        hVar.b(15, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4328R));
                        i3 = 1;
                        break;
                    case 16:
                        str4 = str5;
                        hVar.b(16, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4324N));
                        i3 = 1;
                        break;
                    case 17:
                        str4 = str5;
                        hVar.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.d));
                        i3 = 1;
                        break;
                    case 18:
                        str4 = str5;
                        hVar.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f4344e));
                        i3 = 1;
                        break;
                    case 19:
                        str4 = str5;
                        hVar.a(19, obtainStyledAttributes.getFloat(index, jVar.f4346f));
                        i3 = 1;
                        break;
                    case 20:
                        str4 = str5;
                        hVar.a(20, obtainStyledAttributes.getFloat(index, jVar.f4370w));
                        i3 = 1;
                        break;
                    case 21:
                        str4 = str5;
                        hVar.b(21, obtainStyledAttributes.getLayoutDimension(index, jVar.f4341c));
                        i3 = 1;
                        break;
                    case 22:
                        str4 = str5;
                        hVar.b(22, iArr[obtainStyledAttributes.getInt(index, lVar.f4381a)]);
                        i3 = 1;
                        break;
                    case 23:
                        str4 = str5;
                        hVar.b(23, obtainStyledAttributes.getLayoutDimension(index, jVar.f4339b));
                        i3 = 1;
                        break;
                    case 24:
                        str4 = str5;
                        hVar.b(24, obtainStyledAttributes.getDimensionPixelSize(index, jVar.F));
                        i3 = 1;
                        break;
                    case 27:
                        str4 = str5;
                        hVar.b(27, obtainStyledAttributes.getInt(index, jVar.f4316E));
                        i3 = 1;
                        break;
                    case 28:
                        str4 = str5;
                        hVar.b(28, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4317G));
                        i3 = 1;
                        break;
                    case 31:
                        str4 = str5;
                        hVar.b(31, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4321K));
                        i3 = 1;
                        break;
                    case 34:
                        str4 = str5;
                        hVar.b(34, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4318H));
                        i3 = 1;
                        break;
                    case 37:
                        str4 = str5;
                        hVar.a(37, obtainStyledAttributes.getFloat(index, jVar.f4371x));
                        i3 = 1;
                        break;
                    case 38:
                        str4 = str5;
                        int resourceId = obtainStyledAttributes.getResourceId(index, iVar.f4306a);
                        iVar.f4306a = resourceId;
                        hVar.b(38, resourceId);
                        i3 = 1;
                        break;
                    case 39:
                        str4 = str5;
                        hVar.a(39, obtainStyledAttributes.getFloat(index, jVar.f4331U));
                        i3 = 1;
                        break;
                    case 40:
                        str4 = str5;
                        hVar.a(40, obtainStyledAttributes.getFloat(index, jVar.f4330T));
                        i3 = 1;
                        break;
                    case 41:
                        str4 = str5;
                        hVar.b(41, obtainStyledAttributes.getInt(index, jVar.f4332V));
                        i3 = 1;
                        break;
                    case 42:
                        str4 = str5;
                        hVar.b(42, obtainStyledAttributes.getInt(index, jVar.f4333W));
                        i3 = 1;
                        break;
                    case 43:
                        str4 = str5;
                        hVar.a(43, obtainStyledAttributes.getFloat(index, lVar.f4383c));
                        i3 = 1;
                        break;
                    case 44:
                        str4 = str5;
                        hVar.c(44, true);
                        hVar.a(44, obtainStyledAttributes.getDimension(index, mVar.f4394m));
                        i3 = 1;
                        break;
                    case 45:
                        str4 = str5;
                        hVar.a(45, obtainStyledAttributes.getFloat(index, mVar.f4386b));
                        i3 = 1;
                        break;
                    case 46:
                        str4 = str5;
                        hVar.a(46, obtainStyledAttributes.getFloat(index, mVar.f4387c));
                        i3 = 1;
                        break;
                    case 47:
                        str4 = str5;
                        hVar.a(47, obtainStyledAttributes.getFloat(index, mVar.d));
                        i3 = 1;
                        break;
                    case 48:
                        str4 = str5;
                        hVar.a(48, obtainStyledAttributes.getFloat(index, mVar.f4388e));
                        i3 = 1;
                        break;
                    case 49:
                        str4 = str5;
                        hVar.a(49, obtainStyledAttributes.getDimension(index, mVar.f4389f));
                        i3 = 1;
                        break;
                    case 50:
                        str4 = str5;
                        hVar.a(50, obtainStyledAttributes.getDimension(index, mVar.f4390g));
                        i3 = 1;
                        break;
                    case 51:
                        str4 = str5;
                        hVar.a(51, obtainStyledAttributes.getDimension(index, mVar.i));
                        i3 = 1;
                        break;
                    case 52:
                        str4 = str5;
                        hVar.a(52, obtainStyledAttributes.getDimension(index, mVar.f4391j));
                        i3 = 1;
                        break;
                    case 53:
                        str4 = str5;
                        hVar.a(53, obtainStyledAttributes.getDimension(index, mVar.f4392k));
                        i3 = 1;
                        break;
                    case 54:
                        str4 = str5;
                        hVar.b(54, obtainStyledAttributes.getInt(index, jVar.f4334X));
                        i3 = 1;
                        break;
                    case 55:
                        str4 = str5;
                        hVar.b(55, obtainStyledAttributes.getInt(index, jVar.f4335Y));
                        i3 = 1;
                        break;
                    case 56:
                        str4 = str5;
                        hVar.b(56, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4336Z));
                        i3 = 1;
                        break;
                    case 57:
                        str4 = str5;
                        hVar.b(57, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4338a0));
                        i3 = 1;
                        break;
                    case 58:
                        str4 = str5;
                        hVar.b(58, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4340b0));
                        i3 = 1;
                        break;
                    case 59:
                        str4 = str5;
                        hVar.b(59, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4342c0));
                        i3 = 1;
                        break;
                    case 60:
                        str4 = str5;
                        hVar.a(60, obtainStyledAttributes.getFloat(index, mVar.f4385a));
                        i3 = 1;
                        break;
                    case 62:
                        str4 = str5;
                        hVar.b(62, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4312A));
                        i3 = 1;
                        break;
                    case 63:
                        str4 = str5;
                        hVar.a(63, obtainStyledAttributes.getFloat(index, jVar.f4313B));
                        i3 = 1;
                        break;
                    case 64:
                        str4 = str5;
                        hVar.b(64, f(obtainStyledAttributes, index, kVar.f4375a));
                        i3 = 1;
                        break;
                    case 65:
                        str4 = str5;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            hVar.d(obtainStyledAttributes.getString(index), 65);
                        } else {
                            hVar.d(strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                        }
                        i3 = 1;
                        break;
                    case 66:
                        str4 = str5;
                        hVar.b(66, obtainStyledAttributes.getInt(index, 0));
                        i3 = 1;
                        break;
                    case 67:
                        str4 = str5;
                        hVar.a(67, obtainStyledAttributes.getFloat(index, kVar.f4378e));
                        i3 = 1;
                        break;
                    case 68:
                        str4 = str5;
                        hVar.a(68, obtainStyledAttributes.getFloat(index, lVar.d));
                        i3 = 1;
                        break;
                    case 69:
                        str4 = str5;
                        hVar.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 70:
                        str4 = str5;
                        hVar.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        i3 = 1;
                        break;
                    case 71:
                        str4 = str5;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        i3 = 1;
                        break;
                    case 72:
                        str4 = str5;
                        hVar.b(72, obtainStyledAttributes.getInt(index, jVar.f4347f0));
                        i3 = 1;
                        break;
                    case 73:
                        str4 = str5;
                        hVar.b(73, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4349g0));
                        i3 = 1;
                        break;
                    case 74:
                        str4 = str5;
                        hVar.d(obtainStyledAttributes.getString(index), 74);
                        i3 = 1;
                        break;
                    case 75:
                        str4 = str5;
                        hVar.c(75, obtainStyledAttributes.getBoolean(index, jVar.n0));
                        i3 = 1;
                        break;
                    case 76:
                        str4 = str5;
                        hVar.b(76, obtainStyledAttributes.getInt(index, kVar.f4377c));
                        i3 = 1;
                        break;
                    case 77:
                        str4 = str5;
                        hVar.d(obtainStyledAttributes.getString(index), 77);
                        i3 = 1;
                        break;
                    case 78:
                        str4 = str5;
                        hVar.b(78, obtainStyledAttributes.getInt(index, lVar.f4382b));
                        i3 = 1;
                        break;
                    case 79:
                        str4 = str5;
                        hVar.a(79, obtainStyledAttributes.getFloat(index, kVar.d));
                        i3 = 1;
                        break;
                    case 80:
                        str4 = str5;
                        hVar.c(80, obtainStyledAttributes.getBoolean(index, jVar.f4357l0));
                        i3 = 1;
                        break;
                    case 81:
                        str4 = str5;
                        hVar.c(81, obtainStyledAttributes.getBoolean(index, jVar.f4359m0));
                        i3 = 1;
                        break;
                    case 82:
                        str4 = str5;
                        hVar.b(82, obtainStyledAttributes.getInteger(index, kVar.f4376b));
                        i3 = 1;
                        break;
                    case 83:
                        str4 = str5;
                        hVar.b(83, f(obtainStyledAttributes, index, mVar.h));
                        i3 = 1;
                        break;
                    case 84:
                        str4 = str5;
                        hVar.b(84, obtainStyledAttributes.getInteger(index, kVar.f4380g));
                        i3 = 1;
                        break;
                    case 85:
                        str4 = str5;
                        hVar.a(85, obtainStyledAttributes.getFloat(index, kVar.f4379f));
                        i3 = 1;
                        break;
                    case 86:
                        str4 = str5;
                        int i6 = obtainStyledAttributes.peekValue(index).type;
                        if (i6 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            kVar.i = resourceId2;
                            hVar.b(89, resourceId2);
                            if (kVar.i != -1) {
                                hVar.b(88, -2);
                            }
                        } else if (i6 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            kVar.h = string;
                            hVar.d(string, 90);
                            if (kVar.h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                kVar.i = resourceId3;
                                hVar.b(89, resourceId3);
                                hVar.b(88, -2);
                            } else {
                                hVar.b(88, -1);
                            }
                        } else {
                            hVar.b(88, obtainStyledAttributes.getInteger(index, kVar.i));
                        }
                        i3 = 1;
                        break;
                    case 87:
                        str4 = str5;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        i3 = 1;
                        break;
                    case 93:
                        str4 = str5;
                        hVar.b(93, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4322L));
                        i3 = 1;
                        break;
                    case 94:
                        str4 = str5;
                        hVar.b(94, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f4329S));
                        i3 = 1;
                        break;
                    case 95:
                        str4 = str5;
                        g(hVar, obtainStyledAttributes, index, 0);
                        i3 = 1;
                        break;
                    case 96:
                        str4 = str5;
                        i3 = 1;
                        g(hVar, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        str4 = str5;
                        hVar.b(97, obtainStyledAttributes.getInt(index, jVar.f4362o0));
                        i3 = 1;
                        break;
                    case 98:
                        str4 = str5;
                        int i7 = AbstractC0372a.f4172s;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                        } else {
                            iVar.f4306a = obtainStyledAttributes.getResourceId(index, iVar.f4306a);
                        }
                        i3 = 1;
                        break;
                    case 99:
                        str4 = str5;
                        hVar.c(99, obtainStyledAttributes.getBoolean(index, jVar.f4348g));
                        i3 = 1;
                        break;
                }
                i4 += i3;
                indexCount = i5;
                str5 = str4;
            }
        } else {
            String str7 = "CURRENTLY UNSUPPORTED";
            String str8 = "Unknown attribute 0x";
            int i8 = 1;
            int indexCount2 = obtainStyledAttributes.getIndexCount();
            int i9 = 0;
            while (i9 < indexCount2) {
                int index2 = obtainStyledAttributes.getIndex(i9);
                if (index2 != i8 && 23 != index2 && 24 != index2) {
                    kVar.getClass();
                    jVar.getClass();
                    mVar.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4363p = f(obtainStyledAttributes, index2, jVar.f4363p);
                        i2 = 1;
                        break;
                    case 2:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4319I = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4319I);
                        i2 = 1;
                        break;
                    case 3:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4361o = f(obtainStyledAttributes, index2, jVar.f4361o);
                        i2 = 1;
                        break;
                    case 4:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4360n = f(obtainStyledAttributes, index2, jVar.f4360n);
                        i2 = 1;
                        break;
                    case 5:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4372y = obtainStyledAttributes.getString(index2);
                        i2 = 1;
                        break;
                    case 6:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4314C = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f4314C);
                        i2 = 1;
                        break;
                    case 7:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4315D = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f4315D);
                        i2 = 1;
                        break;
                    case 8:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4320J = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4320J);
                        i2 = 1;
                        break;
                    case 9:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4369v = f(obtainStyledAttributes, index2, jVar.f4369v);
                        i2 = 1;
                        break;
                    case 10:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4368u = f(obtainStyledAttributes, index2, jVar.f4368u);
                        i2 = 1;
                        break;
                    case 11:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4326P = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4326P);
                        i2 = 1;
                        break;
                    case 12:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4327Q = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4327Q);
                        i2 = 1;
                        break;
                    case 13:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4323M = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4323M);
                        i2 = 1;
                        break;
                    case 14:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4325O = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4325O);
                        i2 = 1;
                        break;
                    case 15:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4328R = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4328R);
                        i2 = 1;
                        break;
                    case 16:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4324N = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4324N);
                        i2 = 1;
                        break;
                    case 17:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.d = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.d);
                        i2 = 1;
                        break;
                    case 18:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4344e = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f4344e);
                        i2 = 1;
                        break;
                    case 19:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4346f = obtainStyledAttributes.getFloat(index2, jVar.f4346f);
                        i2 = 1;
                        break;
                    case 20:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4370w = obtainStyledAttributes.getFloat(index2, jVar.f4370w);
                        i2 = 1;
                        break;
                    case 21:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4341c = obtainStyledAttributes.getLayoutDimension(index2, jVar.f4341c);
                        i2 = 1;
                        break;
                    case 22:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        int i10 = obtainStyledAttributes.getInt(index2, lVar.f4381a);
                        lVar.f4381a = i10;
                        lVar.f4381a = iArr[i10];
                        i2 = 1;
                        break;
                    case 23:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4339b = obtainStyledAttributes.getLayoutDimension(index2, jVar.f4339b);
                        i2 = 1;
                        break;
                    case 24:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.F = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.F);
                        i2 = 1;
                        break;
                    case 25:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.h = f(obtainStyledAttributes, index2, jVar.h);
                        i2 = 1;
                        break;
                    case 26:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.i = f(obtainStyledAttributes, index2, jVar.i);
                        i2 = 1;
                        break;
                    case 27:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4316E = obtainStyledAttributes.getInt(index2, jVar.f4316E);
                        i2 = 1;
                        break;
                    case 28:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4317G = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4317G);
                        i2 = 1;
                        break;
                    case 29:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4352j = f(obtainStyledAttributes, index2, jVar.f4352j);
                        i2 = 1;
                        break;
                    case 30:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4354k = f(obtainStyledAttributes, index2, jVar.f4354k);
                        i2 = 1;
                        break;
                    case 31:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4321K = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4321K);
                        i2 = 1;
                        break;
                    case 32:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4366s = f(obtainStyledAttributes, index2, jVar.f4366s);
                        i2 = 1;
                        break;
                    case 33:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4367t = f(obtainStyledAttributes, index2, jVar.f4367t);
                        i2 = 1;
                        break;
                    case 34:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4318H = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4318H);
                        i2 = 1;
                        break;
                    case 35:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4358m = f(obtainStyledAttributes, index2, jVar.f4358m);
                        i2 = 1;
                        break;
                    case 36:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4356l = f(obtainStyledAttributes, index2, jVar.f4356l);
                        i2 = 1;
                        break;
                    case 37:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4371x = obtainStyledAttributes.getFloat(index2, jVar.f4371x);
                        i2 = 1;
                        break;
                    case 38:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        iVar.f4306a = obtainStyledAttributes.getResourceId(index2, iVar.f4306a);
                        i2 = 1;
                        break;
                    case 39:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4331U = obtainStyledAttributes.getFloat(index2, jVar.f4331U);
                        i2 = 1;
                        break;
                    case 40:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4330T = obtainStyledAttributes.getFloat(index2, jVar.f4330T);
                        i2 = 1;
                        break;
                    case 41:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4332V = obtainStyledAttributes.getInt(index2, jVar.f4332V);
                        i2 = 1;
                        break;
                    case 42:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4333W = obtainStyledAttributes.getInt(index2, jVar.f4333W);
                        i2 = 1;
                        break;
                    case 43:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        lVar.f4383c = obtainStyledAttributes.getFloat(index2, lVar.f4383c);
                        i2 = 1;
                        break;
                    case 44:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4393l = true;
                        mVar.f4394m = obtainStyledAttributes.getDimension(index2, mVar.f4394m);
                        i2 = 1;
                        break;
                    case 45:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4386b = obtainStyledAttributes.getFloat(index2, mVar.f4386b);
                        i2 = 1;
                        break;
                    case 46:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4387c = obtainStyledAttributes.getFloat(index2, mVar.f4387c);
                        i2 = 1;
                        break;
                    case 47:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.d = obtainStyledAttributes.getFloat(index2, mVar.d);
                        i2 = 1;
                        break;
                    case 48:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4388e = obtainStyledAttributes.getFloat(index2, mVar.f4388e);
                        i2 = 1;
                        break;
                    case 49:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4389f = obtainStyledAttributes.getDimension(index2, mVar.f4389f);
                        i2 = 1;
                        break;
                    case 50:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4390g = obtainStyledAttributes.getDimension(index2, mVar.f4390g);
                        i2 = 1;
                        break;
                    case 51:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.i = obtainStyledAttributes.getDimension(index2, mVar.i);
                        i2 = 1;
                        break;
                    case 52:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4391j = obtainStyledAttributes.getDimension(index2, mVar.f4391j);
                        i2 = 1;
                        break;
                    case 53:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4392k = obtainStyledAttributes.getDimension(index2, mVar.f4392k);
                        i2 = 1;
                        break;
                    case 54:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4334X = obtainStyledAttributes.getInt(index2, jVar.f4334X);
                        i2 = 1;
                        break;
                    case 55:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4335Y = obtainStyledAttributes.getInt(index2, jVar.f4335Y);
                        i2 = 1;
                        break;
                    case 56:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4336Z = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4336Z);
                        i2 = 1;
                        break;
                    case 57:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4338a0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4338a0);
                        i2 = 1;
                        break;
                    case 58:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4340b0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4340b0);
                        i2 = 1;
                        break;
                    case 59:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4342c0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4342c0);
                        i2 = 1;
                        break;
                    case 60:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f4385a = obtainStyledAttributes.getFloat(index2, mVar.f4385a);
                        i2 = 1;
                        break;
                    case 61:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4373z = f(obtainStyledAttributes, index2, jVar.f4373z);
                        i2 = 1;
                        break;
                    case 62:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4312A = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4312A);
                        i2 = 1;
                        break;
                    case 63:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f4313B = obtainStyledAttributes.getFloat(index2, jVar.f4313B);
                        i2 = 1;
                        break;
                    case 64:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f4375a = f(obtainStyledAttributes, index2, kVar.f4375a);
                        i2 = 1;
                        break;
                    case 65:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        if (obtainStyledAttributes.peekValue(index2).type != 3) {
                            String str9 = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            kVar.getClass();
                            i2 = 1;
                            break;
                        } else {
                            obtainStyledAttributes.getString(index2);
                            kVar.getClass();
                            i2 = 1;
                            break;
                        }
                    case 66:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        obtainStyledAttributes.getInt(index2, 0);
                        kVar.getClass();
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 67:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        kVar.f4378e = obtainStyledAttributes.getFloat(index2, kVar.f4378e);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 68:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        lVar.d = obtainStyledAttributes.getFloat(index2, lVar.d);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 69:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        jVar.f4343d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 70:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        jVar.f4345e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 71:
                        i = indexCount2;
                        str = str7;
                        str2 = str8;
                        Log.e(str6, str);
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 72:
                        i = indexCount2;
                        str2 = str8;
                        jVar.f4347f0 = obtainStyledAttributes.getInt(index2, jVar.f4347f0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 73:
                        i = indexCount2;
                        str2 = str8;
                        jVar.f4349g0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4349g0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 74:
                        i = indexCount2;
                        str2 = str8;
                        jVar.f4353j0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 75:
                        i = indexCount2;
                        str2 = str8;
                        jVar.n0 = obtainStyledAttributes.getBoolean(index2, jVar.n0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 76:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4377c = obtainStyledAttributes.getInt(index2, kVar.f4377c);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 77:
                        i = indexCount2;
                        str2 = str8;
                        jVar.f4355k0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 78:
                        i = indexCount2;
                        str2 = str8;
                        lVar.f4382b = obtainStyledAttributes.getInt(index2, lVar.f4382b);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 79:
                        i = indexCount2;
                        str2 = str8;
                        kVar.d = obtainStyledAttributes.getFloat(index2, kVar.d);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 80:
                        i = indexCount2;
                        str2 = str8;
                        jVar.f4357l0 = obtainStyledAttributes.getBoolean(index2, jVar.f4357l0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 81:
                        i = indexCount2;
                        str2 = str8;
                        jVar.f4359m0 = obtainStyledAttributes.getBoolean(index2, jVar.f4359m0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 82:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4376b = obtainStyledAttributes.getInteger(index2, kVar.f4376b);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 83:
                        i = indexCount2;
                        str2 = str8;
                        mVar.h = f(obtainStyledAttributes, index2, mVar.h);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 84:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4380g = obtainStyledAttributes.getInteger(index2, kVar.f4380g);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 85:
                        i = indexCount2;
                        str2 = str8;
                        kVar.f4379f = obtainStyledAttributes.getFloat(index2, kVar.f4379f);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 86:
                        i = indexCount2;
                        str2 = str8;
                        int i11 = obtainStyledAttributes.peekValue(index2).type;
                        if (i11 == 1) {
                            kVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i11 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            kVar.h = string2;
                            if (string2.indexOf("/") > 0) {
                                kVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, kVar.i);
                        }
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 87:
                        i = indexCount2;
                        str2 = str8;
                        Log.w(str6, "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        str2 = str8;
                        StringBuilder sb2 = new StringBuilder(str2);
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w(str6, sb2.toString());
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 91:
                        i = indexCount2;
                        str2 = str8;
                        jVar.f4364q = f(obtainStyledAttributes, index2, jVar.f4364q);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 92:
                        i = indexCount2;
                        str2 = str8;
                        jVar.f4365r = f(obtainStyledAttributes, index2, jVar.f4365r);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 93:
                        i = indexCount2;
                        str2 = str8;
                        jVar.f4322L = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4322L);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 94:
                        i = indexCount2;
                        str2 = str8;
                        jVar.f4329S = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f4329S);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 95:
                        i = indexCount2;
                        str2 = str8;
                        g(jVar, obtainStyledAttributes, index2, 0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 96:
                        i = indexCount2;
                        str2 = str8;
                        g(jVar, obtainStyledAttributes, index2, 1);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                    case 97:
                        i = indexCount2;
                        str2 = str8;
                        jVar.f4362o0 = obtainStyledAttributes.getInt(index2, jVar.f4362o0);
                        str = str7;
                        str3 = str6;
                        i2 = 1;
                        break;
                }
                i9 += i2;
                indexCount2 = i;
                str8 = str2;
                String str10 = str;
                i8 = i2;
                str6 = str3;
                str7 = str10;
            }
            if (jVar.f4353j0 != null) {
                jVar.f4351i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return iVar;
    }

    public static int f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        boolean z2 = true;
        int i4 = 0;
        if (i3 == 3) {
            String string = typedArray.getString(i);
            if (string == null) {
                return;
            }
            int indexOf = string.indexOf(61);
            int length = string.length();
            if (indexOf <= 0 || indexOf >= length - 1) {
                return;
            }
            String substring = string.substring(0, indexOf);
            String substring2 = string.substring(indexOf + 1);
            if (substring2.length() > 0) {
                String trim = substring.trim();
                String trim2 = substring2.trim();
                if ("ratio".equalsIgnoreCase(trim)) {
                    if (obj instanceof e) {
                        e eVar = (e) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) eVar).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) eVar).height = 0;
                        }
                        h(eVar, trim2);
                        return;
                    }
                    if (obj instanceof j) {
                        ((j) obj).f4372y = trim2;
                        return;
                    } else {
                        if (obj instanceof h) {
                            ((h) obj).d(trim2, 5);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof e) {
                            e eVar2 = (e) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) eVar2).width = 0;
                                eVar2.f4230H = parseFloat;
                            } else {
                                ((ViewGroup.MarginLayoutParams) eVar2).height = 0;
                                eVar2.f4231I = parseFloat;
                            }
                        } else if (obj instanceof j) {
                            j jVar = (j) obj;
                            if (i2 == 0) {
                                jVar.f4339b = 0;
                                jVar.f4331U = parseFloat;
                            } else {
                                jVar.f4341c = 0;
                                jVar.f4330T = parseFloat;
                            }
                        } else if (obj instanceof h) {
                            h hVar = (h) obj;
                            if (i2 == 0) {
                                hVar.b(23, 0);
                                hVar.a(39, parseFloat);
                            } else {
                                hVar.b(21, 0);
                                hVar.a(40, parseFloat);
                            }
                        }
                    } else {
                        if (!"parent".equalsIgnoreCase(trim)) {
                            return;
                        }
                        float max = Math.max(RecyclerView.f1949A0, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof e) {
                            e eVar3 = (e) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) eVar3).width = 0;
                                eVar3.f4240R = max;
                                eVar3.f4234L = 2;
                            } else {
                                ((ViewGroup.MarginLayoutParams) eVar3).height = 0;
                                eVar3.f4241S = max;
                                eVar3.f4235M = 2;
                            }
                        } else if (obj instanceof j) {
                            j jVar2 = (j) obj;
                            if (i2 == 0) {
                                jVar2.f4339b = 0;
                                jVar2.f4343d0 = max;
                                jVar2.f4334X = 2;
                            } else {
                                jVar2.f4341c = 0;
                                jVar2.f4345e0 = max;
                                jVar2.f4335Y = 2;
                            }
                        } else if (obj instanceof h) {
                            h hVar2 = (h) obj;
                            if (i2 == 0) {
                                hVar2.b(23, 0);
                                hVar2.b(54, 2);
                            } else {
                                hVar2.b(21, 0);
                                hVar2.b(55, 2);
                            }
                        }
                    }
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            }
            return;
        }
        if (i3 != 5) {
            dimensionPixelSize = typedArray.getInt(i, 0);
            if (dimensionPixelSize == -4) {
                i4 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z2 = false;
            }
            if (!(obj instanceof e)) {
                e eVar4 = (e) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) eVar4).width = i4;
                    eVar4.f4245W = z2;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) eVar4).height = i4;
                    eVar4.f4246X = z2;
                    return;
                }
            }
            if (obj instanceof j) {
                j jVar3 = (j) obj;
                if (i2 == 0) {
                    jVar3.f4339b = i4;
                    jVar3.f4357l0 = z2;
                    return;
                } else {
                    jVar3.f4341c = i4;
                    jVar3.f4359m0 = z2;
                    return;
                }
            }
            if (obj instanceof h) {
                h hVar3 = (h) obj;
                if (i2 == 0) {
                    hVar3.b(23, i4);
                    hVar3.c(80, z2);
                    return;
                } else {
                    hVar3.b(21, i4);
                    hVar3.c(81, z2);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z2 = false;
        i4 = dimensionPixelSize;
        if (!(obj instanceof e)) {
        }
    }

    public static void h(e eVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                i = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
                r2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(r2);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(r2, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > RecyclerView.f1949A0 && parseFloat2 > RecyclerView.f1949A0) {
                            if (i == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        eVar.f4229G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        int i;
        HashMap hashMap;
        String str;
        int i2;
        String str2;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = nVar.f4399c;
        HashSet hashSet = new HashSet(hashMap2.keySet());
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            int id = childAt.getId();
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    str2 = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str2 = "UNKNOWN";
                }
                sb.append(str2);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (nVar.f4398b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        i iVar = (i) hashMap2.get(Integer.valueOf(id));
                        if (iVar != null) {
                            if (childAt instanceof C0374a) {
                                j jVar = iVar.d;
                                jVar.f4350h0 = 1;
                                C0374a c0374a = (C0374a) childAt;
                                c0374a.setId(id);
                                c0374a.setType(jVar.f4347f0);
                                c0374a.setMargin(jVar.f4349g0);
                                c0374a.setAllowsGoneWidget(jVar.n0);
                                int[] iArr = jVar.f4351i0;
                                if (iArr != null) {
                                    c0374a.setReferencedIds(iArr);
                                } else {
                                    String str3 = jVar.f4353j0;
                                    if (str3 != null) {
                                        int[] c2 = c(c0374a, str3);
                                        jVar.f4351i0 = c2;
                                        c0374a.setReferencedIds(c2);
                                    }
                                }
                            }
                            e eVar = (e) childAt.getLayoutParams();
                            eVar.a();
                            iVar.a(eVar);
                            HashMap hashMap3 = iVar.f4310f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                C0375b c0375b = (C0375b) hashMap3.get(str4);
                                if (c0375b.f4211a) {
                                    hashMap = hashMap3;
                                    str = str4;
                                } else {
                                    hashMap = hashMap3;
                                    str = "set" + str4;
                                }
                                try {
                                    switch (AbstractC0332e.a(c0375b.f4212b)) {
                                        case 0:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0375b.f4213c));
                                            break;
                                        case 1:
                                            i2 = childCount;
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0375b.d));
                                            break;
                                        case 2:
                                            i2 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0375b.f4216g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            i2 = childCount;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(c0375b.f4216g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e2) {
                                                e = e2;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                                e.printStackTrace();
                                                hashMap3 = hashMap;
                                                childCount = i2;
                                            } catch (NoSuchMethodException e3) {
                                                e = e3;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str);
                                                hashMap3 = hashMap;
                                                childCount = i2;
                                            } catch (InvocationTargetException e4) {
                                                e = e4;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                                e.printStackTrace();
                                                hashMap3 = hashMap;
                                                childCount = i2;
                                            }
                                        case 4:
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, c0375b.f4214e);
                                            i2 = childCount;
                                            break;
                                        case 5:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0375b.f4215f));
                                            i2 = childCount;
                                            break;
                                        case 6:
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(c0375b.d));
                                            i2 = childCount;
                                            break;
                                        case 7:
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(c0375b.f4213c));
                                            i2 = childCount;
                                            break;
                                        default:
                                            i2 = childCount;
                                            break;
                                    }
                                } catch (IllegalAccessException e5) {
                                    e = e5;
                                    i2 = childCount;
                                } catch (NoSuchMethodException e6) {
                                    e = e6;
                                    i2 = childCount;
                                } catch (InvocationTargetException e7) {
                                    e = e7;
                                    i2 = childCount;
                                }
                                hashMap3 = hashMap;
                                childCount = i2;
                            }
                            i = childCount;
                            childAt.setLayoutParams(eVar);
                            l lVar = iVar.f4307b;
                            if (lVar.f4382b == 0) {
                                childAt.setVisibility(lVar.f4381a);
                            }
                            childAt.setAlpha(lVar.f4383c);
                            m mVar = iVar.f4309e;
                            childAt.setRotation(mVar.f4385a);
                            childAt.setRotationX(mVar.f4386b);
                            childAt.setRotationY(mVar.f4387c);
                            childAt.setScaleX(mVar.d);
                            childAt.setScaleY(mVar.f4388e);
                            if (mVar.h != -1) {
                                if (((View) childAt.getParent()).findViewById(mVar.h) != null) {
                                    float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                    float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(mVar.f4389f)) {
                                    childAt.setPivotX(mVar.f4389f);
                                }
                                if (!Float.isNaN(mVar.f4390g)) {
                                    childAt.setPivotY(mVar.f4390g);
                                }
                            }
                            childAt.setTranslationX(mVar.i);
                            childAt.setTranslationY(mVar.f4391j);
                            childAt.setTranslationZ(mVar.f4392k);
                            if (mVar.f4393l) {
                                childAt.setElevation(mVar.f4394m);
                            }
                        }
                    } else {
                        i = childCount;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i3++;
                    nVar = this;
                    childCount = i;
                }
            }
            i = childCount;
            i3++;
            nVar = this;
            childCount = i;
        }
        int i4 = childCount;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            i iVar2 = (i) hashMap2.get(num);
            if (iVar2 != null) {
                j jVar2 = iVar2.d;
                if (jVar2.f4350h0 == 1) {
                    Context context = constraintLayout.getContext();
                    C0374a c0374a2 = new C0374a(context);
                    c0374a2.f4217a = new int[32];
                    c0374a2.f4222g = new HashMap();
                    c0374a2.f4219c = context;
                    C0361a c0361a = new C0361a();
                    c0361a.f3930s0 = 0;
                    c0361a.f3931t0 = true;
                    c0361a.f3932u0 = 0;
                    c0361a.f3933v0 = false;
                    c0374a2.f4210j = c0361a;
                    c0374a2.d = c0361a;
                    c0374a2.i();
                    c0374a2.setVisibility(8);
                    c0374a2.setId(num.intValue());
                    int[] iArr2 = jVar2.f4351i0;
                    if (iArr2 != null) {
                        c0374a2.setReferencedIds(iArr2);
                    } else {
                        String str5 = jVar2.f4353j0;
                        if (str5 != null) {
                            int[] c3 = c(c0374a2, str5);
                            jVar2.f4351i0 = c3;
                            c0374a2.setReferencedIds(c3);
                        }
                    }
                    c0374a2.setType(jVar2.f4347f0);
                    c0374a2.setMargin(jVar2.f4349g0);
                    e g2 = ConstraintLayout.g();
                    c0374a2.i();
                    iVar2.a(g2);
                    constraintLayout.addView(c0374a2, g2);
                }
                if (jVar2.f4337a) {
                    View pVar = new p(constraintLayout.getContext());
                    pVar.setId(num.intValue());
                    e g3 = ConstraintLayout.g();
                    iVar2.a(g3);
                    constraintLayout.addView(pVar, g3);
                }
            }
        }
        for (int i5 = 0; i5 < i4; i5++) {
            View childAt2 = constraintLayout.getChildAt(i5);
            if (childAt2 instanceof c) {
                ((c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = nVar.f4399c;
        hashMap.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            e eVar = (e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (nVar.f4398b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new i());
            }
            i iVar = (i) hashMap.get(Integer.valueOf(id));
            if (iVar != null) {
                HashMap hashMap2 = nVar.f4397a;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    C0375b c0375b = (C0375b) hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new C0375b(c0375b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new C0375b(c0375b, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (NoSuchMethodException e3) {
                        e3.printStackTrace();
                    } catch (InvocationTargetException e4) {
                        e4.printStackTrace();
                    }
                }
                iVar.f4310f = hashMap3;
                iVar.f4306a = id;
                int i2 = eVar.f4256e;
                j jVar = iVar.d;
                jVar.h = i2;
                jVar.i = eVar.f4258f;
                jVar.f4352j = eVar.f4260g;
                jVar.f4354k = eVar.h;
                jVar.f4356l = eVar.i;
                jVar.f4358m = eVar.f4264j;
                jVar.f4360n = eVar.f4266k;
                jVar.f4361o = eVar.f4268l;
                jVar.f4363p = eVar.f4270m;
                jVar.f4364q = eVar.f4272n;
                jVar.f4365r = eVar.f4273o;
                jVar.f4366s = eVar.f4279s;
                jVar.f4367t = eVar.f4280t;
                jVar.f4368u = eVar.f4281u;
                jVar.f4369v = eVar.f4282v;
                jVar.f4370w = eVar.f4228E;
                jVar.f4371x = eVar.F;
                jVar.f4372y = eVar.f4229G;
                jVar.f4373z = eVar.f4275p;
                jVar.f4312A = eVar.f4277q;
                jVar.f4313B = eVar.f4278r;
                jVar.f4314C = eVar.f4242T;
                jVar.f4315D = eVar.f4243U;
                jVar.f4316E = eVar.f4244V;
                jVar.f4346f = eVar.f4253c;
                jVar.d = eVar.f4249a;
                jVar.f4344e = eVar.f4251b;
                jVar.f4339b = ((ViewGroup.MarginLayoutParams) eVar).width;
                jVar.f4341c = ((ViewGroup.MarginLayoutParams) eVar).height;
                jVar.F = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                jVar.f4317G = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                jVar.f4318H = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                jVar.f4319I = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                jVar.f4322L = eVar.f4227D;
                jVar.f4330T = eVar.f4231I;
                jVar.f4331U = eVar.f4230H;
                jVar.f4333W = eVar.f4233K;
                jVar.f4332V = eVar.f4232J;
                jVar.f4357l0 = eVar.f4245W;
                jVar.f4359m0 = eVar.f4246X;
                jVar.f4334X = eVar.f4234L;
                jVar.f4335Y = eVar.f4235M;
                jVar.f4336Z = eVar.f4238P;
                jVar.f4338a0 = eVar.f4239Q;
                jVar.f4340b0 = eVar.f4236N;
                jVar.f4342c0 = eVar.f4237O;
                jVar.f4343d0 = eVar.f4240R;
                jVar.f4345e0 = eVar.f4241S;
                jVar.f4355k0 = eVar.f4247Y;
                jVar.f4324N = eVar.f4284x;
                jVar.f4326P = eVar.f4286z;
                jVar.f4323M = eVar.f4283w;
                jVar.f4325O = eVar.f4285y;
                jVar.f4328R = eVar.f4224A;
                jVar.f4327Q = eVar.f4225B;
                jVar.f4329S = eVar.f4226C;
                jVar.f4362o0 = eVar.f4248Z;
                jVar.f4320J = eVar.getMarginEnd();
                jVar.f4321K = eVar.getMarginStart();
                int visibility = childAt.getVisibility();
                l lVar = iVar.f4307b;
                lVar.f4381a = visibility;
                lVar.f4383c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                m mVar = iVar.f4309e;
                mVar.f4385a = rotation;
                mVar.f4386b = childAt.getRotationX();
                mVar.f4387c = childAt.getRotationY();
                mVar.d = childAt.getScaleX();
                mVar.f4388e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    mVar.f4389f = pivotX;
                    mVar.f4390g = pivotY;
                }
                mVar.i = childAt.getTranslationX();
                mVar.f4391j = childAt.getTranslationY();
                mVar.f4392k = childAt.getTranslationZ();
                if (mVar.f4393l) {
                    mVar.f4394m = childAt.getElevation();
                }
                if (childAt instanceof C0374a) {
                    C0374a c0374a = (C0374a) childAt;
                    jVar.n0 = c0374a.getAllowsGoneWidget();
                    jVar.f4351i0 = c0374a.getReferencedIds();
                    jVar.f4347f0 = c0374a.getType();
                    jVar.f4349g0 = c0374a.getMargin();
                }
            }
            i++;
            nVar = this;
        }
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    i d2 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d2.d.f4337a = true;
                    }
                    this.f4399c.put(Integer.valueOf(d2.f4306a), d2);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
