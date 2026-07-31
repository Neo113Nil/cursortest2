package kotlin.collections;

import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.collections.unsigned.UArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Arrays.kt */
/* loaded from: classes6.dex */
public abstract class ArraysKt__ArraysKt extends ArraysKt__ArraysJVMKt {
    public static List flatten(Object[][] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int i = 0;
        for (Object[] objArr2 : objArr) {
            i += objArr2.length;
        }
        ArrayList arrayList = new ArrayList(i);
        for (Object[] objArr3 : objArr) {
            CollectionsKt.addAll(arrayList, objArr3);
        }
        return arrayList;
    }

    public static String contentDeepToString(Object[] objArr) {
        if (objArr == null) {
            return POBCommonConstants.NULL_VALUE;
        }
        StringBuilder sb = new StringBuilder((RangesKt.coerceAtMost(objArr.length, 429496729) * 5) + 2);
        contentDeepToStringInternal$ArraysKt__ArraysKt(objArr, sb, new ArrayList());
        return sb.toString();
    }

    private static final void contentDeepToStringInternal$ArraysKt__ArraysKt(Object[] objArr, StringBuilder sb, List list) {
        if (list.contains(objArr)) {
            sb.append(m.af);
            return;
        }
        list.add(objArr);
        sb.append('[');
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            Object obj = objArr[i];
            if (obj == null) {
                sb.append(POBCommonConstants.NULL_VALUE);
            } else if (obj instanceof Object[]) {
                contentDeepToStringInternal$ArraysKt__ArraysKt((Object[]) obj, sb, list);
                Unit unit = Unit.INSTANCE;
            } else if (obj instanceof byte[]) {
                String arrays = Arrays.toString((byte[]) obj);
                Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
                sb.append(arrays);
            } else if (obj instanceof short[]) {
                String arrays2 = Arrays.toString((short[]) obj);
                Intrinsics.checkNotNullExpressionValue(arrays2, "toString(...)");
                sb.append(arrays2);
            } else if (obj instanceof int[]) {
                String arrays3 = Arrays.toString((int[]) obj);
                Intrinsics.checkNotNullExpressionValue(arrays3, "toString(...)");
                sb.append(arrays3);
            } else if (obj instanceof long[]) {
                String arrays4 = Arrays.toString((long[]) obj);
                Intrinsics.checkNotNullExpressionValue(arrays4, "toString(...)");
                sb.append(arrays4);
            } else if (obj instanceof float[]) {
                String arrays5 = Arrays.toString((float[]) obj);
                Intrinsics.checkNotNullExpressionValue(arrays5, "toString(...)");
                sb.append(arrays5);
            } else if (obj instanceof double[]) {
                String arrays6 = Arrays.toString((double[]) obj);
                Intrinsics.checkNotNullExpressionValue(arrays6, "toString(...)");
                sb.append(arrays6);
            } else if (obj instanceof char[]) {
                String arrays7 = Arrays.toString((char[]) obj);
                Intrinsics.checkNotNullExpressionValue(arrays7, "toString(...)");
                sb.append(arrays7);
            } else if (obj instanceof boolean[]) {
                String arrays8 = Arrays.toString((boolean[]) obj);
                Intrinsics.checkNotNullExpressionValue(arrays8, "toString(...)");
                sb.append(arrays8);
            } else if (obj instanceof UByteArray) {
                sb.append(UArraysKt.m8124contentToString2csIQuQ(((UByteArray) obj).m8052unboximpl()));
            } else if (obj instanceof UShortArray) {
                sb.append(UArraysKt.m8126contentToStringd6D3K8(((UShortArray) obj).m8118unboximpl()));
            } else if (obj instanceof UIntArray) {
                sb.append(UArraysKt.m8125contentToStringXUkPCBk(((UIntArray) obj).m8074unboximpl()));
            } else if (obj instanceof ULongArray) {
                sb.append(UArraysKt.m8127contentToStringuLth9ew(((ULongArray) obj).m8096unboximpl()));
            } else {
                sb.append(obj.toString());
            }
        }
        sb.append(']');
        list.remove(CollectionsKt.getLastIndex(list));
    }
}
