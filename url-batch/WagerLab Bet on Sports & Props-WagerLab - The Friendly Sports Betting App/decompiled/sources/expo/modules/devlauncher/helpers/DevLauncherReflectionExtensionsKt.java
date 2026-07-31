package expo.modules.devlauncher.helpers;

import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DevLauncherReflectionExtensions.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a \u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001aM\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u0002H\u00022\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000f\u001a3\u0010\u0010\u001a\u0002H\u0011\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0011*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u0002H\u00022\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"getFieldInClassHierarchy", "Ljava/lang/reflect/Field;", "T", "Ljava/lang/Class;", "fieldName", "", "setProtectedDeclaredField", "", "obj", "filedName", "newValue", "", "predicate", "Lkotlin/Function1;", "", "(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "getProtectedFieldValue", "U", "(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "expo-dev-launcher_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevLauncherReflectionExtensionsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setProtectedDeclaredField$lambda$0(Object obj) {
        return true;
    }

    public static final <T> Field getFieldInClassHierarchy(Class<T> cls, String fieldName) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        Field field = null;
        while (cls != null && field == null) {
            try {
                field = cls.getDeclaredField(fieldName);
            } catch (Exception unused) {
            }
            cls = cls.getSuperclass();
        }
        return field;
    }

    public static /* synthetic */ void setProtectedDeclaredField$default(Class cls, Object obj, String str, Object obj2, Function1 function1, int i, Object obj3) {
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: expo.modules.devlauncher.helpers.DevLauncherReflectionExtensionsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    boolean protectedDeclaredField$lambda$0;
                    protectedDeclaredField$lambda$0 = DevLauncherReflectionExtensionsKt.setProtectedDeclaredField$lambda$0(obj4);
                    return Boolean.valueOf(protectedDeclaredField$lambda$0);
                }
            };
        }
        setProtectedDeclaredField(cls, obj, str, obj2, function1);
    }

    public static final <T> void setProtectedDeclaredField(Class<? extends T> cls, T t, String filedName, Object newValue, Function1<Object, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(filedName, "filedName");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Field declaredField = cls.getDeclaredField(filedName);
        Field declaredField2 = Field.class.getDeclaredField("accessFlags");
        declaredField.setAccessible(true);
        declaredField2.setAccessible(true);
        declaredField2.setInt(declaredField, declaredField.getModifiers() & (-17));
        if (predicate.invoke(declaredField.get(t)).booleanValue()) {
            declaredField.set(t, newValue);
        }
    }

    public static final <T, U> U getProtectedFieldValue(Class<? extends T> cls, T t, String filedName) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(filedName, "filedName");
        Field declaredField = cls.getDeclaredField(filedName);
        declaredField.setAccessible(true);
        return (U) declaredField.get(t);
    }
}
