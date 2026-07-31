package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ἲ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1082 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public ArrayList f2736;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public C1084 f2737;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public C1083 f2738;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Field m4370(Class cls, Class cls2) {
        Field m4369;
        synchronized (AbstractC0530.class) {
            try {
                if (this.f2737 == null) {
                    this.f2737 = new C1084();
                }
                C1084 c1084 = this.f2737;
                c1084.f2744 = cls2;
                m4369 = m4369(cls, c1084);
            } catch (Throwable th) {
                throw th;
            }
        }
        return m4369;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Field m4369(Class cls, C1084 c1084) {
        synchronized (AbstractC0530.class) {
            try {
                if (this.f2736 == null) {
                    this.f2736 = new ArrayList();
                }
                this.f2736.clear();
                m4371(cls, c1084, this.f2736);
                if (this.f2736.isEmpty()) {
                    return null;
                }
                return (Field) this.f2736.get(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4371(Class cls, C1084 c1084, ArrayList arrayList) {
        synchronized (C1082.class) {
            try {
                if (this.f2738 == null) {
                    this.f2738 = new C1083();
                }
                C1083 c1083 = this.f2738;
                c1083.f2740 = c1084;
                c1083.f2739 = c1084.f2743;
                m4367(cls, c1083, arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Field[] m4368(Class cls, boolean z, int i, List list) {
        while (cls != null && !AbstractC1226.m4479(cls, list)) {
            cls = cls.getSuperclass();
        }
        Field[] fieldArr = new Field[0];
        if (cls != null) {
            Field[] fieldArr2 = new Field[0];
            Field[] fieldArr3 = new Field[0];
            try {
                fieldArr2 = cls.getDeclaredFields();
            } catch (Error unused) {
            }
            try {
                fieldArr3 = cls.getFields();
            } catch (Error unused2) {
            }
            String str = AbstractC1226.f3226;
            int length = fieldArr2.length;
            int length2 = fieldArr3.length;
            Field[] fieldArr4 = new Field[length + length2];
            System.arraycopy(fieldArr2, 0, fieldArr4, 0, length);
            System.arraycopy(fieldArr3, 0, fieldArr4, length, length2);
            if (!z) {
                return fieldArr4;
            }
            Class superclass = cls.getSuperclass();
            fieldArr = fieldArr4;
            for (int i2 = 0; superclass != null && i2 != i; i2++) {
                try {
                    Field[] declaredFields = superclass.getDeclaredFields();
                    int length3 = fieldArr.length;
                    int length4 = declaredFields.length;
                    Field[] fieldArr5 = new Field[length3 + length4];
                    System.arraycopy(fieldArr, 0, fieldArr5, 0, length3);
                    System.arraycopy(declaredFields, 0, fieldArr5, length3, length4);
                    fieldArr = fieldArr5;
                } catch (Error unused3) {
                }
                try {
                    Field[] fields = superclass.getFields();
                    int length5 = fieldArr.length;
                    int length6 = fields.length;
                    Field[] fieldArr6 = new Field[length5 + length6];
                    System.arraycopy(fieldArr, 0, fieldArr6, 0, length5);
                    System.arraycopy(fields, 0, fieldArr6, length5, length6);
                    fieldArr = fieldArr6;
                } catch (Error unused4) {
                }
                superclass = superclass.getSuperclass();
            }
        }
        return fieldArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b A[SYNTHETIC] */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m4367(Class cls, C1083 c1083, ArrayList arrayList) {
        Field[] fields;
        boolean z;
        boolean isAssignableFrom;
        boolean z2;
        C1084 c1084 = c1083.f2740;
        if (c1084 != null && (z2 = c1084.f1128)) {
            fields = m4368(cls, z2, c1084.f1127, null);
        } else {
            try {
                fields = cls.getDeclaredFields();
            } catch (Error unused) {
                fields = cls.getFields();
            }
        }
        for (Field field : fields) {
            if (c1083.f2740 != null) {
                int modifiers = field.getModifiers();
                int i = c1083.f2740.f1126;
                if ((modifiers & i) == i) {
                    int modifiers2 = field.getModifiers();
                    C1084 c10842 = c1083.f2740;
                    if ((modifiers2 & c10842.f1125) == 0 && !c10842.f2741.contains(field.getType())) {
                        C1084 c10843 = c1083.f2740;
                        if (c10843.f2742) {
                            isAssignableFrom = field.getType().equals(c1083.f2740.f2744);
                        } else {
                            isAssignableFrom = c10843.f2744.isAssignableFrom(field.getType());
                        }
                        if (isAssignableFrom) {
                            int i2 = c1083.f2739;
                            if (i2 == 0) {
                                z = true;
                                if (!z) {
                                    field.setAccessible(true);
                                    arrayList.add(field);
                                }
                            } else {
                                c1083.f2739 = i2 - 1;
                            }
                        }
                    }
                }
            }
            z = false;
            if (!z) {
            }
        }
    }
}
