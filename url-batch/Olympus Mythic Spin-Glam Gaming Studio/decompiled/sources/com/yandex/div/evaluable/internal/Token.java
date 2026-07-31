package com.yandex.div.evaluable.internal;

import com.safedk.android.analytics.brandsafety.m;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Marker;

/* compiled from: Token.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\t\u0007\b\t\n\u000b\f\r\u000e\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token;", "", "Bracket", "Function", "Operand", "Operator", "StringTemplate", "Lcom/yandex/div/evaluable/internal/Token$Bracket;", "Lcom/yandex/div/evaluable/internal/Token$Function;", "Lcom/yandex/div/evaluable/internal/Token$Function$ArgumentDelimiter;", "Lcom/yandex/div/evaluable/internal/Token$Operand;", "Lcom/yandex/div/evaluable/internal/Token$Operator;", "Lcom/yandex/div/evaluable/internal/Token$StringTemplate$End;", "Lcom/yandex/div/evaluable/internal/Token$StringTemplate$EndOfExpression;", "Lcom/yandex/div/evaluable/internal/Token$StringTemplate$Start;", "Lcom/yandex/div/evaluable/internal/Token$StringTemplate$StartOfExpression;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface Token {

    /* compiled from: Token.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0003\u0004\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operand;", "Lcom/yandex/div/evaluable/internal/Token;", "Literal", "Variable", "Lcom/yandex/div/evaluable/internal/Token$Operand$Literal;", "Lcom/yandex/div/evaluable/internal/Token$Operand$Variable;", "Lcom/yandex/div/evaluable/internal/Token$StringTemplate;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Operand extends Token {

        /* compiled from: Token.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operand$Literal;", "Lcom/yandex/div/evaluable/internal/Token$Operand;", "Bool", "Num", "Str", "Lcom/yandex/div/evaluable/internal/Token$Operand$Literal$Bool;", "Lcom/yandex/div/evaluable/internal/Token$Operand$Literal$Num;", "Lcom/yandex/div/evaluable/internal/Token$Operand$Literal$Str;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public interface Literal extends Operand {

            /* compiled from: Token.kt */
            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operand$Literal$Num;", "Lcom/yandex/div/evaluable/internal/Token$Operand$Literal;", "value", "", "constructor-impl", "(Ljava/lang/Number;)Ljava/lang/Number;", "getValue", "()Ljava/lang/Number;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/Number;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/Number;)I", "toString", "", "toString-impl", "(Ljava/lang/Number;)Ljava/lang/String;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Num implements Literal {

                @NotNull
                private final Number value;

                /* renamed from: box-impl, reason: not valid java name */
                public static final /* synthetic */ Num m7299boximpl(Number number) {
                    return new Num(number);
                }

                @NotNull
                /* renamed from: constructor-impl, reason: not valid java name */
                public static Number m7300constructorimpl(@NotNull Number value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value;
                }

                /* renamed from: equals-impl, reason: not valid java name */
                public static boolean m7301equalsimpl(Number number, Object obj) {
                    return (obj instanceof Num) && Intrinsics.areEqual(number, ((Num) obj).m7305unboximpl());
                }

                /* renamed from: equals-impl0, reason: not valid java name */
                public static final boolean m7302equalsimpl0(Number number, Number number2) {
                    return Intrinsics.areEqual(number, number2);
                }

                /* renamed from: hashCode-impl, reason: not valid java name */
                public static int m7303hashCodeimpl(Number number) {
                    return number.hashCode();
                }

                /* renamed from: toString-impl, reason: not valid java name */
                public static String m7304toStringimpl(Number number) {
                    return "Num(value=" + number + ')';
                }

                public boolean equals(Object obj) {
                    return m7301equalsimpl(this.value, obj);
                }

                public int hashCode() {
                    return m7303hashCodeimpl(this.value);
                }

                public String toString() {
                    return m7304toStringimpl(this.value);
                }

                /* renamed from: unbox-impl, reason: not valid java name */
                public final /* synthetic */ Number m7305unboximpl() {
                    return this.value;
                }

                private /* synthetic */ Num(Number number) {
                    this.value = number;
                }

                @NotNull
                public final Number getValue() {
                    return this.value;
                }
            }

            /* compiled from: Token.kt */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operand$Literal$Bool;", "Lcom/yandex/div/evaluable/internal/Token$Operand$Literal;", "value", "", "constructor-impl", "(Z)Z", "getValue", "()Z", "equals", "other", "", "equals-impl", "(ZLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Z)I", "toString", "", "toString-impl", "(Z)Ljava/lang/String;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Bool implements Literal {
                private final boolean value;

                /* renamed from: box-impl, reason: not valid java name */
                public static final /* synthetic */ Bool m7292boximpl(boolean z) {
                    return new Bool(z);
                }

                /* renamed from: constructor-impl, reason: not valid java name */
                public static boolean m7293constructorimpl(boolean z) {
                    return z;
                }

                /* renamed from: equals-impl, reason: not valid java name */
                public static boolean m7294equalsimpl(boolean z, Object obj) {
                    return (obj instanceof Bool) && z == ((Bool) obj).m7298unboximpl();
                }

                /* renamed from: equals-impl0, reason: not valid java name */
                public static final boolean m7295equalsimpl0(boolean z, boolean z2) {
                    return z == z2;
                }

                /* renamed from: hashCode-impl, reason: not valid java name */
                public static int m7296hashCodeimpl(boolean z) {
                    if (z) {
                        return 1;
                    }
                    return z ? 1 : 0;
                }

                /* renamed from: toString-impl, reason: not valid java name */
                public static String m7297toStringimpl(boolean z) {
                    return "Bool(value=" + z + ')';
                }

                public boolean equals(Object obj) {
                    return m7294equalsimpl(this.value, obj);
                }

                public int hashCode() {
                    return m7296hashCodeimpl(this.value);
                }

                public String toString() {
                    return m7297toStringimpl(this.value);
                }

                /* renamed from: unbox-impl, reason: not valid java name */
                public final /* synthetic */ boolean m7298unboximpl() {
                    return this.value;
                }

                private /* synthetic */ Bool(boolean z) {
                    this.value = z;
                }

                public final boolean getValue() {
                    return this.value;
                }
            }

            /* compiled from: Token.kt */
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operand$Literal$Str;", "Lcom/yandex/div/evaluable/internal/Token$Operand$Literal;", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Str implements Literal {

                @NotNull
                private final String value;

                /* renamed from: box-impl, reason: not valid java name */
                public static final /* synthetic */ Str m7306boximpl(String str) {
                    return new Str(str);
                }

                @NotNull
                /* renamed from: constructor-impl, reason: not valid java name */
                public static String m7307constructorimpl(@NotNull String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value;
                }

                /* renamed from: equals-impl, reason: not valid java name */
                public static boolean m7308equalsimpl(String str, Object obj) {
                    return (obj instanceof Str) && Intrinsics.areEqual(str, ((Str) obj).m7312unboximpl());
                }

                /* renamed from: equals-impl0, reason: not valid java name */
                public static final boolean m7309equalsimpl0(String str, String str2) {
                    return Intrinsics.areEqual(str, str2);
                }

                /* renamed from: hashCode-impl, reason: not valid java name */
                public static int m7310hashCodeimpl(String str) {
                    return str.hashCode();
                }

                /* renamed from: toString-impl, reason: not valid java name */
                public static String m7311toStringimpl(String str) {
                    return "Str(value=" + str + ')';
                }

                public boolean equals(Object obj) {
                    return m7308equalsimpl(this.value, obj);
                }

                public int hashCode() {
                    return m7310hashCodeimpl(this.value);
                }

                public String toString() {
                    return m7311toStringimpl(this.value);
                }

                /* renamed from: unbox-impl, reason: not valid java name */
                public final /* synthetic */ String m7312unboximpl() {
                    return this.value;
                }

                private /* synthetic */ Str(String str) {
                    this.value = str;
                }

                @NotNull
                public final String getValue() {
                    return this.value;
                }
            }
        }

        /* compiled from: Token.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operand$Variable;", "Lcom/yandex/div/evaluable/internal/Token$Operand;", "name", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getName", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Variable implements Operand {

            @NotNull
            private final String name;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Variable m7313boximpl(String str) {
                return new Variable(str);
            }

            @NotNull
            /* renamed from: constructor-impl, reason: not valid java name */
            public static String m7314constructorimpl(@NotNull String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                return name;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m7315equalsimpl(String str, Object obj) {
                return (obj instanceof Variable) && Intrinsics.areEqual(str, ((Variable) obj).m7319unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m7316equalsimpl0(String str, String str2) {
                return Intrinsics.areEqual(str, str2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m7317hashCodeimpl(String str) {
                return str.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m7318toStringimpl(String str) {
                return "Variable(name=" + str + ')';
            }

            public boolean equals(Object obj) {
                return m7315equalsimpl(this.name, obj);
            }

            public int hashCode() {
                return m7317hashCodeimpl(this.name);
            }

            public String toString() {
                return m7318toStringimpl(this.name);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ String m7319unboximpl() {
                return this.name;
            }

            private /* synthetic */ Variable(String str) {
                this.name = str;
            }

            @NotNull
            public final String getName() {
                return this.name;
            }
        }
    }

    /* compiled from: Token.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator;", "Lcom/yandex/div/evaluable/internal/Token;", "Binary", "Dot", "TernaryElse", "TernaryIf", "TernaryIfElse", "Try", "Unary", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Dot;", "Lcom/yandex/div/evaluable/internal/Token$Operator$TernaryElse;", "Lcom/yandex/div/evaluable/internal/Token$Operator$TernaryIf;", "Lcom/yandex/div/evaluable/internal/Token$Operator$TernaryIfElse;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Try;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Unary;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Operator extends Token {

        /* compiled from: Token.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Unary;", "Lcom/yandex/div/evaluable/internal/Token$Operator;", "Minus", "Not", "Plus", "Lcom/yandex/div/evaluable/internal/Token$Operator$Unary$Minus;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Unary$Not;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Unary$Plus;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public interface Unary extends Operator {

            /* compiled from: Token.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Unary$Plus;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Unary;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Plus implements Unary {

                @NotNull
                public static final Plus INSTANCE = new Plus();

                private Plus() {
                }

                @NotNull
                public String toString() {
                    return Marker.ANY_NON_NULL_MARKER;
                }
            }

            /* compiled from: Token.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Unary$Minus;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Unary;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Minus implements Unary {

                @NotNull
                public static final Minus INSTANCE = new Minus();

                private Minus() {
                }

                @NotNull
                public String toString() {
                    return "-";
                }
            }

            /* compiled from: Token.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Unary$Not;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Unary;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Not implements Unary {

                @NotNull
                public static final Not INSTANCE = new Not();

                private Not() {
                }

                @NotNull
                public String toString() {
                    return "!";
                }
            }
        }

        /* compiled from: Token.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "Lcom/yandex/div/evaluable/internal/Token$Operator;", "Comparison", "Equality", "Factor", "Logical", "Power", "Sum", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Equality;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Logical;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Power;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Sum;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public interface Binary extends Operator {

            /* compiled from: Token.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Sum;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "Minus", "Plus", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Sum$Minus;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Sum$Plus;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public interface Sum extends Binary {

                /* compiled from: Token.kt */
                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Sum$Plus;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Sum;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Plus implements Sum {

                    @NotNull
                    public static final Plus INSTANCE = new Plus();

                    private Plus() {
                    }

                    @NotNull
                    public String toString() {
                        return Marker.ANY_NON_NULL_MARKER;
                    }
                }

                /* compiled from: Token.kt */
                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Sum$Minus;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Sum;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Minus implements Sum {

                    @NotNull
                    public static final Minus INSTANCE = new Minus();

                    private Minus() {
                    }

                    @NotNull
                    public String toString() {
                        return "-";
                    }
                }
            }

            /* compiled from: Token.kt */
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "Division", "Modulo", "Multiplication", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor$Division;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor$Modulo;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor$Multiplication;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public interface Factor extends Binary {

                /* compiled from: Token.kt */
                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor$Multiplication;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Multiplication implements Factor {

                    @NotNull
                    public static final Multiplication INSTANCE = new Multiplication();

                    private Multiplication() {
                    }

                    @NotNull
                    public String toString() {
                        return Marker.ANY_MARKER;
                    }
                }

                /* compiled from: Token.kt */
                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor$Division;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Division implements Factor {

                    @NotNull
                    public static final Division INSTANCE = new Division();

                    private Division() {
                    }

                    @NotNull
                    public String toString() {
                        return "/";
                    }
                }

                /* compiled from: Token.kt */
                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor$Modulo;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Modulo implements Factor {

                    @NotNull
                    public static final Modulo INSTANCE = new Modulo();

                    private Modulo() {
                    }

                    @NotNull
                    public String toString() {
                        return "%";
                    }
                }
            }

            /* compiled from: Token.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Power;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Power implements Binary {

                @NotNull
                public static final Power INSTANCE = new Power();

                private Power() {
                }

                @NotNull
                public String toString() {
                    return "^";
                }
            }

            /* compiled from: Token.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Logical;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "And", "Or", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Logical$And;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Logical$Or;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public interface Logical extends Binary {

                /* compiled from: Token.kt */
                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Logical$And;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Logical;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class And implements Logical {

                    @NotNull
                    public static final And INSTANCE = new And();

                    private And() {
                    }

                    @NotNull
                    public String toString() {
                        return "&&";
                    }
                }

                /* compiled from: Token.kt */
                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Logical$Or;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Logical;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Or implements Logical {

                    @NotNull
                    public static final Or INSTANCE = new Or();

                    private Or() {
                    }

                    @NotNull
                    public String toString() {
                        return m.ac;
                    }
                }
            }

            /* compiled from: Token.kt */
            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "Greater", "GreaterOrEqual", "Less", "LessOrEqual", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison$Greater;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison$GreaterOrEqual;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison$Less;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison$LessOrEqual;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public interface Comparison extends Binary {

                /* compiled from: Token.kt */
                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison$Greater;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Greater implements Comparison {

                    @NotNull
                    public static final Greater INSTANCE = new Greater();

                    private Greater() {
                    }

                    @NotNull
                    public String toString() {
                        return ">";
                    }
                }

                /* compiled from: Token.kt */
                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison$GreaterOrEqual;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class GreaterOrEqual implements Comparison {

                    @NotNull
                    public static final GreaterOrEqual INSTANCE = new GreaterOrEqual();

                    private GreaterOrEqual() {
                    }

                    @NotNull
                    public String toString() {
                        return ">=";
                    }
                }

                /* compiled from: Token.kt */
                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison$Less;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Less implements Comparison {

                    @NotNull
                    public static final Less INSTANCE = new Less();

                    private Less() {
                    }

                    @NotNull
                    public String toString() {
                        return "<";
                    }
                }

                /* compiled from: Token.kt */
                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison$LessOrEqual;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class LessOrEqual implements Comparison {

                    @NotNull
                    public static final LessOrEqual INSTANCE = new LessOrEqual();

                    private LessOrEqual() {
                    }

                    @NotNull
                    public String toString() {
                        return "<=";
                    }
                }
            }

            /* compiled from: Token.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Equality;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "Equal", "NotEqual", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Equality$Equal;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Equality$NotEqual;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public interface Equality extends Binary {

                /* compiled from: Token.kt */
                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Equality$Equal;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Equality;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Equal implements Equality {

                    @NotNull
                    public static final Equal INSTANCE = new Equal();

                    private Equal() {
                    }

                    @NotNull
                    public String toString() {
                        return "==";
                    }
                }

                /* compiled from: Token.kt */
                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Equality$NotEqual;", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Equality;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class NotEqual implements Equality {

                    @NotNull
                    public static final NotEqual INSTANCE = new NotEqual();

                    private NotEqual() {
                    }

                    @NotNull
                    public String toString() {
                        return "!=";
                    }
                }
            }
        }

        /* compiled from: Token.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Try;", "Lcom/yandex/div/evaluable/internal/Token$Operator;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Try implements Operator {

            @NotNull
            public static final Try INSTANCE = new Try();

            private Try() {
            }

            @NotNull
            public String toString() {
                return "!:";
            }
        }

        /* compiled from: Token.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$Dot;", "Lcom/yandex/div/evaluable/internal/Token$Operator;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Dot implements Operator {

            @NotNull
            public static final Dot INSTANCE = new Dot();

            private Dot() {
            }

            @NotNull
            public String toString() {
                return ".";
            }
        }

        /* compiled from: Token.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$TernaryIf;", "Lcom/yandex/div/evaluable/internal/Token$Operator;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class TernaryIf implements Operator {

            @NotNull
            public static final TernaryIf INSTANCE = new TernaryIf();

            private TernaryIf() {
            }

            @NotNull
            public String toString() {
                return "?";
            }
        }

        /* compiled from: Token.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$TernaryElse;", "Lcom/yandex/div/evaluable/internal/Token$Operator;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class TernaryElse implements Operator {

            @NotNull
            public static final TernaryElse INSTANCE = new TernaryElse();

            private TernaryElse() {
            }

            @NotNull
            public String toString() {
                return ":";
            }
        }

        /* compiled from: Token.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Operator$TernaryIfElse;", "Lcom/yandex/div/evaluable/internal/Token$Operator;", "()V", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class TernaryIfElse implements Operator {

            @NotNull
            public static final TernaryIfElse INSTANCE = new TernaryIfElse();

            private TernaryIfElse() {
            }
        }
    }

    /* compiled from: Token.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Function;", "Lcom/yandex/div/evaluable/internal/Token;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ArgumentDelimiter", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Function implements Token {

        @NotNull
        private final String name;

        public static /* synthetic */ Function copy$default(Function function, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = function.name;
            }
            return function.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final Function copy(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new Function(name);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Function) && Intrinsics.areEqual(this.name, ((Function) other).name);
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        @NotNull
        public String toString() {
            return "Function(name=" + this.name + ')';
        }

        /* compiled from: Token.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Function$ArgumentDelimiter;", "Lcom/yandex/div/evaluable/internal/Token;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ArgumentDelimiter implements Token {

            @NotNull
            public static final ArgumentDelimiter INSTANCE = new ArgumentDelimiter();

            private ArgumentDelimiter() {
            }

            @NotNull
            public String toString() {
                return StringUtils.COMMA;
            }
        }

        public Function(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }
    }

    /* compiled from: Token.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$StringTemplate;", "Lcom/yandex/div/evaluable/internal/Token$Operand;", "()V", "End", "EndOfExpression", "Start", "StartOfExpression", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class StringTemplate implements Operand {

        @NotNull
        public static final StringTemplate INSTANCE = new StringTemplate();

        /* compiled from: Token.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$StringTemplate$Start;", "Lcom/yandex/div/evaluable/internal/Token;", "()V", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Start implements Token {

            @NotNull
            public static final Start INSTANCE = new Start();

            private Start() {
            }
        }

        private StringTemplate() {
        }

        /* compiled from: Token.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$StringTemplate$End;", "Lcom/yandex/div/evaluable/internal/Token;", "()V", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class End implements Token {

            @NotNull
            public static final End INSTANCE = new End();

            private End() {
            }
        }

        /* compiled from: Token.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$StringTemplate$StartOfExpression;", "Lcom/yandex/div/evaluable/internal/Token;", "()V", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class StartOfExpression implements Token {

            @NotNull
            public static final StartOfExpression INSTANCE = new StartOfExpression();

            private StartOfExpression() {
            }
        }

        /* compiled from: Token.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$StringTemplate$EndOfExpression;", "Lcom/yandex/div/evaluable/internal/Token;", "()V", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class EndOfExpression implements Token {

            @NotNull
            public static final EndOfExpression INSTANCE = new EndOfExpression();

            private EndOfExpression() {
            }
        }
    }

    /* compiled from: Token.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Bracket;", "Lcom/yandex/div/evaluable/internal/Token;", "LeftRound", "RightRound", "Lcom/yandex/div/evaluable/internal/Token$Bracket$LeftRound;", "Lcom/yandex/div/evaluable/internal/Token$Bracket$RightRound;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Bracket extends Token {

        /* compiled from: Token.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Bracket$LeftRound;", "Lcom/yandex/div/evaluable/internal/Token$Bracket;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class LeftRound implements Bracket {

            @NotNull
            public static final LeftRound INSTANCE = new LeftRound();

            private LeftRound() {
            }

            @NotNull
            public String toString() {
                return "(";
            }
        }

        /* compiled from: Token.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/internal/Token$Bracket$RightRound;", "Lcom/yandex/div/evaluable/internal/Token$Bracket;", "()V", "toString", "", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class RightRound implements Bracket {

            @NotNull
            public static final RightRound INSTANCE = new RightRound();

            private RightRound() {
            }

            @NotNull
            public String toString() {
                return ")";
            }
        }
    }
}
