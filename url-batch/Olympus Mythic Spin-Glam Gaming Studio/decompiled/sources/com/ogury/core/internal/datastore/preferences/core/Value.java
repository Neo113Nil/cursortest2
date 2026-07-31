package com.ogury.core.internal.datastore.preferences.core;

import com.adjust.sdk.Constants;
import java.util.Arrays;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0012\n\u0002\b%\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rHÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jt\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u00020\u00032\b\u00103\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00104\u001a\u00020\u0007H\u0016J\t\u00105\u001a\u00020\u000bHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00066"}, d2 = {"Lcom/ogury/core/internal/datastore/preferences/core/Value;", "", "boolean", "", "float", "", "integer", "", Constants.LONG, "", "string", "", "stringSet", "", "double", "", "bytes", "", "(Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Set;Ljava/lang/Double;[B)V", "getBoolean", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBytes", "()[B", "getDouble", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getFloat", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getInteger", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLong", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getString", "()Ljava/lang/String;", "getStringSet", "()Ljava/util/Set;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Set;Ljava/lang/Double;[B)Lcom/ogury/core/internal/datastore/preferences/core/Value;", "equals", "other", "hashCode", "toString", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Value {

    @Nullable
    private final Boolean boolean;

    @Nullable
    private final byte[] bytes;

    @Nullable
    private final Double double;

    @Nullable
    private final Float float;

    @Nullable
    private final Integer integer;

    @Nullable
    private final Long long;

    @Nullable
    private final String string;

    @Nullable
    private final Set<String> stringSet;

    public Value() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Boolean getBoolean() {
        return this.boolean;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Float getFloat() {
        return this.float;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getInteger() {
        return this.integer;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Long getLong() {
        return this.long;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getString() {
        return this.string;
    }

    @Nullable
    public final Set<String> component6() {
        return this.stringSet;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Double getDouble() {
        return this.double;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final byte[] getBytes() {
        return this.bytes;
    }

    @NotNull
    public final Value copy(@Nullable Boolean r11, @Nullable Float r12, @Nullable Integer integer, @Nullable Long r14, @Nullable String string, @Nullable Set<String> stringSet, @Nullable Double r17, @Nullable byte[] bytes) {
        return new Value(r11, r12, integer, r14, string, stringSet, r17, bytes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(Value.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.ogury.core.internal.datastore.preferences.core.Value");
        Value value = (Value) other;
        return Intrinsics.areEqual(this.boolean, value.boolean) && Intrinsics.areEqual(this.float, value.float) && Intrinsics.areEqual(this.integer, value.integer) && Intrinsics.areEqual(this.long, value.long) && Intrinsics.areEqual(this.double, value.double) && Intrinsics.areEqual(this.string, value.string) && Intrinsics.areEqual(this.stringSet, value.stringSet) && Arrays.equals(this.bytes, value.bytes);
    }

    @Nullable
    public final Boolean getBoolean() {
        return this.boolean;
    }

    @Nullable
    public final byte[] getBytes() {
        return this.bytes;
    }

    @Nullable
    public final Double getDouble() {
        return this.double;
    }

    @Nullable
    public final Float getFloat() {
        return this.float;
    }

    @Nullable
    public final Integer getInteger() {
        return this.integer;
    }

    @Nullable
    public final Long getLong() {
        return this.long;
    }

    @Nullable
    public final String getString() {
        return this.string;
    }

    @Nullable
    public final Set<String> getStringSet() {
        return this.stringSet;
    }

    public int hashCode() {
        Boolean bool = this.boolean;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Float f = this.float;
        int hashCode2 = (hashCode + (f != null ? f.hashCode() : 0)) * 31;
        Integer num = this.integer;
        int intValue = (hashCode2 + (num != null ? num.intValue() : 0)) * 31;
        Long l = this.long;
        int hashCode3 = (intValue + (l != null ? l.hashCode() : 0)) * 31;
        Double d = this.double;
        int hashCode4 = (hashCode3 + (d != null ? d.hashCode() : 0)) * 31;
        String str = this.string;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        Set<String> set = this.stringSet;
        int hashCode6 = (hashCode5 + (set != null ? set.hashCode() : 0)) * 31;
        byte[] bArr = this.bytes;
        return hashCode6 + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    @NotNull
    public String toString() {
        return "Value(boolean=" + this.boolean + ", float=" + this.float + ", integer=" + this.integer + ", long=" + this.long + ", string=" + this.string + ", stringSet=" + this.stringSet + ", double=" + this.double + ", bytes=" + Arrays.toString(this.bytes) + ")";
    }

    public Value(@Nullable Boolean bool, @Nullable Float f, @Nullable Integer num, @Nullable Long l, @Nullable String str, @Nullable Set<String> set, @Nullable Double d, @Nullable byte[] bArr) {
        this.boolean = bool;
        this.float = f;
        this.integer = num;
        this.long = l;
        this.string = str;
        this.stringSet = set;
        this.double = d;
        this.bytes = bArr;
    }

    public /* synthetic */ Value(Boolean bool, Float f, Integer num, Long l, String str, Set set, Double d, byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : set, (i & 64) != 0 ? null : d, (i & 128) == 0 ? bArr : null);
    }
}
