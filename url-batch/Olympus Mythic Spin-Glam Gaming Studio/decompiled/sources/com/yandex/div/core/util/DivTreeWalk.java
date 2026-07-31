package com.yandex.div.core.util;

import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractIterator;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivTreeWalk.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0015\u0016\u0017\u0018B\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007BM\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0096\u0002J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eJ\u001a\u0010\b\u001a\u00020\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\tJ\u001a\u0010\u000b\u001a\u00020\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\tR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/core/util/DivTreeWalk;", "Lkotlin/sequences/Sequence;", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "root", "Lcom/yandex/div2/Div;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "(Lcom/yandex/div2/Div;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "onEnter", "Lkotlin/Function1;", "", "onLeave", "", "maxDepth", "", "(Lcom/yandex/div2/Div;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V", "iterator", "", "depth", "predicate", "function", "BranchNode", "DivTreeWalkIterator", "LeafNode", "Node", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivTreeWalk implements Sequence {
    private final int maxDepth;

    @Nullable
    private final Function1 onEnter;

    @Nullable
    private final Function1 onLeave;

    @NotNull
    private final ExpressionResolver resolver;

    @NotNull
    private final Div root;

    /* compiled from: DivTreeWalk.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bb\u0018\u00002\u00020\u0001J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/util/DivTreeWalk$Node;", "", "item", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "getItem", "()Lcom/yandex/div/internal/core/DivItemBuilderResult;", "step", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private interface Node {
        @NotNull
        DivItemBuilderResult getItem();

        @Nullable
        DivItemBuilderResult step();
    }

    private DivTreeWalk(Div div, ExpressionResolver expressionResolver, Function1 function1, Function1 function12, int i) {
        this.root = div;
        this.resolver = expressionResolver;
        this.onEnter = function1;
        this.onLeave = function12;
        this.maxDepth = i;
    }

    /* synthetic */ DivTreeWalk(Div div, ExpressionResolver expressionResolver, Function1 function1, Function1 function12, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(div, expressionResolver, function1, function12, (i2 & 16) != 0 ? Integer.MAX_VALUE : i);
    }

    public DivTreeWalk(@NotNull Div div, @NotNull ExpressionResolver expressionResolver) {
        this(div, expressionResolver, null, null, 0, 16, null);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<DivItemBuilderResult> iterator() {
        return new DivTreeWalkIterator(this.root, this.resolver);
    }

    @NotNull
    public final DivTreeWalk onEnter(@NotNull Function1 predicate) {
        return new DivTreeWalk(this.root, this.resolver, predicate, this.onLeave, this.maxDepth);
    }

    @NotNull
    public final DivTreeWalk onLeave(@NotNull Function1 function) {
        return new DivTreeWalk(this.root, this.resolver, this.onEnter, function, this.maxDepth);
    }

    @NotNull
    public final DivTreeWalk maxDepth(int depth) {
        if (depth <= 0) {
            throw new IllegalArgumentException("depth must be positive, but was " + depth + '.');
        }
        return new DivTreeWalk(this.root, this.resolver, this.onEnter, this.onLeave, depth);
    }

    /* compiled from: DivTreeWalk.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0014J\n\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/core/util/DivTreeWalk$DivTreeWalkIterator;", "Lkotlin/collections/AbstractIterator;", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "root", "Lcom/yandex/div2/Div;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "(Lcom/yandex/div/core/util/DivTreeWalk;Lcom/yandex/div2/Div;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "stack", "Lkotlin/collections/ArrayDeque;", "Lcom/yandex/div/core/util/DivTreeWalk$Node;", "computeNext", "", "nextItem", "node", "item", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class DivTreeWalkIterator extends AbstractIterator {

        @NotNull
        private final ExpressionResolver resolver;

        @NotNull
        private final Div root;

        @NotNull
        private final ArrayDeque stack;

        public DivTreeWalkIterator(@NotNull Div div, @NotNull ExpressionResolver expressionResolver) {
            this.root = div;
            this.resolver = expressionResolver;
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.addLast(node(DivCollectionExtensionsKt.toItemBuilderResult(div, expressionResolver)));
            this.stack = arrayDeque;
        }

        @Override // kotlin.collections.AbstractIterator
        protected void computeNext() {
            DivItemBuilderResult nextItem = nextItem();
            if (nextItem != null) {
                setNext(nextItem);
            } else {
                done();
            }
        }

        private final DivItemBuilderResult nextItem() {
            Node node = (Node) this.stack.lastOrNull();
            if (node == null) {
                return null;
            }
            DivItemBuilderResult step = node.step();
            if (step == null) {
                this.stack.removeLast();
                return nextItem();
            }
            if (step == node.getItem() || DivUtilKt.isLeaf(step.getDiv()) || this.stack.size() >= DivTreeWalk.this.maxDepth) {
                return step;
            }
            this.stack.addLast(node(step));
            return nextItem();
        }

        private final Node node(DivItemBuilderResult item) {
            if (DivUtilKt.isBranch(item.getDiv())) {
                return new BranchNode(item, DivTreeWalk.this.onEnter, DivTreeWalk.this.onLeave);
            }
            return new LeafNode(item);
        }
    }

    /* compiled from: DivTreeWalk.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/yandex/div/core/util/DivTreeWalk$LeafNode;", "Lcom/yandex/div/core/util/DivTreeWalk$Node;", "item", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "(Lcom/yandex/div/internal/core/DivItemBuilderResult;)V", "getItem", "()Lcom/yandex/div/internal/core/DivItemBuilderResult;", "visited", "", "step", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class LeafNode implements Node {

        @NotNull
        private final DivItemBuilderResult item;
        private boolean visited;

        public LeafNode(@NotNull DivItemBuilderResult divItemBuilderResult) {
            this.item = divItemBuilderResult;
        }

        @Override // com.yandex.div.core.util.DivTreeWalk.Node
        @NotNull
        public DivItemBuilderResult getItem() {
            return this.item;
        }

        @Override // com.yandex.div.core.util.DivTreeWalk.Node
        @Nullable
        public DivItemBuilderResult step() {
            if (this.visited) {
                return null;
            }
            this.visited = true;
            return getItem();
        }
    }

    /* compiled from: DivTreeWalk.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\n\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/core/util/DivTreeWalk$BranchNode;", "Lcom/yandex/div/core/util/DivTreeWalk$Node;", "item", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "onEnter", "Lkotlin/Function1;", "Lcom/yandex/div2/Div;", "", "onLeave", "", "(Lcom/yandex/div/internal/core/DivItemBuilderResult;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "childIndex", "", "children", "", "getItem", "()Lcom/yandex/div/internal/core/DivItemBuilderResult;", "rootVisited", "step", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class BranchNode implements Node {
        private int childIndex;

        @Nullable
        private List<DivItemBuilderResult> children;

        @NotNull
        private final DivItemBuilderResult item;

        @Nullable
        private final Function1 onEnter;

        @Nullable
        private final Function1 onLeave;
        private boolean rootVisited;

        public BranchNode(@NotNull DivItemBuilderResult divItemBuilderResult, @Nullable Function1 function1, @Nullable Function1 function12) {
            this.item = divItemBuilderResult;
            this.onEnter = function1;
            this.onLeave = function12;
        }

        @Override // com.yandex.div.core.util.DivTreeWalk.Node
        @NotNull
        public DivItemBuilderResult getItem() {
            return this.item;
        }

        @Override // com.yandex.div.core.util.DivTreeWalk.Node
        @Nullable
        public DivItemBuilderResult step() {
            if (!this.rootVisited) {
                Function1 function1 = this.onEnter;
                if (function1 != null && !((Boolean) function1.invoke(getItem().getDiv())).booleanValue()) {
                    return null;
                }
                this.rootVisited = true;
                return getItem();
            }
            List<DivItemBuilderResult> list = this.children;
            if (list == null) {
                list = DivTreeWalkKt.getItems(getItem().getDiv(), getItem().getExpressionResolver());
                this.children = list;
            }
            if (this.childIndex < list.size()) {
                int i = this.childIndex;
                this.childIndex = i + 1;
                return list.get(i);
            }
            Function1 function12 = this.onLeave;
            if (function12 == null) {
                return null;
            }
            function12.invoke(getItem().getDiv());
            return null;
        }
    }
}
