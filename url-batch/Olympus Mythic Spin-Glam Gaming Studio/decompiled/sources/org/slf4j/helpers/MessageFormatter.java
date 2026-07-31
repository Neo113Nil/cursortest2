package org.slf4j.helpers;

/* loaded from: classes.dex */
public abstract class MessageFormatter {
    public static Throwable getThrowableCandidate(Object[] objArr) {
        return NormalizedParameters.getThrowableCandidate(objArr);
    }

    public static Object[] trimmedCopy(Object[] objArr) {
        return NormalizedParameters.trimmedCopy(objArr);
    }
}
