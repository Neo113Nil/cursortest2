package kotlin.text;

import java.util.Iterator;
import kotlin.collections.AbstractCollection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.SequencesKt;

/* compiled from: Regex.kt */
/* loaded from: classes15.dex */
public final class MatcherMatchResult$groups$1 extends AbstractCollection implements MatchGroupCollection {
    final /* synthetic */ MatcherMatchResult this$0;

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return false;
    }

    MatcherMatchResult$groups$1(MatcherMatchResult matcherMatchResult) {
        this.this$0 = matcherMatchResult;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof MatchGroup) {
            return contains((MatchGroup) obj);
        }
        return false;
    }

    public /* bridge */ boolean contains(MatchGroup matchGroup) {
        return super.contains((Object) matchGroup);
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        java.util.regex.MatchResult matchResult;
        matchResult = this.this$0.getMatchResult();
        return matchResult.groupCount() + 1;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return SequencesKt.map(CollectionsKt.asSequence(CollectionsKt.getIndices(this)), new Function1() { // from class: kotlin.text.MatcherMatchResult$groups$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                MatchGroup matchGroup;
                matchGroup = MatcherMatchResult$groups$1.this.get(((Integer) obj).intValue());
                return matchGroup;
            }
        }).iterator();
    }

    public MatchGroup get(int i) {
        java.util.regex.MatchResult matchResult;
        IntRange range;
        java.util.regex.MatchResult matchResult2;
        matchResult = this.this$0.getMatchResult();
        range = RegexKt.range(matchResult, i);
        if (range.getStart().intValue() < 0) {
            return null;
        }
        matchResult2 = this.this$0.getMatchResult();
        String group = matchResult2.group(i);
        Intrinsics.checkNotNullExpressionValue(group, "group(...)");
        return new MatchGroup(group, range);
    }
}
