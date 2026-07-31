package yads;

import android.net.wifi.ScanResult;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* loaded from: classes9.dex */
public final class jd2 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.compareValues(Integer.valueOf(((ScanResult) obj2).level), Integer.valueOf(((ScanResult) obj).level));
    }
}
