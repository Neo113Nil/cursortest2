package kotlinx.serialization.json.internal;

import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Composers.kt */
/* loaded from: classes14.dex */
public final class ComposerForUnsignedNumbers extends Composer {
    private final boolean forceQuoting;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerForUnsignedNumbers(InternalJsonWriter writer, boolean z) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.forceQuoting = z;
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(int i) {
        boolean z = this.forceQuoting;
        int m8055constructorimpl = UInt.m8055constructorimpl(i);
        if (z) {
            printQuoted(ComposerForUnsignedNumbers$$ExternalSyntheticBackport2.m(m8055constructorimpl));
        } else {
            print(ComposerForUnsignedNumbers$$ExternalSyntheticBackport3.m(m8055constructorimpl));
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(long j) {
        String m;
        String m2;
        boolean z = this.forceQuoting;
        long m8077constructorimpl = ULong.m8077constructorimpl(j);
        if (z) {
            m2 = ComposerForUnsignedNumbers$$ExternalSyntheticBackport4.m(m8077constructorimpl, 10);
            printQuoted(m2);
        } else {
            m = ComposerForUnsignedNumbers$$ExternalSyntheticBackport5.m(m8077constructorimpl, 10);
            print(m);
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(byte b) {
        boolean z = this.forceQuoting;
        String m8036toStringimpl = UByte.m8036toStringimpl(UByte.m8033constructorimpl(b));
        if (z) {
            printQuoted(m8036toStringimpl);
        } else {
            print(m8036toStringimpl);
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(short s) {
        boolean z = this.forceQuoting;
        String m8102toStringimpl = UShort.m8102toStringimpl(UShort.m8099constructorimpl(s));
        if (z) {
            printQuoted(m8102toStringimpl);
        } else {
            print(m8102toStringimpl);
        }
    }
}
