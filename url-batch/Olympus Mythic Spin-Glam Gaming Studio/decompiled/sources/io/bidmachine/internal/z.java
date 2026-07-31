package io.bidmachine.internal;

import io.bidmachine.internal.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class z {
    public static final z a = new z();

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[C.values().length];
            try {
                iArr[C.COPPA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C.NON_PERSONALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C.GDPR_NO_CONSENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C.CCPA_OPT_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[y.values().length];
            try {
                iArr2[y.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[y.MODERATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[y.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private z() {
    }

    public static final w a(y privacyRestrictionMode, List kinds) {
        Intrinsics.checkNotNullParameter(privacyRestrictionMode, "privacyRestrictionMode");
        Intrinsics.checkNotNullParameter(kinds, "kinds");
        if (kinds.isEmpty()) {
            kinds = CollectionsKt.listOf(C.NONE);
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(kinds, 10));
        Iterator it = kinds.iterator();
        while (it.hasNext()) {
            arrayList.add(a.a(privacyRestrictionMode, (C) it.next()));
        }
        w b = w.f.b();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            b = b.a((w) it2.next());
        }
        return b;
    }

    private final w b(y yVar) {
        int i = a.$EnumSwitchMapping$1[yVar.ordinal()];
        if (i == 1) {
            return new w(null, null, null, null, null, 31, null);
        }
        if (i == 2) {
            return w.f.a();
        }
        if (i == 3) {
            return w.f.b();
        }
        throw new NoWhenBranchMatchedException();
    }

    private final w c(y yVar) {
        int i = a.$EnumSwitchMapping$1[yVar.ordinal()];
        if (i == 1) {
            w.b bVar = w.b.PASS;
            return new w(null, bVar, bVar, bVar, null, 17, null);
        }
        if (i != 2) {
            if (i == 3) {
                return w.f.b();
            }
            throw new NoWhenBranchMatchedException();
        }
        w.b bVar2 = w.b.MASK;
        w.b bVar3 = w.b.PASS;
        return new w(bVar2, bVar3, bVar3, bVar3, bVar2);
    }

    private final w d(y yVar) {
        int i = a.$EnumSwitchMapping$1[yVar.ordinal()];
        if (i == 1) {
            w.b bVar = w.b.PASS;
            return new w(null, bVar, bVar, bVar, null, 17, null);
        }
        if (i != 2) {
            if (i == 3) {
                return w.f.b();
            }
            throw new NoWhenBranchMatchedException();
        }
        w.b bVar2 = w.b.MASK;
        w.b bVar3 = w.b.PASS;
        return new w(bVar2, bVar3, bVar3, bVar3, bVar2);
    }

    private final w a(y yVar, C c) {
        int i = a.$EnumSwitchMapping$0[c.ordinal()];
        if (i == 1) {
            return b(yVar);
        }
        if (i == 2) {
            return d(yVar);
        }
        if (i == 3) {
            return c(yVar);
        }
        if (i == 4) {
            return a(yVar);
        }
        if (i == 5) {
            return a();
        }
        throw new NoWhenBranchMatchedException();
    }

    private final w a(y yVar) {
        int i = a.$EnumSwitchMapping$1[yVar.ordinal()];
        if (i == 1) {
            return w.f.b();
        }
        if (i == 2) {
            return w.f.b();
        }
        if (i == 3) {
            return w.f.b();
        }
        throw new NoWhenBranchMatchedException();
    }

    private final w a() {
        return w.f.b();
    }
}
