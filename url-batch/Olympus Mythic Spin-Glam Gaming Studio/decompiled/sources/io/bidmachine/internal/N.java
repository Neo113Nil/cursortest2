package io.bidmachine.internal;

import io.bidmachine.core.Logger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* loaded from: classes12.dex */
public final class N {
    public static final N a = new N();

    private N() {
    }

    private final boolean a(boolean[] zArr, boolean z, Integer num) {
        boolean z2 = false;
        if (!Intrinsics.areEqual(ArraysKt.firstOrNull(zArr), Boolean.TRUE) || !z) {
            return false;
        }
        if ((num != null && num.intValue() == 0) || (num != null && num.intValue() == 2)) {
            z2 = true;
        }
        return true ^ z2;
    }

    private final O c(String str) {
        String a2 = a(StringsKt.substringBefore(str, '.', str));
        if (a2 == null) {
            return null;
        }
        a aVar = new a(a2);
        aVar.c(6);
        aVar.d(36);
        aVar.d(36);
        aVar.d(12);
        aVar.d(12);
        aVar.d(6);
        aVar.d(12);
        aVar.d(12);
        aVar.d(6);
        boolean z = true;
        aVar.d(1);
        aVar.d(1);
        aVar.d(12);
        boolean[] b = aVar.b(24);
        boolean[] b2 = aVar.b(24);
        aVar.d(1);
        aVar.d(12);
        boolean b3 = b(aVar, 736);
        boolean b4 = b(aVar, 736);
        Map a3 = a(aVar, 736);
        boolean a4 = a(b, b3, (Integer) a3.get(1));
        Iterable intRange = new IntRange(2, 10);
        if (!(intRange instanceof Collection) || !((Collection) intRange).isEmpty()) {
            Iterator it = intRange.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int nextInt = ((IntIterator) it).nextInt();
                if (a.a(nextInt, b2, b4, (Integer) a3.get(Integer.valueOf(nextInt)))) {
                    z = false;
                    break;
                }
            }
        }
        return new O(a4, z);
    }

    public final O b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            return c(str);
        } catch (Throwable th) {
            Logger.e(th);
            return null;
        }
    }

    private static final class a {
        private final String a;
        private int b;

        public a(String bits) {
            Intrinsics.checkNotNullParameter(bits, "bits");
            this.a = bits;
        }

        public final boolean a() {
            a(1);
            String str = this.a;
            int i = this.b;
            this.b = i + 1;
            return str.charAt(i) == '1';
        }

        public final boolean[] b(int i) {
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < i; i2++) {
                zArr[i2] = a();
            }
            return zArr;
        }

        public final int c(int i) {
            a(i);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i2 << 1;
                String str = this.a;
                int i5 = this.b;
                this.b = i5 + 1;
                i2 = i4 | (str.charAt(i5) == '1' ? 1 : 0);
            }
            return i2;
        }

        public final void d(int i) {
            a(i);
            this.b += i;
        }

        private final void a(int i) {
            if (this.b + i > this.a.length()) {
                throw new IllegalArgumentException("Not enough bits");
            }
        }
    }

    private final boolean a(int i, boolean[] zArr, boolean z, Integer num) {
        boolean z2 = zArr[i - 1];
        boolean z3 = false;
        if (!z2 || !z) {
            return false;
        }
        if ((num != null && num.intValue() == 0) || (num != null && num.intValue() == 1)) {
            z3 = true;
        }
        return !z3;
    }

    private final boolean b(a aVar, int i) {
        int c = aVar.c(16);
        int i2 = 0;
        if (!aVar.a()) {
            boolean z = false;
            while (i2 < c) {
                boolean a2 = aVar.a();
                i2++;
                if (i2 == i) {
                    z = a2;
                }
            }
            return z;
        }
        int c2 = aVar.c(12);
        boolean z2 = false;
        while (i2 < c2) {
            boolean a3 = aVar.a();
            int c3 = aVar.c(16);
            int c4 = a3 ? aVar.c(16) : c3;
            if (c3 <= i && i <= c4) {
                z2 = true;
            }
            i2++;
        }
        return z2;
    }

    private final Map a(a aVar, int i) {
        int i2;
        int c = aVar.c(12);
        if (c == 0) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i3 = 0; i3 < c; i3++) {
            int c2 = aVar.c(6);
            int c3 = aVar.c(2);
            int c4 = aVar.c(12);
            for (int i4 = 0; i4 < c4; i4++) {
                boolean a2 = aVar.a();
                int c5 = aVar.c(16);
                int c6 = a2 ? aVar.c(16) : c5;
                if (c5 <= i && i <= c6) {
                    Integer valueOf = Integer.valueOf(c2);
                    Object obj = linkedHashMap.get(valueOf);
                    if (obj == null) {
                        obj = new ArrayList();
                        linkedHashMap.put(valueOf, obj);
                    }
                    ((List) obj).add(Integer.valueOf(c3));
                }
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            if (!list.contains(0)) {
                i2 = 1;
                if (!list.contains(1) || !list.contains(2)) {
                    if (!list.contains(1)) {
                        i2 = list.contains(2) ? 2 : ((Number) CollectionsKt.first(list)).intValue();
                    }
                    linkedHashMap2.put(key, Integer.valueOf(i2));
                }
            }
            i2 = 0;
            linkedHashMap2.put(key, Integer.valueOf(i2));
        }
        return linkedHashMap2;
    }

    private final String a(String str) {
        StringBuilder sb = new StringBuilder(str.length() * 6);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            int indexOf$default = StringsKt.indexOf$default((CharSequence) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", str.charAt(i), 0, false, 6, (Object) null);
            if (indexOf$default < 0) {
                return null;
            }
            String num = Integer.toString(indexOf$default, CharsKt.checkRadix(2));
            Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
            sb.append(StringsKt.padStart(num, 6, '0'));
        }
        return sb.toString();
    }
}
