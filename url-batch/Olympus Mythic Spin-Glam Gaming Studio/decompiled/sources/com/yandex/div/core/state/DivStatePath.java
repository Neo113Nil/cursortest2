package com.yandex.div.core.state;

import androidx.annotation.VisibleForTesting;
import com.yandex.div.core.expression.local.ChildPathUnitCache;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div2.Div;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivData;
import com.yandex.div2.DivState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivStatePath.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 92\u00020\u0001:\u00019BE\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ'\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u0007H\u0000¢\u0006\u0002\b%J\u0018\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0007J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0007J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u001b\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÂ\u0003J\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005HÀ\u0003¢\u0006\u0002\b+J\u000e\u0010,\u001a\u00020\nHÀ\u0003¢\u0006\u0002\b-JI\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010!\u001a\u00020\u0007H\u0002J\u0013\u00100\u001a\u00020\n2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0018\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005J\t\u00103\u001a\u000204HÖ\u0001J\u000e\u00105\u001a\u00020\n2\u0006\u00101\u001a\u00020\u0000J\u0006\u00106\u001a\u00020\nJ\u0006\u00107\u001a\u00020\u0000J\b\u00108\u001a\u00020\u0007H\u0016R\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u00078@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0010R \u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u00078@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001c\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006:"}, d2 = {"Lcom/yandex/div/core/state/DivStatePath;", "", "topLevelStateId", "", "states", "", "Lkotlin/Pair;", "", "path", "containsOnlyStates", "", "(JLjava/util/List;Ljava/util/List;Z)V", "getContainsOnlyStates$div_release", "()Z", "fullPath", "getFullPath$div_release", "()Ljava/lang/String;", "fullPath$delegate", "Lkotlin/Lazy;", "lastDivId", "getLastDivId$div_release", "lastStateId", "getLastStateId", "getPath$div_release", "()Ljava/util/List;", "pathToLastState", "getPathToLastState", "statesString", "getStatesString$div_release", "statesString$delegate", "getTopLevelStateId", "()J", "append", "divId", "state", "Lcom/yandex/div2/DivState$State;", "stateIdFallback", "append$div_release", "stateId", "appendDiv", "component1", "component2", "component3", "component3$div_release", "component4", "component4$div_release", "copy", "createFullPath", "equals", "other", "getStates", "hashCode", "", "isAncestorOf", "isRootPath", "parentState", "toString", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DivStatePath {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean containsOnlyStates;

    /* renamed from: fullPath$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy fullPath;

    @NotNull
    private final List<String> path;

    @NotNull
    private final List<Pair<String, String>> states;

    /* renamed from: statesString$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy statesString;
    private final long topLevelStateId;

    private final List<Pair<String, String>> component2() {
        return this.states;
    }

    public static /* synthetic */ DivStatePath copy$default(DivStatePath divStatePath, long j, List list, List list2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = divStatePath.topLevelStateId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            list = divStatePath.states;
        }
        List list3 = list;
        if ((i & 4) != 0) {
            list2 = divStatePath.path;
        }
        List list4 = list2;
        if ((i & 8) != 0) {
            z = divStatePath.containsOnlyStates;
        }
        return divStatePath.copy(j2, list3, list4, z);
    }

    @NotNull
    public static final DivStatePath parse(@NotNull String str) throws PathFormatException {
        return INSTANCE.parse(str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTopLevelStateId() {
        return this.topLevelStateId;
    }

    @NotNull
    public final List<String> component3$div_release() {
        return this.path;
    }

    /* renamed from: component4$div_release, reason: from getter */
    public final boolean getContainsOnlyStates() {
        return this.containsOnlyStates;
    }

    @NotNull
    public final DivStatePath copy(long topLevelStateId, @NotNull List<Pair<String, String>> states, @NotNull List<String> path, boolean containsOnlyStates) {
        return new DivStatePath(topLevelStateId, states, path, containsOnlyStates);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DivStatePath)) {
            return false;
        }
        DivStatePath divStatePath = (DivStatePath) other;
        return this.topLevelStateId == divStatePath.topLevelStateId && Intrinsics.areEqual(this.states, divStatePath.states) && Intrinsics.areEqual(this.path, divStatePath.path) && this.containsOnlyStates == divStatePath.containsOnlyStates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((Long.hashCode(this.topLevelStateId) * 31) + this.states.hashCode()) * 31) + this.path.hashCode()) * 31;
        boolean z = this.containsOnlyStates;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    @VisibleForTesting
    public DivStatePath(long j, @NotNull List<Pair<String, String>> list, @NotNull List<String> list2, boolean z) {
        this.topLevelStateId = j;
        this.states = list;
        this.path = list2;
        this.containsOnlyStates = z;
        this.fullPath = LazyKt.lazy(new Function0() { // from class: com.yandex.div.core.state.DivStatePath$fullPath$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final String mo4828invoke() {
                return CollectionsKt.joinToString$default(DivStatePath.this.getPath$div_release(), "/", null, null, 0, null, null, 62, null);
            }
        });
        this.statesString = LazyKt.lazy(new Function0() { // from class: com.yandex.div.core.state.DivStatePath$statesString$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final String mo4828invoke() {
                String divId;
                String stateId;
                if (!DivStatePath.this.states.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(DivStatePath.this.getTopLevelStateId());
                    sb.append('/');
                    List<Pair> list3 = DivStatePath.this.states;
                    ArrayList arrayList = new ArrayList();
                    for (Pair pair : list3) {
                        divId = DivStatePathKt.getDivId(pair);
                        stateId = DivStatePathKt.getStateId(pair);
                        CollectionsKt.addAll(arrayList, CollectionsKt.listOf((Object[]) new String[]{divId, stateId}));
                    }
                    sb.append(CollectionsKt.joinToString$default(arrayList, "/", null, null, 0, null, null, 62, null));
                    return sb.toString();
                }
                return String.valueOf(DivStatePath.this.getTopLevelStateId());
            }
        });
    }

    public final long getTopLevelStateId() {
        return this.topLevelStateId;
    }

    public /* synthetic */ DivStatePath(long j, List list, List list2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.listOf(String.valueOf(j)) : list2, (i & 8) != 0 ? false : z);
    }

    @NotNull
    public final List<String> getPath$div_release() {
        return this.path;
    }

    public final boolean getContainsOnlyStates$div_release() {
        return this.containsOnlyStates;
    }

    @Nullable
    public final String getLastStateId() {
        String stateId;
        if (this.states.isEmpty()) {
            return null;
        }
        stateId = DivStatePathKt.getStateId((Pair) CollectionsKt.last((List) this.states));
        return stateId;
    }

    @Nullable
    public final String getPathToLastState() {
        String divId;
        if (this.states.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(new DivStatePath(this.topLevelStateId, this.states.subList(0, r1.size() - 1), this.path, false, 8, null).getStatesString$div_release());
        sb.append('/');
        divId = DivStatePathKt.getDivId((Pair) CollectionsKt.last((List) this.states));
        sb.append(divId);
        return sb.toString();
    }

    @NotNull
    public final String getLastDivId$div_release() {
        return (String) CollectionsKt.last((List) this.path);
    }

    @NotNull
    public final String getFullPath$div_release() {
        return (String) this.fullPath.getValue();
    }

    @NotNull
    public final String getStatesString$div_release() {
        return (String) this.statesString.getValue();
    }

    @NotNull
    public String toString() {
        return getFullPath$div_release();
    }

    @Deprecated
    @NotNull
    public final DivStatePath append(@NotNull String divId, @NotNull String stateId) {
        return append$div_release(divId, null, stateId);
    }

    @NotNull
    public final DivStatePath append$div_release(@NotNull String divId, @Nullable DivState.State state, @NotNull String stateIdFallback) {
        String str;
        Div div;
        DivBase value;
        String id;
        ArrayList arrayList = new ArrayList(this.states.size() + 1);
        arrayList.addAll(this.states);
        if (state == null || (str = state.stateId) == null) {
            str = stateIdFallback;
        }
        arrayList.add(TuplesKt.to(divId, str));
        if (state != null && (div = state.div) != null && (value = div.value()) != null && (id = value.getId()) != null) {
            stateIdFallback = id;
        } else if (state != null) {
            stateIdFallback = state.stateId;
        }
        return new DivStatePath(this.topLevelStateId, arrayList, createFullPath(stateIdFallback), false, 8, null);
    }

    @NotNull
    public final DivStatePath appendDiv(@NotNull String divId) {
        return new DivStatePath(this.topLevelStateId, this.states, createFullPath(divId), false, 8, null);
    }

    private final List<String> createFullPath(String divId) {
        ArrayList arrayList = new ArrayList(this.path.size() + 1);
        arrayList.addAll(this.path);
        arrayList.add(divId);
        return arrayList;
    }

    @NotNull
    public final List<Pair<String, String>> getStates() {
        return this.states;
    }

    @NotNull
    public final DivStatePath parentState() {
        int i;
        int i2;
        String divId;
        String divId2;
        if (isRootPath()) {
            return this;
        }
        List mutableList = CollectionsKt.toMutableList((Collection) this.states);
        Pair pair = (Pair) mutableList.remove(CollectionsKt.getLastIndex(mutableList));
        List<String> list = this.path;
        ListIterator<String> listIterator = list.listIterator(list.size());
        while (true) {
            i = -1;
            if (!listIterator.hasPrevious()) {
                i2 = -1;
                break;
            }
            String previous = listIterator.previous();
            divId2 = DivStatePathKt.getDivId(pair);
            if (Intrinsics.areEqual(previous, divId2)) {
                i2 = listIterator.nextIndex();
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i2);
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf == null) {
            List<String> list2 = this.path;
            ListIterator<String> listIterator2 = list2.listIterator(list2.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    break;
                }
                String substringBeforeLast$default = StringsKt.substringBeforeLast$default(listIterator2.previous(), '#', (String) null, 2, (Object) null);
                divId = DivStatePathKt.getDivId(pair);
                if (Intrinsics.areEqual(substringBeforeLast$default, divId)) {
                    i = listIterator2.nextIndex();
                    break;
                }
            }
        } else {
            i = valueOf.intValue();
        }
        return new DivStatePath(this.topLevelStateId, mutableList, this.path.subList(0, i + 1), false, 8, null);
    }

    public final boolean isRootPath() {
        return this.states.isEmpty();
    }

    public final boolean isAncestorOf(@NotNull DivStatePath other) {
        String divId;
        String divId2;
        String stateId;
        String stateId2;
        if (this.topLevelStateId != other.topLevelStateId || this.states.size() >= other.states.size()) {
            return false;
        }
        int i = 0;
        for (Object obj : this.states) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Pair pair = (Pair) obj;
            Pair<String, String> pair2 = other.states.get(i);
            divId = DivStatePathKt.getDivId(pair);
            divId2 = DivStatePathKt.getDivId(pair2);
            if (Intrinsics.areEqual(divId, divId2)) {
                stateId = DivStatePathKt.getStateId(pair);
                stateId2 = DivStatePathKt.getStateId(pair2);
                if (Intrinsics.areEqual(stateId, stateId2)) {
                    i = i2;
                }
            }
            return false;
        }
        return true;
    }

    /* compiled from: DivStatePath.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0000¢\u0006\u0002\b\u0007J*\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0002J\u001d\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013J\u0015\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0017J\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010J\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0019J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u000bH\u0007J:\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\t*\b\u0012\u0004\u0012\u00020\u000b0\t2\u0018\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J.\u0010 \u001a\u00020!*\b\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\"\u001a\u00020!H\u0002¨\u0006#"}, d2 = {"Lcom/yandex/div/core/state/DivStatePath$Companion;", "", "()V", "alphabeticalComparator", "Ljava/util/Comparator;", "Lcom/yandex/div/core/state/DivStatePath;", "Lkotlin/Comparator;", "alphabeticalComparator$div_release", "findSharedPairs", "", "Lkotlin/Pair;", "", "somePath", "otherPath", "fromRootDiv", "stateId", "", "div", "Lcom/yandex/div2/Div;", "fromRootDiv$div_release", "fromState", "state", "Lcom/yandex/div2/DivData$State;", "fromState$div_release", "lowestCommonAncestor", "lowestCommonAncestor$div_release", "parse", "path", "extractStates", "states", "addChild", "", "findState", "", "start", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Comparator<DivStatePath> alphabeticalComparator$div_release() {
            return new Comparator() { // from class: com.yandex.div.core.state.DivStatePath$Companion$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int alphabeticalComparator$lambda$2;
                    alphabeticalComparator$lambda$2 = DivStatePath.Companion.alphabeticalComparator$lambda$2((DivStatePath) obj, (DivStatePath) obj2);
                    return alphabeticalComparator$lambda$2;
                }
            };
        }

        private Companion() {
        }

        @NotNull
        public final DivStatePath parse(@NotNull String path) throws PathFormatException {
            ArrayList arrayList = new ArrayList();
            List split$default = StringsKt.split$default((CharSequence) path, new String[]{"/"}, false, 0, 6, (Object) null);
            try {
                long parseLong = Long.parseLong((String) split$default.get(0));
                if (split$default.size() % 2 != 1) {
                    throw new PathFormatException("Must be even number of states in path: " + path, null, 2, null);
                }
                IntProgression step = RangesKt.step(RangesKt.until(1, split$default.size()), 2);
                int first = step.getFirst();
                int last = step.getLast();
                int step2 = step.getStep();
                if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
                    while (true) {
                        arrayList.add(TuplesKt.to(split$default.get(first), split$default.get(first + 1)));
                        if (first == last) {
                            break;
                        }
                        first += step2;
                    }
                }
                return new DivStatePath(parseLong, arrayList, split$default, true);
            } catch (NumberFormatException e) {
                throw new PathFormatException("Top level id must be number: " + path, e);
            }
        }

        @NotNull
        public final DivStatePath fromState(long stateId) {
            return new DivStatePath(stateId, new ArrayList(), null, false, 12, null);
        }

        @NotNull
        public final DivStatePath fromState$div_release(@NotNull DivData.State state) {
            return fromRootDiv$div_release(state.stateId, state.div);
        }

        @NotNull
        public final DivStatePath fromRootDiv$div_release(long stateId, @NotNull Div div) {
            String valueOf = String.valueOf(stateId);
            String id = DivPathUtils.INSTANCE.getId(div);
            if (id == null) {
                id = ChildPathUnitCache.INSTANCE.getValue$div_release(0);
            }
            return new DivStatePath(stateId, CollectionsKt.emptyList(), CollectionsKt.listOf((Object[]) new String[]{valueOf, id}), false, 8, null);
        }

        @Nullable
        public final DivStatePath lowestCommonAncestor$div_release(@NotNull DivStatePath somePath, @NotNull DivStatePath otherPath) {
            if (somePath.getTopLevelStateId() != otherPath.getTopLevelStateId()) {
                return null;
            }
            List<Pair<String, String>> findSharedPairs = findSharedPairs(somePath, otherPath);
            return new DivStatePath(somePath.getTopLevelStateId(), findSharedPairs, extractStates(somePath.getPath$div_release(), findSharedPairs, true), somePath.getContainsOnlyStates$div_release() || otherPath.getContainsOnlyStates$div_release());
        }

        private final List<Pair<String, String>> findSharedPairs(DivStatePath somePath, DivStatePath otherPath) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : somePath.states) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) CollectionsKt.getOrNull(otherPath.states, i);
                if (pair2 == null || !Intrinsics.areEqual(pair, pair2)) {
                    break;
                }
                arrayList.add(pair);
                i = i2;
            }
            return arrayList;
        }

        private final List<String> extractStates(List<String> list, List<Pair<String, String>> list2, boolean z) {
            Iterator<T> it = list2.iterator();
            int i = 0;
            while (it.hasNext()) {
                i = DivStatePath.INSTANCE.findState(list, (Pair) it.next(), i);
            }
            if (z) {
                i++;
            }
            return list.subList(0, i);
        }

        private final int findState(List<String> list, Pair<String, String> pair, int i) {
            String divId;
            String stateId;
            int size = list.size() - 1;
            while (i < size) {
                String str = list.get(i);
                divId = DivStatePathKt.getDivId(pair);
                if (Intrinsics.areEqual(str, divId)) {
                    int i2 = i + 1;
                    String str2 = list.get(i2);
                    stateId = DivStatePathKt.getStateId(pair);
                    if (Intrinsics.areEqual(str2, stateId)) {
                        return i2;
                    }
                }
                i++;
            }
            return list.size();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int alphabeticalComparator$lambda$2(DivStatePath divStatePath, DivStatePath divStatePath2) {
            String divId;
            String divId2;
            String stateId;
            String stateId2;
            if (divStatePath.getTopLevelStateId() == divStatePath2.getTopLevelStateId()) {
                int min = Math.min(divStatePath.states.size(), divStatePath2.states.size());
                for (int i = 0; i < min; i++) {
                    Pair pair = (Pair) divStatePath.states.get(i);
                    Pair pair2 = (Pair) divStatePath2.states.get(i);
                    divId = DivStatePathKt.getDivId(pair);
                    divId2 = DivStatePathKt.getDivId(pair2);
                    int compareTo = divId.compareTo(divId2);
                    if (compareTo != 0) {
                        return compareTo;
                    }
                    stateId = DivStatePathKt.getStateId(pair);
                    stateId2 = DivStatePathKt.getStateId(pair2);
                    int compareTo2 = stateId.compareTo(stateId2);
                    if (compareTo2 != 0) {
                        return compareTo2;
                    }
                }
                return divStatePath.states.size() - divStatePath2.states.size();
            }
            return (int) (divStatePath.getTopLevelStateId() - divStatePath2.getTopLevelStateId());
        }
    }
}
