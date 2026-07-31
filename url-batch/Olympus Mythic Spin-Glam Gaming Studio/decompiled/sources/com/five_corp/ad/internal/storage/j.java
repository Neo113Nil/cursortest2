package com.five_corp.ad.internal.storage;

import java.util.Random;
import java.util.regex.Pattern;

/* loaded from: classes12.dex */
public final class j {
    public static final Pattern b = Pattern.compile("(\\.\\w+)$");
    public final Random a;

    public j(Random random) {
        this.a = random;
    }
}
