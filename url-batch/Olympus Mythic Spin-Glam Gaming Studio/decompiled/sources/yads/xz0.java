package yads;

import com.ironsource.B5;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;

/* loaded from: classes4.dex */
public abstract class xz0 {
    public static final Charset a = Charsets.ISO_8859_1;

    public static boolean a(Map map, a11 a11Var) {
        String b = b(map, a11Var);
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b);
    }

    public static final String b(Map map, a11 a11Var) {
        if (map != null) {
            return (String) map.get(a11Var.b);
        }
        return null;
    }

    public static int c(Map map, a11 a11Var) {
        String b = b(map, a11Var);
        int i = oa.$r8$clinit;
        if (b != null) {
            try {
                return Integer.parseInt(b);
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public static final ArrayList d(Map map, a11 a11Var) {
        List emptyList;
        ArrayList arrayList = new ArrayList();
        String b = b(map, a11Var);
        if (b != null && b.length() != 0) {
            List<String> split = new Regex(StringUtils.COMMA).split(b, 0);
            if (!split.isEmpty()) {
                ListIterator<String> listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        emptyList = CollectionsKt.take(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            emptyList = CollectionsKt.emptyList();
            for (String str : (String[]) emptyList.toArray(new String[0])) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    int length = str.length() - 1;
                    int i = 0;
                    boolean z = false;
                    while (i <= length) {
                        boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i : length), 32) <= 0;
                        if (z) {
                            if (!z2) {
                                break;
                            }
                            length--;
                        } else if (z2) {
                            i++;
                        } else {
                            z = true;
                        }
                    }
                    String decode = URLDecoder.decode(str.subSequence(i, length + 1).toString(), "UTF-8");
                    if (decode != null) {
                        arrayList.add(decode);
                    } else {
                        decode = null;
                    }
                    Result.m8023constructorimpl(decode);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m8023constructorimpl(ResultKt.createFailure(th));
                }
            }
        }
        return arrayList;
    }

    public static final Charset a(Map map) {
        List emptyList;
        List emptyList2;
        if (map == null) {
            return a;
        }
        String str = (String) map.get("Content-Type");
        if (str != null) {
            List<String> split = new Regex(";").split(str, 0);
            if (!split.isEmpty()) {
                ListIterator<String> listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        emptyList = CollectionsKt.take(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            emptyList = CollectionsKt.emptyList();
            String[] strArr = (String[]) emptyList.toArray(new String[0]);
            int length = strArr.length;
            for (int i = 1; i < length; i++) {
                String str2 = strArr[i];
                int length2 = str2.length() - 1;
                int i2 = 0;
                boolean z = false;
                while (i2 <= length2) {
                    boolean z2 = Intrinsics.compare((int) str2.charAt(!z ? i2 : length2), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length2--;
                    } else if (z2) {
                        i2++;
                    } else {
                        z = true;
                    }
                }
                List<String> split2 = new Regex("=").split(str2.subSequence(i2, length2 + 1).toString(), 0);
                if (!split2.isEmpty()) {
                    ListIterator<String> listIterator2 = split2.listIterator(split2.size());
                    while (listIterator2.hasPrevious()) {
                        if (listIterator2.previous().length() != 0) {
                            emptyList2 = CollectionsKt.take(split2, listIterator2.nextIndex() + 1);
                            break;
                        }
                    }
                }
                emptyList2 = CollectionsKt.emptyList();
                String[] strArr2 = (String[]) emptyList2.toArray(new String[0]);
                if (strArr2.length == 2 && Intrinsics.areEqual(strArr2[0], B5.N)) {
                    return Charset.forName(strArr2[1]);
                }
            }
        }
        return a;
    }
}
