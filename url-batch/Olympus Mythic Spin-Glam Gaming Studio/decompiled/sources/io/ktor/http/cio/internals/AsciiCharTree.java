package io.ktor.http.cio.internals;

import io.ktor.http.cio.internals.AsciiCharTree;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AsciiCharTree.kt */
/* loaded from: classes14.dex */
public final class AsciiCharTree {
    public static final Companion Companion = new Companion(null);
    private final Node root;

    /* compiled from: AsciiCharTree.kt */
    public static final class Node {
        private final Node[] array;
        private final char ch;
        private final List children;
        private final List exact;

        public Node(char c, List exact, List children) {
            Intrinsics.checkNotNullParameter(exact, "exact");
            Intrinsics.checkNotNullParameter(children, "children");
            this.ch = c;
            this.exact = exact;
            this.children = children;
            Node[] nodeArr = new Node[256];
            for (int i = 0; i < 256; i++) {
                Iterator it = this.children.iterator();
                Object obj = null;
                boolean z = false;
                Object obj2 = null;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((Node) next).ch == i) {
                            if (z) {
                                break;
                            }
                            z = true;
                            obj2 = next;
                        }
                    } else if (z) {
                        obj = obj2;
                    }
                }
                nodeArr[i] = obj;
            }
            this.array = nodeArr;
        }
    }

    public AsciiCharTree(Node root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.root = root;
    }

    /* compiled from: AsciiCharTree.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int build$lambda$0(CharSequence it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.length();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final char build$lambda$1(CharSequence s, int i) {
            Intrinsics.checkNotNullParameter(s, "s");
            return s.charAt(i);
        }

        public final AsciiCharTree build(List from) {
            Intrinsics.checkNotNullParameter(from, "from");
            return build(from, new Function1() { // from class: io.ktor.http.cio.internals.AsciiCharTree$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int build$lambda$0;
                    build$lambda$0 = AsciiCharTree.Companion.build$lambda$0((CharSequence) obj);
                    return Integer.valueOf(build$lambda$0);
                }
            }, new Function2() { // from class: io.ktor.http.cio.internals.AsciiCharTree$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    char build$lambda$1;
                    build$lambda$1 = AsciiCharTree.Companion.build$lambda$1((CharSequence) obj, ((Integer) obj2).intValue());
                    return Character.valueOf(build$lambda$1);
                }
            });
        }

        public final AsciiCharTree build(List from, Function1 length, Function2 charAt) {
            Object obj;
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(length, "length");
            Intrinsics.checkNotNullParameter(charAt, "charAt");
            List list = from;
            Iterator it = list.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    Comparable comparable = (Comparable) length.invoke(next);
                    do {
                        Object next2 = it.next();
                        Comparable comparable2 = (Comparable) length.invoke(next2);
                        if (comparable.compareTo(comparable2) < 0) {
                            next = next2;
                            comparable = comparable2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            if (obj != null) {
                int intValue = ((Number) length.invoke(obj)).intValue();
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (((Number) length.invoke(it2.next())).intValue() == 0) {
                            throw new IllegalArgumentException("There should be no empty entries");
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                build(arrayList, from, intValue, 0, length, charAt);
                arrayList.trimToSize();
                return new AsciiCharTree(new Node((char) 0, CollectionsKt.emptyList(), arrayList));
            }
            throw new NoSuchElementException("Unable to build char tree from an empty list");
        }

        private final void build(List list, List list2, int i, int i2, Function1 function1, Function2 function2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list2) {
                Character ch = (Character) function2.invoke(obj, Integer.valueOf(i2));
                ch.charValue();
                Object obj2 = linkedHashMap.get(ch);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(ch, obj2);
                }
                ((List) obj2).add(obj);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                char charValue = ((Character) entry.getKey()).charValue();
                List list3 = (List) entry.getValue();
                int i3 = i2 + 1;
                ArrayList arrayList = new ArrayList();
                Companion companion = AsciiCharTree.Companion;
                List list4 = list3;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list4) {
                    if (((Number) function1.invoke(obj3)).intValue() > i3) {
                        arrayList2.add(obj3);
                    }
                }
                companion.build(arrayList, arrayList2, i, i3, function1, function2);
                arrayList.trimToSize();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list4) {
                    if (((Number) function1.invoke(obj4)).intValue() == i3) {
                        arrayList3.add(obj4);
                    }
                }
                list.add(new Node(charValue, arrayList3, arrayList));
            }
        }
    }
}
