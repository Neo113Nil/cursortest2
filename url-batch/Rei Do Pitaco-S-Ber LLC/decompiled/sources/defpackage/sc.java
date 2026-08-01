package defpackage;

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
import androidx.constraintlayout.widget.Guideline;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class sc {
    public static final int[] d = {0, 4, 8};
    public static final SparseIntArray e;
    public static final SparseIntArray f;
    public final HashMap a = new HashMap();
    public final boolean b = true;
    public final HashMap c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f = sparseIntArray2;
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

    public static int[] c(c7 c7Var, String str) {
        int i;
        String[] split = str.split(",");
        Context context = c7Var.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            Object obj = null;
            try {
                i = cx.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && c7Var.isInEditMode() && (c7Var.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c7Var.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.r;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.r.get(trim);
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

    public static nc d(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        int i2;
        nc ncVar = new nc();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? ex.c : ex.a);
        String[] strArr = m60.j;
        qc qcVar = ncVar.b;
        rc rcVar = ncVar.e;
        pc pcVar = ncVar.c;
        oc ocVar = ncVar.d;
        int[] iArr = d;
        SparseIntArray sparseIntArray = e;
        if (z) {
            mc mcVar = new mc();
            mcVar.a = new int[10];
            mcVar.b = new int[10];
            mcVar.c = 0;
            mcVar.d = new int[10];
            mcVar.e = new float[10];
            mcVar.f = 0;
            mcVar.g = new int[5];
            mcVar.h = new String[5];
            mcVar.i = 0;
            mcVar.j = new int[4];
            mcVar.k = new boolean[4];
            mcVar.l = 0;
            pcVar.getClass();
            ocVar.getClass();
            rcVar.getClass();
            int i3 = 0;
            for (int indexCount = obtainStyledAttributes.getIndexCount(); i3 < indexCount; indexCount = i2) {
                int index = obtainStyledAttributes.getIndex(i3);
                int i4 = i3;
                switch (f.get(index)) {
                    case 2:
                        i2 = indexCount;
                        mcVar.b(2, obtainStyledAttributes.getDimensionPixelSize(index, ocVar.I));
                        continue;
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
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i2 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i2 = indexCount;
                        mcVar.d(obtainStyledAttributes.getString(index), 5);
                        continue;
                    case 6:
                        i2 = indexCount;
                        mcVar.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, ocVar.C));
                        break;
                    case 7:
                        i2 = indexCount;
                        mcVar.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, ocVar.D));
                        break;
                    case 8:
                        i2 = indexCount;
                        mcVar.b(8, obtainStyledAttributes.getDimensionPixelSize(index, ocVar.J));
                        break;
                    case 11:
                        i2 = indexCount;
                        mcVar.b(11, obtainStyledAttributes.getDimensionPixelSize(index, ocVar.P));
                        break;
                    case 12:
                        i2 = indexCount;
                        mcVar.b(12, obtainStyledAttributes.getDimensionPixelSize(index, ocVar.Q));
                        break;
                    case 13:
                        i2 = indexCount;
                        mcVar.b(13, obtainStyledAttributes.getDimensionPixelSize(index, ocVar.M));
                        break;
                    case 14:
                        i2 = indexCount;
                        mcVar.b(14, obtainStyledAttributes.getDimensionPixelSize(index, ocVar.O));
                        break;
                    case 15:
                        i2 = indexCount;
                        mcVar.b(15, obtainStyledAttributes.getDimensionPixelSize(index, ocVar.R));
                        break;
                    case 16:
                        i2 = indexCount;
                        mcVar.b(16, obtainStyledAttributes.getDimensionPixelSize(index, ocVar.N));
                        break;
                    case 17:
                        i2 = indexCount;
                        mcVar.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, ocVar.d));
                        break;
                    case 18:
                        i2 = indexCount;
                        mcVar.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, ocVar.e));
                        break;
                    case 19:
                        i2 = indexCount;
                        mcVar.a(19, obtainStyledAttributes.getFloat(index, ocVar.f));
                        break;
                    case 20:
                        i2 = indexCount;
                        mcVar.a(20, obtainStyledAttributes.getFloat(index, ocVar.w));
                        break;
                    case 21:
                        i2 = indexCount;
                        mcVar.b(21, obtainStyledAttributes.getLayoutDimension(index, ocVar.c));
                        break;
                    case 22:
                        i2 = indexCount;
                        mcVar.b(22, iArr[obtainStyledAttributes.getInt(index, qcVar.a)]);
                        break;
                    case 23:
                        i2 = indexCount;
                        mcVar.b(23, obtainStyledAttributes.getLayoutDimension(index, ocVar.b));
                        break;
                    case 24:
                        i2 = indexCount;
                        mcVar.b(24, obtainStyledAttributes.getDimensionPixelSize(index, ocVar.F));
                        break;
                    case 27:
                        i2 = indexCount;
                        mcVar.b(27, obtainStyledAttributes.getInt(index, ocVar.E));
                        break;
                    case 28:
                        i2 = indexCount;
                        mcVar.b(28, obtainStyledAttributes.getDimensionPixelSize(index, ocVar.G));
                        break;
                    case 31:
                        i2 = indexCount;
                        mcVar.b(31, obtainStyledAttributes.getDimensionPixelSize(index, ocVar.K));
                        break;
                    case 34:
                        i2 = indexCount;
                        mcVar.b(34, obtainStyledAttributes.getDimensionPixelSize(index, ocVar.H));
                        break;
                    case 37:
                        i2 = indexCount;
                        mcVar.a(37, obtainStyledAttributes.getFloat(index, ocVar.x));
                        break;
                    case 38:
                        i2 = indexCount;
                        int resourceId = obtainStyledAttributes.getResourceId(index, ncVar.a);
                        ncVar.a = resourceId;
                        mcVar.b(38, resourceId);
                        break;
                    case 39:
                        i2 = indexCount;
                        mcVar.a(39, obtainStyledAttributes.getFloat(index, ocVar.U));
                        break;
                    case 40:
                        i2 = indexCount;
                        mcVar.a(40, obtainStyledAttributes.getFloat(index, ocVar.T));
                        break;
                    case 41:
                        i2 = indexCount;
                        mcVar.b(41, obtainStyledAttributes.getInt(index, ocVar.V));
                        break;
                    case 42:
                        i2 = indexCount;
                        mcVar.b(42, obtainStyledAttributes.getInt(index, ocVar.W));
                        break;
                    case 43:
                        i2 = indexCount;
                        mcVar.a(43, obtainStyledAttributes.getFloat(index, qcVar.c));
                        break;
                    case 44:
                        i2 = indexCount;
                        mcVar.c(44, true);
                        mcVar.a(44, obtainStyledAttributes.getDimension(index, rcVar.m));
                        break;
                    case 45:
                        i2 = indexCount;
                        mcVar.a(45, obtainStyledAttributes.getFloat(index, rcVar.b));
                        break;
                    case 46:
                        i2 = indexCount;
                        mcVar.a(46, obtainStyledAttributes.getFloat(index, rcVar.c));
                        break;
                    case 47:
                        i2 = indexCount;
                        mcVar.a(47, obtainStyledAttributes.getFloat(index, rcVar.d));
                        break;
                    case 48:
                        i2 = indexCount;
                        mcVar.a(48, obtainStyledAttributes.getFloat(index, rcVar.e));
                        break;
                    case 49:
                        i2 = indexCount;
                        mcVar.a(49, obtainStyledAttributes.getDimension(index, rcVar.f));
                        break;
                    case 50:
                        i2 = indexCount;
                        mcVar.a(50, obtainStyledAttributes.getDimension(index, rcVar.g));
                        break;
                    case 51:
                        i2 = indexCount;
                        mcVar.a(51, obtainStyledAttributes.getDimension(index, rcVar.i));
                        break;
                    case 52:
                        i2 = indexCount;
                        mcVar.a(52, obtainStyledAttributes.getDimension(index, rcVar.j));
                        break;
                    case 53:
                        i2 = indexCount;
                        mcVar.a(53, obtainStyledAttributes.getDimension(index, rcVar.k));
                        break;
                    case 54:
                        i2 = indexCount;
                        mcVar.b(54, obtainStyledAttributes.getInt(index, ocVar.X));
                        break;
                    case 55:
                        i2 = indexCount;
                        mcVar.b(55, obtainStyledAttributes.getInt(index, ocVar.Y));
                        break;
                    case 56:
                        i2 = indexCount;
                        mcVar.b(56, obtainStyledAttributes.getDimensionPixelSize(index, ocVar.Z));
                        break;
                    case 57:
                        i2 = indexCount;
                        mcVar.b(57, obtainStyledAttributes.getDimensionPixelSize(index, ocVar.a0));
                        break;
                    case 58:
                        i2 = indexCount;
                        mcVar.b(58, obtainStyledAttributes.getDimensionPixelSize(index, ocVar.b0));
                        break;
                    case 59:
                        i2 = indexCount;
                        mcVar.b(59, obtainStyledAttributes.getDimensionPixelSize(index, ocVar.c0));
                        break;
                    case 60:
                        i2 = indexCount;
                        mcVar.a(60, obtainStyledAttributes.getFloat(index, rcVar.a));
                        break;
                    case 62:
                        i2 = indexCount;
                        mcVar.b(62, obtainStyledAttributes.getDimensionPixelSize(index, ocVar.A));
                        break;
                    case 63:
                        i2 = indexCount;
                        mcVar.a(63, obtainStyledAttributes.getFloat(index, ocVar.B));
                        break;
                    case 64:
                        i2 = indexCount;
                        mcVar.b(64, f(obtainStyledAttributes, index, pcVar.a));
                        break;
                    case 65:
                        i2 = indexCount;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            mcVar.d(obtainStyledAttributes.getString(index), 65);
                            break;
                        } else {
                            mcVar.d(strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                            break;
                        }
                    case 66:
                        i2 = indexCount;
                        mcVar.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i2 = indexCount;
                        mcVar.a(67, obtainStyledAttributes.getFloat(index, pcVar.e));
                        break;
                    case 68:
                        i2 = indexCount;
                        mcVar.a(68, obtainStyledAttributes.getFloat(index, qcVar.d));
                        break;
                    case 69:
                        i2 = indexCount;
                        mcVar.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i2 = indexCount;
                        mcVar.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i2 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i2 = indexCount;
                        mcVar.b(72, obtainStyledAttributes.getInt(index, ocVar.f0));
                        break;
                    case 73:
                        i2 = indexCount;
                        mcVar.b(73, obtainStyledAttributes.getDimensionPixelSize(index, ocVar.g0));
                        break;
                    case 74:
                        i2 = indexCount;
                        mcVar.d(obtainStyledAttributes.getString(index), 74);
                        break;
                    case 75:
                        i2 = indexCount;
                        mcVar.c(75, obtainStyledAttributes.getBoolean(index, ocVar.n0));
                        break;
                    case 76:
                        i2 = indexCount;
                        mcVar.b(76, obtainStyledAttributes.getInt(index, pcVar.c));
                        break;
                    case 77:
                        i2 = indexCount;
                        mcVar.d(obtainStyledAttributes.getString(index), 77);
                        break;
                    case 78:
                        i2 = indexCount;
                        mcVar.b(78, obtainStyledAttributes.getInt(index, qcVar.b));
                        break;
                    case 79:
                        i2 = indexCount;
                        mcVar.a(79, obtainStyledAttributes.getFloat(index, pcVar.d));
                        break;
                    case 80:
                        i2 = indexCount;
                        mcVar.c(80, obtainStyledAttributes.getBoolean(index, ocVar.l0));
                        break;
                    case 81:
                        i2 = indexCount;
                        mcVar.c(81, obtainStyledAttributes.getBoolean(index, ocVar.m0));
                        break;
                    case 82:
                        i2 = indexCount;
                        mcVar.b(82, obtainStyledAttributes.getInteger(index, pcVar.b));
                        break;
                    case 83:
                        i2 = indexCount;
                        mcVar.b(83, f(obtainStyledAttributes, index, rcVar.h));
                        break;
                    case 84:
                        i2 = indexCount;
                        mcVar.b(84, obtainStyledAttributes.getInteger(index, pcVar.g));
                        break;
                    case 85:
                        i2 = indexCount;
                        mcVar.a(85, obtainStyledAttributes.getFloat(index, pcVar.f));
                        break;
                    case 86:
                        i2 = indexCount;
                        int i5 = obtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            pcVar.i = resourceId2;
                            mcVar.b(89, resourceId2);
                            if (pcVar.i != -1) {
                                mcVar.b(88, -2);
                                break;
                            }
                        } else if (i5 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            pcVar.h = string;
                            mcVar.d(string, 90);
                            if (pcVar.h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                pcVar.i = resourceId3;
                                mcVar.b(89, resourceId3);
                                mcVar.b(88, -2);
                                break;
                            } else {
                                mcVar.b(88, -1);
                                break;
                            }
                        } else {
                            mcVar.b(88, obtainStyledAttributes.getInteger(index, pcVar.i));
                            break;
                        }
                        break;
                    case 87:
                        i2 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i2 = indexCount;
                        mcVar.b(93, obtainStyledAttributes.getDimensionPixelSize(index, ocVar.L));
                        break;
                    case 94:
                        i2 = indexCount;
                        mcVar.b(94, obtainStyledAttributes.getDimensionPixelSize(index, ocVar.S));
                        break;
                    case 95:
                        i2 = indexCount;
                        g(mcVar, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i2 = indexCount;
                        g(mcVar, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i2 = indexCount;
                        mcVar.b(97, obtainStyledAttributes.getInt(index, ocVar.o0));
                        break;
                    case 98:
                        i2 = indexCount;
                        int i6 = st.v;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            ncVar.a = obtainStyledAttributes.getResourceId(index, ncVar.a);
                            break;
                        }
                    case 99:
                        i2 = indexCount;
                        mcVar.c(99, obtainStyledAttributes.getBoolean(index, ocVar.g));
                        break;
                }
                i3 = i4 + 1;
            }
        } else {
            int i7 = 0;
            for (int indexCount2 = obtainStyledAttributes.getIndexCount(); i7 < indexCount2; indexCount2 = i) {
                int index2 = obtainStyledAttributes.getIndex(i7);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        pcVar.getClass();
                        ocVar.getClass();
                        rcVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        ocVar.p = f(obtainStyledAttributes, index2, ocVar.p);
                        continue;
                    case 2:
                        i = indexCount2;
                        ocVar.I = obtainStyledAttributes.getDimensionPixelSize(index2, ocVar.I);
                        continue;
                    case 3:
                        i = indexCount2;
                        ocVar.o = f(obtainStyledAttributes, index2, ocVar.o);
                        continue;
                    case 4:
                        i = indexCount2;
                        ocVar.n = f(obtainStyledAttributes, index2, ocVar.n);
                        continue;
                    case 5:
                        i = indexCount2;
                        ocVar.y = obtainStyledAttributes.getString(index2);
                        continue;
                    case 6:
                        i = indexCount2;
                        ocVar.C = obtainStyledAttributes.getDimensionPixelOffset(index2, ocVar.C);
                        continue;
                    case 7:
                        i = indexCount2;
                        ocVar.D = obtainStyledAttributes.getDimensionPixelOffset(index2, ocVar.D);
                        continue;
                    case 8:
                        i = indexCount2;
                        ocVar.J = obtainStyledAttributes.getDimensionPixelSize(index2, ocVar.J);
                        continue;
                    case 9:
                        i = indexCount2;
                        ocVar.v = f(obtainStyledAttributes, index2, ocVar.v);
                        continue;
                    case 10:
                        i = indexCount2;
                        ocVar.u = f(obtainStyledAttributes, index2, ocVar.u);
                        continue;
                    case 11:
                        i = indexCount2;
                        ocVar.P = obtainStyledAttributes.getDimensionPixelSize(index2, ocVar.P);
                        continue;
                    case 12:
                        i = indexCount2;
                        ocVar.Q = obtainStyledAttributes.getDimensionPixelSize(index2, ocVar.Q);
                        continue;
                    case 13:
                        i = indexCount2;
                        ocVar.M = obtainStyledAttributes.getDimensionPixelSize(index2, ocVar.M);
                        continue;
                    case 14:
                        i = indexCount2;
                        ocVar.O = obtainStyledAttributes.getDimensionPixelSize(index2, ocVar.O);
                        continue;
                    case 15:
                        i = indexCount2;
                        ocVar.R = obtainStyledAttributes.getDimensionPixelSize(index2, ocVar.R);
                        continue;
                    case 16:
                        i = indexCount2;
                        ocVar.N = obtainStyledAttributes.getDimensionPixelSize(index2, ocVar.N);
                        continue;
                    case 17:
                        i = indexCount2;
                        ocVar.d = obtainStyledAttributes.getDimensionPixelOffset(index2, ocVar.d);
                        continue;
                    case 18:
                        i = indexCount2;
                        ocVar.e = obtainStyledAttributes.getDimensionPixelOffset(index2, ocVar.e);
                        continue;
                    case 19:
                        i = indexCount2;
                        ocVar.f = obtainStyledAttributes.getFloat(index2, ocVar.f);
                        continue;
                    case 20:
                        i = indexCount2;
                        ocVar.w = obtainStyledAttributes.getFloat(index2, ocVar.w);
                        continue;
                    case 21:
                        i = indexCount2;
                        ocVar.c = obtainStyledAttributes.getLayoutDimension(index2, ocVar.c);
                        continue;
                    case 22:
                        i = indexCount2;
                        int i8 = obtainStyledAttributes.getInt(index2, qcVar.a);
                        qcVar.a = i8;
                        qcVar.a = iArr[i8];
                        continue;
                    case 23:
                        i = indexCount2;
                        ocVar.b = obtainStyledAttributes.getLayoutDimension(index2, ocVar.b);
                        continue;
                    case 24:
                        i = indexCount2;
                        ocVar.F = obtainStyledAttributes.getDimensionPixelSize(index2, ocVar.F);
                        continue;
                    case 25:
                        i = indexCount2;
                        ocVar.h = f(obtainStyledAttributes, index2, ocVar.h);
                        continue;
                    case 26:
                        i = indexCount2;
                        ocVar.i = f(obtainStyledAttributes, index2, ocVar.i);
                        continue;
                    case 27:
                        i = indexCount2;
                        ocVar.E = obtainStyledAttributes.getInt(index2, ocVar.E);
                        continue;
                    case 28:
                        i = indexCount2;
                        ocVar.G = obtainStyledAttributes.getDimensionPixelSize(index2, ocVar.G);
                        continue;
                    case 29:
                        i = indexCount2;
                        ocVar.j = f(obtainStyledAttributes, index2, ocVar.j);
                        continue;
                    case 30:
                        i = indexCount2;
                        ocVar.k = f(obtainStyledAttributes, index2, ocVar.k);
                        continue;
                    case 31:
                        i = indexCount2;
                        ocVar.K = obtainStyledAttributes.getDimensionPixelSize(index2, ocVar.K);
                        continue;
                    case 32:
                        i = indexCount2;
                        ocVar.s = f(obtainStyledAttributes, index2, ocVar.s);
                        continue;
                    case 33:
                        i = indexCount2;
                        ocVar.t = f(obtainStyledAttributes, index2, ocVar.t);
                        continue;
                    case 34:
                        i = indexCount2;
                        ocVar.H = obtainStyledAttributes.getDimensionPixelSize(index2, ocVar.H);
                        continue;
                    case 35:
                        i = indexCount2;
                        ocVar.m = f(obtainStyledAttributes, index2, ocVar.m);
                        continue;
                    case 36:
                        i = indexCount2;
                        ocVar.l = f(obtainStyledAttributes, index2, ocVar.l);
                        continue;
                    case 37:
                        i = indexCount2;
                        ocVar.x = obtainStyledAttributes.getFloat(index2, ocVar.x);
                        continue;
                    case 38:
                        i = indexCount2;
                        ncVar.a = obtainStyledAttributes.getResourceId(index2, ncVar.a);
                        continue;
                    case 39:
                        i = indexCount2;
                        ocVar.U = obtainStyledAttributes.getFloat(index2, ocVar.U);
                        continue;
                    case 40:
                        i = indexCount2;
                        ocVar.T = obtainStyledAttributes.getFloat(index2, ocVar.T);
                        continue;
                    case 41:
                        i = indexCount2;
                        ocVar.V = obtainStyledAttributes.getInt(index2, ocVar.V);
                        continue;
                    case 42:
                        i = indexCount2;
                        ocVar.W = obtainStyledAttributes.getInt(index2, ocVar.W);
                        continue;
                    case 43:
                        i = indexCount2;
                        qcVar.c = obtainStyledAttributes.getFloat(index2, qcVar.c);
                        continue;
                    case 44:
                        i = indexCount2;
                        rcVar.l = true;
                        rcVar.m = obtainStyledAttributes.getDimension(index2, rcVar.m);
                        continue;
                    case 45:
                        i = indexCount2;
                        rcVar.b = obtainStyledAttributes.getFloat(index2, rcVar.b);
                        continue;
                    case 46:
                        i = indexCount2;
                        rcVar.c = obtainStyledAttributes.getFloat(index2, rcVar.c);
                        continue;
                    case 47:
                        i = indexCount2;
                        rcVar.d = obtainStyledAttributes.getFloat(index2, rcVar.d);
                        continue;
                    case 48:
                        i = indexCount2;
                        rcVar.e = obtainStyledAttributes.getFloat(index2, rcVar.e);
                        continue;
                    case 49:
                        i = indexCount2;
                        rcVar.f = obtainStyledAttributes.getDimension(index2, rcVar.f);
                        continue;
                    case 50:
                        i = indexCount2;
                        rcVar.g = obtainStyledAttributes.getDimension(index2, rcVar.g);
                        continue;
                    case 51:
                        i = indexCount2;
                        rcVar.i = obtainStyledAttributes.getDimension(index2, rcVar.i);
                        continue;
                    case 52:
                        i = indexCount2;
                        rcVar.j = obtainStyledAttributes.getDimension(index2, rcVar.j);
                        continue;
                    case 53:
                        i = indexCount2;
                        rcVar.k = obtainStyledAttributes.getDimension(index2, rcVar.k);
                        continue;
                    case 54:
                        i = indexCount2;
                        ocVar.X = obtainStyledAttributes.getInt(index2, ocVar.X);
                        continue;
                    case 55:
                        i = indexCount2;
                        ocVar.Y = obtainStyledAttributes.getInt(index2, ocVar.Y);
                        continue;
                    case 56:
                        i = indexCount2;
                        ocVar.Z = obtainStyledAttributes.getDimensionPixelSize(index2, ocVar.Z);
                        continue;
                    case 57:
                        i = indexCount2;
                        ocVar.a0 = obtainStyledAttributes.getDimensionPixelSize(index2, ocVar.a0);
                        continue;
                    case 58:
                        i = indexCount2;
                        ocVar.b0 = obtainStyledAttributes.getDimensionPixelSize(index2, ocVar.b0);
                        continue;
                    case 59:
                        i = indexCount2;
                        ocVar.c0 = obtainStyledAttributes.getDimensionPixelSize(index2, ocVar.c0);
                        continue;
                    case 60:
                        i = indexCount2;
                        rcVar.a = obtainStyledAttributes.getFloat(index2, rcVar.a);
                        continue;
                    case 61:
                        i = indexCount2;
                        ocVar.z = f(obtainStyledAttributes, index2, ocVar.z);
                        continue;
                    case 62:
                        i = indexCount2;
                        ocVar.A = obtainStyledAttributes.getDimensionPixelSize(index2, ocVar.A);
                        continue;
                    case 63:
                        i = indexCount2;
                        ocVar.B = obtainStyledAttributes.getFloat(index2, ocVar.B);
                        continue;
                    case 64:
                        i = indexCount2;
                        pcVar.a = f(obtainStyledAttributes, index2, pcVar.a);
                        continue;
                    case 65:
                        i = indexCount2;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            pcVar.getClass();
                            break;
                        } else {
                            String str = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            pcVar.getClass();
                            break;
                        }
                    case 66:
                        i = indexCount2;
                        obtainStyledAttributes.getInt(index2, 0);
                        pcVar.getClass();
                        continue;
                    case 67:
                        i = indexCount2;
                        pcVar.e = obtainStyledAttributes.getFloat(index2, pcVar.e);
                        break;
                    case 68:
                        i = indexCount2;
                        qcVar.d = obtainStyledAttributes.getFloat(index2, qcVar.d);
                        break;
                    case 69:
                        i = indexCount2;
                        ocVar.d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        ocVar.e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        ocVar.f0 = obtainStyledAttributes.getInt(index2, ocVar.f0);
                        break;
                    case 73:
                        i = indexCount2;
                        ocVar.g0 = obtainStyledAttributes.getDimensionPixelSize(index2, ocVar.g0);
                        break;
                    case 74:
                        i = indexCount2;
                        ocVar.j0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        ocVar.n0 = obtainStyledAttributes.getBoolean(index2, ocVar.n0);
                        break;
                    case 76:
                        i = indexCount2;
                        pcVar.c = obtainStyledAttributes.getInt(index2, pcVar.c);
                        break;
                    case 77:
                        i = indexCount2;
                        ocVar.k0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        qcVar.b = obtainStyledAttributes.getInt(index2, qcVar.b);
                        break;
                    case 79:
                        i = indexCount2;
                        pcVar.d = obtainStyledAttributes.getFloat(index2, pcVar.d);
                        break;
                    case 80:
                        i = indexCount2;
                        ocVar.l0 = obtainStyledAttributes.getBoolean(index2, ocVar.l0);
                        break;
                    case 81:
                        i = indexCount2;
                        ocVar.m0 = obtainStyledAttributes.getBoolean(index2, ocVar.m0);
                        break;
                    case 82:
                        i = indexCount2;
                        pcVar.b = obtainStyledAttributes.getInteger(index2, pcVar.b);
                        break;
                    case 83:
                        i = indexCount2;
                        rcVar.h = f(obtainStyledAttributes, index2, rcVar.h);
                        break;
                    case 84:
                        i = indexCount2;
                        pcVar.g = obtainStyledAttributes.getInteger(index2, pcVar.g);
                        break;
                    case 85:
                        i = indexCount2;
                        pcVar.f = obtainStyledAttributes.getFloat(index2, pcVar.f);
                        break;
                    case 86:
                        i = indexCount2;
                        int i9 = obtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            pcVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        } else if (i9 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            pcVar.h = string2;
                            if (string2.indexOf("/") > 0) {
                                pcVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                                break;
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, pcVar.i);
                            break;
                        }
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        i = indexCount2;
                        ocVar.q = f(obtainStyledAttributes, index2, ocVar.q);
                        break;
                    case 92:
                        i = indexCount2;
                        ocVar.r = f(obtainStyledAttributes, index2, ocVar.r);
                        break;
                    case 93:
                        i = indexCount2;
                        ocVar.L = obtainStyledAttributes.getDimensionPixelSize(index2, ocVar.L);
                        break;
                    case 94:
                        i = indexCount2;
                        ocVar.S = obtainStyledAttributes.getDimensionPixelSize(index2, ocVar.S);
                        break;
                    case 95:
                        i = indexCount2;
                        g(ocVar, obtainStyledAttributes, index2, 0);
                        continue;
                    case 96:
                        i = indexCount2;
                        g(ocVar, obtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        ocVar.o0 = obtainStyledAttributes.getInt(index2, ocVar.o0);
                        break;
                }
                i7++;
            }
            if (ocVar.j0 != null) {
                ocVar.i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return ncVar;
    }

    public static int f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
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
                    if (obj instanceof ic) {
                        ic icVar = (ic) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) icVar).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) icVar).height = 0;
                        }
                        h(icVar, trim2);
                        return;
                    }
                    if (obj instanceof oc) {
                        ((oc) obj).y = trim2;
                        return;
                    } else {
                        if (obj instanceof mc) {
                            ((mc) obj).d(trim2, 5);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof ic) {
                            ic icVar2 = (ic) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) icVar2).width = 0;
                                icVar2.H = parseFloat;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) icVar2).height = 0;
                                icVar2.I = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof oc) {
                            oc ocVar = (oc) obj;
                            if (i2 == 0) {
                                ocVar.b = 0;
                                ocVar.U = parseFloat;
                                return;
                            } else {
                                ocVar.c = 0;
                                ocVar.T = parseFloat;
                                return;
                            }
                        }
                        if (obj instanceof mc) {
                            mc mcVar = (mc) obj;
                            if (i2 == 0) {
                                mcVar.b(23, 0);
                                mcVar.a(39, parseFloat);
                                return;
                            } else {
                                mcVar.b(21, 0);
                                mcVar.a(40, parseFloat);
                                return;
                            }
                        }
                        return;
                    }
                    if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof ic) {
                            ic icVar3 = (ic) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) icVar3).width = 0;
                                icVar3.R = max;
                                icVar3.L = 2;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) icVar3).height = 0;
                                icVar3.S = max;
                                icVar3.M = 2;
                                return;
                            }
                        }
                        if (obj instanceof oc) {
                            oc ocVar2 = (oc) obj;
                            if (i2 == 0) {
                                ocVar2.b = 0;
                                ocVar2.d0 = max;
                                ocVar2.X = 2;
                                return;
                            } else {
                                ocVar2.c = 0;
                                ocVar2.e0 = max;
                                ocVar2.Y = 2;
                                return;
                            }
                        }
                        if (obj instanceof mc) {
                            mc mcVar2 = (mc) obj;
                            if (i2 == 0) {
                                mcVar2.b(23, 0);
                                mcVar2.b(54, 2);
                                return;
                            } else {
                                mcVar2.b(21, 0);
                                mcVar2.b(55, 2);
                                return;
                            }
                        }
                        return;
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
                z = false;
            }
            if (!(obj instanceof ic)) {
                ic icVar4 = (ic) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) icVar4).width = i4;
                    icVar4.W = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) icVar4).height = i4;
                    icVar4.X = z;
                    return;
                }
            }
            if (obj instanceof oc) {
                oc ocVar3 = (oc) obj;
                if (i2 == 0) {
                    ocVar3.b = i4;
                    ocVar3.l0 = z;
                    return;
                } else {
                    ocVar3.c = i4;
                    ocVar3.m0 = z;
                    return;
                }
            }
            if (obj instanceof mc) {
                mc mcVar3 = (mc) obj;
                if (i2 == 0) {
                    mcVar3.b(23, i4);
                    mcVar3.c(80, z);
                    return;
                } else {
                    mcVar3.b(21, i4);
                    mcVar3.c(81, z);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z = false;
        i4 = dimensionPixelSize;
        if (!(obj instanceof ic)) {
        }
    }

    public static void h(ic icVar, String str) {
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
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
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
        icVar.G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        int i2;
        String str;
        HashMap hashMap;
        String str2;
        sc scVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = scVar.c;
        HashSet hashSet2 = new HashSet(hashMap2.keySet());
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
                if (scVar.b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        nc ncVar = (nc) hashMap2.get(Integer.valueOf(id));
                        if (ncVar != null) {
                            qc qcVar = ncVar.b;
                            oc ocVar = ncVar.d;
                            rc rcVar = ncVar.e;
                            if (childAt instanceof c7) {
                                ocVar.h0 = 1;
                                c7 c7Var = (c7) childAt;
                                c7Var.setId(id);
                                c7Var.setType(ocVar.f0);
                                c7Var.setMargin(ocVar.g0);
                                c7Var.setAllowsGoneWidget(ocVar.n0);
                                int[] iArr = ocVar.i0;
                                if (iArr != null) {
                                    c7Var.setReferencedIds(iArr);
                                } else {
                                    String str3 = ocVar.j0;
                                    if (str3 != null) {
                                        int[] c = c(c7Var, str3);
                                        ocVar.i0 = c;
                                        c7Var.setReferencedIds(c);
                                    }
                                }
                            }
                            ic icVar = (ic) childAt.getLayoutParams();
                            icVar.a();
                            ncVar.a(icVar);
                            HashMap hashMap3 = ncVar.f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                fc fcVar = (fc) hashMap3.get(str4);
                                HashSet hashSet3 = hashSet2;
                                if (fcVar.a) {
                                    i2 = i3;
                                    str = str4;
                                } else {
                                    i2 = i3;
                                    str = "set" + str4;
                                }
                                try {
                                    int h = n20.h(fcVar.b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (h) {
                                        case 0:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(fcVar.c));
                                            break;
                                        case 1:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(fcVar.d));
                                            break;
                                        case 2:
                                            hashMap = hashMap3;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(fcVar.g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            hashMap = hashMap3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(fcVar.g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e2) {
                                                e = e2;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName(), e);
                                                hashSet2 = hashSet3;
                                                i3 = i2;
                                                hashMap3 = hashMap;
                                            } catch (NoSuchMethodException e3) {
                                                e = e3;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                                hashSet2 = hashSet3;
                                                i3 = i2;
                                                hashMap3 = hashMap;
                                            } catch (InvocationTargetException e4) {
                                                e = e4;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName(), e);
                                                hashSet2 = hashSet3;
                                                i3 = i2;
                                                hashMap3 = hashMap;
                                            }
                                        case 4:
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, fcVar.e);
                                            hashMap = hashMap3;
                                            break;
                                        case 5:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(fcVar.f));
                                            hashMap = hashMap3;
                                            break;
                                        case 6:
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(fcVar.d));
                                            hashMap = hashMap3;
                                            break;
                                        case 7:
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(fcVar.c));
                                            hashMap = hashMap3;
                                            break;
                                        default:
                                            hashMap = hashMap3;
                                            break;
                                    }
                                } catch (IllegalAccessException e5) {
                                    e = e5;
                                    hashMap = hashMap3;
                                } catch (NoSuchMethodException e6) {
                                    e = e6;
                                    hashMap = hashMap3;
                                } catch (InvocationTargetException e7) {
                                    e = e7;
                                    hashMap = hashMap3;
                                }
                                hashSet2 = hashSet3;
                                i3 = i2;
                                hashMap3 = hashMap;
                            }
                            hashSet = hashSet2;
                            i = i3;
                            childAt.setLayoutParams(icVar);
                            if (qcVar.b == 0) {
                                childAt.setVisibility(qcVar.a);
                            }
                            childAt.setAlpha(qcVar.c);
                            childAt.setRotation(rcVar.a);
                            childAt.setRotationX(rcVar.b);
                            childAt.setRotationY(rcVar.c);
                            childAt.setScaleX(rcVar.d);
                            childAt.setScaleY(rcVar.e);
                            if (rcVar.h != -1) {
                                if (((View) childAt.getParent()).findViewById(rcVar.h) != null) {
                                    float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                    float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(rcVar.f)) {
                                    childAt.setPivotX(rcVar.f);
                                }
                                if (!Float.isNaN(rcVar.g)) {
                                    childAt.setPivotY(rcVar.g);
                                }
                            }
                            childAt.setTranslationX(rcVar.i);
                            childAt.setTranslationY(rcVar.j);
                            childAt.setTranslationZ(rcVar.k);
                            if (rcVar.l) {
                                childAt.setElevation(rcVar.m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i3;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i3 = i + 1;
                    scVar = this;
                    hashSet2 = hashSet;
                }
            }
            hashSet = hashSet2;
            i = i3;
            i3 = i + 1;
            scVar = this;
            hashSet2 = hashSet;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            nc ncVar2 = (nc) hashMap2.get(num);
            if (ncVar2 != null) {
                oc ocVar2 = ncVar2.d;
                if (ocVar2.h0 == 1) {
                    Context context = constraintLayout.getContext();
                    c7 c7Var2 = new c7(context);
                    c7Var2.f = new int[32];
                    c7Var2.l = new HashMap();
                    c7Var2.h = context;
                    d7 d7Var = new d7();
                    d7Var.s0 = 0;
                    d7Var.t0 = true;
                    d7Var.u0 = 0;
                    d7Var.v0 = false;
                    c7Var2.o = d7Var;
                    c7Var2.i = d7Var;
                    c7Var2.i();
                    c7Var2.setVisibility(8);
                    c7Var2.setId(num.intValue());
                    int[] iArr2 = ocVar2.i0;
                    if (iArr2 != null) {
                        c7Var2.setReferencedIds(iArr2);
                    } else {
                        String str5 = ocVar2.j0;
                        if (str5 != null) {
                            int[] c2 = c(c7Var2, str5);
                            ocVar2.i0 = c2;
                            c7Var2.setReferencedIds(c2);
                        }
                    }
                    c7Var2.setType(ocVar2.f0);
                    c7Var2.setMargin(ocVar2.g0);
                    ic g = ConstraintLayout.g();
                    c7Var2.i();
                    ncVar2.a(g);
                    constraintLayout.addView(c7Var2, g);
                }
                if (ocVar2.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ic g2 = ConstraintLayout.g();
                    ncVar2.a(g2);
                    constraintLayout.addView(guideline, g2);
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = constraintLayout.getChildAt(i4);
            if (childAt2 instanceof gc) {
                ((gc) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i;
        HashMap hashMap;
        int i2;
        sc scVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = scVar.c;
        hashMap2.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            ic icVar = (ic) childAt.getLayoutParams();
            int id = childAt.getId();
            if (scVar.b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                hashMap2.put(Integer.valueOf(id), new nc());
            }
            nc ncVar = (nc) hashMap2.get(Integer.valueOf(id));
            if (ncVar == null) {
                i = childCount;
                hashMap = hashMap2;
                i2 = i3;
            } else {
                qc qcVar = ncVar.b;
                oc ocVar = ncVar.d;
                rc rcVar = ncVar.e;
                i = childCount;
                HashMap hashMap3 = new HashMap();
                hashMap = hashMap2;
                Class<?> cls = childAt.getClass();
                i2 = i3;
                HashMap hashMap4 = scVar.a;
                for (String str : hashMap4.keySet()) {
                    fc fcVar = (fc) hashMap4.get(str);
                    HashMap hashMap5 = hashMap4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new fc(fcVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new fc(fcVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e2) {
                        Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e2);
                    } catch (NoSuchMethodException e3) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e3);
                    } catch (InvocationTargetException e4) {
                        Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e4);
                    }
                    hashMap4 = hashMap5;
                }
                ncVar.f = hashMap3;
                ncVar.a = id;
                ocVar.h = icVar.e;
                ocVar.i = icVar.f;
                ocVar.j = icVar.g;
                ocVar.k = icVar.h;
                ocVar.l = icVar.i;
                ocVar.m = icVar.j;
                ocVar.n = icVar.k;
                ocVar.o = icVar.l;
                ocVar.p = icVar.m;
                ocVar.q = icVar.n;
                ocVar.r = icVar.o;
                ocVar.s = icVar.s;
                ocVar.t = icVar.t;
                ocVar.u = icVar.u;
                ocVar.v = icVar.v;
                ocVar.w = icVar.E;
                ocVar.x = icVar.F;
                ocVar.y = icVar.G;
                ocVar.z = icVar.p;
                ocVar.A = icVar.q;
                ocVar.B = icVar.r;
                ocVar.C = icVar.T;
                ocVar.D = icVar.U;
                ocVar.E = icVar.V;
                ocVar.f = icVar.c;
                ocVar.d = icVar.a;
                ocVar.e = icVar.b;
                ocVar.b = ((ViewGroup.MarginLayoutParams) icVar).width;
                ocVar.c = ((ViewGroup.MarginLayoutParams) icVar).height;
                ocVar.F = ((ViewGroup.MarginLayoutParams) icVar).leftMargin;
                ocVar.G = ((ViewGroup.MarginLayoutParams) icVar).rightMargin;
                ocVar.H = ((ViewGroup.MarginLayoutParams) icVar).topMargin;
                ocVar.I = ((ViewGroup.MarginLayoutParams) icVar).bottomMargin;
                ocVar.L = icVar.D;
                ocVar.T = icVar.I;
                ocVar.U = icVar.H;
                ocVar.W = icVar.K;
                ocVar.V = icVar.J;
                ocVar.l0 = icVar.W;
                ocVar.m0 = icVar.X;
                ocVar.X = icVar.L;
                ocVar.Y = icVar.M;
                ocVar.Z = icVar.P;
                ocVar.a0 = icVar.Q;
                ocVar.b0 = icVar.N;
                ocVar.c0 = icVar.O;
                ocVar.d0 = icVar.R;
                ocVar.e0 = icVar.S;
                ocVar.k0 = icVar.Y;
                ocVar.N = icVar.x;
                ocVar.P = icVar.z;
                ocVar.M = icVar.w;
                ocVar.O = icVar.y;
                ocVar.R = icVar.A;
                ocVar.Q = icVar.B;
                ocVar.S = icVar.C;
                ocVar.o0 = icVar.Z;
                ocVar.J = icVar.getMarginEnd();
                ocVar.K = icVar.getMarginStart();
                qcVar.a = childAt.getVisibility();
                qcVar.c = childAt.getAlpha();
                rcVar.a = childAt.getRotation();
                rcVar.b = childAt.getRotationX();
                rcVar.c = childAt.getRotationY();
                rcVar.d = childAt.getScaleX();
                rcVar.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    rcVar.f = pivotX;
                    rcVar.g = pivotY;
                }
                rcVar.i = childAt.getTranslationX();
                rcVar.j = childAt.getTranslationY();
                rcVar.k = childAt.getTranslationZ();
                if (rcVar.l) {
                    rcVar.m = childAt.getElevation();
                }
                if (childAt instanceof c7) {
                    c7 c7Var = (c7) childAt;
                    ocVar.n0 = c7Var.getAllowsGoneWidget();
                    ocVar.i0 = c7Var.getReferencedIds();
                    ocVar.f0 = c7Var.getType();
                    ocVar.g0 = c7Var.getMargin();
                }
            }
            i3 = i2 + 1;
            scVar = this;
            childCount = i;
            hashMap2 = hashMap;
        }
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    nc d2 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d2.d.a = true;
                    }
                    this.c.put(Integer.valueOf(d2.a), d2);
                }
            }
        } catch (IOException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e2);
        } catch (XmlPullParserException e3) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e3);
        }
    }
}
