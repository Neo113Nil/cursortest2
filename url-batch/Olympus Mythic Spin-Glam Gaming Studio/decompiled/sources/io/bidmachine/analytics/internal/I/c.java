package io.bidmachine.analytics.internal.I;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* loaded from: classes9.dex */
public final class c {
    public static final a e = new a(null);
    private final e a;
    private final int b;
    private final int c;
    private final int d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(e eVar, int i, int i2, int i3) {
        this.a = eVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final List a(Object obj, String str, Function1 function1) {
        Object m8023constructorimpl;
        Object obj2;
        String str2;
        String sb;
        if (obj == null) {
            return CollectionsKt.emptyList();
        }
        IdentityHashMap identityHashMap = new IdentityHashMap();
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        int i = 0;
        arrayDeque.add(new Triple(obj, 0, ""));
        identityHashMap.put(obj, Boolean.TRUE);
        while (!arrayDeque.isEmpty() && arrayList.size() < this.c) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Triple triple = (Triple) arrayDeque.removeFirst();
                Object component1 = triple.component1();
                int intValue = ((Number) triple.component2()).intValue();
                String str3 = (String) triple.component3();
                try {
                    if (((Boolean) function1.invoke(component1)).booleanValue()) {
                        arrayList.add(TuplesKt.to(component1, str3));
                    }
                    if (intValue < this.b) {
                        String str4 = null;
                        if (component1 instanceof Map) {
                            for (Object obj3 : SequencesKt.toList(SequencesKt.filterNotNull(SequencesKt.take(CollectionsKt.asSequence(((Map) component1).values()), this.d)))) {
                                if (!a(obj3) && identityHashMap.put(obj3, Boolean.TRUE) == null) {
                                    arrayDeque.add(new Triple(obj3, Integer.valueOf(intValue + 1), null));
                                }
                            }
                        } else if (component1 instanceof Iterable) {
                            for (Object obj4 : SequencesKt.toList(SequencesKt.filterNotNull(SequencesKt.take(CollectionsKt.asSequence((Iterable) component1), this.d)))) {
                                if (!a(obj4) && identityHashMap.put(obj4, Boolean.TRUE) == null) {
                                    arrayDeque.add(new Triple(obj4, Integer.valueOf(intValue + 1), null));
                                }
                            }
                        } else if (component1 instanceof Object[]) {
                            for (Object obj5 : SequencesKt.filterNotNull(SequencesKt.take(ArraysKt.asSequence((Object[]) component1), this.d))) {
                                if (!a(obj5) && identityHashMap.put(obj5, Boolean.TRUE) == null) {
                                    arrayDeque.add(new Triple(obj5, Integer.valueOf(intValue + 1), null));
                                }
                            }
                        } else {
                            Field[] b = this.a.b(component1.getClass());
                            int length = b.length;
                            int i2 = i;
                            while (i2 < length) {
                                Field field = b[i2];
                                try {
                                    obj2 = field.get(component1);
                                } catch (Throwable unused) {
                                    obj2 = str4;
                                }
                                if (obj2 == null || a(obj2) || identityHashMap.put(obj2, Boolean.TRUE) != null) {
                                    str2 = str3;
                                } else {
                                    if (str3 == null) {
                                        sb = str4;
                                    } else if (Intrinsics.areEqual(str3, "")) {
                                        sb = field.getName();
                                    } else {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(str3);
                                        sb2.append(str);
                                        sb2.append(field.getName());
                                        sb = sb2.toString();
                                        str2 = str3;
                                        arrayDeque.add(new Triple(obj2, Integer.valueOf(intValue + 1), sb));
                                    }
                                    str2 = str3;
                                    arrayDeque.add(new Triple(obj2, Integer.valueOf(intValue + 1), sb));
                                }
                                i2++;
                                str3 = str2;
                                str4 = null;
                            }
                        }
                    }
                    try {
                        m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        th = th;
                        Result.Companion companion2 = Result.INSTANCE;
                        m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                        Result.m8026exceptionOrNullimpl(m8023constructorimpl);
                        i = 0;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            Result.m8026exceptionOrNullimpl(m8023constructorimpl);
            i = 0;
        }
        return arrayList;
    }

    public /* synthetic */ c(e eVar, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new e() : eVar, (i4 & 2) != 0 ? 10 : i, (i4 & 4) != 0 ? 1000 : i2, (i4 & 8) != 0 ? 32 : i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a(Object obj) {
        String name = obj.getClass().getName();
        return StringsKt.startsWith$default(name, "java.lang.", false, 2, (Object) null) || StringsKt.startsWith$default(name, "kotlin.", false, 2, (Object) null);
    }
}
