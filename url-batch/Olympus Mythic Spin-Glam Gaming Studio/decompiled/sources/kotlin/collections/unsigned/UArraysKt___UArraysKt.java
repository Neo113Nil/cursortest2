package kotlin.collections.unsigned;

import com.ironsource.X3;
import com.pubmatic.sdk.common.POBCommonConstants;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.collections.CollectionsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _UArrays.kt */
/* loaded from: classes5.dex */
public abstract class UArraysKt___UArraysKt extends UArraysKt___UArraysJvmKt {
    /* renamed from: contentToString-XUkPCBk, reason: not valid java name */
    public static String m8125contentToStringXUkPCBk(int[] iArr) {
        String joinToString$default;
        return (iArr == null || (joinToString$default = CollectionsKt.joinToString$default(UIntArray.m8060boximpl(iArr), ", ", X3.j.d, X3.j.e, 0, null, null, 56, null)) == null) ? POBCommonConstants.NULL_VALUE : joinToString$default;
    }

    /* renamed from: contentToString-uLth9ew, reason: not valid java name */
    public static String m8127contentToStringuLth9ew(long[] jArr) {
        String joinToString$default;
        return (jArr == null || (joinToString$default = CollectionsKt.joinToString$default(ULongArray.m8082boximpl(jArr), ", ", X3.j.d, X3.j.e, 0, null, null, 56, null)) == null) ? POBCommonConstants.NULL_VALUE : joinToString$default;
    }

    /* renamed from: contentToString-2csIQuQ, reason: not valid java name */
    public static String m8124contentToString2csIQuQ(byte[] bArr) {
        String joinToString$default;
        return (bArr == null || (joinToString$default = CollectionsKt.joinToString$default(UByteArray.m8038boximpl(bArr), ", ", X3.j.d, X3.j.e, 0, null, null, 56, null)) == null) ? POBCommonConstants.NULL_VALUE : joinToString$default;
    }

    /* renamed from: contentToString-d-6D3K8, reason: not valid java name */
    public static String m8126contentToStringd6D3K8(short[] sArr) {
        String joinToString$default;
        return (sArr == null || (joinToString$default = CollectionsKt.joinToString$default(UShortArray.m8104boximpl(sArr), ", ", X3.j.d, X3.j.e, 0, null, null, 56, null)) == null) ? POBCommonConstants.NULL_VALUE : joinToString$default;
    }
}
