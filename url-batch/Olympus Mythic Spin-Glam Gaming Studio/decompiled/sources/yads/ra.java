package yads;

import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty1;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class ra {
    public static KProperty1 a(Class cls, String str, String str2, int i) {
        return Reflection.property1(new PropertyReference1Impl(cls, str, str2, i));
    }
}
