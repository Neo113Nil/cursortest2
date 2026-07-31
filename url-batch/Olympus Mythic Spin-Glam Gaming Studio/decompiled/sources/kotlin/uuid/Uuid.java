package kotlin.uuid;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.UByteArray;
import kotlin.ULong;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Uuid.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u0003:\u0001'B\u0019\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0013J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0000H\u0097\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R \u0010\u0006\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010 \u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\"¨\u0006("}, d2 = {"Lkotlin/uuid/Uuid;", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "mostSignificantBits", "leastSignificantBits", "<init>", "(JJ)V", "", "writeReplace", "()Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "toHexDashString", "toHexString", "", "toByteArray", "()[B", "Lkotlin/UByteArray;", "toUByteArray-TcUX1vc", "toUByteArray", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "compareTo", "(Lkotlin/uuid/Uuid;)I", "hashCode", "()I", "J", "getMostSignificantBits", "()J", "getMostSignificantBits$annotations", "()V", "getLeastSignificantBits", "getLeastSignificantBits$annotations", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Uuid implements Comparable<Uuid>, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final Uuid NIL = new Uuid(0, 0);
    public static final int SIZE_BITS = 128;
    public static final int SIZE_BYTES = 16;
    private final long leastSignificantBits;
    private final long mostSignificantBits;

    public /* synthetic */ Uuid(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    public static /* synthetic */ void getLeastSignificantBits$annotations() {
    }

    public static /* synthetic */ void getMostSignificantBits$annotations() {
    }

    private Uuid(long j, long j2) {
        this.mostSignificantBits = j;
        this.leastSignificantBits = j2;
    }

    public final long getMostSignificantBits() {
        return this.mostSignificantBits;
    }

    public final long getLeastSignificantBits() {
        return this.leastSignificantBits;
    }

    @NotNull
    public String toString() {
        return toHexDashString();
    }

    @NotNull
    public final String toHexDashString() {
        byte[] bArr = new byte[36];
        UuidKt__UuidJVMKt.formatBytesInto(this.mostSignificantBits, bArr, 0, 0, 4);
        bArr[8] = 45;
        UuidKt__UuidJVMKt.formatBytesInto(this.mostSignificantBits, bArr, 9, 4, 6);
        bArr[13] = 45;
        UuidKt__UuidJVMKt.formatBytesInto(this.mostSignificantBits, bArr, 14, 6, 8);
        bArr[18] = 45;
        UuidKt__UuidJVMKt.formatBytesInto(this.leastSignificantBits, bArr, 19, 0, 2);
        bArr[23] = 45;
        UuidKt__UuidJVMKt.formatBytesInto(this.leastSignificantBits, bArr, 24, 2, 8);
        return StringsKt.decodeToString(bArr);
    }

    @NotNull
    public final String toHexString() {
        byte[] bArr = new byte[32];
        UuidKt__UuidJVMKt.formatBytesInto(this.mostSignificantBits, bArr, 0, 0, 8);
        UuidKt__UuidJVMKt.formatBytesInto(this.leastSignificantBits, bArr, 16, 0, 8);
        return StringsKt.decodeToString(bArr);
    }

    @NotNull
    public final byte[] toByteArray() {
        byte[] bArr = new byte[16];
        UuidKt__UuidJVMKt.setLongAt(bArr, 0, this.mostSignificantBits);
        UuidKt__UuidJVMKt.setLongAt(bArr, 8, this.leastSignificantBits);
        return bArr;
    }

    @NotNull
    /* renamed from: toUByteArray-TcUX1vc, reason: not valid java name */
    public final byte[] m8200toUByteArrayTcUX1vc() {
        return UByteArray.m8040constructorimpl(toByteArray());
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Uuid)) {
            return false;
        }
        Uuid uuid = (Uuid) other;
        return this.mostSignificantBits == uuid.mostSignificantBits && this.leastSignificantBits == uuid.leastSignificantBits;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Uuid other) {
        int compare;
        int compare2;
        Intrinsics.checkNotNullParameter(other, "other");
        long j = this.mostSignificantBits;
        if (j != other.mostSignificantBits) {
            compare2 = Long.compare(ULong.m8077constructorimpl(j) ^ Long.MIN_VALUE, ULong.m8077constructorimpl(other.mostSignificantBits) ^ Long.MIN_VALUE);
            return compare2;
        }
        compare = Long.compare(ULong.m8077constructorimpl(this.leastSignificantBits) ^ Long.MIN_VALUE, ULong.m8077constructorimpl(other.leastSignificantBits) ^ Long.MIN_VALUE);
        return compare;
    }

    public int hashCode() {
        return Long.hashCode(this.mostSignificantBits ^ this.leastSignificantBits);
    }

    private final Object writeReplace() {
        return UuidKt__UuidJVMKt.serializedUuid(this);
    }

    /* compiled from: Uuid.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Uuid getNIL() {
            return Uuid.NIL;
        }

        public final Uuid fromLongs(long j, long j2) {
            if (j == 0 && j2 == 0) {
                return getNIL();
            }
            return new Uuid(j, j2, null);
        }

        public final Uuid parse(String uuidString) {
            String truncateForErrorMessage$UuidKt__UuidKt;
            Intrinsics.checkNotNullParameter(uuidString, "uuidString");
            int length = uuidString.length();
            if (length == 32) {
                return UuidKt__UuidJVMKt.uuidParseHex(uuidString);
            }
            if (length == 36) {
                return UuidKt__UuidJVMKt.uuidParseHexDash(uuidString);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
            truncateForErrorMessage$UuidKt__UuidKt = UuidKt__UuidKt.truncateForErrorMessage$UuidKt__UuidKt(uuidString, 64);
            sb.append(truncateForErrorMessage$UuidKt__UuidKt);
            sb.append("\" of length ");
            sb.append(uuidString.length());
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
