package com.composeunstyled.theme;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Theme.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u000e\u0010\u000e\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000bJ.\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/composeunstyled/theme/OverriddenValue;", "T", "", "token", "Lcom/composeunstyled/theme/ThemeToken;", "value", "<init>", "(Lcom/composeunstyled/theme/ThemeToken;Ljava/lang/Object;)V", "getToken", "()Lcom/composeunstyled/theme/ThemeToken;", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(Lcom/composeunstyled/theme/ThemeToken;Ljava/lang/Object;)Lcom/composeunstyled/theme/OverriddenValue;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OverriddenValue<T> {
    public static final int $stable = 0;
    private final ThemeToken<T> token;
    private final T value;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OverriddenValue copy$default(OverriddenValue overriddenValue, ThemeToken themeToken, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            themeToken = overriddenValue.token;
        }
        if ((i & 2) != 0) {
            obj = overriddenValue.value;
        }
        return overriddenValue.copy(themeToken, obj);
    }

    public final ThemeToken<T> component1() {
        return this.token;
    }

    public final T component2() {
        return this.value;
    }

    public final OverriddenValue<T> copy(ThemeToken<T> token, T value) {
        Intrinsics.checkNotNullParameter(token, "token");
        return new OverriddenValue<>(token, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OverriddenValue)) {
            return false;
        }
        OverriddenValue overriddenValue = (OverriddenValue) other;
        return Intrinsics.areEqual(this.token, overriddenValue.token) && Intrinsics.areEqual(this.value, overriddenValue.value);
    }

    public int hashCode() {
        int hashCode = this.token.hashCode() * 31;
        T t = this.value;
        return hashCode + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return "OverriddenValue(token=" + this.token + ", value=" + this.value + ")";
    }

    public OverriddenValue(ThemeToken<T> token, T t) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.token = token;
        this.value = t;
    }

    public final ThemeToken<T> getToken() {
        return this.token;
    }

    public final T getValue() {
        return this.value;
    }
}
