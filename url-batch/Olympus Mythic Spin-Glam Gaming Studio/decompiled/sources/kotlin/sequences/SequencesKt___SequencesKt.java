package kotlin.sequences;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Sequences.kt */
/* loaded from: classes.dex */
public abstract class SequencesKt___SequencesKt extends SequencesKt___SequencesJvmKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean filterNotNull$lambda$5$SequencesKt___SequencesKt(Object obj) {
        return obj == null;
    }

    public static boolean contains(Sequence sequence, Object obj) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return indexOf(sequence, obj) >= 0;
    }

    public static Object firstOrNull(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final int indexOf(Sequence sequence, Object obj) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        int i = 0;
        for (Object obj2 : sequence) {
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static Object last(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Sequence drop(Sequence sequence, int i) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        if (i >= 0) {
            return i == 0 ? sequence : sequence instanceof DropTakeSequence ? ((DropTakeSequence) sequence).drop(i) : new DropSequence(sequence, i);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static Sequence filter(Sequence sequence, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new FilteringSequence(sequence, true, predicate);
    }

    public static Sequence filterNot(Sequence sequence, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new FilteringSequence(sequence, false, predicate);
    }

    public static Sequence filterNotNull(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Sequence filterNot = SequencesKt.filterNot(sequence, new Function1() { // from class: kotlin.sequences.SequencesKt___SequencesKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean filterNotNull$lambda$5$SequencesKt___SequencesKt;
                filterNotNull$lambda$5$SequencesKt___SequencesKt = SequencesKt___SequencesKt.filterNotNull$lambda$5$SequencesKt___SequencesKt(obj);
                return Boolean.valueOf(filterNotNull$lambda$5$SequencesKt___SequencesKt);
            }
        });
        Intrinsics.checkNotNull(filterNot, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return filterNot;
    }

    public static Sequence take(Sequence sequence, int i) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return SequencesKt.emptySequence();
            }
            return sequence instanceof DropTakeSequence ? ((DropTakeSequence) sequence).take(i) : new TakeSequence(sequence, i);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static Sequence takeWhile(Sequence sequence, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new TakeWhileSequence(sequence, predicate);
    }

    public static Sequence sortedWith(final Sequence sequence, final Comparator comparator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new Sequence() { // from class: kotlin.sequences.SequencesKt___SequencesKt$sortedWith$1
            @Override // kotlin.sequences.Sequence
            public Iterator iterator() {
                List mutableList = SequencesKt___SequencesKt.toMutableList(Sequence.this);
                CollectionsKt.sortWith(mutableList, comparator);
                return mutableList.iterator();
            }
        };
    }

    public static final Collection toCollection(Sequence sequence, Collection destination) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator it = sequence.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static List toList(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return CollectionsKt.emptyList();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return CollectionsKt.listOf(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static final List toMutableList(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return (List) toCollection(sequence, new ArrayList());
    }

    public static Set toSet(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return SetsKt.emptySet();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return SetsKt.setOf(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static Sequence flatMapIterable(Sequence sequence, Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new FlatteningSequence(sequence, transform, SequencesKt___SequencesKt$flatMap$1.INSTANCE);
    }

    public static Sequence flatMap(Sequence sequence, Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new FlatteningSequence(sequence, transform, SequencesKt___SequencesKt$flatMap$2.INSTANCE);
    }

    public static Sequence map(Sequence sequence, Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new TransformingSequence(sequence, transform);
    }

    public static Sequence mapNotNull(Sequence sequence, Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return SequencesKt.filterNotNull(new TransformingSequence(sequence, transform));
    }

    public static int count(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return i;
    }

    public static Comparable maxOrNull(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Object minWithOrNull(Sequence sequence, Comparator comparator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static Sequence onEach(Sequence sequence, final Function1 action) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        return SequencesKt.map(sequence, new Function1() { // from class: kotlin.sequences.SequencesKt___SequencesKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object onEach$lambda$14$SequencesKt___SequencesKt;
                onEach$lambda$14$SequencesKt___SequencesKt = SequencesKt___SequencesKt.onEach$lambda$14$SequencesKt___SequencesKt(Function1.this, obj);
                return onEach$lambda$14$SequencesKt___SequencesKt;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onEach$lambda$14$SequencesKt___SequencesKt(Function1 function1, Object obj) {
        function1.invoke(obj);
        return obj;
    }

    public static Sequence runningFold(Sequence sequence, Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return SequencesKt.sequence(new SequencesKt___SequencesKt$runningFold$1(obj, sequence, operation, null));
    }

    public static Sequence plus(Sequence sequence, Sequence elements) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return SequencesKt__SequencesKt.flatten(SequencesKt.sequenceOf(sequence, elements));
    }

    public static Sequence zip(Sequence sequence, Sequence other) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new MergingSequence(sequence, other, new Function2() { // from class: kotlin.sequences.SequencesKt___SequencesKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Pair pair;
                pair = TuplesKt.to(obj, obj2);
                return pair;
            }
        });
    }

    public static final Appendable joinTo(Sequence sequence, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1 function1) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (Object obj : sequence) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            StringsKt.appendElement(buffer, obj, function1);
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static /* synthetic */ String joinToString$default(Sequence sequence, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return joinToString(sequence, charSequence, charSequence5, charSequence6, i3, charSequence7, function1);
    }

    public static final String joinToString(Sequence sequence, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1 function1) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return ((StringBuilder) joinTo(sequence, new StringBuilder(), separator, prefix, postfix, i, truncated, function1)).toString();
    }

    public static Iterable asIterable(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return new SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1(sequence);
    }

    public static long sumOfLong(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator it = sequence.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((Number) it.next()).longValue();
        }
        return j;
    }
}
