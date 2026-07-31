package io.bidmachine.analytics.internal.a;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes12.dex */
public final class f implements Comparable {
    public static final a d = new a(null);
    private final int a;
    private final int b;
    private final int c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(String str) {
            try {
                if (StringsKt.isBlank(str)) {
                    return null;
                }
                List split$default = StringsKt.split$default((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null);
                if (split$default.isEmpty()) {
                    return null;
                }
                int size = split$default.size();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (i < size && i <= 6) {
                    if (i == 0) {
                        i2 = Integer.parseInt((String) split$default.get(0));
                    } else if (i != 1) {
                        i4 = i != 2 ? (i4 * 100) + Integer.parseInt((String) split$default.get(i)) : Integer.parseInt((String) split$default.get(2));
                    } else {
                        i3 = Integer.parseInt((String) split$default.get(1));
                    }
                    i++;
                }
                return new f(i2, i3, i4);
            } catch (Throwable unused) {
                return null;
            }
        }

        private a() {
        }
    }

    public f(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        int compare = Intrinsics.compare(this.a, fVar.a);
        if (compare != 0) {
            return compare;
        }
        int compare2 = Intrinsics.compare(this.b, fVar.b);
        return compare2 != 0 ? compare2 : Intrinsics.compare(this.c, fVar.c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && this.b == fVar.b && this.c == fVar.c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('.');
        sb.append(this.b);
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }
}
