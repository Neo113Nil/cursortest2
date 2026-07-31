package com.yandex.div.core.expression.triggers;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConditionPart.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000 \u00022\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/expression/triggers/ConditionPart;", "", "Companion", "RawString", "Variable", "Lcom/yandex/div/core/expression/triggers/ConditionPart$RawString;", "Lcom/yandex/div/core/expression/triggers/ConditionPart$Variable;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ConditionPart {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: ConditionPart.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/core/expression/triggers/ConditionPart$RawString;", "Lcom/yandex/div/core/expression/triggers/ConditionPart;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class RawString implements ConditionPart {

        @NotNull
        private final String value;

        public static /* synthetic */ RawString copy$default(RawString rawString, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = rawString.value;
            }
            return rawString.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        public final RawString copy(@NotNull String value) {
            return new RawString(value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RawString) && Intrinsics.areEqual(this.value, ((RawString) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "RawString(value=" + this.value + ')';
        }

        public RawString(@NotNull String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: ConditionPart.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/core/expression/triggers/ConditionPart$Variable;", "Lcom/yandex/div/core/expression/triggers/ConditionPart;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Variable implements ConditionPart {

        @NotNull
        private final String name;

        public static /* synthetic */ Variable copy$default(Variable variable, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = variable.name;
            }
            return variable.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final Variable copy(@NotNull String name) {
            return new Variable(name);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Variable) && Intrinsics.areEqual(this.name, ((Variable) other).name);
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        @NotNull
        public String toString() {
            return "Variable(name=" + this.name + ')';
        }

        public Variable(@NotNull String str) {
            this.name = str;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }
    }

    /* compiled from: ConditionPart.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/div/core/expression/triggers/ConditionPart$Companion;", "", "()V", "parse", "", "Lcom/yandex/div/core/expression/triggers/ConditionPart;", "condition", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final List<ConditionPart> parse(@NotNull String condition) {
            return new Result(condition).parse();
        }
    }
}
