package kotlinx.io.bytestring;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ByteString.kt */
/* loaded from: classes9.dex */
public final class ByteString implements Comparable {
    public static final Companion Companion = new Companion(null);
    private static final ByteString EMPTY = new ByteString(new byte[0], null);
    private static final char[] HEX_DIGITS;
    private final byte[] data;
    private int hashCode;

    public /* synthetic */ ByteString(byte[] bArr, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, obj);
    }

    private ByteString(byte[] bArr, Object obj) {
        this.data = bArr;
    }

    public /* synthetic */ ByteString(byte[] bArr, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? bArr.length : i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ByteString(byte[] data, int i, int i2) {
        this(ArraysKt.copyOfRange(data, i, i2), null);
        Intrinsics.checkNotNullParameter(data, "data");
    }

    /* compiled from: ByteString.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ByteString getEMPTY$kotlinx_io_bytestring() {
            return ByteString.EMPTY;
        }

        public final ByteString wrap$kotlinx_io_bytestring(byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new ByteString(byteArray, defaultConstructorMarker, defaultConstructorMarker);
        }
    }

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        HEX_DIGITS = charArray;
    }

    public final int getSize() {
        return this.data.length;
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || ByteString.class != obj.getClass()) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        byte[] bArr = byteString.data;
        int length = bArr.length;
        byte[] bArr2 = this.data;
        if (length != bArr2.length) {
            return false;
        }
        int i2 = byteString.hashCode;
        if (i2 == 0 || (i = this.hashCode) == 0 || i2 == i) {
            return Arrays.equals(bArr2, bArr);
        }
        return false;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.data);
        this.hashCode = hashCode;
        return hashCode;
    }

    public final byte get(int i) {
        if (i < 0 || i >= getSize()) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of byte string bounds: [0.." + getSize() + ')');
        }
        return this.data[i];
    }

    public static /* synthetic */ ByteString substring$default(ByteString byteString, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = byteString.getSize();
        }
        return byteString.substring(i, i2);
    }

    public final ByteString substring(int i, int i2) {
        if (i == i2) {
            return EMPTY;
        }
        return new ByteString(this.data, i, i2);
    }

    @Override // java.lang.Comparable
    public int compareTo(ByteString other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (other == this) {
            return 0;
        }
        byte[] bArr = this.data;
        byte[] bArr2 = other.data;
        int min = Math.min(getSize(), other.getSize());
        for (int i = 0; i < min; i++) {
            int compare = Intrinsics.compare(UByte.m8033constructorimpl(bArr[i]) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, UByte.m8033constructorimpl(bArr2[i]) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            if (compare != 0) {
                return compare;
            }
        }
        return Intrinsics.compare(getSize(), other.getSize());
    }

    public String toString() {
        if (ByteStringKt.isEmpty(this)) {
            return "ByteString(size=0)";
        }
        String valueOf = String.valueOf(getSize());
        StringBuilder sb = new StringBuilder(valueOf.length() + 22 + (getSize() * 2));
        sb.append("ByteString(size=");
        sb.append(valueOf);
        sb.append(" hex=");
        byte[] bArr = this.data;
        int size = getSize();
        for (int i = 0; i < size; i++) {
            byte b = bArr[i];
            char[] cArr = HEX_DIGITS;
            sb.append(cArr[(b >>> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        sb.append(')');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public final byte[] getBackingArrayReference() {
        return this.data;
    }
}
