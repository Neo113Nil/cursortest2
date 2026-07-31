package com.yandex.div.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ComparisonFailure.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0002\f\rB\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/internal/ComparisonFailure;", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "message", "", "expected", "actual", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActual", "()Ljava/lang/String;", "getExpected", "getMessage", "Companion", "ComparisonCompactor", "assertion_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComparisonFailure extends AssertionError {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int MAX_CONTEXT_LENGTH = 20;
    private static final long serialVersionUID = 1;

    @NotNull
    private final String actual;

    @NotNull
    private final String expected;

    @NotNull
    public final String getExpected() {
        return this.expected;
    }

    @NotNull
    public final String getActual() {
        return this.actual;
    }

    public ComparisonFailure(@Nullable String str, @NotNull String str2, @NotNull String str3) {
        super(str);
        this.expected = str2;
        this.actual = str3;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return new ComparisonCompactor(20, this.expected, this.actual).compact(super.getMessage());
    }

    /* compiled from: ComparisonFailure.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\b\u0010\u0010\u001a\u00020\u0005H\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/internal/ComparisonFailure$ComparisonCompactor;", "", "contextLength", "", "expected", "", "actual", "(ILjava/lang/String;Ljava/lang/String;)V", "prefix", "suffix", "areStringsEqual", "", "compact", "message", "compactString", "source", "computeCommonPrefix", "computeCommonSuffix", "findCommonPrefix", "", "findCommonSuffix", "Companion", "assertion_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class ComparisonCompactor {

        @NotNull
        private static final String DELTA_END = "]";

        @NotNull
        private static final String DELTA_START = "[";

        @NotNull
        private static final String ELLIPSIS = "...";

        @Nullable
        private final String actual;
        private final int contextLength;

        @Nullable
        private final String expected;
        private int prefix;
        private int suffix;

        public ComparisonCompactor(int i, @Nullable String str, @Nullable String str2) {
            this.contextLength = i;
            this.expected = str;
            this.actual = str2;
        }

        @NotNull
        public final String compact(@Nullable String message) {
            if (this.expected == null || this.actual == null || areStringsEqual()) {
                return Assert.format(message, this.expected, this.actual);
            }
            findCommonPrefix();
            findCommonSuffix();
            return Assert.format(message, compactString(this.expected), compactString(this.actual));
        }

        private final String compactString(String source) {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            String substring = source.substring(this.prefix, (source.length() - this.suffix) + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append(']');
            String sb2 = sb.toString();
            if (this.prefix > 0) {
                sb2 = computeCommonPrefix() + sb2;
            }
            if (this.suffix <= 0) {
                return sb2;
            }
            return sb2 + computeCommonSuffix();
        }

        private final void findCommonPrefix() {
            this.prefix = 0;
            String str = this.expected;
            Intrinsics.checkNotNull(str);
            int length = str.length();
            String str2 = this.actual;
            Intrinsics.checkNotNull(str2);
            int min = Math.min(length, str2.length());
            while (true) {
                int i = this.prefix;
                if (i >= min || this.expected.charAt(i) != this.actual.charAt(this.prefix)) {
                    return;
                } else {
                    this.prefix++;
                }
            }
        }

        private final void findCommonSuffix() {
            String str = this.expected;
            Intrinsics.checkNotNull(str);
            int length = str.length() - 1;
            String str2 = this.actual;
            Intrinsics.checkNotNull(str2);
            int length2 = str2.length() - 1;
            while (true) {
                int i = this.prefix;
                if (length2 < i || length < i || this.expected.charAt(length) != this.actual.charAt(length2)) {
                    break;
                }
                length2--;
                length--;
            }
            this.suffix = this.expected.length() - length;
        }

        private final String computeCommonPrefix() {
            String str = this.prefix > this.contextLength ? ELLIPSIS : "";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String str2 = this.expected;
            Intrinsics.checkNotNull(str2);
            String substring = str2.substring(Math.max(0, this.prefix - this.contextLength), this.prefix);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(substring);
            return sb.toString();
        }

        private final String computeCommonSuffix() {
            String str = this.expected;
            Intrinsics.checkNotNull(str);
            int min = Math.min((str.length() - this.suffix) + 1 + this.contextLength, this.expected.length());
            String str2 = (this.expected.length() - this.suffix) + 1 < this.expected.length() - this.contextLength ? ELLIPSIS : "";
            StringBuilder sb = new StringBuilder();
            String str3 = this.expected;
            String substring = str3.substring((str3.length() - this.suffix) + 1, min);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append(str2);
            return sb.toString();
        }

        private final boolean areStringsEqual() {
            return Intrinsics.areEqual(this.expected, this.actual);
        }
    }

    /* compiled from: ComparisonFailure.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/internal/ComparisonFailure$Companion;", "", "()V", "MAX_CONTEXT_LENGTH", "", "serialVersionUID", "", "assertion_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
