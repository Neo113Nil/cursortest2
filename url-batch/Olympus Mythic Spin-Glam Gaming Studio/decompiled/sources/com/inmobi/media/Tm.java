package com.inmobi.media;

import java.io.PrintStream;
import java.util.Comparator;
import kotlin.Pair;
import kotlin.comparisons.ComparisonsKt;

/* loaded from: classes12.dex */
public final class Tm implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Pair pair = (Pair) obj;
        String str = ((Ol) pair.getFirst()).c + " " + pair.getSecond();
        PrintStream printStream = System.out;
        printStream.println((Object) str);
        Double d = (Double) pair.getSecond();
        Pair pair2 = (Pair) obj2;
        printStream.println((Object) (((Ol) pair2.getFirst()).c + " " + pair2.getSecond()));
        return ComparisonsKt.compareValues(d, (Double) pair2.getSecond());
    }
}
