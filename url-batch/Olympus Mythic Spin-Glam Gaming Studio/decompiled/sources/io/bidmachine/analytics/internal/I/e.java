package io.bidmachine.analytics.internal.I;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* loaded from: classes12.dex */
public final class e {
    private final ConcurrentHashMap a = new ConcurrentHashMap();
    private final ConcurrentHashMap b = new ConcurrentHashMap();
    private final ConcurrentHashMap c = new ConcurrentHashMap();
    private final ConcurrentHashMap d = new ConcurrentHashMap();
    private final ConcurrentHashMap e = new ConcurrentHashMap();

    private static final class a {
        private final Class a;
        private final String b;
        private final boolean c;

        public a(Class cls, String str, boolean z) {
            this.a = cls;
            this.b = str;
            this.c = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b) && this.c == aVar.c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
            boolean z = this.c;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            return "FieldKey(owner=" + this.a + ", name=" + this.b + ", isStatic=" + this.c + ')';
        }
    }

    private static final class b {
        private final Class a;
        private final String b;
        private final List c;

        public b(Class cls, String str, List list) {
            this.a = cls;
            this.b = str;
            this.c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.a, bVar.a) && Intrinsics.areEqual(this.b, bVar.b) && Intrinsics.areEqual(this.c, bVar.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "MethodKey(owner=" + this.a + ", name=" + this.b + ", parameterTypes=" + this.c + ')';
        }
    }

    private static final class c {
        public static final c a = new c();

        private c() {
        }
    }

    static final class d extends Lambda implements Function1 {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Sequence invoke(Class cls) {
            return SequencesKt.plus(SequencesKt.sequenceOf(cls), e.this.a(cls));
        }
    }

    /* renamed from: io.bidmachine.analytics.internal.I.e$e, reason: collision with other inner class name */
    static final class C1728e extends Lambda implements Function1 {
        public static final C1728e a = new C1728e();

        C1728e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Class invoke(Class cls) {
            return cls.getSuperclass();
        }
    }

    static final class f extends Lambda implements Function1 {
        public static final f a = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Class cls) {
            return Boolean.valueOf(!Intrinsics.areEqual(cls, Object.class));
        }
    }

    static final class g extends Lambda implements Function1 {
        public static final g a = new g();

        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Sequence invoke(Class cls) {
            return ArraysKt.asSequence(cls.getDeclaredFields());
        }
    }

    static final class h extends Lambda implements Function1 {
        public static final h a = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Field field) {
            return Boolean.valueOf(!Modifier.isStatic(field.getModifiers()));
        }
    }

    static final class i extends Lambda implements Function1 {
        public static final i a = new i();

        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Field field) {
            return Boolean.valueOf((field.getType().isPrimitive() || field.getType().isEnum() || Intrinsics.areEqual(field.getType(), String.class)) ? false : true);
        }
    }

    static final class j extends Lambda implements Function1 {
        j() {
            super(1);
        }

        public final void a(Field field) {
            try {
                Result.Companion companion = Result.INSTANCE;
                field.setAccessible(true);
                Result.m8023constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Field) obj);
            return Unit.INSTANCE;
        }
    }

    static final class k extends Lambda implements Function1 {
        public static final k a = new k();

        k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Class invoke(Class cls) {
            return cls.getSuperclass();
        }
    }

    static final class l extends Lambda implements Function1 {
        public static final l a = new l();

        l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Class cls) {
            return Boolean.valueOf(!Intrinsics.areEqual(cls, Object.class));
        }
    }

    static final class m extends Lambda implements Function1 {
        m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Sequence invoke(Class cls) {
            return e.this.a(cls);
        }
    }

    public final Method b(Class cls, String str, List list) {
        b bVar = new b(cls, str, list);
        ConcurrentHashMap concurrentHashMap = this.b;
        Object obj = concurrentHashMap.get(bVar);
        if (obj == null) {
            Object c2 = c(cls, str, list);
            if (c2 == null) {
                c2 = c.a;
            }
            obj = c2;
            Object putIfAbsent = concurrentHashMap.putIfAbsent(bVar, obj);
            if (putIfAbsent != null) {
                obj = putIfAbsent;
            }
        }
        if (obj instanceof Method) {
            return (Method) obj;
        }
        return null;
    }

    public final Set c(Class cls) {
        Object m8023constructorimpl;
        ConcurrentHashMap concurrentHashMap = this.e;
        Object obj = concurrentHashMap.get(cls);
        if (obj == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(SequencesKt.toSet(SequencesKt.flatMap(SequencesKt.takeWhile(SequencesKt.generateSequence(cls, k.a), l.a), new m())));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            Set emptySet = SetsKt.emptySet();
            if (Result.m8028isFailureimpl(m8023constructorimpl)) {
                m8023constructorimpl = emptySet;
            }
            obj = (Set) m8023constructorimpl;
            Object putIfAbsent = concurrentHashMap.putIfAbsent(cls, obj);
            if (putIfAbsent != null) {
                obj = putIfAbsent;
            }
        }
        return (Set) obj;
    }

    public static /* synthetic */ Object a(e eVar, Object obj, String str, List list, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        return eVar.a(obj, str, list);
    }

    public final Object a(Object obj, String str, List list) {
        Class<?> cls = obj.getClass();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((Class) ((Pair) it.next()).getFirst());
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Pair) it2.next()).getSecond());
        }
        Object[] array = arrayList2.toArray(new Object[0]);
        Method b2 = b(cls, str, arrayList);
        if (b2 == null) {
            return null;
        }
        try {
            return b2.invoke(obj, Arrays.copyOf(array, array.length));
        } catch (Throwable unused) {
            return null;
        }
    }

    private final Method c(Class cls, String str, List list) {
        Method method;
        Method method2;
        Class[] clsArr = (Class[]) list.toArray(new Class[0]);
        try {
            method = cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (Throwable unused) {
            method = null;
        }
        if (method != null) {
            return method;
        }
        while (cls != null && !Intrinsics.areEqual(cls, Object.class)) {
            try {
                method2 = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (Throwable unused2) {
                method2 = null;
            }
            if (method2 != null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    method2.setAccessible(true);
                    Result.m8023constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m8023constructorimpl(ResultKt.createFailure(th));
                }
                return method2;
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    public final Field[] b(Class cls) {
        Object m8023constructorimpl;
        ConcurrentHashMap concurrentHashMap = this.c;
        Object obj = concurrentHashMap.get(cls);
        if (obj == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl((Field[]) SequencesKt.toList(SequencesKt.onEach(SequencesKt.filter(SequencesKt.filter(SequencesKt.flatMap(SequencesKt.takeWhile(SequencesKt.generateSequence(cls, C1728e.a), f.a), g.a), h.a), i.a), new j())).toArray(new Field[0]));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            Field[] fieldArr = new Field[0];
            if (Result.m8028isFailureimpl(m8023constructorimpl)) {
                m8023constructorimpl = fieldArr;
            }
            obj = (Field[]) m8023constructorimpl;
            Object putIfAbsent = concurrentHashMap.putIfAbsent(cls, obj);
            if (putIfAbsent != null) {
                obj = putIfAbsent;
            }
        }
        return (Field[]) obj;
    }

    public static /* synthetic */ Object a(e eVar, Class cls, String str, List list, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        return eVar.a(cls, str, list);
    }

    public final Class a(String str) {
        ConcurrentHashMap concurrentHashMap = this.a;
        Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            try {
                obj = Class.forName(str);
            } catch (Throwable unused) {
                obj = null;
            }
            if (obj == null) {
                obj = c.a;
            }
            Object putIfAbsent = concurrentHashMap.putIfAbsent(str, obj);
            if (putIfAbsent != null) {
                obj = putIfAbsent;
            }
        }
        if (obj instanceof Class) {
            return (Class) obj;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Field b(Class cls, String str, boolean z) {
        while (true) {
            Field field = null;
            if (cls == null || Intrinsics.areEqual(cls, Object.class)) {
                break;
            }
            try {
                field = cls.getDeclaredField(str);
            } catch (Throwable unused) {
            }
            if (field != null) {
                if (Modifier.isStatic(field.getModifiers()) != z) {
                    cls = cls.getSuperclass();
                } else {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        field.setAccessible(true);
                        Result.m8023constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m8023constructorimpl(ResultKt.createFailure(th));
                    }
                    return field;
                }
            } else {
                cls = cls.getSuperclass();
            }
        }
    }

    public final Field a(Class cls, String str, boolean z) {
        a aVar = new a(cls, str, z);
        ConcurrentHashMap concurrentHashMap = this.d;
        Object obj = concurrentHashMap.get(aVar);
        if (obj == null) {
            Object b2 = b(cls, str, z);
            if (b2 == null) {
                b2 = c.a;
            }
            obj = b2;
            Object putIfAbsent = concurrentHashMap.putIfAbsent(aVar, obj);
            if (putIfAbsent != null) {
                obj = putIfAbsent;
            }
        }
        if (obj instanceof Field) {
            return (Field) obj;
        }
        return null;
    }

    public final Object a(Class cls, Object obj, String str, boolean z) {
        Field a2;
        Object obj2 = null;
        if ((!z && obj == null) || (a2 = a(cls, str, z)) == null) {
            return null;
        }
        try {
            obj2 = z ? a2.get(null) : a2.get(obj);
            return obj2;
        } catch (Throwable unused) {
            return obj2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Sequence a(Class cls) {
        return SequencesKt.flatMap(ArraysKt.asSequence(cls.getInterfaces()), new d());
    }

    public final Object a(Class cls, String str, List list) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((Class) ((Pair) it.next()).getFirst());
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Pair) it2.next()).getSecond());
        }
        Object[] array = arrayList2.toArray(new Object[0]);
        Method b2 = b(cls, str, arrayList);
        if (b2 == null) {
            return null;
        }
        try {
            return b2.invoke(null, Arrays.copyOf(array, array.length));
        } catch (Throwable unused) {
            return null;
        }
    }
}
